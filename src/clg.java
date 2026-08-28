import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class clg extends clc implements cod {
   private static final int bF = 5;
   private static final akj<Integer> bG = akn.a(clg.class, akl.b);
   private static final akj<Integer> bH = akn.a(clg.class, akl.b);
   private static final bwg bJ = bwm.ax.n().a(bwf.a().a(bwe.a, 0.0F, bwm.ax.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean bK;
   @Nullable
   private clg bL;
   @Nullable
   private clg bM;

   public clg(bwm<? extends clg> $$0, div $$1) {
      super($$0, $$1);
      this.O().a(40.0F);
   }

   public boolean gt() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bG, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azv $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gu() {
      return this.al.a(bG);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gD().h);
      $$0.a("Strength", this.gu());
   }

   @Override
   public void a(tz $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(clg.d.a($$0.h("Variant")));
   }

   @Override
   protected void D() {
      this.bC.a(0, new cds(this));
      this.bC.a(1, new cfc(this, 1.2));
      this.bC.a(2, new cef(this, 2.1F));
      this.bC.a(3, new cex(this, 1.25, 40, 20.0F));
      this.bC.a(3, new cer(this, 1.2));
      this.bC.a(4, new cdk(this, 1.0));
      this.bC.a(5, new cfg(this, 1.25, $$0 -> $$0.a(axk.ar), false));
      this.bC.a(6, new cdx(this, 1.0));
      this.bC.a(7, new cfl(this, 0.7));
      this.bC.a(8, new ceg(this, cqy.class, 6.0F));
      this.bC.a(9, new cet(this));
      this.bD.a(1, new clg.c(this));
      this.bD.a(2, new clg.a(this));
   }

   public static byh.a gC() {
      return q();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, 0);
      $$0.a(bH, 0);
   }

   public clg.d gD() {
      return clg.d.a(this.al.a(bH));
   }

   private void a(clg.d $$0) {
      this.al.a(bH, $$0.h);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aL ? c((ki<T>)$$0, this.gD()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aL);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aL) {
         this.a(c(kj.aL, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.aq);
   }

   @Override
   protected boolean a(cqy $$0, cyy $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(czc.qh)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dmc.iI.h())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gH() && this.g() == 0 && this.gx()) {
            $$5 = true;
            this.e($$0);
         }
      }

      if (this.eF() < this.eT() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.n_() && $$2 > 0) {
         this.dV().a(lx.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dV().C) {
            this.b_($$2);
            $$5 = true;
         }
      }

      if ($$3 > 0 && ($$5 || !this.gH()) && this.gN() < this.gS() && !this.dV().C) {
         this.u($$3);
         $$5 = true;
      }

      if ($$5 && !this.bb()) {
         awm $$6 = this.gs();
         if ($$6 != null) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), this.gs(), this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean ff() {
      return this.eG() || this.gK();
   }

   @Nullable
   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      azv $$4 = $$0.C_();
      this.b($$4);
      clg.d $$5;
      if ($$3 instanceof clg.b) {
         $$5 = ((clg.b)$$3).a;
      } else {
         $$5 = af.a(clg.d.values(), $$4);
         $$3 = new clg.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   protected awm gQ() {
      return awn.oI;
   }

   @Override
   protected awm u() {
      return awn.oH;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.oM;
   }

   @Override
   protected awm l_() {
      return awn.oK;
   }

   @Nullable
   @Override
   protected awm gs() {
      return awn.oL;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.oO, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(awn.oJ, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int aa_() {
      return this.t() ? this.gu() : 0;
   }

   @Override
   public boolean e(bwn $$0) {
      return true;
   }

   @Override
   public int gS() {
      return 30;
   }

   @Override
   public boolean a(cis $$0) {
      return $$0 != this && $$0 instanceof clg && this.gY() && ((clg)$$0).gY();
   }

   @Nullable
   public clg b(arq $$0, bvt $$1) {
      clg $$2 = this.gE();
      if ($$2 != null) {
         this.a($$1, $$2);
         clg $$3 = (clg)$$1;
         int $$4 = this.ae.a(Math.max(this.gu(), $$3.gu())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gD() : $$3.gD());
      }

      return $$2;
   }

   @Nullable
   protected clg gE() {
      return bwm.ax.a(this.dV(), bwl.e);
   }

   private void k(bxc $$0) {
      crr $$1 = new crr(this.dV(), this);
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dC();
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof arq $$6) {
         crs.a($$1, $$6, cyy.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.oN, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.bK = true;
   }

   void D(boolean $$0) {
      this.bK = $$0;
   }

   @Override
   public boolean a(double $$0, float $$1, bus $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0) {
            this.a($$2, (float)$$3);
            this.b($$0, $$1, $$2);
         }

         this.eP();
         return true;
      }
   }

   public void gF() {
      if (this.bL != null) {
         this.bL.bM = null;
      }

      this.bL = null;
   }

   public void a(clg $$0) {
      this.bL = $$0;
      this.bL.bM = this;
   }

   public boolean gG() {
      return this.bM != null;
   }

   public boolean ha() {
      return this.bL != null;
   }

   @Nullable
   public clg hb() {
      return this.bL;
   }

   @Override
   protected double gp() {
      return 2.0;
   }

   @Override
   protected void g(arq $$0) {
      if (!this.ha() && this.n_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gT() {
      return false;
   }

   @Override
   public void a(bxc $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public fei cT() {
      return new fei(0.0, 0.75 * (double)this.cS(), (double)this.dq() * 0.5);
   }

   @Override
   public bwg e(bxo $$0) {
      return this.n_() ? bJ : super.e($$0);
   }

   @Override
   protected fei a(bwd $$0, bwg $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cfr<cka> {
      public a(clg $$0) {
         super($$0, cka.class, 16, false, true, ($$0x, $$1) -> !((cka)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bvt.a {
      public final clg.d a;

      b(clg.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cfq {
      public c(clg $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof clg $$0 && $$0.bK) {
            $$0.D(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements bak {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<clg.d> e = bak.a(clg.d::values);
      private static final IntFunction<clg.d> g = ayc.a(clg.d::a, values(), ayc.a.c);
      public static final yw<ByteBuf, clg.d> f = yu.a(g, clg.d::a);
      final int h;
      private final String i;

      private d(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static clg.d a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
