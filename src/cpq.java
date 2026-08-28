import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cpq extends cjs implements cpc {
   private static final alr d = alr.b("covered");
   private static final bzj e = new bzj(d, 20.0, bzj.a.a);
   protected static final aku<jc> a = aky.a(cpq.class, akw.q);
   protected static final aku<Byte> b = aky.a(cpq.class, akw.a);
   protected static final aku<Byte> c = aky.a(cpq.class, akw.a);
   private static final int f = 6;
   private static final byte bI = 16;
   private static final byte bJ = 16;
   private static final int bK = 8;
   private static final int bL = 8;
   private static final int bM = 5;
   private static final float bN = 0.05F;
   private static final byte bO = 0;
   private static final jc bP = jc.a;
   static final Vector3f bQ = ag.a(() -> {
      kb $$0 = jc.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float bR = 3.0F;
   private float bS;
   private float bT;
   @Nullable
   private iw bU;
   private int bV;
   private static final float bW = 1.0F;

   public cpq(bxn<? extends cpq> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 5;
      this.bB = new cpq.d(this);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cfj(this, csi.class, 8.0F, 0.02F, true));
      this.bF.a(4, new cpq.a());
      this.bF.a(7, new cpq.f());
      this.bF.a(8, new cfw(this));
      this.bG.a(1, new cgt(this, this.getClass()).a());
      this.bG.a(2, new cpq.e(this));
      this.bG.a(3, new cpq.c(this));
   }

   @Override
   protected bxe.c bf() {
      return bxe.c.a;
   }

   @Override
   public awz dm() {
      return awz.f;
   }

   @Override
   protected awx u() {
      return awy.xB;
   }

   @Override
   public void T() {
      if (!this.gw()) {
         super.T();
      }
   }

   @Override
   protected awx l_() {
      return awy.xH;
   }

   @Override
   protected awx e(bvt $$0) {
      return this.gw() ? awy.xJ : awy.xI;
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(a, bP);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static bzk.a j() {
      return byh.E().a(bzl.s, 30.0);
   }

   @Override
   protected cdz I() {
      return new cpq.b(this);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<jc>a("AttachFace", jc.k).orElse(bP));
      this.al.a(b, $$0.b("Peek", (byte)0));
      this.al.a(c, $$0.b("Color", (byte)16));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("AttachFace", jc.k, this.n());
      $$0.a("Peek", this.al.a(b).byteValue());
      $$0.a("Color", this.al.a(c).byteValue());
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C && !this.bY() && !this.a(this.dv(), this.n())) {
         this.x();
      }

      if (this.gu()) {
         this.gv();
      }

      if (this.dV().C) {
         if (this.bV > 0) {
            this.bV--;
         } else {
            this.bU = null;
         }
      }
   }

   private void x() {
      jc $$0 = this.h(this.dv());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.m();
      }
   }

   @Override
   protected ffx c(fgc $$0) {
      float $$1 = L(this.bT);
      jc $$2 = this.n().g();
      return a(this.el(), $$2, $$1, $$0);
   }

   private static float L(float $$0) {
      return 0.5F - azz.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gu() {
      this.bS = this.bT;
      float $$0 = (float)this.gy() * 0.01F;
      if (this.bT == $$0) {
         return false;
      } else {
         if (this.bT > $$0) {
            this.bT = azz.a(this.bT - 0.05F, $$0, 1.0F);
         } else {
            this.bT = azz.a(this.bT + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gv() {
      this.av();
      float $$0 = L(this.bT);
      float $$1 = L(this.bS);
      jc $$2 = this.n().g();
      float $$3 = ($$0 - $$1) * this.el();
      if (!($$3 <= 0.0F)) {
         for (bxe $$5 : this.dV().a(this, a(this.el(), $$2, $$1, $$0, this.dt()), bxl.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cpq) && !$$5.ad) {
               $$5.a(byj.e, new fgc((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ffx a(float $$0, jc $$1, float $$2, fgc $$3) {
      return a($$0, $$1, -1.0F, $$2, $$3);
   }

   public static ffx a(float $$0, jc $$1, float $$2, float $$3, fgc $$4) {
      ffx $$5 = new ffx((double)(-$$0) * 0.5, 0.0, (double)(-$$0) * 0.5, (double)$$0 * 0.5, (double)$$0, (double)$$0 * 0.5);
      double $$6 = (double)Math.max($$2, $$3);
      double $$7 = (double)Math.min($$2, $$3);
      ffx $$8 = $$5.b((double)$$1.j() * $$6 * (double)$$0, (double)$$1.k() * $$6 * (double)$$0, (double)$$1.l() * $$6 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$7) * (double)$$0);
      return $$8.d($$4.d, $$4.e, $$4.f);
   }

   @Override
   public boolean a(bxe $$0, boolean $$1) {
      if (this.dV().A_()) {
         this.bU = null;
         this.bV = 0;
      }

      this.a(jc.a);
      return super.a($$0, $$1);
   }

   @Override
   public void bO() {
      super.bO();
      if (this.dV().C) {
         this.bU = this.dv();
      }

      this.aW = 0.0F;
      this.aV = 0.0F;
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      this.w(0.0F);
      this.aX = this.dL();
      this.bx();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(byj $$0, fgc $$1) {
      if ($$0 == byj.d) {
         this.m();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public fgc dy() {
      return fgc.c;
   }

   @Override
   public void i(fgc $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      iw $$3 = this.dv();
      if (this.bY()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azz.a($$0) + 0.5, (double)azz.a($$1 + 0.5), (double)azz.a($$2) + 0.5);
      }

      if (this.af != 0) {
         iw $$4 = this.dv();
         if (!$$4.equals($$3)) {
            this.al.a(b, (byte)0);
            this.ar = true;
            if (this.dV().C && !this.bY() && !$$4.equals(this.bU)) {
               this.bU = $$3;
               this.bV = 6;
               this.aa = this.dA();
               this.ab = this.dC();
               this.ac = this.dG();
            }
         }
      }
   }

   @Nullable
   protected jc h(iw $$0) {
      for (jc $$1 : jc.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(iw $$0, jc $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jc $$2 = $$1.g();
         if (!this.dV().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ffx $$3 = a(this.el(), $$2, 1.0F, $$0.c()).h(1.0E-6);
            return this.dV().a(this, $$3);
         }
      }
   }

   private boolean i(iw $$0) {
      ebq $$1 = this.dV().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dnq.ca) && $$0.equals(this.dv());
         return !$$2;
      }
   }

   protected boolean m() {
      if (!this.gj() && this.bJ()) {
         iw $$0 = this.dv();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            iw $$2 = $$0.b(azz.b(this.ae, -8, 8), azz.b(this.ae, -8, 8), azz.b(this.ae, -8, 8));
            if ($$2.v() > this.dV().K_() && this.dV().v($$2) && this.dV().E_().a($$2) && this.dV().a(this, new ffx($$2).h(1.0E-6))) {
               jc $$3 = this.h($$2);
               if ($$3 != null) {
                  this.al();
                  this.a($$3);
                  this.a(awy.xM, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dV().a(egq.R, $$0, egq.a.a(this));
                  this.al.a(b, (byte)0);
                  this.g(null);
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
   public bya S_() {
      return null;
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.gw()) {
         bxe $$3 = $$1.c();
         if ($$3 instanceof csq) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eG() < (double)this.eU() * 0.5 && this.ae.a(4) == 0) {
            this.m();
         } else if ($$1.a(axo.j)) {
            bxe $$4 = $$1.c();
            if ($$4 != null && $$4.an() == bxn.be) {
               this.gx();
            }
         }

         return true;
      }
   }

   private boolean gw() {
      return this.gy() == 0;
   }

   private void gx() {
      fgc $$0 = this.dt();
      ffx $$1 = this.cR();
      if (!this.gw() && this.m()) {
         int $$2 = this.dV().a(bxn.bd, $$1.g(8.0), bxe::bJ).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dV().A.i() < $$3)) {
            cpq $$4 = bxn.bd.a(this.dV(), bxm.e);
            if ($$4 != null) {
               $$4.a(this.q());
               $$4.f($$0);
               this.dV().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bL() {
      return this.bJ();
   }

   public jc n() {
      return this.al.a(a);
   }

   private void a(jc $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(aku<?> $$0) {
      if (a.equals($$0)) {
         this.a(this.au());
      }

      super.a($$0);
   }

   private int gy() {
      return this.al.a(b);
   }

   void b(int $$0) {
      if (!this.dV().C) {
         this.g(bzl.a).c(d);
         if ($$0 == 0) {
            this.g(bzl.a).d(e);
            this.a(awy.xG, 1.0F, 1.0F);
            this.a(egq.j);
         } else {
            this.a(awy.xK, 1.0F, 1.0F);
            this.a(egq.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return azz.h($$0, this.bS, this.bT);
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      this.aV = 0.0F;
      this.aW = 0.0F;
   }

   @Override
   public int ad() {
      return 180;
   }

   @Override
   public int af() {
      return 180;
   }

   @Override
   public void h(bxe $$0) {
   }

   @Nullable
   public fgc K(float $$0) {
      if (this.bU != null && this.bV > 0) {
         double $$1 = (double)((float)this.bV - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.el();
         iw $$2 = this.dv();
         double $$3 = (double)($$2.u() - this.bU.u()) * $$1;
         double $$4 = (double)($$2.v() - this.bU.v()) * $$1;
         double $$5 = (double)($$2.w() - this.bU.w()) * $$1;
         return new fgc(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   private void a(Optional<czi> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<czi> q() {
      return Optional.ofNullable(this.t());
   }

   @Nullable
   public czi t() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? czi.a($$0) : null;
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aS ? c((kk<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aS);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aS) {
         this.a(Optional.of(c(kl.aS, $$1)));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   class a extends cfb {
      private int b;

      public a() {
         this.a(EnumSet.of(cfb.a.a, cfb.a.b));
      }

      @Override
      public boolean b() {
         byf $$0 = cpq.this.f();
         return $$0 != null && $$0.bJ() ? cpq.this.dV().an() != buz.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cpq.this.b(100);
      }

      @Override
      public void e() {
         cpq.this.b(0);
      }

      @Override
      public boolean W_() {
         return true;
      }

      @Override
      public void a() {
         if (cpq.this.dV().an() != buz.a) {
            this.b--;
            byf $$0 = cpq.this.f();
            if ($$0 != null) {
               cpq.this.J().a($$0, 180.0F, 180.0F);
               double $$1 = cpq.this.g((bxe)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cpq.this.ae.a(10) * 20 / 2;
                     cpq.this.dV().b(new ctg(cpq.this.dV(), cpq.this, $$0, cpq.this.n().o()));
                     cpq.this.a(awy.xL, 2.0F, (cpq.this.ae.i() - cpq.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cpq.this.g(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cdz {
      public b(byh $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cgu<byf> {
      public c(cpq $$0) {
         super($$0, byf.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof cpc);
      }

      @Override
      public boolean b() {
         return this.e.cq() == null ? false : super.b();
      }

      @Override
      protected ffx a(double $$0) {
         jc $$1 = ((cpq)this.e).n();
         if ($$1.o() == jc.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jc.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends ced {
      public d(final byh $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jc $$0 = cpq.this.n().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cpq.bQ));
         kb $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dA();
         double $$5 = this.f - this.a.dE();
         double $$6 = this.g - this.a.dG();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(azz.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cgu<csi> {
      public e(final cpq $$0) {
         super($$0, csi.class, true);
      }

      @Override
      public boolean b() {
         return cpq.this.dV().an() == buz.a ? false : super.b();
      }

      @Override
      protected ffx a(double $$0) {
         jc $$1 = ((cpq)this.e).n();
         if ($$1.o() == jc.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jc.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cfb {
      private int b;

      @Override
      public boolean b() {
         return cpq.this.f() == null && cpq.this.ae.a(b(40)) == 0 && cpq.this.a(cpq.this.dv(), cpq.this.n());
      }

      @Override
      public boolean c() {
         return cpq.this.f() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cpq.this.ae.a(3)));
         cpq.this.b(30);
      }

      @Override
      public void e() {
         if (cpq.this.f() == null) {
            cpq.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
