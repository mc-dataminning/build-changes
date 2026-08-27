import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bfi extends DataFix {
   public bfi(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bgf.F);
      return this.fixTypeEverywhereTyped(
         "ObjectiveDisplayNameFix", $$0, $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> $$0xx.update("DisplayName", azr::a))
      );
   }
}
