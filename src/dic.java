import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dic extends diq implements dli {
   protected dic(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dic> a();

   @Override
   protected dow a_(dvv $$0) {
      return dow.a;
   }

   @Override
   protected boolean a(dvv $$0, dfm $$1, jh $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dsy $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bsm b(dvv $$0, dfm $$1, jh $$2) {
      dsy $$3 = $$1.c_($$2);
      return $$3 instanceof bsm ? (bsm)$$3 : null;
   }

   @Nullable
   protected static <E extends dsy, A extends dsy> dsz<A> a(dta<A> $$0, dta<E> $$1, dsz<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
