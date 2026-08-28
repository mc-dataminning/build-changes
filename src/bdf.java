import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bdf extends DataFix {
   public bdf(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "BlockStateStructureTemplateFix", this.getInputSchema().getType(bjm.u), $$0 -> $$0.update(DSL.remainderFinder(), bde::a)
      );
   }
}
