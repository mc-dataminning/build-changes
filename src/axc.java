import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.Function;

public abstract class axc extends DataFix {
   private final String a;

   public axc(Schema $$0, String $$1) {
      super($$0, false);
      this.a = $$1;
   }

   public TypeRewriteRule makeRule() {
      Type<Pair<String, String>> $$0 = DSL.named(ayx.z.typeName(), baf.a());
      if (!Objects.equals(this.getInputSchema().getType(ayx.z), $$0)) {
         throw new IllegalStateException("item name type is not what was expected.");
      } else {
         return this.fixTypeEverywhere(this.a, $$0, $$0x -> $$0xx -> $$0xx.mapSecond(this::a));
      }
   }

   protected abstract String a(String var1);

   public static DataFix a(Schema $$0, String $$1, final Function<String, String> $$2) {
      return new axc($$0, $$1) {
         @Override
         protected String a(String $$0) {
            return $$2.apply($$0);
         }
      };
   }
}
