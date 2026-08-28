import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cko extends ciz implements cjb {
   public static final int bG = 200;
   private static final int bR = 10;
   protected static final ImmutableList<? extends chs<? extends chr<? super cko>>> bH = ImmutableList.of(chs.c, chs.o, chs.f, chs.p, chs.q);
   protected static final ImmutableList<? extends cgl<?>> bI = ImmutableList.of(
      cgl.s, cgl.g, cgl.h, cgl.k, cgl.l, cgl.o, cgl.n, cgl.F, cgl.u, cgl.p, cgl.q, cgl.L, new cgl[]{cgl.z, cgl.O, cgl.C, cgl.P, cgl.Q, cgl.S, cgl.V, cgl.aa}
   );
   private static final akj<Integer> bS = akn.a(cko.class, akl.b);
   private static final akj<Boolean> bT = akn.a(cko.class, akl.k);
   private static final akj<Boolean> bU = akn.a(cko.class, akl.k);
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

   public cko(bwr<? extends cko> $$0, djm $$1) {
      super($$0, $$1);
      this.a(exr.j, 0.0F);
      this.bA = new cko.d(this);
      this.bz = new cko.c(this, 20);
   }

   @Override
   public float a(iv $$0, djp $$1) {
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
      $$0.a("Variant", cko.e.h, this.t());
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<cko.e>a("Variant", cko.e.h).orElse(cko.e.a));
      this.w($$0.o("FromBucket"));
   }

   @Override
   public void T() {
      if (!this.x()) {
         super.T();
      }
   }

   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      boolean $$4 = false;
      if ($$2 == bwq.l) {
         return $$3;
      } else {
         azv $$5 = $$0.C_();
         if ($$3 instanceof cko.b) {
            if (((cko.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cko.b(cko.e.a($$5), cko.e.a($$5));
         }

         this.a(((cko.b)$$3).a($$5));
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
      cko.a $$0;
      if (this.x()) {
         $$0 = cko.a.a;
      } else if (this.bh()) {
         $$0 = cko.a.b;
      } else if (this.aH()) {
         $$0 = cko.a.c;
      } else {
         $$0 = cko.a.d;
      }

      this.bN.a($$0 == cko.a.a);
      this.bO.a($$0 == cko.a.b);
      this.bP.a($$0 == cko.a.c);
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

   public cko.e t() {
      return cko.e.a(this.al.a(bS));
   }

   private void a(cko.e $$0) {
      this.al.a(bS, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aO ? c((kj<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aO);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aO) {
         this.a(c(kk.aO, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   private static boolean a(azv $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(djp $$0) {
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
      cko $$2 = bwr.h.a($$0, bwq.e);
      if ($$2 != null) {
         cko.e $$3;
         if (a(this.ae)) {
            $$3 = cko.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.t() : ((cko)$$1).t();
         }

         $$2.a($$3);
         $$2.gb();
      }

      return $$2;
   }

   @Override
   public boolean i(czn $$0) {
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
      ckp.a(this);
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
   protected cgt b(djm $$0) {
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
   public bug b(crm $$0, buf $$1) {
      return cjb.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(czn $$0) {
      cjb.a(this, $$0);
      $$0.a(kk.aO, this);
      dbv.a(kk.Z, $$0, $$0x -> {
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
   public czn S_() {
      return new czn(czr.rz);
   }

   @Override
   public awm n() {
      return awn.dk;
   }

   @Override
   public boolean ey() {
      return !this.x() && super.ey();
   }

   public static void a(arq $$0, cko $$1, bxj $$2) {
      if ($$2.eG()) {
         bux $$3 = $$2.eH();
         if ($$3 != null) {
            bwi $$4 = $$3.d();
            if ($$4 != null && $$4.an() == bwr.bS) {
               crm $$5 = (crm)$$4;
               List<crm> $$6 = $$0.a(crm.class, $$1.cQ().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(crm $$0) {
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
   protected byj.b<cko> ec() {
      return byj.a(bI, bH);
   }

   @Override
   protected byj<?> a(Dynamic<?> $$0) {
      return ckp.a(this.ec().a($$0));
   }

   @Override
   public byj<cko> eb() {
      return (byj<cko>)super.eb();
   }

   @Override
   protected void ac() {
      super.ac();
      agm.a(this);
   }

   @Override
   public void a_(ffc $$0) {
      if (this.bh()) {
         this.a(this.fn(), $$0);
         this.a(bxn.a, this.dx());
         this.i(this.dx().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(crm $$0, buf $$1, czn $$2) {
      if ($$2.a(czr.ry)) {
         $$0.a($$1, czq.a($$2, $$0, new czn(czr.rp)));
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

   public static boolean a(bwr<? extends bxj> $$0, dkd $$1, bwq $$2, iv $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cc);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bvy.a {
      public final cko.e[] a;

      public b(cko.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cko.e a(azv $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cdj {
      public c(final cko $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cko.this.x()) {
            super.a();
         }
      }
   }

   static class d extends cdk {
      private final cko l;

      public d(cko $$0) {
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

      private static final IntFunction<cko.e> i = ayc.a(cko.e::a, values(), ayc.a.a);
      public static final yw<ByteBuf, cko.e> f = yu.a(i, cko.e::a);
      public static final Codec<cko.e> g = bak.a(cko.e::values);
      @Deprecated
      public static final Codec<cko.e> h = Codec.INT.xmap(i::apply, cko.e::a);
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

      public static cko.e a(int $$0) {
         return i.apply($$0);
      }

      public static cko.e a(azv $$0) {
         return a($$0, true);
      }

      public static cko.e b(azv $$0) {
         return a($$0, false);
      }

      private static cko.e a(azv $$0, boolean $$1) {
         cko.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.l == $$1).toArray(cko.e[]::new);
         return ag.a($$2, $$0);
      }
   }
}
