import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmx extends ddw {
   public static final MapCodec<dmx> c = b(dmx::new);

   @Override
   public MapCodec<dmx> a() {
      return c;
   }

   protected dmx(dtb.d $$0) {
      super($$0);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dru($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$0, $$2, dqe.C);
   }

   @Override
   protected void a(dca $$0, ir $$1, cly $$2) {
      dqc $$3 = $$0.c_($$1);
      if ($$3 instanceof dru) {
         $$2.a((bqe)$$3);
         $$2.a(avz.au);
      }
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avo.yF, avq.e, 1.0F, 1.0F, false);
         }

         $$1.a(lb.ac, $$4, $$5 + 1.1, $$6, 0.0, 0.0, 0.0);
      }
   }
}
