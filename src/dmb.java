import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmb extends ddp {
   public static final MapCodec<dmb> c = b(dmb::new);

   @Override
   public MapCodec<dmb> a() {
      return c;
   }

   protected dmb(drw.d $$0) {
      super($$0);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dqp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return a($$0, $$2, dpe.B);
   }

   @Override
   protected void a(dbt $$0, iz $$1, cms $$2) {
      dpc $$3 = $$0.c_($$1);
      if ($$3 instanceof dqp) {
         $$2.a((bqt)$$3);
         $$2.a(awg.at);
      }
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avw.yh, avx.e, 1.0F, 1.0F, false);
         }

         $$1.a(lj.ae, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
