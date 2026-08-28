import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chh extends chd implements buk<chh.d>, ckc {
   private static final int bZ = 5;
   private static final akg<Integer> cb = akk.a(chh.class, aki.b);
   private static final akg<Integer> cc = akk.a(chh.class, aki.b);
   private static final bss cd = bsv.an.n().a(bsr.a().a(bsq.a, 0.0F, bsv.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private chh cf;
   @Nullable
   private chh cg;

   public chh(bsv<? extends chh> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public boolean gz() {
      return false;
   }

   private void x(int $$0) {
      this.ao.a(cb, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azc $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gA() {
      return this.ao.a(cb);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Variant", this.gC().g);
      $$0.a("Strength", this.gA());
   }

   @Override
   public void a(ur $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(chh.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bS.a(0, new cac(this));
      this.bS.a(1, new cbm(this, 1.2));
      this.bS.a(2, new cap(this, 2.1F));
      this.bS.a(3, new cbh(this, 1.25, 40, 20.0F));
      this.bS.a(3, new cbb(this, 1.2));
      this.bS.a(4, new bzu(this, 1.0));
      this.bS.a(5, new cbq(this, 1.25, $$0 -> $$0.a(awu.ao), false));
      this.bS.a(6, new cah(this, 1.0));
      this.bS.a(7, new cbv(this, 0.7));
      this.bS.a(8, new caq(this, cms.class, 6.0F));
      this.bS.a(9, new cbd(this));
      this.bT.a(1, new chh.c(this));
      this.bT.a(2, new chh.a(this));
   }

   public static bur.a gB() {
      return s().a(bus.k, 40.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cc, 0);
   }

   public chh.d gC() {
      return chh.d.a(this.ao.a(cc));
   }

   public void a(chh.d $$0) {
      this.ao.a(cc, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.u() ? 1 + 3 * this.gy() : super.ab_();
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.an);
   }

   @Override
   protected boolean a(cms $$0, cuk $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cun.pw)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dew.ij.r())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gF() && this.g() == 0 && this.gr()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.eA() < this.eR() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.p_() && $$2 > 0) {
         this.dP().a(lj.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dP().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gF()) && this.gL() < this.gQ()) {
         $$5 = true;
         if (!this.dP().B) {
            this.w($$3);
         }
      }

      if ($$5 && !this.aW()) {
         avv $$6 = this.gx();
         if ($$6 != null) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), this.gx(), this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fg() {
      return this.eB() || this.gI();
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      azc $$4 = $$0.E_();
      this.b($$4);
      chh.d $$5;
      if ($$3 instanceof chh.b) {
         $$5 = ((chh.b)$$3).a;
      } else {
         $$5 = ac.a(chh.d.values(), $$4);
         $$3 = new chh.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   protected avv gO() {
      return avw.nZ;
   }

   @Override
   protected avv v() {
      return avw.nY;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.od;
   }

   @Override
   protected avv o_() {
      return avw.ob;
   }

   @Nullable
   @Override
   protected avv gx() {
      return avw.oc;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.of, 0.15F, 1.0F);
   }

   @Override
   protected void gq() {
      this.a(avw.oa, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gy() {
      return this.gA();
   }

   @Override
   public boolean fS() {
      return true;
   }

   @Override
   public boolean l(cuk $$0) {
      return $$0.a(awu.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public void a(bqi $$0) {
      ctd $$1 = this.gD();
      super.a($$0);
      ctd $$2 = this.gD();
      if (this.ai > 20 && $$2 != null && $$2 != $$1) {
         this.a(avw.og, 0.5F, 1.0F);
      }
   }

   @Nullable
   private static ctd n(cuk $$0) {
      deu $$1 = deu.a($$0.g());
      return $$1 instanceof dop ? ((dop)$$1).b() : null;
   }

   @Nullable
   public ctd gD() {
      return n(this.a(bsw.g));
   }

   @Override
   public int gQ() {
      return 30;
   }

   @Override
   public boolean a(cfa $$0) {
      return $$0 != this && $$0 instanceof chh && this.gX() && ((chh)$$0).gX();
   }

   @Nullable
   public chh b(arb $$0, bsj $$1) {
      chh $$2 = this.gE();
      if ($$2 != null) {
         this.a($$1, $$2);
         chh $$3 = (chh)$$1;
         int $$4 = this.ah.a(Math.max(this.gA(), $$3.gA())) + 1;
         if (this.ah.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.ah.h() ? this.gC() : $$3.gC());
      }

      return $$2;
   }

   @Nullable
   protected chh gE() {
      return bsv.an.a(this.dP());
   }

   private void k(btk $$0) {
      cnj $$1 = new cnj(this.dP(), this);
      double $$2 = $$0.du() - this.du();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dw();
      double $$4 = $$0.dA() - this.dA();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aW()) {
         this.dP().a(null, this.du(), this.dw(), this.dA(), avw.oe, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dP().b($$1);
      this.ce = true;
   }

   void D(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bri $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bS()) {
               for (bsp $$4 : this.cW()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eN();
         return true;
      }
   }

   public void ha() {
      if (this.cf != null) {
         this.cf.cg = null;
      }

      this.cf = null;
   }

   public void a(chh $$0) {
      this.cf = $$0;
      this.cf.cg = this;
   }

   public boolean hb() {
      return this.cg != null;
   }

   public boolean hc() {
      return this.cf != null;
   }

   @Nullable
   public chh hd() {
      return this.cf;
   }

   @Override
   protected double gp() {
      return 2.0;
   }

   @Override
   protected void gR() {
      if (!this.hc() && this.p_()) {
         super.gR();
      }
   }

   @Override
   public boolean gS() {
      return false;
   }

   @Override
   public void a(btk $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public evm cM() {
      return new evm(0.0, 0.75 * (double)this.cL(), (double)this.dj() * 0.5);
   }

   @Override
   public bss e(btw $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   protected evm a(bsp $$0, bss $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends ccb<cgd> {
      public a(chh $$0) {
         super($$0, cgd.class, 16, false, true, $$0x -> !((cgd)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bsj.a {
      public final chh.d a;

      b(chh.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cca {
      public c(chh $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof chh $$0 && $$0.ce) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements azp {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<chh.d> e = azp.a(chh.d::values);
      private static final IntFunction<chh.d> f = axl.a(chh.d::a, values(), axl.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static chh.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
