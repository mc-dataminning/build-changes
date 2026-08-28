import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class chr extends chq {
   public static final float a = 0.5F;
   public static final float b = 10.0F;
   private static final alc<Byte> bY = alg.a(chr.class, ale.a);
   private static final int bZ = 1;
   private static final cgx ca = cgx.b().a(4.0);
   public final bvc c = new bvc();
   public final bvc d = new bvc();
   @Nullable
   private jh cb;

   public chr(bvr<? extends chr> $$0, dhi $$1) {
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
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bY, (byte)0);
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
   public axe u() {
      return this.p() && this.ae.a(4) != 0 ? null : axf.bF;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.bH;
   }

   @Override
   protected axe o_() {
      return axf.bG;
   }

   @Override
   public boolean bI() {
      return false;
   }

   @Override
   protected void D(bvk $$0) {
   }

   @Override
   protected void o() {
   }

   public static bxn.a m() {
      return bwi.C().a(bxo.s, 6.0);
   }

   public boolean p() {
      return (this.al.a(bY) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(bY);
      if ($$0) {
         this.al.a(bY, (byte)($$1 | 1));
      } else {
         this.al.a(bY, (byte)($$1 & -2));
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.p()) {
         this.h(fby.c);
         this.o(this.dB(), (double)bae.a(this.dD()) + 1.0 - (double)this.ds(), this.dH());
      } else {
         this.h(this.dz().d(1.0, 0.6, 1.0));
      }

      this.x();
   }

   @Override
   protected void a(ash $$0) {
      super.a($$0);
      jh $$1 = this.dw();
      jh $$2 = $$1.d();
      if (this.p()) {
         boolean $$3 = this.bb();
         if ($$0.a_($$2).d($$0, $$1)) {
            if (this.ae.a(200) == 0) {
               this.aZ = (float)this.ae.a(360);
            }

            if ($$0.a(ca, this) != null) {
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
         if (this.cb != null && (!$$0.u(this.cb) || this.cb.v() <= $$0.L_())) {
            this.cb = null;
         }

         if (this.cb == null || this.ae.a(30) == 0 || this.cb.a(this.du(), 2.0)) {
            this.cb = jh.a(
               this.dB() + (double)this.ae.a(7) - (double)this.ae.a(7),
               this.dD() + (double)this.ae.a(6) - 2.0,
               this.dH() + (double)this.ae.a(7) - (double)this.ae.a(7)
            );
         }

         double $$4 = (double)this.cb.u() + 0.5 - this.dB();
         double $$5 = (double)this.cb.v() + 0.1 - this.dD();
         double $$6 = (double)this.cb.w() + 0.5 - this.dH();
         fby $$7 = this.dz();
         fby $$8 = $$7.b((Math.signum($$4) * 0.5 - $$7.d) * 0.1F, (Math.signum($$5) * 0.7F - $$7.e) * 0.1F, (Math.signum($$6) * 0.5 - $$7.f) * 0.1F);
         this.h($$8);
         float $$9 = (float)(bae.d($$8.f, $$8.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$10 = bae.h($$9 - this.dM());
         this.bq = 0.5F;
         this.v(this.dM() + $$10);
         if (this.ae.a(100) == 0 && $$0.a_($$2).d($$0, $$2)) {
            this.x(true);
         }
      }
   }

   @Override
   protected bvk.c bg() {
      return bvk.c.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dxv $$2, jh $$3) {
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
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
   public void a(ux $$0) {
      super.a($$0);
      this.al.a(bY, $$0.f("BatFlags"));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.al.a(bY));
   }

   public static boolean b(bvr<chr> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      if ($$3.v() >= $$1.a(edq.a.b, $$3).v()) {
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
            return !$$1.a_($$3.e()).a(axu.cj) ? false : a($$0, $$1, $$2, $$3, $$4);
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
