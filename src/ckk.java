import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckk extends btn implements cjt {
   private static final ajv<Integer> cb = ajz.a(ckk.class, ajx.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bZ;
   public float ca;
   private boolean cc;

   public ckk(bsw<? extends ckk> $$0, dcu $$1) {
      super($$0, $$1);
      this.cH();
      this.bR = new ckk.d(this);
   }

   @Override
   protected void z() {
      this.bU.a(1, new ckk.b(this));
      this.bU.a(2, new ckk.a(this));
      this.bU.a(3, new ckk.e(this));
      this.bU.a(5, new ckk.c(this));
      this.bV.a(1, new ccd<>(this, cmv.class, 10, true, false, $$0 -> Math.abs($$0.dx() - this.dx()) <= 4.0));
      this.bV.a(3, new ccd<>(this, cfo.class, true));
   }

   @Override
   public avp df() {
      return avp.f;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cb, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = ayn.a($$0, 1, 127);
      this.ao.a(cb, $$2);
      this.av();
      this.i_();
      this.f(buu.s).a((double)($$2 * $$2));
      this.f(buu.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(buu.c).a((double)$$2);
      if ($$1) {
         this.u(this.eO());
      }

      this.bP = $$2;
   }

   public int gn() {
      return this.ao.a(cb);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Size", this.gn() - 1);
      $$0.a("wasOnGround", this.cc);
   }

   @Override
   public void a(ua $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.cc = $$0.q("wasOnGround");
   }

   public boolean go() {
      return this.gn() <= 1;
   }

   protected lk t() {
      return lm.U;
   }

   @Override
   protected boolean X() {
      return this.gn() > 0;
   }

   @Override
   public void l() {
      this.bZ = this.bZ + (this.e - this.bZ) * 0.5F;
      this.ca = this.bZ;
      super.l();
      if (this.aF() && !this.cc) {
         float $$0 = this.a(this.at()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ah.i() * (float) (Math.PI * 2);
            float $$4 = this.ah.i() * 0.5F + 0.5F;
            float $$5 = ayn.a($$3) * $$1 * $$4;
            float $$6 = ayn.b($$3) * $$1 * $$4;
            this.dQ().a(this.t(), this.dv() + (double)$$5, this.dx(), this.dB() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gl(), this.fb(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aF() && this.cc) {
         this.e = 1.0F;
      }

      this.cc = this.aF();
      this.gi();
   }

   @Override
   protected void gi() {
      this.e *= 0.6F;
   }

   protected int x() {
      return this.ah.a(20) + 10;
   }

   @Override
   public void i_() {
      double $$0 = this.dv();
      double $$1 = this.dx();
      double $$2 = this.dB();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(ajv<?> $$0) {
      if (cb.equals($$0)) {
         this.i_();
         this.s(this.ba);
         this.aY = this.ba;
         if (this.bf() && this.ah.a(20) == 0) {
            this.bo();
         }
      }

      super.a($$0);
   }

   @Override
   public bsw<? extends ckk> am() {
      return (bsw<? extends ckk>)super.am();
   }

   @Override
   public void a(bsq.c $$0) {
      int $$1 = this.gn();
      if (!this.dQ().B && $$1 > 1 && this.ey()) {
         wy $$2 = this.aj();
         boolean $$3 = this.gb();
         float $$4 = this.a(this.at()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.ah.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            ckk $$11 = this.am().a(this.dQ());
            if ($$11 != null) {
               if (this.fR()) {
                  $$11.fP();
               }

               $$11.b($$2);
               $$11.c($$3);
               $$11.o(this.cv());
               $$11.a($$6, true);
               $$11.b(this.dv() + (double)$$9, this.dx() + 0.5, this.dB() + (double)$$10, this.ah.i() * 360.0F, 0.0F);
               this.dQ().b($$11);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bsq $$0) {
      super.h($$0);
      if ($$0 instanceof cfo && this.gj()) {
         this.j((btl)$$0);
      }
   }

   @Override
   public void b_(cmv $$0) {
      if (this.gj()) {
         this.j($$0);
      }
   }

   protected void j(btl $$0) {
      if (this.bE()) {
         int $$1 = this.gn();
         if (this.g((bsq)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.F($$0)) {
            brj $$2 = this.dR().b((btl)this);
            if ($$0.a($$2, this.gk())) {
               this.a(avo.xp, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               if (this.dQ() instanceof aqt $$3) {
                  dac.a($$3, (bsq)$$0, $$2);
               }
            }
         }
      }
   }

   @Override
   protected eww a(bsq $$0, bst $$1, float $$2) {
      return new eww(0.0, (double)$$1.b() - 0.015625 * (double)this.gn() * (double)$$2, 0.0);
   }

   protected boolean gj() {
      return !this.go() && this.dc();
   }

   protected float gk() {
      return (float)this.g(buu.c);
   }

   @Override
   protected avn d(brj $$0) {
      return this.go() ? avo.yg : avo.xr;
   }

   @Override
   protected avn n_() {
      return this.go() ? avo.yf : avo.xq;
   }

   protected avn gl() {
      return this.go() ? avo.yi : avo.xt;
   }

   public static boolean c(bsw<ckk> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      if (btp.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.al() != bqn.a) {
            if ($$2 == btp.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(awc.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.aq() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof ddq)) {
               return false;
            }

            dcb $$5 = new dcb($$3);
            boolean $$6 = dzu.a($$5.e, $$5.f, ((ddq)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float fb() {
      return 0.4F * (float)this.gn();
   }

   @Override
   public int aa() {
      return 0;
   }

   protected boolean gp() {
      return this.gn() > 0;
   }

   @Override
   protected void fg() {
      eww $$0 = this.dt();
      this.n($$0.c, (double)this.fe(), $$0.e);
      this.av = true;
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      ayv $$4 = $$0.E_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float s() {
      float $$0 = this.go() ? 1.4F : 0.8F;
      return ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * $$0;
   }

   protected avn gm() {
      return this.go() ? avo.yh : avo.xs;
   }

   @Override
   public bst e(bty $$0) {
      return super.e($$0).a((float)this.gn());
   }

   static class a extends cak {
      private final ckk a;
      private int b;

      public a(ckk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cak.a.b));
      }

      @Override
      public boolean b() {
         btl $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.H() instanceof ckk.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         btl $$0 = this.a.p();
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
      public void a() {
         btl $$0 = this.a.p();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.H() instanceof ckk.d $$1) {
            $$1.a(this.a.dG(), this.a.gj());
         }
      }
   }

   static class b extends cak {
      private final ckk a;

      public b(ckk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cak.a.c, cak.a.a));
         $$0.J().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bf() || this.a.bt()) && this.a.H() instanceof ckk.d;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dT().i() < 0.8F) {
            this.a.I().a();
         }

         if (this.a.H() instanceof ckk.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cak {
      private final ckk a;

      public c(ckk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cak.a.c, cak.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bS();
      }

      @Override
      public void a() {
         if (this.a.H() instanceof ckk.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bzn {
      private float l;
      private int m;
      private final ckk n;
      private boolean o;

      public d(ckk $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dG() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bzn.a.b;
      }

      @Override
      public void a() {
         this.d.s(this.a(this.d.dG(), this.l, 90.0F));
         this.d.ba = this.d.dG();
         this.d.aY = this.d.dG();
         if (this.k != bzn.a.b) {
            this.d.D(0.0F);
         } else {
            this.k = bzn.a.a;
            if (this.d.aF()) {
               this.d.z((float)(this.h * this.d.g(buu.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.x();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.I().a();
                  if (this.n.gp()) {
                     this.n.a(this.n.gm(), this.n.fb(), this.n.s());
                  }
               } else {
                  this.n.bo = 0.0F;
                  this.n.bq = 0.0F;
                  this.d.z(0.0F);
               }
            } else {
               this.d.z((float)(this.h * this.d.g(buu.v)));
            }
         }
      }
   }

   static class e extends cak {
      private final ckk a;
      private float b;
      private int c;

      public e(ckk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cak.a.b));
      }

      @Override
      public boolean b() {
         return this.a.p() == null && (this.a.aF() || this.a.bf() || this.a.bt() || this.a.b(bsa.y)) && this.a.H() instanceof ckk.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dT().a(60));
            this.b = (float)this.a.dT().a(360);
         }

         if (this.a.H() instanceof ckk.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
