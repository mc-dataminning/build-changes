import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cah extends cad implements bnm<cah.d>, cda {
   private static final int bV = 5;
   private static final cqh bX = cqh.a(cnj.pv, cxa.ij.j());
   private static final agn<Integer> bY = agq.a(cah.class, agp.b);
   private static final agn<Integer> bZ = agq.a(cah.class, agp.b);
   private static final agn<Integer> ca = agq.a(cah.class, agp.b);
   private static final blz cb = bmc.al.n().a(bly.a().a(blx.a, 0.0F, bmc.al.l() - 0.8125F, -0.3F)).a(0.5F);
   boolean cc;
   @Nullable
   private cah cd;
   @Nullable
   private cah ce;

   public cah(bmc<? extends cah> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public boolean go() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bY, Math.max(1, Math.min(5, $$0)));
   }

   private void b(auw $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gp() {
      return this.an.b(bY);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Variant", this.gr().g);
      $$0.a("Strength", this.gp());
      if (!this.cq.a(1).b()) {
         $$0.a("DecorItem", this.cq.a(1).b(new so()));
      }
   }

   @Override
   public void a(so $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(cah.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cq.a(1, cng.a($$0.p("DecorItem")));
      }

      this.gC();
   }

   @Override
   protected void B() {
      this.bP.a(0, new bte(this));
      this.bP.a(1, new buo(this, 1.2));
      this.bP.a(2, new btr(this, 2.1F));
      this.bP.a(3, new buj(this, 1.25, 40, 20.0F));
      this.bP.a(3, new bud(this, 1.2));
      this.bP.a(4, new bsw(this, 1.0));
      this.bP.a(5, new bus(this, 1.25, cqh.a(cnj.hC), false));
      this.bP.a(6, new btj(this, 1.0));
      this.bP.a(7, new bux(this, 0.7));
      this.bP.a(8, new bts(this, cfq.class, 6.0F));
      this.bP.a(9, new buf(this));
      this.bQ.a(1, new cah.c(this));
      this.bQ.a(2, new cah.a(this));
   }

   public static bnt.a gq() {
      return u().a(bnu.i, 40.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bY, 0);
      this.an.a(bZ, -1);
      this.an.a(ca, 0);
   }

   public cah.d gr() {
      return cah.d.a(this.an.b(ca));
   }

   public void a(cah.d $$0) {
      this.an.b(ca, $$0.g);
   }

   @Override
   protected int ac_() {
      return this.w() ? 2 + 3 * this.gn() : super.ac_();
   }

   @Override
   public boolean m(cng $$0) {
      return bX.a($$0);
   }

   @Override
   protected boolean a(cfq $$0, cng $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cnj.pv)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(cxa.ij.j())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gu() && this.h() == 0 && this.gg()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ev() < this.eM() && $$4 > 0.0F) {
         this.b($$4);
         $$5 = true;
      }

      if (this.o_() && $$2 > 0) {
         this.dL().a(jx.M, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dL().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gu()) && this.gA() < this.gG()) {
         $$5 = true;
         if (!this.dL().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aU()) {
         ars $$6 = this.gm();
         if ($$6 != null) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), this.gm(), this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean eY() {
      return this.ew() || this.gx();
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      auw $$5 = $$0.F_();
      this.b($$5);
      cah.d $$6;
      if ($$3 instanceof cah.b) {
         $$6 = ((cah.b)$$3).a;
      } else {
         $$6 = ac.a(cah.d.values(), $$5);
         $$3 = new cah.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gl() {
      return false;
   }

   @Override
   protected ars gE() {
      return art.nA;
   }

   @Override
   protected ars y() {
      return art.nz;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.nE;
   }

   @Override
   protected ars n_() {
      return art.nC;
   }

   @Nullable
   @Override
   protected ars gm() {
      return art.nD;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.nG, 0.15F, 1.0F);
   }

   @Override
   protected void gf() {
      this.a(art.nB, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
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
      return !this.cq.a(1).b();
   }

   @Override
   public boolean l(cng $$0) {
      return $$0.a(asq.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bjv $$0) {
      clv $$1 = this.gs();
      super.a($$0);
      clv $$2 = this.gs();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(art.nH, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gC() {
      if (!this.dL().B) {
         super.gC();
         this.a(n(this.cq.a(1)));
      }
   }

   private void a(@Nullable clv $$0) {
      this.an.b(bZ, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static clv n(cng $$0) {
      cwy $$1 = cwy.a($$0.d());
      return $$1 instanceof dgr ? ((dgr)$$1).b() : null;
   }

   @Nullable
   public clv gs() {
      int $$0 = this.an.b(bZ);
      return $$0 == -1 ? null : clv.a($$0);
   }

   @Override
   public int gG() {
      return 30;
   }

   @Override
   public boolean a(byc $$0) {
      return $$0 != this && $$0 instanceof cah && this.gN() && ((cah)$$0).gN();
   }

   @Nullable
   public cah b(ane $$0, blr $$1) {
      cah $$2 = this.gt();
      if ($$2 != null) {
         this.a($$1, $$2);
         cah $$3 = (cah)$$1;
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
   protected cah gt() {
      return bmc.al.a(this.dL());
   }

   private void k(bmo $$0) {
      cgh $$1 = new cgh(this.dL(), this);
      double $$2 = $$0.dq() - this.dq();
      double $$3 = $$0.e(0.3333333333333333) - $$1.ds();
      double $$4 = $$0.dw() - this.dw();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dL().a(null, this.dq(), this.ds(), this.dw(), art.nF, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dL().b($$1);
      this.cc = true;
   }

   void D(boolean $$0) {
      this.cc = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bkv $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bP()) {
               for (blw $$4 : this.cT()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eI();
         return true;
      }
   }

   public void gR() {
      if (this.cd != null) {
         this.cd.ce = null;
      }

      this.cd = null;
   }

   public void a(cah $$0) {
      this.cd = $$0;
      this.cd.ce = this;
   }

   public boolean gS() {
      return this.ce != null;
   }

   public boolean gT() {
      return this.cd != null;
   }

   @Nullable
   public cah gU() {
      return this.cd;
   }

   @Override
   protected double ge() {
      return 2.0;
   }

   @Override
   protected void gH() {
      if (!this.gT() && this.o_()) {
         super.gH();
      }
   }

   @Override
   public boolean gI() {
      return false;
   }

   @Override
   public void a(bmo $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public emc cJ() {
      return new emc(0.0, 0.75 * (double)this.cI(), (double)this.dg() * 0.5);
   }

   @Override
   public blz e(bna $$0) {
      return this.o_() ? cb : super.e($$0);
   }

   @Override
   protected emc a(blw $$0, blz $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends bvd<bzf> {
      public a(cah $$0) {
         super($$0, bzf.class, 16, false, true, $$0x -> !((bzf)$$0x).u());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends blr.a {
      public final cah.d a;

      b(cah.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends bvc {
      public c(cah $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cah $$0 && $$0.cc) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements avl {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cah.d> e = avl.a(cah.d::values);
      private static final IntFunction<cah.d> f = ath.a(cah.d::a, values(), ath.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cah.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
