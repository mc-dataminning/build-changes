import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cme extends bvg implements cln {
   private static final ako<Integer> bZ = aks.a(cme.class, akq.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bX;
   public float bY;
   private boolean ca;

   public cme(bup<? extends cme> $$0, dff $$1) {
      super($$0, $$1);
      this.cP();
      this.bP = new cme.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cme.b(this));
      this.bS.a(2, new cme.a(this));
      this.bS.a(3, new cme.e(this));
      this.bS.a(5, new cme.c(this));
      this.bT.a(1, new cdv<>(this, cor.class, 10, true, false, $$0 -> Math.abs($$0.dF() - this.dF()) <= 4.0));
      this.bT.a(3, new cdv<>(this, chh.class, true));
   }

   @Override
   public awp do() {
      return awp.f;
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bZ, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azn.a($$0, 1, 127);
      this.am.a(bZ, $$2);
      this.aA();
      this.j_();
      this.g(bwm.s).a((double)($$2 * $$2));
      this.g(bwm.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bwm.c).a((double)$$2);
      if ($$1) {
         this.x(this.eW());
      }

      this.bN = $$2;
   }

   public int gw() {
      return this.am.a(bZ);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Size", this.gw() - 1);
      $$0.a("wasOnGround", this.ca);
   }

   @Override
   public void a(un $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.ca = $$0.q("wasOnGround");
   }

   public boolean gx() {
      return this.gw() <= 1;
   }

   protected lq t() {
      return ls.U;
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
      if (this.aL() && !this.ca) {
         float $$0 = this.a(this.ay()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.af.i() * (float) (Math.PI * 2);
            float $$4 = this.af.i() * 0.5F + 0.5F;
            float $$5 = azn.a($$3) * $$1 * $$4;
            float $$6 = azn.b($$3) * $$1 * $$4;
            this.dY().a(this.t(), this.dD() + (double)$$5, this.dF(), this.dJ() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gu(), this.fj(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aL() && this.ca) {
         this.e = 1.0F;
      }

      this.ca = this.aL();
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
      double $$0 = this.dD();
      double $$1 = this.dF();
      double $$2 = this.dJ();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(ako<?> $$0) {
      if (bZ.equals($$0)) {
         this.j_();
         this.v(this.aZ);
         this.aX = this.aZ;
         if (this.bl() && this.af.a(20) == 0) {
            this.bu();
         }
      }

      super.a($$0);
   }

   @Override
   public bup<? extends cme> ar() {
      return (bup<? extends cme>)super.ar();
   }

   @Override
   public void a(bui.c $$0) {
      int $$1 = this.gw();
      if (!this.dY().C && $$1 > 1 && this.eI()) {
         float $$2 = this.a(this.ay()).a();
         float $$3 = $$2 / 2.0F;
         int $$4 = $$1 / 2;
         int $$5 = 2 + this.af.a(3);
         far $$6 = this.ct();

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$3;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$3;
            this.a(this.ar(), new bud(bue.b, false, false, $$6), buo.k, $$3x -> {
               $$3x.a($$4, true);
               $$3x.b(this.dD() + (double)$$8, this.dF() + 0.5, this.dJ() + (double)$$9, this.af.i() * 360.0F, 0.0F);
            });
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bui $$0) {
      super.h($$0);
      if ($$0 instanceof chh && this.gs()) {
         this.j((bve)$$0);
      }
   }

   @Override
   public void b_(cor $$0) {
      if (this.gs()) {
         this.j($$0);
      }
   }

   protected void j(bve $$0) {
      if (this.bN() && this.i($$0) && this.G($$0)) {
         bsy $$1 = this.dZ().b((bve)this);
         if ($$0.a($$1, this.gt())) {
            this.a(awo.xo, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            if (this.dY() instanceof arq $$2) {
               dby.a($$2, (bui)$$0, $$1);
            }
         }
      }
   }

   @Override
   protected ezr a(bui $$0, bul $$1, float $$2) {
      return new ezr(0.0, (double)$$1.b() - 0.015625 * (double)this.gw() * (double)$$2, 0.0);
   }

   protected boolean gs() {
      return !this.gx() && this.dl();
   }

   protected float gt() {
      return (float)this.h(bwm.c);
   }

   @Override
   protected awn d(bsy $$0) {
      return this.gx() ? awo.yk : awo.xq;
   }

   @Override
   protected awn o_() {
      return this.gx() ? awo.yj : awo.xp;
   }

   protected awn gu() {
      return this.gx() ? awo.ym : awo.xs;
   }

   public static boolean c(bup<cme> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      if ($$1.ak() != bse.a) {
         if (buo.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(axc.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ap() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dgd)) {
            return false;
         }

         del $$5 = new del($$3);
         boolean $$6 = eci.a($$5.g, $$5.h, ((dgd)$$1).C(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fj() {
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
      ezr $$0 = this.dB();
      this.n($$0.d, (double)this.fm(), $$0.f);
      this.as = true;
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      azv $$4 = $$0.E_();
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

   protected awn gv() {
      return this.gx() ? awo.yl : awo.xr;
   }

   @Override
   public bul e(bvq $$0) {
      return super.e($$0).a((float)this.gw());
   }

   static class a extends ccc {
      private final cme a;
      private int b;

      public a(cme $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccc.a.b));
      }

      @Override
      public boolean b() {
         bve $$0 = this.a.m();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.M() instanceof cme.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bve $$0 = this.a.m();
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
         bve $$0 = this.a.m();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.M() instanceof cme.d $$1) {
            $$1.a(this.a.dO(), this.a.gs());
         }
      }
   }

   static class b extends ccc {
      private final cme a;

      public b(cme $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccc.a.c, ccc.a.a));
         $$0.P().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bl() || this.a.bz()) && this.a.M() instanceof cme.d;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.eb().i() < 0.8F) {
            this.a.O().a();
         }

         if (this.a.M() instanceof cme.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends ccc {
      private final cme a;

      public c(cme $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccc.a.c, ccc.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.cb();
      }

      @Override
      public void a() {
         if (this.a.M() instanceof cme.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends cbf {
      private float l;
      private int m;
      private final cme n;
      private boolean o;

      public d(cme $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dO() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = cbf.a.b;
      }

      @Override
      public void a() {
         this.d.v(this.b(this.d.dO(), this.l, 90.0F));
         this.d.aZ = this.d.dO();
         this.d.aX = this.d.dO();
         if (this.k != cbf.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = cbf.a.a;
            if (this.d.aL()) {
               this.d.C((float)(this.h * this.d.h(bwm.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.O().a();
                  if (this.n.gy()) {
                     this.n.a(this.n.gv(), this.n.fj(), this.n.q());
                  }
               } else {
                  this.n.bo = 0.0F;
                  this.n.bq = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bwm.v)));
            }
         }
      }
   }

   static class e extends ccc {
      private final cme a;
      private float b;
      private int c;

      public e(cme $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ccc.a.b));
      }

      @Override
      public boolean b() {
         return this.a.m() == null && (this.a.aL() || this.a.bl() || this.a.bz() || this.a.b(btp.y)) && this.a.M() instanceof cme.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.eb().a(60));
            this.b = (float)this.a.eb().a(360);
         }

         if (this.a.M() instanceof cme.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
