import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends ddw {
   public static final MapCodec<dmi> c = b(dmi::new);

   @Override
   public MapCodec<dmi> a() {
      return c;
   }

   protected dmi(dsd.d $$0) {
      super($$0);
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqw($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return a($$0, $$2, dpl.B);
   }

   @Override
   protected void a(dca $$0, iz $$1, cmz $$2) {
      dpj $$3 = $$0.c_($$1);
      if ($$3 instanceof dqw) {
         $$2.a((bra)$$3);
         $$2.a(awk.at);
      }
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awa.yh, awb.e, 1.0F, 1.0F, false);
         }

         $$1.a(li.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
