import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dab extends cyx {
   public static final MapCodec<dab> c = b(dab::new);

   @Override
   public MapCodec<dab> a() {
      return c;
   }

   protected dab(dna.d $$0) {
      super($$0);
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dkh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return a($$0, $$2, dkk.C);
   }

   @Override
   protected void a(cxb $$0, ib $$1, ciu $$2) {
      dki $$3 = $$0.c_($$1);
      if ($$3 instanceof dkh) {
         $$2.a((bnh)$$3);
         $$2.a(aui.as);
      }
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aty.cz, atz.e, 1.0F, 1.0F, false);
         }

         ih $$7 = $$0.c(a);
         ih.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == ih.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == ih.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(kc.ac, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
