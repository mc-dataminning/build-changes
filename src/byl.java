import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byl extends byh implements blw<byl.d>, cbe {
   private static final int bU = 5;
   private static final coc bW = coc.a(cle.oI, cuv.ij.k());
   private static final afm<Integer> bX = afp.a(byl.class, afo.b);
   private static final afm<Integer> bY = afp.a(byl.class, afo.b);
   private static final afm<Integer> bZ = afp.a(byl.class, afo.b);
   boolean ca;
   @Nullable
   private byl cb;
   @Nullable
   private byl cc;

   public byl(bkm<? extends byl> $$0, crs $$1) {
      super($$0, $$1);
   }

   public boolean gn() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ato $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int go() {
      return this.an.b(bX);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq().g);
      $$0.a("Strength", this.go());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new rz()));
      }
   }

   @Override
   public void a(rz $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(byl.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, clb.a($$0.p("DecorItem")));
      }

      this.gB();
   }

   @Override
   protected void z() {
      this.bO.a(0, new brn(this));
      this.bO.a(1, new bsx(this, 1.2));
      this.bO.a(2, new bsa(this, 2.1F));
      this.bO.a(3, new bss(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bsm(this, 1.2));
      this.bO.a(4, new brf(this, 1.0));
      this.bO.a(5, new btb(this, 1.25, coc.a(cle.hh), false));
      this.bO.a(6, new brs(this, 1.0));
      this.bO.a(7, new btg(this, 0.7));
      this.bO.a(8, new bsb(this, cdm.class, 6.0F));
      this.bO.a(9, new bso(this));
      this.bP.a(1, new byl.c(this));
      this.bP.a(2, new byl.a(this));
   }

   public static bmd.a gp() {
      return s().a(bme.g, 40.0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public byl.d gq() {
      return byl.d.a(this.an.b(bZ));
   }

   public void a(byl.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int aa_() {
      return this.t() ? 2 + 3 * this.gm() : super.aa_();
   }

   @Override
   public boolean m(clb $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(cdm $$0, clb $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cle.oI)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(cuv.ij.k())) {
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
         aqm $$6 = this.gl();
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
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      ato $$5 = $$0.E_();
      this.b($$5);
      byl.d $$6;
      if ($$3 instanceof byl.b) {
         $$6 = ((byl.b)$$3).a;
      } else {
         $$6 = ac.a(byl.d.values(), $$5);
         $$3 = new byl.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gk() {
      return false;
   }

   @Override
   protected aqm gD() {
      return aqn.mB;
   }

   @Override
   protected aqm w() {
      return aqn.mA;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.mF;
   }

   @Override
   protected aqm m_() {
      return aqn.mD;
   }

   @Nullable
   @Override
   protected aqm gl() {
      return aqn.mE;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.mH, 0.15F, 1.0F);
   }

   @Override
   protected void ge() {
      this.a(aqn.mC, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
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
   public boolean l(clb $$0) {
      return $$0.a(ark.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bij $$0) {
      cjp $$1 = this.gr();
      super.a($$0);
      cjp $$2 = this.gr();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(aqn.mI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gB() {
      if (!this.dL().B) {
         super.gB();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable cjp $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static cjp n(clb $$0) {
      cut $$1 = cut.a($$0.d());
      return $$1 instanceof def ? ((def)$$1).b() : null;
   }

   @Nullable
   public cjp gr() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : cjp.a($$0);
   }

   @Override
   public int gF() {
      return 30;
   }

   @Override
   public boolean a(bwj $$0) {
      return $$0 != this && $$0 instanceof byl && this.gM() && ((byl)$$0).gM();
   }

   @Nullable
   public byl b(ama $$0, bkd $$1) {
      byl $$2 = this.gs();
      if ($$2 != null) {
         this.a($$1, $$2);
         byl $$3 = (byl)$$1;
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
   protected byl gs() {
      return bkm.aj.a(this.dL());
   }

   private void k(bky $$0) {
      ced $$1 = new ced(this.dL(), this);
      double $$2 = $$0.dq() - this.dq();
      double $$3 = $$0.e(0.3333333333333333) - $$1.ds();
      double $$4 = $$0.dw() - this.dw();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aS()) {
         this.dL().a(null, this.dq(), this.ds(), this.dw(), aqn.mG, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dL().b($$1);
      this.ca = true;
   }

   void D(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bjg $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bO()) {
               for (bki $$4 : this.cT()) {
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

   public void a(byl $$0) {
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
   public byl gT() {
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
   public void a(bky $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public eji cI() {
      return new eji(0.0, 0.75 * (double)this.cH(), (double)this.df() * 0.5);
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.n_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends btm<bxm> {
      public a(byl $$0) {
         super($$0, bxm.class, 16, false, true, $$0x -> !((bxm)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bkd.a {
      public final byl.d a;

      b(byl.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends btl {
      public c(byl $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof byl $$0 && $$0.ca) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements aub {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<byl.d> e = aub.a(byl.d::values);
      private static final IntFunction<byl.d> f = asb.a(byl.d::a, values(), asb.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static byl.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
