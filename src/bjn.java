import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;

public class bjn extends DataFix {
   public bjn(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      Type<Pair<String, String>> $$0 = this.getInputSchema().getType(biq.z);
      return this.fixTypeEverywhere("TextComponentStrictJsonFix", $$0, $$0x -> $$0xx -> $$0xx.mapSecond(bba::c));
   }
}
