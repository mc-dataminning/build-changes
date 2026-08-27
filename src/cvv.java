import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cvv extends cwj implements czb {
   protected cvv(diz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cvv> a();

   @Override
   public dco b_(dja $$0) {
      return dco.a;
   }

   @Override
   public boolean a(dja $$0, cti $$1, hx $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dgo $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   public bjy b(dja $$0, cti $$1, hx $$2) {
      dgo $$3 = $$1.c_($$2);
      return $$3 instanceof bjy ? (bjy)$$3 : null;
   }

   @Nullable
   protected static <E extends dgo, A extends dgo> dgp<A> a(dgq<A> $$0, dgq<E> $$1, dgp<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
