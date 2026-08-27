import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class czo extends dac implements dcu {
   protected czo(dna.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends czo> a();

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.a;
   }

   @Override
   protected boolean a(dnb $$0, cxb $$1, ib $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dki $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bnh b(dnb $$0, cxb $$1, ib $$2) {
      dki $$3 = $$1.c_($$2);
      return $$3 instanceof bnh ? (bnh)$$3 : null;
   }

   @Nullable
   protected static <E extends dki, A extends dki> dkj<A> a(dkk<A> $$0, dkk<E> $$1, dkj<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
