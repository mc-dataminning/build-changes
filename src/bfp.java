import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;

public class bfp extends DataFix {
   public bfp(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "OptionsForceVBOFix",
         this.getInputSchema().getType(bgf.e),
         $$0 -> $$0.update(DSL.remainderFinder(), $$0x -> $$0x.set("useVbo", $$0x.createString("true")))
      );
   }
}
