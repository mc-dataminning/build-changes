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

public class bex extends DataFix {
   private static final String a = "minecraft:empty";

   public bex(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bhx.B);
      Type<?> $$1 = this.getOutputSchema().getType(bhx.B);
      return this.fixTypeEverywhereTyped(
         "Fix AbstractArrow item type",
         $$0,
         $$1,
         bap.a(this.a("minecraft:trident", bex::c), this.a("minecraft:arrow", bex::a), this.a("minecraft:spectral_arrow", bex::b))
      );
   }

   private Function<Typed<?>, Typed<?>> a(String $$0, bex.a<?> $$1) {
      Type<?> $$2 = this.getInputSchema().getChoiceType(bhx.B, $$0);
      Type<?> $$3 = this.getOutputSchema().getChoiceType(bhx.B, $$0);
      return a($$0, $$1, $$2, $$3);
   }

   private static <T> Function<Typed<?>, Typed<?>> a(String $$0, bex.a<?> $$1, Type<?> $$2, Type<T> $$3) {
      OpticFinder<?> $$4 = DSL.namedChoice($$0, $$2);
      return $$3x -> $$3x.updateTyped($$4, $$3, $$2xx -> $$1.fix($$2xx, $$3));
   }

   private static <T> Typed<T> a(Typed<?> $$0, Type<T> $$1) {
      return af.a($$0, $$1, $$0x -> $$0x.set("item", a($$0x, a($$0x))));
   }

   private static String a(Dynamic<?> $$0) {
      return $$0.get("Potion").asString("minecraft:empty").equals("minecraft:empty") ? "minecraft:arrow" : "minecraft:tipped_arrow";
   }

   private static <T> Typed<T> b(Typed<?> $$0, Type<T> $$1) {
      return af.a($$0, $$1, $$0x -> $$0x.set("item", a($$0x, "minecraft:spectral_arrow")));
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
