import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class bxt extends bxs {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final agm<Byte> bS = agp.a(bxt.class, ago.a);
   private static final int bT = 1;
   private static final bwz bU = bwz.b().a(4.0);
   public final blr d = new blr();
   public final blr e = new blr();
   @Nullable
   private hx bV;

   public bxt(blz<? extends bxt> $$0, ctp $$1) {
      super($$0, $$1);
      if (!$$1.B) {
         this.w(true);
      }
   }

   @Override
   public boolean aT() {
      return !this.w() && (float)this.ah % 10.0F == 0.0F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bS, (byte)0);
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
   public arr y() {
      return this.w() && this.ag.a(4) != 0 ? null : ars.bq;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.bs;
   }

   @Override
   protected arr n_() {
      return ars.br;
   }

   @Override
   public boolean bu() {
      return false;
   }

   @Override
   protected void D(blv $$0) {
   }

   @Override
   protected void M_() {
   }

   public static bnq.a u() {
      return bmn.C().a(bnr.l, 6.0);
   }

   public boolean w() {
      return (this.an.b(bS) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.b(bS);
      if ($$0) {
         this.an.b(bS, (byte)($$1 | 1));
      } else {
         this.an.b(bS, (byte)($$1 & -2));
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.w()) {
         this.g(elt.b);
         this.p(this.dr(), (double)auo.a(this.dt()) + 1.0 - (double)this.dh(), this.dx());
      } else {
         this.g(this.dp().d(1.0, 0.6, 1.0));
      }

      this.ga();
   }

   @Override
   protected void Z() {
      super.Z();
      hx $$0 = this.dm();
      hx $$1 = $$0.c();
      if (this.w()) {
         boolean $$2 = this.aU();
         if (this.dM().a_($$1).g(this.dM(), $$0)) {
            if (this.ag.a(200) == 0) {
               this.aW = (float)this.ag.a(360);
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

         if (this.bV == null || this.ag.a(30) == 0 || this.bV.a(this.dk(), 2.0)) {
            this.bV = hx.a(
               this.dr() + (double)this.ag.a(7) - (double)this.ag.a(7),
               this.dt() + (double)this.ag.a(6) - 2.0,
               this.dx() + (double)this.ag.a(7) - (double)this.ag.a(7)
            );
         }

         double $$3 = (double)this.bV.u() + 0.5 - this.dr();
         double $$4 = (double)this.bV.v() + 0.1 - this.dt();
         double $$5 = (double)this.bV.w() + 0.5 - this.dx();
         elt $$6 = this.dp();
         elt $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.g($$7);
         float $$8 = (float)(auo.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = auo.g($$8 - this.dC());
         this.bm = 0.5F;
         this.r(this.dC() + $$9);
         if (this.ag.a(100) == 0 && this.dM().a_($$1).g(this.dM(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected blv.b aW() {
      return blv.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, djh $$2, hx $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
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
   public void a(sn $$0) {
      super.a($$0);
      this.an.b(bS, $$0.f("BatFlags"));
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.an.b(bS));
   }

   public static boolean b(blz<bxt> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
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

   @Override
   protected float b(bmx $$0, blw $$1) {
      return $$1.b / 2.0F;
   }

   private void ga() {
      if (this.w()) {
         this.d.a();
         this.e.b(this.ah);
      } else {
         this.e.a();
         this.d.b(this.ah);
      }
   }
}
