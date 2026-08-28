import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnr extends cox implements coh {
   public static final float a = 0.03F;
   boolean bJ;
   protected final cgq b;
   protected final cgn c;

   public cnr(bwo<? extends cnr> $$0, dja $$1) {
      super($$0, $$1);
      this.bA = new cnr.d(this);
      this.a(exf.j, 0.0F);
      this.b = new cgq(this, $$1);
      this.c = new cgn(this, $$1);
   }

   public static byj.a j() {
      return cox.gs().a(byk.B, 1.0);
   }

   @Override
   protected void m() {
      this.bD.a(1, new cnr.c(this, 1.0));
      this.bD.a(2, new cnr.f(this, 1.0, 40, 10.0F));
      this.bD.a(2, new cnr.a(this, 1.0, false));
      this.bD.a(5, new cnr.b(this, 1.0));
      this.bD.a(6, new cnr.e(this, 1.0, this.dV().P()));
      this.bD.a(7, new cex(this, 1.0));
      this.bE.a(1, new cfs(this, cnr.class).a(coz.class));
      this.bE.a(2, new cft<>(this, crc.class, 10, true, false, ($$0, $$1) -> this.i($$0)));
      this.bE.a(3, new cft<>(this, cqj.class, false));
      this.bE.a(3, new cft<>(this, cjk.class, true));
      this.bE.a(3, new cft<>(this, ckn.class, true, false));
      this.bE.a(5, new cft<>(this, ckc.class, 10, true, false, ckc.bG));
   }

   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bwp.b).f() && $$0.C_().i() < 0.03F) {
         this.a(bwp.b, new czd(czh.xe));
         this.g(bwp.b);
      }

      return $$3;
   }

   public static boolean a(bwo<cnr> $$0, djr $$1, bwn $$2, iu $$3, azv $$4) {
      if (!$$1.b_($$3.e()).a(axh.a) && !bwn.a($$2)) {
         return false;
      } else {
         je<dkd> $$5 = $$1.u($$3);
         boolean $$6 = $$1.an() != bua.a && (bwn.b($$2) || a($$1, $$3, $$4)) && (bwn.a($$2) || $$1.b_($$3).a(axh.a));
         if (!$$6 || !bwn.a($$2) && $$2 != bwn.j) {
            return $$5.a(axb.ar) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(djb $$0, iu $$1) {
      return $$1.v() < $$0.P() - 5;
   }

   @Override
   protected awm u() {
      return this.bj() ? awn.ic : awn.ib;
   }

   @Override
   protected awm e(buu $$0) {
      return this.bj() ? awn.ig : awn.if;
   }

   @Override
   protected awm l_() {
      return this.bj() ? awn.ie : awn.id;
   }

   @Override
   protected awm n() {
      return awn.ii;
   }

   @Override
   protected awm aV() {
      return awn.ij;
   }

   @Override
   protected boolean q() {
      return true;
   }

   @Override
   protected czd t() {
      return czd.k;
   }

   @Override
   protected void a(azv $$0, bub $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bwp.a, new czd(czh.xd));
         } else {
            this.a(bwp.a, new czd(czh.sd));
         }
      }
   }

   @Override
   protected boolean a(czd $$0, czd $$1, bwp $$2) {
      return $$1.a(czh.xe) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   public boolean a(djd $$0) {
      return $$0.f(this);
   }

   public boolean i(@Nullable bxe $$0) {
      return $$0 != null ? !this.dV().V() || $$0.bj() : false;
   }

   @Override
   public boolean cJ() {
      return !this.ck();
   }

   boolean gy() {
      if (this.bJ) {
         return true;
      } else {
         bxe $$0 = this.f();
         return $$0 != null && $$0.bj();
      }
   }

   @Override
   public void a_(feq $$0) {
      if (this.bn() && this.gy()) {
         this.a(0.01F, $$0);
         this.a(bxi.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bo() {
      if (!this.dV().C) {
         if (this.dj() && this.bn() && this.gy()) {
            this.bC = this.b;
            this.i(true);
         } else {
            this.bC = this.c;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cl() {
      return this.ck();
   }

   protected boolean gr() {
      exc $$0 = this.O().i();
      if ($$0 != null) {
         iu $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.h((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bxe $$0, float $$1) {
      czd $$2 = this.fb();
      czd $$3 = $$2.a(czh.xd) ? $$2 : new czd(czh.xd);
      csl $$4 = new csl(this.dV(), this, $$3);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof arq $$9) {
         crx.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dV().an().a() * 4));
      }

      this.a(awn.ih, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public axr<cyz> Y() {
      return axk.bU;
   }

   public void w(boolean $$0) {
      this.bJ = $$0;
   }

   static class a extends cfp {
      private final cnr b;

      public a(cnr $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.i(this.b.f());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.i(this.b.f());
      }
   }

   static class b extends cen {
      private final cnr g;

      public b(cnr $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dV().V() && this.g.bj() && this.g.dC() >= (double)(this.g.dV().P() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(djd $$0, iu $$1) {
         iu $$2 = $$1.d();
         return $$0.v($$2) && $$0.v($$2.d()) ? $$0.a_($$1).b($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.w(false);
         this.g.bC = this.g.c;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends cea {
      private final bxm a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dja f;

      public c(bxm $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dV();
         this.a(EnumSet.of(cea.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.V()) {
            return false;
         } else if (this.a.bj()) {
            return false;
         } else {
            feq $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.d;
               this.c = $$0.e;
               this.d = $$0.f;
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return !this.a.O().k();
      }

      @Override
      public void d() {
         this.a.O().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private feq h() {
         azv $$0 = this.a.dY();
         iu $$1 = this.a.dv();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            iu $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dmh.J)) {
               return feq.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cdd {
      private final cnr l;

      public d(cnr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bxe $$0 = this.l.f();
         if (this.l.gy() && this.l.bj()) {
            if ($$0 != null && $$0.dC() > this.l.dC() || this.l.bJ) {
               this.l.i(this.l.dy().b(0.0, 0.002, 0.0));
            }

            if (this.k != cdd.a.b || this.l.O().k()) {
               this.l.B(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azm.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aV = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(byk.v));
            float $$7 = azm.h(0.125F, this.l.fo(), $$6);
            this.l.B($$7);
            this.l.i(this.l.dy().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aJ()) {
               this.l.i(this.l.dy().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cea {
      private final cnr a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cnr $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dV().V() && this.a.bj() && this.a.dC() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dC() < (double)(this.c - 1) && (this.a.O().k() || this.a.gr())) {
            feq $$0 = chx.a(this.a, 4, 8, new feq(this.a.dA(), (double)(this.c - 1), this.a.dG()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.O().a($$0.d, $$0.e, $$0.f, this.b);
         }
      }

      @Override
      public void d() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void e() {
         this.a.w(false);
      }
   }

   static class f extends cez {
      private final cnr a;

      public f(coh $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cnr)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.fb().a(czh.xd);
      }

      @Override
      public void d() {
         super.d();
         this.a.v(true);
         this.a.c(buc.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fF();
         this.a.v(false);
      }
   }
}
