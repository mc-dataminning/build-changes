import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;

public class azw extends DataFix {
   public azw(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bfa.A);
      Type<?> $$1 = this.getOutputSchema().getType(bfa.A);
      Type<Pair<String, Either<Integer, String>>> $$2 = DSL.named(bfa.A.typeName(), DSL.or(DSL.intType(), bgk.a()));
      Type<Pair<String, String>> $$3 = DSL.named(bfa.A.typeName(), bgk.a());
      if (Objects.equals($$0, $$2) && Objects.equals($$1, $$3)) {
         return this.fixTypeEverywhere(
            "BlockNameFlatteningFix", $$2, $$3, $$0x -> $$0xx -> $$0xx.mapSecond($$0xxx -> (String)$$0xxx.map(azz::a, $$0xxxx -> azz.a(bgk.a($$0xxxx))))
         );
      } else {
         throw new IllegalStateException("Expected and actual types don't match.");
      }
   }
}
