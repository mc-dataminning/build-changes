import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;

public class bdq extends DataFix {
   public bdq(Schema $$0) {
      super($$0, true);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bic.C);
      Type<?> $$1 = this.getOutputSchema().getType(bic.C);
      OpticFinder<String> $$2 = DSL.fieldFinder("id", bju.a());
      OpticFinder<String> $$3 = $$0.findField("CustomName");
      Type<?> $$4 = $$1.findFieldType("CustomName");
      return this.fixTypeEverywhereTyped("EntityCustomNameToComponentFix", $$0, $$1, $$3x -> a($$3x, $$2, $$3, $$4));
   }

   private static <T> Typed<?> a(Typed<?> $$0, OpticFinder<String> $$1, OpticFinder<String> $$2, Type<T> $$3) {
      return $$0.update($$2, $$3, $$3x -> {
         String $$4 = $$0.getOptional($$1).orElse("");
         Dynamic<?> $$5 = a($$0.getOps(), $$3x, $$4);
         return af.a($$3, $$5).getValue();
      });
   }

   private static <T> Dynamic<T> a(DynamicOps<T> $$0, String $$1, String $$2) {
      return "minecraft:commandblock_minecart".equals($$2) ? new Dynamic($$0, $$0.createString($$1)) : baq.a($$0, $$1);
   }
}
