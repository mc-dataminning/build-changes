import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cle extends buh implements ckn {
   private static final akg<Integer> ca = akk.a(cle.class, aki.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bY;
   public float bZ;
   private boolean cb;

   public cle(btq<? extends cle> $$0, dds $$1) {
      super($$0, $$1);
      this.cK();
      this.bQ = new cle.d(this);
   }

   @Override
   protected void D() {
      this.bT.a(1, new cle.b(this));
      this.bT.a(2, new cle.a(this));
      this.bT.a(3, new cle.e(this));
      this.bT.a(5, new cle.c(this));
      this.bU.a(1, new ccv<>(this, cnp.class, 10, true, false, $$0 -> Math.abs($$0.dz() - this.dz()) <= 4.0));
      this.bU.a(3, new ccv<>(this, cgh.class, true));
   }

   @Override
   public awe di() {
      return awe.f;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ca, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = azc.a($$0, 1, 127);
      this.am.a(ca, $$2);
      this.ax();
      this.i_();
      this.g(bvm.s).a((double)($$2 * $$2));
      this.g(bvm.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.g(bvm.c).a((double)$$2);
      if ($$1) {
         this.x(this.eQ());
      }

      this.bO = $$2;
   }

   public int gp() {
      return this.am.a(ca);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Size", this.gp() - 1);
      $$0.a("wasOnGround", this.cb);
   }

   @Override
   public void a(uf $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.cb = $$0.q("wasOnGround");
   }

   public boolean gq() {
      return this.gp() <= 1;
   }

   protected ll t() {
      return ln.U;
   }

   @Override
   protected boolean ab() {
      return this.gp() > 0;
   }

   @Override
   public void l() {
      this.bZ = this.bY;
      this.bY = this.bY + (this.e - this.bY) * 0.5F;
      super.l();
      if (this.aH() && !this.cb) {
         float $$0 = this.a(this.av()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.af.i() * (float) (Math.PI * 2);
            float $$4 = this.af.i() * 0.5F + 0.5F;
            float $$5 = azc.a($$3) * $$1 * $$4;
            float $$6 = azc.b($$3) * $$1 * $$4;
            this.dS().a(this.t(), this.dx() + (double)$$5, this.dz(), this.dD() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gn(), this.fd(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aH() && this.cb) {
         this.e = 1.0F;
      }

      this.cb = this.aH();
      this.gk();
   }

   protected void gk() {
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
      if (ca.equals($$0)) {
         this.i_();
         this.v(this.aW);
         this.aU = this.aW;
         if (this.bi() && this.af.a(20) == 0) {
            this.br();
         }
      }

      super.a($$0);
   }

   @Override
   public btq<? extends cle> ao() {
      return (btq<? extends cle>)super.ao();
   }

   @Override
   public void a(btj.c $$0) {
      int $$1 = this.gp();
      if (!this.dS().B && $$1 > 1 && this.eB()) {
         xd $$2 = this.al();
         boolean $$3 = this.gd();
         float $$4 = this.a(this.av()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.af.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            cle $$11 = this.ao().a(this.dS(), btp.k);
            if ($$11 != null) {
               if (this.fX()) {
                  $$11.fV();
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
   public void h(btj $$0) {
      super.h($$0);
      if ($$0 instanceof cgh && this.gl()) {
         this.j((buf)$$0);
      }
   }

   @Override
   public void b_(cnp $$0) {
      if (this.gl()) {
         this.j($$0);
      }
   }

   protected void j(buf $$0) {
      if (this.bI() && this.i($$0) && this.G($$0)) {
         bsb $$1 = this.dT().b((buf)this);
         if ($$0.a($$1, this.gm())) {
            this.a(awd.xq, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            if (this.dS() instanceof arg $$2) {
               day.a($$2, (btj)$$0, $$1);
            }
         }
      }
   }

   @Override
   protected eye a(btj $$0, btm $$1, float $$2) {
      return new eye(0.0, (double)$$1.b() - 0.015625 * (double)this.gp() * (double)$$2, 0.0);
   }

   protected boolean gl() {
      return !this.gq() && this.df();
   }

   protected float gm() {
      return (float)this.h(bvm.c);
   }

   @Override
   protected awc d(bsb $$0) {
      return this.gq() ? awd.ym : awd.xs;
   }

   @Override
   protected awc n_() {
      return this.gq() ? awd.yl : awd.xr;
   }

   protected awc gn() {
      return this.gq() ? awd.yo : awd.xu;
   }

   public static boolean c(btq<cle> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      if ($$1.am() != brh.a) {
         if (btp.a($$2)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if ($$1.t($$3).a(awr.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ar() && $$1.A($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof dep)) {
            return false;
         }

         dcy $$5 = new dcy($$3);
         boolean $$6 = eav.a($$5.e, $$5.f, ((dep)$$1).C(), 987234911L).a(10) == 0;
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
   public int ae() {
      return 0;
   }

   protected boolean gr() {
      return this.gp() > 0;
   }

   @Override
   public void v() {
      eye $$0 = this.dv();
      this.n($$0.d, (double)this.fg(), $$0.f);
      this.as = true;
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      azk $$4 = $$0.C_();
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

   protected awc go() {
      return this.gq() ? awd.yn : awd.xt;
   }

   @Override
   public btm e(bur $$0) {
      return super.e($$0).a((float)this.gp());
   }

   static class a extends cbc {
      private final cle a;
      private int b;

      public a(cle $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbc.a.b));
      }

      @Override
      public boolean b() {
         buf $$0 = this.a.m();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.M() instanceof cle.d;
         }
      }

      @Override
      public void d() {
         this.b = b(300);
         super.d();
      }

      @Override
      public boolean c() {
         buf $$0 = this.a.m();
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
         buf $$0 = this.a.m();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.M() instanceof cle.d $$1) {
            $$1.a(this.a.dI(), this.a.gl());
         }
      }
   }

   static class b extends cbc {
      private final cle a;

      public b(cle $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbc.a.c, cbc.a.a));
         $$0.P().a(true);
      }

      @Override
      public boolean b() {
         return (this.a.bi() || this.a.bw()) && this.a.M() instanceof cle.d;
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

         if (this.a.M() instanceof cle.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends cbc {
      private final cle a;

      public c(cle $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbc.a.c, cbc.a.a));
      }

      @Override
      public boolean b() {
         return !this.a.bW();
      }

      @Override
      public void a() {
         if (this.a.M() instanceof cle.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends caf {
      private float l;
      private int m;
      private final cle n;
      private boolean o;

      public d(cle $$0) {
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
         this.k = caf.a.b;
      }

      @Override
      public void a() {
         this.d.v(this.a(this.d.dI(), this.l, 90.0F));
         this.d.aW = this.d.dI();
         this.d.aU = this.d.dI();
         if (this.k != caf.a.b) {
            this.d.G(0.0F);
         } else {
            this.k = caf.a.a;
            if (this.d.aH()) {
               this.d.C((float)(this.h * this.d.h(bvm.v)));
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
                  this.n.bl = 0.0F;
                  this.n.bn = 0.0F;
                  this.d.C(0.0F);
               }
            } else {
               this.d.C((float)(this.h * this.d.h(bvm.v)));
            }
         }
      }
   }

   static class e extends cbc {
      private final cle a;
      private float b;
      private int c;

      public e(cle $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbc.a.b));
      }

      @Override
      public boolean b() {
         return this.a.m() == null && (this.a.aH() || this.a.bi() || this.a.bw() || this.a.b(bss.y)) && this.a.M() instanceof cle.d;
      }

      @Override
      public void a() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dV().a(60));
            this.b = (float)this.a.dV().a(360);
         }

         if (this.a.M() instanceof cle.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
