import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dfi extends dfw implements dio {
   protected dfi(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfi> a();

   @Override
   protected dmd a_(dta $$0) {
      return dmd.a;
   }

   @Override
   protected boolean a(dta $$0, dcu $$1, jd $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dqf $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bqu b(dta $$0, dcu $$1, jd $$2) {
      dqf $$3 = $$1.c_($$2);
      return $$3 instanceof bqu ? (bqu)$$3 : null;
   }

   @Nullable
   protected static <E extends dqf, A extends dqf> dqg<A> a(dqh<A> $$0, dqh<E> $$1, dqg<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
