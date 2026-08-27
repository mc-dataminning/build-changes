import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class des extends dft {
   public static final dpx<dpk> K = dpp.U;

   protected des(doy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends des> a();

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(cza $$0, ib $$1, ih $$2) {
      ib $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      for (ih $$1 : $$0.f()) {
         doz $$2;
         if ($$1.o() == ih.a.b) {
            $$2 = this.n().a(K, $$1 == ih.b ? dpk.c : dpk.a).a(aE, $$0.g());
         } else {
            $$2 = this.n().a(K, dpk.b).a(aE, $$1.g());
         }

         if ($$2.a((cza)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ih m(doz $$0) {
      switch ((dpk)$$0.c(K)) {
         case c:
            return ih.a;
         case a:
            return ih.b;
         default:
            return $$0.c(aE);
      }
   }
}
