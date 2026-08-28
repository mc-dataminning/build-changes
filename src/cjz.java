import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjz extends cjv implements bwy<cjz.d>, cmw {
   private static final int bF = 5;
   private static final ajx<Integer> bG = akb.a(cjz.class, ajz.b);
   private static final ajx<Integer> bH = akb.a(cjz.class, ajz.b);
   private static final bvd bJ = bvi.ax.n().a(bvc.a().a(bvb.a, 0.0F, bvi.ax.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean bK;
   @Nullable
   private cjz bL;
   @Nullable
   private cjz bM;

   public cjz(bvi<? extends cjz> $$0, dgz $$1) {
      super($$0, $$1);
      this.O().a(40.0F);
   }

   public boolean gv() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bG, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azh $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gw() {
      return this.al.a(bG);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gF().g);
      $$0.a("Strength", this.gw());
   }

   @Override
   public void a(tq $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(cjz.d.a($$0.h("Variant")));
   }

   @Override
   protected void D() {
      this.bC.a(0, new ccq(this));
      this.bC.a(1, new cea(this, 1.2));
      this.bC.a(2, new cdd(this, 2.1F));
      this.bC.a(3, new cdv(this, 1.25, 40, 20.0F));
      this.bC.a(3, new cdp(this, 1.2));
      this.bC.a(4, new cci(this, 1.0));
      this.bC.a(5, new cee(this, 1.25, $$0 -> $$0.a(awy.ar), false));
      this.bC.a(6, new ccv(this, 1.0));
      this.bC.a(7, new cej(this, 0.7));
      this.bC.a(8, new cde(this, cpr.class, 6.0F));
      this.bC.a(9, new cdr(this));
      this.bD.a(1, new cjz.c(this));
      this.bD.a(2, new cjz.a(this));
   }

   public static bxf.a gE() {
      return q();
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bG, 0);
      $$0.a(bH, 0);
   }

   public cjz.d gF() {
      return cjz.d.a(this.al.a(bH));
   }

   public void a(cjz.d $$0) {
      this.al.a(bH, $$0.g);
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.aq);
   }

   @Override
   protected boolean a(cpr $$0, cxh $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cxl.qd)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dkg.iH.i())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gJ() && this.g() == 0 && this.gz()) {
            $$5 = true;
            this.e($$0);
         }
      }

      if (this.eE() < this.eS() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.n_() && $$2 > 0) {
         this.dU().a(lt.Q, this.d(1.0), this.dC() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dU().C) {
            this.b_($$2);
            $$5 = true;
         }
      }

      if ($$3 > 0 && ($$5 || !this.gJ()) && this.gP() < this.gV() && !this.dU().C) {
         this.u($$3);
         $$5 = true;
      }

      if ($$5 && !this.bb()) {
         avz $$6 = this.gu();
         if ($$6 != null) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), this.gu(), this.dl(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fi() {
      return this.eF() || this.gM();
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      azh $$4 = $$0.C_();
      this.b($$4);
      cjz.d $$5;
      if ($$3 instanceof cjz.b) {
         $$5 = ((cjz.b)$$3).a;
      } else {
         $$5 = af.a(cjz.d.values(), $$4);
         $$3 = new cjz.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   protected avz gT() {
      return awa.oH;
   }

   @Override
   protected avz u() {
      return awa.oG;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.oL;
   }

   @Override
   protected avz l_() {
      return awa.oJ;
   }

   @Nullable
   @Override
   protected avz gu() {
      return awa.oK;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.oN, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(awa.oI, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ad_() {
      return this.t() ? this.gw() : 0;
   }

   @Override
   public boolean e(bvj $$0) {
      return true;
   }

   @Override
   public boolean e() {
      return false;
   }

   @Override
   public int gV() {
      return 30;
   }

   @Override
   public boolean a(chp $$0) {
      return $$0 != this && $$0 instanceof cjz && this.hb() && ((cjz)$$0).hb();
   }

   @Nullable
   public cjz b(ard $$0, buq $$1) {
      cjz $$2 = this.gG();
      if ($$2 != null) {
         this.a($$1, $$2);
         cjz $$3 = (cjz)$$1;
         int $$4 = this.ae.a(Math.max(this.gw(), $$3.gw())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gF() : $$3.gF());
      }

      return $$2;
   }

   @Nullable
   protected cjz gG() {
      return bvi.ax.a(this.dU(), bvh.e);
   }

   private void l(bvy $$0) {
      cqj $$1 = new cqj(this.dU(), this);
      double $$2 = $$0.dz() - this.dz();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dB();
      double $$4 = $$0.dF() - this.dF();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dU() instanceof ard $$6) {
         cqk.a($$1, $$6, cxh.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.oM, this.dl(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.bK = true;
   }

   void D(boolean $$0) {
      this.bK = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, btp $$2) {
      int $$3 = this.f($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bZ()) {
               for (bva $$4 : this.db()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eO();
         return true;
      }
   }

   public void gH() {
      if (this.bL != null) {
         this.bL.bM = null;
      }

      this.bL = null;
   }

   public void a(cjz $$0) {
      this.bL = $$0;
      this.bL.bM = this;
   }

   public boolean gI() {
      return this.bM != null;
   }

   public boolean he() {
      return this.bL != null;
   }

   @Nullable
   public cjz hf() {
      return this.bL;
   }

   @Override
   protected double gr() {
      return 2.0;
   }

   @Override
   protected void g(ard $$0) {
      if (!this.he() && this.n_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gW() {
      return false;
   }

   @Override
   public void a(bvy $$0, float $$1) {
      this.l($$0);
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, 0.75 * (double)this.cR(), (double)this.dp() * 0.5);
   }

   @Override
   public bvd e(bwk $$0) {
      return this.n_() ? bJ : super.e($$0);
   }

   @Override
   protected fbx a(bva $$0, bvd $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cep<civ> {
      public a(cjz $$0) {
         super($$0, civ.class, 16, false, true, ($$0x, $$1) -> !((civ)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends buq.a {
      public final cjz.d a;

      b(cjz.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends ceo {
      public c(cjz $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cjz $$0 && $$0.bK) {
            $$0.D(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements azv {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cjz.d> e = azv.a(cjz.d::values);
      private static final IntFunction<cjz.d> f = axq.a(cjz.d::a, values(), axq.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cjz.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
