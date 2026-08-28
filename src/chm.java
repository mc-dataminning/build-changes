import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chm extends chi implements bup<chm.d>, ckh {
   private static final int bZ = 5;
   private static final akk<Integer> cb = ako.a(chm.class, akm.b);
   private static final akk<Integer> cc = ako.a(chm.class, akm.b);
   private static final bsx cd = bta.an.n().a(bsw.a().a(bsv.a, 0.0F, bta.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private chm cf;
   @Nullable
   private chm cg;

   public chm(bta<? extends chm> $$0, dby $$1) {
      super($$0, $$1);
   }

   public boolean gz() {
      return false;
   }

   private void x(int $$0) {
      this.ao.a(cb, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azh $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gA() {
      return this.ao.a(cb);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Variant", this.gC().g);
      $$0.a("Strength", this.gA());
   }

   @Override
   public void a(us $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(chm.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bS.a(0, new cah(this));
      this.bS.a(1, new cbr(this, 1.2));
      this.bS.a(2, new cau(this, 2.1F));
      this.bS.a(3, new cbm(this, 1.25, 40, 20.0F));
      this.bS.a(3, new cbg(this, 1.2));
      this.bS.a(4, new bzz(this, 1.0));
      this.bS.a(5, new cbv(this, 1.25, $$0 -> $$0.a(awy.ao), false));
      this.bS.a(6, new cam(this, 1.0));
      this.bS.a(7, new cca(this, 0.7));
      this.bS.a(8, new cav(this, cmx.class, 6.0F));
      this.bS.a(9, new cbi(this));
      this.bT.a(1, new chm.c(this));
      this.bT.a(2, new chm.a(this));
   }

   public static buw.a gB() {
      return s().a(bux.k, 40.0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cc, 0);
   }

   public chm.d gC() {
      return chm.d.a(this.ao.a(cc));
   }

   public void a(chm.d $$0) {
      this.ao.a(cc, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.u() ? 1 + 3 * this.gy() : super.ab_();
   }

   @Override
   public boolean o(cup $$0) {
      return $$0.a(awy.an);
   }

   @Override
   protected boolean a(cmx $$0, cup $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cus.pw)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dfb.ij.r())) {
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
         avz $$6 = this.gx();
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
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      azh $$4 = $$0.E_();
      this.b($$4);
      chm.d $$5;
      if ($$3 instanceof chm.b) {
         $$5 = ((chm.b)$$3).a;
      } else {
         $$5 = ac.a(chm.d.values(), $$4);
         $$3 = new chm.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   protected avz gO() {
      return awa.nZ;
   }

   @Override
   protected avz v() {
      return awa.nY;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.od;
   }

   @Override
   protected avz o_() {
      return awa.ob;
   }

   @Nullable
   @Override
   protected avz gx() {
      return awa.oc;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.of, 0.15F, 1.0F);
   }

   @Override
   protected void gq() {
      this.a(awa.oa, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
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
   public boolean l(cup $$0) {
      return $$0.a(awy.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Nullable
   private static cti n(cup $$0) {
      dez $$1 = dez.a($$0.g());
      return $$1 instanceof dou ? ((dou)$$1).b() : null;
   }

   @Nullable
   public cti gD() {
      return n(this.a(btb.g));
   }

   @Override
   public int gQ() {
      return 30;
   }

   @Override
   public boolean a(cff $$0) {
      return $$0 != this && $$0 instanceof chm && this.gX() && ((chm)$$0).gX();
   }

   @Nullable
   public chm b(arf $$0, bso $$1) {
      chm $$2 = this.gE();
      if ($$2 != null) {
         this.a($$1, $$2);
         chm $$3 = (chm)$$1;
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
   protected chm gE() {
      return bta.an.a(this.dP());
   }

   private void k(btp $$0) {
      cno $$1 = new cno(this.dP(), this);
      double $$2 = $$0.du() - this.du();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dw();
      double $$4 = $$0.dA() - this.dA();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aW()) {
         this.dP().a(null, this.du(), this.dw(), this.dA(), awa.oe, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dP().b($$1);
      this.ce = true;
   }

   void D(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, brn $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bS()) {
               for (bsu $$4 : this.cW()) {
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

   public void a(chm $$0) {
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
   public chm hd() {
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
   public void a(btp $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public evr cM() {
      return new evr(0.0, 0.75 * (double)this.cL(), (double)this.dj() * 0.5);
   }

   @Override
   public bsx e(bub $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   protected evr a(bsu $$0, bsx $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends ccg<cgi> {
      public a(chm $$0) {
         super($$0, cgi.class, 16, false, true, $$0x -> !((cgi)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bso.a {
      public final chm.d a;

      b(chm.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends ccf {
      public c(chm $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof chm $$0 && $$0.ce) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements azu {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<chm.d> e = azu.a(chm.d::values);
      private static final IntFunction<chm.d> f = axp.a(chm.d::a, values(), axp.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static chm.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
