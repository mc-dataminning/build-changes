import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dib extends djd {
   public static final dti<dsv> K = dta.U;

   protected dib(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dib> a();

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dci $$0, ja $$1, jf $$2) {
      ja $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      for (jf $$1 : $$0.f()) {
         dsk $$2;
         if ($$1.o() == jf.a.b) {
            $$2 = this.o().a(K, $$1 == jf.b ? dsv.c : dsv.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dsv.b).a(aE, $$1.g());
         }

         if ($$2.a((dci)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static jf m(dsk $$0) {
      switch ((dsv)$$0.c(K)) {
         case c:
            return jf.a;
         case a:
            return jf.b;
         default:
            return $$0.c(aE);
      }
   }
}
