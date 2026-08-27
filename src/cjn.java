import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjn extends bsq implements ciu {
   private static final ajy<Integer> ch = akc.a(cjn.class, aka.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float cg;
   private boolean ci;

   public cjn(bsb<? extends cjn> $$0, dca $$1) {
      super($$0, $$1);
      this.cL();
      this.bY = new cjn.d(this);
   }

   @Override
   protected void y() {
      this.cb.a(1, new cjn.b(this));
      this.cb.a(2, new cjn.a(this));
      this.cb.a(3, new cjn.e(this));
      this.cb.a(5, new cjn.c(this));
      this.cc.a(1, new cbe<>(this, cly.class, 10, true, false, $$0 -> Math.abs($$0.dB() - this.dB()) <= 4.0));
      this.cc.a(3, new cbe<>(this, ceq.class, true));
   }

   @Override
   public avq dj() {
      return avq.f;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ch, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = aym.a($$0, 1, 127);
      this.as.a(ch, $$2);
      this.at();
      this.i_();
      this.f(btv.q).a((double)($$2 * $$2));
      this.f(btv.r).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(btv.c).a((double)$$2);
      if ($$1) {
         this.t(this.eZ());
      }

      this.bW = $$2;
   }

   public int gz() {
      return this.as.a(ch);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Size", this.gz() - 1);
      $$0.a("wasOnGround", this.ci);
   }

   @Override
   public void a(uk $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.ci = $$0.q("wasOnGround");
   }

   public boolean gA() {
      return this.gz() <= 1;
   }

   protected kz t() {
      return lb.T;
   }

   @Override
   protected boolean W() {
      return this.gz() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.cg = this.e;
      super.l();
      if (this.aE() && !this.ci) {
         float $$0 = this.a(this.ar()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.al.i() * (float) (Math.PI * 2);
            float $$4 = this.al.i() * 0.5F + 0.5F;
            float $$5 = aym.a($$3) * $$1 * $$4;
            float $$6 = aym.b($$3) * $$1 * $$4;
            this.dU().a(this.t(), this.dz() + (double)$$5, this.dB(), this.dF() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gx(), this.fn(), ((this.al.i() - this.al.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aE() && this.ci) {
         this.d = 1.0F;
      }

      this.ci = this.aE();
      this.gu();
   }

   @Override
   protected void gu() {
      this.d *= 0.6F;
   }

   protected int x() {
      return this.al.a(20) + 10;
   }

   @Override
   public void i_() {
      double $$0 = this.dz();
      double $$1 = this.dB();
      double $$2 = this.dF();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (ch.equals($$0)) {
         this.i_();
         this.r(this.bl);
         this.bj = this.bl;
         if (this.bi() && this.al.a(20) == 0) {
            this.br();
         }
      }

      super.a($$0);
   }

   @Override
   public bsb<? extends cjn> ak() {
      return (bsb<? extends cjn>)super.ak();
   }

   @Override
   public void a(brv.d $$0) {
      int $$1 = this.gz();
      if (!this.dU().C && $$1 > 1 && this.eJ()) {
         xe $$2 = this.ah();
         boolean $$3 = this.go();
         float $$4 = this.a(this.ar()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.al.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            cjn $$11 = this.ak().a(this.dU());
            if ($$11 != null) {
               if (this.ge()) {
                  $$11.gc();
               }

               $$11.b($$2);
               $$11.t($$3);
               $$11.n(this.cz());
               $$11.a($$6, true);
               $$11.b(this.dz() + (double)$$9, this.dB() + 0.5, this.dF() + (double)$$10, this.al.i() * 360.0F, 0.0F);
               this.dU().b($$11);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void h(brv $$0) {
      super.h($$0);
      if ($$0 instanceof ceq && this.gv()) {
         this.j((bso)$$0);
      }
   }

   @Override
   public void b_(cly $$0) {
      if (this.gv()) {
         this.j($$0);
      }
   }

   protected void j(bso $$0) {
      if (this.bI()) {
         int $$1 = this.gz();
         if (this.g((brv)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dX().b((bso)this), this.gw())) {
            this.a(avo.xK, 1.0F, (this.al.i() - this.al.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected ewu a(brv $$0, bry $$1, float $$2) {
      return new ewu(0.0, (double)$$1.b() - 0.015625 * (double)this.gz() * (double)$$2, 0.0);
   }

   protected boolean gv() {
      return !this.gA() && this.dg();
   }

   protected float gw() {
      return (float)this.g(btv.c);
   }

   @Override
   protected avn d(bqt $$0) {
      return this.gA() ? avo.yB : avo.xM;
   }

   @Override
   protected avn n_() {
      return this.gA() ? avo.yA : avo.xL;
   }

   protected avn gx() {
      return this.gA() ? avo.yD : avo.xO;
   }

   public static boolean c(bsb<cjn> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      if (bss.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.al() != bpx.a) {
            if ($$2 == bss.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            ja<dcz> $$5 = $$1.t($$3);
            if ($$5.a(ddg.g)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$5.a(awd.au) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.aq() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof dcv)) {
               return false;
            }

            dbh $$6 = new dbh($$3);
            boolean $$7 = dzt.a($$6.e, $$6.f, ((dcv)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$7 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float fn() {
      return 0.4F * (float)this.gz();
   }

   @Override
   public int Z() {
      return 0;
   }

   protected boolean gB() {
      return this.gz() > 0;
   }

   @Override
   protected void fs() {
      ewu $$0 = this.dx();
      this.o($$0.c, (double)this.fq(), $$0.e);
      this.az = true;
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ayt $$4 = $$0.F_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float r() {
      float $$0 = this.gA() ? 1.4F : 0.8F;
      return ((this.al.i() - this.al.i()) * 0.2F + 1.0F) * $$0;
   }

   protected avn gy() {
      return this.gA() ? avo.yC : avo.xN;
   }

   @Override
   public bry e(bsz $$0) {
      return super.e($$0).a((float)this.gz());
   }

   static class a extends bzl {
      private final cjn a;
      private int b;

      public a(cjn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.b));
      }

      @Override
      public boolean a() {
         bso $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.G() instanceof cjn.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bso $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         bso $$0 = this.a.p();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.G() instanceof cjn.d $$1) {
            $$1.a(this.a.dK(), this.a.gv());
         }
      }
   }

   static class b extends bzl {
      private final cjn a;

      public b(cjn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.c, bzl.a.a));
         $$0.J().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.bi() || this.a.bx()) && this.a.G() instanceof cjn.d;
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.et().i() < 0.8F) {
            this.a.I().a();
         }

         if (this.a.G() instanceof cjn.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bzl {
      private final cjn a;

      public c(cjn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.c, bzl.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bW();
      }

      @Override
      public void e() {
         if (this.a.G() instanceof cjn.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends byo {
      private float l;
      private int m;
      private final cjn n;
      private boolean o;

      public d(cjn $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dK() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = byo.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dK(), this.l, 90.0F));
         this.d.bl = this.d.dK();
         this.d.bj = this.d.dK();
         if (this.k != byo.a.b) {
            this.d.C(0.0F);
         } else {
            this.k = byo.a.a;
            if (this.d.aE()) {
               this.d.y((float)(this.h * this.d.g(btv.r)));
               if (this.m-- <= 0) {
                  this.m = this.n.x();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.I().a();
                  if (this.n.gB()) {
                     this.n.a(this.n.gy(), this.n.fn(), this.n.r());
                  }
               } else {
                  this.n.bz = 0.0F;
                  this.n.bB = 0.0F;
                  this.d.y(0.0F);
               }
            } else {
               this.d.y((float)(this.h * this.d.g(btv.r)));
            }
         }
      }
   }

   static class e extends bzl {
      private final cjn a;
      private float b;
      private int c;

      public e(cjn $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.b));
      }

      @Override
      public boolean a() {
         return this.a.p() == null && (this.a.aE() || this.a.bi() || this.a.bx() || this.a.b(brj.y)) && this.a.G() instanceof cjn.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.et().a(60));
            this.b = (float)this.a.et().a(360);
         }

         if (this.a.G() instanceof cjn.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
