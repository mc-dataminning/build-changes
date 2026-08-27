import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class bzs extends bzr {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final aie<Byte> bS = aih.a(bzs.class, aig.a);
   private static final int bT = 1;
   private static final byy bU = byy.b().a(4.0);
   public final bnm d = new bnm();
   public final bnm e = new bnm();
   @Nullable
   private hz bV;

   public bzs(bnw<? extends bzs> $$0, cvr $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aT() {
      return !this.w() && (float)this.ag % 10.0F == 0.0F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bS, (byte)0);
   }

   @Override
   protected float eW() {
      return 0.1F;
   }

   @Override
   public float eX() {
      return super.eX() * 0.95F;
   }

   @Nullable
   @Override
   public atk y() {
      return this.w() && this.af.a(4) != 0 ? null : atl.bD;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.bF;
   }

   @Override
   protected atk n_() {
      return atl.bE;
   }

   @Override
   public boolean bu() {
      return false;
   }

   @Override
   protected void C(bnq $$0) {
   }

   @Override
   protected void M_() {
   }

   public static bpo.a u() {
      return bok.C().a(bpp.n, 6.0);
   }

   public boolean w() {
      return (this.am.b(bS) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.am.b(bS);
      if ($$0) {
         this.am.b(bS, (byte)($$1 | 1));
      } else {
         this.am.b(bS, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.w()) {
         this.g(enz.b);
         this.p(this.dr(), (double)awi.a(this.dt()) + 1.0 - (double)this.dh(), this.dx());
      } else {
         this.g(this.dp().d(1.0, 0.6, 1.0));
      }

      this.gc();
   }

   @Override
   protected void aa() {
      super.aa();
      hz $$0 = this.dm();
      hz $$1 = $$0.c();
      if (this.w()) {
         boolean $$2 = this.aU();
         if (this.dM().a_($$1).g(this.dM(), $$0)) {
            if (this.af.a(200) == 0) {
               this.aW = (float)this.af.a(360);
            }

            if (this.dM().a(bU, this) != null) {
               this.w(false);
               if (!$$2) {
                  this.dM().a(null, 1025, $$0, 0);
               }
            }
         } else {
            this.w(false);
            if (!$$2) {
               this.dM().a(null, 1025, $$0, 0);
            }
         }
      } else {
         if (this.bV != null && (!this.dM().u(this.bV) || this.bV.v() <= this.dM().J_())) {
            this.bV = null;
         }

         if (this.bV == null || this.af.a(30) == 0 || this.bV.a(this.dk(), 2.0)) {
            this.bV = hz.a(
               this.dr() + (double)this.af.a(7) - (double)this.af.a(7),
               this.dt() + (double)this.af.a(6) - 2.0,
               this.dx() + (double)this.af.a(7) - (double)this.af.a(7)
            );
         }

         double $$3 = (double)this.bV.u() + 0.5 - this.dr();
         double $$4 = (double)this.bV.v() + 0.1 - this.dt();
         double $$5 = (double)this.bV.w() + 0.5 - this.dx();
         enz $$6 = this.dp();
         enz $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.g($$7);
         float $$8 = (float)(awi.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = awi.g($$8 - this.dC());
         this.bm = 0.5F;
         this.r(this.dC() + $$9);
         if (this.af.a(100) == 0 && this.dM().a_($$1).g(this.dM(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bnq.b aW() {
      return bnq.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dlj $$2, hz $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B && this.w()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.am.b(bS, $$0.f("BatFlags"));
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.am.b(bS));
   }

   public static boolean b(bnw<bzs> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      if ($$3.v() >= $$1.A_()) {
         return false;
      } else {
         int $$5 = $$1.A($$3);
         int $$6 = 4;
         if (A()) {
            $$6 = 7;
         } else if ($$4.h()) {
            return false;
         }

         return $$5 > $$4.a($$6) ? false : a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private static boolean A() {
      LocalDate $$0 = LocalDate.now();
      int $$1 = $$0.get(ChronoField.DAY_OF_MONTH);
      int $$2 = $$0.get(ChronoField.MONTH_OF_YEAR);
      return $$2 == 10 && $$1 >= 20 || $$2 == 11 && $$1 <= 3;
   }

   private void gc() {
      if (this.w()) {
         this.d.a();
         this.e.b(this.ag);
      } else {
         this.e.a();
         this.d.b(this.ag);
      }
   }
}
