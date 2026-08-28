import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class bhn extends DataFix {
   public bhn(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      return this.writeFixAndRead(
         "Map id fix", this.getInputSchema().getType(biz.j), this.getOutputSchema().getType(biz.j), $$0 -> $$0.createMap(Map.of($$0.createString("data"), $$0))
      );
   }
}
