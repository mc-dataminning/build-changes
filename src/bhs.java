import com.google.gson.JsonElement;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.util.Unit;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JavaOps;
import com.mojang.serialization.JsonOps;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class bhs extends DataFix {
   public bhs(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Type<? extends Pair<String, ?>> $$0 = this.getInputSchema().getType(bjm.z).findFieldType("hoverEvent");
      return this.a(this.getInputSchema().getTypeRaw(bjm.z), $$0);
   }

   private <C, H extends Pair<String, ?>> TypeRewriteRule a(Type<C> $$0, Type<H> $$1) {
      Type<Pair<String, Either<Either<String, List<C>>, Pair<Either<List<C>, Unit>, Pair<Either<C, Unit>, Pair<Either<H, Unit>, Dynamic<?>>>>>>> $$2 = DSL.named(
         bjm.z.typeName(),
         DSL.or(
            DSL.or(DSL.string(), DSL.list($$0)),
            DSL.and(
               DSL.optional(DSL.field("extra", DSL.list($$0))),
               DSL.optional(DSL.field("separator", $$0)),
               DSL.optional(DSL.field("hoverEvent", $$1)),
               DSL.remainderType()
            )
         )
      );
      if (!$$2.equals(this.getInputSchema().getType(bjm.z))) {
         throw new IllegalStateException("Text component type did not match, expected " + $$2 + " but got " + this.getInputSchema().getType(bjm.z));
      } else {
         return this.fixTypeEverywhere(
            "LegacyHoverEventFix",
            $$2,
            $$1x -> $$1xx -> $$1xx.mapSecond($$1xxx -> $$1xxx.mapRight($$1xxxx -> $$1xxxx.mapSecond($$1xxxxx -> $$1xxxxx.mapSecond($$1xxxxxx -> {
                              Dynamic<?> $$2x = (Dynamic<?>)$$1xxxxxx.getSecond();
                              Optional<? extends Dynamic<?>> $$3 = $$2x.get("hoverEvent").result();
                              if ($$3.isEmpty()) {
                                 return $$1xxxxxx;
                              } else {
                                 Optional<? extends Dynamic<?>> $$4 = $$3.get().get("value").result();
                                 if ($$4.isEmpty()) {
                                    return $$1xxxxxx;
                                 } else {
                                    String $$5 = ((Either)$$1xxxxxx.getFirst()).left().<String>map(Pair::getFirst).orElse("");
                                    H $$6 = this.a($$1, $$5, (Dynamic<?>)$$3.get());
                                    return $$1xxxxxx.mapFirst($$1xxxxxxx -> Either.left($$6));
                                 }
                              }
                           }))))
         );
      }
   }

   private <H> H a(Type<H> $$0, String $$1, Dynamic<?> $$2) {
      return "show_text".equals($$1) ? a($$0, $$2) : b($$0, $$2);
   }

   private static <H> H a(Type<H> $$0, Dynamic<?> $$1) {
      Dynamic<?> $$2 = $$1.renameField("value", "contents");
      return (H)ag.a($$0, $$2).getValue();
   }

   private static <H> H b(Type<H> $$0, Dynamic<?> $$1) {
      JsonElement $$2 = (JsonElement)$$1.convert(JsonOps.INSTANCE).getValue();
      Dynamic<?> $$3 = new Dynamic(
         JavaOps.INSTANCE, Map.of("action", "show_text", "contents", Map.<String, String>of("text", "Legacy hoverEvent: " + azo.e($$2)))
      );
      return (H)ag.a($$0, $$3).getValue();
   }
}
