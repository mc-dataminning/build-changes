import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjn extends bss implements ciw {
   private static final ajs<Integer> bZ = ajw.a(cjn.class, aju.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bX;
   public float bY;
   private boolean ca;

   public cjn(bsc<? extends cjn> $$0, daz $$1) {
      super($$0, $$1);
      this.cG();
      this.bP = new cjn.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cjn.b(this));
      this.bS.a(2, new cjn.a(this));
      this.bS.a(3, new cjn.e(this));
      this.bS.a(5, new cjn.c(this));
      this.bT.a(1, new cbh<>(this, cly.class, 10, true, false, $$0 -> Math.abs($$0.dw() - this.dw()) <= 4.0));
      this.bT.a(3, new cbh<>(this, ces.class, true));
   }

   @Override
   public avj de() {
      return avj.f;
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(bZ, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = ayf.a($$0, 1, 127);
      this.ao.a(bZ, $$2);
      this.at();
      this.j_();
      this.f(bty.q).a((double)($$2 * $$2));
      this.f(bty.r).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(bty.c).a((double)$$2);
      if ($$1) {
         this.t(this.eR());
      }

      this.bN = $$2;
   }

   public int gq() {
      return this.ao.a(bZ);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Size", this.gq() - 1);
      $$0.a("wasOnGround", this.ca);
   }

   @Override
   public void a(ud $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.ca = $$0.q("wasOnGround");
   }

   public boolean gr() {
      return this.gq() <= 1;
   }

   protected kw u() {
      return ky.U;
   }

   @Override
   protected boolean W() {
      return this.gq() > 0;
   }

   @Override
   public void l() {
      this.bX = this.bX + (this.e - this.bX) * 0.5F;
      this.bY = this.bX;
      super.l();
      if (this.aE() && !this.ca) {
         float $$0 = this.a(this.ar()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ah.i() * (float) (Math.PI * 2);
            float $$4 = this.ah.i() * 0.5F + 0.5F;
            float $$5 = ayf.a($$3) * $$1 * $$4;
            float $$6 = ayf.b($$3) * $$1 * $$4;
            this.dP().a(this.u(), this.du() + (double)$$5, this.dw(), this.dA() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.go(), this.fe(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aE() && this.ca) {
         this.e = 1.0F;
      }

      this.ca = this.aE();
      this.gl();
   }

   @Override
   protected void gl() {
      this.e *= 0.6F;
   }

   protected int y() {
      return this.ah.a(20) + 10;
   }

   @Override
   public void j_() {
      double $$0 = this.du();
      double $$1 = this.dw();
      double $$2 = this.dA();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(ajs<?> $$0) {
      if (bZ.equals($$0)) {
         this.j_();
         this.r(this.ba);
         this.aY = this.ba;
         if (this.be() && this.ah.a(20) == 0) {
            this.bn();
         }
      }

      super.a($$0);
   }

   @Override
   public bsc<? extends cjn> ak() {
      return (bsc<? extends cjn>)super.ak();
   }

   @Override
   public void a(brw.c $$0) {
      int $$1 = this.gq();
      if (!this.dP().B && $$1 > 1 && this.eB()) {
         wx $$2 = this.ah();
         boolean $$3 = this.gf();
         float $$4 = this.a(this.ar()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.ah.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            cjn $$11 = this.ak().a(this.dP());
            if ($$11 != null) {
               if (this.fV()) {
                  $$11.fT();
               }

               $$11.b($$2);
               $$11.t($$3);
               $$11.n(this.cu());
               $$11.a($$6, true);
               $$11.b(this.du() + (double)$$9, this.dw() + 0.5, this.dA() + (double)$$10, this.ah.i() * 360.0F, 0.0F);
               this.dP().b($$11);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void h(brw $$0) {
      super.h($$0);
      if ($$0 instanceof ces && this.gm()) {
         this.j((bsq)$$0);
      }
   }

   @Override
   public void b_(cly $$0) {
      if (this.gm()) {
         this.j($$0);
      }
   }

   protected void j(bsq $$0) {
      if (this.bD()) {
         int $$1 = this.gq();
         if (this.g((brw)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dQ().b((bsq)this), this.gn())) {
            this.a(avi.xm, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected eum a(brw $$0, brz $$1, float $$2) {
      return new eum(0.0, (double)$$1.b() - 0.015625 * (double)this.gq() * (double)$$2, 0.0);
   }

   protected boolean gm() {
      return !this.gr() && this.db();
   }

   protected float gn() {
      return (float)this.g(bty.c);
   }

   @Override
   protected avh d(bqp $$0) {
      return this.gr() ? avi.yd : avi.xo;
   }

   @Override
   protected avh o_() {
      return this.gr() ? avi.yc : avi.xn;
   }

   protected avh go() {
      return this.gr() ? avi.yf : avi.xq;
   }

   public static boolean c(bsc<cjn> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      if (bsu.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.ak() != bpt.a) {
            if ($$2 == bsu.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(avw.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ap() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof dbu)) {
               return false;
            }

            dag $$5 = new dag($$3);
            boolean $$6 = dxu.a($$5.e, $$5.f, ((dbu)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float fe() {
      return 0.4F * (float)this.gq();
   }

   @Override
   public int Z() {
      return 0;
   }

   protected boolean gs() {
      return this.gq() > 0;
   }

   @Override
   protected void fj() {
      eum $$0 = this.ds();
      this.o($$0.c, (double)this.fh(), $$0.e);
      this.av = true;
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      aym $$4 = $$0.E_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float s() {
      float $$0 = this.gr() ? 1.4F : 0.8F;
      return ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * $$0;
   }

   protected avh gp() {
      return this.gr() ? avi.ye : avi.xp;
   }

   @Override
   public brz e(btc $$0) {
      return super.e($$0).a((float)this.gq());
   }

   static class a extends bzo {
      private final cjn a;
      private int b;

      public a(cjn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzo.a.b));
      }

      @Override
      public boolean a() {
         bsq $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.H() instanceof cjn.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bsq $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bsq $$0 = this.a.p();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.H() instanceof cjn.d $$1) {
            $$1.a(this.a.dF(), this.a.gm());
         }
      }
   }

   static class b extends bzo {
      private final cjn a;

      public b(cjn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzo.a.c, bzo.a.a));
         $$0.K().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.be() || this.a.bs()) && this.a.H() instanceof cjn.d;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.el().i() < 0.8F) {
            this.a.I().a();
         }

         if (this.a.H() instanceof cjn.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bzo {
      private final cjn a;

      public c(cjn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzo.a.c, bzo.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bR();
      }

      @Override
      public void e() {
         if (this.a.H() instanceof cjn.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends byr {
      private float l;
      private int m;
      private final cjn n;
      private boolean o;

      public d(cjn $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dF() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = byr.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dF(), this.l, 90.0F));
         this.d.ba = this.d.dF();
         this.d.aY = this.d.dF();
         if (this.k != byr.a.b) {
            this.d.C(0.0F);
         } else {
            this.k = byr.a.a;
            if (this.d.aE()) {
               this.d.y((float)(this.h * this.d.g(bty.r)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.I().a();
                  if (this.n.gs()) {
                     this.n.a(this.n.gp(), this.n.fe(), this.n.s());
                  }
               } else {
                  this.n.bo = 0.0F;
                  this.n.bq = 0.0F;
                  this.d.y(0.0F);
               }
            } else {
               this.d.y((float)(this.h * this.d.g(bty.r)));
            }
         }
      }
   }

   static class e extends bzo {
      private final cjn a;
      private float b;
      private int c;

      public e(cjn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzo.a.b));
      }

      @Override
      public boolean a() {
         return this.a.p() == null && (this.a.aE() || this.a.be() || this.a.bs() || this.a.b(brg.y)) && this.a.H() instanceof cjn.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.el().a(60));
            this.b = (float)this.a.el().a(360);
         }

         if (this.a.H() instanceof cjn.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
