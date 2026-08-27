import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ctm extends cua implements cwq {
   protected ctm(dga.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends ctm> a();

   @Override
   public dae b_(dgb $$0) {
      return dae.a;
   }

   @Override
   public boolean a(dgb $$0, cqz $$1, ht $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      ddx $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bie b(dgb $$0, cqz $$1, ht $$2) {
      ddx $$3 = $$1.c_($$2);
      return $$3 instanceof bie ? (bie)$$3 : null;
   }

   @Nullable
   protected static <E extends ddx, A extends ddx> ddy<A> a(ddz<A> $$0, ddz<E> $$1, ddy<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
