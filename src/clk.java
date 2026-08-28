import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class clk extends clg implements coh {
   private static final int bG = 5;
   private static final akj<Integer> bH = akn.a(clk.class, akl.b);
   private static final akj<Integer> bI = akn.a(clk.class, akl.b);
   private static final bwi bK = bwo.ax.n().a(bwh.a().a(bwg.a, 0.0F, bwo.ax.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean bL;
   @Nullable
   private clk bM;
   @Nullable
   private clk bN;

   public clk(bwo<? extends clk> $$0, dja $$1) {
      super($$0, $$1);
      this.O().a(40.0F);
   }

   public boolean gu() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bH, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azv $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gv() {
      return this.al.a(bH);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gE().h);
      $$0.a("Strength", this.gv());
   }

   @Override
   public void a(tz $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(clk.d.a($$0.h("Variant")));
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdu(this));
      this.bD.a(1, new cfe(this, 1.2));
      this.bD.a(2, new ceh(this, 2.1F));
      this.bD.a(3, new cez(this, 1.25, 40, 20.0F));
      this.bD.a(3, new cet(this, 1.2));
      this.bD.a(4, new cdm(this, 1.0));
      this.bD.a(5, new cfi(this, 1.25, $$0 -> $$0.a(axk.as), false));
      this.bD.a(6, new cdz(this, 1.0));
      this.bD.a(7, new cfn(this, 0.7));
      this.bD.a(8, new cei(this, crc.class, 6.0F));
      this.bD.a(9, new cev(this));
      this.bE.a(1, new clk.c(this));
      this.bE.a(2, new clk.a(this));
   }

   public static byj.a gD() {
      return q();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bH, 0);
      $$0.a(bI, 0);
   }

   public clk.d gE() {
      return clk.d.a(this.al.a(bI));
   }

   private void a(clk.d $$0) {
      this.al.a(bI, $$0.h);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aM ? c((ki<T>)$$0, this.gE()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aM);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aM) {
         this.a(c(kj.aM, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.ar);
   }

   @Override
   protected boolean a(crc $$0, czd $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(czh.qk)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dmh.iL.h())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gI() && this.g() == 0 && this.gy()) {
            $$5 = true;
            this.e($$0);
         }
      }

      if (this.eG() < this.eU() && $$4 > 0.0F) {
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

      if ($$3 > 0 && ($$5 || !this.gI()) && this.gO() < this.gT() && !this.dV().C) {
         this.u($$3);
         $$5 = true;
      }

      if ($$5 && !this.bb()) {
         awm $$6 = this.gt();
         if ($$6 != null) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), this.gt(), this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fg() {
      return this.eH() || this.gL();
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      azv $$4 = $$0.C_();
      this.b($$4);
      clk.d $$5;
      if ($$3 instanceof clk.b) {
         $$5 = ((clk.b)$$3).a;
      } else {
         $$5 = af.a(clk.d.values(), $$4);
         $$3 = new clk.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gs() {
      return false;
   }

   @Override
   protected awm gR() {
      return awn.oL;
   }

   @Override
   protected awm u() {
      return awn.oK;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.oP;
   }

   @Override
   protected awm l_() {
      return awn.oN;
   }

   @Nullable
   @Override
   protected awm gt() {
      return awn.oO;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.oR, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(awn.oM, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ab_() {
      return this.t() ? this.gv() : 0;
   }

   @Override
   public boolean e(bwp $$0) {
      return true;
   }

   @Override
   public int gT() {
      return 30;
   }

   @Override
   public boolean a(ciu $$0) {
      return $$0 != this && $$0 instanceof clk && this.gZ() && ((clk)$$0).gZ();
   }

   @Nullable
   public clk b(arq $$0, bvv $$1) {
      clk $$2 = this.gF();
      if ($$2 != null) {
         this.a($$1, $$2);
         clk $$3 = (clk)$$1;
         int $$4 = this.ae.a(Math.max(this.gv(), $$3.gv())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gE() : $$3.gE());
      }

      return $$2;
   }

   @Nullable
   protected clk gF() {
      return bwo.ax.a(this.dV(), bwn.e);
   }

   private void k(bxe $$0) {
      crw $$1 = new crw(this.dV(), this);
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dC();
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof arq $$6) {
         crx.a($$1, $$6, czd.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.oQ, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.bL = true;
   }

   void D(boolean $$0) {
      this.bL = $$0;
   }

   @Override
   public boolean a(double $$0, float $$1, buu $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0) {
            this.a($$2, (float)$$3);
            this.b($$0, $$1, $$2);
         }

         this.eQ();
         return true;
      }
   }

   public void gG() {
      if (this.bM != null) {
         this.bM.bN = null;
      }

      this.bM = null;
   }

   public void a(clk $$0) {
      this.bM = $$0;
      this.bM.bN = this;
   }

   public boolean gH() {
      return this.bN != null;
   }

   public boolean hb() {
      return this.bM != null;
   }

   @Nullable
   public clk hc() {
      return this.bM;
   }

   @Override
   protected double gq() {
      return 2.0;
   }

   @Override
   protected void g(arq $$0) {
      if (!this.hb() && this.n_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gU() {
      return false;
   }

   @Override
   public void a(bxe $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public feq cT() {
      return new feq(0.0, 0.75 * (double)this.cS(), (double)this.dq() * 0.5);
   }

   @Override
   public bwi e(bxq $$0) {
      return this.n_() ? bK : super.e($$0);
   }

   @Override
   protected feq a(bwf $$0, bwi $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cft<cke> {
      public a(clk $$0) {
         super($$0, cke.class, 16, false, true, ($$0x, $$1) -> !((cke)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bvv.a {
      public final clk.d a;

      b(clk.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cfs {
      public c(clk $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof clk $$0 && $$0.bL) {
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

      public static final Codec<clk.d> e = bak.a(clk.d::values);
      private static final IntFunction<clk.d> g = ayc.a(clk.d::a, values(), ayc.a.c);
      public static final yw<ByteBuf, clk.d> f = yu.a(g, clk.d::a);
      final int h;
      private final String i;

      private d(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static clk.d a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
