import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class clm extends bup implements ckv {
   private static final akh<Integer> bZ = akl.a(clm.class, akj.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bX;
   public float bY;
   private boolean ca;

   public clm(bty<? extends clm> $$0, dej $$1) {
      super($$0, $$1);
      this.cK();
      this.bP = new clm.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new clm.b(this));
      this.bS.a(2, new clm.a(this));
      this.bS.a(3, new clm.e(this));
      this.bS.a(5, new clm.c(this));
      this.bT.a(1, new cdd<>(this, cnx.class, 10, true, false, $$0 -> Math.abs($$0.dz() - this.dz()) <= 4.0));
      this.bT.a(3, new cdd<>(this, cgp.class, true));
   }

   @Override
   public awh di() {
      return awh.f;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bZ, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azf.a($$0, 1, 127);
      this.am.a(bZ, $$2);
      this.ax();
      this.j_();
      this.g(bvu.s).a((double)($$2 * $$2));
      this.g(bvu.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bvu.c).a((double)$$2);
      if ($$1) {
         this.x(this.eQ());
      }

      this.bN = $$2;
   }

   public int gp() {
      return this.am.a(bZ);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Size", this.gp() - 1);
      $$0.a("wasOnGround", this.ca);
   }

   @Override
   public void a(ug $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.ca = $$0.q("wasOnGround");
   }

   public boolean gq() {
      return this.gp() <= 1;
   }

   protected lm t() {
      return lo.U;
   }

   @Override
   protected boolean aa() {
      return this.gp() > 0;
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
            float $$5 = azf.a($$3) * $$1 * $$4;
            float $$6 = azf.b($$3) * $$1 * $$4;
            this.dS().a(this.t(), this.dx() + (double)$$5, this.dz(), this.dD() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gn(), this.fd(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aH() && this.ca) {
         this.e = 1.0F;
      }

      this.ca = this.aH();
      this.gk();
   }

   protected void gk() {
      this.e *= 0.6F;
   }

   protected int y() {
      return this.af.a(20) + 10;
   }

   @Override
   public void j_() {
      double $$0 = this.dx();
      double $$1 = this.dz();
      double $$2 = this.dD();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(akh<?> $$0) {
      if (bZ.equals($$0)) {
         this.j_();
         this.v(this.aV);
         this.aT = this.aV;
         if (this.bi() && this.af.a(20) == 0) {
            this.br();
         }
      }

      super.a($$0);
   }

   @Override
   public bty<? extends clm> ao() {
      return (bty<? extends clm>)super.ao();
   }

   @Override
   public void a(btr.c $$0) {
      int $$1 = this.gp();
      if (!this.dS().B && $$1 > 1 && this.eC()) {
         xe $$2 = this.al();
         boolean $$3 = this.gd();
         float $$4 = this.a(this.av()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.af.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            clm $$11 = this.ao().a(this.dS(), btx.k);
            if ($$11 != null) {
               if (this.fX()) {
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
   public void h(btr $$0) {
      super.h($$0);
      if ($$0 instanceof cgp && this.gl()) {
         this.j((bun)$$0);
      }
   }

   @Override
   public void b_(cnx $$0) {
      if (this.gl()) {
         this.j($$0);
      }
   }

   protected void j(bun $$0) {
      if (this.bI() && this.i($$0) && this.G($$0)) {
         bsj $$1 = this.dT().b((bun)this);
         if ($$0.a($$1, this.gm())) {
            this.a(awg.xq, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            if (this.dS() instanceof arj $$2) {
               dbp.a($$2, (btr)$$0, $$1);
            }
         }
      }
   }

   @Override
   protected eyw a(btr $$0, btu $$1, float $$2) {
      return new eyw(0.0, (double)$$1.b() - 0.015625 * (double)this.gp() * (double)$$2, 0.0);
   }

   protected boolean gl() {
      return !this.gq() && this.df();
   }

   protected float gm() {
      return (float)this.h(bvu.c);
   }

   @Override
   protected awf d(bsj $$0) {
      return this.gq() ? awg.ym : awg.xs;
   }

   @Override
   protected awf o_() {
      return this.gq() ? awg.yl : awg.xr;
   }

   protected awf gn() {
      return this.gq() ? awg.yo : awg.xu;
   }

   public static boolean c(bty<clm> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      if ($$1.am() != brp.a) {
         if (btx.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(awu.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ar() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dfg)) {
            return false;
         }

         ddp $$5 = new ddp($$3);
         boolean $$6 = ebn.a($$5.e, $$5.f, ((dfg)$$1).C(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float fd() {
      return 0.4F * (float)this.gp();
   }

   @Override
   public int ad() {
      return 0;
   }

   protected boolean gr() {
      return this.gp() > 0;
   }

   @Override
   public void v() {
      eyw $$0 = this.dv();
      this.n($$0.d, (double)this.fg(), $$0.f);
      this.as = true;
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      azn $$4 = $$0.D_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float q() {
      float $$0 = this.gq() ? 1.4F : 0.8F;
      return ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * $$0;
   }

   protected awf go() {
      return this.gq() ? awg.yn : awg.xt;
   }

   @Override
   public btu e(buz $$0) {
      return super.e($$0).a((float)this.gp());
   }

   static class a extends cbk {
      private final clm a;
      private int b;

      public a(clm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbk.a.b));
      }

      @Override
      public boolean b() {
         bun $$0 = this.a.m();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.M() instanceof clm.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         bun $$0 = this.a.m();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean U_() {
         return true;
      }

      @Override
      public void a() {
         bun $$0 = this.a.m();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.M() instanceof clm.d $$1) {
            $$1.a(this.a.dI(), this.a.gl());
         }
      }
   }

   static class b extends cbk {
      private final clm a;

      public b(clm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbk.a.c, cbk.a.a));
         $$0.P().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bi() || this.a.bw()) && this.a.M() instanceof clm.d;
      }

      @Override
      public boolean U_() {
         return true;
      }

      @Override
      public void a() {
         if (this.a.dV().i() < 0.8F) {
            this.a.O().a();
         }

         if (this.a.M() instanceof clm.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cbk {
      private final clm a;

      public c(clm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbk.a.c, cbk.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bW();
      }

      @Override
      public void a() {
         if (this.a.M() instanceof clm.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends can {
      private float l;
      private int m;
      private final clm n;
      private boolean o;

      public d(clm $$0) {
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
         this.k = can.a.b;
      }

      @Override
      public void a() {
         this.d.v(this.a(this.d.dI(), this.l, 90.0F));
         this.d.aV = this.d.dI();
         this.d.aT = this.d.dI();
         if (this.k != can.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = can.a.a;
            if (this.d.aH()) {
               this.d.C((float)(this.h * this.d.h(bvu.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.O().a();
                  if (this.n.gr()) {
                     this.n.a(this.n.go(), this.n.fd(), this.n.q());
                  }
               } else {
                  this.n.bk = 0.0F;
                  this.n.bm = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bvu.v)));
            }
         }
      }
   }

   static class e extends cbk {
      private final clm a;
      private float b;
      private int c;

      public e(clm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbk.a.b));
      }

      @Override
      public boolean b() {
         return this.a.m() == null && (this.a.aH() || this.a.bi() || this.a.bw() || this.a.b(bta.y)) && this.a.M() instanceof clm.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dV().a(60));
            this.b = (float)this.a.dV().a(360);
         }

         if (this.a.M() instanceof clm.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
