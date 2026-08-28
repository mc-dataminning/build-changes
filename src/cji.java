import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cji extends chw implements bxf<cji.e>, chy {
   public static final int bZ = 200;
   private static final int ck = 10;
   protected static final ImmutableList<? extends cgq<? extends cgp<? super cji>>> ca = ImmutableList.of(cgq.c, cgq.o, cgq.f, cgq.p, cgq.q);
   protected static final ImmutableList<? extends cfj<?>> cb = ImmutableList.of(
      cfj.r, cfj.g, cfj.h, cfj.k, cfj.l, cfj.n, cfj.m, cfj.E, cfj.t, cfj.o, cfj.p, cfj.K, new cfj[]{cfj.y, cfj.N, cfj.B, cfj.O, cfj.P, cfj.R, cfj.U, cfj.Z}
   );
   private static final alc<Integer> cl = alg.a(cji.class, ale.b);
   private static final alc<Boolean> cm = alg.a(cji.class, ale.k);
   private static final alc<Boolean> cn = alg.a(cji.class, ale.k);
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

   public cji(bvq<? extends cji> $$0, dhh $$1) {
      super($$0, $$1);
      this.a(eun.j, 0.0F);
      this.bQ = new cji.d(this);
      this.bP = new cji.c(this, 20);
   }

   @Override
   public float a(jh $$0, dhk $$1) {
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
      this.a(cji.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gp()) {
         super.R();
      }
   }

   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      boolean $$4 = false;
      if ($$2 == bvp.l) {
         return $$3;
      } else {
         bam $$5 = $$0.H_();
         if ($$3 instanceof cji.b) {
            if (((cji.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cji.b(cji.e.a($$5), cji.e.a($$5));
         }

         this.a(((cji.b)$$3).a($$5));
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
      cji.a $$0;
      if (this.gp()) {
         $$0 = cji.a.a;
      } else if (this.bm()) {
         $$0 = cji.a.b;
      } else if (this.aJ()) {
         $$0 = cji.a.c;
      } else {
         $$0 = cji.a.d;
      }

      this.cg.a($$0 == cji.a.a);
      this.ch.a($$0 == cji.a.b);
      this.ci.a($$0 == cji.a.c);
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

   public cji.e go() {
      return cji.e.a(this.al.a(cl));
   }

   public void a(cji.e $$0) {
      this.al.a(cl, $$0.a());
   }

   private static boolean a(bam $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dhk $$0) {
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
   public bva a(ash $$0, bva $$1) {
      cji $$2 = bvq.h.a($$0, bvp.e);
      if ($$2 != null) {
         cji.e $$3;
         if (a(this.ae)) {
            $$3 = cji.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.go() : ((cji)$$1).go();
         }

         $$2.a($$3);
         $$2.ai();
      }

      return $$2;
   }

   @Override
   public boolean j(cxo $$0) {
      return $$0.a(ayd.aE);
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void a(ash $$0) {
      bps $$1 = bpr.a();
      $$1.a("axolotlBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cjj.a(this);
      $$1.c();
      if (!this.gb()) {
         Optional<Integer> $$2 = this.ec().c(cfj.N);
         this.y($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static bxm.a gq() {
      return chw.gt().a(bxn.s, 14.0).a(bxn.v, 1.0).a(bxn.c, 2.0).a(bxn.B, 1.0);
   }

   @Override
   protected cfr b(dhh $$0) {
      return new cfo(this, $$0);
   }

   @Override
   public void gf() {
      this.a(axf.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(ash $$0, btz $$1, float $$2) {
      float $$3 = this.eE();
      if (!this.gb()
         && this.dW().A.a(3) == 0
         && ((float)this.dW().A.a(3) < $$2 || $$3 / this.eS() < 0.5F)
         && $$2 < $$3
         && this.bj()
         && ($$1.d() != null || $$1.c() != null)
         && !this.gp()) {
         this.bF.a(cfj.N, 200);
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
   public bti b(cpw $$0, bth $$1) {
      return chy.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cxo $$0) {
      chy.a(this, $$0);
      czx.a(ku.X, $$0, $$0x -> {
         $$0x.a("Variant", this.go().a());
         $$0x.a("Age", this.Z_());
         bxh<?> $$1 = this.ec();
         if ($$1.a(cfj.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cfj.U));
         }
      });
   }

   @Override
   public void h(ux $$0) {
      chy.a(this, $$0);
      this.a(cji.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.ec().a(cfj.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cxo X_() {
      return new cxo(cxs.rh);
   }

   @Override
   public axe t() {
      return axf.dk;
   }

   @Override
   public boolean ex() {
      return !this.gp() && super.ex();
   }

   public static void a(ash $$0, cji $$1, bwf $$2) {
      if ($$2.eF()) {
         btz $$3 = $$2.eG();
         if ($$3 != null) {
            bvj $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == bvq.bS) {
               cpw $$5 = (cpw)$$4;
               List<cpw> $$6 = $$0.a(cpw.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(cpw $$0) {
      buo $$1 = $$0.c(buq.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new buo(buq.j, $$3, 0), this);
      }

      $$0.e(buq.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.p();
   }

   @Override
   protected axe e(btz $$0) {
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
   protected bxh.b<cji> ed() {
      return bxh.a(cb, ca);
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return cjj.a(this.ed().a($$0));
   }

   @Override
   public bxh<cji> ec() {
      return (bxh<cji>)super.ec();
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   public void a_(fbx $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bwj.a, this.dz());
         this.h(this.dz().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cpw $$0, bth $$1, cxo $$2) {
      if ($$2.a(cxs.rg)) {
         $$0.a($$1, cxr.a($$2, $$0, new cxo(cxs.qX)));
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
   public bwf O_() {
      return this.O();
   }

   public static boolean a(bvq<? extends bwf> $$0, dhy $$1, bvp $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.ca);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bva.a {
      public final cji.e[] a;

      public b(cji.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cji.e a(bam $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cch {
      public c(final cji $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cji.this.gp()) {
            super.a();
         }
      }
   }

   static class d extends cci {
      private final cji l;

      public d(cji $$0) {
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

      private static final IntFunction<cji.e> g = ayv.a(cji.e::a, values(), ayv.a.a);
      public static final Codec<cji.e> f = bba.a(cji.e::values);
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

      public static cji.e a(int $$0) {
         return g.apply($$0);
      }

      public static cji.e a(bam $$0) {
         return a($$0, true);
      }

      public static cji.e b(bam $$0) {
         return a($$0, false);
      }

      private static cji.e a(bam $$0, boolean $$1) {
         cji.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cji.e[]::new);
         return ae.a($$2, $$0);
      }
   }
}
