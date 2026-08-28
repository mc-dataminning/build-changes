import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djf extends det {
   public static final MapCodec<djf> c = b(djf::new);

   @Override
   public MapCodec<djf> a() {
      return c;
   }

   protected djf(dtb.d $$0) {
      super($$0);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dre($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return a($$0, $$2, dqj.a);
   }

   @Override
   protected void a(dcw $$0, jd $$1, cmx $$2) {
      dqh $$3 = $$0.c_($$1);
      if ($$3 instanceof dre) {
         $$2.a((bqv)$$3);
         $$2.a(avz.am);
      }
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avp.jY, avq.e, 1.0F, 1.0F, false);
         }

         ji $$7 = $$0.c(a);
         ji.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ji.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == ji.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lm.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(lm.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
