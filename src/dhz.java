import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhz extends djc {
   public static final dua<dtn> K = dts.U;

   protected dhz(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dhz> a();

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return b($$1, $$2, m($$0).g());
   }

   public static boolean b(dcd $$0, ir $$1, iw $$2) {
      ir $$3 = $$1.a($$2);
      return $$0.a_($$3).d($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      for (iw $$1 : $$0.f()) {
         dtc $$2;
         if ($$1.o() == iw.a.b) {
            $$2 = this.n().a(K, $$1 == iw.b ? dtn.c : dtn.a).a(aE, $$0.g());
         } else {
            $$2 = this.n().a(K, dtn.b).a(aE, $$1.g());
         }

         if ($$2.a((dcd)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfe.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected static iw m(dtc $$0) {
      switch ((dtn)$$0.c(K)) {
         case c:
            return iw.a;
         case a:
            return iw.b;
         default:
            return $$0.c(aE);
      }
   }
}
