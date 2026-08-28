import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class clw extends cls implements cpd {
   private static final int bI = 5;
   private static final akl<Integer> bJ = akp.a(clw.class, akn.b);
   private static final akl<Integer> bK = akp.a(clw.class, akn.b);
   private static final bww bM = bxc.ay.n().a(bwv.a().a(bwu.a, 0.0F, bxc.ay.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean bN;
   @Nullable
   private clw bO;
   @Nullable
   private clw bP;

   public clw(bxc<? extends clw> $$0, djx $$1) {
      super($$0, $$1);
      this.O().a(40.0F);
   }

   public boolean gx() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bJ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azx $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gy() {
      return this.al.a(bJ);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", clw.d.g, this.gH());
      $$0.a("Strength", this.gy());
   }

   @Override
   public void a(tz $$0) {
      this.w($$0.b("Strength", 0));
      super.a($$0);
      this.a($$0.<clw.d>a("Variant", clw.d.g).orElse(clw.d.e));
   }

   @Override
   protected void D() {
      this.bF.a(0, new cek(this));
      this.bF.a(1, new cfu(this, 1.2));
      this.bF.a(2, new cex(this, 2.1F));
      this.bF.a(3, new cfp(this, 1.25, 40, 20.0F));
      this.bF.a(3, new cfj(this, 1.2));
      this.bF.a(4, new cec(this, 1.0));
      this.bF.a(5, new cfy(this, 1.25, $$0 -> $$0.a(axm.as), false));
      this.bF.a(6, new cep(this, 1.0));
      this.bF.a(7, new cgd(this, 0.7));
      this.bF.a(8, new cey(this, crx.class, 6.0F));
      this.bF.a(9, new cfl(this));
      this.bG.a(1, new clw.c(this));
      this.bG.a(2, new clw.a(this));
   }

   public static byz.a gG() {
      return q();
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bJ, 0);
      $$0.a(bK, 0);
   }

   public clw.d gH() {
      return clw.d.a(this.al.a(bK));
   }

   private void a(clw.d $$0) {
      this.al.a(bK, $$0.j);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aN ? c((kj<T>)$$0, this.gH()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aN);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aN) {
         this.a(c(kk.aN, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.ar);
   }

   @Override
   protected boolean a(crx $$0, czy $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(dac.qk)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dne.iL.h())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gL() && this.g() == 0 && this.gB()) {
            $$5 = true;
            this.e($$0);
         }
      }

      if (this.eG() < this.eU() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.n_() && $$2 > 0) {
         this.dV().a(ly.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dV().C) {
            this.b_($$2);
            $$5 = true;
         }
      }

      if ($$3 > 0 && ($$5 || !this.gL()) && this.gR() < this.gW() && !this.dV().C) {
         this.u($$3);
         $$5 = true;
      }

      if ($$5 && !this.ba()) {
         awo $$6 = this.gw();
         if ($$6 != null) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), this.gw(), this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fg() {
      return this.eH() || this.gO();
   }

   @Nullable
   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      azx $$4 = $$0.G_();
      this.b($$4);
      clw.d $$5;
      if ($$3 instanceof clw.b) {
         $$5 = ((clw.b)$$3).a;
      } else {
         $$5 = ag.a(clw.d.values(), $$4);
         $$3 = new clw.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   protected awo gU() {
      return awp.oL;
   }

   @Override
   protected awo u() {
      return awp.oK;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.oP;
   }

   @Override
   protected awo l_() {
      return awp.oN;
   }

   @Nullable
   @Override
   protected awo gw() {
      return awp.oO;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.oR, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(awp.oM, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ad_() {
      return this.t() ? this.gy() : 0;
   }

   @Override
   public boolean e(bxd $$0) {
      return true;
   }

   @Override
   public int gW() {
      return 30;
   }

   @Override
   public boolean a(cjk $$0) {
      return $$0 != this && $$0 instanceof clw && this.hc() && ((clw)$$0).hc();
   }

   @Nullable
   public clw b(ars $$0, bwj $$1) {
      clw $$2 = this.gI();
      if ($$2 != null) {
         this.a($$1, $$2);
         clw $$3 = (clw)$$1;
         int $$4 = this.ae.a(Math.max(this.gy(), $$3.gy())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gH() : $$3.gH());
      }

      return $$2;
   }

   @Nullable
   protected clw gI() {
      return bxc.ay.a(this.dV(), bxb.e);
   }

   private void k(bxu $$0) {
      csr $$1 = new csr(this.dV(), this);
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dC();
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof ars $$6) {
         css.a($$1, $$6, czy.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.ba()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awp.oQ, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.bN = true;
   }

   void D(boolean $$0) {
      this.bN = $$0;
   }

   @Override
   public boolean a(double $$0, float $$1, bvi $$2) {
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

   public void gJ() {
      if (this.bO != null) {
         this.bO.bP = null;
      }

      this.bO = null;
   }

   public void a(clw $$0) {
      this.bO = $$0;
      this.bO.bP = this;
   }

   public boolean gK() {
      return this.bP != null;
   }

   public boolean he() {
      return this.bO != null;
   }

   @Nullable
   public clw hf() {
      return this.bO;
   }

   @Override
   protected double gt() {
      return 2.0;
   }

   @Override
   protected void g(ars $$0) {
      if (!this.he() && this.n_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gX() {
      return false;
   }

   @Override
   public void a(bxu $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ffq cT() {
      return new ffq(0.0, 0.75 * (double)this.cS(), (double)this.dq() * 0.5);
   }

   @Override
   public bww e(byg $$0) {
      return this.n_() ? bM : super.e($$0);
   }

   @Override
   protected ffq a(bwt $$0, bww $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cgj<cmm> {
      public a(clw $$0) {
         super($$0, cmm.class, 16, false, true, ($$0x, $$1) -> !((cmm)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bwj.a {
      public final clw.d a;

      b(clw.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cgi {
      public c(clw $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof clw $$0 && $$0.bN) {
            $$0.D(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements bam {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final clw.d e = a;
      private static final IntFunction<clw.d> i = aye.a(clw.d::a, values(), aye.a.c);
      public static final Codec<clw.d> f = bam.a(clw.d::values);
      @Deprecated
      public static final Codec<clw.d> g = Codec.INT.xmap(i::apply, clw.d::a);
      public static final yy<ByteBuf, clw.d> h = yw.a(i, clw.d::a);
      final int j;
      private final String k;

      private d(final int $$0, final String $$1) {
         this.j = $$0;
         this.k = $$1;
      }

      public int a() {
         return this.j;
      }

      public static clw.d a(int $$0) {
         return i.apply($$0);
      }

      @Override
      public String c() {
         return this.k;
      }
   }
}
