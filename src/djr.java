import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class djr extends dke {
   private static final int c = 8;
   private static final int d = 1;
   private static final int e = 3;
   private final float f;
   protected static final float a = 1.0F;
   protected static final fcm b = dke.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public djr(dxm.d $$0, float $$1) {
      super($$0);
      this.f = $$1;
   }

   @Override
   protected abstract MapCodec<? extends djr> a();

   @Override
   public dxn a(dbb $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dxn a(dgf $$0, jh $$1) {
      jh $$2 = $$1.e();
      dxn $$3 = $$0.a_($$2);
      return drs.o($$3) ? dkg.cz.m() : ((dnf)dkg.cy).b($$0, $$1);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return b;
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.jm, axg.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      jh $$4 = $$2.e();
      dxn $$5 = $$1.a_($$4);
      if (!this.g($$5) && !$$5.c($$1, $$4, jm.b)) {
         if (this.g($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(ls.Y, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(ls.Y, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(ls.Y, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(ls.Y, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(ls.Y, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(ls.Y, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean g(dxn var1);

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if (!$$3.bi()) {
         if ($$3.aG() >= 0) {
            if ($$3 instanceof asi) {
               int $$4 = $$1.H_().b(1, 3);
               $$3.h($$3.aG() + $$4);
            }

            $$3.d(8.0F);
         } else {
            $$3.h($$3.aG() + 1);
         }
      }

      $$3.a($$1.aj().a(), this.f);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<euo> $$5 = euo.a((dhb)$$1, $$2, jm.a.a);
            if ($$5.isPresent()) {
               $$5.get().a($$1);
               return;
            }
         }

         if (!$$0.a((dhd)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(dha $$0) {
      return $$0.ah() == dha.i || $$0.ah() == dha.j;
   }

   @Override
   protected void a(dha $$0, cps $$1, jh $$2, dxn $$3) {
   }

   @Override
   public dxn a(dha $$0, jh $$1, dxn $$2, cps $$3) {
      if (!$$0.B_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(dha $$0, jh $$1, jm $$2) {
      dxn $$3 = $$0.a_($$1);
      return !$$3.l() ? false : a($$0, $$1).a((dhd)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(dha $$0, jh $$1, jm $$2) {
      if (!a($$0)) {
         return false;
      } else {
         jh.a $$3 = $$1.k();
         boolean $$4 = false;

         for (jm $$5 : jm.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dkg.cv)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            jm.a $$6 = $$2.o().d() ? $$2.i().o() : jm.c.a.b($$0.A);
            return euo.a((dhb)$$0, $$1, $$6).isPresent();
         }
      }
   }
}
