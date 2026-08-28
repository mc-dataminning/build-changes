import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cmu extends chl implements bwx<Optional<cwd>>, cmg {
   private static final alp d = alp.b("covered");
   private static final bxd bZ = new bxd(d, 20.0, bxd.a.a);
   protected static final aks<jm> a = akw.a(cmu.class, aku.q);
   protected static final aks<Byte> b = akw.a(cmu.class, aku.a);
   protected static final aks<Byte> c = akw.a(cmu.class, aku.a);
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

   public cmu(bvi<? extends cmu> $$0, dgz $$1) {
      super($$0, $$1);
      this.bO = 5;
      this.bP = new cmu.d(this);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cdd(this, cpo.class, 8.0F, 0.02F, true));
      this.bT.a(4, new cmu.a());
      this.bT.a(7, new cmu.f());
      this.bT.a(8, new cdq(this));
      this.bU.a(1, new cen(this, this.getClass()).a());
      this.bU.a(2, new cmu.e(this));
      this.bU.a(3, new cmu.c(this));
   }

   @Override
   protected bvb.c bg() {
      return bvb.c.a;
   }

   @Override
   public aww dn() {
      return aww.f;
   }

   @Override
   protected awu u() {
      return awv.xl;
   }

   @Override
   public void R() {
      if (!this.gs()) {
         super.R();
      }
   }

   @Override
   protected awu o_() {
      return awv.xr;
   }

   @Override
   protected awu e(btr $$0) {
      return this.gs() ? awv.xt : awv.xs;
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(a, jm.a);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static bxe.a m() {
      return bvz.C().a(bxf.s, 30.0);
   }

   @Override
   protected cbt G() {
      return new cmu.b(this);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a(jm.a($$0.f("AttachFace")));
      this.al.a(b, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.al.a(c, $$0.f("Color"));
      }
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.t().d());
      $$0.a("Peek", this.al.a(b));
      $$0.a("Color", this.al.a(c));
   }

   @Override
   public void h() {
      super.h();
      if (!this.dW().C && !this.bZ() && !this.a(this.dw(), this.t())) {
         this.gp();
      }

      if (this.gq()) {
         this.gr();
      }

      if (this.dW().C) {
         if (this.cm > 0) {
            this.cm--;
         } else {
            this.cl = null;
         }
      }
   }

   private void gp() {
      jm $$0 = this.h(this.dw());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.p();
      }
   }

   @Override
   protected fbm ax() {
      float $$0 = L(this.ck);
      jm $$1 = this.t().g();
      float $$2 = this.dr() / 2.0F;
      return a(this.ek(), $$1, $$0).d(this.dB() - (double)$$2, this.dD(), this.dH() - (double)$$2);
   }

   private static float L(float $$0) {
      return 0.5F - azu.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gq() {
      this.cj = this.ck;
      float $$0 = (float)this.gu() * 0.01F;
      if (this.ck == $$0) {
         return false;
      } else {
         if (this.ck > $$0) {
            this.ck = azu.a(this.ck - 0.05F, $$0, 1.0F);
         } else {
            this.ck = azu.a(this.ck + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gr() {
      this.ay();
      float $$0 = L(this.ck);
      float $$1 = L(this.cj);
      jm $$2 = this.t().g();
      float $$3 = ($$0 - $$1) * this.ek();
      if (!($$3 <= 0.0F)) {
         for (bvb $$5 : this.dW().a(this, a(this.ek(), $$2, $$1, $$0).d(this.dB() - 0.5, this.dD(), this.dH() - 0.5), bvg.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cmu) && !$$5.ad) {
               $$5.a(bwb.e, new fbr((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static fbm a(float $$0, jm $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static fbm a(float $$0, jm $$1, float $$2, float $$3) {
      fbm $$4 = new fbm(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bvb $$0, boolean $$1) {
      if (this.dW().B_()) {
         this.cl = null;
         this.cm = 0;
      }

      this.a(jm.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ae() {
      super.ae();
      if (this.dW().C) {
         this.cl = this.dw();
      }

      this.aY = 0.0F;
      this.aX = 0.0F;
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      this.v(0.0F);
      this.aZ = this.dM();
      this.bz();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bwb $$0, fbr $$1) {
      if ($$0 == bwb.d) {
         this.p();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public fbr dz() {
      return fbr.c;
   }

   @Override
   public void h(fbr $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      jh $$3 = this.dw();
      if (this.bZ()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azu.a($$0) + 0.5, (double)azu.a($$1 + 0.5), (double)azu.a($$2) + 0.5);
      }

      if (this.af != 0) {
         jh $$4 = this.dw();
         if (!$$4.equals($$3)) {
            this.al.a(b, (byte)0);
            this.ar = true;
            if (this.dW().C && !this.bZ() && !$$4.equals(this.cl)) {
               this.cl = $$3;
               this.cm = 6;
               this.aa = this.dB();
               this.ab = this.dD();
               this.ac = this.dH();
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
         if (!this.dW().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            fbm $$3 = a(this.ek(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dW().a(this, $$3);
         }
      }
   }

   private boolean i(jh $$0) {
      dxo $$1 = this.dW().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dkf.bX) && $$0.equals(this.dw());
         return !$$2;
      }
   }

   protected boolean p() {
      if (!this.gb() && this.bL()) {
         jh $$0 = this.dw();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            jh $$2 = $$0.b(azu.b(this.ae, -8, 8), azu.b(this.ae, -8, 8), azu.b(this.ae, -8, 8));
            if ($$2.v() > this.dW().L_() && this.dW().u($$2) && this.dW().F_().a($$2) && this.dW().a(this, new fbm($$2).h(1.0E-6))) {
               jm $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ao();
                  this.a($$3);
                  this.a(awv.xw, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dW().a(eck.R, $$0, eck.a.a(this));
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
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.gs()) {
         bvb $$3 = $$1.c();
         if ($$3 instanceof cpv) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eE() < (double)this.eS() * 0.5 && this.ae.a(4) == 0) {
            this.p();
         } else if ($$1.a(axm.j)) {
            bvb $$4 = $$1.c();
            if ($$4 != null && $$4.aq() == bvi.bd) {
               this.gt();
            }
         }

         return true;
      }
   }

   private boolean gs() {
      return this.gu() == 0;
   }

   private void gt() {
      fbr $$0 = this.du();
      fbm $$1 = this.cR();
      if (!this.gs() && this.p()) {
         int $$2 = this.dW().a(bvi.bc, $$1.g(8.0), bvb::bL).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dW().A.i() < $$3)) {
            cmu $$4 = bvi.bc.a(this.dW(), bvh.e);
            if ($$4 != null) {
               $$4.a(this.x());
               $$4.e($$0);
               this.dW().b($$4);
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
   public void a(aks<?> $$0) {
      if (a.equals($$0)) {
         this.a(this.ax());
      }

      super.a($$0);
   }

   private int gu() {
      return this.al.a(b);
   }

   void b(int $$0) {
      if (!this.dW().C) {
         this.g(bxf.a).c(d);
         if ($$0 == 0) {
            this.g(bxf.a).d(bZ);
            this.a(awv.xq, 1.0F, 1.0F);
            this.a(eck.j);
         } else {
            this.a(awv.xu, 1.0F, 1.0F);
            this.a(eck.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return azu.h($$0, this.cj, this.ck);
   }

   @Override
   public void a(ach $$0) {
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
   public void h(bvb $$0) {
   }

   @Nullable
   public fbr K(float $$0) {
      if (this.cl != null && this.cm > 0) {
         double $$1 = (double)((float)this.cm - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.ek();
         jh $$2 = this.dw();
         double $$3 = (double)($$2.u() - this.cl.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cl.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cl.w()) * $$1;
         return new fbr(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cwd> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cwd> x() {
      return Optional.ofNullable(this.go());
   }

   @Nullable
   public cwd go() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cwd.a($$0) : null;
   }

   class a extends ccv {
      private int b;

      public a() {
         this.a(EnumSet.of(ccv.a.a, ccv.a.b));
      }

      @Override
      public boolean b() {
         bvx $$0 = cmu.this.O_();
         return $$0 != null && $$0.bL() ? cmu.this.dW().am() != bsx.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cmu.this.b(100);
      }

      @Override
      public void e() {
         cmu.this.b(0);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cmu.this.dW().am() != bsx.a) {
            this.b--;
            bvx $$0 = cmu.this.O_();
            if ($$0 != null) {
               cmu.this.H().a($$0, 180.0F, 180.0F);
               double $$1 = cmu.this.g((bvb)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cmu.this.ae.a(10) * 20 / 2;
                     cmu.this.dW().b(new cqk(cmu.this.dW(), cmu.this, $$0, cmu.this.t().o()));
                     cmu.this.a(awv.xv, 2.0F, (cmu.this.ae.i() - cmu.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cmu.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cbt {
      public b(bvz $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends ceo<bvx> {
      public c(cmu $$0) {
         super($$0, bvx.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof cmg);
      }

      @Override
      public boolean b() {
         return this.e.cr() == null ? false : super.b();
      }

      @Override
      protected fbm a(double $$0) {
         jm $$1 = ((cmu)this.e).t();
         if ($$1.o() == jm.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jm.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cbx {
      public d(final bvz $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jm $$0 = cmu.this.t().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cmu.ch));
         kl $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dB();
         double $$5 = this.f - this.a.dF();
         double $$6 = this.g - this.a.dH();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(azu.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends ceo<cpo> {
      public e(final cmu $$0) {
         super($$0, cpo.class, true);
      }

      @Override
      public boolean b() {
         return cmu.this.dW().am() == bsx.a ? false : super.b();
      }

      @Override
      protected fbm a(double $$0) {
         jm $$1 = ((cmu)this.e).t();
         if ($$1.o() == jm.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jm.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends ccv {
      private int b;

      @Override
      public boolean b() {
         return cmu.this.O_() == null && cmu.this.ae.a(b(40)) == 0 && cmu.this.a(cmu.this.dw(), cmu.this.t());
      }

      @Override
      public boolean c() {
         return cmu.this.O_() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cmu.this.ae.a(3)));
         cmu.this.b(30);
      }

      @Override
      public void e() {
         if (cmu.this.O_() == null) {
            cmu.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
