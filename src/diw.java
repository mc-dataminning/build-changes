import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class diw extends djk implements dmd {
   protected diw(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends diw> a();

   @Override
   protected boolean a(dwv $$0, dgg $$1, ji $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dtx $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bsk b(dwv $$0, dgg $$1, ji $$2) {
      dtx $$3 = $$1.c_($$2);
      return $$3 instanceof bsk ? (bsk)$$3 : null;
   }

   @Nullable
   protected static <E extends dtx, A extends dtx> dty<A> a(dtz<A> $$0, dtz<E> $$1, dty<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
