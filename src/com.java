import java.util.EnumSet;
import javax.annotation.Nullable;

public class com extends cps implements cpd {
   public static final float a = 0.03F;
   boolean bJ;
   protected final chg b;
   protected final chd c;

   public com(bxc<? extends com> $$0, djx $$1) {
      super($$0, $$1);
      this.bC = new com.d(this);
      this.a(eyf.j, 0.0F);
      this.b = new chg(this, $$1);
      this.c = new chd(this, $$1);
   }

   public static byz.a j() {
      return cps.gv().a(bza.B, 1.0);
   }

   @Override
   protected void m() {
      this.bF.a(1, new com.c(this, 1.0));
      this.bF.a(2, new com.f(this, 1.0, 40, 10.0F));
      this.bF.a(2, new com.a(this, 1.0, false));
      this.bF.a(5, new com.b(this, 1.0));
      this.bF.a(6, new com.e(this, 1.0, this.dV().P()));
      this.bF.a(7, new cfn(this, 1.0));
      this.bG.a(1, new cgi(this, com.class).a(cpu.class));
      this.bG.a(2, new cgj<>(this, crx.class, 10, true, false, ($$0, $$1) -> this.i($$0)));
      this.bG.a(3, new cgj<>(this, cre.class, false));
      this.bG.a(3, new cgj<>(this, cka.class, true));
      this.bG.a(3, new cgj<>(this, ckz.class, true, false));
      this.bG.a(5, new cgj<>(this, ckr.class, 10, true, false, ckr.bI));
   }

   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bxd.b).f() && $$0.G_().i() < 0.03F) {
         this.a(bxd.b, new czy(dac.xe));
         this.g(bxd.b);
      }

      return $$3;
   }

   public static boolean a(bxc<com> $$0, dko $$1, bxb $$2, iv $$3, azx $$4) {
      if (!$$1.b_($$3.e()).a(axj.a) && !bxb.a($$2)) {
         return false;
      } else {
         jf<dla> $$5 = $$1.u($$3);
         boolean $$6 = $$1.an() != buo.a && (bxb.b($$2) || a($$1, $$3, $$4)) && (bxb.a($$2) || $$1.b_($$3).a(axj.a));
         if (!$$6 || !bxb.a($$2) && $$2 != bxb.j) {
            return $$5.a(axd.ar) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(djy $$0, iv $$1) {
      return $$1.v() < $$0.P() - 5;
   }

   @Override
   protected awo u() {
      return this.bi() ? awp.ic : awp.ib;
   }

   @Override
   protected awo e(bvi $$0) {
      return this.bi() ? awp.ig : awp.if;
   }

   @Override
   protected awo l_() {
      return this.bi() ? awp.ie : awp.id;
   }

   @Override
   protected awo n() {
      return awp.ii;
   }

   @Override
   protected awo aU() {
      return awp.ij;
   }

   @Override
   protected boolean q() {
      return true;
   }

   @Override
   protected czy t() {
      return czy.k;
   }

   @Override
   protected void a(azx $$0, bup $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bxd.a, new czy(dac.xd));
         } else {
            this.a(bxd.a, new czy(dac.sd));
         }
      }
   }

   @Override
   protected boolean a(czy $$0, czy $$1, bxd $$2) {
      return $$1.a(dac.xe) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   public boolean a(dka $$0) {
      return $$0.f(this);
   }

   public boolean i(@Nullable bxu $$0) {
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
         bxu $$0 = this.f();
         return $$0 != null && $$0.bi();
      }
   }

   @Override
   public void a_(ffq $$0) {
      if (this.bm() && this.gB()) {
         this.a(0.01F, $$0);
         this.a(bxy.a, this.dy());
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
      eyc $$0 = this.O().i();
      if ($$0 != null) {
         iv $$1 = $$0.l();
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
   public void a(bxu $$0, float $$1) {
      czy $$2 = this.fb();
      czy $$3 = $$2.a(dac.xd) ? $$2 : new czy(dac.xd);
      ctg $$4 = new ctg(this.dV(), this, $$3);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof ars $$9) {
         css.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dV().an().a() * 4));
      }

      this.a(awp.ih, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public axt<czu> Y() {
      return axm.bU;
   }

   public void w(boolean $$0) {
      this.bJ = $$0;
   }

   static class a extends cgf {
      private final com b;

      public a(com $$0, double $$1, boolean $$2) {
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

   static class b extends cfd {
      private final com g;

      public b(com $$0, double $$1) {
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
      protected boolean a(dka $$0, iv $$1) {
         iv $$2 = $$1.d();
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

   static class c extends ceq {
      private final byc a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final djx f;

      public c(byc $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dV();
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.V()) {
            return false;
         } else if (this.a.bi()) {
            return false;
         } else {
            ffq $$0 = this.h();
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
      private ffq h() {
         azx $$0 = this.a.dY();
         iv $$1 = this.a.dv();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            iv $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dne.J)) {
               return ffq.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cdt {
      private final com l;

      public d(com $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bxu $$0 = this.l.f();
         if (this.l.gB() && this.l.bi()) {
            if ($$0 != null && $$0.dC() > this.l.dC() || this.l.bJ) {
               this.l.i(this.l.dy().b(0.0, 0.002, 0.0));
            }

            if (this.k != cdt.a.b || this.l.O().k()) {
               this.l.B(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azo.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aV = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(bza.v));
            float $$7 = azo.h(0.125F, this.l.fo(), $$6);
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

   static class e extends ceq {
      private final com a;
      private final double b;
      private final int c;
      private boolean d;

      public e(com $$0, double $$1, int $$2) {
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
            ffq $$0 = cin.a(this.a, 4, 8, new ffq(this.a.dA(), (double)(this.c - 1), this.a.dG()), (float) (Math.PI / 2));
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

   static class f extends cfp {
      private final com a;

      public f(cpd $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (com)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.fb().a(dac.xd);
      }

      @Override
      public void d() {
         super.d();
         this.a.v(true);
         this.a.c(buq.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fF();
         this.a.v(false);
      }
   }
}
