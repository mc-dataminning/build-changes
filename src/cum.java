import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cum extends cva implements cxs {
   protected cum(dhh.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cum> a();

   @Override
   public dbf b_(dhi $$0) {
      return dbf.a;
   }

   @Override
   public boolean a(dhi $$0, csa $$1, ht $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dfd $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bja b(dhi $$0, csa $$1, ht $$2) {
      dfd $$3 = $$1.c_($$2);
      return $$3 instanceof bja ? (bja)$$3 : null;
   }

   @Nullable
   protected static <E extends dfd, A extends dfd> dfe<A> a(dff<A> $$0, dff<E> $$1, dfe<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
