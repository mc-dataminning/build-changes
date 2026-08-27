import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import java.util.Locale;

public class asx extends DataFix {
   private final String a;
   private final TypeReference b;

   public asx(Schema $$0, String $$1, TypeReference $$2) {
      super($$0, true);
      this.a = $$1;
      this.b = $$2;
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType<?> $$0 = this.getInputSchema().findChoiceType(this.b);
      TaggedChoiceType<?> $$1 = this.getOutputSchema().findChoiceType(this.b);
      return this.a(this.a, $$0, $$1);
   }

   protected final <K> TypeRewriteRule a(String $$0, TaggedChoiceType<K> $$1, TaggedChoiceType<?> $$2) {
      if ($$1.getKeyType() != $$2.getKeyType()) {
         throw new IllegalStateException("Could not inject: key type is not the same");
      } else {
         return this.fixTypeEverywhere($$0, $$1, $$2, $$1x -> $$1xx -> {
               if (!$$2.hasType($$1xx.getFirst())) {
                  throw new IllegalArgumentException(String.format(Locale.ROOT, "Unknown type %s in %s ", $$1xx.getFirst(), this.b));
               } else {
                  return $$1xx;
               }
            });
      }
   }
}
