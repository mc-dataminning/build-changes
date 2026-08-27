import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.RewriteResult;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.View;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.functions.PointFreeRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.BitSet;

public abstract class bep extends DataFix {
   private final String a;
   private final String b;
   private final TypeReference c;

   public bep(Schema $$0, boolean $$1, String $$2, TypeReference $$3, String $$4) {
      super($$0, $$1);
      this.a = $$2;
      this.c = $$3;
      this.b = $$4;
   }

   public TypeRewriteRule makeRule() {
      Type<?> $$0 = this.getInputSchema().getType(this.c);
      Type<?> $$1 = this.getInputSchema().getChoiceType(this.c, this.b);
      Type<?> $$2 = this.getOutputSchema().getType(this.c);
      Type<?> $$3 = this.getOutputSchema().getChoiceType(this.c, this.b);
      OpticFinder<?> $$4 = DSL.namedChoice(this.b, $$1);
      Type<?> $$5 = $$1.all(a($$0, $$2), true, false).view().newType();
      return this.a($$0, $$2, $$4, $$3, $$5);
   }

   private <S, T, A, B> TypeRewriteRule a(Type<S> $$0, Type<T> $$1, OpticFinder<A> $$2, Type<B> $$3, Type<?> $$4) {
      return this.fixTypeEverywhere(this.a, $$0, $$1, $$4x -> $$5 -> {
            Typed<S> $$6 = new Typed($$0, $$4x, $$5);
            return $$6.update($$2, $$3, $$3xxx -> {
               Typed<A> $$4xxx = new Typed($$4, $$4x, $$3xxx);
               return ac.a($$4xxx, $$3, this::a).getValue();
            }).getValue();
         });
   }

   private static <A, B> TypeRewriteRule a(Type<A> $$0, Type<B> $$1) {
      RewriteResult<A, B> $$2 = RewriteResult.create(View.create("Patcher", $$0, $$1, $$0x -> $$0xx -> {
            throw new UnsupportedOperationException();
         }), new BitSet());
      return TypeRewriteRule.everywhere(TypeRewriteRule.ifSame($$0, $$2), PointFreeRule.nop(), true, true);
   }

   protected abstract <T> Dynamic<T> a(Dynamic<T> var1);
}
