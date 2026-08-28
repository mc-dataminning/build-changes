import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bcx extends DataFix {
   private static final String a = "minecraft:decorated_pot";

   public bcx(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getChoiceType(bho.s, "minecraft:decorated_pot");
      Type<?> $$1 = this.getOutputSchema().getChoiceType(bho.s, "minecraft:decorated_pot");
      return this.convertUnchecked("DecoratedPotFieldRenameFix", $$0, $$1);
   }
}
