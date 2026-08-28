import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cgr extends cgq {
   public static final float a = 0.5F;
   public static final float b = 10.0F;
   private static final ajx<Byte> bX = akb.a(cgr.class, ajz.a);
   private static final int bY = 1;
   private static final cfx bZ = cfx.b().a(4.0);
   public final buc c = new buc();
   public final buc d = new buc();
   @Nullable
   private ji ca;

   public cgr(bur<? extends cgr> $$0, dgi $$1) {
      super($$0, $$1);
      if (!$$1.C) {
         this.x(true);
      }
   }

   @Override
   public boolean ba() {
      return !this.p() && (float)this.af % 10.0F == 0.0F;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bX, (byte)0);
   }

   @Override
   protected float fg() {
      return 0.1F;
   }

   @Override
   public float fh() {
      return super.fh() * 0.95F;
   }

   @Nullable
   @Override
   public avz u() {
      return this.p() && this.ae.a(4) != 0 ? null : awa.bF;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.bH;
   }

   @Override
   protected avz o_() {
      return awa.bG;
   }

   @Override
   public boolean bI() {
      return false;
   }

   @Override
   protected void D(buk $$0) {
   }

   @Override
   protected void o() {
   }

   public static bwn.a m() {
      return bvi.C().a(bwo.s, 6.0);
   }

   public boolean p() {
      return (this.al.a(bX) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(bX);
      if ($$0) {
         this.al.a(bX, (byte)($$1 | 1));
      } else {
         this.al.a(bX, (byte)($$1 & -2));
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.p()) {
         this.h(fba.c);
         this.o(this.dB(), (double)ayz.a(this.dD()) + 1.0 - (double)this.ds(), this.dH());
      } else {
         this.h(this.dz().d(1.0, 0.6, 1.0));
      }

      this.x();
   }

   @Override
   protected void a(arc $$0) {
      super.a($$0);
      ji $$1 = this.dw();
      ji $$2 = $$1.d();
      if (this.p()) {
         boolean $$3 = this.bb();
         if ($$0.a_($$2).d($$0, $$1)) {
            if (this.ae.a(200) == 0) {
               this.aZ = (float)this.ae.a(360);
            }

            if ($$0.a(bZ, this) != null) {
               this.x(false);
               if (!$$3) {
                  $$0.a(null, 1025, $$1, 0);
               }
            }
         } else {
            this.x(false);
            if (!$$3) {
               $$0.a(null, 1025, $$1, 0);
            }
         }
      } else {
         if (this.ca != null && (!$$0.u(this.ca) || this.ca.v() <= $$0.L_())) {
            this.ca = null;
         }

         if (this.ca == null || this.ae.a(30) == 0 || this.ca.a(this.du(), 2.0)) {
            this.ca = ji.a(
               this.dB() + (double)this.ae.a(7) - (double)this.ae.a(7),
               this.dD() + (double)this.ae.a(6) - 2.0,
               this.dH() + (double)this.ae.a(7) - (double)this.ae.a(7)
            );
         }

         double $$4 = (double)this.ca.u() + 0.5 - this.dB();
         double $$5 = (double)this.ca.v() + 0.1 - this.dD();
         double $$6 = (double)this.ca.w() + 0.5 - this.dH();
         fba $$7 = this.dz();
         fba $$8 = $$7.b((Math.signum($$4) * 0.5 - $$7.d) * 0.1F, (Math.signum($$5) * 0.7F - $$7.e) * 0.1F, (Math.signum($$6) * 0.5 - $$7.f) * 0.1F);
         this.h($$8);
         float $$9 = (float)(ayz.d($$8.f, $$8.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$10 = ayz.h($$9 - this.dM());
         this.bp = 0.5F;
         this.v(this.dM() + $$10);
         if (this.ae.a(100) == 0 && $$0.a_($$2).d($$0, $$2)) {
            this.x(true);
         }
      }
   }

   @Override
   protected buk.c bg() {
      return buk.c.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dwx $$2, ji $$3) {
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public boolean a(arc $$0, bta $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (this.p()) {
            this.x(false);
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.al.a(bX, $$0.f("BatFlags"));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.al.a(bX));
   }

   public static boolean b(bur<cgr> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      if ($$3.v() >= $$1.a(ecs.a.b, $$3).v()) {
         return false;
      } else {
         int $$5 = $$1.A($$3);
         int $$6 = 4;
         if (t()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         if ($$5 > $$4.a($$6)) {
            return false;
         } else {
            return !$$1.a_($$3.e()).a(awp.cj) ? false : a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   private static boolean t() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void x() {
      if (this.p()) {
         this.c.a();
         this.d.b(this.af);
      } else {
         this.d.a();
         this.c.b(this.af);
      }
   }
}
