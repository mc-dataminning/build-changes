import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckn extends ciu implements ciw {
   public static final int bG = 200;
   private static final int bR = 10;
   protected static final ImmutableList<? extends chn<? extends chm<? super ckn>>> bH = ImmutableList.of(chn.c, chn.o, chn.f, chn.p, chn.q);
   protected static final ImmutableList<? extends cgg<?>> bI = ImmutableList.of(
      cgg.s, cgg.g, cgg.h, cgg.k, cgg.l, cgg.o, cgg.n, cgg.F, cgg.u, cgg.p, cgg.q, cgg.L, new cgg[]{cgg.z, cgg.O, cgg.C, cgg.P, cgg.Q, cgg.S, cgg.V, cgg.aa}
   );
   private static final akj<Integer> bS = akn.a(ckn.class, akl.b);
   private static final akj<Boolean> bT = akn.a(ckn.class, akl.k);
   private static final akj<Boolean> bU = akn.a(ckn.class, akl.k);
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

   public ckn(bwo<? extends ckn> $$0, dja $$1) {
      super($$0, $$1);
      this.a(exf.j, 0.0F);
      this.bA = new ckn.d(this);
      this.bz = new ckn.c(this, 20);
   }

   @Override
   public float a(iu $$0, djd $$1) {
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
      $$0.a("Variant", this.t().a());
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(ckn.e.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void T() {
      if (!this.x()) {
         super.T();
      }
   }

   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      boolean $$4 = false;
      if ($$2 == bwn.l) {
         return $$3;
      } else {
         azv $$5 = $$0.C_();
         if ($$3 instanceof ckn.b) {
            if (((ckn.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new ckn.b(ckn.e.a($$5), ckn.e.a($$5));
         }

         this.a(((ckn.b)$$3).a($$5));
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
      if (!this.gg() && this.dV() instanceof arq $$1) {
         this.a($$1, $$0);
      }

      if (this.dV().w_()) {
         this.gs();
      }
   }

   private void gs() {
      ckn.a $$0;
      if (this.x()) {
         $$0 = ckn.a.a;
      } else if (this.bj()) {
         $$0 = ckn.a.b;
      } else if (this.aJ()) {
         $$0 = ckn.a.c;
      } else {
         $$0 = ckn.a.d;
      }

      this.bN.a($$0 == ckn.a.a);
      this.bO.a($$0 == ckn.a.b);
      this.bP.a($$0 == ckn.a.c);
      boolean $$4 = this.aT.d() || this.dN() != this.O || this.dL() != this.N;
      this.bQ.a($$4);
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

   public ckn.e t() {
      return ckn.e.a(this.al.a(bS));
   }

   private void a(ckn.e $$0) {
      this.al.a(bS, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aN ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aN);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aN) {
         this.a(c(kj.aN, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   private static boolean a(azv $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(djd $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cJ() {
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
   public bvv a(arq $$0, bvv $$1) {
      ckn $$2 = bwo.h.a($$0, bwn.e);
      if ($$2 != null) {
         ckn.e $$3;
         if (a(this.ae)) {
            $$3 = ckn.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.t() : ((ckn)$$1).t();
         }

         $$2.a($$3);
         $$2.fZ();
      }

      return $$2;
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.aD);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void a(arq $$0) {
      bqo $$1 = bqn.a();
      $$1.a("axolotlBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cko.a(this);
      $$1.c();
      if (!this.gg()) {
         Optional<Integer> $$2 = this.ec().c(cgg.O);
         this.x($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static byj.a gr() {
      return ciu.gw().a(byk.s, 14.0).a(byk.v, 1.0).a(byk.c, 2.0).a(byk.B, 1.0);
   }

   @Override
   protected cgo b(dja $$0) {
      return new cgl(this, $$0);
   }

   @Override
   public void gk() {
      this.a(awn.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      float $$3 = this.eG();
      if (!this.gg()
         && this.dV().A.a(3) == 0
         && ((float)this.dV().A.a(3) < $$2 || $$3 / this.eU() < 0.5F)
         && $$2 < $$3
         && this.bj()
         && ($$1.d() != null || $$1.c() != null)
         && !this.x()) {
         this.bs.a(cgg.O, 200);
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
   public bud b(crc $$0, buc $$1) {
      return ciw.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void a_(czd $$0) {
      ciw.a(this, $$0);
      $$0.a(kj.aN, this);
      dbl.a(kj.Z, $$0, $$0x -> {
         $$0x.a("Age", this.g());
         bye<?> $$1 = this.ec();
         if ($$1.a(cgg.V)) {
            $$0x.a("HuntingCooldown", $$1.e(cgg.V));
         }
      });
   }

   @Override
   public void h(tz $$0) {
      ciw.a(this, $$0);
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.ec().a(cgg.V, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public czd S_() {
      return new czd(czh.rz);
   }

   @Override
   public awm n() {
      return awn.dk;
   }

   @Override
   public boolean ez() {
      return !this.x() && super.ez();
   }

   public static void a(arq $$0, ckn $$1, bxe $$2) {
      if ($$2.eH()) {
         buu $$3 = $$2.eI();
         if ($$3 != null) {
            bwf $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == bwo.bS) {
               crc $$5 = (crc)$$4;
               List<crc> $$6 = $$0.a(crc.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(crc $$0) {
      bvj $$1 = $$0.c(bvl.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bvj(bvl.j, $$3, 0), this);
      }

      $$0.e(bvl.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.m();
   }

   @Override
   protected awm e(buu $$0) {
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
   protected bye.b<ckn> ed() {
      return bye.a(bI, bH);
   }

   @Override
   protected bye<?> a(Dynamic<?> $$0) {
      return cko.a(this.ed().a($$0));
   }

   @Override
   public bye<ckn> ec() {
      return (bye<ckn>)super.ec();
   }

   @Override
   protected void ab() {
      super.ab();
      agm.a(this);
   }

   @Override
   public void a_(feq $$0) {
      if (this.bj()) {
         this.a(this.fo(), $$0);
         this.a(bxi.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(crc $$0, buc $$1, czd $$2) {
      if ($$2.a(czh.ry)) {
         $$0.a($$1, czg.a($$2, $$0, new czd(czh.rp)));
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
   public bxe f() {
      return this.Q();
   }

   public static boolean a(bwo<? extends bxe> $$0, djr $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cc);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bvv.a {
      public final ckn.e[] a;

      public b(ckn.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public ckn.e a(azv $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cde {
      public c(final ckn $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!ckn.this.x()) {
            super.a();
         }
      }
   }

   static class d extends cdf {
      private final ckn l;

      public d(ckn $$0) {
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

      private static final IntFunction<ckn.e> h = ayc.a(ckn.e::a, values(), ayc.a.a);
      public static final yw<ByteBuf, ckn.e> f = yu.a(h, ckn.e::a);
      public static final Codec<ckn.e> g = bak.a(ckn.e::values);
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

      public static ckn.e a(int $$0) {
         return h.apply($$0);
      }

      public static ckn.e a(azv $$0) {
         return a($$0, true);
      }

      public static ckn.e b(azv $$0) {
         return a($$0, false);
      }

      private static ckn.e a(azv $$0, boolean $$1) {
         ckn.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.k == $$1).toArray(ckn.e[]::new);
         return af.a($$2, $$0);
      }
   }
}
