import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class det extends ddp {
   public static final MapCodec<det> c = b(det::new);

   @Override
   public MapCodec<det> a() {
      return c;
   }

   protected det(drw.d $$0) {
      super($$0);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dpb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return a($$0, $$2, dpe.C);
   }

   @Override
   protected void a(dbt $$0, iz $$1, cms $$2) {
      dpc $$3 = $$0.c_($$1);
      if ($$3 instanceof dpb) {
         $$2.a((bqt)$$3);
         $$2.a(awg.as);
      }
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, avw.cA, avx.e, 1.0F, 1.0F, false);
         }

         je $$7 = $$0.c(a);
         je.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == je.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == je.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lj.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
