import javax.annotation.Nullable;

public class csj extends crf {
   protected csj(dex.d $$0) {
      super($$0);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new dcj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return a($$0, $$2, dcm.C);
   }

   @Override
   protected void a(cpk $$0, gv $$1, cbl $$2) {
      dck $$3 = $$0.c_($$1);
      if ($$3 instanceof dcj) {
         $$2.a((bgr)$$3);
         $$2.a(ape.as);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5;
         double $$5 = (double)$$2.v();
         double $$6 = (double)$$2.w() + 0.5;
         if ($$3.j() < 0.1) {
            $$1.a($$4, $$5, $$6, aou.cg, aov.e, 1.0F, 1.0F, false);
         }

         hb $$7 = $$0.c(a);
         hb.a $$8 = $$7.o();
         double $$9 = 0.52;
         double $$10 = $$3.j() * 0.6 - 0.3;
         double $$11 = $$8 == hb.a.a ? (double)$$7.j() * 0.52 : $$10;
         double $$12 = $$3.j() * 9.0 / 16.0;
         double $$13 = $$8 == hb.a.c ? (double)$$7.l() * 0.52 : $$10;
         $$1.a(iw.Z, $$4 + $$11, $$5 + $$12, $$6 + $$13, 0.0, 0.0, 0.0);
      }
   }
}
