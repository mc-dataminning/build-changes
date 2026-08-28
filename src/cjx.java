import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cjx extends ceq implements buc<Optional<csw>>, cjj {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bui ca = new bui(e, "Covered armor bonus", 20.0, bui.a.a);
   protected static final ajp<jf> b = ajt.a(cjx.class, ajr.q);
   protected static final ajp<Byte> c = ajt.a(cjx.class, ajr.a);
   protected static final ajp<Byte> d = ajt.a(cjx.class, ajr.a);
   private static final int cb = 6;
   private static final byte cc = 16;
   private static final byte cd = 16;
   private static final int ce = 8;
   private static final int cf = 8;
   private static final int cg = 5;
   private static final float ch = 0.05F;
   static final Vector3f ci = ac.a(() -> {
      ke $$0 = jf.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float cj = 3.0F;
   private float ck;
   private float cl;
   @Nullable
   private ja cm;
   private int cn;
   private static final float co = 1.0F;

   public cjx(bsn<? extends cjx> $$0, dcg $$1) {
      super($$0, $$1);
      this.bP = 5;
      this.bQ = new cjx.d(this);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cai(this, cml.class, 8.0F, 0.02F, true));
      this.bU.a(4, new cjx.a());
      this.bU.a(7, new cjx.f());
      this.bU.a(8, new cav(this));
      this.bV.a(1, new cbs(this, this.getClass()).a());
      this.bV.a(2, new cjx.e(this));
      this.bV.a(3, new cjx.c(this));
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.a;
   }

   @Override
   public avi dg() {
      return avi.f;
   }

   @Override
   protected avg v() {
      return avh.wL;
   }

   @Override
   public void Q() {
      if (!this.gs()) {
         super.Q();
      }
   }

   @Override
   protected avg n_() {
      return avh.wR;
   }

   @Override
   protected avg d(bra $$0) {
      return this.gs() ? avh.wT : avh.wS;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, jf.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 30.0);
   }

   @Override
   protected byy E() {
      return new cjx.b(this);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(jf.a($$0.f("AttachFace")));
      this.ao.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.ao.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.x().d());
      $$0.a("Peek", this.ao.a(c));
      $$0.a("Color", this.ao.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dR().B && !this.bT() && !this.a(this.dr(), this.x())) {
         this.gp();
      }

      if (this.gq()) {
         this.gr();
      }

      if (this.dR().B) {
         if (this.cn > 0) {
            this.cn--;
         } else {
            this.cm = null;
         }
      }
   }

   private void gp() {
      jf $$0 = this.h(this.dr());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected ewc au() {
      float $$0 = J(this.cl);
      jf $$1 = this.x().g();
      float $$2 = this.dl() / 2.0F;
      return a(this.ed(), $$1, $$0).d(this.dw() - (double)$$2, this.dy(), this.dC() - (double)$$2);
   }

   private static float J(float $$0) {
      return 0.5F - ayg.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gq() {
      this.ck = this.cl;
      float $$0 = (float)this.gu() * 0.01F;
      if (this.cl == $$0) {
         return false;
      } else {
         if (this.cl > $$0) {
            this.cl = ayg.a(this.cl - 0.05F, $$0, 1.0F);
         } else {
            this.cl = ayg.a(this.cl + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gr() {
      this.av();
      float $$0 = J(this.cl);
      float $$1 = J(this.ck);
      jf $$2 = this.x().g();
      float $$3 = ($$0 - $$1) * this.ed();
      if (!($$3 <= 0.0F)) {
         for (bsh $$5 : this.dR().a(this, a(this.ed(), $$2, $$1, $$0).d(this.dw() - 0.5, this.dy(), this.dC() - 0.5), bsm.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof cjx) && !$$5.ag) {
               $$5.a(bth.e, new ewh((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ewc a(float $$0, jf $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static ewc a(float $$0, jf $$1, float $$2, float $$3) {
      ewc $$4 = new ewc(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bsh $$0, boolean $$1) {
      if (this.dR().x_()) {
         this.cm = null;
         this.cn = 0;
      }

      this.a(jf.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ad() {
      super.ad();
      if (this.dR().B) {
         this.cm = this.dr();
      }

      this.ba = 0.0F;
      this.aZ = 0.0F;
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      this.s(0.0F);
      this.bb = this.dH();
      this.bw();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bth $$0, ewh $$1) {
      if ($$0 == bth.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ewh du() {
      return ewh.b;
   }

   @Override
   public void j(ewh $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      ja $$3 = this.dr();
      if (this.bT()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)ayg.a($$0) + 0.5, (double)ayg.a($$1 + 0.5), (double)ayg.a($$2) + 0.5);
      }

      if (this.ai != 0) {
         ja $$4 = this.dr();
         if (!$$4.equals($$3)) {
            this.ao.a(c, (byte)0);
            this.av = true;
            if (this.dR().B && !this.bT() && !$$4.equals(this.cm)) {
               this.cm = $$3;
               this.cn = 6;
               this.ad = this.dw();
               this.ae = this.dy();
               this.af = this.dC();
            }
         }
      }
   }

   @Nullable
   protected jf h(ja $$0) {
      for (jf $$1 : jf.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(ja $$0, jf $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jf $$2 = $$1.g();
         if (!this.dR().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ewc $$3 = a(this.ed(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dR().a(this, $$3);
         }
      }
   }

   private boolean i(ja $$0) {
      dsl $$1 = this.dR().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dfk.bQ) && $$0.equals(this.dr());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.gc() && this.bF()) {
         ja $$0 = this.dr();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ja $$2 = $$0.b(ayg.b(this.ah, -8, 8), ayg.b(this.ah, -8, 8), ayg.b(this.ah, -8, 8));
            if ($$2.v() > this.dR().I_() && this.dR().u($$2) && this.dR().C_().a($$2) && this.dR().a(this, new ewc($$2).h(1.0E-6))) {
               jf $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ak();
                  this.a($$3);
                  this.a(avh.wW, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dR().a(dxh.R, $$0, dxh.a.a(this));
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
      this.bs = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.gs()) {
         bsh $$2 = $$0.c();
         if ($$2 instanceof cmr) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.ey() < (double)this.eP() * 0.5 && this.ah.a(4) == 0) {
            this.t();
         } else if ($$0.a(avy.k)) {
            bsh $$3 = $$0.c();
            if ($$3 != null && $$3.am() == bsn.aL) {
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
      ewh $$0 = this.dp();
      ewc $$1 = this.cM();
      if (!this.gs() && this.t()) {
         int $$2 = this.dR().a(bsn.aK, $$1.g(8.0), bsh::bF).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dR().z.i() < $$3)) {
            cjx $$4 = bsn.aK.a(this.dR());
            if ($$4 != null) {
               $$4.a(this.gn());
               $$4.f($$0);
               this.dR().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bH() {
      return this.bF();
   }

   public jf x() {
      return this.ao.a(b);
   }

   private void a(jf $$0) {
      this.ao.a(b, $$0);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.au());
      }

      super.a($$0);
   }

   private int gu() {
      return this.ao.a(c);
   }

   void b(int $$0) {
      if (!this.dR().B) {
         this.f(buk.a).b(ca.b());
         if ($$0 == 0) {
            this.f(buk.a).d(ca);
            this.a(avh.wQ, 1.0F, 1.0F);
            this.a(dxh.j);
         } else {
            this.a(avh.wU, 1.0F, 1.0F);
            this.a(dxh.k);
         }
      }

      this.ao.a(c, (byte)$$0);
   }

   public float H(float $$0) {
      return ayg.i($$0, this.ck, this.cl);
   }

   @Override
   public void a(abo $$0) {
      super.a($$0);
      this.aZ = 0.0F;
      this.ba = 0.0F;
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
   public void h(bsh $$0) {
   }

   public Optional<ewh> I(float $$0) {
      if (this.cm != null && this.cn > 0) {
         double $$1 = (double)((float)this.cn - $$0) / 6.0;
         $$1 *= $$1;
         ja $$2 = this.dr();
         double $$3 = (double)($$2.u() - this.cm.u()) * $$1;
         double $$4 = (double)($$2.v() - this.cm.v()) * $$1;
         double $$5 = (double)($$2.w() - this.cm.w()) * $$1;
         return Optional.of(new ewh(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<csw> $$0) {
      this.ao.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<csw> gn() {
      return Optional.ofNullable(this.go());
   }

   @Nullable
   public csw go() {
      byte $$0 = this.ao.a(d);
      return $$0 != 16 && $$0 <= 15 ? csw.a($$0) : null;
   }

   class a extends caa {
      private int b;

      public a() {
         this.a(EnumSet.of(caa.a.a, caa.a.b));
      }

      @Override
      public boolean a() {
         btc $$0 = cjx.this.p();
         return $$0 != null && $$0.bF() ? cjx.this.dR().al() != bqe.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cjx.this.b(100);
      }

      @Override
      public void d() {
         cjx.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (cjx.this.dR().al() != bqe.a) {
            this.b--;
            btc $$0 = cjx.this.p();
            if ($$0 != null) {
               cjx.this.F().a($$0, 180.0F, 180.0F);
               double $$1 = cjx.this.g((bsh)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cjx.this.ah.a(10) * 20 / 2;
                     cjx.this.dR().b(new cng(cjx.this.dR(), cjx.this, $$0, cjx.this.x().o()));
                     cjx.this.a(avh.wV, 2.0F, (cjx.this.ah.i() - cjx.this.ah.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cjx.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends byy {
      public b(bte $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cbt<btc> {
      public c(cjx $$0) {
         super($$0, btc.class, 10, true, false, $$0x -> $$0x instanceof cjj);
      }

      @Override
      public boolean a() {
         return this.e.cl() == null ? false : super.a();
      }

      @Override
      protected ewc a(double $$0) {
         jf $$1 = ((cjx)this.e).x();
         if ($$1.o() == jf.a.a) {
            return this.e.cM().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jf.a.c ? this.e.cM().c($$0, $$0, 4.0) : this.e.cM().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bzc {
      public d(final bte $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jf $$0 = cjx.this.x().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cjx.ci));
         ke $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dw();
         double $$5 = this.f - this.a.dA();
         double $$6 = this.g - this.a.dC();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(ayg.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cbt<cml> {
      public e(final cjx $$0) {
         super($$0, cml.class, true);
      }

      @Override
      public boolean a() {
         return cjx.this.dR().al() == bqe.a ? false : super.a();
      }

      @Override
      protected ewc a(double $$0) {
         jf $$1 = ((cjx)this.e).x();
         if ($$1.o() == jf.a.a) {
            return this.e.cM().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jf.a.c ? this.e.cM().c($$0, $$0, 4.0) : this.e.cM().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends caa {
      private int b;

      @Override
      public boolean a() {
         return cjx.this.p() == null && cjx.this.ah.a(b(40)) == 0 && cjx.this.a(cjx.this.dr(), cjx.this.x());
      }

      @Override
      public boolean b() {
         return cjx.this.p() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cjx.this.ah.a(3)));
         cjx.this.b(30);
      }

      @Override
      public void d() {
         if (cjx.this.p() == null) {
            cjx.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
