import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class den extends dfb implements dht {
   protected den(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends den> a();

   @Override
   protected dlh a_(dse $$0) {
      return dlh.a;
   }

   @Override
   protected boolean a(dse $$0, dca $$1, iz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpj $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bra b(dse $$0, dca $$1, iz $$2) {
      dpj $$3 = $$1.c_($$2);
      return $$3 instanceof bra ? (bra)$$3 : null;
   }

   @Nullable
   protected static <E extends dpj, A extends dpj> dpk<A> a(dpl<A> $$0, dpl<E> $$1, dpk<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
