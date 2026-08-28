import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chk extends chg implements bun<chk.d>, ckf {
   private static final int bZ = 5;
   private static final akj<Integer> cb = akn.a(chk.class, akl.b);
   private static final akj<Integer> cc = akn.a(chk.class, akl.b);
   private static final bsv cd = bsy.an.n().a(bsu.a().a(bst.a, 0.0F, bsy.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private chk cf;
   @Nullable
   private chk cg;

   public chk(bsy<? extends chk> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public boolean gz() {
      return false;
   }

   private void x(int $$0) {
      this.ao.a(cb, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azf $$0) {
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
      this.a(chk.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bS.a(0, new caf(this));
      this.bS.a(1, new cbp(this, 1.2));
      this.bS.a(2, new cas(this, 2.1F));
      this.bS.a(3, new cbk(this, 1.25, 40, 20.0F));
      this.bS.a(3, new cbe(this, 1.2));
      this.bS.a(4, new bzx(this, 1.0));
      this.bS.a(5, new cbt(this, 1.25, $$0 -> $$0.a(awx.ao), false));
      this.bS.a(6, new cak(this, 1.0));
      this.bS.a(7, new cby(this, 0.7));
      this.bS.a(8, new cat(this, cmv.class, 6.0F));
      this.bS.a(9, new cbg(this));
      this.bT.a(1, new chk.c(this));
      this.bT.a(2, new chk.a(this));
   }

   public static buu.a gB() {
      return s().a(buv.k, 40.0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cc, 0);
   }

   public chk.d gC() {
      return chk.d.a(this.ao.a(cc));
   }

   public void a(chk.d $$0) {
      this.ao.a(cc, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.u() ? 1 + 3 * this.gy() : super.ab_();
   }

   @Override
   public boolean o(cun $$0) {
      return $$0.a(awx.an);
   }

   @Override
   protected boolean a(cmv $$0, cun $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cuq.pw)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dez.ij.r())) {
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
         this.dP().a(li.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
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
         avy $$6 = this.gx();
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
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      azf $$4 = $$0.E_();
      this.b($$4);
      chk.d $$5;
      if ($$3 instanceof chk.b) {
         $$5 = ((chk.b)$$3).a;
      } else {
         $$5 = ac.a(chk.d.values(), $$4);
         $$3 = new chk.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   protected avy gO() {
      return avz.nZ;
   }

   @Override
   protected avy v() {
      return avz.nY;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.od;
   }

   @Override
   protected avy o_() {
      return avz.ob;
   }

   @Nullable
   @Override
   protected avy gx() {
      return avz.oc;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(avz.of, 0.15F, 1.0F);
   }

   @Override
   protected void gq() {
      this.a(avz.oa, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
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
   public boolean l(cun $$0) {
      return $$0.a(awx.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Nullable
   private static ctg n(cun $$0) {
      dex $$1 = dex.a($$0.g());
      return $$1 instanceof dos ? ((dos)$$1).b() : null;
   }

   @Nullable
   public ctg gD() {
      return n(this.a(bsz.g));
   }

   @Override
   public int gQ() {
      return 30;
   }

   @Override
   public boolean a(cfd $$0) {
      return $$0 != this && $$0 instanceof chk && this.gX() && ((chk)$$0).gX();
   }

   @Nullable
   public chk b(are $$0, bsm $$1) {
      chk $$2 = this.gE();
      if ($$2 != null) {
         this.a($$1, $$2);
         chk $$3 = (chk)$$1;
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
   protected chk gE() {
      return bsy.an.a(this.dP());
   }

   private void k(btn $$0) {
      cnm $$1 = new cnm(this.dP(), this);
      double $$2 = $$0.du() - this.du();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dw();
      double $$4 = $$0.dA() - this.dA();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aW()) {
         this.dP().a(null, this.du(), this.dw(), this.dA(), avz.oe, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dP().b($$1);
      this.ce = true;
   }

   void D(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, brl $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bS()) {
               for (bss $$4 : this.cW()) {
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

   public void a(chk $$0) {
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
   public chk hd() {
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
   public void a(btn $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public evp cM() {
      return new evp(0.0, 0.75 * (double)this.cL(), (double)this.dj() * 0.5);
   }

   @Override
   public bsv e(btz $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   protected evp a(bss $$0, bsv $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cce<cgg> {
      public a(chk $$0) {
         super($$0, cgg.class, 16, false, true, $$0x -> !((cgg)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bsm.a {
      public final chk.d a;

      b(chk.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends ccd {
      public c(chk $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof chk $$0 && $$0.ce) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements azs {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<chk.d> e = azs.a(chk.d::values);
      private static final IntFunction<chk.d> f = axo.a(chk.d::a, values(), axo.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static chk.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
