import java.util.Optional;
import javax.annotation.Nullable;

public abstract class epb extends eow {
   public static final float e = 0.44444445F;

   @Override
   public eox d() {
      return eoz.d;
   }

   @Override
   public eox e() {
      return eoz.e;
   }

   @Override
   public cuj a() {
      return cur.qA;
   }

   @Override
   public void a(dcu $$0, jd $$1, eoy $$2, ayv $$3) {
      jd $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lm.Y, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, avo.nR, avp.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), avo.nP, avp.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(dcu $$0, jd $$1, eoy $$2, ayv $$3) {
      if ($$0.ab().b(dcq.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            jd $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dta $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((dcx)$$0, $$5)) {
                     $$0.b($$5, dfj.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               jd $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), dfj.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dcx $$0, jd $$1) {
      for (ji $$2 : ji.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dcx $$0, jd $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.am() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public lk h() {
      return lm.i;
   }

   @Override
   protected void a(dcv $$0, jd $$1, dta $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dcx $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dta b(eoy $$0) {
      return dfy.H.o().a(dkm.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eox $$0) {
      return $$0 == eoz.e || $$0 == eoz.d;
   }

   @Override
   public int c(dcx $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eoy $$0, dca $$1, jd $$2, eox $$3, ji $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awj.a);
   }

   @Override
   public int a(dcx $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(dcu $$0, jd $$1, eoy $$2, eoy $$3) {
      int $$4 = this.a((dcx)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((dca)$$0, $$1) > $$2.a((dca)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dcv $$0, jd $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(dcu $$0) {
      return $$0.ab().b(dcq.V);
   }

   @Override
   protected void a(dcv $$0, jd $$1, dta $$2, ji $$3, eoy $$4) {
      if ($$3 == ji.a) {
         eoy $$5 = $$0.b_($$1);
         if (this.a(awj.b) && $$5.a(awj.a)) {
            if ($$2.b() instanceof dkm) {
               $$0.a($$1, dfy.b.o(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avn> j() {
      return Optional.of(avo.dl);
   }

   public static class a extends epb {
      @Override
      protected void a(dtb.a<eox, eoy> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eoy $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eoy $$0) {
         return false;
      }
   }

   public static class b extends epb {
      @Override
      public int d(eoy $$0) {
         return 8;
      }

      @Override
      public boolean c(eoy $$0) {
         return true;
      }
   }
}
