import java.time.LocalDate;
import java.time.temporal.ChronoField;
import javax.annotation.Nullable;

public class bwr extends bwq {
   public static final float b = 0.5F;
   public static final float c = 10.0F;
   private static final afs<Byte> bS = afv.a(bwr.class, afu.a);
   private static final int bT = 1;
   private static final bvx bU = bvx.b().a(4.0);
   public final bkr d = new bkr();
   public final bkr e = new bkr();
   @Nullable
   private hx bV;

   public bwr(bkz<? extends bwr> $$0, csf $$1) {
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
   protected float eX() {
      return 0.1F;
   }

   @Override
   public float eY() {
      return super.eY() * 0.95F;
   }

   @Nullable
   @Override
   public aqu y() {
      return this.w() && this.ag.a(4) != 0 ? null : aqv.bq;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.bs;
   }

   @Override
   protected aqu n_() {
      return aqv.br;
   }

   @Override
   public boolean bu() {
      return false;
   }

   @Override
   protected void D(bkv $$0) {
   }

   @Override
   protected void M_() {
   }

   public static bmq.a u() {
      return bln.C().a(bmr.l, 6.0);
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
         this.g(ejz.b);
         this.p(this.ds(), (double)atq.a(this.du()) + 1.0 - (double)this.di(), this.dy());
      } else {
         this.g(this.dq().d(1.0, 0.6, 1.0));
      }

      this.gb();
   }

   @Override
   protected void Z() {
      super.Z();
      hx $$0 = this.dn();
      hx $$1 = $$0.c();
      if (this.w()) {
         boolean $$2 = this.aU();
         if (this.dN().a_($$1).g(this.dN(), $$0)) {
            if (this.ag.a(200) == 0) {
               this.aW = (float)this.ag.a(360);
            }

            if (this.dN().a(bU, this) != null) {
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
         if (this.bV != null && (!this.dN().t(this.bV) || this.bV.v() <= this.dN().J_())) {
            this.bV = null;
         }

         if (this.bV == null || this.ag.a(30) == 0 || this.bV.a(this.dl(), 2.0)) {
            this.bV = hx.a(
               this.ds() + (double)this.ag.a(7) - (double)this.ag.a(7),
               this.du() + (double)this.ag.a(6) - 2.0,
               this.dy() + (double)this.ag.a(7) - (double)this.ag.a(7)
            );
         }

         double $$3 = (double)this.bV.u() + 0.5 - this.ds();
         double $$4 = (double)this.bV.v() + 0.1 - this.du();
         double $$5 = (double)this.bV.w() + 0.5 - this.dy();
         ejz $$6 = this.dq();
         ejz $$7 = $$6.b((Math.signum($$3) * 0.5 - $$6.c) * 0.1F, (Math.signum($$4) * 0.7F - $$6.d) * 0.1F, (Math.signum($$5) * 0.5 - $$6.e) * 0.1F);
         this.g($$7);
         float $$8 = (float)(atq.d($$7.e, $$7.c) * 180.0F / (float)Math.PI) - 90.0F;
         float $$9 = atq.g($$8 - this.dD());
         this.bm = 0.5F;
         this.r(this.dD() + $$9);
         if (this.ag.a(100) == 0 && this.dN().a_($$1).g(this.dN(), $$1)) {
            this.w(true);
         }
      }
   }

   @Override
   protected bkv.b aW() {
      return bkv.b.c;
   }

   @Override
   protected void a(double $$0, boolean $$1, dhn $$2, hx $$3) {
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dN().B && this.w()) {
            this.w(false);
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.an.b(bS, $$0.f("BatFlags"));
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("BatFlags", this.an.b(bS));
   }

   public static boolean b(bkz<bwr> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      if ($$3.v() >= $$1.A_()) {
         return false;
      } else {
         int $$5 = $$1.z($$3);
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
   protected float b(blx $$0, bkw $$1) {
      return $$1.b / 2.0F;
   }

   private void gb() {
      if (this.w()) {
         this.d.a();
         this.e.b(this.ah);
      } else {
         this.e.a();
         this.d.b(this.ah);
      }
   }
}
