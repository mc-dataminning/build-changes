import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cmh extends cmd implements cpo {
   private static final int bI = 5;
   private static final aku<Integer> bJ = aky.a(cmh.class, akw.b);
   private static final aku<Integer> bK = aky.a(cmh.class, akw.b);
   private static final bxh bM = bxn.ay.n().a(bxg.a().a(bxf.a, 0.0F, bxn.ay.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean bN;
   @Nullable
   private cmh bO;
   @Nullable
   private cmh bP;

   public cmh(bxn<? extends cmh> $$0, dkj $$1) {
      super($$0, $$1);
      this.O().a(40.0F);
   }

   public boolean gx() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bJ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(bai $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gy() {
      return this.al.a(bJ);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", cmh.d.g, this.gH());
      $$0.a("Strength", this.gy());
   }

   @Override
   public void a(ua $$0) {
      this.w($$0.b("Strength", 0));
      super.a($$0);
      this.a($$0.<cmh.d>a("Variant", cmh.d.g).orElse(cmh.d.e));
   }

   @Override
   protected void D() {
      this.bF.a(0, new cev(this));
      this.bF.a(1, new cgf(this, 1.2));
      this.bF.a(2, new cfi(this, 2.1F));
      this.bF.a(3, new cga(this, 1.25, 40, 20.0F));
      this.bF.a(3, new cfu(this, 1.2));
      this.bF.a(4, new cen(this, 1.0));
      this.bF.a(5, new cgj(this, 1.25, $$0 -> $$0.a(axv.at), false));
      this.bF.a(6, new cfa(this, 1.0));
      this.bF.a(7, new cgo(this, 0.7));
      this.bF.a(8, new cfj(this, csi.class, 6.0F));
      this.bF.a(9, new cfw(this));
      this.bG.a(1, new cmh.c(this));
      this.bG.a(2, new cmh.a(this));
   }

   public static bzk.a gG() {
      return q();
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bJ, 0);
      $$0.a(bK, 0);
   }

   public cmh.d gH() {
      return cmh.d.a(this.al.a(bK));
   }

   private void a(cmh.d $$0) {
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
   public boolean i(dak $$0) {
      return $$0.a(axv.as);
   }

   @Override
   protected boolean a(csi $$0, dak $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(dao.qk)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dnq.iL.h())) {
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
         awx $$6 = this.gw();
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
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      bai $$4 = $$0.G_();
      this.b($$4);
      cmh.d $$5;
      if ($$3 instanceof cmh.b) {
         $$5 = ((cmh.b)$$3).a;
      } else {
         $$5 = ag.a(cmh.d.values(), $$4);
         $$3 = new cmh.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   protected awx gU() {
      return awy.oL;
   }

   @Override
   protected awx u() {
      return awy.oK;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.oP;
   }

   @Override
   protected awx l_() {
      return awy.oN;
   }

   @Nullable
   @Override
   protected awx gw() {
      return awy.oO;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.oR, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(awy.oM, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ae_() {
      return this.t() ? this.gy() : 0;
   }

   @Override
   public boolean e(bxo $$0) {
      return true;
   }

   @Override
   public int gW() {
      return 30;
   }

   @Override
   public boolean a(cjv $$0) {
      return $$0 != this && $$0 instanceof cmh && this.hc() && ((cmh)$$0).hc();
   }

   @Nullable
   public cmh b(asb $$0, bwu $$1) {
      cmh $$2 = this.gI();
      if ($$2 != null) {
         this.a($$1, $$2);
         cmh $$3 = (cmh)$$1;
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
   protected cmh gI() {
      return bxn.ay.a(this.dV(), bxm.e);
   }

   private void k(byf $$0) {
      ctc $$1 = new ctc(this.dV(), this);
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dC();
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof asb $$6) {
         ctd.a($$1, $$6, dak.l, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.ba()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.oQ, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.bN = true;
   }

   void D(boolean $$0) {
      this.bN = $$0;
   }

   @Override
   public boolean a(double $$0, float $$1, bvt $$2) {
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

   public void a(cmh $$0) {
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
   public cmh hf() {
      return this.bO;
   }

   @Override
   protected double gt() {
      return 2.0;
   }

   @Override
   protected void g(asb $$0) {
      if (!this.he() && this.n_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gX() {
      return false;
   }

   @Override
   public void a(byf $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public fgc cT() {
      return new fgc(0.0, 0.75 * (double)this.cS(), (double)this.dq() * 0.5);
   }

   @Override
   public bxh e(byr $$0) {
      return this.n_() ? bM : super.e($$0);
   }

   @Override
   protected fgc a(bxe $$0, bxh $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cgu<cmx> {
      public a(cmh $$0) {
         super($$0, cmx.class, 16, false, true, ($$0x, $$1) -> !((cmx)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bwu.a {
      public final cmh.d a;

      b(cmh.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cgt {
      public c(cmh $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cmh $$0 && $$0.bN) {
            $$0.D(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements bax {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final cmh.d e = a;
      private static final IntFunction<cmh.d> i = ayo.a(cmh.d::a, values(), ayo.a.c);
      public static final Codec<cmh.d> f = bax.a(cmh.d::values);
      @Deprecated
      public static final Codec<cmh.d> g = Codec.INT.xmap(i::apply, cmh.d::a);
      public static final ze<ByteBuf, cmh.d> h = zc.a(i, cmh.d::a);
      final int j;
      private final String k;

      private d(final int $$0, final String $$1) {
         this.j = $$0;
         this.k = $$1;
      }

      public int a() {
         return this.j;
      }

      public static cmh.d a(int $$0) {
         return i.apply($$0);
      }

      @Override
      public String c() {
         return this.k;
      }
   }
}
