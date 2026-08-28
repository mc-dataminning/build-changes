import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cly extends clu implements cpf {
   private static final int bI = 5;
   private static final akn<Integer> bJ = akr.a(cly.class, akp.b);
   private static final akn<Integer> bK = akr.a(cly.class, akp.b);
   private static final bwy bM = bxe.ay.n().a(bwx.a().a(bww.a, 0.0F, bxe.ay.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean bN;
   @Nullable
   private cly bO;
   @Nullable
   private cly bP;

   public cly(bxe<? extends cly> $$0, djz $$1) {
      super($$0, $$1);
      this.O().a(40.0F);
   }

   public boolean gx() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bJ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azz $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gy() {
      return this.al.a(bJ);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", cly.d.g, this.gH());
      $$0.a("Strength", this.gy());
   }

   @Override
   public void a(ua $$0) {
      this.w($$0.b("Strength", 0));
      super.a($$0);
      this.a($$0.<cly.d>a("Variant", cly.d.g).orElse(cly.d.e));
   }

   @Override
   protected void D() {
      this.bF.a(0, new cem(this));
      this.bF.a(1, new cfw(this, 1.2));
      this.bF.a(2, new cez(this, 2.1F));
      this.bF.a(3, new cfr(this, 1.25, 40, 20.0F));
      this.bF.a(3, new cfl(this, 1.2));
      this.bF.a(4, new cee(this, 1.0));
      this.bF.a(5, new cga(this, 1.25, $$0 -> $$0.a(axo.at), false));
      this.bF.a(6, new cer(this, 1.0));
      this.bF.a(7, new cgf(this, 0.7));
      this.bF.a(8, new cfa(this, crz.class, 6.0F));
      this.bF.a(9, new cfn(this));
      this.bG.a(1, new cly.c(this));
      this.bG.a(2, new cly.a(this));
   }

   public static bzb.a gG() {
      return q();
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bJ, 0);
      $$0.a(bK, 0);
   }

   public cly.d gH() {
      return cly.d.a(this.al.a(bK));
   }

   private void a(cly.d $$0) {
      this.al.a(bK, $$0.j);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aN ? c((kk<T>)$$0, this.gH()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aN);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aN) {
         this.a(c(kl.aN, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.as);
   }

   @Override
   protected boolean a(crz $$0, daa $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(dae.qk)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dng.iL.h())) {
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
         this.dV().a(lz.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
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
         awq $$6 = this.gw();
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
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      azz $$4 = $$0.G_();
      this.b($$4);
      cly.d $$5;
      if ($$3 instanceof cly.b) {
         $$5 = ((cly.b)$$3).a;
      } else {
         $$5 = ag.a(cly.d.values(), $$4);
         $$3 = new cly.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   protected awq gU() {
      return awr.oL;
   }

   @Override
   protected awq u() {
      return awr.oK;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.oP;
   }

   @Override
   protected awq l_() {
      return awr.oN;
   }

   @Nullable
   @Override
   protected awq gw() {
      return awr.oO;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.oR, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(awr.oM, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ad_() {
      return this.t() ? this.gy() : 0;
   }

   @Override
   public boolean e(bxf $$0) {
      return true;
   }

   @Override
   public int gW() {
      return 30;
   }

   @Override
   public boolean a(cjm $$0) {
      return $$0 != this && $$0 instanceof cly && this.hc() && ((cly)$$0).hc();
   }

   @Nullable
   public cly b(aru $$0, bwl $$1) {
      cly $$2 = this.gI();
      if ($$2 != null) {
         this.a($$1, $$2);
         cly $$3 = (cly)$$1;
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
   protected cly gI() {
      return bxe.ay.a(this.dV(), bxd.e);
   }

   private void k(bxw $$0) {
      cst $$1 = new cst(this.dV(), this);
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dC();
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof aru $$6) {
         csu.a($$1, $$6, daa.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.ba()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awr.oQ, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.bN = true;
   }

   void D(boolean $$0) {
      this.bN = $$0;
   }

   @Override
   public boolean a(double $$0, float $$1, bvk $$2) {
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

   public void a(cly $$0) {
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
   public cly hf() {
      return this.bO;
   }

   @Override
   protected double gt() {
      return 2.0;
   }

   @Override
   protected void g(aru $$0) {
      if (!this.he() && this.n_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gX() {
      return false;
   }

   @Override
   public void a(bxw $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ffs cT() {
      return new ffs(0.0, 0.75 * (double)this.cS(), (double)this.dq() * 0.5);
   }

   @Override
   public bwy e(byi $$0) {
      return this.n_() ? bM : super.e($$0);
   }

   @Override
   protected ffs a(bwv $$0, bwy $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cgl<cmo> {
      public a(cly $$0) {
         super($$0, cmo.class, 16, false, true, ($$0x, $$1) -> !((cmo)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bwl.a {
      public final cly.d a;

      b(cly.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cgk {
      public c(cly $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cly $$0 && $$0.bN) {
            $$0.D(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements bao {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final cly.d e = a;
      private static final IntFunction<cly.d> i = ayg.a(cly.d::a, values(), ayg.a.c);
      public static final Codec<cly.d> f = bao.a(cly.d::values);
      @Deprecated
      public static final Codec<cly.d> g = Codec.INT.xmap(i::apply, cly.d::a);
      public static final za<ByteBuf, cly.d> h = yy.a(i, cly.d::a);
      final int j;
      private final String k;

      private d(final int $$0, final String $$1) {
         this.j = $$0;
         this.k = $$1;
      }

      public int a() {
         return this.j;
      }

      public static cly.d a(int $$0) {
         return i.apply($$0);
      }

      @Override
      public String c() {
         return this.k;
      }
   }
}
