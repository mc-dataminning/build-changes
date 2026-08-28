import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class det extends dfh implements dhz {
   protected det(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends det> a();

   @Override
   protected dln a_(dsk $$0) {
      return dln.a;
   }

   @Override
   protected boolean a(dsk $$0, dcf $$1, ja $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpp $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bqk b(dsk $$0, dcf $$1, ja $$2) {
      dpp $$3 = $$1.c_($$2);
      return $$3 instanceof bqk ? (bqk)$$3 : null;
   }

   @Nullable
   protected static <E extends dpp, A extends dpp> dpq<A> a(dpr<A> $$0, dpr<E> $$1, dpq<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
