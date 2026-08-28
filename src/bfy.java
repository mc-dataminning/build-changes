import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bfy extends DataFix {
   public bfy(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bgw.H);
      return this.fixTypeEverywhereTyped(
         "ObjectiveDisplayNameFix", $$0, $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> $$0xx.update("DisplayName", bae::a))
      );
   }
}
