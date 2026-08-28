import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjy extends bzb {
   public static final double bM = 0.6;
   public static final double bN = 0.8;
   public static final double bO = 1.33;
   private static final aku<jg<cjz>> bP = aky.a(cjy.class, akw.x);
   private static final aku<Boolean> bQ = aky.a(cjy.class, akw.k);
   private static final aku<Boolean> bR = aky.a(cjy.class, akw.k);
   private static final aku<Integer> bS = aky.a(cjy.class, akw.b);
   private static final alq<cjz> bT = cka.b;
   private static final czi bU = czi.o;
   @Nullable
   private cjy.a<csi> bV;
   @Nullable
   private cgj bW;
   private float bX;
   private float bY;
   private float bZ;
   private float ca;
   private boolean cb;
   private float cc;
   private float cd;

   public cjy(bxn<? extends cjy> $$0, dkj $$1) {
      super($$0, $$1);
      this.gM();
   }

   @Override
   protected void C() {
      this.bW = new cjy.c(this, 0.6, $$0 -> $$0.a(axv.aj), true);
      this.bF.a(1, new cev(this));
      this.bF.a(1, new bzb.a(1.5));
      this.bF.a(2, new cgg(this));
      this.bF.a(3, new cjy.b(this));
      this.bF.a(4, this.bW);
      this.bF.a(5, new ceo(this, 1.1, 8));
      this.bF.a(6, new cez(this, 1.0, 10.0F, 5.0F));
      this.bF.a(7, new cep(this, 0.8));
      this.bF.a(8, new cfh(this, 0.3F));
      this.bF.a(9, new cfr(this));
      this.bF.a(10, new cen(this, 0.8));
      this.bF.a(11, new cgo(this, 0.8, 1.0000001E-5F));
      this.bF.a(12, new cfj(this, csi.class, 10.0F));
      this.bG.a(1, new cgx<>(this, ckv.class, false, null));
      this.bG.a(1, new cgx<>(this, clc.class, false, clc.bI));
   }

   public jg<cjz> gG() {
      return this.al.a(bP);
   }

   private void j(jg<cjz> $$0) {
      this.al.a(bP, $$0);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      if ($$0 == kl.aP) {
         return c((kk<T>)$$0, this.gG());
      } else {
         return $$0 == kl.aQ ? c((kk<T>)$$0, this.gI()) : super.a($$0);
      }
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aP);
      this.a($$0, kl.aQ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aP) {
         this.j(c(kl.aP, $$1));
         return true;
      } else if ($$0 == kl.aQ) {
         this.a(c(kl.aQ, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public void z(boolean $$0) {
      this.al.a(bQ, $$0);
   }

   public boolean gH() {
      return this.al.a(bQ);
   }

   void A(boolean $$0) {
      this.al.a(bR, $$0);
   }

   boolean gN() {
      return this.al.a(bR);
   }

   public czi gI() {
      return czi.a(this.al.a(bS));
   }

   private void a(czi $$0) {
      this.al.a(bS, $$0.a());
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bP, cur.a(this.dX(), bT));
      $$0.a(bQ, false);
      $$0.a(bR, false);
      $$0.a(bS, bU.a());
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      cur.a($$0, this.gG());
      $$0.a("CollarColor", czi.s, this.gI());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      cur.a($$0, this.dX(), mi.aH).ifPresent(this::j);
      this.a($$0.<czi>a("CollarColor", czi.s).orElse(bU));
   }

   @Override
   public void a(asb $$0) {
      if (this.K().b()) {
         double $$1 = this.K().c();
         if ($$1 == 0.6) {
            this.b(byr.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(byr.a);
            this.h(true);
         } else {
            this.b(byr.a);
            this.h(false);
         }
      } else {
         this.b(byr.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awx s() {
      if (this.m()) {
         if (this.gE()) {
            return awy.eb;
         } else {
            return this.ae.a(4) == 0 ? awy.ec : awy.dU;
         }
      } else {
         return awy.dV;
      }
   }

   @Override
   public int R() {
      return 120;
   }

   public void gJ() {
      this.b(awy.dY);
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.ea;
   }

   @Override
   protected awx j_() {
      return awy.dW;
   }

   public static bzk.a gK() {
      return cjv.gz().a(bzl.s, 10.0).a(bzl.v, 0.3F).a(bzl.c, 3.0);
   }

   @Override
   protected void gA() {
      this.a(awy.dX, 1.0F, 1.0F);
   }

   @Override
   public void g() {
      super.g();
      if (this.bW != null && this.bW.i() && !this.m() && this.af % 100 == 0) {
         this.a(awy.dZ, 1.0F, 1.0F);
      }

      this.gO();
   }

   private void gO() {
      if ((this.gH() || this.gN()) && this.af % 5 == 0) {
         this.a(awy.eb, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gP();
      this.gQ();
      this.cb = false;
      if (this.gH()) {
         iw $$0 = this.dv();

         for (csi $$2 : this.dV().a(csi.class, new ffx($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fR()) {
               this.cb = true;
               break;
            }
         }
      }
   }

   public boolean gL() {
      return this.cb;
   }

   private void gP() {
      this.bY = this.bX;
      this.ca = this.bZ;
      if (this.gH()) {
         this.bX = Math.min(1.0F, this.bX + 0.15F);
         this.bZ = Math.min(1.0F, this.bZ + 0.08F);
      } else {
         this.bX = Math.max(0.0F, this.bX - 0.22F);
         this.bZ = Math.max(0.0F, this.bZ - 0.13F);
      }
   }

   private void gQ() {
      this.cd = this.cc;
      if (this.gN()) {
         this.cc = Math.min(1.0F, this.cc + 0.1F);
      } else {
         this.cc = Math.max(0.0F, this.cc - 0.13F);
      }
   }

   public float J(float $$0) {
      return azz.h($$0, this.bY, this.bX);
   }

   public float K(float $$0) {
      return azz.h($$0, this.ca, this.bZ);
   }

   public float L(float $$0) {
      return azz.h($$0, this.cd, this.cc);
   }

   @Nullable
   public cjy b(asb $$0, bwu $$1) {
      cjy $$2 = bxn.v.a($$0, bxm.e);
      if ($$2 != null && $$1 instanceof cjy $$3) {
         if (this.ae.h()) {
            $$2.j(this.gG());
         } else {
            $$2.j($$3.gG());
         }

         if (this.m()) {
            $$2.a(this.d());
            $$2.a(true, true);
            czi $$4 = this.gI();
            czi $$5 = $$3.gI();
            $$2.a(czi.a($$0, $$4, $$5));
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cjv $$0) {
      if (!this.m()) {
         return false;
      } else {
         return !($$0 instanceof cjy $$1) ? false : $$1.m() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      cka.a(this.ae, this.dX(), cuo.a($$0, this.dv())).ifPresent(this::j);
      return $$3;
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      dag $$3 = $$2.h();
      if (this.m()) {
         if (this.j($$0)) {
            if ($$3 instanceof czj $$4) {
               czi $$5 = $$4.a();
               if ($$5 != this.gI()) {
                  if (!this.dV().A_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.gc();
                  }

                  return bvc.a;
               }
            } else if (this.i($$2) && this.eG() < this.eU()) {
               if (!this.dV().A_()) {
                  this.a($$0, $$1, $$2);
                  cvy $$6 = $$2.a(kl.v);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gA();
               }

               return bvc.a;
            }

            bvc $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.y(!this.gu());
               return bvc.a;
            }

            return $$7;
         }
      } else if (this.i($$2)) {
         if (!this.dV().A_()) {
            this.a($$0, $$1, $$2);
            this.f($$0);
            this.gc();
            this.gA();
         }

         return bvc.a;
      }

      bvc $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.gc();
      }

      return $$8;
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.aj);
   }

   @Override
   public boolean h(double $$0) {
      return !this.m() && this.af > 2400;
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      super.a($$0, $$1);
      this.gM();
   }

   protected void gM() {
      if (this.bV == null) {
         this.bV = new cjy.a<>(this, csi.class, 16.0F, 0.8, 1.33);
      }

      this.bF.a(this.bV);
      if (!this.m()) {
         this.bF.a(4, this.bV);
      }
   }

   private void f(csi $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.y(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public boolean cd() {
      return this.ch() || super.cd();
   }

   static class a<T extends byf> extends cei<T> {
      private final cjy i;

      public a(cjy $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bxl.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.m() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.m() && super.c();
      }
   }

   static class b extends cfb {
      private final cjy a;
      @Nullable
      private csi b;
      @Nullable
      private iw c;
      private int d;

      public b(cjy $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.m()) {
            return false;
         } else if (this.a.gu()) {
            return false;
         } else {
            byf $$0 = this.a.T_();
            if ($$0 instanceof csi $$1) {
               this.b = $$1;
               if (!$$0.fR()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               iw $$2 = this.b.dv();
               ebq $$3 = this.a.dV().a_($$2);
               if ($$3.a(axn.T)) {
                  this.c = $$3.d(dnh.e).map($$1x -> $$2.a($$1x.g())).orElseGet(() -> new iw($$2));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (cjy $$1 : this.a.dV().a(cjy.class, new ffx(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gH() || $$1.gN())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.m() && !this.a.gu() && this.b != null && this.b.fR() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.x(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.z(false);
         float $$0 = this.a.dV().f(1.0F);
         if (this.b.gp() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dV().G_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.A(false);
         this.a.N().m();
      }

      private void i() {
         bai $$0 = this.a.dY();
         iw.a $$1 = new iw.a();
         $$1.g(this.a.Q_() ? this.a.B().dv() : this.a.dv());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dv());
         this.a
            .a(
               a(this.a),
               fap.aq,
               ($$1x, $$2) -> $$1x.b(
                     new coo(
                        $$1x,
                        (double)$$1.u() - (double)azz.a(this.a.aV * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)azz.b(this.a.aV * (float) (Math.PI / 180.0)),
                        $$2
                     )
                  )
            );
      }

      @Override
      public void a() {
         if (this.b != null && this.c != null) {
            this.a.x(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g(this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.z(true);
                  this.a.A(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.A(true);
               }
            } else {
               this.a.z(false);
            }
         }
      }
   }

   static class c extends cgj {
      @Nullable
      private csi c;
      private final cjy d;

      public c(cjy $$0, double $$1, Predicate<dak> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.dY().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dY().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.m();
      }
   }
}
