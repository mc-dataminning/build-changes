import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cjk extends cec implements btn<Optional<csy>>, ciu {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final btt ch = new btt(e, "Covered armor bonus", 20.0, btt.a.a);
   protected static final ajy<iw> b = akc.a(cjk.class, aka.q);
   protected static final ajy<Byte> c = akc.a(cjk.class, aka.a);
   protected static final ajy<Byte> d = akc.a(cjk.class, aka.a);
   private static final int ci = 6;
   private static final byte cj = 16;
   private static final byte ck = 16;
   private static final int cl = 8;
   private static final int cm = 8;
   private static final int cn = 5;
   private static final float co = 0.05F;
   static final Vector3f cp = ad.a(() -> {
      jv $$0 = iw.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float cq = 3.0F;
   private float cr;
   private float cs;
   @Nullable
   private ir ct;
   private int cu;
   private static final float cv = 1.0F;

   public cjk(bsb<? extends cjk> $$0, dca $$1) {
      super($$0, $$1);
      this.bW = 5;
      this.bX = new cjk.d(this);
   }

   @Override
   protected void y() {
      this.cb.a(1, new bzt(this, cly.class, 8.0F, 0.02F, true));
      this.cb.a(4, new cjk.a());
      this.cb.a(7, new cjk.f());
      this.cb.a(8, new cag(this));
      this.cc.a(1, new cbd(this, this.getClass()).a());
      this.cc.a(2, new cjk.e(this));
      this.cc.a(3, new cjk.c(this));
   }

   @Override
   protected brv.c bf() {
      return brv.c.a;
   }

   @Override
   public avq dj() {
      return avq.f;
   }

   @Override
   protected avn u() {
      return avo.xg;
   }

   @Override
   public void P() {
      if (!this.gD()) {
         super.P();
      }
   }

   @Override
   protected avn n_() {
      return avo.xm;
   }

   @Override
   protected avn d(bqt $$0) {
      return this.gD() ? avo.xo : avo.xn;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, iw.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 30.0);
   }

   @Override
   protected byj E() {
      return new cjk.b(this);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(iw.a($$0.f("AttachFace")));
      this.as.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.as.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.x().d());
      $$0.a("Peek", this.as.a(c));
      $$0.a("Color", this.as.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dU().C && !this.bW() && !this.a(this.du(), this.x())) {
         this.gA();
      }

      if (this.gB()) {
         this.gC();
      }

      if (this.dU().C) {
         if (this.cu > 0) {
            this.cu--;
         } else {
            this.ct = null;
         }
      }
   }

   private void gA() {
      iw $$0 = this.e(this.du());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected ewp as() {
      float $$0 = I(this.cs);
      iw $$1 = this.x().g();
      float $$2 = this.do() / 2.0F;
      return a(this.em(), $$1, $$0).d(this.dz() - (double)$$2, this.dB(), this.dF() - (double)$$2);
   }

   private static float I(float $$0) {
      return 0.5F - aym.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gB() {
      this.cr = this.cs;
      float $$0 = (float)this.gF() * 0.01F;
      if (this.cs == $$0) {
         return false;
      } else {
         if (this.cs > $$0) {
            this.cs = aym.a(this.cs - 0.05F, $$0, 1.0F);
         } else {
            this.cs = aym.a(this.cs + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gC() {
      this.at();
      float $$0 = I(this.cs);
      float $$1 = I(this.cr);
      iw $$2 = this.x().g();
      float $$3 = ($$0 - $$1) * this.em();
      if (!($$3 <= 0.0F)) {
         for (brv $$5 : this.dU().a(this, a(this.em(), $$2, $$1, $$0).d(this.dz() - 0.5, this.dB(), this.dF() - 0.5), bsa.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof cjk) && !$$5.ah) {
               $$5.a(bst.e, new ewu((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ewp a(float $$0, iw $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static ewp a(float $$0, iw $$1, float $$2, float $$3) {
      ewp $$4 = new ewp(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(brv $$0, boolean $$1) {
      if (this.dU().x_()) {
         this.ct = null;
         this.cu = 0;
      }

      this.a(iw.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ae() {
      super.ae();
      if (this.dU().C) {
         this.ct = this.du();
      }

      this.bk = 0.0F;
      this.bj = 0.0F;
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      this.r(0.0F);
      this.bl = this.dK();
      this.bz();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bst $$0, ewu $$1) {
      if ($$0 == bst.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ewu dx() {
      return ewu.b;
   }

   @Override
   public void g(ewu $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      ir $$3 = this.du();
      if (this.bW()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)aym.a($$0) + 0.5, (double)aym.a($$1 + 0.5), (double)aym.a($$2) + 0.5);
      }

      if (this.am != 0) {
         ir $$4 = this.du();
         if (!$$4.equals($$3)) {
            this.as.a(c, (byte)0);
            this.az = true;
            if (this.dU().C && !this.bW() && !$$4.equals(this.ct)) {
               this.ct = $$3;
               this.cu = 6;
               this.ae = this.dz();
               this.af = this.dB();
               this.ag = this.dF();
            }
         }
      }
   }

   @Nullable
   protected iw e(ir $$0) {
      for (iw $$1 : iw.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(ir $$0, iw $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         iw $$2 = $$1.g();
         if (!this.dU().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ewp $$3 = a(this.em(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dU().b(this, $$3);
         }
      }
   }

   private boolean j(ir $$0) {
      dtc $$1 = this.dU().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dfe.cA) && $$0.equals(this.du());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.go() && this.bI()) {
         ir $$0 = this.du();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ir $$2 = $$0.b(aym.b(this.al, -8, 8), aym.b(this.al, -8, 8), aym.b(this.al, -8, 8));
            if ($$2.v() > this.dU().J_() && this.dU().u($$2) && this.dU().D_().a($$2) && this.dU().b(this, new ewp($$2).h(1.0E-6))) {
               iw $$3 = this.e($$2);
               if ($$3 != null) {
                  this.ai();
                  this.a($$3);
                  this.a(avo.xr, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dU().a(dxv.R, $$0, dxv.a.a(this));
                  this.as.a(c, (byte)0);
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
      this.bC = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.gD()) {
         brv $$2 = $$0.c();
         if ($$2 instanceof cme) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eI() < (double)this.eZ() * 0.5 && this.al.a(4) == 0) {
            this.t();
         } else if ($$0.a(awg.k)) {
            brv $$3 = $$0.c();
            if ($$3 != null && $$3.ak() == bsb.aN) {
               this.gE();
            }
         }

         return true;
      }
   }

   private boolean gD() {
      return this.gF() == 0;
   }

   private void gE() {
      ewu $$0 = this.ds();
      ewp $$1 = this.cP();
      if (!this.gD() && this.t()) {
         int $$2 = this.dU().a(bsb.aM, $$1.g(8.0), brv::bI).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dU().A.i() < $$3)) {
            cjk $$4 = bsb.aM.a(this.dU());
            if ($$4 != null) {
               $$4.a(this.gy());
               $$4.e($$0);
               this.dU().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bK() {
      return this.bI();
   }

   public iw x() {
      return this.as.a(b);
   }

   private void a(iw $$0) {
      this.as.a(b, $$0);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.as());
      }

      super.a($$0);
   }

   private int gF() {
      return this.as.a(c);
   }

   void b(int $$0) {
      if (!this.dU().C) {
         this.f(btv.a).b(ch.b());
         if ($$0 == 0) {
            this.f(btv.a).d(ch);
            this.a(avo.xl, 1.0F, 1.0F);
            this.a(dxv.j);
         } else {
            this.a(avo.xp, 1.0F, 1.0F);
            this.a(dxv.k);
         }
      }

      this.as.a(c, (byte)$$0);
   }

   public float G(float $$0) {
      return aym.i($$0, this.cr, this.cs);
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      this.bj = 0.0F;
      this.bk = 0.0F;
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
   public void h(brv $$0) {
   }

   public Optional<ewu> H(float $$0) {
      if (this.ct != null && this.cu > 0) {
         double $$1 = (double)((float)this.cu - $$0) / 6.0;
         $$1 *= $$1;
         ir $$2 = this.du();
         double $$3 = (double)($$2.u() - this.ct.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ct.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ct.w()) * $$1;
         return Optional.of(new ewu(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<csy> $$0) {
      this.as.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<csy> gy() {
      return Optional.ofNullable(this.gz());
   }

   @Nullable
   public csy gz() {
      byte $$0 = this.as.a(d);
      return $$0 != 16 && $$0 <= 15 ? csy.a($$0) : null;
   }

   class a extends bzl {
      private int b;

      public a() {
         this.a(EnumSet.of(bzl.a.a, bzl.a.b));
      }

      @Override
      public boolean a() {
         bso $$0 = cjk.this.p();
         return $$0 != null && $$0.bI() ? cjk.this.dU().al() != bpx.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         cjk.this.b(100);
      }

      @Override
      public void d() {
         cjk.this.b(0);
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         if (cjk.this.dU().al() != bpx.a) {
            this.b--;
            bso $$0 = cjk.this.p();
            if ($$0 != null) {
               cjk.this.F().a($$0, 180.0F, 180.0F);
               double $$1 = cjk.this.g($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cjk.this.al.a(10) * 20 / 2;
                     cjk.this.dU().b(new cmv(cjk.this.dU(), cjk.this, $$0, cjk.this.x().o()));
                     cjk.this.a(avo.xq, 2.0F, (cjk.this.al.i() - cjk.this.al.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cjk.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends byj {
      public b(bsq $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cbe<bso> {
      public c(cjk $$0) {
         super($$0, bso.class, 10, true, false, $$0x -> $$0x instanceof ciu);
      }

      @Override
      public boolean a() {
         return this.e.co() == null ? false : super.a();
      }

      @Override
      protected ewp a(double $$0) {
         iw $$1 = ((cjk)this.e).x();
         if ($$1.o() == iw.a.a) {
            return this.e.cP().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == iw.a.c ? this.e.cP().c($$0, $$0, 4.0) : this.e.cP().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends byn {
      public d(bsq $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         iw $$0 = cjk.this.x().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cjk.cp));
         jv $$2 = $$0.q();
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
            : Optional.of((float)(aym.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cbe<cly> {
      public e(cjk $$0) {
         super($$0, cly.class, true);
      }

      @Override
      public boolean a() {
         return cjk.this.dU().al() == bpx.a ? false : super.a();
      }

      @Override
      protected ewp a(double $$0) {
         iw $$1 = ((cjk)this.e).x();
         if ($$1.o() == iw.a.a) {
            return this.e.cP().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == iw.a.c ? this.e.cP().c($$0, $$0, 4.0) : this.e.cP().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bzl {
      private int b;

      @Override
      public boolean a() {
         return cjk.this.p() == null && cjk.this.al.a(b(40)) == 0 && cjk.this.a(cjk.this.du(), cjk.this.x());
      }

      @Override
      public boolean b() {
         return cjk.this.p() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + cjk.this.al.a(3)));
         cjk.this.b(30);
      }

      @Override
      public void d() {
         if (cjk.this.p() == null) {
            cjk.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
