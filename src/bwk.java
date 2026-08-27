import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwk extends bwg implements bjv<bwk.d>, bzd {
   private static final int bU = 5;
   private static final clw bW = clw.a(ciz.oI, csl.ij.k());
   private static final adx<Integer> bX = aea.a(bwk.class, adz.b);
   private static final adx<Integer> bY = aea.a(bwk.class, adz.b);
   private static final adx<Integer> bZ = aea.a(bwk.class, adz.b);
   boolean ca;
   @Nullable
   private bwk cb;
   @Nullable
   private bwk cc;

   public bwk(bik<? extends bwk> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public boolean gi() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(art $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gj() {
      return this.an.b(bX);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Variant", this.gl().g);
      $$0.a("Strength", this.gj());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new qs()));
      }
   }

   @Override
   public void a(qs $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(bwk.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, ciw.a($$0.p("DecorItem")));
      }

      this.gw();
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpm(this));
      this.bO.a(1, new bqw(this, 1.2));
      this.bO.a(2, new bpz(this, 2.1F));
      this.bO.a(3, new bqr(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bql(this, 1.2));
      this.bO.a(4, new bpe(this, 1.0));
      this.bO.a(5, new bra(this, 1.25, clw.a(ciz.hh), false));
      this.bO.a(6, new bpr(this, 1.0));
      this.bO.a(7, new brf(this, 0.7));
      this.bO.a(8, new bqa(this, cbl.class, 6.0F));
      this.bO.a(9, new bqn(this));
      this.bP.a(1, new bwk.c(this));
      this.bP.a(2, new bwk.a(this));
   }

   public static bkc.a gk() {
      return p().a(bkd.b, 40.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public bwk.d gl() {
      return bwk.d.a(this.an.b(bZ));
   }

   public void a(bwk.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int V_() {
      return this.q() ? 2 + 3 * this.gh() : super.V_();
   }

   @Override
   public boolean m(ciw $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(cbl $$0, ciw $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(ciz.oI)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(csl.ij.k())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.go() && this.h() == 0 && this.ga()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.et() < this.eK() && $$4 > 0.0F) {
         this.b($$4);
         $$5 = true;
      }

      if (this.i_() && $$2 > 0) {
         this.dK().a(iw.K, this.d(1.0), this.ds() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dK().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.go()) && this.gu() < this.gA()) {
         $$5 = true;
         if (!this.dK().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aS()) {
         aot $$6 = this.gg();
         if ($$6 != null) {
            this.dK().a(null, this.dp(), this.dr(), this.dv(), this.gg(), this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean eW() {
      return this.eu() || this.gr();
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      art $$5 = $$0.y_();
      this.b($$5);
      bwk.d $$6;
      if ($$3 instanceof bwk.b) {
         $$6 = ((bwk.b)$$3).a;
      } else {
         $$6 = ac.a(bwk.d.values(), $$5);
         $$3 = new bwk.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   protected aot gy() {
      return aou.mx;
   }

   @Override
   protected aot r() {
      return aou.mw;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.mB;
   }

   @Override
   protected aot h_() {
      return aou.mz;
   }

   @Nullable
   @Override
   protected aot gg() {
      return aou.mA;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.mD, 0.15F, 1.0F);
   }

   @Override
   protected void fZ() {
      this.a(aou.my, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gh() {
      return this.gj();
   }

   @Override
   public boolean gI() {
      return true;
   }

   @Override
   public boolean gJ() {
      return !this.cp.a(1).b();
   }

   @Override
   public boolean l(ciw $$0) {
      return $$0.a(apr.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bgh $$0) {
      chk $$1 = this.gm();
      super.a($$0);
      chk $$2 = this.gm();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(aou.mE, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gw() {
      if (!this.dK().B) {
         super.gw();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable chk $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static chk n(ciw $$0) {
      csk $$1 = csk.a($$0.d());
      return $$1 instanceof dby ? ((dby)$$1).a() : null;
   }

   @Nullable
   public chk gm() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : chk.a($$0);
   }

   @Override
   public int gA() {
      return 30;
   }

   @Override
   public boolean a(bui $$0) {
      return $$0 != this && $$0 instanceof bwk && this.gH() && ((bwk)$$0).gH();
   }

   @Nullable
   public bwk b(aki $$0, bib $$1) {
      bwk $$2 = this.gn();
      if ($$2 != null) {
         this.a($$1, $$2);
         bwk $$3 = (bwk)$$1;
         int $$4 = this.ag.a(Math.max(this.gj(), $$3.gj())) + 1;
         if (this.ag.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ag.h() ? this.gl() : $$3.gl());
      }

      return $$2;
   }

   @Nullable
   protected bwk gn() {
      return bik.aj.a(this.dK());
   }

   private void m(biw $$0) {
      ccc $$1 = new ccc(this.dK(), this);
      double $$2 = $$0.dp() - this.dp();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dr();
      double $$4 = $$0.dv() - this.dv();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aS()) {
         this.dK().a(null, this.dp(), this.dr(), this.dv(), aou.mC, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dK().b($$1);
      this.ca = true;
   }

   void D(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bhe $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bO()) {
               for (big $$4 : this.cT()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eG();
         return true;
      }
   }

   public void gL() {
      if (this.cb != null) {
         this.cb.cc = null;
      }

      this.cb = null;
   }

   public void a(bwk $$0) {
      this.cb = $$0;
      this.cb.cc = this;
   }

   public boolean gM() {
      return this.cc != null;
   }

   public boolean gN() {
      return this.cb != null;
   }

   @Nullable
   public bwk gO() {
      return this.cb;
   }

   @Override
   protected double fY() {
      return 2.0;
   }

   @Override
   protected void gB() {
      if (!this.gN() && this.i_()) {
         super.gB();
      }
   }

   @Override
   public boolean gC() {
      return false;
   }

   @Override
   public void a(biw $$0, float $$1) {
      this.m($$0);
   }

   @Override
   public ehf cI() {
      return new ehf(0.0, 0.75 * (double)this.cH(), (double)this.df() * 0.5);
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.i_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends brl<bvl> {
      public a(bwk $$0) {
         super($$0, bvl.class, 16, false, true, $$0x -> !((bvl)$$0x).p());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bib.a {
      public final bwk.d a;

      b(bwk.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends brk {
      public c(bwk $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof bwk $$0 && $$0.ca) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements asf {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<bwk.d> e = asf.a(bwk.d::values);
      private static final IntFunction<bwk.d> f = aqi.a(bwk.d::a, values(), aqi.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bwk.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
