import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cou extends ciw implements cof {
   private static final alg d = alg.b("covered");
   private static final byn bG = new byn(d, 20.0, byn.a.a);
   protected static final akj<jb> a = akn.a(cou.class, akl.q);
   protected static final akj<Byte> b = akn.a(cou.class, akl.a);
   protected static final akj<Byte> c = akn.a(cou.class, akl.a);
   private static final int bH = 6;
   private static final byte bI = 16;
   private static final byte bJ = 16;
   private static final int bK = 8;
   private static final int bL = 8;
   private static final int bM = 5;
   private static final float bN = 0.05F;
   static final Vector3f bO = ag.a(() -> {
      ka $$0 = jb.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float bP = 3.0F;
   private float bQ;
   private float bR;
   @Nullable
   private iv bS;
   private int bT;
   private static final float bU = 1.0F;

   public cou(bwr<? extends cou> $$0, djm $$1) {
      super($$0, $$1);
      this.by = 5;
      this.bz = new cou.d(this);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cen(this, crm.class, 8.0F, 0.02F, true));
      this.bD.a(4, new cou.a());
      this.bD.a(7, new cou.f());
      this.bD.a(8, new cfa(this));
      this.bE.a(1, new cfx(this, this.getClass()).a());
      this.bE.a(2, new cou.e(this));
      this.bE.a(3, new cou.c(this));
   }

   @Override
   protected bwi.c be() {
      return bwi.c.a;
   }

   @Override
   public awo dl() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return awn.xB;
   }

   @Override
   public void T() {
      if (!this.gv()) {
         super.T();
      }
   }

   @Override
   protected awm l_() {
      return awn.xH;
   }

   @Override
   protected awm e(bux $$0) {
      return this.gv() ? awn.xJ : awn.xI;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, jb.a);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static byo.a j() {
      return bxl.E().a(byp.s, 30.0);
   }

   @Override
   protected cdd I() {
      return new cou.b(this);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<jb>a("AttachFace", jb.k).orElse(jb.a));
      this.al.a(b, $$0.d("Peek"));
      if ($$0.b("Color", 99)) {
         this.al.a(c, $$0.d("Color"));
      }
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
      if (!this.dU().C && !this.bX() && !this.a(this.du(), this.n())) {
         this.x();
      }

      if (this.gt()) {
         this.gu();
      }

      if (this.dU().C) {
         if (this.bT > 0) {
            this.bT--;
         } else {
            this.bS = null;
         }
      }
   }

   private void x() {
      jb $$0 = this.h(this.du());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.m();
      }
   }

   @Override
   protected fex c(ffc $$0) {
      float $$1 = L(this.bR);
      jb $$2 = this.n().g();
      return a(this.ek(), $$2, $$1, $$0);
   }

   private static float L(float $$0) {
      return 0.5F - azm.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gt() {
      this.bQ = this.bR;
      float $$0 = (float)this.gx() * 0.01F;
      if (this.bR == $$0) {
         return false;
      } else {
         if (this.bR > $$0) {
            this.bR = azm.a(this.bR - 0.05F, $$0, 1.0F);
         } else {
            this.bR = azm.a(this.bR + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gu() {
      this.av();
      float $$0 = L(this.bR);
      float $$1 = L(this.bQ);
      jb $$2 = this.n().g();
      float $$3 = ($$0 - $$1) * this.ek();
      if (!($$3 <= 0.0F)) {
         for (bwi $$5 : this.dU().a(this, a(this.ek(), $$2, $$1, $$0, this.ds()), bwp.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cou) && !$$5.ad) {
               $$5.a(bxn.e, new ffc((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static fex a(float $$0, jb $$1, float $$2, ffc $$3) {
      return a($$0, $$1, -1.0F, $$2, $$3);
   }

   public static fex a(float $$0, jb $$1, float $$2, float $$3, ffc $$4) {
      fex $$5 = new fex((double)(-$$0) * 0.5, 0.0, (double)(-$$0) * 0.5, (double)$$0 * 0.5, (double)$$0, (double)$$0 * 0.5);
      double $$6 = (double)Math.max($$2, $$3);
      double $$7 = (double)Math.min($$2, $$3);
      fex $$8 = $$5.b((double)$$1.j() * $$6 * (double)$$0, (double)$$1.k() * $$6 * (double)$$0, (double)$$1.l() * $$6 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$7) * (double)$$0);
      return $$8.d($$4.d, $$4.e, $$4.f);
   }

   @Override
   public boolean a(bwi $$0, boolean $$1) {
      if (this.dU().w_()) {
         this.bS = null;
         this.bT = 0;
      }

      this.a(jb.a);
      return super.a($$0, $$1);
   }

   @Override
   public void bN() {
      super.bN();
      if (this.dU().C) {
         this.bS = this.du();
      }

      this.aW = 0.0F;
      this.aV = 0.0F;
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      this.w(0.0F);
      this.aX = this.dK();
      this.bw();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bxn $$0, ffc $$1) {
      if ($$0 == bxn.d) {
         this.m();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ffc dx() {
      return ffc.c;
   }

   @Override
   public void i(ffc $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      iv $$3 = this.du();
      if (this.bX()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azm.a($$0) + 0.5, (double)azm.a($$1 + 0.5), (double)azm.a($$2) + 0.5);
      }

      if (this.af != 0) {
         iv $$4 = this.du();
         if (!$$4.equals($$3)) {
            this.al.a(b, (byte)0);
            this.ar = true;
            if (this.dU().C && !this.bX() && !$$4.equals(this.bS)) {
               this.bS = $$3;
               this.bT = 6;
               this.aa = this.dz();
               this.ab = this.dB();
               this.ac = this.dF();
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
         if (!this.dU().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            fex $$3 = a(this.ek(), $$2, 1.0F, $$0.c()).h(1.0E-6);
            return this.dU().a(this, $$3);
         }
      }
   }

   private boolean i(iv $$0) {
      eat $$1 = this.dU().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dmt.ca) && $$0.equals(this.du());
         return !$$2;
      }
   }

   protected boolean m() {
      if (!this.gi() && this.bI()) {
         iv $$0 = this.du();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            iv $$2 = $$0.b(azm.b(this.ae, -8, 8), azm.b(this.ae, -8, 8), azm.b(this.ae, -8, 8));
            if ($$2.v() > this.dU().G_() && this.dU().v($$2) && this.dU().A_().a($$2) && this.dU().a(this, new fex($$2).h(1.0E-6))) {
               jb $$3 = this.h($$2);
               if ($$3 != null) {
                  this.al();
                  this.a($$3);
                  this.a(awn.xM, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dU().a(eft.R, $$0, eft.a.a(this));
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
   public bxe N_() {
      return null;
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.gv()) {
         bwi $$3 = $$1.c();
         if ($$3 instanceof cru) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eF() < (double)this.eT() * 0.5 && this.ae.a(4) == 0) {
            this.m();
         } else if ($$1.a(axd.j)) {
            bwi $$4 = $$1.c();
            if ($$4 != null && $$4.an() == bwr.bd) {
               this.gw();
            }
         }

         return true;
      }
   }

   private boolean gv() {
      return this.gx() == 0;
   }

   private void gw() {
      ffc $$0 = this.ds();
      fex $$1 = this.cQ();
      if (!this.gv() && this.m()) {
         int $$2 = this.dU().a(bwr.bc, $$1.g(8.0), bwi::bI).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dU().A.i() < $$3)) {
            cou $$4 = bwr.bc.a(this.dU(), bwq.e);
            if ($$4 != null) {
               $$4.a(this.q());
               $$4.f($$0);
               this.dU().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bK() {
      return this.bI();
   }

   public jb n() {
      return this.al.a(a);
   }

   private void a(jb $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(akj<?> $$0) {
      if (a.equals($$0)) {
         this.a(this.au());
      }

      super.a($$0);
   }

   private int gx() {
      return this.al.a(b);
   }

   void b(int $$0) {
      if (!this.dU().C) {
         this.g(byp.a).c(d);
         if ($$0 == 0) {
            this.g(byp.a).d(bG);
            this.a(awn.xG, 1.0F, 1.0F);
            this.a(eft.j);
         } else {
            this.a(awn.xK, 1.0F, 1.0F);
            this.a(eft.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return azm.h($$0, this.bQ, this.bR);
   }

   @Override
   public void a(abv $$0) {
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
   public void h(bwi $$0) {
   }

   @Nullable
   public ffc K(float $$0) {
      if (this.bS != null && this.bT > 0) {
         double $$1 = (double)((float)this.bT - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.ek();
         iv $$2 = this.du();
         double $$3 = (double)($$2.u() - this.bS.u()) * $$1;
         double $$4 = (double)($$2.v() - this.bS.v()) * $$1;
         double $$5 = (double)($$2.w() - this.bS.w()) * $$1;
         return new ffc(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   private void a(Optional<cyl> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cyl> q() {
      return Optional.ofNullable(this.t());
   }

   @Nullable
   public cyl t() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cyl.a($$0) : null;
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

   class a extends cef {
      private int b;

      public a() {
         this.a(EnumSet.of(cef.a.a, cef.a.b));
      }

      @Override
      public boolean b() {
         bxj $$0 = cou.this.f();
         return $$0 != null && $$0.bI() ? cou.this.dU().an() != bud.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cou.this.b(100);
      }

      @Override
      public void e() {
         cou.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         if (cou.this.dU().an() != bud.a) {
            this.b--;
            bxj $$0 = cou.this.f();
            if ($$0 != null) {
               cou.this.J().a($$0, 180.0F, 180.0F);
               double $$1 = cou.this.g((bwi)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cou.this.ae.a(10) * 20 / 2;
                     cou.this.dU().b(new csk(cou.this.dU(), cou.this, $$0, cou.this.n().o()));
                     cou.this.a(awn.xL, 2.0F, (cou.this.ae.i() - cou.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cou.this.g(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cdd {
      public b(bxl $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cfy<bxj> {
      public c(cou $$0) {
         super($$0, bxj.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof cof);
      }

      @Override
      public boolean b() {
         return this.e.cp() == null ? false : super.b();
      }

      @Override
      protected fex a(double $$0) {
         jb $$1 = ((cou)this.e).n();
         if ($$1.o() == jb.a.a) {
            return this.e.cQ().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jb.a.c ? this.e.cQ().c($$0, $$0, 4.0) : this.e.cQ().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cdh {
      public d(final bxl $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jb $$0 = cou.this.n().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cou.bO));
         ka $$2 = $$0.q();
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
            : Optional.of((float)(azm.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cfy<crm> {
      public e(final cou $$0) {
         super($$0, crm.class, true);
      }

      @Override
      public boolean b() {
         return cou.this.dU().an() == bud.a ? false : super.b();
      }

      @Override
      protected fex a(double $$0) {
         jb $$1 = ((cou)this.e).n();
         if ($$1.o() == jb.a.a) {
            return this.e.cQ().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jb.a.c ? this.e.cQ().c($$0, $$0, 4.0) : this.e.cQ().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cef {
      private int b;

      @Override
      public boolean b() {
         return cou.this.f() == null && cou.this.ae.a(b(40)) == 0 && cou.this.a(cou.this.du(), cou.this.n());
      }

      @Override
      public boolean c() {
         return cou.this.f() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cou.this.ae.a(3)));
         cou.this.b(30);
      }

      @Override
      public void e() {
         if (cou.this.f() == null) {
            cou.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
