import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cmc extends cgt implements bwf<Optional<cvk>>, clo {
   private static final aku d = aku.b("covered");
   private static final bwl bY = new bwl(d, 20.0, bwl.a.a);
   protected static final ajx<jn> a = akb.a(cmc.class, ajz.q);
   protected static final ajx<Byte> b = akb.a(cmc.class, ajz.a);
   protected static final ajx<Byte> c = akb.a(cmc.class, ajz.a);
   private static final int bZ = 6;
   private static final byte ca = 16;
   private static final byte cb = 16;
   private static final int cc = 8;
   private static final int cd = 8;
   private static final int ce = 5;
   private static final float cf = 0.05F;
   static final Vector3f cg = af.a(() -> {
      km $$0 = jn.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ch = 3.0F;
   private float ci;
   private float cj;
   @Nullable
   private ji ck;
   private int cl;
   private static final float cm = 1.0F;

   public cmc(buq<? extends cmc> $$0, dgg $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new cmc.d(this);
   }

   @Override
   protected void B() {
      this.bS.a(1, new ccl(this, cov.class, 8.0F, 0.02F, true));
      this.bS.a(4, new cmc.a());
      this.bS.a(7, new cmc.f());
      this.bS.a(8, new ccy(this));
      this.bT.a(1, new cdv(this, this.getClass()).a());
      this.bT.a(2, new cmc.e(this));
      this.bT.a(3, new cmc.c(this));
   }

   @Override
   protected buj.c bg() {
      return buj.c.a;
   }

   @Override
   public awa dn() {
      return awa.f;
   }

   @Override
   protected avy u() {
      return avz.xl;
   }

   @Override
   public void R() {
      if (!this.gt()) {
         super.R();
      }
   }

   @Override
   protected avy o_() {
      return avz.xr;
   }

   @Override
   protected avy e(bsz $$0) {
      return this.gt() ? avz.xt : avz.xs;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(a, jn.a);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static bwm.a m() {
      return bvh.C().a(bwn.s, 30.0);
   }

   @Override
   protected cbb G() {
      return new cmc.b(this);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(jn.a($$0.f("AttachFace")));
      this.al.a(b, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.al.a(c, $$0.f("Color"));
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.t().d());
      $$0.a("Peek", this.al.a(b));
      $$0.a("Color", this.al.a(c));
   }

   @Override
   public void h() {
      super.h();
      if (!this.dW().C && !this.bZ() && !this.a(this.dw(), this.t())) {
         this.gq();
      }

      if (this.gr()) {
         this.gs();
      }

      if (this.dW().C) {
         if (this.cl > 0) {
            this.cl--;
         } else {
            this.ck = null;
         }
      }
   }

   private void gq() {
      jn $$0 = this.h(this.dw());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.p();
      }
   }

   @Override
   protected fat ax() {
      float $$0 = L(this.cj);
      jn $$1 = this.t().g();
      float $$2 = this.dr() / 2.0F;
      return a(this.ek(), $$1, $$0).d(this.dB() - (double)$$2, this.dD(), this.dH() - (double)$$2);
   }

   private static float L(float $$0) {
      return 0.5F - ayy.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gr() {
      this.ci = this.cj;
      float $$0 = (float)this.gv() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = ayy.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = ayy.a(this.cj + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gs() {
      this.ay();
      float $$0 = L(this.cj);
      float $$1 = L(this.ci);
      jn $$2 = this.t().g();
      float $$3 = ($$0 - $$1) * this.ek();
      if (!($$3 <= 0.0F)) {
         for (buj $$5 : this.dW().a(this, a(this.ek(), $$2, $$1, $$0).d(this.dB() - 0.5, this.dD(), this.dH() - 0.5), buo.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cmc) && !$$5.ad) {
               $$5.a(bvj.e, new fay((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static fat a(float $$0, jn $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static fat a(float $$0, jn $$1, float $$2, float $$3) {
      fat $$4 = new fat(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(buj $$0, boolean $$1) {
      if (this.dW().B_()) {
         this.ck = null;
         this.cl = 0;
      }

      this.a(jn.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ae() {
      super.ae();
      if (this.dW().C) {
         this.ck = this.dw();
      }

      this.aY = 0.0F;
      this.aX = 0.0F;
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      this.v(0.0F);
      this.aZ = this.dM();
      this.bz();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bvj $$0, fay $$1) {
      if ($$0 == bvj.d) {
         this.p();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public fay dz() {
      return fay.c;
   }

   @Override
   public void h(fay $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      ji $$3 = this.dw();
      if (this.bZ()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)ayy.a($$0) + 0.5, (double)ayy.a($$1 + 0.5), (double)ayy.a($$2) + 0.5);
      }

      if (this.af != 0) {
         ji $$4 = this.dw();
         if (!$$4.equals($$3)) {
            this.al.a(b, (byte)0);
            this.ar = true;
            if (this.dW().C && !this.bZ() && !$$4.equals(this.ck)) {
               this.ck = $$3;
               this.cl = 6;
               this.aa = this.dB();
               this.ab = this.dD();
               this.ac = this.dH();
            }
         }
      }
   }

   @Nullable
   protected jn h(ji $$0) {
      for (jn $$1 : jn.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(ji $$0, jn $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jn $$2 = $$1.g();
         if (!this.dW().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            fat $$3 = a(this.ek(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dW().a(this, $$3);
         }
      }
   }

   private boolean i(ji $$0) {
      dwv $$1 = this.dW().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(djm.bX) && $$0.equals(this.dw());
         return !$$2;
      }
   }

   protected boolean p() {
      if (!this.gc() && this.bL()) {
         ji $$0 = this.dw();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ji $$2 = $$0.b(ayy.b(this.ae, -8, 8), ayy.b(this.ae, -8, 8), ayy.b(this.ae, -8, 8));
            if ($$2.v() > this.dW().L_() && this.dW().u($$2) && this.dW().F_().a($$2) && this.dW().a(this, new fat($$2).h(1.0E-6))) {
               jn $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ao();
                  this.a($$3);
                  this.a(avz.xw, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dW().a(ebr.R, $$0, ebr.a.a(this));
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
      this.bq = 0;
      this.a_($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (this.gt()) {
         buj $$3 = $$1.c();
         if ($$3 instanceof cpc) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eE() < (double)this.eS() * 0.5 && this.ae.a(4) == 0) {
            this.p();
         } else if ($$1.a(awq.j)) {
            buj $$4 = $$1.c();
            if ($$4 != null && $$4.aq() == buq.bc) {
               this.gu();
            }
         }

         return true;
      }
   }

   private boolean gt() {
      return this.gv() == 0;
   }

   private void gu() {
      fay $$0 = this.du();
      fat $$1 = this.cR();
      if (!this.gt() && this.p()) {
         int $$2 = this.dW().a(buq.bb, $$1.g(8.0), buj::bL).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dW().A.i() < $$3)) {
            cmc $$4 = buq.bb.a(this.dW(), bup.e);
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

   public jn t() {
      return this.al.a(a);
   }

   private void a(jn $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(ajx<?> $$0) {
      if (a.equals($$0)) {
         this.a(this.ax());
      }

      super.a($$0);
   }

   private int gv() {
      return this.al.a(b);
   }

   void b(int $$0) {
      if (!this.dW().C) {
         this.g(bwn.a).c(d);
         if ($$0 == 0) {
            this.g(bwn.a).d(bY);
            this.a(avz.xq, 1.0F, 1.0F);
            this.a(ebr.j);
         } else {
            this.a(avz.xu, 1.0F, 1.0F);
            this.a(ebr.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return ayy.h($$0, this.ci, this.cj);
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      this.aX = 0.0F;
      this.aY = 0.0F;
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
   public void h(buj $$0) {
   }

   @Nullable
   public fay K(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.ek();
         ji $$2 = this.dw();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return new fay(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cvk> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cvk> x() {
      return Optional.ofNullable(this.gp());
   }

   @Nullable
   public cvk gp() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cvk.a($$0) : null;
   }

   class a extends ccd {
      private int b;

      public a() {
         this.a(EnumSet.of(ccd.a.a, ccd.a.b));
      }

      @Override
      public boolean b() {
         bvf $$0 = cmc.this.O_();
         return $$0 != null && $$0.bL() ? cmc.this.dW().am() != bsf.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cmc.this.b(100);
      }

      @Override
      public void e() {
         cmc.this.b(0);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cmc.this.dW().am() != bsf.a) {
            this.b--;
            bvf $$0 = cmc.this.O_();
            if ($$0 != null) {
               cmc.this.H().a($$0, 180.0F, 180.0F);
               double $$1 = cmc.this.g((buj)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cmc.this.ae.a(10) * 20 / 2;
                     cmc.this.dW().b(new cpr(cmc.this.dW(), cmc.this, $$0, cmc.this.t().o()));
                     cmc.this.a(avz.xv, 2.0F, (cmc.this.ae.i() - cmc.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cmc.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cbb {
      public b(bvh $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cdw<bvf> {
      public c(cmc $$0) {
         super($$0, bvf.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof clo);
      }

      @Override
      public boolean b() {
         return this.e.cr() == null ? false : super.b();
      }

      @Override
      protected fat a(double $$0) {
         jn $$1 = ((cmc)this.e).t();
         if ($$1.o() == jn.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jn.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cbf {
      public d(final bvh $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jn $$0 = cmc.this.t().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cmc.cg));
         km $$2 = $$0.q();
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
            : Optional.of((float)(ayy.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cdw<cov> {
      public e(final cmc $$0) {
         super($$0, cov.class, true);
      }

      @Override
      public boolean b() {
         return cmc.this.dW().am() == bsf.a ? false : super.b();
      }

      @Override
      protected fat a(double $$0) {
         jn $$1 = ((cmc)this.e).t();
         if ($$1.o() == jn.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jn.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends ccd {
      private int b;

      @Override
      public boolean b() {
         return cmc.this.O_() == null && cmc.this.ae.a(b(40)) == 0 && cmc.this.a(cmc.this.dw(), cmc.this.t());
      }

      @Override
      public boolean c() {
         return cmc.this.O_() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cmc.this.ae.a(3)));
         cmc.this.b(30);
      }

      @Override
      public void e() {
         if (cmc.this.O_() == null) {
            cmc.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
