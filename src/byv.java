import java.util.EnumSet;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byv extends byz {
   protected static final int c = 80;
   private static final adx<Boolean> b = aea.a(byv.class, adz.k);
   private static final adx<Integer> e = aea.a(byv.class, adz.b);
   private float bT;
   private float bU;
   private float bV;
   private float bW;
   private float bX;
   @Nullable
   private biw bY;
   private int bZ;
   private boolean ca;
   @Nullable
   protected bqp d;

   public byv(bik<? extends byv> $$0, cpk $$1) {
      super($$0, $$1);
      this.bJ = 10;
      this.a(eam.j, 0.0F);
      this.bL = new byv.c(this);
      this.bT = this.ag.i();
      this.bU = this.bT;
   }

   @Override
   protected void w() {
      bqg $$0 = new bqg(this, 1.0);
      this.d = new bqp(this, 1.0, 80);
      this.bO.a(4, new byv.a(this));
      this.bO.a(5, $$0);
      this.bO.a(7, this.d);
      this.bO.a(8, new bqa(this, cbl.class, 8.0F));
      this.bO.a(8, new bqa(this, byv.class, 12.0F, 0.01F));
      this.bO.a(9, new bqn(this));
      this.d.a(EnumSet.of(bps.a.a, bps.a.b));
      $$0.a(EnumSet.of(bps.a.a, bps.a.b));
      this.bP.a(1, new brl<>(this, biw.class, 10, true, false, new byv.b(this)));
   }

   public static bkc.a fZ() {
      return byz.gf().a(bkd.f, 6.0).a(bkd.d, 0.5).a(bkd.b, 16.0).a(bkd.a, 30.0);
   }

   @Override
   protected bsg b(cpk $$0) {
      return new bsi(this, $$0);
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
   public bjb eQ() {
      return bjb.e;
   }

   public boolean ga() {
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

   public boolean gb() {
      return this.an.b(e) != 0;
   }

   @Nullable
   public biw gc() {
      if (!this.gb()) {
         return null;
      } else if (this.dK().B) {
         if (this.bY != null) {
            return this.bY;
         } else {
            big $$0 = this.dK().a(this.an.b(e));
            if ($$0 instanceof biw) {
               this.bY = (biw)$$0;
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
   public void a(adx<?> $$0) {
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
   protected aot r() {
      return this.ba() ? aou.kj : aou.kk;
   }

   @Override
   protected aot d(bhe $$0) {
      return this.ba() ? aou.kp : aou.kq;
   }

   @Override
   protected aot h_() {
      return this.ba() ? aou.km : aou.kn;
   }

   @Override
   protected big.b aU() {
      return big.b.c;
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b * 0.5F;
   }

   @Override
   public float a(gv $$0, cpn $$1) {
      return $$1.b_($$0).a(apo.a) ? 10.0F + $$1.v($$0) : super.a($$0, $$1);
   }

   @Override
   public void b_() {
      if (this.bv()) {
         if (this.dK().B) {
            this.bU = this.bT;
            if (!this.aX()) {
               this.bV = 2.0F;
               ehf $$0 = this.dn();
               if ($$0.d > 0.0 && this.ca && !this.aS()) {
                  this.dK().a(this.dp(), this.dr(), this.dv(), this.t(), this.da(), 1.0F, 1.0F, false);
               }

               this.ca = $$0.d < 0.0 && this.dK().a(this.dk().d(), this);
            } else if (this.ga()) {
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
            } else if (this.ga()) {
               this.bW = this.bW + (0.0F - this.bW) * 0.25F;
            } else {
               this.bW = this.bW + (1.0F - this.bW) * 0.06F;
            }

            if (this.ga() && this.aX()) {
               ehf $$1 = this.f(0.0F);

               for (int $$2 = 0; $$2 < 2; $$2++) {
                  this.dK().a(iw.e, this.d(0.5) - $$1.c * 1.5, this.ds() - $$1.d * 1.5, this.g(0.5) - $$1.e * 1.5, 0.0, 0.0, 0.0);
               }
            }

            if (this.gb()) {
               if (this.bZ < this.q()) {
                  this.bZ++;
               }

               biw $$3 = this.gc();
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
                     this.dK().a(iw.e, this.dp() + $$5 * $$9, this.dt() + $$6 * $$9, this.dv() + $$7 * $$9, 0.0, 0.0, 0.0);
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

         if (this.gb()) {
            this.r(this.aW);
         }
      }

      super.b_();
   }

   protected aot t() {
      return aou.ko;
   }

   public float E(float $$0) {
      return aro.i($$0, this.bU, this.bT);
   }

   public float F(float $$0) {
      return aro.i($$0, this.bX, this.bW);
   }

   public float G(float $$0) {
      return ((float)this.bZ + $$0) / (float)this.q();
   }

   public float gd() {
      return (float)this.bZ;
   }

   @Override
   public boolean a(cpn $$0) {
      return $$0.f(this);
   }

   public static boolean b(bik<? extends byv> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return ($$4.a(20) == 0 || !$$1.u($$3)) && $$1.ai() != bgl.a && ($$2 == bja.c || $$1.b_($$3).a(apo.a)) && $$1.b_($$3.d()).a(apo.a);
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.dK().B) {
         return false;
      } else {
         if (!this.ga() && !$$0.a(apl.w) && !$$0.a(bhh.L) && $$0.c() instanceof biw $$2) {
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
   public void h(ehf $$0) {
      if (this.cW() && this.aX()) {
         this.a(0.1F, $$0);
         this.a(bjc.a, this.dn());
         this.f(this.dn().a(0.9));
         if (!this.ga() && this.j() == null) {
            this.f(this.dn().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }

   static class a extends bps {
      private final byv a;
      private int b;
      private final boolean c;

      public a(byv $$0) {
         this.a = $$0;
         this.c = $$0 instanceof byo;
         this.a(EnumSet.of(bps.a.a, bps.a.b));
      }

      @Override
      public boolean a() {
         biw $$0 = this.a.j();
         return $$0 != null && $$0.bv();
      }

      @Override
      public boolean b() {
         return super.b() && (this.c || this.a.j() != null && this.a.f((big)this.a.j()) > 9.0);
      }

      @Override
      public void c() {
         this.b = -10;
         this.a.H().n();
         biw $$0 = this.a.j();
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
         biw $$0 = this.a.j();
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
                  if (this.a.dK().ai() == bgl.d) {
                     $$1 += 2.0F;
                  }

                  if (this.c) {
                     $$1 += 2.0F;
                  }

                  $$0.a(this.a.dL().c(this.a, this.a), $$1);
                  $$0.a(this.a.dL().b((biw)this.a), (float)this.a.b(bkd.f));
                  this.a.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b implements Predicate<biw> {
      private final byv a;

      public b(byv $$0) {
         this.a = $$0;
      }

      public boolean a(@Nullable biw $$0) {
         return ($$0 instanceof cbl || $$0 instanceof bvh || $$0 instanceof bvp) && $$0.f(this.a) > 9.0;
      }
   }

   static class c extends bov {
      private final byv l;

      public c(byv $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.k == bov.a.b && !this.l.H().l()) {
            ehf $$0 = new ehf(this.e - this.l.dp(), this.f - this.l.dr(), this.g - this.l.dv());
            double $$1 = $$0.f();
            double $$2 = $$0.c / $$1;
            double $$3 = $$0.d / $$1;
            double $$4 = $$0.e / $$1;
            float $$5 = (float)(aro.d($$0.e, $$0.c) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dA(), $$5, 90.0F));
            this.l.aU = this.l.dA();
            float $$6 = (float)(this.h * this.l.b(bkd.d));
            float $$7 = aro.i(0.125F, this.l.fd(), $$6);
            this.l.w($$7);
            double $$8 = Math.sin((double)(this.l.ah + this.l.ah()) * 0.5) * 0.05;
            double $$9 = Math.cos((double)(this.l.dA() * (float) (Math.PI / 180.0)));
            double $$10 = Math.sin((double)(this.l.dA() * (float) (Math.PI / 180.0)));
            double $$11 = Math.sin((double)(this.l.ah + this.l.ah()) * 0.75) * 0.05;
            this.l.f(this.l.dn().b($$8 * $$9, $$11 * ($$10 + $$9) * 0.25 + (double)$$7 * $$3 * 0.1, $$8 * $$10));
            bou $$12 = this.l.D();
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

            this.l.D().a(aro.d(0.125, $$16, $$13), aro.d(0.125, $$17, $$14), aro.d(0.125, $$18, $$15), 10.0F, 40.0F);
            this.l.w(true);
         } else {
            this.l.w(0.0F);
            this.l.w(false);
         }
      }
   }
}
