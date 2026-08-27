public class cyq extends cui {
   public static final dfp a = dfo.s;
   public static final dfy d = dfo.aA;

   protected cyq(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, hb.c).a(d, Integer.valueOf(1)).a(a, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if (!$$3.fR().e) {
         return bgo.d;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return bgo.a($$1.B);
      }
   }

   @Override
   protected int g(dey $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public dey a(cle $$0) {
      dey $$1 = super.a($$0);
      return $$1.a(a, Boolean.valueOf(this.a($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return !$$3.r_() && $$1.o() != $$0.c(aC).o() ? $$0.a(a, Boolean.valueOf(this.a($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return this.a($$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean a() {
      return true;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$0.c(c)) {
         hb $$4 = $$0.c(aC);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(d) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(iq.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(aC, d, a, c);
   }
}
