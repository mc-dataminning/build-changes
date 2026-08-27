import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cdi extends cde implements bqn<cdi.d>, cgc {
   private static final int bY = 5;
   private static final ctk ca = ctk.a(cqn.pv, dac.ij.l());
   private static final aim<Integer> cb = aiq.a(cdi.class, aio.b);
   private static final aim<Integer> cc = aiq.a(cdi.class, aio.b);
   private static final boz cd = bpc.am.n().a(boy.a().a(box.a, 0.0F, bpc.am.l() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private cdi cf;
   @Nullable
   private cdi cg;

   public cdi(bpc<? extends cdi> $$0, cwz $$1) {
      super($$0, $$1);
   }

   public boolean gw() {
      return false;
   }

   private void x(int $$0) {
      this.an.a(cb, Math.max(1, Math.min(5, $$0)));
   }

   private void b(axd $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gx() {
      return this.an.a(cb);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz().g);
      $$0.a("Strength", this.gx());
   }

   @Override
   public void a(ta $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(cdi.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bR.a(0, new bwf(this));
      this.bR.a(1, new bxp(this, 1.2));
      this.bR.a(2, new bws(this, 2.1F));
      this.bR.a(3, new bxk(this, 1.25, 40, 20.0F));
      this.bR.a(3, new bxe(this, 1.2));
      this.bR.a(4, new bvx(this, 1.0));
      this.bR.a(5, new bxt(this, 1.25, ctk.a(cqn.hC), false));
      this.bR.a(6, new bwk(this, 1.0));
      this.bR.a(7, new bxy(this, 0.7));
      this.bR.a(8, new bwt(this, cis.class, 6.0F));
      this.bR.a(9, new bxg(this));
      this.bS.a(1, new cdi.c(this));
      this.bS.a(2, new cdi.a(this));
   }

   public static bqu.a gy() {
      return r().a(bqv.k, 40.0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cc, 0);
   }

   public cdi.d gz() {
      return cdi.d.a(this.an.a(cc));
   }

   public void a(cdi.d $$0) {
      this.an.a(cc, $$0.g);
   }

   @Override
   protected int aa_() {
      return this.s() ? 1 + 3 * this.gv() : super.aa_();
   }

   @Override
   public boolean o(cqk $$0) {
      return ca.a($$0);
   }

   @Override
   protected boolean a(cis $$0, cqk $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cqn.pv)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dac.ij.l())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gC() && this.g() == 0 && this.go()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ex() < this.eO() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.o_() && $$2 > 0) {
         this.dM().a(kc.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dM().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gC()) && this.gI() < this.gN()) {
         $$5 = true;
         if (!this.dM().B) {
            this.w($$3);
         }
      }

      if ($$5 && !this.aU()) {
         atx $$6 = this.gu();
         if ($$6 != null) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), this.gu(), this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fd() {
      return this.ey() || this.gF();
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      axd $$4 = $$0.E_();
      this.b($$4);
      cdi.d $$5;
      if ($$3 instanceof cdi.b) {
         $$5 = ((cdi.b)$$3).a;
      } else {
         $$5 = ac.a(cdi.d.values(), $$4);
         $$3 = new cdi.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   protected atx gL() {
      return aty.nE;
   }

   @Override
   protected atx v() {
      return aty.nD;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.nI;
   }

   @Override
   protected atx n_() {
      return aty.nG;
   }

   @Nullable
   @Override
   protected atx gu() {
      return aty.nH;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.nK, 0.15F, 1.0F);
   }

   @Override
   protected void gn() {
      this.a(aty.nF, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gv() {
      return this.gx();
   }

   @Override
   public boolean fQ() {
      return true;
   }

   @Override
   public boolean l(cqk $$0) {
      return $$0.a(auv.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public void a(bmv $$0) {
      cpb $$1 = this.gA();
      super.a($$0);
      cpb $$2 = this.gA();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(aty.nL, 0.5F, 1.0F);
      }
   }

   @Nullable
   private static cpb n(cqk $$0) {
      daa $$1 = daa.a($$0.d());
      return $$1 instanceof dju ? ((dju)$$1).b() : null;
   }

   @Nullable
   public cpb gA() {
      return n(this.d(bpd.g));
   }

   @Override
   public int gN() {
      return 30;
   }

   @Override
   public boolean a(cbd $$0) {
      return $$0 != this && $$0 instanceof cdi && this.gU() && ((cdi)$$0).gU();
   }

   @Nullable
   public cdi b(apf $$0, bor $$1) {
      cdi $$2 = this.gB();
      if ($$2 != null) {
         this.a($$1, $$2);
         cdi $$3 = (cdi)$$1;
         int $$4 = this.ag.a(Math.max(this.gx(), $$3.gx())) + 1;
         if (this.ag.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.ag.h() ? this.gz() : $$3.gz());
      }

      return $$2;
   }

   @Nullable
   protected cdi gB() {
      return bpc.am.a(this.dM());
   }

   private void k(bpo $$0) {
      cjj $$1 = new cjj(this.dM(), this);
      double $$2 = $$0.dr() - this.dr();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dt();
      double $$4 = $$0.dx() - this.dx();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.nJ, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dM().b($$1);
      this.ce = true;
   }

   void D(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bnv $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bP()) {
               for (bow $$4 : this.cT()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eK();
         return true;
      }
   }

   public void gX() {
      if (this.cf != null) {
         this.cf.cg = null;
      }

      this.cf = null;
   }

   public void a(cdi $$0) {
      this.cf = $$0;
      this.cf.cg = this;
   }

   public boolean gY() {
      return this.cg != null;
   }

   public boolean gZ() {
      return this.cf != null;
   }

   @Nullable
   public cdi ha() {
      return this.cf;
   }

   @Override
   protected double gm() {
      return 2.0;
   }

   @Override
   protected void gO() {
      if (!this.gZ() && this.o_()) {
         super.gO();
      }
   }

   @Override
   public boolean gP() {
      return false;
   }

   @Override
   public void a(bpo $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public epr cJ() {
      return new epr(0.0, 0.75 * (double)this.cI(), (double)this.dg() * 0.5);
   }

   @Override
   public boz e(bpz $$0) {
      return this.o_() ? cd : super.e($$0);
   }

   @Override
   protected epr a(bow $$0, boz $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends bye<ccg> {
      public a(cdi $$0) {
         super($$0, ccg.class, 16, false, true, $$0x -> !((ccg)$$0x).r());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bor.a {
      public final cdi.d a;

      b(cdi.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends byd {
      public c(cdi $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cdi $$0 && $$0.ce) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements axq {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cdi.d> e = axq.a(cdi.d::values);
      private static final IntFunction<cdi.d> f = avn.a(cdi.d::a, values(), avn.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cdi.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
