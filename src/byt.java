import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byt extends byp implements bme<byt.d>, cbm {
   private static final int bU = 5;
   private static final cok bW = cok.a(clm.pt, cvc.ij.k());
   private static final afo<Integer> bX = afr.a(byt.class, afq.b);
   private static final afo<Integer> bY = afr.a(byt.class, afq.b);
   private static final afo<Integer> bZ = afr.a(byt.class, afq.b);
   boolean ca;
   @Nullable
   private byt cb;
   @Nullable
   private byt cc;

   public byt(bku<? extends byt> $$0, csa $$1) {
      super($$0, $$1);
   }

   public boolean go() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ats $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gp() {
      return this.an.b(bX);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gr().g);
      $$0.a("Strength", this.gp());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new rz()));
      }
   }

   @Override
   public void a(rz $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(byt.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, clj.a($$0.p("DecorItem")));
      }

      this.gC();
   }

   @Override
   protected void B() {
      this.bO.a(0, new brv(this));
      this.bO.a(1, new btf(this, 1.2));
      this.bO.a(2, new bsi(this, 2.1F));
      this.bO.a(3, new bta(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bsu(this, 1.2));
      this.bO.a(4, new brn(this, 1.0));
      this.bO.a(5, new btj(this, 1.25, cok.a(clm.hC), false));
      this.bO.a(6, new bsa(this, 1.0));
      this.bO.a(7, new bto(this, 0.7));
      this.bO.a(8, new bsj(this, cdu.class, 6.0F));
      this.bO.a(9, new bsw(this));
      this.bP.a(1, new byt.c(this));
      this.bP.a(2, new byt.a(this));
   }

   public static bml.a gq() {
      return u().a(bmm.g, 40.0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public byt.d gr() {
      return byt.d.a(this.an.b(bZ));
   }

   public void a(byt.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.w() ? 2 + 3 * this.gn() : super.ab_();
   }

   @Override
   public boolean m(clj $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(cdu $$0, clj $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(clm.pt)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(cvc.ij.k())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gu() && this.h() == 0 && this.gg()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ew() < this.eN() && $$4 > 0.0F) {
         this.b($$4);
         $$5 = true;
      }

      if (this.n_() && $$2 > 0) {
         this.dN().a(js.K, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dN().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gu()) && this.gA() < this.gG()) {
         $$5 = true;
         if (!this.dN().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aU()) {
         aqq $$6 = this.gm();
         if ($$6 != null) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), this.gm(), this.dc(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean eZ() {
      return this.ex() || this.gx();
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      ats $$5 = $$0.E_();
      this.b($$5);
      byt.d $$6;
      if ($$3 instanceof byt.b) {
         $$6 = ((byt.b)$$3).a;
      } else {
         $$6 = ac.a(byt.d.values(), $$5);
         $$3 = new byt.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gl() {
      return false;
   }

   @Override
   protected aqq gE() {
      return aqr.mR;
   }

   @Override
   protected aqq y() {
      return aqr.mQ;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.mV;
   }

   @Override
   protected aqq m_() {
      return aqr.mT;
   }

   @Nullable
   @Override
   protected aqq gm() {
      return aqr.mU;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.mX, 0.15F, 1.0F);
   }

   @Override
   protected void gf() {
      this.a(aqr.mS, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gn() {
      return this.gp();
   }

   @Override
   public boolean gO() {
      return true;
   }

   @Override
   public boolean gP() {
      return !this.cp.a(1).b();
   }

   @Override
   public boolean l(clj $$0) {
      return $$0.a(aro.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(biq $$0) {
      cjx $$1 = this.gs();
      super.a($$0);
      cjx $$2 = this.gs();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(aqr.mY, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gC() {
      if (!this.dN().B) {
         super.gC();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable cjx $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static cjx n(clj $$0) {
      cva $$1 = cva.a($$0.d());
      return $$1 instanceof der ? ((der)$$1).b() : null;
   }

   @Nullable
   public cjx gs() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : cjx.a($$0);
   }

   @Override
   public int gG() {
      return 30;
   }

   @Override
   public boolean a(bwr $$0) {
      return $$0 != this && $$0 instanceof byt && this.gN() && ((byt)$$0).gN();
   }

   @Nullable
   public byt b(ame $$0, bkl $$1) {
      byt $$2 = this.gt();
      if ($$2 != null) {
         this.a($$1, $$2);
         byt $$3 = (byt)$$1;
         int $$4 = this.ag.a(Math.max(this.gp(), $$3.gp())) + 1;
         if (this.ag.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ag.h() ? this.gr() : $$3.gr());
      }

      return $$2;
   }

   @Nullable
   protected byt gt() {
      return bku.aj.a(this.dN());
   }

   private void k(blg $$0) {
      cel $$1 = new cel(this.dN(), this);
      double $$2 = $$0.ds() - this.ds();
      double $$3 = $$0.e(0.3333333333333333) - $$1.du();
      double $$4 = $$0.dy() - this.dy();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.mW, this.dc(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dN().b($$1);
      this.ca = true;
   }

   void D(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bjo $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bP()) {
               for (bkq $$4 : this.cU()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eJ();
         return true;
      }
   }

   public void gR() {
      if (this.cb != null) {
         this.cb.cc = null;
      }

      this.cb = null;
   }

   public void a(byt $$0) {
      this.cb = $$0;
      this.cb.cc = this;
   }

   public boolean gS() {
      return this.cc != null;
   }

   public boolean gT() {
      return this.cb != null;
   }

   @Nullable
   public byt gU() {
      return this.cb;
   }

   @Override
   protected double ge() {
      return 2.0;
   }

   @Override
   protected void gH() {
      if (!this.gT() && this.n_()) {
         super.gH();
      }
   }

   @Override
   public boolean gI() {
      return false;
   }

   @Override
   public void a(blg $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public eju cJ() {
      return new eju(0.0, 0.75 * (double)this.cI(), (double)this.dh() * 0.5);
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.n_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends btu<bxu> {
      public a(byt $$0) {
         super($$0, bxu.class, 16, false, true, $$0x -> !((bxu)$$0x).u());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bkl.a {
      public final byt.d a;

      b(byt.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends btt {
      public c(byt $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof byt $$0 && $$0.ca) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements aug {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<byt.d> e = aug.a(byt.d::values);
      private static final IntFunction<byt.d> f = asf.a(byt.d::a, values(), asf.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static byt.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
