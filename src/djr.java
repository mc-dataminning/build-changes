import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class djr extends dke {
   private static final int b = 8;
   private static final int c = 1;
   private static final int d = 3;
   private final float e;
   protected static final fcr a = dke.b(16.0, 0.0, 1.0);

   public djr(dxp.d $$0, float $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected abstract MapCodec<? extends djr> a();

   @Override
   public dxq a(dax $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dxq a(dgf $$0, ji $$1) {
      ji $$2 = $$1.e();
      dxq $$3 = $$0.a_($$2);
      return drv.o($$3) ? dkg.cz.m() : ((dnf)dkg.cy).b($$0, $$1);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return a;
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.jt, awb.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      ji $$4 = $$2.e();
      dxq $$5 = $$1.a_($$4);
      if (!this.g($$5) && !$$5.c($$1, $$4, jn.b)) {
         if (this.g($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(lt.aa, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(lt.aa, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(lt.aa, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(lt.aa, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(lt.aa, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(lt.aa, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean g(dxq var1);

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if (!$$3.bi()) {
         if ($$3.aG() < 0) {
            $$3.h($$3.aG() + 1);
         } else if ($$3 instanceof are) {
            int $$4 = $$1.C_().b(1, 3);
            $$3.h($$3.aG() + $$4);
         }

         if ($$3.aG() >= 0) {
            $$3.e(8.0F);
         }
      }

      $$3.a($$1.al().a(), this.e);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<euv> $$5 = euv.a((dha)$$1, $$2, jn.a.a);
            if ($$5.isPresent()) {
               $$5.get().a($$1);
               return;
            }
         }

         if (!$$0.a((dhc)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(dgz $$0) {
      return $$0.aj() == dgz.i || $$0.aj() == dgz.j;
   }

   @Override
   protected void a(dgz $$0, cpr $$1, ji $$2, dxq $$3) {
   }

   @Override
   public dxq a(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      if (!$$0.w_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(dgz $$0, ji $$1, jn $$2) {
      dxq $$3 = $$0.a_($$1);
      return !$$3.l() ? false : a($$0, $$1).a((dhc)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(dgz $$0, ji $$1, jn $$2) {
      if (!a($$0)) {
         return false;
      } else {
         ji.a $$3 = $$1.k();
         boolean $$4 = false;

         for (jn $$5 : jn.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dkg.cv)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            jn.a $$6 = $$2.o().d() ? $$2.i().o() : jn.c.a.b($$0.A);
            return euv.a((dha)$$0, $$1, $$6).isPresent();
         }
      }
   }
}
