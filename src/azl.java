import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

public class azl extends DataFix {
   private static final String a = "minecraft:empty";

   public azl(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bbw.y);
      Type<?> $$1 = this.getOutputSchema().getType(bbw.y);
      return this.fixTypeEverywhereTyped(
         "Fix AbstractArrow item type",
         $$0,
         $$1,
         this.a(this.a("minecraft:trident", azl::c), this.a("minecraft:arrow", azl::a), this.a("minecraft:spectral_arrow", azl::b))
      );
   }

   @SafeVarargs
   private <T> Function<Typed<?>, Typed<?>> a(Function<Typed<?>, Typed<?>>... $$0) {
      return $$1 -> {
         for (Function<Typed<?>, Typed<?>> $$2 : $$0) {
            $$1 = $$2.apply($$1);
         }

         return $$1;
      };
   }

   private Function<Typed<?>, Typed<?>> a(String $$0, azl.a<?> $$1) {
      Type<?> $$2 = this.getInputSchema().getChoiceType(bbw.y, $$0);
      Type<?> $$3 = this.getOutputSchema().getChoiceType(bbw.y, $$0);
      return a($$0, $$1, $$2, $$3);
   }

   private static <T> Function<Typed<?>, Typed<?>> a(String $$0, azl.a<?> $$1, Type<?> $$2, Type<T> $$3) {
      OpticFinder<?> $$4 = DSL.namedChoice($$0, $$2);
      return $$3x -> $$3x.updateTyped($$4, $$3, $$2xx -> $$1.fix($$2xx, $$3));
   }

   private static <T> Typed<T> a(Typed<?> $$0, Type<T> $$1) {
      return ac.a($$0, $$1, $$0x -> $$0x.set("item", a($$0x, a($$0x))));
   }

   private static String a(Dynamic<?> $$0) {
      return $$0.get("Potion").asString("minecraft:empty").equals("minecraft:empty") ? "minecraft:arrow" : "minecraft:tipped_arrow";
   }

   private static <T> Typed<T> b(Typed<?> $$0, Type<T> $$1) {
      return ac.a($$0, $$1, $$0x -> $$0x.set("item", a($$0x, "minecraft:spectral_arrow")));
   }

   private static Dynamic<?> a(Dynamic<?> $$0, String $$1) {
      return $$0.createMap(ImmutableMap.of($$0.createString("id"), $$0.createString($$1), $$0.createString("Count"), $$0.createInt(1)));
   }

   private static <T> Typed<T> c(Typed<?> $$0, Type<T> $$1) {
      return new Typed($$1, $$0.getOps(), $$0.getValue());
   }

   interface a<F> {
      Typed<F> fix(Typed<?> var1, Type<F> var2);
   }
}
