import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckr extends ciz implements cjb {
   public static final int bG = 200;
   private static final int bR = 10;
   protected static final ImmutableList<? extends chs<? extends chr<? super ckr>>> bH = ImmutableList.of(chs.c, chs.o, chs.f, chs.p, chs.q);
   protected static final ImmutableList<? extends cgl<?>> bI = ImmutableList.of(
      cgl.s, cgl.g, cgl.h, cgl.k, cgl.l, cgl.o, cgl.n, cgl.F, cgl.u, cgl.p, cgl.q, cgl.L, new cgl[]{cgl.z, cgl.O, cgl.C, cgl.P, cgl.Q, cgl.S, cgl.V, cgl.aa}
   );
   private static final akj<Integer> bS = akn.a(ckr.class, akl.b);
   private static final akj<Boolean> bT = akn.a(ckr.class, akl.k);
   private static final akj<Boolean> bU = akn.a(ckr.class, akl.k);
   public static final double bK = 20.0;
   public static final int bL = 1200;
   private static final int bV = 6000;
   public static final String bM = "Variant";
   private static final int bW = 1800;
   private static final int bX = 2400;
   public final axz bN = new axz(10, azm::m);
   public final axz bO = new axz(10, azm::m);
   public final axz bP = new axz(10, azm::m);
   public final axz bQ = new axz(10, azm::m);
   private static final int bY = 100;

   public ckr(bwr<? extends ckr> $$0, djh $$1) {
      super($$0, $$1);
      this.a(exm.j, 0.0F);
      this.bA = new ckr.d(this);
      this.bz = new ckr.c(this, 20);
   }

   @Override
   public float a(iv $$0, djk $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bS, 0);
      $$0.a(bT, false);
      $$0.a(bU, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", ckr.e.h, this.t());
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<ckr.e>a("Variant", ckr.e.h).orElse(ckr.e.a));
      this.w($$0.o("FromBucket"));
   }

   @Override
   public void T() {
      if (!this.x()) {
         super.T();
      }
   }

   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      boolean $$4 = false;
      if ($$2 == bwq.l) {
         return $$3;
      } else {
         azv $$5 = $$0.C_();
         if ($$3 instanceof ckr.b) {
            if (((ckr.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new ckr.b(ckr.e.a($$5), ckr.e.a($$5));
         }

         this.a(((ckr.b)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void aw() {
      int $$0 = this.cr();
      super.aw();
      if (!this.gi() && this.dU() instanceof arq $$1) {
         this.a($$1, $$0);
      }

      if (this.dU().w_()) {
         this.gu();
      }
   }

   private void gu() {
      ckr.a $$0;
      if (this.x()) {
         $$0 = ckr.a.a;
      } else if (this.bh()) {
         $$0 = ckr.a.b;
      } else if (this.aH()) {
         $$0 = ckr.a.c;
      } else {
         $$0 = ckr.a.d;
      }

      this.bN.a($$0 == ckr.a.a);
      this.bO.a($$0 == ckr.a.b);
      this.bP.a($$0 == ckr.a.c);
      boolean $$4 = this.aT.d() || this.dM() != this.O || this.dK() != this.N;
      this.bQ.a($$4);
   }

   protected void a(arq $$0, int $$1) {
      if (this.bI() && !this.bj()) {
         this.j($$1 - 1);
         if (this.cr() == -20) {
            this.j(0);
            this.a($$0, this.dV().t(), 2.0F);
         }
      } else {
         this.j(this.cq());
      }
   }

   @Override
   public void q() {
      int $$0 = this.cr() + 1800;
      this.j(Math.min($$0, this.cq()));
   }

   @Override
   public int cq() {
      return 6000;
   }

   public ckr.e t() {
      return ckr.e.a(this.al.a(bS));
   }

   private void a(ckr.e $$0) {
      this.al.a(bS, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aN ? c((kj<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aN);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aN) {
         this.a(c(kk.aN, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   private static boolean a(azv $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(djk $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cI() {
      return false;
   }

   public void x(boolean $$0) {
      this.al.a(bT, $$0);
   }

   public boolean x() {
      return this.al.a(bT);
   }

   @Override
   public boolean m() {
      return this.al.a(bU);
   }

   @Override
   public void w(boolean $$0) {
      this.al.a(bU, $$0);
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      ckr $$2 = bwr.h.a($$0, bwq.e);
      if ($$2 != null) {
         ckr.e $$3;
         if (a(this.ae)) {
            $$3 = ckr.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.t() : ((ckr)$$1).t();
         }

         $$2.a($$3);
         $$2.gb();
      }

      return $$2;
   }

   @Override
   public boolean i(czk $$0) {
      return $$0.a(axk.aD);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void a(arq $$0) {
      bqq $$1 = bqp.a();
      $$1.a("axolotlBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cks.a(this);
      $$1.c();
      if (!this.gi()) {
         Optional<Integer> $$2 = this.eb().c(cgl.O);
         this.x($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static byo.a gt() {
      return ciz.gy().a(byp.s, 14.0).a(byp.v, 1.0).a(byp.c, 2.0).a(byp.B, 1.0);
   }

   @Override
   protected cgt b(djh $$0) {
      return new cgq(this, $$0);
   }

   @Override
   public void gm() {
      this.a(awn.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      float $$3 = this.eF();
      if (!this.gi()
         && this.dU().A.a(3) == 0
         && ((float)this.dU().A.a(3) < $$2 || $$3 / this.eT() < 0.5F)
         && $$2 < $$3
         && this.bh()
         && ($$1.d() != null || $$1.c() != null)
         && !this.x()) {
         this.bs.a(cgl.O, 200);
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
   public bug b(crj $$0, buf $$1) {
      return cjb.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(czk $$0) {
      cjb.a(this, $$0);
      $$0.a(kk.aN, this);
      dbs.a(kk.Z, $$0, $$0x -> {
         $$0x.a("Age", this.g());
         byj<?> $$1 = this.eb();
         if ($$1.a(cgl.V)) {
            $$0x.a("HuntingCooldown", $$1.e(cgl.V));
         }
      });
   }

   @Override
   public void h(tz $$0) {
      cjb.a(this, $$0);
      if ($$0.c("Age")) {
         this.c_($$0.f("Age"));
      }

      if ($$0.c("HuntingCooldown")) {
         this.eb().a(cgl.V, true, $$0.g("HuntingCooldown"));
      }
   }

   @Override
   public czk S_() {
      return new czk(czo.rz);
   }

   @Override
   public awm n() {
      return awn.dk;
   }

   @Override
   public boolean ey() {
      return !this.x() && super.ey();
   }

   public static void a(arq $$0, ckr $$1, bxj $$2) {
      if ($$2.eG()) {
         bux $$3 = $$2.eH();
         if ($$3 != null) {
            bwi $$4 = $$3.d();
            if ($$4 != null && $$4.an() == bwr.bS) {
               crj $$5 = (crj)$$4;
               List<crj> $$6 = $$0.a(crj.class, $$1.cQ().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(crj $$0) {
      bvm $$1 = $$0.c(bvo.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bvm(bvo.j, $$3, 0), this);
      }

      $$0.e(bvo.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.m();
   }

   @Override
   protected awm e(bux $$0) {
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
      return this.bh() ? awn.aO : awn.aN;
   }

   @Override
   protected awm aU() {
      return awn.aP;
   }

   @Override
   protected awm aT() {
      return awn.aQ;
   }

   @Override
   protected byj.b<ckr> ec() {
      return byj.a(bI, bH);
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return cks.a(this.ec().a($$0));
   }

   @Override
   public byj<ckr> eb() {
      return (byj<ckr>)super.eb();
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   @Override
   public void a_(fex $$0) {
      if (this.bh()) {
         this.a(this.fn(), $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(crj $$0, buf $$1, czk $$2) {
      if ($$2.a(czo.ry)) {
         $$0.a($$1, czn.a($$2, $$0, new czk(czo.rp)));
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
   public bxj f() {
      return this.Q();
   }

   public static boolean a(bwr<? extends bxj> $$0, djy $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cc);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bvy.a {
      public final ckr.e[] a;

      public b(ckr.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public ckr.e a(azv $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cdj {
      public c(final ckr $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!ckr.this.x()) {
            super.a();
         }
      }
   }

   static class d extends cdk {
      private final ckr l;

      public d(ckr $$0) {
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

      private static final IntFunction<ckr.e> i = ayc.a(ckr.e::a, values(), ayc.a.a);
      public static final yw<ByteBuf, ckr.e> f = yu.a(i, ckr.e::a);
      public static final Codec<ckr.e> g = bak.a(ckr.e::values);
      @Deprecated
      public static final Codec<ckr.e> h = Codec.INT.xmap(i::apply, ckr.e::a);
      private final int j;
      private final String k;
      private final boolean l;

      private e(final int $$0, final String $$1, final boolean $$2) {
         this.j = $$0;
         this.k = $$1;
         this.l = $$2;
      }

      public int a() {
         return this.j;
      }

      public String b() {
         return this.k;
      }

      @Override
      public String c() {
         return this.k;
      }

      public static ckr.e a(int $$0) {
         return i.apply($$0);
      }

      public static ckr.e a(azv $$0) {
         return a($$0, true);
      }

      public static ckr.e b(azv $$0) {
         return a($$0, false);
      }

      private static ckr.e a(azv $$0, boolean $$1) {
         ckr.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.l == $$1).toArray(ckr.e[]::new);
         return ag.a($$2, $$0);
      }
   }
}
