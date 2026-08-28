import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dip extends dhl {
   public static final MapCodec<dip> c = b(dip::new);

   @Override
   public MapCodec<dip> a() {
      return c;
   }

   protected dip(dvu.d $$0) {
      super($$0);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dsx($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsy> dsz<T> a(dfm $$0, dvv $$1, dta<T> $$2) {
      return a($$0, $$2, dta.C);
   }

   @Override
   protected void a(dfm $$0, jh $$1, cou $$2) {
      dsy $$3 = $$0.c_($$1);
      if ($$3 instanceof dsx) {
         $$2.a((bsm)$$3);
         $$2.a(awx.as);
      }
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, awn.cA, awo.e, 1.0F, 1.0F, false);
         }

         jm $$7 = $$0.c(a);
         jm.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == jm.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == jm.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(ls.ae, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
