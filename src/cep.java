import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cep extends cel implements brs<cep.d>, chk {
   private static final int bY = 5;
   private static final cvp ca = cvp.a(crv.pv, dcj.ij.p());
   private static final aja<Integer> cb = aje.a(cep.class, ajc.b);
   private static final aja<Integer> cc = aje.a(cep.class, ajc.b);
   private static final bqd cd = bqg.am.n().a(bqc.a().a(bqb.a, 0.0F, bqg.am.l() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private cep cf;
   @Nullable
   private cep cg;

   public cep(bqg<? extends cep> $$0, czg $$1) {
      super($$0, $$1);
   }

   public boolean gw() {
      return false;
   }

   private void x(int $$0) {
      this.an.a(cb, Math.max(1, Math.min(5, $$0)));
   }

   private void b(axt $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gx() {
      return this.an.a(cb);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz().g);
      $$0.a("Strength", this.gx());
   }

   @Override
   public void a(to $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(cep.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxk(this));
      this.bR.a(1, new byu(this, 1.2));
      this.bR.a(2, new bxx(this, 2.1F));
      this.bR.a(3, new byp(this, 1.25, 40, 20.0F));
      this.bR.a(3, new byj(this, 1.2));
      this.bR.a(4, new bxc(this, 1.0));
      this.bR.a(5, new byy(this, 1.25, cvp.a(crv.hC), false));
      this.bR.a(6, new bxp(this, 1.0));
      this.bR.a(7, new bzd(this, 0.7));
      this.bR.a(8, new bxy(this, cka.class, 6.0F));
      this.bR.a(9, new byl(this));
      this.bS.a(1, new cep.c(this));
      this.bS.a(2, new cep.a(this));
   }

   public static brz.a gy() {
      return r().a(bsa.k, 40.0);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cc, 0);
   }

   public cep.d gz() {
      return cep.d.a(this.an.a(cc));
   }

   public void a(cep.d $$0) {
      this.an.a(cc, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.u() ? 1 + 3 * this.gv() : super.ab_();
   }

   @Override
   public boolean o(crs $$0) {
      return ca.a($$0);
   }

   @Override
   protected boolean a(cka $$0, crs $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(crv.pv)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dcj.ij.p())) {
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

      if (this.p_() && $$2 > 0) {
         this.dM().a(kn.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
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
         aun $$6 = this.gu();
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
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      axt $$4 = $$0.E_();
      this.b($$4);
      cep.d $$5;
      if ($$3 instanceof cep.b) {
         $$5 = ((cep.b)$$3).a;
      } else {
         $$5 = ac.a(cep.d.values(), $$4);
         $$3 = new cep.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   protected aun gL() {
      return auo.nK;
   }

   @Override
   protected aun v() {
      return auo.nJ;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.nO;
   }

   @Override
   protected aun o_() {
      return auo.nM;
   }

   @Nullable
   @Override
   protected aun gu() {
      return auo.nN;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.nQ, 0.15F, 1.0F);
   }

   @Override
   protected void gn() {
      this.a(auo.nL, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
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
   public boolean l(crs $$0) {
      return $$0.a(avm.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public void a(bny $$0) {
      cql $$1 = this.gA();
      super.a($$0);
      cql $$2 = this.gA();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(auo.nR, 0.5F, 1.0F);
      }
   }

   @Nullable
   private static cql n(crs $$0) {
      dch $$1 = dch.a($$0.f());
      return $$1 instanceof dmb ? ((dmb)$$1).b() : null;
   }

   @Nullable
   public cql gA() {
      return n(this.d(bqh.g));
   }

   @Override
   public int gN() {
      return 30;
   }

   @Override
   public boolean a(cci $$0) {
      return $$0 != this && $$0 instanceof cep && this.gU() && ((cep)$$0).gU();
   }

   @Nullable
   public cep b(apu $$0, bpu $$1) {
      cep $$2 = this.gB();
      if ($$2 != null) {
         this.a($$1, $$2);
         cep $$3 = (cep)$$1;
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
   protected cep gB() {
      return bqg.am.a(this.dM());
   }

   private void k(bqt $$0) {
      ckr $$1 = new ckr(this.dM(), this);
      double $$2 = $$0.dr() - this.dr();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dt();
      double $$4 = $$0.dx() - this.dx();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.nP, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dM().b($$1);
      this.ce = true;
   }

   void D(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, boy $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bP()) {
               for (bqa $$4 : this.cT()) {
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

   public void a(cep $$0) {
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
   public cep ha() {
      return this.cf;
   }

   @Override
   protected double gm() {
      return 2.0;
   }

   @Override
   protected void gO() {
      if (!this.gZ() && this.p_()) {
         super.gO();
      }
   }

   @Override
   public boolean gP() {
      return false;
   }

   @Override
   public void a(bqt $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public esj cJ() {
      return new esj(0.0, 0.75 * (double)this.cI(), (double)this.dg() * 0.5);
   }

   @Override
   public bqd e(bre $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   protected esj a(bqa $$0, bqd $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends bzj<cdl> {
      public a(cep $$0) {
         super($$0, cdl.class, 16, false, true, $$0x -> !((cdl)$$0x).r());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bpu.a {
      public final cep.d a;

      b(cep.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends bzi {
      public c(cep $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cep $$0 && $$0.ce) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements ayg {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cep.d> e = ayg.a(cep.d::values);
      private static final IntFunction<cep.d> f = awd.a(cep.d::a, values(), awd.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cep.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
