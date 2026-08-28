import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmq extends dne implements dpy {
   protected dmq(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmq> a();

   @Override
   protected boolean a(ebg $$0, djz $$1, iw $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dye $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected buv b(ebg $$0, djz $$1, iw $$2) {
      dye $$3 = $$1.c_($$2);
      return $$3 instanceof buv ? (buv)$$3 : null;
   }

   @Nullable
   protected static <E extends dye, A extends dye> dyf<A> a(dyg<A> $$0, dyg<E> $$1, dyf<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
