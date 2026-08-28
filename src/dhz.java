import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhz extends djb {
   public static final dtf<dss> K = dsx.U;

   protected dhz(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhz> a();

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dcg $$0, ja $$1, jf $$2) {
      ja $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dsh a(cxk $$0) {
      for (jf $$1 : $$0.f()) {
         dsh $$2;
         if ($$1.o() == jf.a.b) {
            $$2 = this.o().a(K, $$1 == jf.b ? dss.c : dss.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dss.b).a(aE, $$1.g());
         }

         if ($$2.a((dcg)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static jf m(dsh $$0) {
      switch ((dss)$$0.c(K)) {
         case c:
            return jf.a;
         case a:
            return jf.b;
         default:
            return $$0.c(aE);
      }
   }
}
