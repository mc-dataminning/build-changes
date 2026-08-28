import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cnp extends cid implements cnb {
   private static final ald d = ald.b("covered");
   private static final bxv bE = new bxv(d, 20.0, bxv.a.a);
   protected static final akg<jo> a = akk.a(cnp.class, aki.q);
   protected static final akg<Byte> b = akk.a(cnp.class, aki.a);
   protected static final akg<Byte> c = akk.a(cnp.class, aki.a);
   private static final int bF = 6;
   private static final byte bG = 16;
   private static final byte bH = 16;
   private static final int bI = 8;
   private static final int bJ = 8;
   private static final int bK = 5;
   private static final float bL = 0.05F;
   static final Vector3f bM = af.a(() -> {
      kn $$0 = jo.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float bN = 3.0F;
   private float bO;
   private float bP;
   @Nullable
   private jj bQ;
   private int bR;
   private static final float bS = 1.0F;

   public cnp(bwb<? extends cnp> $$0, dhp $$1) {
      super($$0, $$1);
      this.bw = 5;
      this.bx = new cnp.d(this);
   }

   @Override
   protected void D() {
      this.bB.a(1, new cdv(this, cqi.class, 8.0F, 0.02F, true));
      this.bB.a(4, new cnp.a());
      this.bB.a(7, new cnp.f());
      this.bB.a(8, new cei(this));
      this.bC.a(1, new cff(this, this.getClass()).a());
      this.bC.a(2, new cnp.e(this));
      this.bC.a(3, new cnp.c(this));
   }

   @Override
   protected bvs.d bg() {
      return bvs.d.a;
   }

   @Override
   public awl dm() {
      return awl.f;
   }

   @Override
   protected awj u() {
      return awk.xv;
   }

   @Override
   public void T() {
      if (!this.gs()) {
         super.T();
      }
   }

   @Override
   protected awj l_() {
      return awk.xB;
   }

   @Override
   protected awj e(buh $$0) {
      return this.gs() ? awk.xD : awk.xC;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(a, jo.a);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static bxw.a j() {
      return bwt.E().a(bxx.s, 30.0);
   }

   @Override
   protected ccl I() {
      return new cnp.b(this);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a(jo.a($$0.f("AttachFace")));
      this.al.a(b, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.al.a(c, $$0.f("Color"));
      }
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.n().d());
      $$0.a("Peek", this.al.a(b));
      $$0.a("Color", this.al.a(c));
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C && !this.bZ() && !this.a(this.dv(), this.n())) {
         this.x();
      }

      if (this.gq()) {
         this.gr();
      }

      if (this.dV().C) {
         if (this.bR > 0) {
            this.bR--;
         } else {
            this.bQ = null;
         }
      }
   }

   private void x() {
      jo $$0 = this.i(this.dv());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.m();
      }
   }

   @Override
   protected fcp c(fcu $$0) {
      float $$1 = M(this.bP);
      jo $$2 = this.n().g();
      return a(this.ek(), $$2, $$1, $$0);
   }

   private static float M(float $$0) {
      return 0.5F - azk.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gq() {
      this.bO = this.bP;
      float $$0 = (float)this.gu() * 0.01F;
      if (this.bP == $$0) {
         return false;
      } else {
         if (this.bP > $$0) {
            this.bP = azk.a(this.bP - 0.05F, $$0, 1.0F);
         } else {
            this.bP = azk.a(this.bP + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gr() {
      this.ay();
      float $$0 = M(this.bP);
      float $$1 = M(this.bO);
      jo $$2 = this.n().g();
      float $$3 = ($$0 - $$1) * this.ek();
      if (!($$3 <= 0.0F)) {
         for (bvs $$5 : this.dV().a(this, a(this.ek(), $$2, $$1, $$0, this.dt()), bvz.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cnp) && !$$5.ad) {
               $$5.a(bwv.e, new fcu((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static fcp a(float $$0, jo $$1, float $$2, fcu $$3) {
      return a($$0, $$1, -1.0F, $$2, $$3);
   }

   public static fcp a(float $$0, jo $$1, float $$2, float $$3, fcu $$4) {
      fcp $$5 = new fcp((double)(-$$0) * 0.5, 0.0, (double)(-$$0) * 0.5, (double)$$0 * 0.5, (double)$$0, (double)$$0 * 0.5);
      double $$6 = (double)Math.max($$2, $$3);
      double $$7 = (double)Math.min($$2, $$3);
      fcp $$8 = $$5.b((double)$$1.j() * $$6 * (double)$$0, (double)$$1.k() * $$6 * (double)$$0, (double)$$1.l() * $$6 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$7) * (double)$$0);
      return $$8.d($$4.d, $$4.e, $$4.f);
   }

   @Override
   public boolean a(bvs $$0, boolean $$1) {
      if (this.dV().w_()) {
         this.bQ = null;
         this.bR = 0;
      }

      this.a(jo.a);
      return super.a($$0, $$1);
   }

   @Override
   public void bP() {
      super.bP();
      if (this.dV().C) {
         this.bQ = this.dv();
      }

      this.aV = 0.0F;
      this.aU = 0.0F;
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      this.w(0.0F);
      this.aW = this.dL();
      this.by();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bwv $$0, fcu $$1) {
      if ($$0 == bwv.d) {
         this.m();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public fcu dy() {
      return fcu.c;
   }

   @Override
   public void i(fcu $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      jj $$3 = this.dv();
      if (this.bZ()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azk.a($$0) + 0.5, (double)azk.a($$1 + 0.5), (double)azk.a($$2) + 0.5);
      }

      if (this.af != 0) {
         jj $$4 = this.dv();
         if (!$$4.equals($$3)) {
            this.al.a(b, (byte)0);
            this.ar = true;
            if (this.dV().C && !this.bZ() && !$$4.equals(this.bQ)) {
               this.bQ = $$3;
               this.bR = 6;
               this.aa = this.dA();
               this.ab = this.dC();
               this.ac = this.dG();
            }
         }
      }
   }

   @Nullable
   protected jo i(jj $$0) {
      for (jo $$1 : jo.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(jj $$0, jo $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         jo $$2 = $$1.g();
         if (!this.dV().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            fcp $$3 = a(this.ek(), $$2, 1.0F, $$0.c()).h(1.0E-6);
            return this.dV().a(this, $$3);
         }
      }
   }

   private boolean j(jj $$0) {
      dym $$1 = this.dV().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dkw.bX) && $$0.equals(this.dv());
         return !$$2;
      }
   }

   protected boolean m() {
      if (!this.gf() && this.bK()) {
         jj $$0 = this.dv();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            jj $$2 = $$0.b(azk.b(this.ae, -8, 8), azk.b(this.ae, -8, 8), azk.b(this.ae, -8, 8));
            if ($$2.v() > this.dV().G_() && this.dV().u($$2) && this.dV().A_().a($$2) && this.dV().a(this, new fcp($$2).h(1.0E-6))) {
               jo $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ao();
                  this.a($$3);
                  this.a(awk.xG, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dV().a(edm.R, $$0, edm.a.a(this));
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
   public bwm N_() {
      return null;
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.gs()) {
         bvs $$3 = $$1.c();
         if ($$3 instanceof cqp) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eF() < (double)this.eT() * 0.5 && this.ae.a(4) == 0) {
            this.m();
         } else if ($$1.a(axb.j)) {
            bvs $$4 = $$1.c();
            if ($$4 != null && $$4.aq() == bwb.bc) {
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
      fcu $$0 = this.dt();
      fcp $$1 = this.cR();
      if (!this.gs() && this.m()) {
         int $$2 = this.dV().a(bwb.bb, $$1.g(8.0), bvs::bK).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dV().A.i() < $$3)) {
            cnp $$4 = bwb.bb.a(this.dV(), bwa.e);
            if ($$4 != null) {
               $$4.a(this.q());
               $$4.f($$0);
               this.dV().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bM() {
      return this.bK();
   }

   public jo n() {
      return this.al.a(a);
   }

   private void a(jo $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(akg<?> $$0) {
      if (a.equals($$0)) {
         this.a(this.ax());
      }

      super.a($$0);
   }

   private int gu() {
      return this.al.a(b);
   }

   void b(int $$0) {
      if (!this.dV().C) {
         this.g(bxx.a).c(d);
         if ($$0 == 0) {
            this.g(bxx.a).d(bE);
            this.a(awk.xA, 1.0F, 1.0F);
            this.a(edm.j);
         } else {
            this.a(awk.xE, 1.0F, 1.0F);
            this.a(edm.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float K(float $$0) {
      return azk.h($$0, this.bO, this.bP);
   }

   @Override
   public void a(abs $$0) {
      super.a($$0);
      this.aU = 0.0F;
      this.aV = 0.0F;
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
   public void h(bvs $$0) {
   }

   @Nullable
   public fcu L(float $$0) {
      if (this.bQ != null && this.bR > 0) {
         double $$1 = (double)((float)this.bR - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.ek();
         jj $$2 = this.dv();
         double $$3 = (double)($$2.u() - this.bQ.u()) * $$1;
         double $$4 = (double)($$2.v() - this.bQ.v()) * $$1;
         double $$5 = (double)($$2.w() - this.bQ.w()) * $$1;
         return new fcu(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   private void a(Optional<cwv> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cwv> q() {
      return Optional.ofNullable(this.t());
   }

   @Nullable
   public cwv t() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cwv.a($$0) : null;
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.aM ? b((kw<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.aM);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.aM) {
         this.a(Optional.of(b(kx.aM, $$1)));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   class a extends cdn {
      private int b;

      public a() {
         this.a(EnumSet.of(cdn.a.a, cdn.a.b));
      }

      @Override
      public boolean b() {
         bwr $$0 = cnp.this.f();
         return $$0 != null && $$0.bK() ? cnp.this.dV().an() != btn.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cnp.this.b(100);
      }

      @Override
      public void e() {
         cnp.this.b(0);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (cnp.this.dV().an() != btn.a) {
            this.b--;
            bwr $$0 = cnp.this.f();
            if ($$0 != null) {
               cnp.this.J().a($$0, 180.0F, 180.0F);
               double $$1 = cnp.this.g((bvs)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cnp.this.ae.a(10) * 20 / 2;
                     cnp.this.dV().b(new cre(cnp.this.dV(), cnp.this, $$0, cnp.this.n().o()));
                     cnp.this.a(awk.xF, 2.0F, (cnp.this.ae.i() - cnp.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cnp.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends ccl {
      public b(bwt $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cfg<bwr> {
      public c(cnp $$0) {
         super($$0, bwr.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof cnb);
      }

      @Override
      public boolean b() {
         return this.e.cr() == null ? false : super.b();
      }

      @Override
      protected fcp a(double $$0) {
         jo $$1 = ((cnp)this.e).n();
         if ($$1.o() == jo.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jo.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends ccp {
      public d(final bwt $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jo $$0 = cnp.this.n().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cnp.bM));
         kn $$2 = $$0.q();
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
            : Optional.of((float)(azk.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cfg<cqi> {
      public e(final cnp $$0) {
         super($$0, cqi.class, true);
      }

      @Override
      public boolean b() {
         return cnp.this.dV().an() == btn.a ? false : super.b();
      }

      @Override
      protected fcp a(double $$0) {
         jo $$1 = ((cnp)this.e).n();
         if ($$1.o() == jo.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jo.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cdn {
      private int b;

      @Override
      public boolean b() {
         return cnp.this.f() == null && cnp.this.ae.a(b(40)) == 0 && cnp.this.a(cnp.this.dv(), cnp.this.n());
      }

      @Override
      public boolean c() {
         return cnp.this.f() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cnp.this.ae.a(3)));
         cnp.this.b(30);
      }

      @Override
      public void e() {
         if (cnp.this.f() == null) {
            cnp.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
