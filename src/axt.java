import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class axt extends DataFix {
   private static final String a = "minecraft:decorated_pot";

   public axt(Schema $$0) {
      super($$0, true);
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getChoiceType(bbv.s, "minecraft:decorated_pot");
      Type<?> $$1 = this.getOutputSchema().getChoiceType(bbv.s, "minecraft:decorated_pot");
      return this.convertUnchecked("DecoratedPotFieldRenameFix", $$0, $$1);
   }
}
