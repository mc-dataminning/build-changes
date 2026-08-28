import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cmy extends chm implements bwy<Optional<cwe>>, cmk {
   private static final aku d = aku.b("covered");
   private static final bxe bF = new bxe(d, 20.0, bxe.a.a);
   protected static final ajx<jn> a = akb.a(cmy.class, ajz.q);
   protected static final ajx<Byte> b = akb.a(cmy.class, ajz.a);
   protected static final ajx<Byte> c = akb.a(cmy.class, ajz.a);
   private static final int bG = 6;
   private static final byte bH = 16;
   private static final byte bI = 16;
   private static final int bJ = 8;
   private static final int bK = 8;
   private static final int bL = 5;
   private static final float bM = 0.05F;
   static final Vector3f bN = af.a(() -> {
      km $$0 = jn.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float bO = 3.0F;
   private float bP;
   private float bQ;
   @Nullable
   private ji bR;
   private int bS;
   private static final float bT = 1.0F;

   public cmy(bvi<? extends cmy> $$0, dgz $$1) {
      super($$0, $$1);
      this.bx = 5;
      this.by = new cmy.d(this);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cde(this, cpr.class, 8.0F, 0.02F, true));
      this.bC.a(4, new cmy.a());
      this.bC.a(7, new cmy.f());
      this.bC.a(8, new cdr(this));
      this.bD.a(1, new ceo(this, this.getClass()).a());
      this.bD.a(2, new cmy.e(this));
      this.bD.a(3, new cmy.c(this));
   }

   @Override
   protected bva.c bg() {
      return bva.c.a;
   }

   @Override
   public awb dl() {
      return awb.f;
   }

   @Override
   protected avz u() {
      return awa.xv;
   }

   @Override
   public void T() {
      if (!this.gu()) {
         super.T();
      }
   }

   @Override
   protected avz l_() {
      return awa.xB;
   }

   @Override
   protected avz e(btp $$0) {
      return this.gu() ? awa.xD : awa.xC;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, jn.a);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static bxf.a j() {
      return bwa.E().a(bxg.s, 30.0);
   }

   @Override
   protected cbu I() {
      return new cmy.b(this);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(jn.a($$0.f("AttachFace")));
      this.al.a(b, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.al.a(c, $$0.f("Color"));
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.n().d());
      $$0.a("Peek", this.al.a(b));
      $$0.a("Color", this.al.a(c));
   }

   @Override
   public void h() {
      super.h();
      if (!this.dU().C && !this.bY() && !this.a(this.du(), this.n())) {
         this.x();
      }

      if (this.gs()) {
         this.gt();
      }

      if (this.dU().C) {
         if (this.bS > 0) {
            this.bS--;
         } else {
            this.bR = null;
         }
      }
   }

   private void x() {
      jn $$0 = this.i(this.du());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.m();
      }
   }

   @Override
   protected fbs c(fbx $$0) {
      float $$1 = M(this.bQ);
      jn $$2 = this.n().g();
      return a(this.ej(), $$2, $$1, $$0);
   }

   private static float M(float $$0) {
      return 0.5F - ayz.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gs() {
      this.bP = this.bQ;
      float $$0 = (float)this.gw() * 0.01F;
      if (this.bQ == $$0) {
         return false;
      } else {
         if (this.bQ > $$0) {
            this.bQ = ayz.a(this.bQ - 0.05F, $$0, 1.0F);
         } else {
            this.bQ = ayz.a(this.bQ + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gt() {
      this.ay();
      float $$0 = M(this.bQ);
      float $$1 = M(this.bP);
      jn $$2 = this.n().g();
      float $$3 = ($$0 - $$1) * this.ej();
      if (!($$3 <= 0.0F)) {
         for (bva $$5 : this.dU().a(this, a(this.ej(), $$2, $$1, $$0, this.ds()), bvg.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cmy) && !$$5.ad) {
               $$5.a(bwc.e, new fbx((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static fbs a(float $$0, jn $$1, float $$2, fbx $$3) {
      return a($$0, $$1, -1.0F, $$2, $$3);
   }

   public static fbs a(float $$0, jn $$1, float $$2, float $$3, fbx $$4) {
      fbs $$5 = new fbs((double)(-$$0) * 0.5, 0.0, (double)(-$$0) * 0.5, (double)$$0 * 0.5, (double)$$0, (double)$$0 * 0.5);
      double $$6 = (double)Math.max($$2, $$3);
      double $$7 = (double)Math.min($$2, $$3);
      fbs $$8 = $$5.b((double)$$1.j() * $$6 * (double)$$0, (double)$$1.k() * $$6 * (double)$$0, (double)$$1.l() * $$6 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$7) * (double)$$0);
      return $$8.d($$4.d, $$4.e, $$4.f);
   }

   @Override
   public boolean a(bva $$0, boolean $$1) {
      if (this.dU().w_()) {
         this.bR = null;
         this.bS = 0;
      }

      this.a(jn.a);
      return super.a($$0, $$1);
   }

   @Override
   public void bO() {
      super.bO();
      if (this.dU().C) {
         this.bR = this.du();
      }

      this.aW = 0.0F;
      this.aV = 0.0F;
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      this.w(0.0F);
      this.aX = this.dK();
      this.bx();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bwc $$0, fbx $$1) {
      if ($$0 == bwc.d) {
         this.m();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public fbx dx() {
      return fbx.c;
   }

   @Override
   public void i(fbx $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      ji $$3 = this.du();
      if (this.bY()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)ayz.a($$0) + 0.5, (double)ayz.a($$1 + 0.5), (double)ayz.a($$2) + 0.5);
      }

      if (this.af != 0) {
         ji $$4 = this.du();
         if (!$$4.equals($$3)) {
            this.al.a(b, (byte)0);
            this.ar = true;
            if (this.dU().C && !this.bY() && !$$4.equals(this.bR)) {
               this.bR = $$3;
               this.bS = 6;
               this.aa = this.dz();
               this.ab = this.dB();
               this.ac = this.dF();
            }
         }
      }
   }

   @Nullable
   protected jn i(ji $$0) {
      for (jn $$1 : jn.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(ji $$0, jn $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         jn $$2 = $$1.g();
         if (!this.dU().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            fbs $$3 = a(this.ej(), $$2, 1.0F, $$0.c()).h(1.0E-6);
            return this.dU().a(this, $$3);
         }
      }
   }

   private boolean j(ji $$0) {
      dxq $$1 = this.dU().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dkg.bX) && $$0.equals(this.du());
         return !$$2;
      }
   }

   protected boolean m() {
      if (!this.gh() && this.bJ()) {
         ji $$0 = this.du();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ji $$2 = $$0.b(ayz.b(this.ae, -8, 8), ayz.b(this.ae, -8, 8), ayz.b(this.ae, -8, 8));
            if ($$2.v() > this.dU().G_() && this.dU().u($$2) && this.dU().A_().a($$2) && this.dU().a(this, new fbs($$2).h(1.0E-6))) {
               jn $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ao();
                  this.a($$3);
                  this.a(awa.xG, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dU().a(ecp.R, $$0, ecp.a.a(this));
                  this.al.a(b, (byte)0);
                  this.h(null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public bvt N_() {
      return null;
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.gu()) {
         bva $$3 = $$1.c();
         if ($$3 instanceof cpy) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eE() < (double)this.eS() * 0.5 && this.ae.a(4) == 0) {
            this.m();
         } else if ($$1.a(awr.j)) {
            bva $$4 = $$1.c();
            if ($$4 != null && $$4.aq() == bvi.bc) {
               this.gv();
            }
         }

         return true;
      }
   }

   private boolean gu() {
      return this.gw() == 0;
   }

   private void gv() {
      fbx $$0 = this.ds();
      fbs $$1 = this.cQ();
      if (!this.gu() && this.m()) {
         int $$2 = this.dU().a(bvi.bb, $$1.g(8.0), bva::bJ).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dU().A.i() < $$3)) {
            cmy $$4 = bvi.bb.a(this.dU(), bvh.e);
            if ($$4 != null) {
               $$4.a(this.q());
               $$4.f($$0);
               this.dU().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bL() {
      return this.bJ();
   }

   public jn n() {
      return this.al.a(a);
   }

   private void a(jn $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (a.equals($$0)) {
         this.a(this.ax());
      }

      super.a($$0);
   }

   private int gw() {
      return this.al.a(b);
   }

   void b(int $$0) {
      if (!this.dU().C) {
         this.g(bxg.a).c(d);
         if ($$0 == 0) {
            this.g(bxg.a).d(bF);
            this.a(awa.xA, 1.0F, 1.0F);
            this.a(ecp.j);
         } else {
            this.a(awa.xE, 1.0F, 1.0F);
            this.a(ecp.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float K(float $$0) {
      return ayz.h($$0, this.bP, this.bQ);
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      this.aV = 0.0F;
      this.aW = 0.0F;
   }

   @Override
   public int ac() {
      return 180;
   }

   @Override
   public int ad() {
      return 180;
   }

   @Override
   public void h(bva $$0) {
   }

   @Nullable
   public fbx L(float $$0) {
      if (this.bR != null && this.bS > 0) {
         double $$1 = (double)((float)this.bS - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.ej();
         ji $$2 = this.du();
         double $$3 = (double)($$2.u() - this.bR.u()) * $$1;
         double $$4 = (double)($$2.v() - this.bR.v()) * $$1;
         double $$5 = (double)($$2.w() - this.bR.w()) * $$1;
         return new fbx(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cwe> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cwe> q() {
      return Optional.ofNullable(this.t());
   }

   @Nullable
   public cwe t() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cwe.a($$0) : null;
   }

   class a extends ccw {
      private int b;

      public a() {
         this.a(EnumSet.of(ccw.a.a, ccw.a.b));
      }

      @Override
      public boolean b() {
         bvy $$0 = cmy.this.f();
         return $$0 != null && $$0.bJ() ? cmy.this.dU().an() != bsv.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cmy.this.b(100);
      }

      @Override
      public void e() {
         cmy.this.b(0);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (cmy.this.dU().an() != bsv.a) {
            this.b--;
            bvy $$0 = cmy.this.f();
            if ($$0 != null) {
               cmy.this.J().a($$0, 180.0F, 180.0F);
               double $$1 = cmy.this.g((bva)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cmy.this.ae.a(10) * 20 / 2;
                     cmy.this.dU().b(new cqn(cmy.this.dU(), cmy.this, $$0, cmy.this.n().o()));
                     cmy.this.a(awa.xF, 2.0F, (cmy.this.ae.i() - cmy.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cmy.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cbu {
      public b(bwa $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cep<bvy> {
      public c(cmy $$0) {
         super($$0, bvy.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof cmk);
      }

      @Override
      public boolean b() {
         return this.e.cq() == null ? false : super.b();
      }

      @Override
      protected fbs a(double $$0) {
         jn $$1 = ((cmy)this.e).n();
         if ($$1.o() == jn.a.a) {
            return this.e.cQ().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jn.a.c ? this.e.cQ().c($$0, $$0, 4.0) : this.e.cQ().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cby {
      public d(final bwa $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jn $$0 = cmy.this.n().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cmy.bN));
         km $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dz();
         double $$5 = this.f - this.a.dD();
         double $$6 = this.g - this.a.dF();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(ayz.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cep<cpr> {
      public e(final cmy $$0) {
         super($$0, cpr.class, true);
      }

      @Override
      public boolean b() {
         return cmy.this.dU().an() == bsv.a ? false : super.b();
      }

      @Override
      protected fbs a(double $$0) {
         jn $$1 = ((cmy)this.e).n();
         if ($$1.o() == jn.a.a) {
            return this.e.cQ().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jn.a.c ? this.e.cQ().c($$0, $$0, 4.0) : this.e.cQ().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends ccw {
      private int b;

      @Override
      public boolean b() {
         return cmy.this.f() == null && cmy.this.ae.a(b(40)) == 0 && cmy.this.a(cmy.this.du(), cmy.this.n());
      }

      @Override
      public boolean c() {
         return cmy.this.f() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cmy.this.ae.a(3)));
         cmy.this.b(30);
      }

      @Override
      public void e() {
         if (cmy.this.f() == null) {
            cmy.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
