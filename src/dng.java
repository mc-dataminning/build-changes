import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dng extends det {
   public static final MapCodec<dng> c = b(dng::new);

   @Override
   public MapCodec<dng> a() {
      return c;
   }

   protected dng(dtb.d $$0) {
      super($$0);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return a($$0, $$2, dqj.B);
   }

   @Override
   protected void a(dcw $$0, jd $$1, cmx $$2) {
      dqh $$3 = $$0.c_($$1);
      if ($$3 instanceof drv) {
         $$2.a((bqv)$$3);
         $$2.a(avz.at);
      }
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avp.yk, avq.e, 1.0F, 1.0F, false);
         }

         $$1.a(lm.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
