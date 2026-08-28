import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import java.util.Locale;
import java.util.Objects;

public abstract class bjj extends DataFix {
   private final String a;

   public bjj(String $$0, Schema $$1, boolean $$2) {
      super($$1, $$2);
      this.a = $$0;
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType<String> $$0 = this.getInputSchema().findChoiceType(bix.B);
      TaggedChoiceType<String> $$1 = this.getOutputSchema().findChoiceType(bix.B);
      Type<Pair<String, String>> $$2 = DSL.named(bix.z.typeName(), bkl.a());
      if (!Objects.equals(this.getOutputSchema().getType(bix.z), $$2)) {
         throw new IllegalStateException("Entity name type is not what was expected.");
      } else {
         return TypeRewriteRule.seq(this.fixTypeEverywhere(this.a, $$0, $$1, $$2x -> $$2xx -> $$2xx.mapFirst($$2xxx -> {
                  String $$3 = this.a($$2xxx);
                  Type<?> $$4 = (Type<?>)$$0.types().get($$2xxx);
                  Type<?> $$5 = (Type<?>)$$1.types().get($$3);
                  if (!$$5.equals($$4, true, true)) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Dynamic type check failed: %s not equal to %s", $$5, $$4));
                  } else {
                     return $$3;
                  }
               })), this.fixTypeEverywhere(this.a + " for entity name", $$2, $$0x -> $$0xx -> $$0xx.mapSecond(this::a)));
      }
   }

   protected abstract String a(String var1);
}
