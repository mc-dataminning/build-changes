import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class cye extends cys implements dbk {
   protected cye(dli.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cye> a();

   @Override
   protected dex b_(dlj $$0) {
      return dex.a;
   }

   @Override
   protected boolean a(dlj $$0, cvr $$1, hz $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dix $$5 = $$1.c_($$2);
      return $$5 == null ? false : $$5.a_($$3, $$4);
   }

   @Nullable
   @Override
   protected bma b(dlj $$0, cvr $$1, hz $$2) {
      dix $$3 = $$1.c_($$2);
      return $$3 instanceof bma ? (bma)$$3 : null;
   }

   @Nullable
   protected static <E extends dix, A extends dix> diy<A> a(diz<A> $$0, diz<E> $$1, diy<? super E> $$2) {
      return $$1 == $$0 ? $$2 : null;
   }
}
