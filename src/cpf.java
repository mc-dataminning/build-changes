import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cpf extends cjh implements cor {
   private static final ali d = ali.b("covered");
   private static final byy e = new byy(d, 20.0, byy.a.a);
   protected static final akl<jb> a = akp.a(cpf.class, akn.q);
   protected static final akl<Byte> b = akp.a(cpf.class, akn.a);
   protected static final akl<Byte> c = akp.a(cpf.class, akn.a);
   private static final int f = 6;
   private static final byte bI = 16;
   private static final byte bJ = 16;
   private static final int bK = 8;
   private static final int bL = 8;
   private static final int bM = 5;
   private static final float bN = 0.05F;
   private static final byte bO = 0;
   private static final jb bP = jb.a;
   static final Vector3f bQ = ag.a(() -> {
      ka $$0 = jb.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float bR = 3.0F;
   private float bS;
   private float bT;
   @Nullable
   private iv bU;
   private int bV;
   private static final float bW = 1.0F;

   public cpf(bxc<? extends cpf> $$0, djx $$1) {
      super($$0, $$1);
      this.bA = 5;
      this.bB = new cpf.d(this);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cey(this, crx.class, 8.0F, 0.02F, true));
      this.bF.a(4, new cpf.a());
      this.bF.a(7, new cpf.f());
      this.bF.a(8, new cfl(this));
      this.bG.a(1, new cgi(this, this.getClass()).a());
      this.bG.a(2, new cpf.e(this));
      this.bG.a(3, new cpf.c(this));
   }

   @Override
   protected bwt.c bf() {
      return bwt.c.a;
   }

   @Override
   public awq dm() {
      return awq.f;
   }

   @Override
   protected awo u() {
      return awp.xB;
   }

   @Override
   public void T() {
      if (!this.gw()) {
         super.T();
      }
   }

   @Override
   protected awo l_() {
      return awp.xH;
   }

   @Override
   protected awo e(bvi $$0) {
      return this.gw() ? awp.xJ : awp.xI;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(a, bP);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static byz.a j() {
      return bxw.E().a(bza.s, 30.0);
   }

   @Override
   protected cdo I() {
      return new cpf.b(this);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<jb>a("AttachFace", jb.k).orElse(bP));
      this.al.a(b, $$0.b("Peek", (byte)0));
      this.al.a(c, $$0.b("Color", (byte)16));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("AttachFace", jb.k, this.n());
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
      jb $$0 = this.h(this.dv());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.m();
      }
   }

   @Override
   protected ffl c(ffq $$0) {
      float $$1 = L(this.bT);
      jb $$2 = this.n().g();
      return a(this.el(), $$2, $$1, $$0);
   }

   private static float L(float $$0) {
      return 0.5F - azo.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gu() {
      this.bS = this.bT;
      float $$0 = (float)this.gy() * 0.01F;
      if (this.bT == $$0) {
         return false;
      } else {
         if (this.bT > $$0) {
            this.bT = azo.a(this.bT - 0.05F, $$0, 1.0F);
         } else {
            this.bT = azo.a(this.bT + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gv() {
      this.av();
      float $$0 = L(this.bT);
      float $$1 = L(this.bS);
      jb $$2 = this.n().g();
      float $$3 = ($$0 - $$1) * this.el();
      if (!($$3 <= 0.0F)) {
         for (bwt $$5 : this.dV().a(this, a(this.el(), $$2, $$1, $$0, this.dt()), bxa.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cpf) && !$$5.ad) {
               $$5.a(bxy.e, new ffq((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ffl a(float $$0, jb $$1, float $$2, ffq $$3) {
      return a($$0, $$1, -1.0F, $$2, $$3);
   }

   public static ffl a(float $$0, jb $$1, float $$2, float $$3, ffq $$4) {
      ffl $$5 = new ffl((double)(-$$0) * 0.5, 0.0, (double)(-$$0) * 0.5, (double)$$0 * 0.5, (double)$$0, (double)$$0 * 0.5);
      double $$6 = (double)Math.max($$2, $$3);
      double $$7 = (double)Math.min($$2, $$3);
      ffl $$8 = $$5.b((double)$$1.j() * $$6 * (double)$$0, (double)$$1.k() * $$6 * (double)$$0, (double)$$1.l() * $$6 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$7) * (double)$$0);
      return $$8.d($$4.d, $$4.e, $$4.f);
   }

   @Override
   public boolean a(bwt $$0, boolean $$1) {
      if (this.dV().A_()) {
         this.bU = null;
         this.bV = 0;
      }

      this.a(jb.a);
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
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      this.w(0.0F);
      this.aX = this.dL();
      this.bx();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bxy $$0, ffq $$1) {
      if ($$0 == bxy.d) {
         this.m();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ffq dy() {
      return ffq.c;
   }

   @Override
   public void i(ffq $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      iv $$3 = this.dv();
      if (this.bY()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azo.a($$0) + 0.5, (double)azo.a($$1 + 0.5), (double)azo.a($$2) + 0.5);
      }

      if (this.af != 0) {
         iv $$4 = this.dv();
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
   protected jb h(iv $$0) {
      for (jb $$1 : jb.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(iv $$0, jb $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jb $$2 = $$1.g();
         if (!this.dV().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ffl $$3 = a(this.el(), $$2, 1.0F, $$0.c()).h(1.0E-6);
            return this.dV().a(this, $$3);
         }
      }
   }

   private boolean i(iv $$0) {
      ebe $$1 = this.dV().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dne.ca) && $$0.equals(this.dv());
         return !$$2;
      }
   }

   protected boolean m() {
      if (!this.gj() && this.bJ()) {
         iv $$0 = this.dv();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            iv $$2 = $$0.b(azo.b(this.ae, -8, 8), azo.b(this.ae, -8, 8), azo.b(this.ae, -8, 8));
            if ($$2.v() > this.dV().K_() && this.dV().v($$2) && this.dV().E_().a($$2) && this.dV().a(this, new ffl($$2).h(1.0E-6))) {
               jb $$3 = this.h($$2);
               if ($$3 != null) {
                  this.al();
                  this.a($$3);
                  this.a(awp.xM, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dV().a(ege.R, $$0, ege.a.a(this));
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
   public bxp R_() {
      return null;
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (this.gw()) {
         bwt $$3 = $$1.c();
         if ($$3 instanceof csf) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eG() < (double)this.eU() * 0.5 && this.ae.a(4) == 0) {
            this.m();
         } else if ($$1.a(axf.j)) {
            bwt $$4 = $$1.c();
            if ($$4 != null && $$4.an() == bxc.be) {
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
      ffq $$0 = this.dt();
      ffl $$1 = this.cR();
      if (!this.gw() && this.m()) {
         int $$2 = this.dV().a(bxc.bd, $$1.g(8.0), bwt::bJ).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dV().A.i() < $$3)) {
            cpf $$4 = bxc.bd.a(this.dV(), bxb.e);
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

   public jb n() {
      return this.al.a(a);
   }

   private void a(jb $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(akl<?> $$0) {
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
         this.g(bza.a).c(d);
         if ($$0 == 0) {
            this.g(bza.a).d(e);
            this.a(awp.xG, 1.0F, 1.0F);
            this.a(ege.j);
         } else {
            this.a(awp.xK, 1.0F, 1.0F);
            this.a(ege.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return azo.h($$0, this.bS, this.bT);
   }

   @Override
   public void a(abx $$0) {
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
   public void h(bwt $$0) {
   }

   @Nullable
   public ffq K(float $$0) {
      if (this.bU != null && this.bV > 0) {
         double $$1 = (double)((float)this.bV - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.el();
         iv $$2 = this.dv();
         double $$3 = (double)($$2.u() - this.bU.u()) * $$1;
         double $$4 = (double)($$2.v() - this.bU.v()) * $$1;
         double $$5 = (double)($$2.w() - this.bU.w()) * $$1;
         return new ffq(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   private void a(Optional<cyw> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cyw> q() {
      return Optional.ofNullable(this.t());
   }

   @Nullable
   public cyw t() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cyw.a($$0) : null;
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aS ? c((kj<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aS);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aS) {
         this.a(Optional.of(c(kk.aS, $$1)));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   class a extends ceq {
      private int b;

      public a() {
         this.a(EnumSet.of(ceq.a.a, ceq.a.b));
      }

      @Override
      public boolean b() {
         bxu $$0 = cpf.this.f();
         return $$0 != null && $$0.bJ() ? cpf.this.dV().an() != buo.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cpf.this.b(100);
      }

      @Override
      public void e() {
         cpf.this.b(0);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cpf.this.dV().an() != buo.a) {
            this.b--;
            bxu $$0 = cpf.this.f();
            if ($$0 != null) {
               cpf.this.J().a($$0, 180.0F, 180.0F);
               double $$1 = cpf.this.g((bwt)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cpf.this.ae.a(10) * 20 / 2;
                     cpf.this.dV().b(new csv(cpf.this.dV(), cpf.this, $$0, cpf.this.n().o()));
                     cpf.this.a(awp.xL, 2.0F, (cpf.this.ae.i() - cpf.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cpf.this.g(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cdo {
      public b(bxw $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cgj<bxu> {
      public c(cpf $$0) {
         super($$0, bxu.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof cor);
      }

      @Override
      public boolean b() {
         return this.e.cq() == null ? false : super.b();
      }

      @Override
      protected ffl a(double $$0) {
         jb $$1 = ((cpf)this.e).n();
         if ($$1.o() == jb.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jb.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cds {
      public d(final bxw $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jb $$0 = cpf.this.n().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cpf.bQ));
         ka $$2 = $$0.q();
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
            : Optional.of((float)(azo.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cgj<crx> {
      public e(final cpf $$0) {
         super($$0, crx.class, true);
      }

      @Override
      public boolean b() {
         return cpf.this.dV().an() == buo.a ? false : super.b();
      }

      @Override
      protected ffl a(double $$0) {
         jb $$1 = ((cpf)this.e).n();
         if ($$1.o() == jb.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jb.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends ceq {
      private int b;

      @Override
      public boolean b() {
         return cpf.this.f() == null && cpf.this.ae.a(b(40)) == 0 && cpf.this.a(cpf.this.dv(), cpf.this.n());
      }

      @Override
      public boolean c() {
         return cpf.this.f() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cpf.this.ae.a(3)));
         cpf.this.b(30);
      }

      @Override
      public void e() {
         if (cpf.this.f() == null) {
            cpf.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
