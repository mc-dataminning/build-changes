import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class bhj extends DataFix {
   public bhj(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      return this.writeFixAndRead(
         "Map id fix", this.getInputSchema().getType(bit.j), this.getOutputSchema().getType(bit.j), $$0 -> $$0.createMap(Map.of($$0.createString("data"), $$0))
      );
   }
}
