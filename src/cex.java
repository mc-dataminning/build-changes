import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cex extends cew {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final ajv<Byte> bZ = ajz.a(cex.class, ajx.a);
   private static final int ca = 1;
   private static final ced cb = ced.b().a(4.0);
   public final bsl d = new bsl();
   public final bsl e = new bsl();
   @Nullable
   private jd cc;

   public cex(bsw<? extends cex> $$0, dcu $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aW() {
      return !this.t() && (float)this.ai % 10.0F == 0.0F;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   protected float fb() {
      return 0.1F;
   }

   @Override
   public float fc() {
      return super.fc() * 0.95F;
   }

   @Nullable
   @Override
   public avn v() {
      return this.t() && this.ah.a(4) != 0 ? null : avo.bF;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.bH;
   }

   @Override
   protected avn n_() {
      return avo.bG;
   }

   @Override
   public boolean bB() {
      return false;
   }

   @Override
   protected void E(bsq $$0) {
   }

   @Override
   protected void r() {
   }

   public static but.a s() {
      return btn.A().a(buu.s, 6.0);
   }

   public boolean t() {
      return (this.ao.a(bZ) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(bZ);
      if ($$0) {
         this.ao.a(bZ, (byte)($$1 | 1));
      } else {
         this.ao.a(bZ, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.t()) {
         this.i(eww.b);
         this.o(this.dv(), (double)ayn.a(this.dx()) + 1.0 - (double)this.dl(), this.dB());
      } else {
         this.i(this.dt().d(1.0, 0.6, 1.0));
      }

      this.gi();
   }

   @Override
   protected void Z() {
      super.Z();
      jd $$0 = this.dq();
      jd $$1 = $$0.c();
      if (this.t()) {
         boolean $$2 = this.aX();
         if (this.dQ().a_($$1).g(this.dQ(), $$0)) {
            if (this.ah.a(200) == 0) {
               this.ba = (float)this.ah.a(360);
            }

            if (this.dQ().a(cb, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dQ().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dQ().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.cc != null && (!this.dQ().u(this.cc) || this.cc.v() <= this.dQ().I_())) {
            this.cc = null;
         }

         if (this.cc == null || this.ah.a(30) == 0 || this.cc.a(this.do(), 2.0)) {
            this.cc = jd.a(
               this.dv() + (double)this.ah.a(7) - (double)this.ah.a(7),
               this.dx() + (double)this.ah.a(6) - 2.0,
               this.dB() + (double)this.ah.a(7) - (double)this.ah.a(7)
            );
         }

         double $$3 = (double)this.cc.u() + 0.5 - this.dv();
         double $$4 = (double)this.cc.v() + 0.1 - this.dx();
         double $$5 = (double)this.cc.w() + 0.5 - this.dB();
         eww $$6 = this.dt();
         eww $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.i($$7);
         float $$8 = (float)(ayn.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayn.g($$8 - this.dG());
         this.bq = 0.5F;
         this.s(this.dG() + $$9);
         if (this.ah.a(100) == 0 && this.dQ().a_($$1).g(this.dQ(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bsq.b bc() {
      return bsq.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dta $$2, jd $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dQ().B && this.t()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.ao.a(bZ, $$0.f("BatFlags"));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.ao.a(bZ));
   }

   public static boolean b(bsw<cex> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      if ($$3.v() >= $$1.z_()) {
         return false;
      } else {
         int $$5 = $$1.A($$3);
         int $$6 = 4;
         if (x()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         return $$5 > $$4.a($$6) ? false : a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private static boolean x() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void gi() {
      if (this.t()) {
         this.d.a();
         this.e.b(this.ai);
      } else {
         this.e.a();
         this.d.b(this.ai);
      }
   }
}
