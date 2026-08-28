import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class clk extends cjv implements cjx {
   public static final int bI = 200;
   private static final int bT = 10;
   protected static final ImmutableList<? extends cio<? extends cin<? super clk>>> bJ = ImmutableList.of(cio.c, cio.o, cio.f, cio.p, cio.q);
   protected static final ImmutableList<? extends chh<?>> bK = ImmutableList.of(
      chh.s, chh.g, chh.h, chh.k, chh.l, chh.o, chh.n, chh.F, chh.u, chh.p, chh.q, chh.L, new chh[]{chh.z, chh.O, chh.C, chh.P, chh.Q, chh.S, chh.V, chh.aa}
   );
   private static final aku<Integer> bU = aky.a(clk.class, akw.b);
   private static final aku<Boolean> bV = aky.a(clk.class, akw.k);
   private static final aku<Boolean> bW = aky.a(clk.class, akw.k);
   public static final double bM = 20.0;
   public static final int bN = 1200;
   private static final int bX = 6000;
   public static final String bO = "Variant";
   private static final int bY = 1800;
   private static final int bZ = 2400;
   private static final boolean ca = false;
   public final ayl bP = new ayl(10, azz::m);
   public final ayl bQ = new ayl(10, azz::m);
   public final ayl bR = new ayl(10, azz::m);
   public final ayl bS = new ayl(10, azz::m);
   private static final int cb = 100;

   public clk(bxn<? extends clk> $$0, dkj $$1) {
      super($$0, $$1);
      this.a(eyr.j, 0.0F);
      this.bC = new clk.d(this);
      this.bB = new clk.c(this, 20);
   }

   @Override
   public float a(iw $$0, dkm $$1) {
      return 0.0F;
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bU, 0);
      $$0.a(bV, false);
      $$0.a(bW, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", clk.e.i, this.t());
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<clk.e>a("Variant", clk.e.i).orElse(clk.e.f));
      this.w($$0.b("FromBucket", false));
   }

   @Override
   public void T() {
      if (!this.x()) {
         super.T();
      }
   }

   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      boolean $$4 = false;
      if ($$2 == bxm.l) {
         return $$3;
      } else {
         bai $$5 = $$0.G_();
         if ($$3 instanceof clk.b) {
            if (((clk.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new clk.b(clk.e.a($$5), clk.e.a($$5));
         }

         this.a(((clk.b)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void aw() {
      int $$0 = this.cs();
      super.aw();
      if (!this.gj() && this.dV() instanceof asb $$1) {
         this.a($$1, $$0);
      }

      if (this.dV().A_()) {
         this.gv();
      }
   }

   private void gv() {
      clk.a $$0;
      if (this.x()) {
         $$0 = clk.a.a;
      } else if (this.bi()) {
         $$0 = clk.a.b;
      } else if (this.aH()) {
         $$0 = clk.a.c;
      } else {
         $$0 = clk.a.d;
      }

      this.bP.a($$0 == clk.a.a);
      this.bQ.a($$0 == clk.a.b);
      this.bR.a($$0 == clk.a.c);
      boolean $$4 = this.aT.d() || this.dN() != this.O || this.dL() != this.N;
      this.bS.a($$4);
   }

   protected void a(asb $$0, int $$1) {
      if (this.bJ() && !this.bk()) {
         this.j($$1 - 1);
         if (this.cs() == -20) {
            this.j(0);
            this.a($$0, this.dW().t(), 2.0F);
         }
      } else {
         this.j(this.cr());
      }
   }

   @Override
   public void q() {
      int $$0 = this.cs() + 1800;
      this.j(Math.min($$0, this.cr()));
   }

   @Override
   public int cr() {
      return 6000;
   }

   public clk.e t() {
      return clk.e.a(this.al.a(bU));
   }

   private void a(clk.e $$0) {
      this.al.a(bU, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aO ? c((kk<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aO);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aO) {
         this.a(c(kl.aO, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   private static boolean a(bai $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dkm $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   public void x(boolean $$0) {
      this.al.a(bV, $$0);
   }

   public boolean x() {
      return this.al.a(bV);
   }

   @Override
   public boolean m() {
      return this.al.a(bW);
   }

   @Override
   public void w(boolean $$0) {
      this.al.a(bW, $$0);
   }

   @Nullable
   @Override
   public bwu a(asb $$0, bwu $$1) {
      clk $$2 = bxn.i.a($$0, bxm.e);
      if ($$2 != null) {
         clk.e $$3;
         if (a(this.ae)) {
            $$3 = clk.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.t() : ((clk)$$1).t();
         }

         $$2.a($$3);
         $$2.gc();
      }

      return $$2;
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.aE);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void a(asb $$0) {
      brm $$1 = brl.a();
      $$1.a("axolotlBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cll.a(this);
      $$1.c();
      if (!this.gj()) {
         Optional<Integer> $$2 = this.ec().c(chh.O);
         this.x($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static bzk.a gu() {
      return cjv.gz().a(bzl.s, 14.0).a(bzl.v, 1.0).a(bzl.c, 2.0).a(bzl.B, 1.0);
   }

   @Override
   protected chp b(dkj $$0) {
      return new chm(this, $$0);
   }

   @Override
   public void gn() {
      this.a(awy.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      float $$3 = this.eG();
      if (!this.gj()
         && this.dV().A.a(3) == 0
         && ((float)this.dV().A.a(3) < $$2 || $$3 / this.eU() < 0.5F)
         && $$2 < $$3
         && this.bi()
         && ($$1.d() != null || $$1.c() != null)
         && !this.x()) {
         this.bs.a(chh.O, 200);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   public int af() {
      return 1;
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      return cjx.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(dak $$0) {
      cjx.a(this, $$0);
      $$0.a(kl.aO, this);
      dcs.a(kl.Z, $$0, $$0x -> {
         $$0x.a("Age", this.g());
         bzf<?> $$1 = this.ec();
         if ($$1.a(chh.V)) {
            $$0x.a("HuntingCooldown", $$1.e(chh.V));
         }
      });
   }

   @Override
   public void d(ua $$0) {
      cjx.a(this, $$0);
      this.c_($$0.b("Age", 0));
      $$0.f("HuntingCooldown").ifPresentOrElse($$1 -> this.ec().a(chh.V, true, $$0.b("HuntingCooldown", 0L)), () -> this.ec().a(chh.V, Optional.empty()));
   }

   @Override
   public dak X_() {
      return new dak(dao.rz);
   }

   @Override
   public awx n() {
      return awy.dk;
   }

   @Override
   public boolean ez() {
      return !this.x() && super.ez();
   }

   public static void a(asb $$0, clk $$1, byf $$2) {
      if ($$2.eH()) {
         bvt $$3 = $$2.eI();
         if ($$3 != null) {
            bxe $$4 = $$3.d();
            if ($$4 != null && $$4.an() == bxn.bT) {
               csi $$5 = (csi)$$4;
               List<csi> $$6 = $$0.a(csi.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(csi $$0) {
      bwi $$1 = $$0.c(bwk.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bwi(bwk.j, $$3, 0), this);
      }

      $$0.e(bwk.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.m();
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.aM;
   }

   @Nullable
   @Override
   protected awx l_() {
      return awy.aL;
   }

   @Nullable
   @Override
   protected awx u() {
      return this.bi() ? awy.aO : awy.aN;
   }

   @Override
   protected awx aV() {
      return awy.aP;
   }

   @Override
   protected awx aU() {
      return awy.aQ;
   }

   @Override
   protected bzf.b<clk> ed() {
      return bzf.a(bK, bJ);
   }

   @Override
   protected bzf<?> a(Dynamic<?> $$0) {
      return cll.a(this.ed().a($$0));
   }

   @Override
   public bzf<clk> ec() {
      return (bzf<clk>)super.ec();
   }

   @Override
   protected void ac() {
      super.ac();
      agx.a(this);
   }

   @Override
   public void a_(fgc $$0) {
      if (this.bi()) {
         this.a(this.fo(), $$0);
         this.a(byj.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(csi $$0, bvb $$1, dak $$2) {
      if ($$2.a(dao.ry)) {
         $$0.a($$1, dan.a($$2, $$0, new dak(dao.rp)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.m() && !this.h_();
   }

   @Nullable
   @Override
   public byf f() {
      return this.Q();
   }

   public static boolean a(bxn<? extends byf> $$0, dla $$1, bxm $$2, iw $$3, bai $$4) {
      return $$1.a_($$3.e()).a(axn.cc);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bwu.a {
      public final clk.e[] a;

      public b(clk.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public clk.e a(bai $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cef {
      public c(final clk $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!clk.this.x()) {
            super.a();
         }
      }
   }

   static class d extends ceg {
      private final clk l;

      public d(clk $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.x()) {
            super.a();
         }
      }
   }

   public static enum e implements bax {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      public static final clk.e f = a;
      private static final IntFunction<clk.e> j = ayo.a(clk.e::a, values(), ayo.a.a);
      public static final ze<ByteBuf, clk.e> g = zc.a(j, clk.e::a);
      public static final Codec<clk.e> h = bax.a(clk.e::values);
      @Deprecated
      public static final Codec<clk.e> i = Codec.INT.xmap(j::apply, clk.e::a);
      private final int k;
      private final String l;
      private final boolean m;

      private e(final int $$0, final String $$1, final boolean $$2) {
         this.k = $$0;
         this.l = $$1;
         this.m = $$2;
      }

      public int a() {
         return this.k;
      }

      public String b() {
         return this.l;
      }

      @Override
      public String c() {
         return this.l;
      }

      public static clk.e a(int $$0) {
         return j.apply($$0);
      }

      public static clk.e a(bai $$0) {
         return a($$0, true);
      }

      public static clk.e b(bai $$0) {
         return a($$0, false);
      }

      private static clk.e a(bai $$0, boolean $$1) {
         clk.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.m == $$1).toArray(clk.e[]::new);
         return ag.a($$2, $$0);
      }
   }
}
