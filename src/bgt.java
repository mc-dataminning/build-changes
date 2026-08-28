import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class bgt extends DataFix {
   public bgt(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      return this.writeFixAndRead(
         "Map id fix", this.getInputSchema().getType(bic.j), this.getOutputSchema().getType(bic.j), $$0 -> $$0.createMap(Map.of($$0.createString("data"), $$0))
      );
   }
}
