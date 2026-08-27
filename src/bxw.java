import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxw extends bxs implements blh<bxw.d>, cap {
   private static final int bU = 5;
   private static final cnk bW = cnk.a(ckm.oI, cuc.ij.k());
   private static final afc<Integer> bX = aff.a(bxw.class, afe.b);
   private static final afc<Integer> bY = aff.a(bxw.class, afe.b);
   private static final afc<Integer> bZ = aff.a(bxw.class, afe.b);
   boolean ca;
   @Nullable
   private bxw cb;
   @Nullable
   private bxw cc;

   public bxw(bjx<? extends bxw> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public boolean gn() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ate $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int go() {
      return this.an.b(bX);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq().g);
      $$0.a("Strength", this.go());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new rt()));
      }
   }

   @Override
   public void a(rt $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(bxw.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, ckj.a($$0.p("DecorItem")));
      }

      this.gB();
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqy(this));
      this.bO.a(1, new bsi(this, 1.2));
      this.bO.a(2, new brl(this, 2.1F));
      this.bO.a(3, new bsd(this, 1.25, 40, 20.0F));
      this.bO.a(3, new brx(this, 1.2));
      this.bO.a(4, new bqq(this, 1.0));
      this.bO.a(5, new bsm(this, 1.25, cnk.a(ckm.hh), false));
      this.bO.a(6, new brd(this, 1.0));
      this.bO.a(7, new bsr(this, 0.7));
      this.bO.a(8, new brm(this, ccx.class, 6.0F));
      this.bO.a(9, new brz(this));
      this.bP.a(1, new bxw.c(this));
      this.bP.a(2, new bxw.a(this));
   }

   public static blo.a gp() {
      return s().a(blp.g, 40.0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public bxw.d gq() {
      return bxw.d.a(this.an.b(bZ));
   }

   public void a(bxw.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int aa_() {
      return this.t() ? 2 + 3 * this.gm() : super.aa_();
   }

   @Override
   public boolean m(ckj $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(ccx $$0, ckj $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(ckm.oI)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(cuc.ij.k())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gt() && this.h() == 0 && this.gf()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.eu() < this.eL() && $$4 > 0.0F) {
         this.b($$4);
         $$5 = true;
      }

      if (this.n_() && $$2 > 0) {
         this.dL().a(js.K, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dL().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gt()) && this.gz() < this.gF()) {
         $$5 = true;
         if (!this.dL().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aS()) {
         aqc $$6 = this.gl();
         if ($$6 != null) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), this.gl(), this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean eX() {
      return this.ev() || this.gw();
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      ate $$5 = $$0.E_();
      this.b($$5);
      bxw.d $$6;
      if ($$3 instanceof bxw.b) {
         $$6 = ((bxw.b)$$3).a;
      } else {
         $$6 = ac.a(bxw.d.values(), $$5);
         $$3 = new bxw.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gk() {
      return false;
   }

   @Override
   protected aqc gD() {
      return aqd.mz;
   }

   @Override
   protected aqc w() {
      return aqd.my;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.mD;
   }

   @Override
   protected aqc m_() {
      return aqd.mB;
   }

   @Nullable
   @Override
   protected aqc gl() {
      return aqd.mC;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.mF, 0.15F, 1.0F);
   }

   @Override
   protected void ge() {
      this.a(aqd.mA, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gm() {
      return this.go();
   }

   @Override
   public boolean gN() {
      return true;
   }

   @Override
   public boolean gO() {
      return !this.cp.a(1).b();
   }

   @Override
   public boolean l(ckj $$0) {
      return $$0.a(ara.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bhu $$0) {
      cix $$1 = this.gr();
      super.a($$0);
      cix $$2 = this.gr();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(aqd.mG, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gB() {
      if (!this.dL().B) {
         super.gB();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable cix $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static cix n(ckj $$0) {
      cua $$1 = cua.a($$0.d());
      return $$1 instanceof ddl ? ((ddl)$$1).b() : null;
   }

   @Nullable
   public cix gr() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : cix.a($$0);
   }

   @Override
   public int gF() {
      return 30;
   }

   @Override
   public boolean a(bvu $$0) {
      return $$0 != this && $$0 instanceof bxw && this.gM() && ((bxw)$$0).gM();
   }

   @Nullable
   public bxw b(alq $$0, bjo $$1) {
      bxw $$2 = this.gs();
      if ($$2 != null) {
         this.a($$1, $$2);
         bxw $$3 = (bxw)$$1;
         int $$4 = this.ag.a(Math.max(this.go(), $$3.go())) + 1;
         if (this.ag.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ag.h() ? this.gq() : $$3.gq());
      }

      return $$2;
   }

   @Nullable
   protected bxw gs() {
      return bjx.aj.a(this.dL());
   }

   private void k(bkj $$0) {
      cdo $$1 = new cdo(this.dL(), this);
      double $$2 = $$0.dq() - this.dq();
      double $$3 = $$0.e(0.3333333333333333) - $$1.ds();
      double $$4 = $$0.dw() - this.dw();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aS()) {
         this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.mE, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dL().b($$1);
      this.ca = true;
   }

   void D(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bir $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bO()) {
               for (bjt $$4 : this.cT()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eH();
         return true;
      }
   }

   public void gQ() {
      if (this.cb != null) {
         this.cb.cc = null;
      }

      this.cb = null;
   }

   public void a(bxw $$0) {
      this.cb = $$0;
      this.cb.cc = this;
   }

   public boolean gR() {
      return this.cc != null;
   }

   public boolean gS() {
      return this.cb != null;
   }

   @Nullable
   public bxw gT() {
      return this.cb;
   }

   @Override
   protected double gd() {
      return 2.0;
   }

   @Override
   protected void gG() {
      if (!this.gS() && this.n_()) {
         super.gG();
      }
   }

   @Override
   public boolean gH() {
      return false;
   }

   @Override
   public void a(bkj $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public eif cI() {
      return new eif(0.0, 0.75 * (double)this.cH(), (double)this.df() * 0.5);
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.n_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends bsx<bwx> {
      public a(bxw $$0) {
         super($$0, bwx.class, 16, false, true, $$0x -> !((bwx)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bjo.a {
      public final bxw.d a;

      b(bxw.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends bsw {
      public c(bxw $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof bxw $$0 && $$0.ca) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements atr {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<bxw.d> e = atr.a(bxw.d::values);
      private static final IntFunction<bxw.d> f = arr.a(bxw.d::a, values(), arr.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bxw.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
