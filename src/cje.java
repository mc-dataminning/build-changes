import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cje extends chs implements bxb<cje.e>, chu {
   public static final int bZ = 200;
   private static final int ck = 10;
   protected static final ImmutableList<? extends cgm<? extends cgl<? super cje>>> ca = ImmutableList.of(cgm.c, cgm.o, cgm.f, cgm.p, cgm.q);
   protected static final ImmutableList<? extends cff<?>> cb = ImmutableList.of(
      cff.r, cff.g, cff.h, cff.k, cff.l, cff.n, cff.m, cff.E, cff.t, cff.o, cff.p, cff.K, new cff[]{cff.y, cff.N, cff.B, cff.O, cff.P, cff.R, cff.U, cff.Z}
   );
   private static final alc<Integer> cl = alg.a(cje.class, ale.b);
   private static final alc<Boolean> cm = alg.a(cje.class, ale.k);
   private static final alc<Boolean> cn = alg.a(cje.class, ale.k);
   public static final double cd = 20.0;
   public static final int ce = 1200;
   private static final int co = 6000;
   public static final String cf = "Variant";
   private static final int cp = 1800;
   private static final int cq = 2400;
   public final ays cg = new ays(10, bae::m);
   public final ays ch = new ays(10, bae::m);
   public final ays ci = new ays(10, bae::m);
   public final ays cj = new ays(10, bae::m);
   private static final int cr = 100;

   public cje(bvm<? extends cje> $$0, dha $$1) {
      super($$0, $$1);
      this.a(eug.j, 0.0F);
      this.bQ = new cje.d(this);
      this.bP = new cje.c(this, 20);
   }

   @Override
   public float a(jh $$0, dhd $$1) {
      return 0.0F;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cl, 0);
      $$0.a(cm, false);
      $$0.a(cn, false);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm().a());
      $$0.a("FromBucket", this.p());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cje.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gn()) {
         super.R();
      }
   }

   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      boolean $$4 = false;
      if ($$2 == bvl.l) {
         return $$3;
      } else {
         bam $$5 = $$0.H_();
         if ($$3 instanceof cje.b) {
            if (((cje.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cje.b(cje.e.a($$5), cje.e.a($$5));
         }

         this.a(((cje.b)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void az() {
      int $$0 = this.ct();
      super.az();
      if (!this.fZ()) {
         this.s($$0);
      }

      if (this.dV().B_()) {
         this.gp();
      }
   }

   private void gp() {
      cje.a $$0;
      if (this.gn()) {
         $$0 = cje.a.a;
      } else if (this.bm()) {
         $$0 = cje.a.b;
      } else if (this.aJ()) {
         $$0 = cje.a.c;
      } else {
         $$0 = cje.a.d;
      }

      this.cg.a($$0 == cje.a.a);
      this.ch.a($$0 == cje.a.b);
      this.ci.a($$0 == cje.a.c);
      boolean $$4 = this.aT.d() || this.dN() != this.O || this.dL() != this.N;
      this.cj.a($$4);
   }

   protected void s(int $$0) {
      if (this.bL() && !this.bl()) {
         this.j($$0 - 1);
         if (this.ct() == -20) {
            this.j(0);
            this.a(this.dW().t(), 2.0F);
         }
      } else {
         this.j(this.cs());
      }
   }

   public void x() {
      int $$0 = this.ct() + 1800;
      this.j(Math.min($$0, this.cs()));
   }

   @Override
   public int cs() {
      return 6000;
   }

   public cje.e gm() {
      return cje.e.a(this.al.a(cl));
   }

   public void a(cje.e $$0) {
      this.al.a(cl, $$0.a());
   }

   private static boolean a(bam $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dhd $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   public void y(boolean $$0) {
      this.al.a(cm, $$0);
   }

   public boolean gn() {
      return this.al.a(cm);
   }

   @Override
   public boolean p() {
      return this.al.a(cn);
   }

   @Override
   public void x(boolean $$0) {
      this.al.a(cn, $$0);
   }

   @Nullable
   @Override
   public buw a(ash $$0, buw $$1) {
      cje $$2 = bvm.h.a($$0, bvl.e);
      if ($$2 != null) {
         cje.e $$3;
         if (a(this.ae)) {
            $$3 = cje.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.gm() : ((cje)$$1).gm();
         }

         $$2.a($$3);
         $$2.ai();
      }

      return $$2;
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.aE);
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("axolotlBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cjf.a(this);
      $$1.c();
      if (!this.fZ()) {
         Optional<Integer> $$2 = this.eb().c(cff.N);
         this.y($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static bxi.a go() {
      return chs.gr().a(bxj.s, 14.0).a(bxj.v, 1.0).a(bxj.c, 2.0).a(bxj.B, 1.0);
   }

   @Override
   protected cfn b(dha $$0) {
      return new cfk(this, $$0);
   }

   @Override
   public void gd() {
      this.a(axf.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      float $$3 = this.eD();
      if (!this.fZ()
         && this.dV().A.a(3) == 0
         && ((float)this.dV().A.a(3) < $$2 || $$3 / this.eR() < 0.5F)
         && $$2 < $$3
         && this.bj()
         && ($$1.d() != null || $$1.c() != null)
         && !this.gn()) {
         this.bF.a(cff.N, 200);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      return chu.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cxk $$0) {
      chu.a(this, $$0);
      czt.a(ku.X, $$0, $$0x -> {
         $$0x.a("Variant", this.gm().a());
         $$0x.a("Age", this.Z_());
         bxd<?> $$1 = this.eb();
         if ($$1.a(cff.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cff.U));
         }
      });
   }

   @Override
   public void h(ux $$0) {
      chu.a(this, $$0);
      this.a(cje.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.eb().a(cff.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cxk X_() {
      return new cxk(cxo.rh);
   }

   @Override
   public axe t() {
      return axf.dj;
   }

   @Override
   public boolean ew() {
      return !this.gn() && super.ew();
   }

   public static void a(ash $$0, cje $$1, bwb $$2) {
      if ($$2.eE()) {
         btv $$3 = $$2.eF();
         if ($$3 != null) {
            bvf $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == bvm.bS) {
               cps $$5 = (cps)$$4;
               List<cps> $$6 = $$0.a(cps.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(cps $$0) {
      buk $$1 = $$0.c(bum.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new buk(bum.j, $$3, 0), this);
      }

      $$0.e(bum.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.p();
   }

   @Override
   protected axe e(btv $$0) {
      return axf.aM;
   }

   @Nullable
   @Override
   protected axe o_() {
      return axf.aL;
   }

   @Nullable
   @Override
   protected axe u() {
      return this.bj() ? axf.aO : axf.aN;
   }

   @Override
   protected axe aW() {
      return axf.aP;
   }

   @Override
   protected axe aV() {
      return axf.aQ;
   }

   @Override
   protected bxd.b<cje> ec() {
      return bxd.a(cb, ca);
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return cjf.a(this.ec().a($$0));
   }

   @Override
   public bxd<cje> eb() {
      return (bxd<cje>)super.eb();
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   public void a_(fbs $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bwf.a, this.dy());
         this.h(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cps $$0, btd $$1, cxk $$2) {
      if ($$2.a(cxo.rg)) {
         $$0.a($$1, cxn.a($$2, $$0, new cxk(cxo.qX)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && !this.l_();
   }

   @Nullable
   @Override
   public bwb O_() {
      return this.O();
   }

   public static boolean a(bvm<? extends bwb> $$0, dhr $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.ca);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends buw.a {
      public final cje.e[] a;

      public b(cje.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cje.e a(bam $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends ccd {
      public c(final cje $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cje.this.gn()) {
            super.a();
         }
      }
   }

   static class d extends cce {
      private final cje l;

      public d(cje $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gn()) {
            super.a();
         }
      }
   }

   public static enum e implements bba {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cje.e> g = ayv.a(cje.e::a, values(), ayv.a.a);
      public static final Codec<cje.e> f = bba.a(cje.e::values);
      private final int h;
      private final String i;
      private final boolean j;

      private e(final int $$0, final String $$1, final boolean $$2) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
      }

      public int a() {
         return this.h;
      }

      public String b() {
         return this.i;
      }

      @Override
      public String c() {
         return this.i;
      }

      public static cje.e a(int $$0) {
         return g.apply($$0);
      }

      public static cje.e a(bam $$0) {
         return a($$0, true);
      }

      public static cje.e b(bam $$0) {
         return a($$0, false);
      }

      private static cje.e a(bam $$0, boolean $$1) {
         cje.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cje.e[]::new);
         return ae.a($$2, $$0);
      }
   }
}
