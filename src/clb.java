import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class clb extends cjm implements cjo {
   public static final int bI = 200;
   private static final int bT = 10;
   protected static final ImmutableList<? extends cif<? extends cie<? super clb>>> bJ = ImmutableList.of(cif.c, cif.o, cif.f, cif.p, cif.q);
   protected static final ImmutableList<? extends cgy<?>> bK = ImmutableList.of(
      cgy.s, cgy.g, cgy.h, cgy.k, cgy.l, cgy.o, cgy.n, cgy.F, cgy.u, cgy.p, cgy.q, cgy.L, new cgy[]{cgy.z, cgy.O, cgy.C, cgy.P, cgy.Q, cgy.S, cgy.V, cgy.aa}
   );
   private static final akn<Integer> bU = akr.a(clb.class, akp.b);
   private static final akn<Boolean> bV = akr.a(clb.class, akp.k);
   private static final akn<Boolean> bW = akr.a(clb.class, akp.k);
   public static final double bM = 20.0;
   public static final int bN = 1200;
   private static final int bX = 6000;
   public static final String bO = "Variant";
   private static final int bY = 1800;
   private static final int bZ = 2400;
   private static final boolean ca = false;
   public final ayd bP = new ayd(10, azq::m);
   public final ayd bQ = new ayd(10, azq::m);
   public final ayd bR = new ayd(10, azq::m);
   public final ayd bS = new ayd(10, azq::m);
   private static final int cb = 100;

   public clb(bxe<? extends clb> $$0, djz $$1) {
      super($$0, $$1);
      this.a(eyh.j, 0.0F);
      this.bC = new clb.d(this);
      this.bB = new clb.c(this, 20);
   }

   @Override
   public float a(iw $$0, dkc $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bU, 0);
      $$0.a(bV, false);
      $$0.a(bW, false);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", clb.e.i, this.t());
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<clb.e>a("Variant", clb.e.i).orElse(clb.e.f));
      this.w($$0.b("FromBucket", false));
   }

   @Override
   public void T() {
      if (!this.x()) {
         super.T();
      }
   }

   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      boolean $$4 = false;
      if ($$2 == bxd.l) {
         return $$3;
      } else {
         azz $$5 = $$0.G_();
         if ($$3 instanceof clb.b) {
            if (((clb.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new clb.b(clb.e.a($$5), clb.e.a($$5));
         }

         this.a(((clb.b)$$3).a($$5));
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
      if (!this.gj() && this.dV() instanceof aru $$1) {
         this.a($$1, $$0);
      }

      if (this.dV().A_()) {
         this.gv();
      }
   }

   private void gv() {
      clb.a $$0;
      if (this.x()) {
         $$0 = clb.a.a;
      } else if (this.bi()) {
         $$0 = clb.a.b;
      } else if (this.aH()) {
         $$0 = clb.a.c;
      } else {
         $$0 = clb.a.d;
      }

      this.bP.a($$0 == clb.a.a);
      this.bQ.a($$0 == clb.a.b);
      this.bR.a($$0 == clb.a.c);
      boolean $$4 = this.aT.d() || this.dN() != this.O || this.dL() != this.N;
      this.bS.a($$4);
   }

   protected void a(aru $$0, int $$1) {
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

   public clb.e t() {
      return clb.e.a(this.al.a(bU));
   }

   private void a(clb.e $$0) {
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

   private static boolean a(azz $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dkc $$0) {
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
   public bwl a(aru $$0, bwl $$1) {
      clb $$2 = bxe.i.a($$0, bxd.e);
      if ($$2 != null) {
         clb.e $$3;
         if (a(this.ae)) {
            $$3 = clb.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.t() : ((clb)$$1).t();
         }

         $$2.a($$3);
         $$2.gc();
      }

      return $$2;
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.aE);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void a(aru $$0) {
      brd $$1 = brc.a();
      $$1.a("axolotlBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      clc.a(this);
      $$1.c();
      if (!this.gj()) {
         Optional<Integer> $$2 = this.ec().c(cgy.O);
         this.x($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static bzb.a gu() {
      return cjm.gz().a(bzc.s, 14.0).a(bzc.v, 1.0).a(bzc.c, 2.0).a(bzc.B, 1.0);
   }

   @Override
   protected chg b(djz $$0) {
      return new chd(this, $$0);
   }

   @Override
   public void gn() {
      this.a(awr.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      float $$3 = this.eG();
      if (!this.gj()
         && this.dV().A.a(3) == 0
         && ((float)this.dV().A.a(3) < $$2 || $$3 / this.eU() < 0.5F)
         && $$2 < $$3
         && this.bi()
         && ($$1.d() != null || $$1.c() != null)
         && !this.x()) {
         this.bs.a(cgy.O, 200);
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
   public but b(crz $$0, bus $$1) {
      return cjo.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(daa $$0) {
      cjo.a(this, $$0);
      $$0.a(kl.aO, this);
      dci.a(kl.Z, $$0, $$0x -> {
         $$0x.a("Age", this.g());
         byw<?> $$1 = this.ec();
         if ($$1.a(cgy.V)) {
            $$0x.a("HuntingCooldown", $$1.e(cgy.V));
         }
      });
   }

   @Override
   public void d(ua $$0) {
      cjo.a(this, $$0);
      this.c_($$0.b("Age", 0));
      $$0.f("HuntingCooldown").ifPresentOrElse($$1 -> this.ec().a(cgy.V, true, $$0.b("HuntingCooldown", 0L)), () -> this.ec().a(cgy.V, Optional.empty()));
   }

   @Override
   public daa W_() {
      return new daa(dae.rz);
   }

   @Override
   public awq n() {
      return awr.dk;
   }

   @Override
   public boolean ez() {
      return !this.x() && super.ez();
   }

   public static void a(aru $$0, clb $$1, bxw $$2) {
      if ($$2.eH()) {
         bvk $$3 = $$2.eI();
         if ($$3 != null) {
            bwv $$4 = $$3.d();
            if ($$4 != null && $$4.an() == bxe.bT) {
               crz $$5 = (crz)$$4;
               List<crz> $$6 = $$0.a(crz.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(crz $$0) {
      bvz $$1 = $$0.c(bwb.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bvz(bwb.j, $$3, 0), this);
      }

      $$0.e(bwb.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.m();
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.aM;
   }

   @Nullable
   @Override
   protected awq l_() {
      return awr.aL;
   }

   @Nullable
   @Override
   protected awq u() {
      return this.bi() ? awr.aO : awr.aN;
   }

   @Override
   protected awq aV() {
      return awr.aP;
   }

   @Override
   protected awq aU() {
      return awr.aQ;
   }

   @Override
   protected byw.b<clb> ed() {
      return byw.a(bK, bJ);
   }

   @Override
   protected byw<?> a(Dynamic<?> $$0) {
      return clc.a(this.ed().a($$0));
   }

   @Override
   public byw<clb> ec() {
      return (byw<clb>)super.ec();
   }

   @Override
   protected void ac() {
      super.ac();
      agq.a(this);
   }

   @Override
   public void a_(ffs $$0) {
      if (this.bi()) {
         this.a(this.fo(), $$0);
         this.a(bya.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(crz $$0, bus $$1, daa $$2) {
      if ($$2.a(dae.ry)) {
         $$0.a($$1, dad.a($$2, $$0, new daa(dae.rp)));
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
   public bxw f() {
      return this.Q();
   }

   public static boolean a(bxe<? extends bxw> $$0, dkq $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.a_($$3.e()).a(axg.cc);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bwl.a {
      public final clb.e[] a;

      public b(clb.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public clb.e a(azz $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cdw {
      public c(final clb $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!clb.this.x()) {
            super.a();
         }
      }
   }

   static class d extends cdx {
      private final clb l;

      public d(clb $$0) {
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

   public static enum e implements bao {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      public static final clb.e f = a;
      private static final IntFunction<clb.e> j = ayg.a(clb.e::a, values(), ayg.a.a);
      public static final za<ByteBuf, clb.e> g = yy.a(j, clb.e::a);
      public static final Codec<clb.e> h = bao.a(clb.e::values);
      @Deprecated
      public static final Codec<clb.e> i = Codec.INT.xmap(j::apply, clb.e::a);
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

      public static clb.e a(int $$0) {
         return j.apply($$0);
      }

      public static clb.e a(azz $$0) {
         return a($$0, true);
      }

      public static clb.e b(azz $$0) {
         return a($$0, false);
      }

      private static clb.e a(azz $$0, boolean $$1) {
         clb.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.m == $$1).toArray(clb.e[]::new);
         return ag.a($$2, $$0);
      }
   }
}
