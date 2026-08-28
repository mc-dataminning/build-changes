import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckd extends cio implements ciq {
   public static final int bF = 200;
   private static final int bQ = 10;
   protected static final ImmutableList<? extends chi<? extends chh<? super ckd>>> bG = ImmutableList.of(chi.c, chi.o, chi.f, chi.p, chi.q);
   protected static final ImmutableList<? extends cgb<?>> bH = ImmutableList.of(
      cgb.s, cgb.g, cgb.h, cgb.k, cgb.l, cgb.o, cgb.n, cgb.F, cgb.u, cgb.p, cgb.q, cgb.L, new cgb[]{cgb.z, cgb.O, cgb.C, cgb.P, cgb.Q, cgb.S, cgb.V, cgb.aa}
   );
   private static final akh<Integer> bR = akl.a(ckd.class, akj.b);
   private static final akh<Boolean> bS = akl.a(ckd.class, akj.k);
   private static final akh<Boolean> bT = akl.a(ckd.class, akj.k);
   public static final double bJ = 20.0;
   public static final int bK = 1200;
   private static final int bU = 6000;
   public static final String bL = "Variant";
   private static final int bV = 1800;
   private static final int bW = 2400;
   public final axx bM = new axx(10, azk::m);
   public final axx bN = new axx(10, azk::m);
   public final axx bO = new axx(10, azk::m);
   public final axx bP = new axx(10, azk::m);
   private static final int bX = 100;

   public ckd(bwj<? extends ckd> $$0, dip $$1) {
      super($$0, $$1);
      this.a(ewm.j, 0.0F);
      this.bz = new ckd.d(this);
      this.by = new ckd.c(this, 20);
   }

   @Override
   public float a(iu $$0, dis $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bR, 0);
      $$0.a(bS, false);
      $$0.a(bT, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.t().a());
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(ckd.e.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void T() {
      if (!this.x()) {
         super.T();
      }
   }

   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      boolean $$4 = false;
      if ($$2 == bwi.l) {
         return $$3;
      } else {
         azt $$5 = $$0.C_();
         if ($$3 instanceof ckd.b) {
            if (((ckd.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new ckd.b(ckd.e.a($$5), ckd.e.a($$5));
         }

         this.a(((ckd.b)$$3).a($$5));
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
      if (!this.gf() && this.dV() instanceof aro $$1) {
         this.a($$1, $$0);
      }

      if (this.dV().w_()) {
         this.gr();
      }
   }

   private void gr() {
      ckd.a $$0;
      if (this.x()) {
         $$0 = ckd.a.a;
      } else if (this.bj()) {
         $$0 = ckd.a.b;
      } else if (this.aJ()) {
         $$0 = ckd.a.c;
      } else {
         $$0 = ckd.a.d;
      }

      this.bM.a($$0 == ckd.a.a);
      this.bN.a($$0 == ckd.a.b);
      this.bO.a($$0 == ckd.a.c);
      boolean $$4 = this.aT.d() || this.dN() != this.O || this.dL() != this.N;
      this.bP.a($$4);
   }

   protected void a(aro $$0, int $$1) {
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

   public ckd.e t() {
      return ckd.e.a(this.al.a(bR));
   }

   private void a(ckd.e $$0) {
      this.al.a(bR, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aL ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aL);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aL) {
         this.a(c(kj.aL, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   private static boolean a(azt $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dis $$0) {
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
   public bvq a(aro $$0, bvq $$1) {
      ckd $$2 = bwj.h.a($$0, bwi.e);
      if ($$2 != null) {
         ckd.e $$3;
         if (a(this.ae)) {
            $$3 = ckd.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.t() : ((ckd)$$1).t();
         }

         $$2.a($$3);
         $$2.fY();
      }

      return $$2;
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.aC);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void a(aro $$0) {
      bqj $$1 = bqi.a();
      $$1.a("axolotlBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cke.a(this);
      $$1.c();
      if (!this.gf()) {
         Optional<Integer> $$2 = this.eb().c(cgb.O);
         this.x($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static bye.a gq() {
      return cio.gv().a(byf.s, 14.0).a(byf.v, 1.0).a(byf.c, 2.0).a(byf.B, 1.0);
   }

   @Override
   protected cgj b(dip $$0) {
      return new cgg(this, $$0);
   }

   @Override
   public void gj() {
      this.a(awl.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      float $$3 = this.eF();
      if (!this.gf()
         && this.dV().A.a(3) == 0
         && ((float)this.dV().A.a(3) < $$2 || $$3 / this.eT() < 0.5F)
         && $$2 < $$3
         && this.bj()
         && ($$1.d() != null || $$1.c() != null)
         && !this.x()) {
         this.bs.a(cgb.O, 200);
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
   public bty b(cqs $$0, btx $$1) {
      return ciq.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void j(cys $$0) {
      ciq.a(this, $$0);
      $$0.a(kj.aL, this);
      dba.a(kj.Z, $$0, $$0x -> {
         $$0x.a("Age", this.g());
         bxz<?> $$1 = this.eb();
         if ($$1.a(cgb.V)) {
            $$0x.a("HuntingCooldown", $$1.e(cgb.V));
         }
      });
   }

   @Override
   public void h(tx $$0) {
      ciq.a(this, $$0);
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.eb().a(cgb.V, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cys R_() {
      return new cys(cyw.ru);
   }

   @Override
   public awk n() {
      return awl.dk;
   }

   @Override
   public boolean ey() {
      return !this.x() && super.ey();
   }

   public static void a(aro $$0, ckd $$1, bwz $$2) {
      if ($$2.eG()) {
         bup $$3 = $$2.eH();
         if ($$3 != null) {
            bwa $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == bwj.bS) {
               cqs $$5 = (cqs)$$4;
               List<cqs> $$6 = $$0.a(cqs.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(cqs $$0) {
      bve $$1 = $$0.c(bvg.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bve(bvg.j, $$3, 0), this);
      }

      $$0.e(bvg.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.m();
   }

   @Override
   protected awk e(bup $$0) {
      return awl.aM;
   }

   @Nullable
   @Override
   protected awk l_() {
      return awl.aL;
   }

   @Nullable
   @Override
   protected awk u() {
      return this.bj() ? awl.aO : awl.aN;
   }

   @Override
   protected awk aW() {
      return awl.aP;
   }

   @Override
   protected awk aV() {
      return awl.aQ;
   }

   @Override
   protected bxz.b<ckd> ec() {
      return bxz.a(bH, bG);
   }

   @Override
   protected bxz<?> a(Dynamic<?> $$0) {
      return cke.a(this.ec().a($$0));
   }

   @Override
   public bxz<ckd> eb() {
      return (bxz<ckd>)super.eb();
   }

   @Override
   protected void ab() {
      super.ab();
      agk.a(this);
   }

   @Override
   public void a_(fdw $$0) {
      if (this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bxd.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cqs $$0, btx $$1, cys $$2) {
      if ($$2.a(cyw.rt)) {
         $$0.a($$1, cyv.a($$2, $$0, new cys(cyw.rk)));
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
   public bwz f() {
      return this.Q();
   }

   public static boolean a(bwj<? extends bwz> $$0, djg $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.a_($$3.e()).a(axa.cb);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bvq.a {
      public final ckd.e[] a;

      public b(ckd.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public ckd.e a(azt $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends ccz {
      public c(final ckd $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!ckd.this.x()) {
            super.a();
         }
      }
   }

   static class d extends cda {
      private final ckd l;

      public d(ckd $$0) {
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

   public static enum e implements bai {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<ckd.e> h = aya.a(ckd.e::a, values(), aya.a.a);
      public static final yu<ByteBuf, ckd.e> f = ys.a(h, ckd.e::a);
      public static final Codec<ckd.e> g = bai.a(ckd.e::values);
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

      public static ckd.e a(int $$0) {
         return h.apply($$0);
      }

      public static ckd.e a(azt $$0) {
         return a($$0, true);
      }

      public static ckd.e b(azt $$0) {
         return a($$0, false);
      }

      private static ckd.e a(azt $$0, boolean $$1) {
         ckd.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.k == $$1).toArray(ckd.e[]::new);
         return af.a($$2, $$0);
      }
   }
}
