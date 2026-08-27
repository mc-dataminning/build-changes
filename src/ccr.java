import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ccr extends ccn implements bpw<ccr.d>, cfk {
   private static final int bW = 5;
   private static final csp bY = csp.a(cpt.pv, czh.ij.l());
   private static final aii<Integer> bZ = ail.a(ccr.class, aik.b);
   private static final aii<Integer> ca = ail.a(ccr.class, aik.b);
   private static final boi cb = bol.al.n().a(boh.a().a(bog.a, 0.0F, bol.al.l() - 0.8125F, -0.3F)).a(0.5F);
   boolean cc;
   @Nullable
   private ccr cd;
   @Nullable
   private ccr ce;

   public ccr(bol<? extends ccr> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public boolean gu() {
      return false;
   }

   private void x(int $$0) {
      this.am.b(bZ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(awt $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gv() {
      return this.am.b(bZ);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Variant", this.gx().g);
      $$0.a("Strength", this.gv());
   }

   @Override
   public void a(sy $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(ccr.d.a($$0.h("Variant")));
   }

   @Override
   protected void B() {
      this.bP.a(0, new bvo(this));
      this.bP.a(1, new bwy(this, 1.2));
      this.bP.a(2, new bwb(this, 2.1F));
      this.bP.a(3, new bwt(this, 1.25, 40, 20.0F));
      this.bP.a(3, new bwn(this, 1.2));
      this.bP.a(4, new bvg(this, 1.0));
      this.bP.a(5, new bxc(this, 1.25, csp.a(cpt.hC), false));
      this.bP.a(6, new bvt(this, 1.0));
      this.bP.a(7, new bxh(this, 0.7));
      this.bP.a(8, new bwc(this, cia.class, 6.0F));
      this.bP.a(9, new bwp(this));
      this.bQ.a(1, new ccr.c(this));
      this.bQ.a(2, new ccr.a(this));
   }

   public static bqd.a gw() {
      return u().a(bqe.i, 40.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bZ, 0);
      this.am.a(ca, 0);
   }

   public ccr.d gx() {
      return ccr.d.a(this.am.b(ca));
   }

   public void a(ccr.d $$0) {
      this.am.b(ca, $$0.g);
   }

   @Override
   protected int ac_() {
      return this.w() ? 1 + 3 * this.gt() : super.ac_();
   }

   @Override
   public boolean o(cpq $$0) {
      return bY.a($$0);
   }

   @Override
   protected boolean a(cia $$0, cpq $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cpt.pv)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(czh.ij.l())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gA() && this.h() == 0 && this.gm()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.eu() < this.eL() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.o_() && $$2 > 0) {
         this.dJ().a(kb.M, this.d(1.0), this.dr() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dJ().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gA()) && this.gG() < this.gM()) {
         $$5 = true;
         if (!this.dJ().B) {
            this.w($$3);
         }
      }

      if ($$5 && !this.aU()) {
         ato $$6 = this.gs();
         if ($$6 != null) {
            this.dJ().a(null, this.do(), this.dq(), this.du(), this.gs(), this.cY(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fa() {
      return this.ev() || this.gD();
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      awt $$4 = $$0.F_();
      this.b($$4);
      ccr.d $$5;
      if ($$3 instanceof ccr.b) {
         $$5 = ((ccr.b)$$3).a;
      } else {
         $$5 = ac.a(ccr.d.values(), $$4);
         $$3 = new ccr.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   protected ato gK() {
      return atp.nB;
   }

   @Override
   protected ato y() {
      return atp.nA;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.nF;
   }

   @Override
   protected ato n_() {
      return atp.nD;
   }

   @Nullable
   @Override
   protected ato gs() {
      return atp.nE;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(atp.nH, 0.15F, 1.0F);
   }

   @Override
   protected void gl() {
      this.a(atp.nC, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gt() {
      return this.gv();
   }

   @Override
   public boolean fO() {
      return true;
   }

   @Override
   public boolean l(cpq $$0) {
      return $$0.a(aum.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bme $$0) {
      cog $$1 = this.gy();
      super.a($$0);
      cog $$2 = this.gy();
      if (this.ag > 20 && $$2 != null && $$2 != $$1) {
         this.a(atp.nI, 0.5F, 1.0F);
      }
   }

   @Nullable
   private static cog n(cpq $$0) {
      czf $$1 = czf.a($$0.d());
      return $$1 instanceof diz ? ((diz)$$1).b() : null;
   }

   @Nullable
   public cog gy() {
      return n(this.c(bom.g));
   }

   @Override
   public int gM() {
      return 30;
   }

   @Override
   public boolean a(cam $$0) {
      return $$0 != this && $$0 instanceof ccr && this.gT() && ((ccr)$$0).gT();
   }

   @Nullable
   public ccr b(apa $$0, boa $$1) {
      ccr $$2 = this.gz();
      if ($$2 != null) {
         this.a($$1, $$2);
         ccr $$3 = (ccr)$$1;
         int $$4 = this.af.a(Math.max(this.gv(), $$3.gv())) + 1;
         if (this.af.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.af.h() ? this.gx() : $$3.gx());
      }

      return $$2;
   }

   @Nullable
   protected ccr gz() {
      return bol.al.a(this.dJ());
   }

   private void k(box $$0) {
      cir $$1 = new cir(this.dJ(), this);
      double $$2 = $$0.do() - this.do();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dq();
      double $$4 = $$0.du() - this.du();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dJ().a(null, this.do(), this.dq(), this.du(), atp.nG, this.cY(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
      }

      this.dJ().b($$1);
      this.cc = true;
   }

   void D(boolean $$0) {
      this.cc = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bne $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bM()) {
               for (bof $$4 : this.cQ()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eH();
         return true;
      }
   }

   public void gW() {
      if (this.cd != null) {
         this.cd.ce = null;
      }

      this.cd = null;
   }

   public void a(ccr $$0) {
      this.cd = $$0;
      this.cd.ce = this;
   }

   public boolean gX() {
      return this.ce != null;
   }

   public boolean gY() {
      return this.cd != null;
   }

   @Nullable
   public ccr gZ() {
      return this.cd;
   }

   @Override
   protected double gk() {
      return 2.0;
   }

   @Override
   protected void gN() {
      if (!this.gY() && this.o_()) {
         super.gN();
      }
   }

   @Override
   public boolean gO() {
      return false;
   }

   @Override
   public void a(box $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public eov cG() {
      return new eov(0.0, 0.75 * (double)this.cF(), (double)this.dd() * 0.5);
   }

   @Override
   public boi e(bpi $$0) {
      return this.o_() ? cb : super.e($$0);
   }

   @Override
   protected eov a(bof $$0, boi $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends bxn<cbp> {
      public a(ccr $$0) {
         super($$0, cbp.class, 16, false, true, $$0x -> !((cbp)$$0x).u());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends boa.a {
      public final ccr.d a;

      b(ccr.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends bxm {
      public c(ccr $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof ccr $$0 && $$0.cc) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements axg {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<ccr.d> e = axg.a(ccr.d::values);
      private static final IntFunction<ccr.d> f = ave.a(ccr.d::a, values(), ave.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static ccr.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
