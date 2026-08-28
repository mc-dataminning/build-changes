import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjz extends cjv implements bxb<cjz.d>, cmw {
   private static final int bZ = 5;
   private static final alc<Integer> ca = alg.a(cjz.class, ale.b);
   private static final alc<Integer> cb = alg.a(cjz.class, ale.b);
   private static final bvi cd = bvm.ay.n().a(bvh.a().a(bvg.a, 0.0F, bvm.ay.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private cjz cf;
   @Nullable
   private cjz cg;

   public cjz(bvm<? extends cjz> $$0, dha $$1) {
      super($$0, $$1);
      this.L().a(40.0F);
   }

   public boolean gp() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(ca, Math.max(1, Math.min(5, $$0)));
   }

   private void b(bam $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gq() {
      return this.al.a(ca);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz().g);
      $$0.a("Strength", this.gq());
   }

   @Override
   public void a(ux $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(cjz.d.a($$0.h("Variant")));
   }

   @Override
   protected void B() {
      this.bT.a(0, new cct(this));
      this.bT.a(1, new ced(this, 1.2));
      this.bT.a(2, new cdg(this, 2.1F));
      this.bT.a(3, new cdy(this, 1.25, 40, 20.0F));
      this.bT.a(3, new cds(this, 1.2));
      this.bT.a(4, new ccl(this, 1.0));
      this.bT.a(5, new ceh(this, 1.25, $$0 -> $$0.a(ayd.at), false));
      this.bT.a(6, new ccy(this, 1.0));
      this.bT.a(7, new cem(this, 0.7));
      this.bT.a(8, new cdh(this, cps.class, 6.0F));
      this.bT.a(9, new cdu(this));
      this.bU.a(1, new cjz.c(this));
      this.bU.a(2, new cjz.a(this));
   }

   public static bxi.a gy() {
      return p();
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
      $$0.a(cb, 0);
   }

   public cjz.d gz() {
      return cjz.d.a(this.al.a(cb));
   }

   public void a(cjz.d $$0) {
      this.al.a(cb, $$0.g);
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.as);
   }

   @Override
   protected boolean a(cps $$0, cxk $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cxo.pS)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dkg.iA.j())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gD() && this.Z_() == 0 && this.gt()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.eD() < this.eR() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.e_() && $$2 > 0) {
         this.dV().a(ls.O, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dV().C) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gD()) && this.gJ() < this.gP()) {
         $$5 = true;
         if (!this.dV().C) {
            this.u($$3);
         }
      }

      if ($$5 && !this.bb()) {
         axe $$6 = this.go();
         if ($$6 != null) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), this.go(), this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fg() {
      return this.eE() || this.gG();
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      bam $$4 = $$0.H_();
      this.b($$4);
      cjz.d $$5;
      if ($$3 instanceof cjz.b) {
         $$5 = ((cjz.b)$$3).a;
      } else {
         $$5 = ae.a(cjz.d.values(), $$4);
         $$3 = new cjz.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   protected axe gN() {
      return axf.oq;
   }

   @Override
   protected axe u() {
      return axf.op;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.ou;
   }

   @Override
   protected axe o_() {
      return axf.os;
   }

   @Nullable
   @Override
   protected axe go() {
      return axf.ot;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.ow, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(axf.or, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? this.gq() : 0;
   }

   @Override
   public boolean e(bvn $$0) {
      return true;
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public int gP() {
      return 30;
   }

   @Override
   public boolean a(chs $$0) {
      return $$0 != this && $$0 instanceof cjz && this.gV() && ((cjz)$$0).gV();
   }

   @Nullable
   public cjz b(ash $$0, buw $$1) {
      cjz $$2 = this.gA();
      if ($$2 != null) {
         this.a($$1, $$2);
         cjz $$3 = (cjz)$$1;
         int $$4 = this.ae.a(Math.max(this.gq(), $$3.gq())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gz() : $$3.gz());
      }

      return $$2;
   }

   @Nullable
   protected cjz gA() {
      return bvm.ay.a(this.dV(), bvl.e);
   }

   private void k(bwb $$0) {
      cqk $$1 = new cqk(this.dV(), this);
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dC();
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof ash $$6) {
         cql.a($$1, $$6, cxk.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), axf.ov, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.ce = true;
   }

   void E(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, btv $$2) {
      int $$3 = this.f($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.ca()) {
               for (bvf $$4 : this.dd()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eN();
         return true;
      }
   }

   public void gB() {
      if (this.cf != null) {
         this.cf.cg = null;
      }

      this.cf = null;
   }

   public void a(cjz $$0) {
      this.cf = $$0;
      this.cf.cg = this;
   }

   public boolean gC() {
      return this.cg != null;
   }

   public boolean gY() {
      return this.cf != null;
   }

   @Nullable
   public cjz gZ() {
      return this.cf;
   }

   @Override
   protected double gl() {
      return 2.0;
   }

   @Override
   protected void g(ash $$0) {
      if (!this.gY() && this.e_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gQ() {
      return false;
   }

   @Override
   public void a(bwb $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public fbs cT() {
      return new fbs(0.0, 0.75 * (double)this.cS(), (double)this.dq() * 0.5);
   }

   @Override
   public bvi e(bwn $$0) {
      return this.e_() ? cd : super.e($$0);
   }

   @Override
   protected fbs a(bvf $$0, bvi $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends ces<civ> {
      public a(cjz $$0) {
         super($$0, civ.class, 16, false, true, ($$0x, $$1) -> !((civ)$$0x).p());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends buw.a {
      public final cjz.d a;

      b(cjz.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cer {
      public c(cjz $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cjz $$0 && $$0.ce) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements bba {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cjz.d> e = bba.a(cjz.d::values);
      private static final IntFunction<cjz.d> f = ayv.a(cjz.d::a, values(), ayv.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cjz.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
