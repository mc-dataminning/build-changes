import java.util.EnumSet;
import javax.annotation.Nullable;

public class bvq extends bwv implements bwg {
   public static final float b = 0.03F;
   boolean bX;
   protected final bpl c;
   protected final bpi d;

   public bvq(bfn<? extends bvq> $$0, cmm $$1) {
      super($$0, $$1);
      this.r(1.0F);
      this.bL = new bvq.d(this);
      this.a(dxp.j, 0.0F);
      this.c = new bpl(this, $$1);
      this.d = new bpi(this, $$1);
   }

   @Override
   protected void q() {
      this.bO.a(1, new bvq.c(this, 1.0));
      this.bO.a(2, new bvq.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new bvq.a(this, 1.0, false));
      this.bO.a(5, new bvq.b(this, 1.0));
      this.bO.a(6, new bvq.e(this, 1.0, this.dI().t_()));
      this.bO.a(7, new bns(this, 1.0));
      this.bP.a(1, new bon(this, bvq.class).a(bwx.class));
      this.bP.a(2, new boo<>(this, byo.class, 10, true, false, this::l));
      this.bP.a(3, new boo<>(this, bxw.class, false));
      this.bP.a(3, new boo<>(this, brx.class, true));
      this.bP.a(3, new boo<>(this, bss.class, true, false));
      this.bP.a(5, new boo<>(this, bsm.class, 10, true, false, bsm.bU));
   }

   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(bfo.b).b() && $$0.y_().i() < 0.03F) {
         this.a(bfo.b, new cfz(cgc.uX));
         this.e(bfo.b);
      }

      return $$3;
   }

   public static boolean a(bfn<bvq> $$0, cnb $$1, bgd $$2, gu $$3, apf $$4) {
      if (!$$1.b_($$3.d()).a(anb.a)) {
         return false;
      } else {
         he<cnk> $$5 = $$1.s($$3);
         boolean $$6 = $$1.ai() != bdu.a && a($$1, $$3, $$4) && ($$2 == bgd.c || $$1.b_($$3).a(anb.a));
         return $$5.a(amv.ao) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
      }
   }

   private static boolean a(cmn $$0, gu $$1) {
      return $$1.v() < $$0.t_() - 5;
   }

   @Override
   protected boolean r() {
      return false;
   }

   @Override
   protected amg s() {
      return this.aV() ? amh.gx : amh.gw;
   }

   @Override
   protected amg d(ben $$0) {
      return this.aV() ? amh.gB : amh.gA;
   }

   @Override
   protected amg g_() {
      return this.aV() ? amh.gz : amh.gy;
   }

   @Override
   protected amg w() {
      return amh.gD;
   }

   @Override
   protected amg aJ() {
      return amh.gE;
   }

   @Override
   protected cfz fY() {
      return cfz.b;
   }

   @Override
   protected void a(apf $$0, bdv $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bfo.a, new cfz(cgc.uV));
         } else {
            this.a(bfo.a, new cfz(cgc.qh));
         }
      }
   }

   @Override
   protected boolean b(cfz $$0, cfz $$1) {
      if ($$1.a(cgc.uX)) {
         return false;
      } else if ($$1.a(cgc.uV)) {
         return $$0.a(cgc.uV) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(cgc.uV) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean fZ() {
      return false;
   }

   @Override
   public boolean a(cmp $$0) {
      return $$0.f(this);
   }

   public boolean l(@Nullable bfz $$0) {
      return $$0 != null ? !this.dI().N() || $$0.aV() : false;
   }

   @Override
   public boolean cw() {
      return !this.bW();
   }

   boolean gi() {
      if (this.bX) {
         return true;
      } else {
         bfz $$0 = this.j();
         return $$0 != null && $$0.aV();
      }
   }

   @Override
   public void h(eei $$0) {
      if (this.cU() && this.aV() && this.gi()) {
         this.a(0.01F, $$0);
         this.a(bgf.a, this.dl());
         this.f(this.dl().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   public void ba() {
      if (!this.dI().B) {
         if (this.cV() && this.aV() && this.gi()) {
            this.bN = this.c;
            this.h(true);
         } else {
            this.bN = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean bX() {
      return this.bW();
   }

   protected boolean ga() {
      dxt $$0 = this.J().j();
      if ($$0 != null) {
         gu $$1 = $$0.m();
         if ($$1 != null) {
            double $$2 = this.i((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bfz $$0, float $$1) {
      bzs $$2 = new bzs(this.dI(), this, new cfz(cgc.uV));
      double $$3 = $$0.dn() - this.dn();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dp();
      double $$5 = $$0.dt() - this.dt();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dI().ai().a() * 4));
      this.a(amh.gC, 1.0F, 1.0F / (this.ec().i() * 0.4F + 0.8F));
      this.dI().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends bok {
      private final bvq b;

      public a(bvq $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.l(this.b.j());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.l(this.b.j());
      }
   }

   static class b extends bni {
      private final bvq g;

      public b(bvq $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dI().N() && this.g.aV() && this.g.dp() >= (double)(this.g.dI().t_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(cmp $$0, gu $$1) {
         gu $$2 = $$1.c();
         return $$0.t($$2) && $$0.t($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bN = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends bmv {
      private final bgi a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cmm f;

      public c(bgi $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dI();
         this.a(EnumSet.of(bmv.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.N()) {
            return false;
         } else if (this.a.aV()) {
            return false;
         } else {
            eei $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.c;
               this.c = $$0.d;
               this.d = $$0.e;
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return !this.a.J().l();
      }

      @Override
      public void c() {
         this.a.J().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private eei h() {
         apf $$0 = this.a.ec();
         gu $$1 = this.a.di();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            gu $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(cpo.G)) {
               return eei.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bly {
      private final bvq l;

      public d(bvq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bfz $$0 = this.l.j();
         if (this.l.gi() && this.l.aV()) {
            if ($$0 != null && $$0.dp() > this.l.dp() || this.l.bX) {
               this.l.f(this.l.dl().b(0.0, 0.002, 0.0));
            }

            if (this.k != bly.a.b || this.l.J().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dn();
            double $$2 = this.f - this.l.dp();
            double $$3 = this.g - this.l.dt();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(apa.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.a_(this.a(this.l.dy(), $$5, 90.0F));
            this.l.aV = this.l.dy();
            float $$6 = (float)(this.h * this.l.b(bhg.d));
            float $$7 = apa.i(0.125F, this.l.fa(), $$6);
            this.l.w($$7);
            this.l.f(this.l.dl().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.ay()) {
               this.l.f(this.l.dl().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends bmv {
      private final bvq a;
      private final double b;
      private final int c;
      private boolean d;

      public e(bvq $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dI().N() && this.a.aV() && this.a.dp() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dp() < (double)(this.c - 1) && (this.a.J().l() || this.a.ga())) {
            eei $$0 = bqq.a(this.a, 4, 8, new eei(this.a.dn(), (double)(this.c - 1), this.a.dt()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.J().a($$0.c, $$0.d, $$0.e, this.b);
         }
      }

      @Override
      public void c() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void d() {
         this.a.w(false);
      }
   }

   static class f extends bnu {
      private final bvq a;

      public f(bwg $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (bvq)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eO().a(cgc.uV);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bdw.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.fo();
         this.a.v(false);
      }
   }
}
