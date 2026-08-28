import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice.TaggedChoiceType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DynamicOps;
import java.util.Locale;
import java.util.function.Function;

public abstract class bfk extends DataFix {
   protected final String a;

   public bfk(String $$0, Schema $$1, boolean $$2) {
      super($$1, $$2);
      this.a = $$0;
   }

   public TypeRewriteRule makeRule() {
      TaggedChoiceType<String> $$0 = this.getInputSchema().findChoiceType(bjm.D);
      TaggedChoiceType<String> $$1 = this.getOutputSchema().findChoiceType(bjm.D);
      Function<String, Type<?>> $$2 = ag.b($$2x -> {
         Type<?> $$3 = (Type<?>)$$0.types().get($$2x);
         return bbq.a($$3, $$0, $$1);
      });
      return this.fixTypeEverywhere(
         this.a,
         $$0,
         $$1,
         $$2x -> $$3 -> {
               String $$4 = (String)$$3.getFirst();
               Type<?> $$5 = $$2.apply($$4);
               Pair<String, Typed<?>> $$6 = this.a($$4, this.a($$3.getSecond(), $$2x, $$5));
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
