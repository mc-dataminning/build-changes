import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class djq extends dkd {
   private static final int c = 8;
   private static final int d = 1;
   private static final int e = 3;
   private final float f;
   protected static final float a = 1.0F;
   protected static final fcl b = dkd.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public djq(dxn.d $$0, float $$1) {
      super($$0);
      this.f = $$1;
   }

   @Override
   protected abstract MapCodec<? extends djq> a();

   @Override
   public dxo a(dax $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dxo a(dge $$0, jh $$1) {
      jh $$2 = $$1.e();
      dxo $$3 = $$0.a_($$2);
      return drt.o($$3) ? dkf.cz.m() : ((dne)dkf.cy).b($$0, $$1);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awv.jt, aww.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      jh $$4 = $$2.e();
      dxo $$5 = $$1.a_($$4);
      if (!this.g($$5) && !$$5.c($$1, $$4, jm.b)) {
         if (this.g($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(ls.Z, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(ls.Z, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(ls.Z, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(ls.Z, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(ls.Z, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(ls.Z, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean g(dxo var1);

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if (!$$3.bi()) {
         if ($$3.aG() < 0) {
            $$3.h($$3.aG() + 1);
         } else if ($$3 instanceof ary) {
            int $$4 = $$1.H_().b(1, 3);
            $$3.h($$3.aG() + $$4);
         }

         if ($$3.aG() >= 0) {
            $$3.d(8.0F);
         }
      }

      $$3.a($$1.ak().a(), this.f);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<eup> $$5 = eup.a((dha)$$1, $$2, jm.a.a);
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
      return $$0.ai() == dgz.i || $$0.ai() == dgz.j;
   }

   @Override
   protected void a(dgz $$0, cpo $$1, jh $$2, dxo $$3) {
   }

   @Override
   public dxo a(dgz $$0, jh $$1, dxo $$2, cpo $$3) {
      if (!$$0.B_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(dgz $$0, jh $$1, jm $$2) {
      dxo $$3 = $$0.a_($$1);
      return !$$3.l() ? false : a($$0, $$1).a((dhc)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(dgz $$0, jh $$1, jm $$2) {
      if (!a($$0)) {
         return false;
      } else {
         jh.a $$3 = $$1.k();
         boolean $$4 = false;

         for (jm $$5 : jm.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dkf.cv)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            jm.a $$6 = $$2.o().d() ? $$2.i().o() : jm.c.a.b($$0.A);
            return eup.a((dha)$$0, $$1, $$6).isPresent();
         }
      }
   }
}
