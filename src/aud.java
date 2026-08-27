import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;

public abstract class aud extends auc {
   private final String a;

   public aud(Schema $$0, String $$1) {
      super($$0, $$1);
      this.a = $$1;
   }

   @Override
   public TypeRewriteRule makeRule() {
      TypeReference $$0 = ayx.s;
      String $$1 = "minecraft:jigsaw";
      OpticFinder<?> $$2 = DSL.namedChoice("minecraft:jigsaw", this.getInputSchema().getChoiceType($$0, "minecraft:jigsaw"));
      TypeRewriteRule $$3 = this.fixTypeEverywhereTyped(
         this.a + " for jigsaw state",
         this.getInputSchema().getType($$0),
         this.getOutputSchema().getType($$0),
         $$2x -> $$2x.updateTyped(
               $$2,
               this.getOutputSchema().getChoiceType($$0, "minecraft:jigsaw"),
               $$0xx -> $$0xx.update(
                     DSL.remainderFinder(),
                     $$0xxx -> $$0xxx.update("final_state", $$1xx -> (Dynamic)DataFixUtils.orElse($$1xx.asString().result().map($$0xxxxx -> {
                              int $$1xxx = $$0xxxxx.indexOf(91);
                              int $$2xx = $$0xxxxx.indexOf(123);
                              int $$3x = $$0xxxxx.length();
                              if ($$1xxx > 0) {
                                 $$3x = Math.min($$3x, $$1xxx);
                              }

                              if ($$2xx > 0) {
                                 $$3x = Math.min($$3x, $$2xx);
                              }

                              String $$4 = $$0xxxxx.substring(0, $$3x);
                              String $$5 = this.a($$4);
                              return $$5 + $$0xxxxx.substring($$3x);
                           }).map($$0xxx::createString), $$1xx))
                  )
            )
      );
      return TypeRewriteRule.seq(super.makeRule(), $$3);
   }

   public static DataFix b(Schema $$0, String $$1, final Function<String, String> $$2) {
      return new aud($$0, $$1) {
         @Override
         protected String a(String $$0) {
            return $$2.apply($$0);
         }
      };
   }
}
