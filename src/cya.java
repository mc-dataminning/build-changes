import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cya extends cyo implements dbg {
   protected cya(dle.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cya> a();

   @Override
   protected det b_(dlf $$0) {
      return det.a;
   }

   @Override
   protected boolean a(dlf $$0, cvn $$1, hz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dit $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bly b(dlf $$0, cvn $$1, hz $$2) {
      dit $$3 = $$1.c_($$2);
      return $$3 instanceof bly ? (bly)$$3 : null;
   }

   @Nullable
   protected static <E extends dit, A extends dit> diu<A> a(div<A> $$0, div<E> $$1, diu<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
