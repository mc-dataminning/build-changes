import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public class bem extends DataFix {
   private TypeReference a;

   public bem(Schema $$0, TypeReference $$1) {
      super($$0, false);
      this.a = $$1;
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped("EntityFallDistanceFloatToDoubleFixFor" + this.a.typeName(), this.getOutputSchema().getType(this.a), bem::a);
   }

   private static Typed<?> a(Typed<?> $$0) {
      return $$0.update(
         DSL.remainderFinder(), $$0x -> $$0x.renameAndFixField("FallDistance", "fall_distance", $$0xx -> $$0xx.createDouble((double)$$0xx.asFloat(0.0F)))
      );
   }
}
