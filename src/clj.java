import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class clj extends bum implements cks {
   private static final akg<Integer> bZ = akk.a(clj.class, aki.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bX;
   public float bY;
   private boolean ca;

   public clj(btv<? extends clj> $$0, deg $$1) {
      super($$0, $$1);
      this.cK();
      this.bP = new clj.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new clj.b(this));
      this.bS.a(2, new clj.a(this));
      this.bS.a(3, new clj.e(this));
      this.bS.a(5, new clj.c(this));
      this.bT.a(1, new cda<>(this, cnu.class, 10, true, false, $$0 -> Math.abs($$0.dz() - this.dz()) <= 4.0));
      this.bT.a(3, new cda<>(this, cgm.class, true));
   }

   @Override
   public awf di() {
      return awf.f;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azd.a($$0, 1, 127);
      this.am.a(bZ, $$2);
      this.ax();
      this.i_();
      this.g(bvr.s).a((double)($$2 * $$2));
      this.g(bvr.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bvr.c).a((double)$$2);
      if ($$1) {
         this.x(this.eQ());
      }

      this.bN = $$2;
   }

   public int gq() {
      return this.am.a(bZ);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Size", this.gq() - 1);
      $$0.a("wasOnGround", this.ca);
   }

   @Override
   public void a(uf $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.ca = $$0.q("wasOnGround");
   }

   public boolean gr() {
      return this.gq() <= 1;
   }

   protected ll t() {
      return ln.U;
   }

   @Override
   protected boolean ab() {
      return this.gq() > 0;
   }

   @Override
   public void l() {
      this.bY = this.bX;
      this.bX = this.bX + (this.e - this.bX) * 0.5F;
      super.l();
      if (this.aH() && !this.ca) {
         float $$0 = this.a(this.av()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.af.i() * (float) (Math.PI * 2);
            float $$4 = this.af.i() * 0.5F + 0.5F;
            float $$5 = azd.a($$3) * $$1 * $$4;
            float $$6 = azd.b($$3) * $$1 * $$4;
            this.dS().a(this.t(), this.dx() + (double)$$5, this.dz(), this.dD() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.go(), this.fd(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aH() && this.ca) {
         this.e = 1.0F;
      }

      this.ca = this.aH();
      this.gl();
   }

   protected void gl() {
      this.e *= 0.6F;
   }

   protected int y() {
      return this.af.a(20) + 10;
   }

   @Override
   public void i_() {
      double $$0 = this.dx();
      double $$1 = this.dz();
      double $$2 = this.dD();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(akg<?> $$0) {
      if (bZ.equals($$0)) {
         this.i_();
         this.v(this.aV);
         this.aT = this.aV;
         if (this.bi() && this.af.a(20) == 0) {
            this.br();
         }
      }

      super.a($$0);
   }

   @Override
   public btv<? extends clj> ao() {
      return (btv<? extends clj>)super.ao();
   }

   @Override
   public void a(bto.c $$0) {
      int $$1 = this.gq();
      if (!this.dS().B && $$1 > 1 && this.eB()) {
         xd $$2 = this.al();
         boolean $$3 = this.ge();
         float $$4 = this.a(this.av()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.af.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            clj $$11 = this.ao().a(this.dS(), btu.k);
            if ($$11 != null) {
               if (this.fY()) {
                  $$11.fW();
               }

               $$11.b($$2);
               $$11.u($$3);
               $$11.n(this.cz());
               $$11.a($$6, true);
               $$11.b(this.dx() + (double)$$9, this.dz() + 0.5, this.dD() + (double)$$10, this.af.i() * 360.0F, 0.0F);
               this.dS().b($$11);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bto $$0) {
      super.h($$0);
      if ($$0 instanceof cgm && this.gm()) {
         this.j((buk)$$0);
      }
   }

   @Override
   public void b_(cnu $$0) {
      if (this.gm()) {
         this.j($$0);
      }
   }

   protected void j(buk $$0) {
      if (this.bI() && this.i($$0) && this.G($$0)) {
         bsg $$1 = this.dT().b((buk)this);
         if ($$0.a($$1, this.gn())) {
            this.a(awe.xq, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            if (this.dS() instanceof arh $$2) {
               dbm.a($$2, (bto)$$0, $$1);
            }
         }
      }
   }

   @Override
   protected eys a(bto $$0, btr $$1, float $$2) {
      return new eys(0.0, (double)$$1.b() - 0.015625 * (double)this.gq() * (double)$$2, 0.0);
   }

   protected boolean gm() {
      return !this.gr() && this.df();
   }

   protected float gn() {
      return (float)this.h(bvr.c);
   }

   @Override
   protected awd d(bsg $$0) {
      return this.gr() ? awe.ym : awe.xs;
   }

   @Override
   protected awd n_() {
      return this.gr() ? awe.yl : awe.xr;
   }

   protected awd go() {
      return this.gr() ? awe.yo : awe.xu;
   }

   public static boolean c(btv<clj> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      if ($$1.am() != brm.a) {
         if (btu.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(aws.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ar() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dfd)) {
            return false;
         }

         ddm $$5 = new ddm($$3);
         boolean $$6 = ebj.a($$5.e, $$5.f, ((dfd)$$1).C(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fd() {
      return 0.4F * (float)this.gq();
   }

   @Override
   public int ae() {
      return 0;
   }

   protected boolean gs() {
      return this.gq() > 0;
   }

   @Override
   public void v() {
      eys $$0 = this.dv();
      this.n($$0.d, (double)this.fg(), $$0.f);
      this.as = true;
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      azl $$4 = $$0.C_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float q() {
      float $$0 = this.gr() ? 1.4F : 0.8F;
      return ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * $$0;
   }

   protected awd gp() {
      return this.gr() ? awe.yn : awe.xt;
   }

   @Override
   public btr e(buw $$0) {
      return super.e($$0).a((float)this.gq());
   }

   static class a extends cbh {
      private final clj a;
      private int b;

      public a(clj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbh.a.b));
      }

      @Override
      public boolean b() {
         buk $$0 = this.a.m();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.M() instanceof clj.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         buk $$0 = this.a.m();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         buk $$0 = this.a.m();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.M() instanceof clj.d $$1) {
            $$1.a(this.a.dI(), this.a.gm());
         }
      }
   }

   static class b extends cbh {
      private final clj a;

      public b(clj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbh.a.c, cbh.a.a));
         $$0.P().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bi() || this.a.bw()) && this.a.M() instanceof clj.d;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dV().i() < 0.8F) {
            this.a.O().a();
         }

         if (this.a.M() instanceof clj.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cbh {
      private final clj a;

      public c(clj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbh.a.c, cbh.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bW();
      }

      @Override
      public void a() {
         if (this.a.M() instanceof clj.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cak {
      private float l;
      private int m;
      private final clj n;
      private boolean o;

      public d(clj $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dI() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = cak.a.b;
      }

      @Override
      public void a() {
         this.d.v(this.a(this.d.dI(), this.l, 90.0F));
         this.d.aV = this.d.dI();
         this.d.aT = this.d.dI();
         if (this.k != cak.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cak.a.a;
            if (this.d.aH()) {
               this.d.C((float)(this.h * this.d.h(bvr.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.O().a();
                  if (this.n.gs()) {
                     this.n.a(this.n.gp(), this.n.fd(), this.n.q());
                  }
               } else {
                  this.n.bk = 0.0F;
                  this.n.bm = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bvr.v)));
            }
         }
      }
   }

   static class e extends cbh {
      private final clj a;
      private float b;
      private int c;

      public e(clj $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbh.a.b));
      }

      @Override
      public boolean b() {
         return this.a.m() == null && (this.a.aH() || this.a.bi() || this.a.bw() || this.a.b(bsx.y)) && this.a.M() instanceof clj.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dV().a(60));
            this.b = (float)this.a.dV().a(360);
         }

         if (this.a.M() instanceof clj.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
