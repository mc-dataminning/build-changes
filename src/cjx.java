import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjx extends cjj {
   private static final akl<Boolean> bL = akp.a(cjx.class, akn.k);
   private static final akl<Integer> bM = akp.a(cjx.class, akn.b);
   static final cij bN = cij.b().a(10.0).d();
   public static final int bI = 4800;
   private static final int bO = 2400;
   public static final Predicate<coc> bJ = $$0 -> !$$0.o() && $$0.bJ() && $$0.bi();
   public static final float bK = 0.65F;
   private static final boolean bP = false;
   @Nullable
   iv bQ;

   public cjx(bxc<? extends cjx> $$0, djx $$1) {
      super($$0, $$1);
      this.bC = new cdv(this, 85, 10, 0.02F, 0.1F, true);
      this.bB = new cdu(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      this.j(this.cr());
      this.x(0.0F);
      bym $$4 = Objects.requireNonNullElseGet($$3, () -> new bwj.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cjx b(ars $$0, bwj $$1) {
      return bxc.I.a($$0, bxb.e);
   }

   @Override
   public float ek() {
      return this.n_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public boolean q() {
      return this.al.a(bL);
   }

   public void w(boolean $$0) {
      this.al.a(bL, $$0);
   }

   public int t() {
      return this.al.a(bM);
   }

   public void s(int $$0) {
      this.al.a(bM, $$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bL, false);
      $$0.a(bM, 2400);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("GotFish", this.q());
      $$0.a("Moistness", this.t());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.w($$0.b("GotFish", false));
      this.s($$0.b("Moistness", 2400));
   }

   @Override
   protected void D() {
      this.bF.a(0, new ceb(this));
      this.bF.a(0, new cga(this));
      this.bF.a(1, new cjx.a(this));
      this.bF.a(2, new cjx.b(this, 4.0));
      this.bF.a(4, new cfo(this, 1.0, 10));
      this.bF.a(4, new cfl(this));
      this.bF.a(5, new cey(this, crx.class, 6.0F));
      this.bF.a(5, new ceg(this, 10));
      this.bF.a(6, new cfa(this, 1.2F, true));
      this.bF.a(8, new cjx.c());
      this.bF.a(8, new cel(this));
      this.bF.a(9, new cdx<>(this, cov.class, 8.0F, 1.0, 1.0));
      this.bG.a(1, new cgi(this, cov.class).a());
   }

   public static byz.a x() {
      return bxw.E().a(bza.s, 10.0).a(bza.v, 1.2F).a(bza.c, 3.0);
   }

   @Override
   protected che b(djx $$0) {
      return new chg(this, $$0);
   }

   @Override
   public void gn() {
      this.a(awp.hv, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bxu $$0) {
      return !this.n_() && super.c($$0);
   }

   @Override
   public int cr() {
      return 4800;
   }

   @Override
   protected int m(int $$0) {
      return this.cr();
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   public int af() {
      return 1;
   }

   @Override
   protected boolean o(bwt $$0) {
      return true;
   }

   @Override
   protected boolean f(bxd $$0) {
      return $$0 == bxd.a && this.fN();
   }

   @Override
   protected void a(ars $$0, coc $$1) {
      if (this.a(bxd.a).f()) {
         czy $$2 = $$1.f();
         if (this.g($$2)) {
            this.a($$1);
            this.a(bxd.a, $$2);
            this.g(bxd.a);
            this.a($$1, $$2.M());
            $$1.aq();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.gj()) {
         this.j(this.cr());
      } else {
         if (this.bk()) {
            this.s(2400);
         } else {
            this.s(this.t() - 1);
            if (this.t() <= 0) {
               this.a(this.dW().t(), 1.0F);
            }

            if (this.aH()) {
               this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.w(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dV().C && this.bi() && this.dy().h() > 0.03) {
            ffq $$0 = this.h(0.0F);
            float $$1 = azo.b(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azo.a(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dV()
                  .a(ly.av, this.dA() - $$0.d * (double)$$3 + (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dV()
                  .a(ly.av, this.dA() - $$0.d * (double)$$3 - (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(ly.Q);
      } else {
         super.b($$0);
      }
   }

   private void a(lw $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ae.k() * 0.01;
         double $$3 = this.ae.k() * 0.01;
         double $$4 = this.ae.k() * 0.01;
         this.dV().a($$0, this.d(1.0), this.dD() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bur b(crx $$0, buq $$1) {
      czy $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axm.aU)) {
         if (!this.dV().C) {
            this.a(awp.hx, 1.0F, 1.0F);
         }

         if (this.n_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.d), true);
         } else {
            this.w(true);
            $$2.a(1, $$0);
         }

         return bur.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.hy;
   }

   @Nullable
   @Override
   protected awo l_() {
      return awp.hw;
   }

   @Nullable
   @Override
   protected awo u() {
      return this.bi() ? awp.hu : awp.ht;
   }

   @Override
   protected awo aV() {
      return awp.hB;
   }

   @Override
   protected awo aU() {
      return awp.hC;
   }

   protected boolean gu() {
      iv $$0 = this.O().g();
      return $$0 != null ? $$0.a(this.dt(), 12.0) : false;
   }

   @Override
   public void a_(ffq $$0) {
      if (this.bi()) {
         this.a(this.fo(), $$0);
         this.a(bxy.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.f() == null) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   static class a extends ceq {
      private final cjx a;
      private boolean b;

      a(cjx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ceq.a.a, ceq.a.b));
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.q() && this.a.cs() >= 100;
      }

      @Override
      public boolean c() {
         iv $$0 = this.a.bQ;
         return $$0 == null ? false : !iv.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) && !this.b && this.a.cs() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dV() instanceof ars) {
            ars $$0 = (ars)this.a.dV();
            this.b = false;
            this.a.O().m();
            iv $$1 = this.a.dv();
            iv $$2 = $$0.a(axp.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.bQ = $$2;
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         iv $$0 = this.a.bQ;
         if ($$0 == null || iv.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void a() {
         if (this.a.bQ != null) {
            djx $$0 = this.a.dV();
            if (this.a.gu() || this.a.O().k()) {
               ffq $$1 = ffq.b(this.a.bQ);
               ffq $$2 = cin.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
               if ($$2 == null) {
                  $$2 = cin.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
               }

               if ($$2 != null) {
                  iv $$3 = iv.a((jp)$$2);
                  if (!$$0.b_($$3).a(axj.a) || !$$0.a_($$3).a(eyd.b)) {
                     $$2 = cin.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
                  }
               }

               if ($$2 == null) {
                  this.b = true;
                  return;
               }

               this.a.J().a($$2.d, $$2.e, $$2.f, (float)(this.a.af() + 20), (float)this.a.ad());
               this.a.O().a($$2.d, $$2.e, $$2.f, 1.3);
               if ($$0.A.a(this.a(80)) == 0) {
                  $$0.a(this.a, (byte)38);
               }
            }
         }
      }
   }

   static class b extends ceq {
      private final cjx a;
      private final double b;
      @Nullable
      private crx c;

      b(cjx $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(ceq.a.a, ceq.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(cjx.bN, this.a);
         return this.c == null ? false : this.c.cj() && this.a.f() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.cj() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bvx(bvz.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.O().m();
      }

      @Override
      public void a() {
         this.a.J().a(this.c, (float)(this.a.af() + 20), (float)this.a.ad());
         if (this.a.g(this.c) < 6.25) {
            this.a.O().m();
         } else {
            this.a.O().a(this.c, this.b);
         }

         if (this.c.cj() && this.c.dV().A.a(6) == 0) {
            this.c.b(new bvx(bvz.D, 100), this.a);
         }
      }
   }

   class c extends ceq {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cjx.this.af) {
            return false;
         } else {
            List<coc> $$0 = cjx.this.dV().a(coc.class, cjx.this.cR().c(8.0, 8.0, 8.0), cjx.bJ);
            return !$$0.isEmpty() || !cjx.this.a(bxd.a).f();
         }
      }

      @Override
      public void d() {
         List<coc> $$0 = cjx.this.dV().a(coc.class, cjx.this.cR().c(8.0, 8.0, 8.0), cjx.bJ);
         if (!$$0.isEmpty()) {
            cjx.this.O().a($$0.get(0), 1.2F);
            cjx.this.a(awp.hA, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         czy $$0 = cjx.this.a(bxd.a);
         if (!$$0.f()) {
            this.a($$0);
            cjx.this.a(bxd.a, czy.k);
            this.b = cjx.this.af + cjx.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<coc> $$0 = cjx.this.dV().a(coc.class, cjx.this.cR().c(8.0, 8.0, 8.0), cjx.bJ);
         czy $$1 = cjx.this.a(bxd.a);
         if (!$$1.f()) {
            this.a($$1);
            cjx.this.a(bxd.a, czy.k);
         } else if (!$$0.isEmpty()) {
            cjx.this.O().a($$0.get(0), 1.2F);
         }
      }

      private void a(czy $$0) {
         if (!$$0.f()) {
            double $$1 = cjx.this.dE() - 0.3F;
            coc $$2 = new coc(cjx.this.dV(), cjx.this.dA(), $$1, cjx.this.dG(), $$0);
            $$2.b(40);
            $$2.b(cjx.this);
            float $$3 = 0.3F;
            float $$4 = cjx.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cjx.this.ae.i();
            $$2.n(
               (double)(0.3F * -azo.a(cjx.this.dL() * (float) (Math.PI / 180.0)) * azo.b(cjx.this.dN() * (float) (Math.PI / 180.0)) + azo.b($$4) * $$5),
               (double)(0.3F * azo.a(cjx.this.dN() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azo.b(cjx.this.dL() * (float) (Math.PI / 180.0)) * azo.b(cjx.this.dN() * (float) (Math.PI / 180.0)) + azo.a($$4) * $$5)
            );
            cjx.this.dV().b($$2);
         }
      }
   }
}
