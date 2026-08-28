import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.ByteBuf;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjv extends cig implements cii {
   public static final int bE = 200;
   private static final int bP = 10;
   protected static final ImmutableList<? extends cha<? extends cgz<? super cjv>>> bF = ImmutableList.of(cha.c, cha.o, cha.f, cha.p, cha.q);
   protected static final ImmutableList<? extends cft<?>> bG = ImmutableList.of(
      cft.s, cft.g, cft.h, cft.k, cft.l, cft.o, cft.n, cft.F, cft.u, cft.p, cft.q, cft.L, new cft[]{cft.z, cft.O, cft.C, cft.P, cft.Q, cft.S, cft.V, cft.aa}
   );
   private static final akg<Integer> bQ = akk.a(cjv.class, aki.b);
   private static final akg<Boolean> bR = akk.a(cjv.class, aki.k);
   private static final akg<Boolean> bS = akk.a(cjv.class, aki.k);
   public static final double bI = 20.0;
   public static final int bJ = 1200;
   private static final int bT = 6000;
   public static final String bK = "Variant";
   private static final int bU = 1800;
   private static final int bV = 2400;
   public final axx bL = new axx(10, azk::m);
   public final axx bM = new axx(10, azk::m);
   public final axx bN = new axx(10, azk::m);
   public final axx bO = new axx(10, azk::m);
   private static final int bW = 100;

   public cjv(bwb<? extends cjv> $$0, dhp $$1) {
      super($$0, $$1);
      this.a(evk.j, 0.0F);
      this.by = new cjv.d(this);
      this.bx = new cjv.c(this, 20);
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bQ, 0);
      $$0.a(bR, false);
      $$0.a(bS, false);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Variant", this.t().a());
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a(cjv.e.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void T() {
      if (!this.x()) {
         super.T();
      }
   }

   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      boolean $$4 = false;
      if ($$2 == bwa.l) {
         return $$3;
      } else {
         azs $$5 = $$0.C_();
         if ($$3 instanceof cjv.b) {
            if (((cjv.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cjv.b(cjv.e.a($$5), cjv.e.a($$5));
         }

         this.a(((cjv.b)$$3).a($$5));
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
      if (!this.gf() && this.dV() instanceof arn $$1) {
         this.a($$1, $$0);
      }

      if (this.dV().w_()) {
         this.gr();
      }
   }

   private void gr() {
      cjv.a $$0;
      if (this.x()) {
         $$0 = cjv.a.a;
      } else if (this.bj()) {
         $$0 = cjv.a.b;
      } else if (this.aJ()) {
         $$0 = cjv.a.c;
      } else {
         $$0 = cjv.a.d;
      }

      this.bL.a($$0 == cjv.a.a);
      this.bM.a($$0 == cjv.a.b);
      this.bN.a($$0 == cjv.a.c);
      boolean $$4 = this.aS.d() || this.dN() != this.O || this.dL() != this.N;
      this.bO.a($$4);
   }

   protected void a(arn $$0, int $$1) {
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

   public cjv.e t() {
      return cjv.e.a(this.al.a(bQ));
   }

   private void a(cjv.e $$0) {
      this.al.a(bQ, $$0.a());
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.aI ? b((kw<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.aI);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.aI) {
         this.a(b(kx.aI, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   private static boolean a(azs $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dhs $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   public void x(boolean $$0) {
      this.al.a(bR, $$0);
   }

   public boolean x() {
      return this.al.a(bR);
   }

   @Override
   public boolean m() {
      return this.al.a(bS);
   }

   @Override
   public void w(boolean $$0) {
      this.al.a(bS, $$0);
   }

   @Nullable
   @Override
   public bvi a(arn $$0, bvi $$1) {
      cjv $$2 = bwb.h.a($$0, bwa.e);
      if ($$2 != null) {
         cjv.e $$3;
         if (a(this.ae)) {
            $$3 = cjv.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.t() : ((cjv)$$1).t();
         }

         $$2.a($$3);
         $$2.fY();
      }

      return $$2;
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.aC);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void a(arn $$0) {
      bqb $$1 = bqa.a();
      $$1.a("axolotlBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cjw.a(this);
      $$1.c();
      if (!this.gf()) {
         Optional<Integer> $$2 = this.eb().c(cft.O);
         this.x($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static bxw.a gq() {
      return cig.gv().a(bxx.s, 14.0).a(bxx.v, 1.0).a(bxx.c, 2.0).a(bxx.B, 1.0);
   }

   @Override
   protected cgb b(dhp $$0) {
      return new cfy(this, $$0);
   }

   @Override
   public void gj() {
      this.a(awk.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      float $$3 = this.eF();
      if (!this.gf()
         && this.dV().A.a(3) == 0
         && ((float)this.dV().A.a(3) < $$2 || $$3 / this.eT() < 0.5F)
         && $$2 < $$3
         && this.bj()
         && ($$1.d() != null || $$1.c() != null)
         && !this.x()) {
         this.br.a(cft.O, 200);
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
   public btq b(cqi $$0, btp $$1) {
      return cii.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void j(cxy $$0) {
      cii.a(this, $$0);
      $$0.a(kx.aI, $$0);
      dae.a(kx.Z, $$0, $$0x -> {
         $$0x.a("Age", this.g());
         bxr<?> $$1 = this.eb();
         if ($$1.a(cft.V)) {
            $$0x.a("HuntingCooldown", $$1.e(cft.V));
         }
      });
   }

   @Override
   public void h(tw $$0) {
      cii.a(this, $$0);
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.eb().a(cft.V, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cxy R_() {
      return new cxy(cyc.ru);
   }

   @Override
   public awj n() {
      return awk.dk;
   }

   @Override
   public boolean ey() {
      return !this.x() && super.ey();
   }

   public static void a(arn $$0, cjv $$1, bwr $$2) {
      if ($$2.eG()) {
         buh $$3 = $$2.eH();
         if ($$3 != null) {
            bvs $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == bwb.bR) {
               cqi $$5 = (cqi)$$4;
               List<cqi> $$6 = $$0.a(cqi.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(cqi $$0) {
      buw $$1 = $$0.c(buy.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new buw(buy.j, $$3, 0), this);
      }

      $$0.e(buy.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.m();
   }

   @Override
   protected awj e(buh $$0) {
      return awk.aM;
   }

   @Nullable
   @Override
   protected awj l_() {
      return awk.aL;
   }

   @Nullable
   @Override
   protected awj u() {
      return this.bj() ? awk.aO : awk.aN;
   }

   @Override
   protected awj aW() {
      return awk.aP;
   }

   @Override
   protected awj aV() {
      return awk.aQ;
   }

   @Override
   protected bxr.b<cjv> ec() {
      return bxr.a(bG, bF);
   }

   @Override
   protected bxr<?> a(Dynamic<?> $$0) {
      return cjw.a(this.ec().a($$0));
   }

   @Override
   public bxr<cjv> eb() {
      return (bxr<cjv>)super.eb();
   }

   @Override
   protected void ab() {
      super.ab();
      agj.a(this);
   }

   @Override
   public void a_(fcu $$0) {
      if (this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bwv.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cqi $$0, btp $$1, cxy $$2) {
      if ($$2.a(cyc.rt)) {
         $$0.a($$1, cyb.a($$2, $$0, new cxy(cyc.rk)));
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
   public bwr f() {
      return this.Q();
   }

   public static boolean a(bwb<? extends bwr> $$0, dig $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.a_($$3.e()).a(awz.cb);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bvi.a {
      public final cjv.e[] a;

      public b(cjv.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cjv.e a(azs $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends ccr {
      public c(final cjv $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cjv.this.x()) {
            super.a();
         }
      }
   }

   static class d extends ccs {
      private final cjv l;

      public d(cjv $$0) {
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

   public static enum e implements bag {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cjv.e> h = aya.a(cjv.e::a, values(), aya.a.a);
      public static final yt<ByteBuf, cjv.e> f = yr.a(h, cjv.e::a);
      public static final Codec<cjv.e> g = bag.a(cjv.e::values);
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

      public static cjv.e a(int $$0) {
         return h.apply($$0);
      }

      public static cjv.e a(azs $$0) {
         return a($$0, true);
      }

      public static cjv.e b(azs $$0) {
         return a($$0, false);
      }

      private static cjv.e a(azs $$0, boolean $$1) {
         cjv.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.k == $$1).toArray(cjv.e[]::new);
         return af.a($$2, $$0);
      }
   }
}
