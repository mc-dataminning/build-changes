import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cdz extends cdy {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final ajr<Byte> bX = ajv.a(cdz.class, ajt.a);
   private static final int bY = 1;
   private static final cdf bZ = cdf.b().a(4.0);
   public final brp d = new brp();
   public final brp e = new brp();
   @Nullable
   private io ca;

   public cdz(bsa<? extends cdz> $$0, dax $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aV() {
      return !this.u() && (float)this.ai % 10.0F == 0.0F;
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(bX, (byte)0);
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
   public avg v() {
      return this.u() && this.ah.a(4) != 0 ? null : avh.bF;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.bH;
   }

   @Override
   protected avg o_() {
      return avh.bG;
   }

   @Override
   public boolean bA() {
      return false;
   }

   @Override
   protected void D(bru $$0) {
   }

   @Override
   protected void q() {
   }

   public static btv.a s() {
      return bsq.A().a(btw.q, 6.0);
   }

   public boolean u() {
      return (this.ao.a(bX) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(bX);
      if ($$0) {
         this.ao.a(bX, (byte)($$1 | 1));
      } else {
         this.ao.a(bX, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.u()) {
         this.g(euk.b);
         this.p(this.du(), (double)ayd.a(this.dw()) + 1.0 - (double)this.dk(), this.dA());
      } else {
         this.g(this.ds().d(1.0, 0.6, 1.0));
      }

      this.gl();
   }

   @Override
   protected void Y() {
      super.Y();
      io $$0 = this.dp();
      io $$1 = $$0.c();
      if (this.u()) {
         boolean $$2 = this.aW();
         if (this.dP().a_($$1).g(this.dP(), $$0)) {
            if (this.ah.a(200) == 0) {
               this.bb = (float)this.ah.a(360);
            }

            if (this.dP().a(bZ, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dP().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dP().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.ca != null && (!this.dP().u(this.ca) || this.ca.v() <= this.dP().I_())) {
            this.ca = null;
         }

         if (this.ca == null || this.ah.a(30) == 0 || this.ca.a(this.dn(), 2.0)) {
            this.ca = io.a(
               this.du() + (double)this.ah.a(7) - (double)this.ah.a(7),
               this.dw() + (double)this.ah.a(6) - 2.0,
               this.dA() + (double)this.ah.a(7) - (double)this.ah.a(7)
            );
         }

         double $$3 = (double)this.ca.u() + 0.5 - this.du();
         double $$4 = (double)this.ca.v() + 0.1 - this.dw();
         double $$5 = (double)this.ca.w() + 0.5 - this.dA();
         euk $$6 = this.ds();
         euk $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.g($$7);
         float $$8 = (float)(ayd.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = ayd.g($$8 - this.dF());
         this.br = 0.5F;
         this.r(this.dF() + $$9);
         if (this.ah.a(100) == 0 && this.dP().a_($$1).g(this.dP(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bru.b bb() {
      return bru.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, drb $$2, io $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dP().B && this.u()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.ao.a(bX, $$0.f("BatFlags"));
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.ao.a(bX));
   }

   public static boolean b(bsa<cdz> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      if ($$3.v() >= $$1.z_()) {
         return false;
      } else {
         int $$5 = $$1.A($$3);
         int $$6 = 4;
         if (y()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         return $$5 > $$4.a($$6) ? false : a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private static boolean y() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void gl() {
      if (this.u()) {
         this.d.a();
         this.e.b(this.ai);
      } else {
         this.e.a();
         this.d.b(this.ai);
      }
   }
}
