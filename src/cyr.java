import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cyr extends czf implements dbx {
   protected cyr(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cyr> a();

   @Override
   protected dfk b_(dme $$0) {
      return dfk.a;
   }

   @Override
   protected boolean a(dme $$0, cwe $$1, ib $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      djl $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bmp b(dme $$0, cwe $$1, ib $$2) {
      djl $$3 = $$1.c_($$2);
      return $$3 instanceof bmp ? (bmp)$$3 : null;
   }

   @Nullable
   protected static <E extends djl, A extends djl> djm<A> a(djn<A> $$0, djn<E> $$1, djm<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
