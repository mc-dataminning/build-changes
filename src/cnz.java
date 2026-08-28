import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cnz extends cil implements cnl {
   private static final ale d = ale.b("covered");
   private static final byd bF = new byd(d, 20.0, byd.a.a);
   protected static final akh<ja> a = akl.a(cnz.class, akj.q);
   protected static final akh<Byte> b = akl.a(cnz.class, akj.a);
   protected static final akh<Byte> c = akl.a(cnz.class, akj.a);
   private static final int bG = 6;
   private static final byte bH = 16;
   private static final byte bI = 16;
   private static final int bJ = 8;
   private static final int bK = 8;
   private static final int bL = 5;
   private static final float bM = 0.05F;
   static final Vector3f bN = af.a(() -> {
      jz $$0 = ja.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float bO = 3.0F;
   private float bP;
   private float bQ;
   @Nullable
   private iu bR;
   private int bS;
   private static final float bT = 1.0F;

   public cnz(bwj<? extends cnz> $$0, dip $$1) {
      super($$0, $$1);
      this.bx = 5;
      this.by = new cnz.d(this);
   }

   @Override
   protected void D() {
      this.bC.a(1, new ced(this, cqs.class, 8.0F, 0.02F, true));
      this.bC.a(4, new cnz.a());
      this.bC.a(7, new cnz.f());
      this.bC.a(8, new ceq(this));
      this.bD.a(1, new cfn(this, this.getClass()).a());
      this.bD.a(2, new cnz.e(this));
      this.bD.a(3, new cnz.c(this));
   }

   @Override
   protected bwa.d bg() {
      return bwa.d.a;
   }

   @Override
   public awm dm() {
      return awm.f;
   }

   @Override
   protected awk u() {
      return awl.xv;
   }

   @Override
   public void T() {
      if (!this.gs()) {
         super.T();
      }
   }

   @Override
   protected awk l_() {
      return awl.xB;
   }

   @Override
   protected awk e(bup $$0) {
      return this.gs() ? awl.xD : awl.xC;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(a, ja.a);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static bye.a j() {
      return bxb.E().a(byf.s, 30.0);
   }

   @Override
   protected cct I() {
      return new cnz.b(this);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(ja.a($$0.f("AttachFace")));
      this.al.a(b, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.al.a(c, $$0.f("Color"));
      }
   }

   @Override
   public void b(tx $$0) {
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
         if (this.bS > 0) {
            this.bS--;
         } else {
            this.bR = null;
         }
      }
   }

   private void x() {
      ja $$0 = this.h(this.dv());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.m();
      }
   }

   @Override
   protected fdr c(fdw $$0) {
      float $$1 = L(this.bQ);
      ja $$2 = this.n().g();
      return a(this.ek(), $$2, $$1, $$0);
   }

   private static float L(float $$0) {
      return 0.5F - azk.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gq() {
      this.bP = this.bQ;
      float $$0 = (float)this.gu() * 0.01F;
      if (this.bQ == $$0) {
         return false;
      } else {
         if (this.bQ > $$0) {
            this.bQ = azk.a(this.bQ - 0.05F, $$0, 1.0F);
         } else {
            this.bQ = azk.a(this.bQ + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gr() {
      this.ay();
      float $$0 = L(this.bQ);
      float $$1 = L(this.bP);
      ja $$2 = this.n().g();
      float $$3 = ($$0 - $$1) * this.ek();
      if (!($$3 <= 0.0F)) {
         for (bwa $$5 : this.dV().a(this, a(this.ek(), $$2, $$1, $$0, this.dt()), bwh.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cnz) && !$$5.ad) {
               $$5.a(bxd.e, new fdw((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static fdr a(float $$0, ja $$1, float $$2, fdw $$3) {
      return a($$0, $$1, -1.0F, $$2, $$3);
   }

   public static fdr a(float $$0, ja $$1, float $$2, float $$3, fdw $$4) {
      fdr $$5 = new fdr((double)(-$$0) * 0.5, 0.0, (double)(-$$0) * 0.5, (double)$$0 * 0.5, (double)$$0, (double)$$0 * 0.5);
      double $$6 = (double)Math.max($$2, $$3);
      double $$7 = (double)Math.min($$2, $$3);
      fdr $$8 = $$5.b((double)$$1.j() * $$6 * (double)$$0, (double)$$1.k() * $$6 * (double)$$0, (double)$$1.l() * $$6 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$7) * (double)$$0);
      return $$8.d($$4.d, $$4.e, $$4.f);
   }

   @Override
   public boolean a(bwa $$0, boolean $$1) {
      if (this.dV().w_()) {
         this.bR = null;
         this.bS = 0;
      }

      this.a(ja.a);
      return super.a($$0, $$1);
   }

   @Override
   public void bP() {
      super.bP();
      if (this.dV().C) {
         this.bR = this.dv();
      }

      this.aW = 0.0F;
      this.aV = 0.0F;
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      this.w(0.0F);
      this.aX = this.dL();
      this.by();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bxd $$0, fdw $$1) {
      if ($$0 == bxd.d) {
         this.m();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public fdw dy() {
      return fdw.c;
   }

   @Override
   public void i(fdw $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      iu $$3 = this.dv();
      if (this.bZ()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azk.a($$0) + 0.5, (double)azk.a($$1 + 0.5), (double)azk.a($$2) + 0.5);
      }

      if (this.af != 0) {
         iu $$4 = this.dv();
         if (!$$4.equals($$3)) {
            this.al.a(b, (byte)0);
            this.ar = true;
            if (this.dV().C && !this.bZ() && !$$4.equals(this.bR)) {
               this.bR = $$3;
               this.bS = 6;
               this.aa = this.dA();
               this.ab = this.dC();
               this.ac = this.dG();
            }
         }
      }
   }

   @Nullable
   protected ja h(iu $$0) {
      for (ja $$1 : ja.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(iu $$0, ja $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         ja $$2 = $$1.g();
         if (!this.dV().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            fdr $$3 = a(this.ek(), $$2, 1.0F, $$0.c()).h(1.0E-6);
            return this.dV().a(this, $$3);
         }
      }
   }

   private boolean i(iu $$0) {
      dzo $$1 = this.dV().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dlw.bX) && $$0.equals(this.dv());
         return !$$2;
      }
   }

   protected boolean m() {
      if (!this.gf() && this.bK()) {
         iu $$0 = this.dv();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            iu $$2 = $$0.b(azk.b(this.ae, -8, 8), azk.b(this.ae, -8, 8), azk.b(this.ae, -8, 8));
            if ($$2.v() > this.dV().G_() && this.dV().v($$2) && this.dV().A_().a($$2) && this.dV().a(this, new fdr($$2).h(1.0E-6))) {
               ja $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ao();
                  this.a($$3);
                  this.a(awl.xG, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dV().a(eeo.R, $$0, eeo.a.a(this));
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
   public bwu N_() {
      return null;
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.gs()) {
         bwa $$3 = $$1.c();
         if ($$3 instanceof cqz) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eF() < (double)this.eT() * 0.5 && this.ae.a(4) == 0) {
            this.m();
         } else if ($$1.a(axb.j)) {
            bwa $$4 = $$1.c();
            if ($$4 != null && $$4.aq() == bwj.bd) {
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
      fdw $$0 = this.dt();
      fdr $$1 = this.cR();
      if (!this.gs() && this.m()) {
         int $$2 = this.dV().a(bwj.bc, $$1.g(8.0), bwa::bK).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dV().A.i() < $$3)) {
            cnz $$4 = bwj.bc.a(this.dV(), bwi.e);
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

   public ja n() {
      return this.al.a(a);
   }

   private void a(ja $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(akh<?> $$0) {
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
         this.g(byf.a).c(d);
         if ($$0 == 0) {
            this.g(byf.a).d(bF);
            this.a(awl.xA, 1.0F, 1.0F);
            this.a(eeo.j);
         } else {
            this.a(awl.xE, 1.0F, 1.0F);
            this.a(eeo.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return azk.h($$0, this.bP, this.bQ);
   }

   @Override
   public void a(abt $$0) {
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
   public void h(bwa $$0) {
   }

   @Nullable
   public fdw K(float $$0) {
      if (this.bR != null && this.bS > 0) {
         double $$1 = (double)((float)this.bS - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.ek();
         iu $$2 = this.dv();
         double $$3 = (double)($$2.u() - this.bR.u()) * $$1;
         double $$4 = (double)($$2.v() - this.bR.v()) * $$1;
         double $$5 = (double)($$2.w() - this.bR.w()) * $$1;
         return new fdw(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   private void a(Optional<cxq> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cxq> q() {
      return Optional.ofNullable(this.t());
   }

   @Nullable
   public cxq t() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cxq.a($$0) : null;
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aP ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aP);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aP) {
         this.a(Optional.of(c(kj.aP, $$1)));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   class a extends cdv {
      private int b;

      public a() {
         this.a(EnumSet.of(cdv.a.a, cdv.a.b));
      }

      @Override
      public boolean b() {
         bwz $$0 = cnz.this.f();
         return $$0 != null && $$0.bK() ? cnz.this.dV().an() != btv.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cnz.this.b(100);
      }

      @Override
      public void e() {
         cnz.this.b(0);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (cnz.this.dV().an() != btv.a) {
            this.b--;
            bwz $$0 = cnz.this.f();
            if ($$0 != null) {
               cnz.this.J().a($$0, 180.0F, 180.0F);
               double $$1 = cnz.this.g((bwa)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cnz.this.ae.a(10) * 20 / 2;
                     cnz.this.dV().b(new crp(cnz.this.dV(), cnz.this, $$0, cnz.this.n().o()));
                     cnz.this.a(awl.xF, 2.0F, (cnz.this.ae.i() - cnz.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cnz.this.g(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cct {
      public b(bxb $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cfo<bwz> {
      public c(cnz $$0) {
         super($$0, bwz.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof cnl);
      }

      @Override
      public boolean b() {
         return this.e.cr() == null ? false : super.b();
      }

      @Override
      protected fdr a(double $$0) {
         ja $$1 = ((cnz)this.e).n();
         if ($$1.o() == ja.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ja.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends ccx {
      public d(final bxb $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ja $$0 = cnz.this.n().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cnz.bN));
         jz $$2 = $$0.q();
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

   class e extends cfo<cqs> {
      public e(final cnz $$0) {
         super($$0, cqs.class, true);
      }

      @Override
      public boolean b() {
         return cnz.this.dV().an() == btv.a ? false : super.b();
      }

      @Override
      protected fdr a(double $$0) {
         ja $$1 = ((cnz)this.e).n();
         if ($$1.o() == ja.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ja.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cdv {
      private int b;

      @Override
      public boolean b() {
         return cnz.this.f() == null && cnz.this.ae.a(b(40)) == 0 && cnz.this.a(cnz.this.dv(), cnz.this.n());
      }

      @Override
      public boolean c() {
         return cnz.this.f() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cnz.this.ae.a(3)));
         cnz.this.b(30);
      }

      @Override
      public void e() {
         if (cnz.this.f() == null) {
            cnz.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
