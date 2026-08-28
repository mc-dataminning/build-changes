import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bgd extends DataFix {
   public bgd(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "RandomSequenceSettingsFix",
         this.getInputSchema().getType(bgh.m),
         $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> $$0x.update("data", $$0xx -> $$0xx.emptyMap().set("sequences", $$0xx)))
      );
   }
}
