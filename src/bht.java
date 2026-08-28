import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.UnaryOperator;

public class bht extends DataFix {
   private final String a;
   private final TypeReference b;
   private final UnaryOperator<String> c;

   public bht(Schema $$0, String $$1, TypeReference $$2, UnaryOperator<String> $$3) {
      super($$0, false);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   protected TypeRewriteRule makeRule() {
      Type<Pair<String, String>> $$0 = DSL.named(this.b.typeName(), bkr.a());
      if (!Objects.equals($$0, this.getInputSchema().getType(this.b))) {
         throw new IllegalStateException("\"" + this.b.typeName() + "\" is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.a, $$0, $$0x -> $$0xx -> $$0xx.mapSecond(this.c));
      }
   }
}
