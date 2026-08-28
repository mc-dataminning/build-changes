import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;

public class bjm extends DataFix {
   private final String a;
   private final TypeReference b;

   public bjm(Schema $$0, String $$1, TypeReference $$2) {
      super($$0, false);
      this.a = $$1;
      this.b = $$2;
   }

   protected TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(this.b);
      OpticFinder<?> $$1 = $$0.findField("DisplayName");
      OpticFinder<Pair<String, String>> $$2 = DSL.typeFinder(this.getInputSchema().getType(bjb.z));
      return this.fixTypeEverywhereTyped(this.a, $$0, $$2x -> $$2x.updateTyped($$1, $$1xx -> $$1xx.update($$2, $$0xxx -> $$0xxx.mapSecond(bbg::a))));
   }
}
