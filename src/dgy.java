import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dgy extends dhm implements dke {
   protected dgy(dur.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dgy> a();

   @Override
   protected dnt a_(dus $$0) {
      return dnt.a;
   }

   @Override
   protected boolean a(dus $$0, dej $$1, jf $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      drv $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bru b(dus $$0, dej $$1, jf $$2) {
      drv $$3 = $$1.c_($$2);
      return $$3 instanceof bru ? (bru)$$3 : null;
   }

   @Nullable
   protected static <E extends drv, A extends drv> drw<A> a(drx<A> $$0, drx<E> $$1, drw<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
