public class cyr extends cuj {
   public static final dfq a = dfp.s;
   public static final dfz d = dfp.aA;

   protected cyr(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, ha.c).a(d, Integer.valueOf(1)).a(a, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if (!$$3.fR().e) {
         return bgq.d;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return bgq.a($$1.B);
      }
   }

   @Override
   protected int g(dez $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public dez a(clf $$0) {
      dez $$1 = super.a($$0);
      return $$1.a(a, Boolean.valueOf(this.a($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return !$$3.r_() && $$1.o() != $$0.c(aC).o() ? $$0.a(a, Boolean.valueOf(this.a($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return this.a($$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean a() {
      return true;
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      if ($$0.c(c)) {
         ha $$4 = $$0.c(aC);
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
         $$1.a(ip.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(aC, d, a, c);
   }
}
