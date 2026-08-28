import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dgz extends dhm {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final ezq b = dhm.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public dgz(dur.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dgz> a();

   @Override
   public dus a(czn $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dus a(ddo $$0, jf $$1) {
      jf $$2 = $$1.e();
      dus $$3 = $$0.a_($$2);
      return doy.o($$3) ? dho.cs.n() : ((dkm)dho.cr).b($$0, $$1);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awg.iU, awh.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      jf $$4 = $$2.e();
      dus $$5 = $$1.a_($$4);
      if (!this.g($$5) && !$$5.c($$1, $$4, jk.b)) {
         if (this.g($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(lo.X, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(lo.X, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(lo.X, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(lo.X, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.g($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(lo.X, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(lo.X, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean g(dus var1);

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
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
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<ert> $$5 = ert.a($$1, $$2, jk.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((dem)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(dej $$0) {
      return $$0.ag() == dej.h || $$0.ag() == dej.i;
   }

   @Override
   protected void a(dej $$0, cnx $$1, jf $$2, dus $$3) {
   }

   @Override
   public dus a(dej $$0, jf $$1, dus $$2, cnx $$3) {
      if (!$$0.x_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(dej $$0, jf $$1, jk $$2) {
      dus $$3 = $$0.a_($$1);
      return !$$3.l() ? false : a($$0, $$1).a((dem)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(dej $$0, jf $$1, jk $$2) {
      if (!a($$0)) {
         return false;
      } else {
         jf.a $$3 = $$1.k();
         boolean $$4 = false;

         for (jk $$5 : jk.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dho.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            jk.a $$6 = $$2.o().d() ? $$2.i().o() : jk.c.a.b($$0.z);
            return ert.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
