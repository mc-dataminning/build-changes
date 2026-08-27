import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public abstract class avz extends DataFix {
   private final String a;

   public avz(Schema $$0, String $$1) {
      super($$0, false);
      this.a = $$1;
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bax.y);
      Type<Pair<String, String>> $$1 = DSL.named(bax.y.typeName(), bcf.a());
      if (!Objects.equals($$0, $$1)) {
         throw new IllegalStateException("block type is not what was expected.");
      } else {
         TypeRewriteRule $$2 = this.fixTypeEverywhere(this.a + " for block", $$1, $$0x -> $$0xx -> $$0xx.mapSecond(this::a));
         TypeRewriteRule $$3 = this.fixTypeEverywhereTyped(
            this.a + " for block_state", this.getInputSchema().getType(bax.u), $$0x -> $$0x.update(DSL.remainderFinder(), $$0xx -> {
                  Optional<String> $$1x = $$0xx.get("Name").asString().result();
                  return $$1x.isPresent() ? $$0xx.set("Name", $$0xx.createString(this.a($$1x.get()))) : $$0xx;
               })
         );
         return TypeRewriteRule.seq($$2, $$3);
      }
   }

   protected abstract String a(String var1);

   public static DataFix a(Schema $$0, String $$1, final Function<String, String> $$2) {
      return new avz($$0, $$1) {
         @Override
         protected String a(String $$0) {
            return $$2.apply($$0);
         }
      };
   }
}
