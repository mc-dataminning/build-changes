import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dmp extends dnc {
   private static final int b = 8;
   private static final int c = 1;
   private static final int d = 3;
   private final float e;
   protected static final fgk a = dnc.b(16.0, 0.0, 1.0);

   public dmp(ebd.d $$0, float $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dmp> a();

   @Override
   public ebe a(ddr $$0) {
      return a($$0.q(), $$0.a());
   }

   public static ebe a(djb $$0, iv $$1) {
      iv $$2 = $$1.e();
      ebe $$3 = $$0.a_($$2);
      return dux.o($$3) ? dne.cC.m() : ((dqe)dne.cB).b($$0, $$1);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return a;
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awp.jx, awq.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      iv $$4 = $$2.e();
      ebe $$5 = $$1.a_($$4);
      if (!this.g($$5) && !$$5.c($$1, $$4, jb.b)) {
         if (this.g($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(ly.aa, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(ly.aa, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(ly.aa, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(ly.aa, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(ly.aa, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(ly.aa, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean g(ebe var1);

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      $$4.a(bxn.b);
      $$4.b(bxn.b, $$0x -> $$0x.a($$0x.dV().al().a(), this.e));
   }

   public static void a(bwt $$0) {
      if (!$$0.bh()) {
         if ($$0.aE() < 0) {
            $$0.h($$0.aE() + 1);
         } else if ($$0 instanceof art) {
            int $$1 = $$0.dV().G_().b(1, 3);
            $$0.h($$0.aE() + $$1);
         }

         if ($$0.aE() >= 0) {
            $$0.e(8.0F);
         }
      }
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<eyn> $$5 = eyn.a((djy)$$1, $$2, jb.a.a);
            if ($$5.isPresent()) {
               $$5.get().a($$1);
               return;
            }
         }

         if (!$$0.a((dka)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(djx $$0) {
      return $$0.aj() == djx.i || $$0.aj() == djx.j;
   }

   @Override
   protected void a(djx $$0, crx $$1, iv $$2, ebe $$3) {
   }

   @Override
   public ebe a(djx $$0, iv $$1, ebe $$2, crx $$3) {
      if (!$$0.A_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(djx $$0, iv $$1, jb $$2) {
      ebe $$3 = $$0.a_($$1);
      return !$$3.l() ? false : a($$0, $$1).a((dka)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(djx $$0, iv $$1, jb $$2) {
      if (!a($$0)) {
         return false;
      } else {
         iv.a $$3 = $$1.k();
         boolean $$4 = false;

         for (jb $$5 : jb.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dne.cy)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            jb.a $$6 = $$2.o().d() ? $$2.i().o() : jb.c.a.b($$0.A);
            return eyn.a((djy)$$0, $$1, $$6).isPresent();
         }
      }
   }
}
