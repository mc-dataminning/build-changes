import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjd extends cir {
   private static final akj<iu> bI = akn.a(cjd.class, akl.o);
   private static final akj<Boolean> bJ = akn.a(cjd.class, akl.k);
   private static final akj<Integer> bK = akn.a(cjd.class, akl.b);
   static final chr bL = chr.b().a(10.0).d();
   public static final int bF = 4800;
   private static final int bM = 2400;
   public static final Predicate<cnd> bG = $$0 -> !$$0.o() && $$0.bK() && $$0.bj();
   public static final float bH = 0.65F;

   public cjd(bwm<? extends cjd> $$0, div $$1) {
      super($$0, $$1);
      this.bz = new cdd(this, 85, 10, 0.02F, 0.1F, true);
      this.by = new cdc(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      this.j(this.cs());
      this.x(0.0F);
      bxu $$4 = Objects.requireNonNullElseGet($$3, () -> new bvt.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cjd b(arq $$0, bvt $$1) {
      return bwm.H.a($$0, bwl.e);
   }

   @Override
   public float ej() {
      return this.n_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public void h(iu $$0) {
      this.al.a(bI, $$0);
   }

   public iu q() {
      return this.al.a(bI);
   }

   public boolean t() {
      return this.al.a(bJ);
   }

   public void w(boolean $$0) {
      this.al.a(bJ, $$0);
   }

   public int x() {
      return this.al.a(bK);
   }

   public void s(int $$0) {
      this.al.a(bK, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bI, iu.c);
      $$0.a(bJ, false);
      $$0.a(bK, 2400);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.q().u());
      $$0.a("TreasurePosY", this.q().v());
      $$0.a("TreasurePosZ", this.q().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(tz $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new iu($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.s($$0.h("Moistness"));
   }

   @Override
   protected void D() {
      this.bC.a(0, new cdj(this));
      this.bC.a(0, new cfi(this));
      this.bC.a(1, new cjd.a(this));
      this.bC.a(2, new cjd.b(this, 4.0));
      this.bC.a(4, new cew(this, 1.0, 10));
      this.bC.a(4, new cet(this));
      this.bC.a(5, new ceg(this, cqy.class, 6.0F));
      this.bC.a(5, new cdo(this, 10));
      this.bC.a(6, new cei(this, 1.2F, true));
      this.bC.a(8, new cjd.c());
      this.bC.a(8, new cdt(this));
      this.bC.a(9, new cdf<>(this, cnv.class, 8.0F, 1.0, 1.0));
      this.bD.a(1, new cfq(this, cnv.class).a());
   }

   public static byh.a gq() {
      return bxe.E().a(byi.s, 10.0).a(byi.v, 1.2F).a(byi.c, 3.0);
   }

   @Override
   protected cgm b(div $$0) {
      return new cgo(this, $$0);
   }

   @Override
   public void gj() {
      this.a(awn.ht, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bxc $$0) {
      return !this.n_() && super.c($$0);
   }

   @Override
   public int cs() {
      return 4800;
   }

   @Override
   protected int m(int $$0) {
      return this.cs();
   }

   @Override
   public int ac() {
      return 1;
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   protected boolean o(bwd $$0) {
      return true;
   }

   @Override
   protected boolean f(bwn $$0) {
      return $$0 == bwn.a && this.fM();
   }

   @Override
   protected void a(arq $$0, cnd $$1) {
      if (this.a(bwn.a).f()) {
         cyy $$2 = $$1.f();
         if (this.h($$2)) {
            this.a($$1);
            this.a(bwn.a, $$2);
            this.g(bwn.a);
            this.a($$1, $$2.M());
            $$1.at();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.gf()) {
         this.j(this.cs());
      } else {
         if (this.bl()) {
            this.s(2400);
         } else {
            this.s(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dW().t(), 1.0F);
            }

            if (this.aJ()) {
               this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.w(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dV().C && this.bj() && this.dy().h() > 0.03) {
            fei $$0 = this.h(0.0F);
            float $$1 = azm.b(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azm.a(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dV()
                  .a(lx.av, this.dA() - $$0.d * (double)$$3 + (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dV()
                  .a(lx.av, this.dA() - $$0.d * (double)$$3 - (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lx.Q);
      } else {
         super.b($$0);
      }
   }

   private void a(lv $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ae.k() * 0.01;
         double $$3 = this.ae.k() * 0.01;
         double $$4 = this.ae.k() * 0.01;
         this.dV().a($$0, this.d(1.0), this.dD() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bub b(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axk.aT)) {
         if (!this.dV().C) {
            this.a(awn.hv, 1.0F, 1.0F);
         }

         if (this.n_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.w(true);
            $$2.a(1, $$0);
         }

         return bub.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awm e(bus $$0) {
      return awn.hw;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.hu;
   }

   @Nullable
   @Override
   protected awm u() {
      return this.bj() ? awn.hs : awn.hr;
   }

   @Override
   protected awm aW() {
      return awn.hz;
   }

   @Override
   protected awm aV() {
      return awn.hA;
   }

   protected boolean gr() {
      iu $$0 = this.O().g();
      return $$0 != null ? $$0.a(this.dt(), 12.0) : false;
   }

   @Override
   public void a_(fei $$0) {
      if (this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bxg.a, this.dy());
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

   static class a extends cdy {
      private final cjd a;
      private boolean b;

      a(cjd $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdy.a.a, cdy.a.b));
      }

      @Override
      public boolean P_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.ct() >= 100;
      }

      @Override
      public boolean c() {
         iu $$0 = this.a.q();
         return !iu.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) && !this.b && this.a.ct() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dV() instanceof arq) {
            arq $$0 = (arq)this.a.dV();
            this.b = false;
            this.a.O().m();
            iu $$1 = this.a.dv();
            iu $$2 = $$0.a(axn.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.h($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         iu $$0 = this.a.q();
         if (iu.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void a() {
         div $$0 = this.a.dV();
         if (this.a.gr() || this.a.O().k()) {
            fei $$1 = fei.b(this.a.q());
            fei $$2 = chv.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = chv.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               iu $$3 = iu.a((jo)$$2);
               if (!$$0.b_($$3).a(axh.a) || !$$0.a_($$3).a(ewv.b)) {
                  $$2 = chv.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.J().a($$2.d, $$2.e, $$2.f, (float)(this.a.ad() + 20), (float)this.a.ac());
            this.a.O().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.A.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends cdy {
      private final cjd a;
      private final double b;
      @Nullable
      private cqy c;

      b(cjd $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cdy.a.a, cdy.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(cjd.bL, this.a);
         return this.c == null ? false : this.c.ck() && this.a.f() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ck() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bvh(bvj.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.O().m();
      }

      @Override
      public void a() {
         this.a.J().a(this.c, (float)(this.a.ad() + 20), (float)this.a.ac());
         if (this.a.g(this.c) < 6.25) {
            this.a.O().m();
         } else {
            this.a.O().a(this.c, this.b);
         }

         if (this.c.ck() && this.c.dV().A.a(6) == 0) {
            this.c.b(new bvh(bvj.D, 100), this.a);
         }
      }
   }

   class c extends cdy {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cjd.this.af) {
            return false;
         } else {
            List<cnd> $$0 = cjd.this.dV().a(cnd.class, cjd.this.cR().c(8.0, 8.0, 8.0), cjd.bG);
            return !$$0.isEmpty() || !cjd.this.a(bwn.a).f();
         }
      }

      @Override
      public void d() {
         List<cnd> $$0 = cjd.this.dV().a(cnd.class, cjd.this.cR().c(8.0, 8.0, 8.0), cjd.bG);
         if (!$$0.isEmpty()) {
            cjd.this.O().a($$0.get(0), 1.2F);
            cjd.this.a(awn.hy, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cyy $$0 = cjd.this.a(bwn.a);
         if (!$$0.f()) {
            this.a($$0);
            cjd.this.a(bwn.a, cyy.k);
            this.b = cjd.this.af + cjd.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<cnd> $$0 = cjd.this.dV().a(cnd.class, cjd.this.cR().c(8.0, 8.0, 8.0), cjd.bG);
         cyy $$1 = cjd.this.a(bwn.a);
         if (!$$1.f()) {
            this.a($$1);
            cjd.this.a(bwn.a, cyy.k);
         } else if (!$$0.isEmpty()) {
            cjd.this.O().a($$0.get(0), 1.2F);
         }
      }

      private void a(cyy $$0) {
         if (!$$0.f()) {
            double $$1 = cjd.this.dE() - 0.3F;
            cnd $$2 = new cnd(cjd.this.dV(), cjd.this.dA(), $$1, cjd.this.dG(), $$0);
            $$2.b(40);
            $$2.b(cjd.this);
            float $$3 = 0.3F;
            float $$4 = cjd.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cjd.this.ae.i();
            $$2.n(
               (double)(0.3F * -azm.a(cjd.this.dL() * (float) (Math.PI / 180.0)) * azm.b(cjd.this.dN() * (float) (Math.PI / 180.0)) + azm.b($$4) * $$5),
               (double)(0.3F * azm.a(cjd.this.dN() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azm.b(cjd.this.dL() * (float) (Math.PI / 180.0)) * azm.b(cjd.this.dN() * (float) (Math.PI / 180.0)) + azm.a($$4) * $$5)
            );
            cjd.this.dV().b($$2);
         }
      }
   }
}
