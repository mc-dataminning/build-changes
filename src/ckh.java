import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ckh extends cfa implements bum<Optional<ctg>>, cjt {
   private static final akq e = akq.b("covered");
   private static final bus ca = new bus(e, 20.0, bus.a.a);
   protected static final ajv<ji> b = ajz.a(ckh.class, ajx.q);
   protected static final ajv<Byte> c = ajz.a(ckh.class, ajx.a);
   protected static final ajv<Byte> d = ajz.a(ckh.class, ajx.a);
   private static final int cb = 6;
   private static final byte cc = 16;
   private static final byte cd = 16;
   private static final int ce = 8;
   private static final int cf = 8;
   private static final int cg = 5;
   private static final float ch = 0.05F;
   static final Vector3f ci = ad.a(() -> {
      kh $$0 = ji.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float cj = 3.0F;
   private float ck;
   private float cl;
   @Nullable
   private jd cm;
   private int cn;
   private static final float co = 1.0F;

   public ckh(bsw<? extends ckh> $$0, dcu $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bQ = new ckh.d(this);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cas(this, cmv.class, 8.0F, 0.02F, true));
      this.bU.a(4, new ckh.a());
      this.bU.a(7, new ckh.f());
      this.bU.a(8, new cbf(this));
      this.bV.a(1, new ccc(this, this.getClass()).a());
      this.bV.a(2, new ckh.e(this));
      this.bV.a(3, new ckh.c(this));
   }

   @Override
   protected bsq.b bc() {
      return bsq.b.a;
   }

   @Override
   public avp df() {
      return avp.f;
   }

   @Override
   protected avn v() {
      return avo.wL;
   }

   @Override
   public void Q() {
      if (!this.gr()) {
         super.Q();
      }
   }

   @Override
   protected avn n_() {
      return avo.wR;
   }

   @Override
   protected avn d(brj $$0) {
      return this.gr() ? avo.wT : avo.wS;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(b, ji.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static but.a s() {
      return btn.A().a(buu.s, 30.0);
   }

   @Override
   protected bzi E() {
      return new ckh.b(this);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(ji.a($$0.f("AttachFace")));
      this.ao.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.ao.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.x().d());
      $$0.a("Peek", this.ao.a(c));
      $$0.a("Color", this.ao.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dQ().B && !this.bS() && !this.a(this.dq(), this.x())) {
         this.go();
      }

      if (this.gp()) {
         this.gq();
      }

      if (this.dQ().B) {
         if (this.cn > 0) {
            this.cn--;
         } else {
            this.cm = null;
         }
      }
   }

   private void go() {
      ji $$0 = this.g(this.dq());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected ewr au() {
      float $$0 = J(this.cl);
      ji $$1 = this.x().g();
      float $$2 = this.dk() / 2.0F;
      return a(this.ec(), $$1, $$0).d(this.dv() - (double)$$2, this.dx(), this.dB() - (double)$$2);
   }

   private static float J(float $$0) {
      return 0.5F - ayn.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gp() {
      this.ck = this.cl;
      float $$0 = (float)this.gt() * 0.01F;
      if (this.cl == $$0) {
         return false;
      } else {
         if (this.cl > $$0) {
            this.cl = ayn.a(this.cl - 0.05F, $$0, 1.0F);
         } else {
            this.cl = ayn.a(this.cl + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gq() {
      this.av();
      float $$0 = J(this.cl);
      float $$1 = J(this.ck);
      ji $$2 = this.x().g();
      float $$3 = ($$0 - $$1) * this.ec();
      if (!($$3 <= 0.0F)) {
         for (bsq $$5 : this.dQ().a(this, a(this.ec(), $$2, $$1, $$0).d(this.dv() - 0.5, this.dx(), this.dB() - 0.5), bsv.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof ckh) && !$$5.ag) {
               $$5.a(btq.e, new eww((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ewr a(float $$0, ji $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static ewr a(float $$0, ji $$1, float $$2, float $$3) {
      ewr $$4 = new ewr(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bsq $$0, boolean $$1) {
      if (this.dQ().x_()) {
         this.cm = null;
         this.cn = 0;
      }

      this.a(ji.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ad() {
      super.ad();
      if (this.dQ().B) {
         this.cm = this.dq();
      }

      this.aZ = 0.0F;
      this.aY = 0.0F;
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      this.s(0.0F);
      this.ba = this.dG();
      this.bv();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(btq $$0, eww $$1) {
      if ($$0 == btq.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public eww dt() {
      return eww.b;
   }

   @Override
   public void i(eww $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      jd $$3 = this.dq();
      if (this.bS()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)ayn.a($$0) + 0.5, (double)ayn.a($$1 + 0.5), (double)ayn.a($$2) + 0.5);
      }

      if (this.ai != 0) {
         jd $$4 = this.dq();
         if (!$$4.equals($$3)) {
            this.ao.a(c, (byte)0);
            this.av = true;
            if (this.dQ().B && !this.bS() && !$$4.equals(this.cm)) {
               this.cm = $$3;
               this.cn = 6;
               this.ad = this.dv();
               this.ae = this.dx();
               this.af = this.dB();
            }
         }
      }
   }

   @Nullable
   protected ji g(jd $$0) {
      for (ji $$1 : ji.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(jd $$0, ji $$1) {
      if (this.h($$0)) {
         return false;
      } else {
         ji $$2 = $$1.g();
         if (!this.dQ().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ewr $$3 = a(this.ec(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dQ().a(this, $$3);
         }
      }
   }

   private boolean h(jd $$0) {
      dta $$1 = this.dQ().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dfy.bQ) && $$0.equals(this.dq());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.gb() && this.bE()) {
         jd $$0 = this.dq();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            jd $$2 = $$0.b(ayn.b(this.ah, -8, 8), ayn.b(this.ah, -8, 8), ayn.b(this.ah, -8, 8));
            if ($$2.v() > this.dQ().I_() && this.dQ().u($$2) && this.dQ().C_().a($$2) && this.dQ().a(this, new ewr($$2).h(1.0E-6))) {
               ji $$3 = this.g($$2);
               if ($$3 != null) {
                  this.ak();
                  this.a($$3);
                  this.a(avo.wW, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dQ().a(dxw.R, $$0, dxw.a.a(this));
                  this.ao.a(c, (byte)0);
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
      this.a($$3, $$4);
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.gr()) {
         bsq $$2 = $$0.c();
         if ($$2 instanceof cnb) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ex() < (double)this.eO() * 0.5 && this.ah.a(4) == 0) {
            this.t();
         } else if ($$0.a(awf.j)) {
            bsq $$3 = $$0.c();
            if ($$3 != null && $$3.am() == bsw.aL) {
               this.gs();
            }
         }

         return true;
      }
   }

   private boolean gr() {
      return this.gt() == 0;
   }

   private void gs() {
      eww $$0 = this.do();
      ewr $$1 = this.cL();
      if (!this.gr() && this.t()) {
         int $$2 = this.dQ().a(bsw.aK, $$1.g(8.0), bsq::bE).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dQ().z.i() < $$3)) {
            ckh $$4 = bsw.aK.a(this.dQ());
            if ($$4 != null) {
               $$4.a(this.gm());
               $$4.f($$0);
               this.dQ().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bG() {
      return this.bE();
   }

   public ji x() {
      return this.ao.a(b);
   }

   private void a(ji $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(ajv<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.au());
      }

      super.a($$0);
   }

   private int gt() {
      return this.ao.a(c);
   }

   void b(int $$0) {
      if (!this.dQ().B) {
         this.f(buu.a).c(e);
         if ($$0 == 0) {
            this.f(buu.a).c(ca);
            this.a(avo.wQ, 1.0F, 1.0F);
            this.a(dxw.j);
         } else {
            this.a(avo.wU, 1.0F, 1.0F);
            this.a(dxw.k);
         }
      }

      this.ao.a(c, (byte)$$0);
   }

   public float H(float $$0) {
      return ayn.i($$0, this.ck, this.cl);
   }

   @Override
   public void a(abu $$0) {
      super.a($$0);
      this.aY = 0.0F;
      this.aZ = 0.0F;
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public int ab() {
      return 180;
   }

   @Override
   public void h(bsq $$0) {
   }

   public Optional<eww> I(float $$0) {
      if (this.cm != null && this.cn > 0) {
         double $$1 = (double)((float)this.cn - $$0) / 6.0;
         $$1 *= $$1;
         jd $$2 = this.dq();
         double $$3 = (double)($$2.u() - this.cm.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cm.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cm.w()) * $$1;
         return Optional.of(new eww(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<ctg> $$0) {
      this.ao.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<ctg> gm() {
      return Optional.ofNullable(this.gn());
   }

   @Nullable
   public ctg gn() {
      byte $$0 = this.ao.a(d);
      return $$0 != 16 && $$0 <= 15 ? ctg.a($$0) : null;
   }

   class a extends cak {
      private int b;

      public a() {
         this.a(EnumSet.of(cak.a.a, cak.a.b));
      }

      @Override
      public boolean b() {
         btl $$0 = ckh.this.p();
         return $$0 != null && $$0.bE() ? ckh.this.dQ().al() != bqn.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         ckh.this.b(100);
      }

      @Override
      public void e() {
         ckh.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         if (ckh.this.dQ().al() != bqn.a) {
            this.b--;
            btl $$0 = ckh.this.p();
            if ($$0 != null) {
               ckh.this.F().a($$0, 180.0F, 180.0F);
               double $$1 = ckh.this.g($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + ckh.this.ah.a(10) * 20 / 2;
                     ckh.this.dQ().b(new cnq(ckh.this.dQ(), ckh.this, $$0, ckh.this.x().o()));
                     ckh.this.a(avo.wV, 2.0F, (ckh.this.ah.i() - ckh.this.ah.i()) * 0.2F + 1.0F);
                  }
               } else {
                  ckh.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends bzi {
      public b(btn $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends ccd<btl> {
      public c(ckh $$0) {
         super($$0, btl.class, 10, true, false, $$0x -> $$0x instanceof cjt);
      }

      @Override
      public boolean b() {
         return this.e.ck() == null ? false : super.b();
      }

      @Override
      protected ewr a(double $$0) {
         ji $$1 = ((ckh)this.e).x();
         if ($$1.o() == ji.a.a) {
            return this.e.cL().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ji.a.c ? this.e.cL().c($$0, $$0, 4.0) : this.e.cL().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bzm {
      public d(final btn $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ji $$0 = ckh.this.x().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(ckh.ci));
         kh $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dv();
         double $$5 = this.f - this.a.dz();
         double $$6 = this.g - this.a.dB();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(ayn.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends ccd<cmv> {
      public e(final ckh $$0) {
         super($$0, cmv.class, true);
      }

      @Override
      public boolean b() {
         return ckh.this.dQ().al() == bqn.a ? false : super.b();
      }

      @Override
      protected ewr a(double $$0) {
         ji $$1 = ((ckh)this.e).x();
         if ($$1.o() == ji.a.a) {
            return this.e.cL().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ji.a.c ? this.e.cL().c($$0, $$0, 4.0) : this.e.cL().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cak {
      private int b;

      @Override
      public boolean b() {
         return ckh.this.p() == null && ckh.this.ah.a(b(40)) == 0 && ckh.this.a(ckh.this.dq(), ckh.this.x());
      }

      @Override
      public boolean c() {
         return ckh.this.p() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + ckh.this.ah.a(3)));
         ckh.this.b(30);
      }

      @Override
      public void e() {
         if (ckh.this.p() == null) {
            ckh.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
