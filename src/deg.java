import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class deg extends deu implements dhm {
   protected deg(drw.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends deg> a();

   @Override
   protected dla a_(drx $$0) {
      return dla.a;
   }

   @Override
   protected boolean a(drx $$0, dbt $$1, iz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dpc $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bqt b(drx $$0, dbt $$1, iz $$2) {
      dpc $$3 = $$1.c_($$2);
      return $$3 instanceof bqt ? (bqt)$$3 : null;
   }

   @Nullable
   protected static <E extends dpc, A extends dpc> dpd<A> a(dpe<A> $$0, dpe<E> $$1, dpd<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
