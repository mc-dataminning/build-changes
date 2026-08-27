import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.Locale;

public abstract class bcx extends DataFix {
   protected final String a;

   public bcx(String $$0, Schema $$1, boolean $$2) {
      super($$1, $$2);
      this.a = $$0;
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType<String> $$0 = this.getInputSchema().findChoiceType(bgf.z);
      TaggedChoiceType<String> $$1 = this.getOutputSchema().findChoiceType(bgf.z);
      return this.fixTypeEverywhere(
         this.a,
         $$0,
         $$1,
         $$2 -> $$3 -> {
               String $$4 = (String)$$3.getFirst();
               Type<?> $$5 = (Type<?>)$$0.types().get($$4);
               Pair<String, Typed<?>> $$6 = this.a($$4, this.a($$3.getSecond(), $$2, $$5));
               Type<?> $$7 = (Type<?>)$$1.types().get($$6.getFirst());
               if (!$$7.equals(((Typed)$$6.getSecond()).getType(), true, true)) {
                  throw new IllegalStateException(
                     String.format(Locale.ROOT, "Dynamic type check failed: %s not equal to %s", $$7, ((Typed)$$6.getSecond()).getType())
                  );
               } else {
                  return Pair.of((String)$$6.getFirst(), ((Typed)$$6.getSecond()).getValue());
               }
            }
      );
   }

   private <A> Typed<A> a(Object $$0, DynamicOps<?> $$1, Type<A> $$2) {
      return new Typed($$2, $$1, $$0);
   }

   protected abstract Pair<String, Typed<?>> a(String var1, Typed<?> var2);
}
