import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cco extends ccn {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final ajk<Byte> bX = ajo.a(cco.class, ajm.a);
   private static final int bY = 1;
   private static final cbu bZ = cbu.b().a(4.0);
   public final bqg d = new bqg();
   public final bqg e = new bqg();
   @Nullable
   private im ca;

   public cco(bqr<? extends cco> $$0, czu $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aT() {
      return !this.u() && (float)this.ai % 10.0F == 0.0F;
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(bX, (byte)0);
   }

   @Override
   protected float fc() {
      return 0.1F;
   }

   @Override
   public float fd() {
      return super.fd() * 0.95F;
   }

   @Nullable
   @Override
   public auy v() {
      return this.u() && this.ah.a(4) != 0 ? null : auz.bF;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.bH;
   }

   @Override
   protected auy o_() {
      return auz.bG;
   }

   @Override
   public boolean by() {
      return false;
   }

   @Override
   protected void D(bql $$0) {
   }

   @Override
   protected void q() {
   }

   public static bsk.a r() {
      return brg.A().a(bsl.q, 6.0);
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
         this.g(etf.b);
         this.p(this.ds(), (double)axw.a(this.du()) + 1.0 - (double)this.di(), this.dy());
      } else {
         this.g(this.dq().d(1.0, 0.6, 1.0));
      }

      this.gl();
   }

   @Override
   protected void Y() {
      super.Y();
      im $$0 = this.dn();
      im $$1 = $$0.c();
      if (this.u()) {
         boolean $$2 = this.aU();
         if (this.dN().a_($$1).g(this.dN(), $$0)) {
            if (this.ah.a(200) == 0) {
               this.bb = (float)this.ah.a(360);
            }

            if (this.dN().a(bZ, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dN().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dN().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.ca != null && (!this.dN().u(this.ca) || this.ca.v() <= this.dN().I_())) {
            this.ca = null;
         }

         if (this.ca == null || this.ah.a(30) == 0 || this.ca.a(this.dl(), 2.0)) {
            this.ca = im.a(
               this.ds() + (double)this.ah.a(7) - (double)this.ah.a(7),
               this.du() + (double)this.ah.a(6) - 2.0,
               this.dy() + (double)this.ah.a(7) - (double)this.ah.a(7)
            );
         }

         double $$3 = (double)this.ca.u() + 0.5 - this.ds();
         double $$4 = (double)this.ca.v() + 0.1 - this.du();
         double $$5 = (double)this.ca.w() + 0.5 - this.dy();
         etf $$6 = this.dq();
         etf $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.g($$7);
         float $$8 = (float)(axw.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = axw.g($$8 - this.dD());
         this.br = 0.5F;
         this.r(this.dD() + $$9);
         if (this.ah.a(100) == 0 && this.dN().a_($$1).g(this.dN(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bql.b aZ() {
      return bql.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dpy $$2, im $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dN().B && this.u()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      this.ao.a(bX, $$0.f("BatFlags"));
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.ao.a(bX));
   }

   public static boolean b(bqr<cco> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
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
