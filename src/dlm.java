import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlm extends dma implements dot {
   protected dlm(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlm> a();

   @Override
   protected boolean a(dzz $$0, div $$1, iu $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dwx $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bud b(dzz $$0, div $$1, iu $$2) {
      dwx $$3 = $$1.c_($$2);
      return $$3 instanceof bud ? (bud)$$3 : null;
   }

   @Nullable
   protected static <E extends dwx, A extends dwx> dwy<A> a(dwz<A> $$0, dwz<E> $$1, dwy<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
