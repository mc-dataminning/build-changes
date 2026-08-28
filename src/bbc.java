import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import java.util.Locale;

public class bbc extends DataFix {
   private final String a;
   private final TypeReference b;

   public bbc(Schema $$0, String $$1, TypeReference $$2) {
      super($$0, true);
      this.a = $$1;
      this.b = $$2;
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType<?> $$0 = this.getInputSchema().findChoiceType(this.b);
      TaggedChoiceType<?> $$1 = this.getOutputSchema().findChoiceType(this.b);
      return this.a($$0, $$1);
   }

   private <K> TypeRewriteRule a(TaggedChoiceType<K> $$0, TaggedChoiceType<?> $$1) {
      if ($$0.getKeyType() != $$1.getKeyType()) {
         throw new IllegalStateException("Could not inject: key type is not the same");
      } else {
         return this.fixTypeEverywhere(this.a, $$0, $$1, $$1x -> $$1xx -> {
               if (!$$1.hasType($$1xx.getFirst())) {
                  throw new IllegalArgumentException(String.format(Locale.ROOT, "%s: Unknown type %s in '%s'", this.a, $$1xx.getFirst(), this.b.typeName()));
               } else {
                  return $$1xx;
               }
            });
      }
   }
}
