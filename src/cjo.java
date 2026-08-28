import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cjo extends cjn {
   public static final float a = 0.5F;
   public static final float b = 10.0F;
   private static final aku<Byte> e = aky.a(cjo.class, akw.a);
   private static final int f = 1;
   private static final ciu bH = ciu.b().a(4.0);
   private static final byte bI = 0;
   public final bwv c = new bwv();
   public final bwv d = new bwv();
   @Nullable
   private iw bJ;

   public cjo(bxn<? extends cjo> $$0, dkj $$1) {
      super($$0, $$1);
      if (!$$1.C) {
         this.w(true);
      }
   }

   @Override
   public boolean aZ() {
      return !this.p() && (float)this.af % 10.0F == 0.0F;
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(e, (byte)0);
   }

   @Override
   protected float fe() {
      return 0.1F;
   }

   @Override
   public float ff() {
      return super.ff() * 0.95F;
   }

   @Nullable
   @Override
   public awx s() {
      return this.p() && this.ae.a(4) != 0 ? null : awy.bF;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.bH;
   }

   @Override
   protected awx j_() {
      return awy.bG;
   }

   @Override
   public boolean bG() {
      return false;
   }

   @Override
   protected void D(bxe $$0) {
   }

   @Override
   protected void n() {
   }

   public static bzk.a m() {
      return byh.D().a(bzl.s, 6.0);
   }

   public boolean p() {
      return (this.al.a(e) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(e);
      if ($$0) {
         this.al.a(e, (byte)($$1 | 1));
      } else {
         this.al.a(e, (byte)($$1 & -2));
      }
   }

   @Override
   public void g() {
      super.g();
      if (this.p()) {
         this.i(fgc.c);
         this.o(this.dA(), (double)azz.a(this.dC()) + 1.0 - (double)this.dr(), this.dG());
      } else {
         this.i(this.dy().d(1.0, 0.6, 1.0));
      }

      this.gq();
   }

   @Override
   protected void a(asb $$0) {
      super.a($$0);
      iw $$1 = this.dv();
      iw $$2 = $$1.d();
      if (this.p()) {
         boolean $$3 = this.ba();
         if ($$0.a_($$2).d($$0, $$1)) {
            if (this.ae.a(200) == 0) {
               this.aX = (float)this.ae.a(360);
            }

            if ($$0.a(bH, this) != null) {
               this.w(false);
               if (!$$3) {
                  $$0.a(null, 1025, $$1, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$3) {
               $$0.a(null, 1025, $$1, 0);
            }
         }
      } else {
         if (this.bJ != null && (!$$0.v(this.bJ) || this.bJ.v() <= $$0.K_())) {
            this.bJ = null;
         }

         if (this.bJ == null || this.ae.a(30) == 0 || this.bJ.a(this.dt(), 2.0)) {
            this.bJ = iw.a(
               this.dA() + (double)this.ae.a(7) - (double)this.ae.a(7),
               this.dC() + (double)this.ae.a(6) - 2.0,
               this.dG() + (double)this.ae.a(7) - (double)this.ae.a(7)
            );
         }

         double $$4 = (double)this.bJ.u() + 0.5 - this.dA();
         double $$5 = (double)this.bJ.v() + 0.1 - this.dC();
         double $$6 = (double)this.bJ.w() + 0.5 - this.dG();
         fgc $$7 = this.dy();
         fgc $$8 = $$7.b((Math.signum($$4) * 0.5 - $$7.d) * 0.1F, (Math.signum($$5) * 0.7F - $$7.e) * 0.1F, (Math.signum($$6) * 0.5 - $$7.f) * 0.1F);
         this.i($$8);
         float $$9 = (float)(azz.d($$8.f, $$8.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$10 = azz.h($$9 - this.dL());
         this.bi = 0.5F;
         this.w(this.dL() + $$10);
         if (this.ae.a(100) == 0 && $$0.a_($$2).d($$0, $$2)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bxe.c bf() {
      return bxe.c.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, ebq $$2, iw $$3) {
   }

   @Override
   public boolean n_() {
      return true;
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (this.p()) {
            this.w(false);
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.al.a(e, $$0.b("BatFlags", (byte)0));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.al.a(e).byteValue());
   }

   public static boolean b(bxn<cjo> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      if ($$3.v() >= $$1.a(ehp.a.b, $$3).v()) {
         return false;
      } else {
         int $$5 = $$1.B($$3);
         int $$6 = 4;
         if (u()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         if ($$5 > $$4.a($$6)) {
            return false;
         } else {
            return !$$1.a_($$3.e()).a(axn.cl) ? false : a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   private static boolean u() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void gq() {
      if (this.p()) {
         this.c.a();
         this.d.b(this.af);
      } else {
         this.d.a();
         this.c.b(this.af);
      }
   }
}
