import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class den extends dfc implements dhw {
   protected den(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends den> a();

   @Override
   protected dlw a_(dtc $$0) {
      return dlw.a;
   }

   @Override
   protected boolean a(dtc $$0, dca $$1, ir $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dqc $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.b_($$3, $$4);
   }

   @Nullable
   @Override
   protected bqe b(dtc $$0, dca $$1, ir $$2) {
      dqc $$3 = $$1.c_($$2);
      return $$3 instanceof bqe ? (bqe)$$3 : null;
   }

   @Nullable
   protected static <E extends dqc, A extends dqc> dqd<A> a(dqe<A> $$0, dqe<E> $$1, dqd<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
