import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dbl extends dby {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final est b = dby.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public dbl(doy.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dbl> a();

   @Override
   public doz a(cuo $$0) {
      return a($$0.q(), $$0.a());
   }

   public static doz a(cyd $$0, ib $$1) {
      ib $$2 = $$1.d();
      doz $$3 = $$0.a_($$2);
      return dji.m($$3) ? dca.cs.n() : ((dey)dca.cr).b($$0, $$1);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aum.iO, aun.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      ib $$4 = $$2.d();
      doz $$5 = $$1.a_($$4);
      if (!this.f($$5) && !$$5.d($$1, $$4, ih.b)) {
         if (this.f($$1.a_($$2.g()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(kl.V, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.h()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(kl.V, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.e()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(kl.V, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.f()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(kl.V, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.c()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(kl.V, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(kl.V, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean f(doz var1);

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, bpv $$3) {
      if (!$$3.bb()) {
         $$3.i($$3.az() + 1);
         if ($$3.az() == 0) {
            $$3.g(8);
         }
      }

      $$3.a($$1.ai().a(), this.d);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<els> $$5 = els.a($$1, $$2, ih.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((cza)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(cyx $$0) {
      return $$0.ae() == cyx.h || $$0.ae() == cyx.i;
   }

   @Override
   protected void a(cyx $$0, cjt $$1, ib $$2, doz $$3) {
   }

   @Override
   public doz a(cyx $$0, ib $$1, doz $$2, cjt $$3) {
      if (!$$0.x_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(cyx $$0, ib $$1, ih $$2) {
      doz $$3 = $$0.a_($$1);
      return !$$3.i() ? false : a($$0, $$1).a((cza)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(cyx $$0, ib $$1, ih $$2) {
      if (!a($$0)) {
         return false;
      } else {
         ib.a $$3 = $$1.j();
         boolean $$4 = false;

         for (ih $$5 : ih.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dca.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            ih.a $$6 = $$2.o().d() ? $$2.i().o() : ih.c.a.b($$0.z);
            return els.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
