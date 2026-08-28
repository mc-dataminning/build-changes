import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class bed extends DataFix {
   private static final String a = "minecraft:decorated_pot";

   public bed(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getChoiceType(bix.s, "minecraft:decorated_pot");
      Type<?> $$1 = this.getOutputSchema().getChoiceType(bix.s, "minecraft:decorated_pot");
      return this.convertUnchecked("DecoratedPotFieldRenameFix", $$0, $$1);
   }
}
