import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dis extends dju {
   public static final dua<dtn> K = dts.U;

   protected dis(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dis> a();

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dcz $$0, jd $$1, ji $$2) {
      jd $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      for (ji $$1 : $$0.f()) {
         dtc $$2;
         if ($$1.o() == ji.a.b) {
            $$2 = this.o().a(K, $$1 == ji.b ? dtn.c : dtn.a).a(aE, $$0.g());
         } else {
            $$2 = this.o().a(K, dtn.b).a(aE, $$1.g());
         }

         if ($$2.a((dcz)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static ji m(dtc $$0) {
      switch ((dtn)$$0.c(K)) {
         case c:
            return ji.a;
         case a:
            return ji.b;
         default:
            return $$0.c(aE);
      }
   }
}
