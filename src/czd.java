public class czd extends cuv {
   public static final dgc a = dgb.s;
   public static final dgl d = dgb.aA;

   protected czd(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, hc.c).a(d, Integer.valueOf(1)).a(a, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if (!$$3.fS().e) {
         return bha.d;
      } else {
         $$1.a($$2, $$0.a(d), 3);
         return bha.a($$1.B);
      }
   }

   @Override
   protected int g(dfl $$0) {
      return $$0.c(d) * 2;
   }

   @Override
   public dfl a(clp $$0) {
      dfl $$1 = super.a($$0);
      return $$1.a(a, Boolean.valueOf(this.b($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1 == hc.a && !this.a((cqa)$$3, $$5, $$2)) {
         return csy.a.n();
      } else {
         return !$$3.w_() && $$1.o() != $$0.c(aC).o() ? $$0.a(a, Boolean.valueOf(this.b($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(cqa $$0, gw $$1, dfl $$2) {
      return this.a((cqn)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean a() {
      return true;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
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
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(aC, d, a, c);
   }
}
