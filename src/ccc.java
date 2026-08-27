import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ccc extends cby implements bph<ccc.d>, cev {
   private static final int bU = 5;
   private static final csc bW = csc.a(cpg.pv, cyu.ij.j());
   private static final aie<Integer> bX = aih.a(ccc.class, aig.b);
   private static final aie<Integer> bY = aih.a(ccc.class, aig.b);
   private static final aie<Integer> bZ = aih.a(ccc.class, aig.b);
   private static final bnt ca = bnw.al.n().a(bns.a().a(bnr.a, 0.0F, bnw.al.l() - 0.8125F, -0.3F)).a(0.5F);
   boolean cb;
   @Nullable
   private ccc cc;
   @Nullable
   private ccc cd;

   public ccc(bnw<? extends ccc> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public boolean gp() {
      return false;
   }

   private void x(int $$0) {
      this.am.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(awp $$0) {
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
      this.a(ccc.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, cpd.a($$0.p("DecorItem")));
      }

      this.gD();
   }

   @Override
   protected void B() {
      this.bO.a(0, new buz(this));
      this.bO.a(1, new bwj(this, 1.2));
      this.bO.a(2, new bvm(this, 2.1F));
      this.bO.a(3, new bwe(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bvy(this, 1.2));
      this.bO.a(4, new bur(this, 1.0));
      this.bO.a(5, new bwn(this, 1.25, csc.a(cpg.hC), false));
      this.bO.a(6, new bve(this, 1.0));
      this.bO.a(7, new bws(this, 0.7));
      this.bO.a(8, new bvn(this, chl.class, 6.0F));
      this.bO.a(9, new bwa(this));
      this.bP.a(1, new ccc.c(this));
      this.bP.a(2, new ccc.a(this));
   }

   public static bpo.a gr() {
      return u().a(bpp.i, 40.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bX, 0);
      this.am.a(bY, -1);
      this.am.a(bZ, 0);
   }

   public ccc.d gs() {
      return ccc.d.a(this.am.b(bZ));
   }

   public void a(ccc.d $$0) {
      this.am.b(bZ, $$0.g);
   }

   @Override
   protected int ac_() {
      return this.w() ? 2 + 3 * this.go() : super.ac_();
   }

   @Override
   public boolean m(cpd $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(chl $$0, cpd $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cpg.pv)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(cyu.ij.j())) {
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
         atk $$6 = this.gn();
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
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      awp $$5 = $$0.F_();
      this.b($$5);
      ccc.d $$6;
      if ($$3 instanceof ccc.b) {
         $$6 = ((ccc.b)$$3).a;
      } else {
         $$6 = ac.a(ccc.d.values(), $$5);
         $$3 = new ccc.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gm() {
      return false;
   }

   @Override
   protected atk gF() {
      return atl.nB;
   }

   @Override
   protected atk y() {
      return atl.nA;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.nF;
   }

   @Override
   protected atk n_() {
      return atl.nD;
   }

   @Nullable
   @Override
   protected atk gn() {
      return atl.nE;
   }

   @Override
   protected void b(hz $$0, dlj $$1) {
      this.a(atl.nH, 0.15F, 1.0F);
   }

   @Override
   protected void gg() {
      this.a(atl.nC, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
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
   public boolean l(cpd $$0) {
      return $$0.a(aui.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(blp $$0) {
      cnr $$1 = this.gt();
      super.a($$0);
      cnr $$2 = this.gt();
      if (this.ag > 20 && $$2 != null && $$2 != $$1) {
         this.a(atl.nI, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gD() {
      if (!this.dM().B) {
         super.gD();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable cnr $$0) {
      this.am.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static cnr n(cpd $$0) {
      cys $$1 = cys.a($$0.d());
      return $$1 instanceof dil ? ((dil)$$1).b() : null;
   }

   @Nullable
   public cnr gt() {
      int $$0 = this.am.b(bY);
      return $$0 == -1 ? null : cnr.a($$0);
   }

   @Override
   public int gH() {
      return 30;
   }

   @Override
   public boolean a(bzx $$0) {
      return $$0 != this && $$0 instanceof ccc && this.gO() && ((ccc)$$0).gO();
   }

   @Nullable
   public ccc b(aow $$0, bnl $$1) {
      ccc $$2 = this.gu();
      if ($$2 != null) {
         this.a($$1, $$2);
         ccc $$3 = (ccc)$$1;
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
   protected ccc gu() {
      return bnw.al.a(this.dM());
   }

   private void k(boi $$0) {
      cic $$1 = new cic(this.dM(), this);
      double $$2 = $$0.dr() - this.dr();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dt();
      double $$4 = $$0.dx() - this.dx();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.nG, this.db(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
      }

      this.dM().b($$1);
      this.cb = true;
   }

   void D(boolean $$0) {
      this.cb = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bmp $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bP()) {
               for (bnq $$4 : this.cT()) {
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

   public void a(ccc $$0) {
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
   public ccc gV() {
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
   public void a(boi $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public enz cJ() {
      return new enz(0.0, 0.75 * (double)this.cI(), (double)this.dg() * 0.5);
   }

   @Override
   public bnt e(bot $$0) {
      return this.o_() ? ca : super.e($$0);
   }

   @Override
   protected enz a(bnq $$0, bnt $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends bwy<cba> {
      public a(ccc $$0) {
         super($$0, cba.class, 16, false, true, $$0x -> !((cba)$$0x).u());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bnl.a {
      public final ccc.d a;

      b(ccc.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends bwx {
      public c(ccc $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof ccc $$0 && $$0.cb) {
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

      public static final Codec<ccc.d> e = axc.a(ccc.d::values);
      private static final IntFunction<ccc.d> f = ava.a(ccc.d::a, values(), ava.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static ccc.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
