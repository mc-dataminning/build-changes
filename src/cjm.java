import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjm extends ciy {
   private static final akj<Boolean> bJ = akn.a(cjm.class, akl.k);
   private static final akj<Integer> bK = akn.a(cjm.class, akl.b);
   static final chy bL = chy.b().a(10.0).d();
   public static final int bG = 4800;
   private static final int bM = 2400;
   public static final Predicate<cno> bH = $$0 -> !$$0.o() && $$0.bI() && $$0.bh();
   public static final float bI = 0.65F;
   @Nullable
   iv bN;

   public cjm(bwr<? extends cjm> $$0, djh $$1) {
      super($$0, $$1);
      this.bA = new cdk(this, 85, 10, 0.02F, 0.1F, true);
      this.bz = new cdj(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      this.j(this.cq());
      this.x(0.0F);
      byb $$4 = Objects.requireNonNullElseGet($$3, () -> new bvy.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cjm b(arq $$0, bvy $$1) {
      return bwr.H.a($$0, bwq.e);
   }

   @Override
   public float ej() {
      return this.n_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public boolean q() {
      return this.al.a(bJ);
   }

   public void w(boolean $$0) {
      this.al.a(bJ, $$0);
   }

   public int t() {
      return this.al.a(bK);
   }

   public void s(int $$0) {
      this.al.a(bK, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bJ, false);
      $$0.a(bK, 2400);
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
      this.w($$0.o("GotFish"));
      this.s($$0.f("Moistness"));
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdq(this));
      this.bD.a(0, new cfp(this));
      this.bD.a(1, new cjm.a(this));
      this.bD.a(2, new cjm.b(this, 4.0));
      this.bD.a(4, new cfd(this, 1.0, 10));
      this.bD.a(4, new cfa(this));
      this.bD.a(5, new cen(this, crj.class, 6.0F));
      this.bD.a(5, new cdv(this, 10));
      this.bD.a(6, new cep(this, 1.2F, true));
      this.bD.a(8, new cjm.c());
      this.bD.a(8, new cea(this));
      this.bD.a(9, new cdm<>(this, cog.class, 8.0F, 1.0, 1.0));
      this.bE.a(1, new cfx(this, cog.class).a());
   }

   public static byo.a x() {
      return bxl.E().a(byp.s, 10.0).a(byp.v, 1.2F).a(byp.c, 3.0);
   }

   @Override
   protected cgt b(djh $$0) {
      return new cgv(this, $$0);
   }

   @Override
   public void gm() {
      this.a(awn.hv, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bxj $$0) {
      return !this.n_() && super.c($$0);
   }

   @Override
   public int cq() {
      return 4800;
   }

   @Override
   protected int m(int $$0) {
      return this.cq();
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
   protected boolean o(bwi $$0) {
      return true;
   }

   @Override
   protected boolean f(bws $$0) {
      return $$0 == bws.a && this.fM();
   }

   @Override
   protected void a(arq $$0, cno $$1) {
      if (this.a(bws.a).f()) {
         czk $$2 = $$1.f();
         if (this.g($$2)) {
            this.a($$1);
            this.a(bws.a, $$2);
            this.g(bws.a);
            this.a($$1, $$2.M());
            $$1.aq();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.gi()) {
         this.j(this.cq());
      } else {
         if (this.bj()) {
            this.s(2400);
         } else {
            this.s(this.t() - 1);
            if (this.t() <= 0) {
               this.a(this.dV().t(), 1.0F);
            }

            if (this.aH()) {
               this.i(this.dx().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.w(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dU().C && this.bh() && this.dx().h() > 0.03) {
            fex $$0 = this.h(0.0F);
            float $$1 = azm.b(this.dK() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azm.a(this.dK() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dU()
                  .a(ly.av, this.dz() - $$0.d * (double)$$3 + (double)$$1, this.dB() - $$0.e, this.dF() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dU()
                  .a(ly.av, this.dz() - $$0.d * (double)$$3 - (double)$$1, this.dB() - $$0.e, this.dF() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
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
         this.dU().a($$0, this.d(1.0), this.dC() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bug b(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axk.aU)) {
         if (!this.dU().C) {
            this.a(awn.hx, 1.0F, 1.0F);
         }

         if (this.n_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.w(true);
            $$2.a(1, $$0);
         }

         return bug.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awm e(bux $$0) {
      return awn.hy;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.hw;
   }

   @Nullable
   @Override
   protected awm u() {
      return this.bh() ? awn.hu : awn.ht;
   }

   @Override
   protected awm aU() {
      return awn.hB;
   }

   @Override
   protected awm aT() {
      return awn.hC;
   }

   protected boolean gt() {
      iv $$0 = this.O().g();
      return $$0 != null ? $$0.a(this.ds(), 12.0) : false;
   }

   @Override
   public void a_(fex $$0) {
      if (this.bh()) {
         this.a(this.fn(), $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.9));
         if (this.f() == null) {
            this.i(this.dx().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   static class a extends cef {
      private final cjm a;
      private boolean b;

      a(cjm $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cef.a.a, cef.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.q() && this.a.cr() >= 100;
      }

      @Override
      public boolean c() {
         iv $$0 = this.a.bN;
         return $$0 == null ? false : !iv.a((double)$$0.u(), this.a.dB(), (double)$$0.w()).a(this.a.ds(), 4.0) && !this.b && this.a.cr() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dU() instanceof arq) {
            arq $$0 = (arq)this.a.dU();
            this.b = false;
            this.a.O().m();
            iv $$1 = this.a.du();
            iv $$2 = $$0.a(axn.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.bN = $$2;
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         iv $$0 = this.a.bN;
         if ($$0 == null || iv.a((double)$$0.u(), this.a.dB(), (double)$$0.w()).a(this.a.ds(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void a() {
         if (this.a.bN != null) {
            djh $$0 = this.a.dU();
            if (this.a.gt() || this.a.O().k()) {
               fex $$1 = fex.b(this.a.bN);
               fex $$2 = cic.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
               if ($$2 == null) {
                  $$2 = cic.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
               }

               if ($$2 != null) {
                  iv $$3 = iv.a((jp)$$2);
                  if (!$$0.b_($$3).a(axh.a) || !$$0.a_($$3).a(exk.b)) {
                     $$2 = cic.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends cef {
      private final cjm a;
      private final double b;
      @Nullable
      private crj c;

      b(cjm $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cef.a.a, cef.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(cjm.bL, this.a);
         return this.c == null ? false : this.c.ci() && this.a.f() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ci() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bvm(bvo.D, 100), this.a);
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

         if (this.c.ci() && this.c.dU().A.a(6) == 0) {
            this.c.b(new bvm(bvo.D, 100), this.a);
         }
      }
   }

   class c extends cef {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cjm.this.af) {
            return false;
         } else {
            List<cno> $$0 = cjm.this.dU().a(cno.class, cjm.this.cQ().c(8.0, 8.0, 8.0), cjm.bH);
            return !$$0.isEmpty() || !cjm.this.a(bws.a).f();
         }
      }

      @Override
      public void d() {
         List<cno> $$0 = cjm.this.dU().a(cno.class, cjm.this.cQ().c(8.0, 8.0, 8.0), cjm.bH);
         if (!$$0.isEmpty()) {
            cjm.this.O().a($$0.get(0), 1.2F);
            cjm.this.a(awn.hA, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         czk $$0 = cjm.this.a(bws.a);
         if (!$$0.f()) {
            this.a($$0);
            cjm.this.a(bws.a, czk.k);
            this.b = cjm.this.af + cjm.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<cno> $$0 = cjm.this.dU().a(cno.class, cjm.this.cQ().c(8.0, 8.0, 8.0), cjm.bH);
         czk $$1 = cjm.this.a(bws.a);
         if (!$$1.f()) {
            this.a($$1);
            cjm.this.a(bws.a, czk.k);
         } else if (!$$0.isEmpty()) {
            cjm.this.O().a($$0.get(0), 1.2F);
         }
      }

      private void a(czk $$0) {
         if (!$$0.f()) {
            double $$1 = cjm.this.dD() - 0.3F;
            cno $$2 = new cno(cjm.this.dU(), cjm.this.dz(), $$1, cjm.this.dF(), $$0);
            $$2.b(40);
            $$2.b(cjm.this);
            float $$3 = 0.3F;
            float $$4 = cjm.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cjm.this.ae.i();
            $$2.n(
               (double)(0.3F * -azm.a(cjm.this.dK() * (float) (Math.PI / 180.0)) * azm.b(cjm.this.dM() * (float) (Math.PI / 180.0)) + azm.b($$4) * $$5),
               (double)(0.3F * azm.a(cjm.this.dM() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azm.b(cjm.this.dK() * (float) (Math.PI / 180.0)) * azm.b(cjm.this.dM() * (float) (Math.PI / 180.0)) + azm.a($$4) * $$5)
            );
            cjm.this.dU().b($$2);
         }
      }
   }
}
