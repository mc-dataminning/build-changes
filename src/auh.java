import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;

public class auh extends DataFix {
   public auh(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(azd.y);
      Type<?> $$1 = this.getOutputSchema().getType(azd.y);
      Type<Pair<String, Either<Integer, String>>> $$2 = DSL.named(azd.y.typeName(), DSL.or(DSL.intType(), bal.a()));
      Type<Pair<String, String>> $$3 = DSL.named(azd.y.typeName(), bal.a());
      if (Objects.equals($$0, $$2) && Objects.equals($$1, $$3)) {
         return this.fixTypeEverywhere(
            "BlockNameFlatteningFix", $$2, $$3, $$0x -> $$0xx -> $$0xx.mapSecond($$0xxx -> (String)$$0xxx.map(auk::a, $$0xxxx -> auk.a(bal.a($$0xxxx))))
         );
      } else {
         throw new IllegalStateException("Expected and actual types don't match.");
      }
   }
}
