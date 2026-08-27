import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cdy extends cdx {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final ajy<Byte> cg = akc.a(cdy.class, aka.a);
   private static final int ch = 1;
   private static final cde ci = cde.b().a(4.0);
   public final brq d = new brq();
   public final brq e = new brq();
   @Nullable
   private ir cj;

   public cdy(bsb<? extends cdy> $$0, dca $$1) {
      super($$0, $$1);
      if (!$$1.C) {
         this.w(true);
      }
   }

   @Override
   public boolean aZ() {
      return !this.t() && (float)this.am % 10.0F == 0.0F;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cg, (byte)0);
   }

   @Override
   protected float fn() {
      return 0.1F;
   }

   @Override
   public float fo() {
      return super.fo() * 0.95F;
   }

   @Nullable
   @Override
   public avn u() {
      return this.t() && this.al.a(4) != 0 ? null : avo.bK;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.bM;
   }

   @Override
   protected avn n_() {
      return avo.bL;
   }

   @Override
   public boolean bF() {
      return false;
   }

   @Override
   protected void D(brv $$0) {
   }

   @Override
   protected void s() {
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 6.0);
   }

   public boolean t() {
      return (this.as.a(cg) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.as.a(cg);
      if ($$0) {
         this.as.a(cg, (byte)($$1 | 1));
      } else {
         this.as.a(cg, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.t()) {
         this.g(ewu.b);
         this.p(this.dz(), (double)aym.a(this.dB()) + 1.0 - (double)this.dp(), this.dF());
      } else {
         this.g(this.dx().d(1.0, 0.6, 1.0));
      }

      this.gu();
   }

   @Override
   protected void Y() {
      super.Y();
      ir $$0 = this.du();
      ir $$1 = $$0.c();
      if (this.t()) {
         boolean $$2 = this.ba();
         if (this.dU().a_($$1).g(this.dU(), $$0)) {
            if (this.al.a(200) == 0) {
               this.bl = (float)this.al.a(360);
            }

            if (this.dU().a(ci, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dU().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dU().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.cj != null && (!this.dU().u(this.cj) || this.cj.v() <= this.dU().J_())) {
            this.cj = null;
         }

         if (this.cj == null || this.al.a(30) == 0 || this.cj.a(this.ds(), 2.0)) {
            this.cj = ir.a(
               this.dz() + (double)this.al.a(7) - (double)this.al.a(7),
               this.dB() + (double)this.al.a(6) - 2.0,
               this.dF() + (double)this.al.a(7) - (double)this.al.a(7)
            );
         }

         double $$3 = (double)this.cj.u() + 0.5 - this.dz();
         double $$4 = (double)this.cj.v() + 0.1 - this.dB();
         double $$5 = (double)this.cj.w() + 0.5 - this.dF();
         ewu $$6 = this.dx();
         ewu $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.g($$7);
         float $$8 = (float)(aym.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = aym.g($$8 - this.dK());
         this.bB = 0.5F;
         this.r(this.dK() + $$9);
         if (this.al.a(100) == 0 && this.dU().a_($$1).g(this.dU(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected brv.c bf() {
      return brv.c.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dtc $$2, ir $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dU().C && this.t()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.as.a(cg, $$0.f("BatFlags"));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.as.a(cg));
   }

   public static boolean b(bsb<? extends cdy> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      if ($$3.v() >= $$1.A_()) {
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

   private void gu() {
      if (this.t()) {
         this.d.a();
         this.e.b(this.am);
      } else {
         this.e.a();
         this.d.b(this.am);
      }
   }
}
