import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;

public class bby extends DataFix {
   public bby(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bhx.C);
      Type<?> $$1 = this.getOutputSchema().getType(bhx.C);
      Type<Pair<String, Either<Integer, String>>> $$2 = DSL.named(bhx.C.typeName(), DSL.or(DSL.intType(), bjl.a()));
      Type<Pair<String, String>> $$3 = DSL.named(bhx.C.typeName(), bjl.a());
      if (Objects.equals($$0, $$2) && Objects.equals($$1, $$3)) {
         return this.fixTypeEverywhere(
            "BlockNameFlatteningFix", $$2, $$3, $$0x -> $$0xx -> $$0xx.mapSecond($$0xxx -> (String)$$0xxx.map(bcb::a, $$0xxxx -> bcb.a(bjl.a($$0xxxx))))
         );
      } else {
         throw new IllegalStateException("Expected and actual types don't match.");
      }
   }
}
