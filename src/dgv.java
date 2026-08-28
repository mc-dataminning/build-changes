import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgv extends dhj implements dkb {
   protected dgv(dun.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgv> a();

   @Override
   protected dnq a_(duo $$0) {
      return dnq.a;
   }

   @Override
   protected boolean a(duo $$0, deg $$1, je $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      drs $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected brr b(duo $$0, deg $$1, je $$2) {
      drs $$3 = $$1.c_($$2);
      return $$3 instanceof brr ? (brr)$$3 : null;
   }

   @Nullable
   protected static <E extends drs, A extends drs> drt<A> a(dru<A> $$0, dru<E> $$1, drt<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
