import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;

public class beg extends DataFix {
   public beg(Schema $$0, boolean $$1) {
      super($$0, $$1);
   }

   protected TypeRewriteRule makeRule() {
      Type<Pair<String, Dynamic<?>>> $$0 = DSL.named(bdn.F.typeName(), DSL.remainderType());
      if (!Objects.equals($$0, this.getInputSchema().getType(bdn.F))) {
         throw new IllegalStateException("Team type is not what was expected.");
      } else {
         return this.fixTypeEverywhere("TeamDisplayNameFix", $$0, $$0x -> $$0xx -> $$0xx.mapSecond($$0xxx -> $$0xxx.update("DisplayName", axn::a)));
      }
   }
}
