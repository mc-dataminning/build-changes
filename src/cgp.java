import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cgp extends cgo {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final ako<Byte> bX = aks.a(cgp.class, akq.a);
   private static final int bY = 1;
   private static final cfv bZ = cfv.b().a(4.0);
   public final bua d = new bua();
   public final bua e = new bua();
   @Nullable
   private jh ca;

   public cgp(bup<? extends cgp> $$0, dff $$1) {
      super($$0, $$1);
      if (!$$1.C) {
         this.x(true);
      }
   }

   @Override
   public boolean bc() {
      return !this.t() && (float)this.ag % 10.0F == 0.0F;
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bX, (byte)0);
   }

   @Override
   protected float fj() {
      return 0.1F;
   }

   @Override
   public float fk() {
      return super.fk() * 0.95F;
   }

   @Nullable
   @Override
   public awn w() {
      return this.t() && this.af.a(4) != 0 ? null : awo.bF;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.bH;
   }

   @Override
   protected awn o_() {
      return awo.bG;
   }

   @Override
   public boolean bK() {
      return false;
   }

   @Override
   protected void F(bui $$0) {
   }

   @Override
   protected void r() {
   }

   public static bwl.a q() {
      return bvg.E().a(bwm.s, 6.0);
   }

   public boolean t() {
      return (this.am.a(bX) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.a(bX);
      if ($$0) {
         this.am.a(bX, (byte)($$1 | 1));
      } else {
         this.am.a(bX, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.t()) {
         this.h(ezr.c);
         this.o(this.dD(), (double)azn.a(this.dF()) + 1.0 - (double)this.du(), this.dJ());
      } else {
         this.h(this.dB().d(1.0, 0.6, 1.0));
      }

      this.gr();
   }

   @Override
   protected void ac() {
      super.ac();
      jh $$0 = this.dy();
      jh $$1 = $$0.d();
      if (this.t()) {
         boolean $$2 = this.bd();
         if (this.dY().a_($$1).d(this.dY(), $$0)) {
            if (this.af.a(200) == 0) {
               this.aZ = (float)this.af.a(360);
            }

            if (this.dY().a(bZ, this) != null) {
               this.x(false);
               if (!$$2) {
                  this.dY().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.x(false);
            if (!$$2) {
               this.dY().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.ca != null && (!this.dY().u(this.ca) || this.ca.v() <= this.dY().I_())) {
            this.ca = null;
         }

         if (this.ca == null || this.af.a(30) == 0 || this.ca.a(this.dw(), 2.0)) {
            this.ca = jh.a(
               this.dD() + (double)this.af.a(7) - (double)this.af.a(7),
               this.dF() + (double)this.af.a(6) - 2.0,
               this.dJ() + (double)this.af.a(7) - (double)this.af.a(7)
            );
         }

         double $$3 = (double)this.ca.u() + 0.5 - this.dD();
         double $$4 = (double)this.ca.v() + 0.1 - this.dF();
         double $$5 = (double)this.ca.w() + 0.5 - this.dJ();
         ezr $$6 = this.dB();
         ezr $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.d) * 0.1F, (Math.signum($$4) * 0.7F - $$6.e) * 0.1F, (Math.signum($$5) * 0.5 - $$6.f) * 0.1F);
         this.h($$7);
         float $$8 = (float)(azn.d($$7.f, $$7.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = azn.h($$8 - this.dO());
         this.bq = 0.5F;
         this.v(this.dO() + $$9);
         if (this.af.a(100) == 0 && this.dY().a_($$1).d(this.dY(), $$1)) {
            this.x(true);
         }
      }
   }

   @Override
   protected bui.b bi() {
      return bui.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dvo $$2, jh $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dY().C && this.t()) {
            this.x(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.am.a(bX, $$0.f("BatFlags"));
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.am.a(bX));
   }

   public static boolean b(bup<cgp> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      if ($$3.v() >= $$1.a(ebj.a.b, $$3).v()) {
         return false;
      } else {
         int $$5 = $$1.A($$3);
         int $$6 = 4;
         if (y()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         if ($$5 > $$4.a($$6)) {
            return false;
         } else {
            return !$$1.a_($$3.e()).a(axd.ci) ? false : a($$0, $$1, $$2, $$3, $$4);
         }
      }
   }

   private static boolean y() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void gr() {
      if (this.t()) {
         this.d.a();
         this.e.b(this.ag);
      } else {
         this.e.a();
         this.d.b(this.ag);
      }
   }
}
