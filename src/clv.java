import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class clv extends bux implements cle {
   private static final akk<Integer> bZ = ako.a(clv.class, akm.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bX;
   public float bY;
   private boolean ca;

   public clv(bug<? extends clv> $$0, dev $$1) {
      super($$0, $$1);
      this.cO();
      this.bP = new clv.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new clv.b(this));
      this.bS.a(2, new clv.a(this));
      this.bS.a(3, new clv.e(this));
      this.bS.a(5, new clv.c(this));
      this.bT.a(1, new cdm<>(this, coh.class, 10, true, false, $$0 -> Math.abs($$0.dE() - this.dE()) <= 4.0));
      this.bT.a(3, new cdm<>(this, cgy.class, true));
   }

   @Override
   public awl dn() {
      return awl.f;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bZ, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azj.a($$0, 1, 127);
      this.am.a(bZ, $$2);
      this.az();
      this.j_();
      this.g(bwd.s).a((double)($$2 * $$2));
      this.g(bwd.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bwd.c).a((double)$$2);
      if ($$1) {
         this.x(this.eV());
      }

      this.bN = $$2;
   }

   public int gw() {
      return this.am.a(bZ);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Size", this.gw() - 1);
      $$0.a("wasOnGround", this.ca);
   }

   @Override
   public void a(uj $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.ca = $$0.q("wasOnGround");
   }

   public boolean gx() {
      return this.gw() <= 1;
   }

   protected lo t() {
      return lq.U;
   }

   @Override
   protected boolean aa() {
      return this.gw() > 0;
   }

   @Override
   public void l() {
      this.bY = this.bX;
      this.bX = this.bX + (this.e - this.bX) * 0.5F;
      super.l();
      if (this.aJ() && !this.ca) {
         float $$0 = this.a(this.ax()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.af.i() * (float) (Math.PI * 2);
            float $$4 = this.af.i() * 0.5F + 0.5F;
            float $$5 = azj.a($$3) * $$1 * $$4;
            float $$6 = azj.b($$3) * $$1 * $$4;
            this.dX().a(this.t(), this.dC() + (double)$$5, this.dE(), this.dI() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gu(), this.fi(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aJ() && this.ca) {
         this.e = 1.0F;
      }

      this.ca = this.aJ();
      this.gr();
   }

   protected void gr() {
      this.e *= 0.6F;
   }

   protected int y() {
      return this.af.a(20) + 10;
   }

   @Override
   public void j_() {
      double $$0 = this.dC();
      double $$1 = this.dE();
      double $$2 = this.dI();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(akk<?> $$0) {
      if (bZ.equals($$0)) {
         this.j_();
         this.v(this.aW);
         this.aU = this.aW;
         if (this.bk() && this.af.a(20) == 0) {
            this.bt();
         }
      }

      super.a($$0);
   }

   @Override
   public bug<? extends clv> aq() {
      return (bug<? extends clv>)super.aq();
   }

   @Override
   public void a(btz.c $$0) {
      int $$1 = this.gw();
      if (!this.dX().C && $$1 > 1 && this.eH()) {
         float $$2 = this.a(this.ax()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.af.a(3);
         fah $$6 = this.cs();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.aq(), new btu(btv.b, false, false, $$6), buf.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dC() + (double)$$8, this.dE() + 0.5, this.dI() + (double)$$9, this.af.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(btz $$0) {
      super.h($$0);
      if ($$0 instanceof cgy && this.gs()) {
         this.j((buv)$$0);
      }
   }

   @Override
   public void b_(coh $$0) {
      if (this.gs()) {
         this.j($$0);
      }
   }

   protected void j(buv $$0) {
      if (this.bM() && this.i($$0) && this.G($$0)) {
         bsp $$1 = this.dY().b((buv)this);
         if ($$0.a($$1, this.gt())) {
            this.a(awk.xo, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            if (this.dX() instanceof arm $$2) {
               dbo.a($$2, (btz)$$0, $$1);
            }
         }
      }
   }

   @Override
   protected ezh a(btz $$0, buc $$1, float $$2) {
      return new ezh(0.0, (double)$$1.b() - 0.015625 * (double)this.gw() * (double)$$2, 0.0);
   }

   protected boolean gs() {
      return !this.gx() && this.dk();
   }

   protected float gt() {
      return (float)this.h(bwd.c);
   }

   @Override
   protected awj d(bsp $$0) {
      return this.gx() ? awk.yk : awk.xq;
   }

   @Override
   protected awj o_() {
      return this.gx() ? awk.yj : awk.xp;
   }

   protected awj gu() {
      return this.gx() ? awk.ym : awk.xs;
   }

   public static boolean c(bug<clv> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      if ($$1.am() != brv.a) {
         if (buf.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(awy.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ar() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dfs)) {
            return false;
         }

         deb $$5 = new deb($$3);
         boolean $$6 = eby.a($$5.e, $$5.f, ((dfs)$$1).C(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fi() {
      return 0.4F * (float)this.gw();
   }

   @Override
   public int ad() {
      return 0;
   }

   protected boolean gy() {
      return this.gw() > 0;
   }

   @Override
   public void v() {
      ezh $$0 = this.dA();
      this.n($$0.d, (double)this.fl(), $$0.f);
      this.as = true;
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      azr $$4 = $$0.E_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float q() {
      float $$0 = this.gx() ? 1.4F : 0.8F;
      return ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * $$0;
   }

   protected awj gv() {
      return this.gx() ? awk.yl : awk.xr;
   }

   @Override
   public buc e(bvh $$0) {
      return super.e($$0).a((float)this.gw());
   }

   static class a extends cbt {
      private final clv a;
      private int b;

      public a(clv $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbt.a.b));
      }

      @Override
      public boolean b() {
         buv $$0 = this.a.m();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.M() instanceof clv.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         buv $$0 = this.a.m();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         buv $$0 = this.a.m();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.M() instanceof clv.d $$1) {
            $$1.a(this.a.dN(), this.a.gs());
         }
      }
   }

   static class b extends cbt {
      private final clv a;

      public b(clv $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbt.a.c, cbt.a.a));
         $$0.P().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bk() || this.a.by()) && this.a.M() instanceof clv.d;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.ea().i() < 0.8F) {
            this.a.O().a();
         }

         if (this.a.M() instanceof clv.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cbt {
      private final clv a;

      public c(clv $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbt.a.c, cbt.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.ca();
      }

      @Override
      public void a() {
         if (this.a.M() instanceof clv.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends caw {
      private float l;
      private int m;
      private final clv n;
      private boolean o;

      public d(clv $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dN() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = caw.a.b;
      }

      @Override
      public void a() {
         this.d.v(this.b(this.d.dN(), this.l, 90.0F));
         this.d.aW = this.d.dN();
         this.d.aU = this.d.dN();
         if (this.k != caw.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = caw.a.a;
            if (this.d.aJ()) {
               this.d.C((float)(this.h * this.d.h(bwd.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.O().a();
                  if (this.n.gy()) {
                     this.n.a(this.n.gv(), this.n.fi(), this.n.q());
                  }
               } else {
                  this.n.bl = 0.0F;
                  this.n.bn = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bwd.v)));
            }
         }
      }
   }

   static class e extends cbt {
      private final clv a;
      private float b;
      private int c;

      public e(clv $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbt.a.b));
      }

      @Override
      public boolean b() {
         return this.a.m() == null && (this.a.aJ() || this.a.bk() || this.a.by() || this.a.b(btg.y)) && this.a.M() instanceof clv.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.ea().a(60));
            this.b = (float)this.a.ea().a(360);
         }

         if (this.a.M() instanceof clv.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
