import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bgz extends DataFix {
   public bgz(Schema $$0) {
      super($$0, false);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsMenuBlurrinessFix",
         this.getInputSchema().getType(bho.e),
         $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> $$0x.update("menuBackgroundBlurriness", $$0xx -> $$0xx.createInt(this.a($$0xx.asString("0.5")))))
      );
   }

   private int a(String $$0) {
      try {
         return Math.round(Float.parseFloat($$0) * 10.0F);
      } catch (NumberFormatException var3) {
         return 5;
      }
   }
}
