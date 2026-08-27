import java.util.Optional;

public abstract class csj extends csv {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final eig b = csv.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public csj(dfi.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public dfj a(cln $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dfj a(cpb $$0, gw $$1) {
      gw $$2 = $$1.d();
      dfj $$3 = $$0.a_($$2);
      return dag.h($$3) ? csw.cs.n() : ((cvr)csw.cr).b($$0, $$1);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return b;
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apd.hM, ape.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      gw $$4 = $$2.d();
      dfj $$5 = $$1.a_($$4);
      if (!this.f($$5) && !$$5.d($$1, $$4, ha.b)) {
         if (this.f($$1.a_($$2.g()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(iv.S, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.h()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(iv.S, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.e()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(iv.S, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.f()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(iv.S, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.c()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(iv.S, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(iv.S, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean f(dfj var1);

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
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
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<ebk> $$5 = ebk.a($$1, $$2, ha.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((cpy)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(cpv $$0) {
      return $$0.ac() == cpv.h || $$0.ac() == cpv.i;
   }

   @Override
   protected void a(cpv $$0, cbu $$1, gw $$2, dfj $$3) {
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, cbu $$3) {
      if (!$$0.w_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(cpv $$0, gw $$1, ha $$2) {
      dfj $$3 = $$0.a_($$1);
      return !$$3.i() ? false : a($$0, $$1).a((cpy)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(cpv $$0, gw $$1, ha $$2) {
      if (!a($$0)) {
         return false;
      } else {
         gw.a $$3 = $$1.j();
         boolean $$4 = false;

         for (ha $$5 : ha.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(csw.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            ha.a $$6 = $$2.o().d() ? $$2.i().o() : ha.c.a.b($$0.z);
            return ebk.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
