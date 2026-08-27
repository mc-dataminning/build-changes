import java.util.Optional;

public abstract class csl extends csx {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final eii b = csx.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public csl(dfk.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public dfl a(clp $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dfl a(cpd $$0, gw $$1) {
      gw $$2 = $$1.d();
      dfl $$3 = $$0.a_($$2);
      return dai.h($$3) ? csy.cs.n() : ((cvt)csy.cr).b($$0, $$1);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return b;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apf.hM, apg.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      gw $$4 = $$2.d();
      dfl $$5 = $$1.a_($$4);
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

   protected abstract boolean f(dfl var1);

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
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
   public void b(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<ebm> $$5 = ebm.a($$1, $$2, hc.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((cqa)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(cpx $$0) {
      return $$0.ac() == cpx.h || $$0.ac() == cpx.i;
   }

   @Override
   protected void a(cpx $$0, cbw $$1, gw $$2, dfl $$3) {
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, cbw $$3) {
      if (!$$0.w_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(cpx $$0, gw $$1, hc $$2) {
      dfl $$3 = $$0.a_($$1);
      return !$$3.i() ? false : a($$0, $$1).a((cqa)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(cpx $$0, gw $$1, hc $$2) {
      if (!a($$0)) {
         return false;
      } else {
         gw.a $$3 = $$1.j();
         boolean $$4 = false;

         for (hc $$5 : hc.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(csy.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            hc.a $$6 = $$2.o().d() ? $$2.i().o() : hc.c.a.b($$0.z);
            return ebm.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
