import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public abstract class bhn extends DataFix {
   private final String a;
   private final String b;
   private final TypeReference c;

   public bhn(Schema $$0, boolean $$1, String $$2, TypeReference $$3, String $$4) {
      super($$0, $$1);
      this.a = $$2;
      this.c = $$3;
      this.b = $$4;
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(this.c);
      Type<?> $$1 = this.getInputSchema().getChoiceType(this.c, this.b);
      Type<?> $$2 = this.getOutputSchema().getType(this.c);
      OpticFinder<?> $$3 = DSL.namedChoice(this.b, $$1);
      Type<?> $$4 = baz.a($$0, $$0, $$2);
      return this.a($$0, $$2, $$4, $$3);
   }

   private <S, T, A> TypeRewriteRule a(Type<S> $$0, Type<T> $$1, Type<?> $$2, OpticFinder<A> $$3) {
      return this.fixTypeEverywhereTyped(this.a, $$0, $$1, $$3x -> {
         if ($$3x.getOptional($$3).isEmpty()) {
            return baz.a($$1, $$3x);
         } else {
            Typed<?> $$4 = baz.a($$2, $$3x);
            return af.a((Typed<A>)$$4, $$1, this::a);
         }
      });
   }

   protected abstract <T> Dynamic<T> a(Dynamic<T> var1);
}
