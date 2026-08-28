import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckz extends cjk implements cjm {
   public static final int bI = 200;
   private static final int bT = 10;
   protected static final ImmutableList<? extends cid<? extends cic<? super ckz>>> bJ = ImmutableList.of(cid.c, cid.o, cid.f, cid.p, cid.q);
   protected static final ImmutableList<? extends cgw<?>> bK = ImmutableList.of(
      cgw.s, cgw.g, cgw.h, cgw.k, cgw.l, cgw.o, cgw.n, cgw.F, cgw.u, cgw.p, cgw.q, cgw.L, new cgw[]{cgw.z, cgw.O, cgw.C, cgw.P, cgw.Q, cgw.S, cgw.V, cgw.aa}
   );
   private static final akl<Integer> bU = akp.a(ckz.class, akn.b);
   private static final akl<Boolean> bV = akp.a(ckz.class, akn.k);
   private static final akl<Boolean> bW = akp.a(ckz.class, akn.k);
   public static final double bM = 20.0;
   public static final int bN = 1200;
   private static final int bX = 6000;
   public static final String bO = "Variant";
   private static final int bY = 1800;
   private static final int bZ = 2400;
   private static final boolean ca = false;
   public final ayb bP = new ayb(10, azo::m);
   public final ayb bQ = new ayb(10, azo::m);
   public final ayb bR = new ayb(10, azo::m);
   public final ayb bS = new ayb(10, azo::m);
   private static final int cb = 100;

   public ckz(bxc<? extends ckz> $$0, djx $$1) {
      super($$0, $$1);
      this.a(eyf.j, 0.0F);
      this.bC = new ckz.d(this);
      this.bB = new ckz.c(this, 20);
   }

   @Override
   public float a(iv $$0, dka $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bU, 0);
      $$0.a(bV, false);
      $$0.a(bW, false);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", ckz.e.i, this.t());
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a($$0.<ckz.e>a("Variant", ckz.e.i).orElse(ckz.e.f));
      this.w($$0.b("FromBucket", false));
   }

   @Override
   public void T() {
      if (!this.x()) {
         super.T();
      }
   }

   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      boolean $$4 = false;
      if ($$2 == bxb.l) {
         return $$3;
      } else {
         azx $$5 = $$0.G_();
         if ($$3 instanceof ckz.b) {
            if (((ckz.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new ckz.b(ckz.e.a($$5), ckz.e.a($$5));
         }

         this.a(((ckz.b)$$3).a($$5));
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
      if (!this.gj() && this.dV() instanceof ars $$1) {
         this.a($$1, $$0);
      }

      if (this.dV().A_()) {
         this.gv();
      }
   }

   private void gv() {
      ckz.a $$0;
      if (this.x()) {
         $$0 = ckz.a.a;
      } else if (this.bi()) {
         $$0 = ckz.a.b;
      } else if (this.aH()) {
         $$0 = ckz.a.c;
      } else {
         $$0 = ckz.a.d;
      }

      this.bP.a($$0 == ckz.a.a);
      this.bQ.a($$0 == ckz.a.b);
      this.bR.a($$0 == ckz.a.c);
      boolean $$4 = this.aT.d() || this.dN() != this.O || this.dL() != this.N;
      this.bS.a($$4);
   }

   protected void a(ars $$0, int $$1) {
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

   public ckz.e t() {
      return ckz.e.a(this.al.a(bU));
   }

   private void a(ckz.e $$0) {
      this.al.a(bU, $$0.a());
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

   private static boolean a(azx $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dka $$0) {
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
   public bwj a(ars $$0, bwj $$1) {
      ckz $$2 = bxc.i.a($$0, bxb.e);
      if ($$2 != null) {
         ckz.e $$3;
         if (a(this.ae)) {
            $$3 = ckz.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.t() : ((ckz)$$1).t();
         }

         $$2.a($$3);
         $$2.gc();
      }

      return $$2;
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.aD);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void a(ars $$0) {
      brb $$1 = bra.a();
      $$1.a("axolotlBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cla.a(this);
      $$1.c();
      if (!this.gj()) {
         Optional<Integer> $$2 = this.ec().c(cgw.O);
         this.x($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static byz.a gu() {
      return cjk.gz().a(bza.s, 14.0).a(bza.v, 1.0).a(bza.c, 2.0).a(bza.B, 1.0);
   }

   @Override
   protected che b(djx $$0) {
      return new chb(this, $$0);
   }

   @Override
   public void gn() {
      this.a(awp.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      float $$3 = this.eG();
      if (!this.gj()
         && this.dV().A.a(3) == 0
         && ((float)this.dV().A.a(3) < $$2 || $$3 / this.eU() < 0.5F)
         && $$2 < $$3
         && this.bi()
         && ($$1.d() != null || $$1.c() != null)
         && !this.x()) {
         this.bs.a(cgw.O, 200);
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
   public bur b(crx $$0, buq $$1) {
      return cjm.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(czy $$0) {
      cjm.a(this, $$0);
      $$0.a(kk.aO, this);
      dcg.a(kk.Z, $$0, $$0x -> {
         $$0x.a("Age", this.g());
         byu<?> $$1 = this.ec();
         if ($$1.a(cgw.V)) {
            $$0x.a("HuntingCooldown", $$1.e(cgw.V));
         }
      });
   }

   @Override
   public void d(tz $$0) {
      cjm.a(this, $$0);
      this.c_($$0.b("Age", 0));
      $$0.f("HuntingCooldown").ifPresentOrElse($$1 -> this.ec().a(cgw.V, true, $$0.b("HuntingCooldown", 0L)), () -> this.ec().a(cgw.V, Optional.empty()));
   }

   @Override
   public czy W_() {
      return new czy(dac.rz);
   }

   @Override
   public awo n() {
      return awp.dk;
   }

   @Override
   public boolean ez() {
      return !this.x() && super.ez();
   }

   public static void a(ars $$0, ckz $$1, bxu $$2) {
      if ($$2.eH()) {
         bvi $$3 = $$2.eI();
         if ($$3 != null) {
            bwt $$4 = $$3.d();
            if ($$4 != null && $$4.an() == bxc.bT) {
               crx $$5 = (crx)$$4;
               List<crx> $$6 = $$0.a(crx.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(crx $$0) {
      bvx $$1 = $$0.c(bvz.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bvx(bvz.j, $$3, 0), this);
      }

      $$0.e(bvz.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.m();
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.aM;
   }

   @Nullable
   @Override
   protected awo l_() {
      return awp.aL;
   }

   @Nullable
   @Override
   protected awo u() {
      return this.bi() ? awp.aO : awp.aN;
   }

   @Override
   protected awo aV() {
      return awp.aP;
   }

   @Override
   protected awo aU() {
      return awp.aQ;
   }

   @Override
   protected byu.b<ckz> ed() {
      return byu.a(bK, bJ);
   }

   @Override
   protected byu<?> a(Dynamic<?> $$0) {
      return cla.a(this.ed().a($$0));
   }

   @Override
   public byu<ckz> ec() {
      return (byu<ckz>)super.ec();
   }

   @Override
   protected void ac() {
      super.ac();
      ago.a(this);
   }

   @Override
   public void a_(ffq $$0) {
      if (this.bi()) {
         this.a(this.fo(), $$0);
         this.a(bxy.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(crx $$0, buq $$1, czy $$2) {
      if ($$2.a(dac.ry)) {
         $$0.a($$1, dab.a($$2, $$0, new czy(dac.rp)));
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
   public bxu f() {
      return this.Q();
   }

   public static boolean a(bxc<? extends bxu> $$0, dko $$1, bxb $$2, iv $$3, azx $$4) {
      return $$1.a_($$3.e()).a(axe.cc);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bwj.a {
      public final ckz.e[] a;

      public b(ckz.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public ckz.e a(azx $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cdu {
      public c(final ckz $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!ckz.this.x()) {
            super.a();
         }
      }
   }

   static class d extends cdv {
      private final ckz l;

      public d(ckz $$0) {
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

   public static enum e implements bam {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      public static final ckz.e f = a;
      private static final IntFunction<ckz.e> j = aye.a(ckz.e::a, values(), aye.a.a);
      public static final yy<ByteBuf, ckz.e> g = yw.a(j, ckz.e::a);
      public static final Codec<ckz.e> h = bam.a(ckz.e::values);
      @Deprecated
      public static final Codec<ckz.e> i = Codec.INT.xmap(j::apply, ckz.e::a);
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

      public static ckz.e a(int $$0) {
         return j.apply($$0);
      }

      public static ckz.e a(azx $$0) {
         return a($$0, true);
      }

      public static ckz.e b(azx $$0) {
         return a($$0, false);
      }

      private static ckz.e a(azx $$0, boolean $$1) {
         ckz.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.m == $$1).toArray(ckz.e[]::new);
         return ag.a($$2, $$0);
      }
   }
}
