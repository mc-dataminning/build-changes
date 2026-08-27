import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjl extends bsq implements ciu {
   private static final ajr<Integer> bZ = ajv.a(cjl.class, ajt.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bX;
   public float bY;
   private boolean ca;

   public cjl(bsa<? extends cjl> $$0, dax $$1) {
      super($$0, $$1);
      this.cG();
      this.bP = new cjl.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cjl.b(this));
      this.bS.a(2, new cjl.a(this));
      this.bS.a(3, new cjl.e(this));
      this.bS.a(5, new cjl.c(this));
      this.bT.a(1, new cbf<>(this, clw.class, 10, true, false, $$0 -> Math.abs($$0.dw() - this.dw()) <= 4.0));
      this.bT.a(3, new cbf<>(this, ceq.class, true));
   }

   @Override
   public avi de() {
      return avi.f;
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(bZ, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = ayd.a($$0, 1, 127);
      this.ao.a(bZ, $$2);
      this.at();
      this.j_();
      this.f(btw.q).a((double)($$2 * $$2));
      this.f(btw.r).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(btw.c).a((double)$$2);
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
            float $$5 = ayd.a($$3) * $$1 * $$4;
            float $$6 = ayd.b($$3) * $$1 * $$4;
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
   public void a(ajr<?> $$0) {
      if (bZ.equals($$0)) {
         this.j_();
         this.r(this.bb);
         this.aZ = this.bb;
         if (this.be() && this.ah.a(20) == 0) {
            this.bn();
         }
      }

      super.a($$0);
   }

   @Override
   public bsa<? extends cjl> ak() {
      return (bsa<? extends cjl>)super.ak();
   }

   @Override
   public void a(bru.c $$0) {
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
            cjl $$11 = this.ak().a(this.dP());
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
   public void h(bru $$0) {
      super.h($$0);
      if ($$0 instanceof ceq && this.gm()) {
         this.j((bso)$$0);
      }
   }

   @Override
   public void b_(clw $$0) {
      if (this.gm()) {
         this.j($$0);
      }
   }

   protected void j(bso $$0) {
      if (this.bD()) {
         int $$1 = this.gq();
         if (this.g((bru)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dQ().b((bso)this), this.gn())) {
            this.a(avh.xm, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected euk a(bru $$0, brx $$1, float $$2) {
      return new euk(0.0, (double)$$1.b() - 0.015625 * (double)this.gq() * (double)$$2, 0.0);
   }

   protected boolean gm() {
      return !this.gr() && this.db();
   }

   protected float gn() {
      return (float)this.g(btw.c);
   }

   @Override
   protected avg d(bqn $$0) {
      return this.gr() ? avh.yd : avh.xo;
   }

   @Override
   protected avg o_() {
      return this.gr() ? avh.yc : avh.xn;
   }

   protected avg go() {
      return this.gr() ? avh.yf : avh.xq;
   }

   public static boolean c(bsa<cjl> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      if (bss.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.ak() != bpr.a) {
            if ($$2 == bss.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(avv.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ap() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof dbs)) {
               return false;
            }

            dae $$5 = new dae($$3);
            boolean $$6 = dxs.a($$5.e, $$5.f, ((dbs)$$1).C(), 987234911L).a(10) == 0;
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
      euk $$0 = this.ds();
      this.o($$0.c, (double)this.fh(), $$0.e);
      this.av = true;
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ayk $$4 = $$0.E_();
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

   protected avg gp() {
      return this.gr() ? avh.ye : avh.xp;
   }

   @Override
   public brx e(bta $$0) {
      return super.e($$0).a((float)this.gq());
   }

   static class a extends bzm {
      private final cjl a;
      private int b;

      public a(cjl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzm.a.b));
      }

      @Override
      public boolean a() {
         bso $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.H() instanceof cjl.d;
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
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bso $$0 = this.a.p();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.H() instanceof cjl.d $$1) {
            $$1.a(this.a.dF(), this.a.gm());
         }
      }
   }

   static class b extends bzm {
      private final cjl a;

      public b(cjl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzm.a.c, bzm.a.a));
         $$0.K().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.be() || this.a.bs()) && this.a.H() instanceof cjl.d;
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

         if (this.a.H() instanceof cjl.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bzm {
      private final cjl a;

      public c(cjl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzm.a.c, bzm.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bR();
      }

      @Override
      public void e() {
         if (this.a.H() instanceof cjl.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends byp {
      private float l;
      private int m;
      private final cjl n;
      private boolean o;

      public d(cjl $$0) {
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
         this.k = byp.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dF(), this.l, 90.0F));
         this.d.bb = this.d.dF();
         this.d.aZ = this.d.dF();
         if (this.k != byp.a.b) {
            this.d.C(0.0F);
         } else {
            this.k = byp.a.a;
            if (this.d.aE()) {
               this.d.y((float)(this.h * this.d.g(btw.r)));
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
                  this.n.bp = 0.0F;
                  this.n.br = 0.0F;
                  this.d.y(0.0F);
               }
            } else {
               this.d.y((float)(this.h * this.d.g(btw.r)));
            }
         }
      }
   }

   static class e extends bzm {
      private final cjl a;
      private float b;
      private int c;

      public e(cjl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzm.a.b));
      }

      @Override
      public boolean a() {
         return this.a.p() == null && (this.a.aE() || this.a.be() || this.a.bs() || this.a.b(bre.y)) && this.a.H() instanceof cjl.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.el().a(60));
            this.b = (float)this.a.el().a(360);
         }

         if (this.a.H() instanceof cjl.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
