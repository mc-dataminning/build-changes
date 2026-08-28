import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlk extends dgz {
   public static final MapCodec<dlk> c = b(dlk::new);

   @Override
   public MapCodec<dlk> a() {
      return c;
   }

   protected dlk(dvi.d $$0) {
      super($$0);
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dtk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return a($$0, $$2, dso.a);
   }

   @Override
   protected void a(dfb $$0, jh $$1, com $$2) {
      dsm $$3 = $$0.c_($$1);
      if ($$3 instanceof dtk) {
         $$2.a((bsf)$$3);
         $$2.a(awv.am);
      }
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awl.jZ, awm.e, 1.0F, 1.0F, false);
         }

         jm $$7 = $$0.c(a);
         jm.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jm.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == jm.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(lr.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(lr.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
