import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cof extends cip implements cnr {
   private static final alg d = alg.b("covered");
   private static final byg bF = new byg(d, 20.0, byg.a.a);
   protected static final akj<ja> a = akn.a(cof.class, akl.q);
   protected static final akj<Byte> b = akn.a(cof.class, akl.a);
   protected static final akj<Byte> c = akn.a(cof.class, akl.a);
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

   public cof(bwm<? extends cof> $$0, div $$1) {
      super($$0, $$1);
      this.bx = 5;
      this.by = new cof.d(this);
   }

   @Override
   protected void D() {
      this.bC.a(1, new ceg(this, cqy.class, 8.0F, 0.02F, true));
      this.bC.a(4, new cof.a());
      this.bC.a(7, new cof.f());
      this.bC.a(8, new cet(this));
      this.bD.a(1, new cfq(this, this.getClass()).a());
      this.bD.a(2, new cof.e(this));
      this.bD.a(3, new cof.c(this));
   }

   @Override
   protected bwd.d bg() {
      return bwd.d.a;
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return awn.xy;
   }

   @Override
   public void T() {
      if (!this.gs()) {
         super.T();
      }
   }

   @Override
   protected awm l_() {
      return awn.xE;
   }

   @Override
   protected awm e(bus $$0) {
      return this.gs() ? awn.xG : awn.xF;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, ja.a);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static byh.a j() {
      return bxe.E().a(byi.s, 30.0);
   }

   @Override
   protected ccw I() {
      return new cof.b(this);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(ja.a($$0.f("AttachFace")));
      this.al.a(b, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.al.a(c, $$0.f("Color"));
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.n().d());
      $$0.a("Peek", this.al.a(b).byteValue());
      $$0.a("Color", this.al.a(c).byteValue());
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
   protected fed c(fei $$0) {
      float $$1 = L(this.bQ);
      ja $$2 = this.n().g();
      return a(this.ek(), $$2, $$1, $$0);
   }

   private static float L(float $$0) {
      return 0.5F - azm.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gq() {
      this.bP = this.bQ;
      float $$0 = (float)this.gu() * 0.01F;
      if (this.bQ == $$0) {
         return false;
      } else {
         if (this.bQ > $$0) {
            this.bQ = azm.a(this.bQ - 0.05F, $$0, 1.0F);
         } else {
            this.bQ = azm.a(this.bQ + 0.05F, 0.0F, $$0);
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
         for (bwd $$5 : this.dV().a(this, a(this.ek(), $$2, $$1, $$0, this.dt()), bwk.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cof) && !$$5.ad) {
               $$5.a(bxg.e, new fei((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static fed a(float $$0, ja $$1, float $$2, fei $$3) {
      return a($$0, $$1, -1.0F, $$2, $$3);
   }

   public static fed a(float $$0, ja $$1, float $$2, float $$3, fei $$4) {
      fed $$5 = new fed((double)(-$$0) * 0.5, 0.0, (double)(-$$0) * 0.5, (double)$$0 * 0.5, (double)$$0, (double)$$0 * 0.5);
      double $$6 = (double)Math.max($$2, $$3);
      double $$7 = (double)Math.min($$2, $$3);
      fed $$8 = $$5.b((double)$$1.j() * $$6 * (double)$$0, (double)$$1.k() * $$6 * (double)$$0, (double)$$1.l() * $$6 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$7) * (double)$$0);
      return $$8.d($$4.d, $$4.e, $$4.f);
   }

   @Override
   public boolean a(bwd $$0, boolean $$1) {
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
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      this.w(0.0F);
      this.aX = this.dL();
      this.by();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bxg $$0, fei $$1) {
      if ($$0 == bxg.d) {
         this.m();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public fei dy() {
      return fei.c;
   }

   @Override
   public void i(fei $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      iu $$3 = this.dv();
      if (this.bZ()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azm.a($$0) + 0.5, (double)azm.a($$1 + 0.5), (double)azm.a($$2) + 0.5);
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
            fed $$3 = a(this.ek(), $$2, 1.0F, $$0.c()).h(1.0E-6);
            return this.dV().a(this, $$3);
         }
      }
   }

   private boolean i(iu $$0) {
      dzz $$1 = this.dV().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dmc.bY) && $$0.equals(this.dv());
         return !$$2;
      }
   }

   protected boolean m() {
      if (!this.gf() && this.bK()) {
         iu $$0 = this.dv();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            iu $$2 = $$0.b(azm.b(this.ae, -8, 8), azm.b(this.ae, -8, 8), azm.b(this.ae, -8, 8));
            if ($$2.v() > this.dV().G_() && this.dV().v($$2) && this.dV().A_().a($$2) && this.dV().a(this, new fed($$2).h(1.0E-6))) {
               ja $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ao();
                  this.a($$3);
                  this.a(awn.xJ, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dV().a(eez.R, $$0, eez.a.a(this));
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
   public bwx N_() {
      return null;
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (this.gs()) {
         bwd $$3 = $$1.c();
         if ($$3 instanceof crf) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eF() < (double)this.eT() * 0.5 && this.ae.a(4) == 0) {
            this.m();
         } else if ($$1.a(axd.j)) {
            bwd $$4 = $$1.c();
            if ($$4 != null && $$4.aq() == bwm.bd) {
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
      fei $$0 = this.dt();
      fed $$1 = this.cR();
      if (!this.gs() && this.m()) {
         int $$2 = this.dV().a(bwm.bc, $$1.g(8.0), bwd::bK).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dV().A.i() < $$3)) {
            cof $$4 = bwm.bc.a(this.dV(), bwl.e);
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
   public void a(akj<?> $$0) {
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
         this.g(byi.a).c(d);
         if ($$0 == 0) {
            this.g(byi.a).d(bF);
            this.a(awn.xD, 1.0F, 1.0F);
            this.a(eez.j);
         } else {
            this.a(awn.xH, 1.0F, 1.0F);
            this.a(eez.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return azm.h($$0, this.bP, this.bQ);
   }

   @Override
   public void a(abv $$0) {
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
   public void h(bwd $$0) {
   }

   @Nullable
   public fei K(float $$0) {
      if (this.bR != null && this.bS > 0) {
         double $$1 = (double)((float)this.bS - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.ek();
         iu $$2 = this.dv();
         double $$3 = (double)($$2.u() - this.bR.u()) * $$1;
         double $$4 = (double)($$2.v() - this.bR.v()) * $$1;
         double $$5 = (double)($$2.w() - this.bR.w()) * $$1;
         return new fei(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   private void a(Optional<cxw> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cxw> q() {
      return Optional.ofNullable(this.t());
   }

   @Nullable
   public cxw t() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cxw.a($$0) : null;
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aQ ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aQ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aQ) {
         this.a(Optional.of(c(kj.aQ, $$1)));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   class a extends cdy {
      private int b;

      public a() {
         this.a(EnumSet.of(cdy.a.a, cdy.a.b));
      }

      @Override
      public boolean b() {
         bxc $$0 = cof.this.f();
         return $$0 != null && $$0.bK() ? cof.this.dV().an() != bty.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cof.this.b(100);
      }

      @Override
      public void e() {
         cof.this.b(0);
      }

      @Override
      public boolean Q_() {
         return true;
      }

      @Override
      public void a() {
         if (cof.this.dV().an() != bty.a) {
            this.b--;
            bxc $$0 = cof.this.f();
            if ($$0 != null) {
               cof.this.J().a($$0, 180.0F, 180.0F);
               double $$1 = cof.this.g((bwd)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cof.this.ae.a(10) * 20 / 2;
                     cof.this.dV().b(new crv(cof.this.dV(), cof.this, $$0, cof.this.n().o()));
                     cof.this.a(awn.xI, 2.0F, (cof.this.ae.i() - cof.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cof.this.g(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends ccw {
      public b(bxe $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cfr<bxc> {
      public c(cof $$0) {
         super($$0, bxc.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof cnr);
      }

      @Override
      public boolean b() {
         return this.e.cr() == null ? false : super.b();
      }

      @Override
      protected fed a(double $$0) {
         ja $$1 = ((cof)this.e).n();
         if ($$1.o() == ja.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ja.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cda {
      public d(final bxe $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ja $$0 = cof.this.n().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cof.bN));
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
            : Optional.of((float)(azm.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cfr<cqy> {
      public e(final cof $$0) {
         super($$0, cqy.class, true);
      }

      @Override
      public boolean b() {
         return cof.this.dV().an() == bty.a ? false : super.b();
      }

      @Override
      protected fed a(double $$0) {
         ja $$1 = ((cof)this.e).n();
         if ($$1.o() == ja.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ja.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cdy {
      private int b;

      @Override
      public boolean b() {
         return cof.this.f() == null && cof.this.ae.a(b(40)) == 0 && cof.this.a(cof.this.dv(), cof.this.n());
      }

      @Override
      public boolean c() {
         return cof.this.f() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cof.this.ae.a(3)));
         cof.this.b(30);
      }

      @Override
      public void e() {
         if (cof.this.f() == null) {
            cof.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
