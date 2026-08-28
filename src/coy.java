import java.util.EnumSet;
import javax.annotation.Nullable;

public class coy extends cqd implements cpo {
   public static final float a = 0.03F;
   boolean bJ;
   protected final chr b;
   protected final cho c;

   public coy(bxn<? extends coy> $$0, dkj $$1) {
      super($$0, $$1);
      this.bC = new coy.d(this);
      this.a(eyr.j, 0.0F);
      this.b = new chr(this, $$1);
      this.c = new cho(this, $$1);
   }

   public static bzk.a j() {
      return cqd.gv().a(bzl.B, 1.0);
   }

   @Override
   protected void m() {
      this.bF.a(1, new coy.c(this, 1.0));
      this.bF.a(2, new coy.f(this, 1.0, 40, 10.0F));
      this.bF.a(2, new coy.a(this, 1.0, false));
      this.bF.a(5, new coy.b(this, 1.0));
      this.bF.a(6, new coy.e(this, 1.0, this.dV().P()));
      this.bF.a(7, new cfy(this, 1.0));
      this.bG.a(1, new cgt(this, coy.class).a(cqf.class));
      this.bG.a(2, new cgu<>(this, csi.class, 10, true, false, ($$0, $$1) -> this.i($$0)));
      this.bG.a(3, new cgu<>(this, crp.class, false));
      this.bG.a(3, new cgu<>(this, ckl.class, true));
      this.bG.a(3, new cgu<>(this, clk.class, true, false));
      this.bG.a(5, new cgu<>(this, clc.class, 10, true, false, clc.bI));
   }

   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bxo.b).f() && $$0.G_().i() < 0.03F) {
         this.a(bxo.b, new dak(dao.xe));
         this.g(bxo.b);
      }

      return $$3;
   }

   public static boolean a(bxn<coy> $$0, dla $$1, bxm $$2, iw $$3, bai $$4) {
      if (!$$1.b_($$3.e()).a(axs.a) && !bxm.a($$2)) {
         return false;
      } else {
         jg<dlm> $$5 = $$1.u($$3);
         boolean $$6 = $$1.an() != buz.a && (bxm.b($$2) || a($$1, $$3, $$4)) && (bxm.a($$2) || $$1.b_($$3).a(axs.a));
         if (!$$6 || !bxm.a($$2) && $$2 != bxm.j) {
            return $$5.a(axm.ar) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(dkk $$0, iw $$1) {
      return $$1.v() < $$0.P() - 5;
   }

   @Override
   protected awx u() {
      return this.bi() ? awy.ic : awy.ib;
   }

   @Override
   protected awx e(bvt $$0) {
      return this.bi() ? awy.ig : awy.if;
   }

   @Override
   protected awx l_() {
      return this.bi() ? awy.ie : awy.id;
   }

   @Override
   protected awx n() {
      return awy.ii;
   }

   @Override
   protected awx aU() {
      return awy.ij;
   }

   @Override
   protected boolean q() {
      return true;
   }

   @Override
   protected dak t() {
      return dak.l;
   }

   @Override
   protected void a(bai $$0, bva $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bxo.a, new dak(dao.xd));
         } else {
            this.a(bxo.a, new dak(dao.sd));
         }
      }
   }

   @Override
   protected boolean a(dak $$0, dak $$1, bxo $$2) {
      return $$1.a(dao.xe) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   public boolean a(dkm $$0) {
      return $$0.f(this);
   }

   public boolean i(@Nullable byf $$0) {
      return $$0 != null ? !this.dV().V() || $$0.bi() : false;
   }

   @Override
   public boolean cJ() {
      return !this.cj();
   }

   boolean gB() {
      if (this.bJ) {
         return true;
      } else {
         byf $$0 = this.f();
         return $$0 != null && $$0.bi();
      }
   }

   @Override
   public void a_(fgc $$0) {
      if (this.bm() && this.gB()) {
         this.a(0.01F, $$0);
         this.a(byj.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bn() {
      if (!this.dV().C) {
         if (this.dj() && this.bm() && this.gB()) {
            this.bE = this.b;
            this.i(true);
         } else {
            this.bE = this.c;
            this.i(false);
         }
      }
   }

   @Override
   public boolean ck() {
      return this.cj();
   }

   protected boolean gu() {
      eyo $$0 = this.O().i();
      if ($$0 != null) {
         iw $$1 = $$0.l();
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
   public void a(byf $$0, float $$1) {
      dak $$2 = this.fb();
      dak $$3 = $$2.a(dao.xd) ? $$2 : new dak(dao.xd);
      ctr $$4 = new ctr(this.dV(), this, $$3);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof asb $$9) {
         ctd.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dV().an().a() * 4));
      }

      this.a(awy.ih, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public ayc<dag> Y() {
      return axv.bV;
   }

   public void w(boolean $$0) {
      this.bJ = $$0;
   }

   static class a extends cgq {
      private final coy b;

      public a(coy $$0, double $$1, boolean $$2) {
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

   static class b extends cfo {
      private final coy g;

      public b(coy $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dV().V() && this.g.bi() && this.g.dC() >= (double)(this.g.dV().P() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dkm $$0, iw $$1) {
         iw $$2 = $$1.d();
         return $$0.v($$2) && $$0.v($$2.d()) ? $$0.a_($$1).b($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.w(false);
         this.g.bE = this.g.c;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends cfb {
      private final byn a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dkj f;

      public c(byn $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dV();
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.V()) {
            return false;
         } else if (this.a.bi()) {
            return false;
         } else {
            fgc $$0 = this.h();
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
      private fgc h() {
         bai $$0 = this.a.dY();
         iw $$1 = this.a.dv();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            iw $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dnq.J)) {
               return fgc.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cee {
      private final coy l;

      public d(coy $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         byf $$0 = this.l.f();
         if (this.l.gB() && this.l.bi()) {
            if ($$0 != null && $$0.dC() > this.l.dC() || this.l.bJ) {
               this.l.i(this.l.dy().b(0.0, 0.002, 0.0));
            }

            if (this.k != cee.a.b || this.l.O().k()) {
               this.l.B(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azz.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aV = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(bzl.v));
            float $$7 = azz.h(0.125F, this.l.fo(), $$6);
            this.l.B($$7);
            this.l.i(this.l.dy().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aH()) {
               this.l.i(this.l.dy().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cfb {
      private final coy a;
      private final double b;
      private final int c;
      private boolean d;

      public e(coy $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dV().V() && this.a.bi() && this.a.dC() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dC() < (double)(this.c - 1) && (this.a.O().k() || this.a.gu())) {
            fgc $$0 = ciy.a(this.a, 4, 8, new fgc(this.a.dA(), (double)(this.c - 1), this.a.dG()), (float) (Math.PI / 2));
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

   static class f extends cga {
      private final coy a;

      public f(cpo $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (coy)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.fb().a(dao.xd);
      }

      @Override
      public void d() {
         super.d();
         this.a.v(true);
         this.a.c(bvb.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fF();
         this.a.v(false);
      }
   }
}
