import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dek extends dey implements dhq {
   protected dek(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dek> a();

   @Override
   protected dle a_(dsb $$0) {
      return dle.a;
   }

   @Override
   protected boolean a(dsb $$0, dbx $$1, iz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpg $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bqx b(dsb $$0, dbx $$1, iz $$2) {
      dpg $$3 = $$1.c_($$2);
      return $$3 instanceof bqx ? (bqx)$$3 : null;
   }

   @Nullable
   protected static <E extends dpg, A extends dpg> dph<A> a(dpi<A> $$0, dpi<E> $$1, dph<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
