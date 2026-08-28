import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cph extends cjj implements cot {
   private static final alk d = alk.b("covered");
   private static final bza e = new bza(d, 20.0, bza.a.a);
   protected static final akn<jc> a = akr.a(cph.class, akp.q);
   protected static final akn<Byte> b = akr.a(cph.class, akp.a);
   protected static final akn<Byte> c = akr.a(cph.class, akp.a);
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

   public cph(bxe<? extends cph> $$0, djz $$1) {
      super($$0, $$1);
      this.bA = 5;
      this.bB = new cph.d(this);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cfa(this, crz.class, 8.0F, 0.02F, true));
      this.bF.a(4, new cph.a());
      this.bF.a(7, new cph.f());
      this.bF.a(8, new cfn(this));
      this.bG.a(1, new cgk(this, this.getClass()).a());
      this.bG.a(2, new cph.e(this));
      this.bG.a(3, new cph.c(this));
   }

   @Override
   protected bwv.c bf() {
      return bwv.c.a;
   }

   @Override
   public aws dm() {
      return aws.f;
   }

   @Override
   protected awq u() {
      return awr.xB;
   }

   @Override
   public void T() {
      if (!this.gw()) {
         super.T();
      }
   }

   @Override
   protected awq l_() {
      return awr.xH;
   }

   @Override
   protected awq e(bvk $$0) {
      return this.gw() ? awr.xJ : awr.xI;
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(a, bP);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static bzb.a j() {
      return bxy.E().a(bzc.s, 30.0);
   }

   @Override
   protected cdq I() {
      return new cph.b(this);
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
   protected ffn c(ffs $$0) {
      float $$1 = L(this.bT);
      jc $$2 = this.n().g();
      return a(this.el(), $$2, $$1, $$0);
   }

   private static float L(float $$0) {
      return 0.5F - azq.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gu() {
      this.bS = this.bT;
      float $$0 = (float)this.gy() * 0.01F;
      if (this.bT == $$0) {
         return false;
      } else {
         if (this.bT > $$0) {
            this.bT = azq.a(this.bT - 0.05F, $$0, 1.0F);
         } else {
            this.bT = azq.a(this.bT + 0.05F, 0.0F, $$0);
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
         for (bwv $$5 : this.dV().a(this, a(this.el(), $$2, $$1, $$0, this.dt()), bxc.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cph) && !$$5.ad) {
               $$5.a(bya.e, new ffs((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ffn a(float $$0, jc $$1, float $$2, ffs $$3) {
      return a($$0, $$1, -1.0F, $$2, $$3);
   }

   public static ffn a(float $$0, jc $$1, float $$2, float $$3, ffs $$4) {
      ffn $$5 = new ffn((double)(-$$0) * 0.5, 0.0, (double)(-$$0) * 0.5, (double)$$0 * 0.5, (double)$$0, (double)$$0 * 0.5);
      double $$6 = (double)Math.max($$2, $$3);
      double $$7 = (double)Math.min($$2, $$3);
      ffn $$8 = $$5.b((double)$$1.j() * $$6 * (double)$$0, (double)$$1.k() * $$6 * (double)$$0, (double)$$1.l() * $$6 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$7) * (double)$$0);
      return $$8.d($$4.d, $$4.e, $$4.f);
   }

   @Override
   public boolean a(bwv $$0, boolean $$1) {
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
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      this.w(0.0F);
      this.aX = this.dL();
      this.bx();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bya $$0, ffs $$1) {
      if ($$0 == bya.d) {
         this.m();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ffs dy() {
      return ffs.c;
   }

   @Override
   public void i(ffs $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      iw $$3 = this.dv();
      if (this.bY()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azq.a($$0) + 0.5, (double)azq.a($$1 + 0.5), (double)azq.a($$2) + 0.5);
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
            ffn $$3 = a(this.el(), $$2, 1.0F, $$0.c()).h(1.0E-6);
            return this.dV().a(this, $$3);
         }
      }
   }

   private boolean i(iw $$0) {
      ebg $$1 = this.dV().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dng.ca) && $$0.equals(this.dv());
         return !$$2;
      }
   }

   protected boolean m() {
      if (!this.gj() && this.bJ()) {
         iw $$0 = this.dv();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            iw $$2 = $$0.b(azq.b(this.ae, -8, 8), azq.b(this.ae, -8, 8), azq.b(this.ae, -8, 8));
            if ($$2.v() > this.dV().K_() && this.dV().v($$2) && this.dV().E_().a($$2) && this.dV().a(this, new ffn($$2).h(1.0E-6))) {
               jc $$3 = this.h($$2);
               if ($$3 != null) {
                  this.al();
                  this.a($$3);
                  this.a(awr.xM, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dV().a(egg.R, $$0, egg.a.a(this));
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
   public bxr R_() {
      return null;
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.gw()) {
         bwv $$3 = $$1.c();
         if ($$3 instanceof csh) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eG() < (double)this.eU() * 0.5 && this.ae.a(4) == 0) {
            this.m();
         } else if ($$1.a(axh.j)) {
            bwv $$4 = $$1.c();
            if ($$4 != null && $$4.an() == bxe.be) {
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
      ffs $$0 = this.dt();
      ffn $$1 = this.cR();
      if (!this.gw() && this.m()) {
         int $$2 = this.dV().a(bxe.bd, $$1.g(8.0), bwv::bJ).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dV().A.i() < $$3)) {
            cph $$4 = bxe.bd.a(this.dV(), bxd.e);
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
   public void a(akn<?> $$0) {
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
         this.g(bzc.a).c(d);
         if ($$0 == 0) {
            this.g(bzc.a).d(e);
            this.a(awr.xG, 1.0F, 1.0F);
            this.a(egg.j);
         } else {
            this.a(awr.xK, 1.0F, 1.0F);
            this.a(egg.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return azq.h($$0, this.bS, this.bT);
   }

   @Override
   public void a(abz $$0) {
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
   public void h(bwv $$0) {
   }

   @Nullable
   public ffs K(float $$0) {
      if (this.bU != null && this.bV > 0) {
         double $$1 = (double)((float)this.bV - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.el();
         iw $$2 = this.dv();
         double $$3 = (double)($$2.u() - this.bU.u()) * $$1;
         double $$4 = (double)($$2.v() - this.bU.v()) * $$1;
         double $$5 = (double)($$2.w() - this.bU.w()) * $$1;
         return new ffs(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   private void a(Optional<cyy> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cyy> q() {
      return Optional.ofNullable(this.t());
   }

   @Nullable
   public cyy t() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cyy.a($$0) : null;
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

   class a extends ces {
      private int b;

      public a() {
         this.a(EnumSet.of(ces.a.a, ces.a.b));
      }

      @Override
      public boolean b() {
         bxw $$0 = cph.this.f();
         return $$0 != null && $$0.bJ() ? cph.this.dV().an() != buq.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cph.this.b(100);
      }

      @Override
      public void e() {
         cph.this.b(0);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cph.this.dV().an() != buq.a) {
            this.b--;
            bxw $$0 = cph.this.f();
            if ($$0 != null) {
               cph.this.J().a($$0, 180.0F, 180.0F);
               double $$1 = cph.this.g((bwv)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cph.this.ae.a(10) * 20 / 2;
                     cph.this.dV().b(new csx(cph.this.dV(), cph.this, $$0, cph.this.n().o()));
                     cph.this.a(awr.xL, 2.0F, (cph.this.ae.i() - cph.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cph.this.g(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cdq {
      public b(bxy $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cgl<bxw> {
      public c(cph $$0) {
         super($$0, bxw.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof cot);
      }

      @Override
      public boolean b() {
         return this.e.cq() == null ? false : super.b();
      }

      @Override
      protected ffn a(double $$0) {
         jc $$1 = ((cph)this.e).n();
         if ($$1.o() == jc.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jc.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cdu {
      public d(final bxy $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jc $$0 = cph.this.n().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cph.bQ));
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
            : Optional.of((float)(azq.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cgl<crz> {
      public e(final cph $$0) {
         super($$0, crz.class, true);
      }

      @Override
      public boolean b() {
         return cph.this.dV().an() == buq.a ? false : super.b();
      }

      @Override
      protected ffn a(double $$0) {
         jc $$1 = ((cph)this.e).n();
         if ($$1.o() == jc.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jc.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends ces {
      private int b;

      @Override
      public boolean b() {
         return cph.this.f() == null && cph.this.ae.a(b(40)) == 0 && cph.this.a(cph.this.dv(), cph.this.n());
      }

      @Override
      public boolean c() {
         return cph.this.f() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cph.this.ae.a(3)));
         cph.this.b(30);
      }

      @Override
      public void e() {
         if (cph.this.f() == null) {
            cph.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
