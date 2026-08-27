import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvl extends cvz implements cyr {
   protected cvl(dio.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cvl> a();

   @Override
   public dce b_(dip $$0) {
      return dce.a;
   }

   @Override
   public boolean a(dip $$0, csy $$1, hv $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dgd $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bjo b(dip $$0, csy $$1, hv $$2) {
      dgd $$3 = $$1.c_($$2);
      return $$3 instanceof bjo ? (bjo)$$3 : null;
   }

   @Nullable
   protected static <E extends dgd, A extends dgd> dge<A> a(dgf<A> $$0, dgf<E> $$1, dge<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
