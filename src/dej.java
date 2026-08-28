import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dej extends dex implements dhp {
   protected dej(drz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dej> a();

   @Override
   protected dld a_(dsa $$0) {
      return dld.a;
   }

   @Override
   protected boolean a(dsa $$0, dbw $$1, iz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpf $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bqw b(dsa $$0, dbw $$1, iz $$2) {
      dpf $$3 = $$1.c_($$2);
      return $$3 instanceof bqw ? (bqw)$$3 : null;
   }

   @Nullable
   protected static <E extends dpf, A extends dpf> dpg<A> a(dph<A> $$0, dph<E> $$1, dpg<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
