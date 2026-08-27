import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfu extends cxj {
   public static final MapCodec<dfu> c = b(dfu::new);

   @Override
   public MapCodec<dfu> a() {
      return c;
   }

   protected dfu(dle.d $$0) {
      super($$0);
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new dkf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return a($$0, $$2, div.B);
   }

   @Override
   protected void a(cvn $$0, hz $$1, chh $$2) {
      dit $$3 = $$0.c_($$1);
      if ($$3 instanceof dkf) {
         $$2.a((bly)$$3);
         $$2.a(atu.at);
      }
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, atk.xC, atl.e, 1.0F, 1.0F, false);
         }

         $$1.a(jz.ab, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
