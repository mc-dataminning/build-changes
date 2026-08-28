import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmo extends dnc implements dpw {
   protected dmo(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmo> a();

   @Override
   protected boolean a(ebe $$0, djx $$1, iv $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dyc $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected but b(ebe $$0, djx $$1, iv $$2) {
      dyc $$3 = $$1.c_($$2);
      return $$3 instanceof but ? (but)$$3 : null;
   }

   @Nullable
   protected static <E extends dyc, A extends dyc> dyd<A> a(dye<A> $$0, dye<E> $$1, dyd<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
