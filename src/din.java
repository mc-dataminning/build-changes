import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class din extends ddw {
   public static final MapCodec<din> c = b(din::new);

   @Override
   public MapCodec<din> a() {
      return c;
   }

   protected din(dtb.d $$0) {
      super($$0);
   }

   @Override
   public dqc a(ir $$0, dtc $$1) {
      return new dqz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqc> dqd<T> a(dca $$0, dtc $$1, dqe<T> $$2) {
      return a($$0, $$2, dqe.a);
   }

   @Override
   protected void a(dca $$0, ir $$1, cly $$2) {
      dqc $$3 = $$0.c_($$1);
      if ($$3 instanceof dqz) {
         $$2.a((bqe)$$3);
         $$2.a(avz.an);
      }
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avo.kl, avq.e, 1.0F, 1.0F, false);
         }

         iw $$7 = $$0.c(a);
         iw.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == iw.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == iw.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lb.ac, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(lb.E, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
