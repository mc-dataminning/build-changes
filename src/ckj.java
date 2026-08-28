import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ckj extends cfc implements buo<Optional<cti>>, cjv {
   private static final akr e = akr.b("covered");
   private static final buu ca = new buu(e, 20.0, buu.a.a);
   protected static final ajw<ji> b = aka.a(ckj.class, ajy.q);
   protected static final ajw<Byte> c = aka.a(ckj.class, ajy.a);
   protected static final ajw<Byte> d = aka.a(ckj.class, ajy.a);
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

   public ckj(bsx<? extends ckj> $$0, dcw $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bQ = new ckj.d(this);
   }

   @Override
   protected void B() {
      this.bU.a(1, new cau(this, cmx.class, 8.0F, 0.02F, true));
      this.bU.a(4, new ckj.a());
      this.bU.a(7, new ckj.f());
      this.bU.a(8, new cbh(this));
      this.bV.a(1, new cce(this, this.getClass()).a());
      this.bV.a(2, new ckj.e(this));
      this.bV.a(3, new ckj.c(this));
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.a;
   }

   @Override
   public avq de() {
      return avq.f;
   }

   @Override
   protected avo v() {
      return avp.wL;
   }

   @Override
   public void S() {
      if (!this.gp()) {
         super.S();
      }
   }

   @Override
   protected avo n_() {
      return avp.wR;
   }

   @Override
   protected avo d(brk $$0) {
      return this.gp() ? avp.wT : avp.wS;
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(b, ji.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 30.0);
   }

   @Override
   protected bzk H() {
      return new ckj.b(this);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a(ji.a($$0.f("AttachFace")));
      this.ao.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.ao.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.x().d());
      $$0.a("Peek", this.ao.a(c));
      $$0.a("Color", this.ao.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dO().B && !this.bS() && !this.a(this.do(), this.x())) {
         this.gm();
      }

      if (this.gn()) {
         this.go();
      }

      if (this.dO().B) {
         if (this.cn > 0) {
            this.cn--;
         } else {
            this.cm = null;
         }
      }
   }

   private void gm() {
      ji $$0 = this.h(this.do());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected ewx au() {
      float $$0 = J(this.cl);
      ji $$1 = this.x().g();
      float $$2 = this.dj() / 2.0F;
      return a(this.eb(), $$1, $$0).d(this.dt() - (double)$$2, this.dv(), this.dz() - (double)$$2);
   }

   private static float J(float $$0) {
      return 0.5F - ayo.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gn() {
      this.ck = this.cl;
      float $$0 = (float)this.gr() * 0.01F;
      if (this.cl == $$0) {
         return false;
      } else {
         if (this.cl > $$0) {
            this.cl = ayo.a(this.cl - 0.05F, $$0, 1.0F);
         } else {
            this.cl = ayo.a(this.cl + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void go() {
      this.av();
      float $$0 = J(this.cl);
      float $$1 = J(this.ck);
      ji $$2 = this.x().g();
      float $$3 = ($$0 - $$1) * this.eb();
      if (!($$3 <= 0.0F)) {
         for (bsr $$5 : this.dO().a(this, a(this.eb(), $$2, $$1, $$0).d(this.dt() - 0.5, this.dv(), this.dz() - 0.5), bsw.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof ckj) && !$$5.ag) {
               $$5.a(bts.e, new exc((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ewx a(float $$0, ji $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static ewx a(float $$0, ji $$1, float $$2, float $$3) {
      ewx $$4 = new ewx(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bsr $$0, boolean $$1) {
      if (this.dO().x_()) {
         this.cm = null;
         this.cn = 0;
      }

      this.a(ji.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ad() {
      super.ad();
      if (this.dO().B) {
         this.cm = this.do();
      }

      this.aZ = 0.0F;
      this.aY = 0.0F;
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      this.t(0.0F);
      this.ba = this.dE();
      this.bv();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bts $$0, exc $$1) {
      if ($$0 == bts.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public exc dr() {
      return exc.b;
   }

   @Override
   public void i(exc $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      jd $$3 = this.do();
      if (this.bS()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)ayo.a($$0) + 0.5, (double)ayo.a($$1 + 0.5), (double)ayo.a($$2) + 0.5);
      }

      if (this.ai != 0) {
         jd $$4 = this.do();
         if (!$$4.equals($$3)) {
            this.ao.a(c, (byte)0);
            this.av = true;
            if (this.dO().B && !this.bS() && !$$4.equals(this.cm)) {
               this.cm = $$3;
               this.cn = 6;
               this.ad = this.dt();
               this.ae = this.dv();
               this.af = this.dz();
            }
         }
      }
   }

   @Nullable
   protected ji h(jd $$0) {
      for (ji $$1 : ji.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(jd $$0, ji $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         ji $$2 = $$1.g();
         if (!this.dO().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ewx $$3 = a(this.eb(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dO().a(this, $$3);
         }
      }
   }

   private boolean i(jd $$0) {
      dtc $$1 = this.dO().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dga.bQ) && $$0.equals(this.do());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.fZ() && this.bE()) {
         jd $$0 = this.do();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            jd $$2 = $$0.b(ayo.b(this.ah, -8, 8), ayo.b(this.ah, -8, 8), ayo.b(this.ah, -8, 8));
            if ($$2.v() > this.dO().I_() && this.dO().u($$2) && this.dO().C_().a($$2) && this.dO().a(this, new ewx($$2).h(1.0E-6))) {
               ji $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ak();
                  this.a($$3);
                  this.a(avp.wW, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dO().a(dxz.R, $$0, dxz.a.a(this));
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
   public boolean a(brk $$0, float $$1) {
      if (this.gp()) {
         bsr $$2 = $$0.c();
         if ($$2 instanceof cnd) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ew() < (double)this.eN() * 0.5 && this.ah.a(4) == 0) {
            this.t();
         } else if ($$0.a(awg.j)) {
            bsr $$3 = $$0.c();
            if ($$3 != null && $$3.am() == bsx.aL) {
               this.gq();
            }
         }

         return true;
      }
   }

   private boolean gp() {
      return this.gr() == 0;
   }

   private void gq() {
      exc $$0 = this.dm();
      ewx $$1 = this.cK();
      if (!this.gp() && this.t()) {
         int $$2 = this.dO().a(bsx.aK, $$1.g(8.0), bsr::bE).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dO().z.i() < $$3)) {
            ckj $$4 = bsx.aK.a(this.dO());
            if ($$4 != null) {
               $$4.a(this.gk());
               $$4.f($$0);
               this.dO().b($$4);
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
   public void a(ajw<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.au());
      }

      super.a($$0);
   }

   private int gr() {
      return this.ao.a(c);
   }

   void b(int $$0) {
      if (!this.dO().B) {
         this.f(buw.a).c(e);
         if ($$0 == 0) {
            this.f(buw.a).c(ca);
            this.a(avp.wQ, 1.0F, 1.0F);
            this.a(dxz.j);
         } else {
            this.a(avp.wU, 1.0F, 1.0F);
            this.a(dxz.k);
         }
      }

      this.ao.a(c, (byte)$$0);
   }

   public float H(float $$0) {
      return ayo.i($$0, this.ck, this.cl);
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      this.aY = 0.0F;
      this.aZ = 0.0F;
   }

   @Override
   public int ac() {
      return 180;
   }

   @Override
   public int ae() {
      return 180;
   }

   @Override
   public void h(bsr $$0) {
   }

   public Optional<exc> I(float $$0) {
      if (this.cm != null && this.cn > 0) {
         double $$1 = (double)((float)this.cn - $$0) / 6.0;
         $$1 *= $$1;
         jd $$2 = this.do();
         double $$3 = (double)($$2.u() - this.cm.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cm.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cm.w()) * $$1;
         return Optional.of(new exc(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cti> $$0) {
      this.ao.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cti> gk() {
      return Optional.ofNullable(this.gl());
   }

   @Nullable
   public cti gl() {
      byte $$0 = this.ao.a(d);
      return $$0 != 16 && $$0 <= 15 ? cti.a($$0) : null;
   }

   class a extends cam {
      private int b;

      public a() {
         this.a(EnumSet.of(cam.a.a, cam.a.b));
      }

      @Override
      public boolean b() {
         btn $$0 = ckj.this.p();
         return $$0 != null && $$0.bE() ? ckj.this.dO().al() != bqo.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         ckj.this.b(100);
      }

      @Override
      public void e() {
         ckj.this.b(0);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (ckj.this.dO().al() != bqo.a) {
            this.b--;
            btn $$0 = ckj.this.p();
            if ($$0 != null) {
               ckj.this.I().a($$0, 180.0F, 180.0F);
               double $$1 = ckj.this.g((bsr)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + ckj.this.ah.a(10) * 20 / 2;
                     ckj.this.dO().b(new cns(ckj.this.dO(), ckj.this, $$0, ckj.this.x().o()));
                     ckj.this.a(avp.wV, 2.0F, (ckj.this.ah.i() - ckj.this.ah.i()) * 0.2F + 1.0F);
                  }
               } else {
                  ckj.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends bzk {
      public b(btp $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends ccf<btn> {
      public c(ckj $$0) {
         super($$0, btn.class, 10, true, false, $$0x -> $$0x instanceof cjv);
      }

      @Override
      public boolean b() {
         return this.e.ck() == null ? false : super.b();
      }

      @Override
      protected ewx a(double $$0) {
         ji $$1 = ((ckj)this.e).x();
         if ($$1.o() == ji.a.a) {
            return this.e.cK().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ji.a.c ? this.e.cK().c($$0, $$0, 4.0) : this.e.cK().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bzo {
      public d(final btp $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ji $$0 = ckj.this.x().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(ckj.ci));
         kh $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dt();
         double $$5 = this.f - this.a.dx();
         double $$6 = this.g - this.a.dz();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(ayo.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends ccf<cmx> {
      public e(final ckj $$0) {
         super($$0, cmx.class, true);
      }

      @Override
      public boolean b() {
         return ckj.this.dO().al() == bqo.a ? false : super.b();
      }

      @Override
      protected ewx a(double $$0) {
         ji $$1 = ((ckj)this.e).x();
         if ($$1.o() == ji.a.a) {
            return this.e.cK().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ji.a.c ? this.e.cK().c($$0, $$0, 4.0) : this.e.cK().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cam {
      private int b;

      @Override
      public boolean b() {
         return ckj.this.p() == null && ckj.this.ah.a(b(40)) == 0 && ckj.this.a(ckj.this.do(), ckj.this.x());
      }

      @Override
      public boolean c() {
         return ckj.this.p() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + ckj.this.ah.a(3)));
         ckj.this.b(30);
      }

      @Override
      public void e() {
         if (ckj.this.p() == null) {
            ckj.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
