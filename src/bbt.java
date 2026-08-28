import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import java.util.function.UnaryOperator;

public class bbt extends DataFix {
   private final String a;
   private final UnaryOperator<String> b;

   private bbt(Schema $$0, String $$1, UnaryOperator<String> $$2) {
      super($$0, true);
      this.a = $$1;
      this.b = $$2;
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType<String> $$0 = this.getInputSchema().findChoiceType(bho.s);
      TaggedChoiceType<String> $$1 = this.getOutputSchema().findChoiceType(bho.s);
      return this.fixTypeEverywhere(this.a, $$0, $$1, $$0x -> $$0xx -> $$0xx.mapFirst(this.b));
   }

   public static DataFix a(Schema $$0, String $$1, UnaryOperator<String> $$2) {
      return new bbt($$0, $$1, $$2);
   }
}
