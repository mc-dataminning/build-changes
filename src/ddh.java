import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddh extends cyv {
   public static final MapCodec<ddh> c = b(ddh::new);

   @Override
   public MapCodec<ddh> a() {
      return c;
   }

   protected ddh(dmy.d $$0) {
      super($$0);
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dlc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return a($$0, $$2, dki.a);
   }

   @Override
   protected void a(cwz $$0, ib $$1, cis $$2) {
      dkg $$3 = $$0.c_($$1);
      if ($$3 instanceof dlc) {
         $$2.a((bng)$$3);
         $$2.a(aui.am);
      }
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aty.jN, atz.e, 1.0F, 1.0F, false);
         }

         ih $$7 = $$0.c(a);
         ih.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ih.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 6.0 / 16.0;
         double $$13 = $$8 == ih.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(kc.ac, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
         $$1.a(kc.F, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
