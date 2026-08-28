import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cgg extends cgf {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final akk<Byte> bX = ako.a(cgg.class, akm.a);
   private static final int bY = 1;
   private static final cfm bZ = cfm.b().a(4.0);
   public final btr d = new btr();
   public final btr e = new btr();
   @Nullable
   private jg ca;

   public cgg(bug<? extends cgg> $$0, dev $$1) {
      super($$0, $$1);
      if (!$$1.C) {
         this.x(true);
      }
   }

   @Override
   public boolean bb() {
      return !this.t() && (float)this.ag % 10.0F == 0.0F;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bX, (byte)0);
   }

   @Override
   protected float fi() {
      return 0.1F;
   }

   @Override
   public float fj() {
      return super.fj() * 0.95F;
   }

   @Nullable
   @Override
   public awj w() {
      return this.t() && this.af.a(4) != 0 ? null : awk.bF;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.bH;
   }

   @Override
   protected awj o_() {
      return awk.bG;
   }

   @Override
   public boolean bJ() {
      return false;
   }

   @Override
   protected void F(btz $$0) {
   }

   @Override
   protected void r() {
   }

   public static bwc.a q() {
      return bux.E().a(bwd.s, 6.0);
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
         this.h(ezh.c);
         this.o(this.dC(), (double)azj.a(this.dE()) + 1.0 - (double)this.dt(), this.dI());
      } else {
         this.h(this.dA().d(1.0, 0.6, 1.0));
      }

      this.gr();
   }

   @Override
   protected void ac() {
      super.ac();
      jg $$0 = this.dx();
      jg $$1 = $$0.d();
      if (this.t()) {
         boolean $$2 = this.bc();
         if (this.dX().a_($$1).d(this.dX(), $$0)) {
            if (this.af.a(200) == 0) {
               this.aW = (float)this.af.a(360);
            }

            if (this.dX().a(bZ, this) != null) {
               this.x(false);
               if (!$$2) {
                  this.dX().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.x(false);
            if (!$$2) {
               this.dX().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.ca != null && (!this.dX().u(this.ca) || this.ca.v() <= this.dX().I_())) {
            this.ca = null;
         }

         if (this.ca == null || this.af.a(30) == 0 || this.ca.a(this.dv(), 2.0)) {
            this.ca = jg.a(
               this.dC() + (double)this.af.a(7) - (double)this.af.a(7),
               this.dE() + (double)this.af.a(6) - 2.0,
               this.dI() + (double)this.af.a(7) - (double)this.af.a(7)
            );
         }

         double $$3 = (double)this.ca.u() + 0.5 - this.dC();
         double $$4 = (double)this.ca.v() + 0.1 - this.dE();
         double $$5 = (double)this.ca.w() + 0.5 - this.dI();
         ezh $$6 = this.dA();
         ezh $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.d) * 0.1F, (Math.signum($$4) * 0.7F - $$6.e) * 0.1F, (Math.signum($$5) * 0.5 - $$6.f) * 0.1F);
         this.h($$7);
         float $$8 = (float)(azj.d($$7.f, $$7.d) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = azj.h($$8 - this.dN());
         this.bn = 0.5F;
         this.v(this.dN() + $$9);
         if (this.af.a(100) == 0 && this.dX().a_($$1).d(this.dX(), $$1)) {
            this.x(true);
         }
      }
   }

   @Override
   protected btz.b bh() {
      return btz.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dvd $$2, jg $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dX().C && this.t()) {
            this.x(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.am.a(bX, $$0.f("BatFlags"));
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.am.a(bX));
   }

   public static boolean b(bug<cgg> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      if ($$3.v() >= $$1.a(eaz.a.b, $$3).v()) {
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
            return !$$1.a_($$3.e()).a(awz.ci) ? false : a($$0, $$1, $$2, $$3, $$4);
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
