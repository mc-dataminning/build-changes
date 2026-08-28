import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjj extends chx implements bxg<cjj.e>, chz {
   public static final int bZ = 200;
   private static final int ck = 10;
   protected static final ImmutableList<? extends cgr<? extends cgq<? super cjj>>> ca = ImmutableList.of(cgr.c, cgr.o, cgr.f, cgr.p, cgr.q);
   protected static final ImmutableList<? extends cfk<?>> cb = ImmutableList.of(
      cfk.r, cfk.g, cfk.h, cfk.k, cfk.l, cfk.n, cfk.m, cfk.E, cfk.t, cfk.o, cfk.p, cfk.K, new cfk[]{cfk.y, cfk.N, cfk.B, cfk.O, cfk.P, cfk.R, cfk.U, cfk.Z}
   );
   private static final alc<Integer> cl = alg.a(cjj.class, ale.b);
   private static final alc<Boolean> cm = alg.a(cjj.class, ale.k);
   private static final alc<Boolean> cn = alg.a(cjj.class, ale.k);
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

   public cjj(bvr<? extends cjj> $$0, dhi $$1) {
      super($$0, $$1);
      this.a(euo.j, 0.0F);
      this.bQ = new cjj.d(this);
      this.bP = new cjj.c(this, 20);
   }

   @Override
   public float a(jh $$0, dhl $$1) {
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
      $$0.a("Variant", this.go().a());
      $$0.a("FromBucket", this.p());
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cjj.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gp()) {
         super.R();
      }
   }

   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      boolean $$4 = false;
      if ($$2 == bvq.l) {
         return $$3;
      } else {
         bam $$5 = $$0.H_();
         if ($$3 instanceof cjj.b) {
            if (((cjj.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cjj.b(cjj.e.a($$5), cjj.e.a($$5));
         }

         this.a(((cjj.b)$$3).a($$5));
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
      if (!this.gb()) {
         this.s($$0);
      }

      if (this.dW().B_()) {
         this.gr();
      }
   }

   private void gr() {
      cjj.a $$0;
      if (this.gp()) {
         $$0 = cjj.a.a;
      } else if (this.bm()) {
         $$0 = cjj.a.b;
      } else if (this.aJ()) {
         $$0 = cjj.a.c;
      } else {
         $$0 = cjj.a.d;
      }

      this.cg.a($$0 == cjj.a.a);
      this.ch.a($$0 == cjj.a.b);
      this.ci.a($$0 == cjj.a.c);
      boolean $$4 = this.aT.d() || this.dO() != this.O || this.dM() != this.N;
      this.cj.a($$4);
   }

   protected void s(int $$0) {
      if (this.bL() && !this.bl()) {
         this.j($$0 - 1);
         if (this.ct() == -20) {
            this.j(0);
            this.a(this.dX().t(), 2.0F);
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

   public cjj.e go() {
      return cjj.e.a(this.al.a(cl));
   }

   public void a(cjj.e $$0) {
      this.al.a(cl, $$0.a());
   }

   private static boolean a(bam $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dhl $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   public void y(boolean $$0) {
      this.al.a(cm, $$0);
   }

   public boolean gp() {
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
   public bvb a(ash $$0, bvb $$1) {
      cjj $$2 = bvr.h.a($$0, bvq.e);
      if ($$2 != null) {
         cjj.e $$3;
         if (a(this.ae)) {
            $$3 = cjj.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.go() : ((cjj)$$1).go();
         }

         $$2.a($$3);
         $$2.ai();
      }

      return $$2;
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.aE);
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void a(ash $$0) {
      bpt $$1 = bps.a();
      $$1.a("axolotlBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cjk.a(this);
      $$1.c();
      if (!this.gb()) {
         Optional<Integer> $$2 = this.ec().c(cfk.N);
         this.y($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static bxn.a gq() {
      return chx.gt().a(bxo.s, 14.0).a(bxo.v, 1.0).a(bxo.c, 2.0).a(bxo.B, 1.0);
   }

   @Override
   protected cfs b(dhi $$0) {
      return new cfp(this, $$0);
   }

   @Override
   public void gf() {
      this.a(axf.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      float $$3 = this.eE();
      if (!this.gb()
         && this.dW().A.a(3) == 0
         && ((float)this.dW().A.a(3) < $$2 || $$3 / this.eS() < 0.5F)
         && $$2 < $$3
         && this.bj()
         && ($$1.d() != null || $$1.c() != null)
         && !this.gp()) {
         this.bF.a(cfk.N, 200);
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
   public btj b(cpx $$0, bti $$1) {
      return chz.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cxp $$0) {
      chz.a(this, $$0);
      czy.a(ku.X, $$0, $$0x -> {
         $$0x.a("Variant", this.go().a());
         $$0x.a("Age", this.Z_());
         bxi<?> $$1 = this.ec();
         if ($$1.a(cfk.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cfk.U));
         }
      });
   }

   @Override
   public void h(ux $$0) {
      chz.a(this, $$0);
      this.a(cjj.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.ec().a(cfk.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cxp X_() {
      return new cxp(cxt.rh);
   }

   @Override
   public axe t() {
      return axf.dk;
   }

   @Override
   public boolean ex() {
      return !this.gp() && super.ex();
   }

   public static void a(ash $$0, cjj $$1, bwg $$2) {
      if ($$2.eF()) {
         bua $$3 = $$2.eG();
         if ($$3 != null) {
            bvk $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == bvr.bS) {
               cpx $$5 = (cpx)$$4;
               List<cpx> $$6 = $$0.a(cpx.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(cpx $$0) {
      bup $$1 = $$0.c(bur.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bup(bur.j, $$3, 0), this);
      }

      $$0.e(bur.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.p();
   }

   @Override
   protected axe e(bua $$0) {
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
   protected bxi.b<cjj> ed() {
      return bxi.a(cb, ca);
   }

   @Override
   protected bxi<?> a(Dynamic<?> $$0) {
      return cjk.a(this.ed().a($$0));
   }

   @Override
   public bxi<cjj> ec() {
      return (bxi<cjj>)super.ec();
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   public void a_(fby $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bwk.a, this.dz());
         this.h(this.dz().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cpx $$0, bti $$1, cxp $$2) {
      if ($$2.a(cxt.rg)) {
         $$0.a($$1, cxs.a($$2, $$0, new cxp(cxt.qX)));
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
   public bwg O_() {
      return this.O();
   }

   public static boolean a(bvr<? extends bwg> $$0, dhz $$1, bvq $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.ca);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bvb.a {
      public final cjj.e[] a;

      public b(cjj.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cjj.e a(bam $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cci {
      public c(final cjj $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cjj.this.gp()) {
            super.a();
         }
      }
   }

   static class d extends ccj {
      private final cjj l;

      public d(cjj $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gp()) {
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

      private static final IntFunction<cjj.e> g = ayv.a(cjj.e::a, values(), ayv.a.a);
      public static final Codec<cjj.e> f = bba.a(cjj.e::values);
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

      public static cjj.e a(int $$0) {
         return g.apply($$0);
      }

      public static cjj.e a(bam $$0) {
         return a($$0, true);
      }

      public static cjj.e b(bam $$0) {
         return a($$0, false);
      }

      private static cjj.e a(bam $$0, boolean $$1) {
         cjj.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cjj.e[]::new);
         return ae.a($$2, $$0);
      }
   }
}
