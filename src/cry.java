import java.util.Optional;

public abstract class cry extends csk {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final ehy b = csk.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public cry(dex.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public dey a(cle $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dey a(coq $$0, gv $$1) {
      gv $$2 = $$1.d();
      dey $$3 = $$0.a_($$2);
      return czv.h($$3) ? csl.cs.n() : ((cvg)csl.cr).b($$0, $$1);
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return b;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aou.hM, aov.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      gv $$4 = $$2.d();
      dey $$5 = $$1.a_($$4);
      if (!this.f($$5) && !$$5.d($$1, $$4, hb.b)) {
         if (this.f($$1.a_($$2.g()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(iw.S, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.h()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(iw.S, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.e()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(iw.S, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.f()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(iw.S, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.c()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(iw.S, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(iw.S, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean f(dey var1);

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
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
   public void b(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<eaz> $$5 = eaz.a($$1, $$2, hb.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((cpn)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(cpk $$0) {
      return $$0.ac() == cpk.h || $$0.ac() == cpk.i;
   }

   @Override
   protected void a(cpk $$0, cbl $$1, gv $$2, dey $$3) {
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, cbl $$3) {
      if (!$$0.r_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(cpk $$0, gv $$1, hb $$2) {
      dey $$3 = $$0.a_($$1);
      return !$$3.i() ? false : a($$0, $$1).a((cpn)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(cpk $$0, gv $$1, hb $$2) {
      if (!a($$0)) {
         return false;
      } else {
         gv.a $$3 = $$1.j();
         boolean $$4 = false;

         for (hb $$5 : hb.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(csl.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            hb.a $$6 = $$2.o().d() ? $$2.i().o() : hb.c.a.b($$0.z);
            return eaz.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
