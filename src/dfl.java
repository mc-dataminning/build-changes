import com.mojang.serialization.MapCodec;
import java.util.Optional;

public abstract class dfl extends dfy {
   private static final int c = 8;
   private final float d;
   protected static final float a = 1.0F;
   protected static final ext b = dfy.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   public dfl(dtb.d $$0, float $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dfl> a();

   @Override
   public dtc a(cyd $$0) {
      return a($$0.q(), $$0.a());
   }

   public static dtc a(dcc $$0, jd $$1) {
      jd $$2 = $$1.e();
      dtc $$3 = $$0.a_($$2);
      return dnk.m($$3) ? dga.cs.o() : ((diy)dga.cr).b($$0, $$1);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return b;
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$3.a(24) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avp.iT, avq.e, 1.0F + $$3.i(), $$3.i() * 0.7F + 0.3F, false);
      }

      jd $$4 = $$2.e();
      dtc $$5 = $$1.a_($$4);
      if (!this.f($$5) && !$$5.d($$1, $$4, ji.b)) {
         if (this.f($$1.a_($$2.h()))) {
            for (int $$10 = 0; $$10 < 2; $$10++) {
               double $$11 = (double)$$2.u() + $$3.j() * 0.1F;
               double $$12 = (double)$$2.v() + $$3.j();
               double $$13 = (double)$$2.w() + $$3.j();
               $$1.a(lm.X, $$11, $$12, $$13, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.i()))) {
            for (int $$14 = 0; $$14 < 2; $$14++) {
               double $$15 = (double)($$2.u() + 1) - $$3.j() * 0.1F;
               double $$16 = (double)$$2.v() + $$3.j();
               double $$17 = (double)$$2.w() + $$3.j();
               $$1.a(lm.X, $$15, $$16, $$17, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.f()))) {
            for (int $$18 = 0; $$18 < 2; $$18++) {
               double $$19 = (double)$$2.u() + $$3.j();
               double $$20 = (double)$$2.v() + $$3.j();
               double $$21 = (double)$$2.w() + $$3.j() * 0.1F;
               $$1.a(lm.X, $$19, $$20, $$21, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.g()))) {
            for (int $$22 = 0; $$22 < 2; $$22++) {
               double $$23 = (double)$$2.u() + $$3.j();
               double $$24 = (double)$$2.v() + $$3.j();
               double $$25 = (double)($$2.w() + 1) - $$3.j() * 0.1F;
               $$1.a(lm.X, $$23, $$24, $$25, 0.0, 0.0, 0.0);
            }
         }

         if (this.f($$1.a_($$2.d()))) {
            for (int $$26 = 0; $$26 < 2; $$26++) {
               double $$27 = (double)$$2.u() + $$3.j();
               double $$28 = (double)($$2.v() + 1) - $$3.j() * 0.1F;
               double $$29 = (double)$$2.w() + $$3.j();
               $$1.a(lm.X, $$27, $$28, $$29, 0.0, 0.0, 0.0);
            }
         }
      } else {
         for (int $$6 = 0; $$6 < 3; $$6++) {
            double $$7 = (double)$$2.u() + $$3.j();
            double $$8 = (double)$$2.v() + $$3.j() * 0.5 + 0.5;
            double $$9 = (double)$$2.w() + $$3.j();
            $$1.a(lm.X, $$7, $$8, $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   protected abstract boolean f(dtc var1);

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if (!$$3.be()) {
         $$3.h($$3.aC() + 1);
         if ($$3.aC() == 0) {
            $$3.d(8.0F);
         }
      }

      $$3.a($$1.aj().a(), this.d);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if (a($$1)) {
            Optional<eqc> $$5 = eqc.a($$1, $$2, ji.a.a);
            if ($$5.isPresent()) {
               $$5.get().b();
               return;
            }
         }

         if (!$$0.a((dcz)$$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   private static boolean a(dcw $$0) {
      return $$0.af() == dcw.h || $$0.af() == dcw.i;
   }

   @Override
   protected void a(dcw $$0, cmx $$1, jd $$2, dtc $$3) {
   }

   @Override
   public dtc a(dcw $$0, jd $$1, dtc $$2, cmx $$3) {
      if (!$$0.x_()) {
         $$0.a(null, 1009, $$1, 0);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean a(dcw $$0, jd $$1, ji $$2) {
      dtc $$3 = $$0.a_($$1);
      return !$$3.i() ? false : a($$0, $$1).a((dcz)$$0, $$1) || b($$0, $$1, $$2);
   }

   private static boolean b(dcw $$0, jd $$1, ji $$2) {
      if (!a($$0)) {
         return false;
      } else {
         jd.a $$3 = $$1.k();
         boolean $$4 = false;

         for (ji $$5 : ji.values()) {
            if ($$0.a_($$3.g($$1).c($$5)).a(dga.co)) {
               $$4 = true;
               break;
            }
         }

         if (!$$4) {
            return false;
         } else {
            ji.a $$6 = $$2.o().d() ? $$2.i().o() : ji.c.a.b($$0.z);
            return eqc.a($$0, $$1, $$6).isPresent();
         }
      }
   }
}
