import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckj extends cis implements ciu {
   public static final int bF = 200;
   private static final int bQ = 10;
   protected static final ImmutableList<? extends chl<? extends chk<? super ckj>>> bG = ImmutableList.of(chl.c, chl.o, chl.f, chl.p, chl.q);
   protected static final ImmutableList<? extends cge<?>> bH = ImmutableList.of(
      cge.s, cge.g, cge.h, cge.k, cge.l, cge.o, cge.n, cge.F, cge.u, cge.p, cge.q, cge.L, new cge[]{cge.z, cge.O, cge.C, cge.P, cge.Q, cge.S, cge.V, cge.aa}
   );
   private static final akj<Integer> bR = akn.a(ckj.class, akl.b);
   private static final akj<Boolean> bS = akn.a(ckj.class, akl.k);
   private static final akj<Boolean> bT = akn.a(ckj.class, akl.k);
   public static final double bJ = 20.0;
   public static final int bK = 1200;
   private static final int bU = 6000;
   public static final String bL = "Variant";
   private static final int bV = 1800;
   private static final int bW = 2400;
   public final axz bM = new axz(10, azm::m);
   public final axz bN = new axz(10, azm::m);
   public final axz bO = new axz(10, azm::m);
   public final axz bP = new axz(10, azm::m);
   private static final int bX = 100;

   public ckj(bwm<? extends ckj> $$0, div $$1) {
      super($$0, $$1);
      this.a(ewx.j, 0.0F);
      this.bz = new ckj.d(this);
      this.by = new ckj.c(this, 20);
   }

   @Override
   public float a(iu $$0, diy $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bR, 0);
      $$0.a(bS, false);
      $$0.a(bT, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", this.t().a());
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(ckj.e.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void T() {
      if (!this.x()) {
         super.T();
      }
   }

   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      boolean $$4 = false;
      if ($$2 == bwl.l) {
         return $$3;
      } else {
         azv $$5 = $$0.C_();
         if ($$3 instanceof ckj.b) {
            if (((ckj.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new ckj.b(ckj.e.a($$5), ckj.e.a($$5));
         }

         this.a(((ckj.b)$$3).a($$5));
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
      if (!this.gf() && this.dV() instanceof arq $$1) {
         this.a($$1, $$0);
      }

      if (this.dV().w_()) {
         this.gr();
      }
   }

   private void gr() {
      ckj.a $$0;
      if (this.x()) {
         $$0 = ckj.a.a;
      } else if (this.bj()) {
         $$0 = ckj.a.b;
      } else if (this.aJ()) {
         $$0 = ckj.a.c;
      } else {
         $$0 = ckj.a.d;
      }

      this.bM.a($$0 == ckj.a.a);
      this.bN.a($$0 == ckj.a.b);
      this.bO.a($$0 == ckj.a.c);
      boolean $$4 = this.aT.d() || this.dN() != this.O || this.dL() != this.N;
      this.bP.a($$4);
   }

   protected void a(arq $$0, int $$1) {
      if (this.bK() && !this.bl()) {
         this.j($$1 - 1);
         if (this.ct() == -20) {
            this.j(0);
            this.a($$0, this.dW().t(), 2.0F);
         }
      } else {
         this.j(this.cs());
      }
   }

   @Override
   public void q() {
      int $$0 = this.ct() + 1800;
      this.j(Math.min($$0, this.cs()));
   }

   @Override
   public int cs() {
      return 6000;
   }

   public ckj.e t() {
      return ckj.e.a(this.al.a(bR));
   }

   private void a(ckj.e $$0) {
      this.al.a(bR, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aM ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aM);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aM) {
         this.a(c(kj.aM, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   private static boolean a(azv $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(diy $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   public void x(boolean $$0) {
      this.al.a(bS, $$0);
   }

   public boolean x() {
      return this.al.a(bS);
   }

   @Override
   public boolean m() {
      return this.al.a(bT);
   }

   @Override
   public void w(boolean $$0) {
      this.al.a(bT, $$0);
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      ckj $$2 = bwm.h.a($$0, bwl.e);
      if ($$2 != null) {
         ckj.e $$3;
         if (a(this.ae)) {
            $$3 = ckj.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.t() : ((ckj)$$1).t();
         }

         $$2.a($$3);
         $$2.fY();
      }

      return $$2;
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.aC);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void a(arq $$0) {
      bqm $$1 = bql.a();
      $$1.a("axolotlBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      ckk.a(this);
      $$1.c();
      if (!this.gf()) {
         Optional<Integer> $$2 = this.eb().c(cge.O);
         this.x($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static byh.a gq() {
      return cis.gv().a(byi.s, 14.0).a(byi.v, 1.0).a(byi.c, 2.0).a(byi.B, 1.0);
   }

   @Override
   protected cgm b(div $$0) {
      return new cgj(this, $$0);
   }

   @Override
   public void gj() {
      this.a(awn.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      float $$3 = this.eF();
      if (!this.gf()
         && this.dV().A.a(3) == 0
         && ((float)this.dV().A.a(3) < $$2 || $$3 / this.eT() < 0.5F)
         && $$2 < $$3
         && this.bj()
         && ($$1.d() != null || $$1.c() != null)
         && !this.x()) {
         this.bs.a(cge.O, 200);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int ac() {
      return 1;
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      return ciu.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(cyy $$0) {
      ciu.a(this, $$0);
      $$0.a(kj.aM, this);
      dbg.a(kj.Z, $$0, $$0x -> {
         $$0x.a("Age", this.g());
         byc<?> $$1 = this.eb();
         if ($$1.a(cge.V)) {
            $$0x.a("HuntingCooldown", $$1.e(cge.V));
         }
      });
   }

   @Override
   public void h(tz $$0) {
      ciu.a(this, $$0);
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.eb().a(cge.V, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cyy R_() {
      return new cyy(czc.rw);
   }

   @Override
   public awm n() {
      return awn.dk;
   }

   @Override
   public boolean ey() {
      return !this.x() && super.ey();
   }

   public static void a(arq $$0, ckj $$1, bxc $$2) {
      if ($$2.eG()) {
         bus $$3 = $$2.eH();
         if ($$3 != null) {
            bwd $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == bwm.bS) {
               cqy $$5 = (cqy)$$4;
               List<cqy> $$6 = $$0.a(cqy.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(cqy $$0) {
      bvh $$1 = $$0.c(bvj.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bvh(bvj.j, $$3, 0), this);
      }

      $$0.e(bvj.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.m();
   }

   @Override
   protected awm e(bus $$0) {
      return awn.aM;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.aL;
   }

   @Nullable
   @Override
   protected awm u() {
      return this.bj() ? awn.aO : awn.aN;
   }

   @Override
   protected awm aW() {
      return awn.aP;
   }

   @Override
   protected awm aV() {
      return awn.aQ;
   }

   @Override
   protected byc.b<ckj> ec() {
      return byc.a(bH, bG);
   }

   @Override
   protected byc<?> a(Dynamic<?> $$0) {
      return ckk.a(this.ec().a($$0));
   }

   @Override
   public byc<ckj> eb() {
      return (byc<ckj>)super.eb();
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public void a_(fei $$0) {
      if (this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bxg.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cqy $$0, bua $$1, cyy $$2) {
      if ($$2.a(czc.rv)) {
         $$0.a($$1, czb.a($$2, $$0, new cyy(czc.rm)));
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
   public bxc f() {
      return this.Q();
   }

   public static boolean a(bwm<? extends bxc> $$0, djm $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cb);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bvt.a {
      public final ckj.e[] a;

      public b(ckj.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public ckj.e a(azv $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cdc {
      public c(final ckj $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!ckj.this.x()) {
            super.a();
         }
      }
   }

   static class d extends cdd {
      private final ckj l;

      public d(ckj $$0) {
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

   public static enum e implements bak {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<ckj.e> h = ayc.a(ckj.e::a, values(), ayc.a.a);
      public static final yw<ByteBuf, ckj.e> f = yu.a(h, ckj.e::a);
      public static final Codec<ckj.e> g = bak.a(ckj.e::values);
      private final int i;
      private final String j;
      private final boolean k;

      private e(final int $$0, final String $$1, final boolean $$2) {
         this.i = $$0;
         this.j = $$1;
         this.k = $$2;
      }

      public int a() {
         return this.i;
      }

      public String b() {
         return this.j;
      }

      @Override
      public String c() {
         return this.j;
      }

      public static ckj.e a(int $$0) {
         return h.apply($$0);
      }

      public static ckj.e a(azv $$0) {
         return a($$0, true);
      }

      public static ckj.e b(azv $$0) {
         return a($$0, false);
      }

      private static ckj.e a(azv $$0, boolean $$1) {
         ckj.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.k == $$1).toArray(ckj.e[]::new);
         return af.a($$2, $$0);
      }
   }
}
