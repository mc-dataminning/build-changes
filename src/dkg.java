import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dkg extends dli {
   public static final dvq<dvd> L = dvi.U;

   protected dkg(dur.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkg> a();

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dem $$0, jf $$1, jk $$2) {
      jf $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dus a(czn $$0) {
      for (jk $$1 : $$0.f()) {
         dus $$2;
         if ($$1.o() == jk.a.b) {
            $$2 = this.n().b(L, $$1 == jk.b ? dvd.c : dvd.a).b(aF, $$0.g());
         } else {
            $$2 = this.n().b(L, dvd.b).b(aF, $$1.g());
         }

         if ($$2.a((dem)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return n($$0).g() == $$1 && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static jk n(dus $$0) {
      switch ((dvd)$$0.c(L)) {
         case c:
            return jk.a;
         case a:
            return jk.b;
         default:
            return $$0.c(aF);
      }
   }
}
