import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djp extends dkr {
   public static final duy<dul> K = duq.U;

   protected djp(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djp> a();

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(ddv $$0, je $$1, jj $$2) {
      je $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      for (jj $$1 : $$0.f()) {
         dua $$2;
         if ($$1.o() == jj.a.b) {
            $$2 = this.o().b(K, $$1 == jj.b ? dul.c : dul.a).b(aE, $$0.g());
         } else {
            $$2 = this.o().b(K, dul.b).b(aE, $$1.g());
         }

         if ($$2.a((ddv)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return n($$0).g() == $$1 && !$$0.a($$3, $$4) ? dgx.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static jj n(dua $$0) {
      switch ((dul)$$0.c(K)) {
         case c:
            return jj.a;
         case a:
            return jj.b;
         default:
            return $$0.c(aE);
      }
   }
}
