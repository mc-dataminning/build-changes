import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cby extends cbu implements bpd<cby.d>, cer {
   private static final int bU = 5;
   private static final cry bW = cry.a(cpc.pv, cyq.ij.j());
   private static final aie<Integer> bX = aih.a(cby.class, aig.b);
   private static final aie<Integer> bY = aih.a(cby.class, aig.b);
   private static final aie<Integer> bZ = aih.a(cby.class, aig.b);
   private static final bnr ca = bnu.al.n().a(bnq.a().a(bnp.a, 0.0F, bnu.al.l() - 0.8125F, -0.3F)).a(0.5F);
   boolean cb;
   @Nullable
   private cby cc;
   @Nullable
   private cby cd;

   public cby(bnu<? extends cby> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public boolean gp() {
      return false;
   }

   private void x(int $$0) {
      this.am.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(awo $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gq() {
      return this.am.b(bX);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Variant", this.gs().g);
      $$0.a("Strength", this.gq());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new sw()));
      }
   }

   @Override
   public void a(sw $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(cby.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, coz.a($$0.p("DecorItem")));
      }

      this.gD();
   }

   @Override
   protected void B() {
      this.bO.a(0, new buv(this));
      this.bO.a(1, new bwf(this, 1.2));
      this.bO.a(2, new bvi(this, 2.1F));
      this.bO.a(3, new bwa(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bvu(this, 1.2));
      this.bO.a(4, new bun(this, 1.0));
      this.bO.a(5, new bwj(this, 1.25, cry.a(cpc.hC), false));
      this.bO.a(6, new bva(this, 1.0));
      this.bO.a(7, new bwo(this, 0.7));
      this.bO.a(8, new bvj(this, chh.class, 6.0F));
      this.bO.a(9, new bvw(this));
      this.bP.a(1, new cby.c(this));
      this.bP.a(2, new cby.a(this));
   }

   public static bpk.a gr() {
      return u().a(bpl.i, 40.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bX, 0);
      this.am.a(bY, -1);
      this.am.a(bZ, 0);
   }

   public cby.d gs() {
      return cby.d.a(this.am.b(bZ));
   }

   public void a(cby.d $$0) {
      this.am.b(bZ, $$0.g);
   }

   @Override
   protected int ac_() {
      return this.w() ? 2 + 3 * this.go() : super.ac_();
   }

   @Override
   public boolean m(coz $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(chh $$0, coz $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cpc.pv)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(cyq.ij.j())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gv() && this.h() == 0 && this.gh()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ew() < this.eN() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.o_() && $$2 > 0) {
         this.dM().a(jz.M, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dM().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gv()) && this.gB() < this.gH()) {
         $$5 = true;
         if (!this.dM().B) {
            this.w($$3);
         }
      }

      if ($$5 && !this.aU()) {
         atj $$6 = this.gn();
         if ($$6 != null) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), this.gn(), this.db(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean eY() {
      return this.ex() || this.gy();
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      awo $$5 = $$0.F_();
      this.b($$5);
      cby.d $$6;
      if ($$3 instanceof cby.b) {
         $$6 = ((cby.b)$$3).a;
      } else {
         $$6 = ac.a(cby.d.values(), $$5);
         $$3 = new cby.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gm() {
      return false;
   }

   @Override
   protected atj gF() {
      return atk.nA;
   }

   @Override
   protected atj y() {
      return atk.nz;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.nE;
   }

   @Override
   protected atj n_() {
      return atk.nC;
   }

   @Nullable
   @Override
   protected atj gn() {
      return atk.nD;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.nG, 0.15F, 1.0F);
   }

   @Override
   protected void gg() {
      this.a(atk.nB, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int go() {
      return this.gq();
   }

   @Override
   public boolean gP() {
      return true;
   }

   @Override
   public boolean gQ() {
      return !this.cp.a(1).b();
   }

   @Override
   public boolean l(coz $$0) {
      return $$0.a(auh.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bln $$0) {
      cnn $$1 = this.gt();
      super.a($$0);
      cnn $$2 = this.gt();
      if (this.ag > 20 && $$2 != null && $$2 != $$1) {
         this.a(atk.nH, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gD() {
      if (!this.dM().B) {
         super.gD();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable cnn $$0) {
      this.am.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static cnn n(coz $$0) {
      cyo $$1 = cyo.a($$0.d());
      return $$1 instanceof dih ? ((dih)$$1).b() : null;
   }

   @Nullable
   public cnn gt() {
      int $$0 = this.am.b(bY);
      return $$0 == -1 ? null : cnn.a($$0);
   }

   @Override
   public int gH() {
      return 30;
   }

   @Override
   public boolean a(bzt $$0) {
      return $$0 != this && $$0 instanceof cby && this.gO() && ((cby)$$0).gO();
   }

   @Nullable
   public cby b(aov $$0, bnj $$1) {
      cby $$2 = this.gu();
      if ($$2 != null) {
         this.a($$1, $$2);
         cby $$3 = (cby)$$1;
         int $$4 = this.af.a(Math.max(this.gq(), $$3.gq())) + 1;
         if (this.af.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.af.h() ? this.gs() : $$3.gs());
      }

      return $$2;
   }

   @Nullable
   protected cby gu() {
      return bnu.al.a(this.dM());
   }

   private void k(bog $$0) {
      chy $$1 = new chy(this.dM(), this);
      double $$2 = $$0.dr() - this.dr();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dt();
      double $$4 = $$0.dx() - this.dx();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), atk.nF, this.db(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
      }

      this.dM().b($$1);
      this.cb = true;
   }

   void D(boolean $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bmn $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bP()) {
               for (bno $$4 : this.cT()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eJ();
         return true;
      }
   }

   public void gS() {
      if (this.cc != null) {
         this.cc.cd = null;
      }

      this.cc = null;
   }

   public void a(cby $$0) {
      this.cc = $$0;
      this.cc.cd = this;
   }

   public boolean gT() {
      return this.cd != null;
   }

   public boolean gU() {
      return this.cc != null;
   }

   @Nullable
   public cby gV() {
      return this.cc;
   }

   @Override
   protected double gf() {
      return 2.0;
   }

   @Override
   protected void gI() {
      if (!this.gU() && this.o_()) {
         super.gI();
      }
   }

   @Override
   public boolean gJ() {
      return false;
   }

   @Override
   public void a(bog $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ens cJ() {
      return new ens(0.0, 0.75 * (double)this.cI(), (double)this.dg() * 0.5);
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? ca : super.e($$0);
   }

   @Override
   protected ens a(bno $$0, bnr $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends bwu<caw> {
      public a(cby $$0) {
         super($$0, caw.class, 16, false, true, $$0x -> !((caw)$$0x).u());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bnj.a {
      public final cby.d a;

      b(cby.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends bwt {
      public c(cby $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cby $$0 && $$0.cb) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements axc {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cby.d> e = axc.a(cby.d::values);
      private static final IntFunction<cby.d> f = auz.a(cby.d::a, values(), auz.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cby.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
