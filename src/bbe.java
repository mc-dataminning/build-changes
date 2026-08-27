import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bbe extends DataFix {
   public bbe(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsAccessibilityOnboardFix",
         this.getInputSchema().getType(bbw.e),
         $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> $$0x.set("onboardAccessibility", $$0x.createBoolean(false)))
      );
   }
}
