import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dch extends dcv implements dfn {
   protected dch(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dch> a();

   @Override
   protected djb b_(dpy $$0) {
      return djb.a;
   }

   @Override
   protected boolean a(dpy $$0, czu $$1, im $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dnd $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bou b(dpy $$0, czu $$1, im $$2) {
      dnd $$3 = $$1.c_($$2);
      return $$3 instanceof bou ? (bou)$$3 : null;
   }

   @Nullable
   protected static <E extends dnd, A extends dnd> dne<A> a(dnf<A> $$0, dnf<E> $$1, dne<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
