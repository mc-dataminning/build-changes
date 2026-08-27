public class cyw extends cuo {
   public static final dfv a = dfu.s;
   public static final dge d = dfu.aA;

   protected cyw(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, hc.c).a(d, Integer.valueOf(1)).a(a, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if (!$$3.fR().e) {
         return bgt.d;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return bgt.a($$1.B);
      }
   }

   @Override
   protected int g(dfe $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public dfe a(cli $$0) {
      dfe $$1 = super.a($$0);
      return $$1.a(a, Boolean.valueOf(this.b($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$1 == hc.a && !this.a((cpt)$$3, $$5, $$2)) {
         return csr.a.n();
      } else {
         return !$$3.r_() && $$1.o() != $$0.c(aC).o() ? $$0.a(a, Boolean.valueOf(this.b($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(cpt $$0, gw $$1, dfe $$2) {
      return this.a((cqg)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean a() {
      return true;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$0.c(c)) {
         hc $$4 = $$0.c(aC);
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
         $$1.a(ir.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(aC, d, a, c);
   }
}
