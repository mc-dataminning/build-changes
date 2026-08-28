import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;

public class bjx extends DataFix {
   private final String a;
   private final TypeReference b;

   public bjx(Schema $$0, String $$1, TypeReference $$2) {
      super($$0, true);
      this.a = $$1;
      this.b = $$2;
   }

   protected TypeRewriteRule makeRule() {
      return this.writeAndRead(this.a, this.getInputSchema().getType(this.b), this.getOutputSchema().getType(this.b));
   }
}
