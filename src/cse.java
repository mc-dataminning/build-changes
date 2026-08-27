import java.util.Optional;

public abstract class cse extends csq {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final eib b = csq.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public cse(dfd.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public dfe a(cli $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dfe a(cow $$0, gw $$1) {
      gw $$2 = $$1.d();
      dfe $$3 = $$0.a_($$2);
      return dab.h($$3) ? csr.cs.n() : ((cvm)csr.cr).b($$0, $$1);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aoz.hM, apa.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      gw $$4 = $$2.d();
      dfe $$5 = $$1.a_($$4);
      if (!this.f($$5) && !$$5.d($$1, $$4, hc.b)) {
         if (this.f($$1.a_($$2.g()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(ix.S, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.h()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(ix.S, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.e()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(ix.S, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.f()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(ix.S, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.c()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(ix.S, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(ix.S, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean f(dfe var1);

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if (!$$3.aW()) {
         $$3.h($$3.ax() + 1);
         if ($$3.ax() == 0) {
            $$3.g(8);
         }
      }

      $$3.a($$1.ag().a(), this.d);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<ebf> $$5 = ebf.a($$1, $$2, hc.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((cpt)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(cpq $$0) {
      return $$0.ac() == cpq.h || $$0.ac() == cpq.i;
   }

   @Override
   protected void a(cpq $$0, cbp $$1, gw $$2, dfe $$3) {
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, cbp $$3) {
      if (!$$0.r_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(cpq $$0, gw $$1, hc $$2) {
      dfe $$3 = $$0.a_($$1);
      return !$$3.i() ? false : a($$0, $$1).a((cpt)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(cpq $$0, gw $$1, hc $$2) {
      if (!a($$0)) {
         return false;
      } else {
         gw.a $$3 = $$1.j();
         boolean $$4 = false;

         for (hc $$5 : hc.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(csr.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            hc.a $$6 = $$2.o().d() ? $$2.i().o() : hc.c.a.b($$0.z);
            return ebf.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
