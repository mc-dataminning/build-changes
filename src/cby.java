import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class cby extends cbx {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final aiy<Byte> bW = ajc.a(cby.class, aja.a);
   private static final int bX = 1;
   private static final cbe bY = cbe.b().a(4.0);
   public final bpq d = new bpq();
   public final bpq e = new bpq();
   @Nullable
   private ib bZ;

   public cby(bqb<? extends cby> $$0, cyx $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aT() {
      return !this.u() && (float)this.ah % 10.0F == 0.0F;
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(bW, (byte)0);
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
   public aul v() {
      return this.u() && this.ag.a(4) != 0 ? null : aum.bF;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.bH;
   }

   @Override
   protected aul o_() {
      return aum.bG;
   }

   @Override
   public boolean bx() {
      return false;
   }

   @Override
   protected void D(bpv $$0) {
   }

   @Override
   protected void q() {
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 6.0);
   }

   public boolean u() {
      return (this.an.a(bW) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.a(bW);
      if ($$0) {
         this.an.a(bW, (byte)($$1 | 1));
      } else {
         this.an.a(bW, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.u()) {
         this.g(esa.b);
         this.p(this.dr(), (double)axk.a(this.dt()) + 1.0 - (double)this.dh(), this.dx());
      } else {
         this.g(this.dp().d(1.0, 0.6, 1.0));
      }

      this.gj();
   }

   @Override
   protected void Y() {
      super.Y();
      ib $$0 = this.dm();
      ib $$1 = $$0.c();
      if (this.u()) {
         boolean $$2 = this.aU();
         if (this.dM().a_($$1).g(this.dM(), $$0)) {
            if (this.ag.a(200) == 0) {
               this.aZ = (float)this.ag.a(360);
            }

            if (this.dM().a(bY, this) != null) {
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
         if (this.bZ != null && (!this.dM().u(this.bZ) || this.bZ.v() <= this.dM().I_())) {
            this.bZ = null;
         }

         if (this.bZ == null || this.ag.a(30) == 0 || this.bZ.a(this.dk(), 2.0)) {
            this.bZ = ib.a(
               this.dr() + (double)this.ag.a(7) - (double)this.ag.a(7),
               this.dt() + (double)this.ag.a(6) - 2.0,
               this.dx() + (double)this.ag.a(7) - (double)this.ag.a(7)
            );
         }

         double $$3 = (double)this.bZ.u() + 0.5 - this.dr();
         double $$4 = (double)this.bZ.v() + 0.1 - this.dt();
         double $$5 = (double)this.bZ.w() + 0.5 - this.dx();
         esa $$6 = this.dp();
         esa $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.g($$7);
         float $$8 = (float)(axk.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = axk.g($$8 - this.dC());
         this.bp = 0.5F;
         this.r(this.dC() + $$9);
         if (this.ag.a(100) == 0 && this.dM().a_($$1).g(this.dM(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bpv.b aZ() {
      return bpv.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, doz $$2, ib $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM().B && this.u()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.an.a(bW, $$0.f("BatFlags"));
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.an.a(bW));
   }

   public static boolean b(bqb<cby> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
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

   private void gj() {
      if (this.u()) {
         this.d.a();
         this.e.b(this.ah);
      } else {
         this.e.a();
         this.d.b(this.ah);
      }
   }
}
