import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

public abstract class bba extends DataFix {
   private final String a;

   public bba(Schema $$0, String $$1) {
      super($$0, false);
      this.a = $$1;
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(bgf.A);
      Type<Pair<String, String>> $$1 = DSL.named(bgf.A.typeName(), bhp.a());
      if (!Objects.equals($$0, $$1)) {
         throw new IllegalStateException("block type is not what was expected.");
      } else {
         TypeRewriteRule $$2 = this.fixTypeEverywhere(this.a + " for block", $$1, $$0x -> $$0xx -> $$0xx.mapSecond(this::a));
         TypeRewriteRule $$3 = this.fixTypeEverywhereTyped(
            this.a + " for block_state", this.getInputSchema().getType(bgf.u), $$0x -> $$0x.update(DSL.remainderFinder(), this::a)
         );
         TypeRewriteRule $$4 = this.fixTypeEverywhereTyped(
            this.a + " for flat_block_state",
            this.getInputSchema().getType(bgf.v),
            $$0x -> $$0x.update(
                  DSL.remainderFinder(), $$0xx -> (Dynamic)DataFixUtils.orElse($$0xx.asString().result().map(this::b).map($$0xx::createString), $$0xx)
               )
         );
         return TypeRewriteRule.seq($$2, new TypeRewriteRule[]{$$3, $$4});
      }
   }

   private Dynamic<?> a(Dynamic<?> $$0) {
      Optional<String> $$1 = $$0.get("Name").asString().result();
      return $$1.isPresent() ? $$0.set("Name", $$0.createString(this.a($$1.get()))) : $$0;
   }

   private String b(String $$0) {
      int $$1 = $$0.indexOf(91);
      int $$2 = $$0.indexOf(123);
      int $$3 = $$0.length();
      if ($$1 > 0) {
         $$3 = $$1;
      }

      if ($$2 > 0) {
         $$3 = Math.min($$3, $$2);
      }

      String $$4 = $$0.substring(0, $$3);
      String $$5 = this.a($$4);
      return $$5 + $$0.substring($$3);
   }

   protected abstract String a(String var1);

   public static DataFix a(Schema $$0, String $$1, final Function<String, String> $$2) {
      return new bba($$0, $$1) {
         @Override
         protected String a(String $$0) {
            return $$2.apply($$0);
         }
      };
   }
}
