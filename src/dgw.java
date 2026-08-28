import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dgw extends dhj {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final ezm b = dhj.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public dgw(dun.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dgw> a();

   @Override
   public duo a(czk $$0) {
      return a($$0.q(), $$0.a());
   }

   public static duo a(ddl $$0, je $$1) {
      je $$2 = $$1.e();
      duo $$3 = $$0.a_($$2);
      return dov.o($$3) ? dhl.cs.o() : ((dkj)dhl.cr).b($$0, $$1);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return b;
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awe.iU, awf.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      je $$4 = $$2.e();
      duo $$5 = $$1.a_($$4);
      if (!this.g($$5) && !$$5.c($$1, $$4, jj.b)) {
         if (this.g($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(ln.X, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(ln.X, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(ln.X, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(ln.X, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(ln.X, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(ln.X, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean g(duo var1);

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if (!$$3.bh()) {
         $$3.h($$3.aE() + 1);
         if ($$3.aE() == 0) {
            $$3.d(8.0F);
         }
      }

      $$3.a($$1.ak().a(), this.d);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<erp> $$5 = erp.a($$1, $$2, jj.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((dej)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(deg $$0) {
      return $$0.ag() == deg.h || $$0.ag() == deg.i;
   }

   @Override
   protected void a(deg $$0, cnu $$1, je $$2, duo $$3) {
   }

   @Override
   public duo a(deg $$0, je $$1, duo $$2, cnu $$3) {
      if (!$$0.w_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(deg $$0, je $$1, jj $$2) {
      duo $$3 = $$0.a_($$1);
      return !$$3.l() ? false : a($$0, $$1).a((dej)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(deg $$0, je $$1, jj $$2) {
      if (!a($$0)) {
         return false;
      } else {
         je.a $$3 = $$1.k();
         boolean $$4 = false;

         for (jj $$5 : jj.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dhl.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            jj.a $$6 = $$2.o().d() ? $$2.i().o() : jj.c.a.b($$0.z);
            return erp.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
