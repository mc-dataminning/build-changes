import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;

public class bjy extends DataFix {
   public bjy(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Type<Pair<String, String>> $$0 = this.getInputSchema().getType(bjb.z);
      return this.fixTypeEverywhere("TextComponentStrictJsonFix", $$0, $$0x -> $$0xx -> $$0xx.mapSecond(bbg::c));
   }
}
