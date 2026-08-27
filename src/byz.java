import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byz extends bzd {
   protected static final int c = 80;
   private static final aec<Boolean> b = aef.a(byz.class, aee.k);
   private static final aec<Integer> e = aef.a(byz.class, aee.b);
   private float bT;
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   @Nullable
   private bjb bY;
   private int bZ;
   private boolean ca;
   @Nullable
   protected bqt d;

   public byz(bip<? extends byz> $$0, cpq $$1) {
      super($$0, $$1);
      this.bJ = 10;
      this.a(eas.j, 0.0F);
      this.bL = new byz.c(this);
      this.bT = this.ag.i();
      this.bU = this.bT;
   }

   @Override
   protected void w() {
      bqk $$0 = new bqk(this, 1.0);
      this.d = new bqt(this, 1.0, 80);
      this.bO.a(4, new byz.a(this));
      this.bO.a(5, $$0);
      this.bO.a(7, this.d);
      this.bO.a(8, new bqe(this, cbp.class, 8.0F));
      this.bO.a(8, new bqe(this, byz.class, 12.0F, 0.01F));
      this.bO.a(9, new bqr(this));
      this.d.a(EnumSet.of(bpw.a.a, bpw.a.b));
      $$0.a(EnumSet.of(bpw.a.a, bpw.a.b));
      this.bP.a(1, new brp<>(this, bjb.class, 10, true, false, new byz.b(this)));
   }

   public static bkg.a ga() {
      return bzd.gg().a(bkh.f, 6.0).a(bkh.d, 0.5).a(bkh.b, 16.0).a(bkh.a, 30.0);
   }

   @Override
   protected bsk b(cpq $$0) {
      return new bsm(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
      this.an.a(e, 0);
   }

   @Override
   public boolean dP() {
      return true;
   }

   @Override
   public bjg eQ() {
      return bjg.e;
   }

   public boolean gb() {
      return this.an.b(b);
   }

   void w(boolean $$0) {
      this.an.b(b, $$0);
   }

   public int q() {
      return 80;
   }

   void b(int $$0) {
      this.an.b(e, $$0);
   }

   public boolean gc() {
      return this.an.b(e) != 0;
   }

   @Nullable
   public bjb gd() {
      if (!this.gc()) {
         return null;
      } else if (this.dK().B) {
         if (this.bY != null) {
            return this.bY;
         } else {
            bil $$0 = this.dK().a(this.an.b(e));
            if ($$0 instanceof bjb) {
               this.bY = (bjb)$$0;
               return this.bY;
            } else {
               return null;
            }
         }
      } else {
         return this.j();
      }
   }

   @Override
   public void a(aec<?> $$0) {
      super.a($$0);
      if (e.equals($$0)) {
         this.bZ = 0;
         this.bY = null;
      }
   }

   @Override
   public int L() {
      return 160;
   }

   @Override
   protected aoy r() {
      return this.ba() ? aoz.kj : aoz.kk;
   }

   @Override
   protected aoy d(bhj $$0) {
      return this.ba() ? aoz.kp : aoz.kq;
   }

   @Override
   protected aoy h_() {
      return this.ba() ? aoz.km : aoz.kn;
   }

   @Override
   protected bil.b aU() {
      return bil.b.c;
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public float a(gw $$0, cpt $$1) {
      return $$1.b_($$0).a(apt.a) ? 10.0F + $$1.v($$0) : super.a($$0, $$1);
   }

   @Override
   public void b_() {
      if (this.bv()) {
         if (this.dK().B) {
            this.bU = this.bT;
            if (!this.aX()) {
               this.bV = 2.0F;
               ehi $$0 = this.dn();
               if ($$0.d > 0.0 && this.ca && !this.aS()) {
                  this.dK().a(this.dp(), this.dr(), this.dv(), this.t(), this.da(), 1.0F, 1.0F, false);
               }

               this.ca = $$0.d < 0.0 && this.dK().a(this.dk().d(), this);
            } else if (this.gb()) {
               if (this.bV < 0.5F) {
                  this.bV = 4.0F;
               } else {
                  this.bV = this.bV + (0.5F - this.bV) * 0.1F;
               }
            } else {
               this.bV = this.bV + (0.125F - this.bV) * 0.2F;
            }

            this.bT = this.bT + this.bV;
            this.bX = this.bW;
            if (!this.ba()) {
               this.bW = this.ag.i();
            } else if (this.gb()) {
               this.bW = this.bW + (0.0F - this.bW) * 0.25F;
            } else {
               this.bW = this.bW + (1.0F - this.bW) * 0.06F;
            }

            if (this.gb() && this.aX()) {
               ehi $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dK().a(ix.e, this.d(0.5) - $$1.c * 1.5, this.ds() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gc()) {
               if (this.bZ < this.q()) {
                  this.bZ++;
               }

               bjb $$3 = this.gd();
               if ($$3 != null) {
                  this.D().a($$3, 90.0F, 90.0F);
                  this.D().a();
                  double $$4 = (double)this.G(0.0F);
                  double $$5 = $$3.dp() - this.dp();
                  double $$6 = $$3.e(0.5) - this.dt();
                  double $$7 = $$3.dv() - this.dv();
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  double $$9 = this.ag.j();

                  while ($$9 < $$8) {
                     $$9 += 1.8 - $$4 + this.ag.j() * (1.7 - $$4);
                     this.dK().a(ix.e, this.dp() + $$5 * $$9, this.dt() + $$6 * $$9, this.dv() + $$7 * $$9, 0.0, 0.0, 0.0);
                  }
               }
            }
         }

         if (this.ba()) {
            this.j(300);
         } else if (this.aA()) {
            this.f(this.dn().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.4F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.4F)));
            this.r(this.ag.i() * 360.0F);
            this.c(false);
            this.au = true;
         }

         if (this.gc()) {
            this.r(this.aW);
         }
      }

      super.b_();
   }

   protected aoy t() {
      return aoz.ko;
   }

   public float E(float $$0) {
      return ars.i($$0, this.bU, this.bT);
   }

   public float F(float $$0) {
      return ars.i($$0, this.bX, this.bW);
   }

   public float G(float $$0) {
      return ((float)this.bZ + $$0) / (float)this.q();
   }

   public float ge() {
      return (float)this.bZ;
   }

   @Override
   public boolean a(cpt $$0) {
      return $$0.f(this);
   }

   public static boolean b(bip<? extends byz> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return ($$4.a(20) == 0 || !$$1.u($$3)) && $$1.ai() != bgq.a && ($$2 == bjf.c || $$1.b_($$3).a(apt.a)) && $$1.b_($$3.d()).a(apt.a);
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (this.dK().B) {
         return false;
      } else {
         if (!this.gb() && !$$0.a(apq.w) && !$$0.a(bhm.L) && $$0.c() instanceof bjb $$2) {
            $$2.a(this.dL().d(this), 2.0F);
         }

         if (this.d != null) {
            this.d.i();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public int W() {
      return 180;
   }

   @Override
   public void h(ehi $$0) {
      if (this.cW() && this.aX()) {
         this.a(0.1F, $$0);
         this.a(bjh.a, this.dn());
         this.f(this.dn().a(0.9));
         if (!this.gb() && this.j() == null) {
            this.f(this.dn().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }

   static class a extends bpw {
      private final byz a;
      private int b;
      private final boolean c;

      public a(byz $$0) {
         this.a = $$0;
         this.c = $$0 instanceof bys;
         this.a(EnumSet.of(bpw.a.a, bpw.a.b));
      }

      @Override
      public boolean a() {
         bjb $$0 = this.a.j();
         return $$0 != null && $$0.bv();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.j() != null && this.a.f((bil)this.a.j()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.H().n();
         bjb $$0 = this.a.j();
         if ($$0 != null) {
            this.a.D().a($$0, 90.0F, 90.0F);
         }

         this.a.au = true;
      }

      @Override
      public void d() {
         this.a.b(0);
         this.a.h(null);
         this.a.d.i();
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         bjb $$0 = this.a.j();
         if ($$0 != null) {
            this.a.H().n();
            this.a.D().a($$0, 90.0F, 90.0F);
            if (!this.a.E($$0)) {
               this.a.h(null);
            } else {
               this.b++;
               if (this.b == 0) {
                  this.a.b($$0.ah());
                  if (!this.a.aS()) {
                     this.a.dK().a(this.a, (byte)21);
                  }
               } else if (this.b >= this.a.q()) {
                  float $$1 = 1.0F;
                  if (this.a.dK().ai() == bgq.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dL().c(this.a, this.a), $$1);
                  $$0.a(this.a.dL().b((bjb)this.a), (float)this.a.b(bkh.f));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<bjb> {
      private final byz a;

      public b(byz $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable bjb $$0) {
         return ($$0 instanceof cbp || $$0 instanceof bvl || $$0 instanceof bvt) && $$0.f(this.a) > 9.0;
      }
   }

   static class c extends boz {
      private final byz l;

      public c(byz $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == boz.a.b && !this.l.H().l()) {
            ehi $$0 = new ehi(this.e - this.l.dp(), this.f - this.l.dr(), this.g - this.l.dv());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(ars.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dA(), $$5, 90.0F));
            this.l.aU = this.l.dA();
            float $$6 = (float)(this.h * this.l.b(bkh.d));
            float $$7 = ars.i(0.125F, this.l.fd(), $$6);
            this.l.w($$7);
            double $$8 = Math.sin((double)(this.l.ah + this.l.ah()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dA() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dA() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ah + this.l.ah()) * 0.75) * 0.05;
            this.l.f(this.l.dn().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            boy $$12 = this.l.D();
            double $$13 = this.l.dp() + $$2 * 2.0;
            double $$14 = this.l.dt() + $$3 / $$1;
            double $$15 = this.l.dv() + $$4 * 2.0;
            double $$16 = $$12.e();
            double $$17 = $$12.f();
            double $$18 = $$12.g();
            if (!$$12.d()) {
               $$16 = $$13;
               $$17 = $$14;
               $$18 = $$15;
            }

            this.l.D().a(ars.d(0.125, $$16, $$13), ars.d(0.125, $$17, $$14), ars.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.w(0.0F);
            this.l.w(false);
         }
      }
   }
}
