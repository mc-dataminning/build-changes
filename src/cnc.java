import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cnc extends cht implements bxf<Optional<cwl>>, cmo {
   private static final alz d = alz.b("covered");
   private static final bxl bZ = new bxl(d, 20.0, bxl.a.a);
   protected static final alc<jm> a = alg.a(cnc.class, ale.q);
   protected static final alc<Byte> b = alg.a(cnc.class, ale.a);
   protected static final alc<Byte> c = alg.a(cnc.class, ale.a);
   private static final int ca = 6;
   private static final byte cb = 16;
   private static final byte cc = 16;
   private static final int cd = 8;
   private static final int ce = 8;
   private static final int cf = 5;
   private static final float cg = 0.05F;
   static final Vector3f ch = ae.a(() -> {
      kl $$0 = jm.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ci = 3.0F;
   private float cj;
   private float ck;
   @Nullable
   private jh cl;
   private int cm;
   private static final float cn = 1.0F;

   public cnc(bvq<? extends cnc> $$0, dhh $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.bP = new cnc.d(this);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cdl(this, cpw.class, 8.0F, 0.02F, true));
      this.bT.a(4, new cnc.a());
      this.bT.a(7, new cnc.f());
      this.bT.a(8, new cdy(this));
      this.bU.a(1, new cev(this, this.getClass()).a());
      this.bU.a(2, new cnc.e(this));
      this.bU.a(3, new cnc.c(this));
   }

   @Override
   protected bvj.b bg() {
      return bvj.b.a;
   }

   @Override
   public axg dm() {
      return axg.f;
   }

   @Override
   protected axe u() {
      return axf.xf;
   }

   @Override
   public void R() {
      if (!this.gq()) {
         super.R();
      }
   }

   @Override
   protected axe o_() {
      return axf.xl;
   }

   @Override
   protected axe e(btz $$0) {
      return this.gq() ? axf.xn : axf.xm;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(a, jm.a);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static bxm.a m() {
      return bwh.C().a(bxn.s, 30.0);
   }

   @Override
   protected ccb G() {
      return new cnc.b(this);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(jm.a($$0.f("AttachFace")));
      this.al.a(b, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.al.a(c, $$0.f("Color"));
      }
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.t().d());
      $$0.a("Peek", this.al.a(b));
      $$0.a("Color", this.al.a(c));
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C && !this.bZ() && !this.a(this.dv(), this.t())) {
         this.gn();
      }

      if (this.go()) {
         this.gp();
      }

      if (this.dV().C) {
         if (this.cm > 0) {
            this.cm--;
         } else {
            this.cl = null;
         }
      }
   }

   private void gn() {
      jm $$0 = this.h(this.dv());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.p();
      }
   }

   @Override
   protected fbs ax() {
      float $$0 = L(this.ck);
      jm $$1 = this.t().g();
      float $$2 = this.dq() / 2.0F;
      return a(this.ej(), $$1, $$0).d(this.dA() - (double)$$2, this.dC(), this.dG() - (double)$$2);
   }

   private static float L(float $$0) {
      return 0.5F - bae.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean go() {
      this.cj = this.ck;
      float $$0 = (float)this.gs() * 0.01F;
      if (this.ck == $$0) {
         return false;
      } else {
         if (this.ck > $$0) {
            this.ck = bae.a(this.ck - 0.05F, $$0, 1.0F);
         } else {
            this.ck = bae.a(this.ck + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gp() {
      this.ay();
      float $$0 = L(this.ck);
      float $$1 = L(this.cj);
      jm $$2 = this.t().g();
      float $$3 = ($$0 - $$1) * this.ej();
      if (!($$3 <= 0.0F)) {
         for (bvj $$5 : this.dV().a(this, a(this.ej(), $$2, $$1, $$0).d(this.dA() - 0.5, this.dC(), this.dG() - 0.5), bvo.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cnc) && !$$5.ad) {
               $$5.a(bwj.e, new fbx((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static fbs a(float $$0, jm $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static fbs a(float $$0, jm $$1, float $$2, float $$3) {
      fbs $$4 = new fbs(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bvj $$0, boolean $$1) {
      if (this.dV().B_()) {
         this.cl = null;
         this.cm = 0;
      }

      this.a(jm.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ae() {
      super.ae();
      if (this.dV().C) {
         this.cl = this.dv();
      }

      this.aY = 0.0F;
      this.aX = 0.0F;
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      this.v(0.0F);
      this.aZ = this.dL();
      this.bz();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bwj $$0, fbx $$1) {
      if ($$0 == bwj.d) {
         this.p();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public fbx dy() {
      return fbx.c;
   }

   @Override
   public void h(fbx $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      jh $$3 = this.dv();
      if (this.bZ()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)bae.a($$0) + 0.5, (double)bae.a($$1 + 0.5), (double)bae.a($$2) + 0.5);
      }

      if (this.af != 0) {
         jh $$4 = this.dv();
         if (!$$4.equals($$3)) {
            this.al.a(b, (byte)0);
            this.ar = true;
            if (this.dV().C && !this.bZ() && !$$4.equals(this.cl)) {
               this.cl = $$3;
               this.cm = 6;
               this.aa = this.dA();
               this.ab = this.dC();
               this.ac = this.dG();
            }
         }
      }
   }

   @Nullable
   protected jm h(jh $$0) {
      for (jm $$1 : jm.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(jh $$0, jm $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jm $$2 = $$1.g();
         if (!this.dV().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            fbs $$3 = a(this.ej(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dV().a(this, $$3);
         }
      }
   }

   private boolean i(jh $$0) {
      dxu $$1 = this.dV().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dkn.bX) && $$0.equals(this.dv());
         return !$$2;
      }
   }

   protected boolean p() {
      if (!this.fZ() && this.bL()) {
         jh $$0 = this.dv();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            jh $$2 = $$0.b(bae.b(this.ae, -8, 8), bae.b(this.ae, -8, 8), bae.b(this.ae, -8, 8));
            if ($$2.v() > this.dV().L_() && this.dV().u($$2) && this.dV().F_().a($$2) && this.dV().a(this, new fbs($$2).h(1.0E-6))) {
               jm $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ao();
                  this.a($$3);
                  this.a(axf.xq, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dV().a(ecq.R, $$0, ecq.a.a(this));
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
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.br = 0;
      this.a_($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      if (this.gq()) {
         bvj $$3 = $$1.c();
         if ($$3 instanceof cqd) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eD() < (double)this.eR() * 0.5 && this.ae.a(4) == 0) {
            this.p();
         } else if ($$1.a(axw.j)) {
            bvj $$4 = $$1.c();
            if ($$4 != null && $$4.aq() == bvq.bd) {
               this.gr();
            }
         }

         return true;
      }
   }

   private boolean gq() {
      return this.gs() == 0;
   }

   private void gr() {
      fbx $$0 = this.dt();
      fbs $$1 = this.cR();
      if (!this.gq() && this.p()) {
         int $$2 = this.dV().a(bvq.bc, $$1.g(8.0), bvj::bL).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dV().A.i() < $$3)) {
            cnc $$4 = bvq.bc.a(this.dV(), bvp.e);
            if ($$4 != null) {
               $$4.a(this.x());
               $$4.e($$0);
               this.dV().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bN() {
      return this.bL();
   }

   public jm t() {
      return this.al.a(a);
   }

   private void a(jm $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(alc<?> $$0) {
      if (a.equals($$0)) {
         this.a(this.ax());
      }

      super.a($$0);
   }

   private int gs() {
      return this.al.a(b);
   }

   void b(int $$0) {
      if (!this.dV().C) {
         this.g(bxn.a).c(d);
         if ($$0 == 0) {
            this.g(bxn.a).d(bZ);
            this.a(axf.xk, 1.0F, 1.0F);
            this.a(ecq.j);
         } else {
            this.a(axf.xo, 1.0F, 1.0F);
            this.a(ecq.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return bae.h($$0, this.cj, this.ck);
   }

   @Override
   public void a(acs $$0) {
      super.a($$0);
      this.aX = 0.0F;
      this.aY = 0.0F;
   }

   @Override
   public int Z() {
      return 180;
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public void h(bvj $$0) {
   }

   @Nullable
   public fbx K(float $$0) {
      if (this.cl != null && this.cm > 0) {
         double $$1 = (double)((float)this.cm - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.ej();
         jh $$2 = this.dv();
         double $$3 = (double)($$2.u() - this.cl.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cl.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cl.w()) * $$1;
         return new fbx(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cwl> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cwl> x() {
      return Optional.ofNullable(this.gm());
   }

   @Nullable
   public cwl gm() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cwl.a($$0) : null;
   }

   class a extends cdd {
      private int b;

      public a() {
         this.a(EnumSet.of(cdd.a.a, cdd.a.b));
      }

      @Override
      public boolean b() {
         bwf $$0 = cnc.this.O_();
         return $$0 != null && $$0.bL() ? cnc.this.dV().al() != btf.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cnc.this.b(100);
      }

      @Override
      public void e() {
         cnc.this.b(0);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cnc.this.dV().al() != btf.a) {
            this.b--;
            bwf $$0 = cnc.this.O_();
            if ($$0 != null) {
               cnc.this.H().a($$0, 180.0F, 180.0F);
               double $$1 = cnc.this.g((bvj)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cnc.this.ae.a(10) * 20 / 2;
                     cnc.this.dV().b(new cqs(cnc.this.dV(), cnc.this, $$0, cnc.this.t().o()));
                     cnc.this.a(axf.xp, 2.0F, (cnc.this.ae.i() - cnc.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cnc.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends ccb {
      public b(bwh $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cew<bwf> {
      public c(cnc $$0) {
         super($$0, bwf.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof cmo);
      }

      @Override
      public boolean b() {
         return this.e.cr() == null ? false : super.b();
      }

      @Override
      protected fbs a(double $$0) {
         jm $$1 = ((cnc)this.e).t();
         if ($$1.o() == jm.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jm.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends ccf {
      public d(final bwh $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jm $$0 = cnc.this.t().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cnc.ch));
         kl $$2 = $$0.q();
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
            : Optional.of((float)(bae.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cew<cpw> {
      public e(final cnc $$0) {
         super($$0, cpw.class, true);
      }

      @Override
      public boolean b() {
         return cnc.this.dV().al() == btf.a ? false : super.b();
      }

      @Override
      protected fbs a(double $$0) {
         jm $$1 = ((cnc)this.e).t();
         if ($$1.o() == jm.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jm.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cdd {
      private int b;

      @Override
      public boolean b() {
         return cnc.this.O_() == null && cnc.this.ae.a(b(40)) == 0 && cnc.this.a(cnc.this.dv(), cnc.this.t());
      }

      @Override
      public boolean c() {
         return cnc.this.O_() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cnc.this.ae.a(3)));
         cnc.this.b(30);
      }

      @Override
      public void e() {
         if (cnc.this.O_() == null) {
            cnc.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
