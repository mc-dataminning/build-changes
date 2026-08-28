import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cje extends chp implements bwy<cje.e>, chr {
   public static final int bF = 200;
   private static final int bQ = 10;
   protected static final ImmutableList<? extends cgj<? extends cgi<? super cje>>> bG = ImmutableList.of(cgj.c, cgj.o, cgj.f, cgj.p, cgj.q);
   protected static final ImmutableList<? extends cfc<?>> bH = ImmutableList.of(
      cfc.r, cfc.g, cfc.h, cfc.k, cfc.l, cfc.n, cfc.m, cfc.E, cfc.t, cfc.o, cfc.p, cfc.K, new cfc[]{cfc.y, cfc.N, cfc.B, cfc.O, cfc.P, cfc.R, cfc.U, cfc.Z}
   );
   private static final ajx<Integer> bR = akb.a(cje.class, ajz.b);
   private static final ajx<Boolean> bS = akb.a(cje.class, ajz.k);
   private static final ajx<Boolean> bT = akb.a(cje.class, ajz.k);
   public static final double bJ = 20.0;
   public static final int bK = 1200;
   private static final int bU = 6000;
   public static final String bL = "Variant";
   private static final int bV = 1800;
   private static final int bW = 2400;
   public final axn bM = new axn(10, ayz::m);
   public final axn bN = new axn(10, ayz::m);
   public final axn bO = new axn(10, ayz::m);
   public final axn bP = new axn(10, ayz::m);
   private static final int bX = 100;

   public cje(bvi<? extends cje> $$0, dgz $$1) {
      super($$0, $$1);
      this.a(eun.j, 0.0F);
      this.bz = new cje.d(this);
      this.by = new cje.c(this, 20);
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bR, 0);
      $$0.a(bS, false);
      $$0.a(bT, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.t().a());
      $$0.a("FromBucket", this.m());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(cje.e.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void T() {
      if (!this.x()) {
         super.T();
      }
   }

   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      boolean $$4 = false;
      if ($$2 == bvh.l) {
         return $$3;
      } else {
         azh $$5 = $$0.C_();
         if ($$3 instanceof cje.b) {
            if (((cje.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cje.b(cje.e.a($$5), cje.e.a($$5));
         }

         this.a(((cje.b)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void az() {
      int $$0 = this.cs();
      super.az();
      if (!this.gh() && this.dU() instanceof ard $$1) {
         this.a($$1, $$0);
      }

      if (this.dU().w_()) {
         this.gt();
      }
   }

   private void gt() {
      cje.a $$0;
      if (this.x()) {
         $$0 = cje.a.a;
      } else if (this.bj()) {
         $$0 = cje.a.b;
      } else if (this.aJ()) {
         $$0 = cje.a.c;
      } else {
         $$0 = cje.a.d;
      }

      this.bM.a($$0 == cje.a.a);
      this.bN.a($$0 == cje.a.b);
      this.bO.a($$0 == cje.a.c);
      boolean $$4 = this.aT.d() || this.dM() != this.O || this.dK() != this.N;
      this.bP.a($$4);
   }

   protected void a(ard $$0, int $$1) {
      if (this.bJ() && !this.bk()) {
         this.j($$1 - 1);
         if (this.cs() == -20) {
            this.j(0);
            this.a($$0, this.dV().t(), 2.0F);
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

   public cje.e t() {
      return cje.e.a(this.al.a(bR));
   }

   public void a(cje.e $$0) {
      this.al.a(bR, $$0.a());
   }

   private static boolean a(azh $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dhc $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cI() {
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
   public buq a(ard $$0, buq $$1) {
      cje $$2 = bvi.h.a($$0, bvh.e);
      if ($$2 != null) {
         cje.e $$3;
         if (a(this.ae)) {
            $$3 = cje.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.t() : ((cje)$$1).t();
         }

         $$2.a($$3);
         $$2.ga();
      }

      return $$2;
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.aC);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   protected void a(ard $$0) {
      bpj $$1 = bpi.a();
      $$1.a("axolotlBrain");
      this.ea().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cjf.a(this);
      $$1.c();
      if (!this.gh()) {
         Optional<Integer> $$2 = this.ea().c(cfc.N);
         this.x($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static bxf.a gs() {
      return chp.gx().a(bxg.s, 14.0).a(bxg.v, 1.0).a(bxg.c, 2.0).a(bxg.B, 1.0);
   }

   @Override
   protected cfk b(dgz $$0) {
      return new cfh(this, $$0);
   }

   @Override
   public void gl() {
      this.a(awa.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      float $$3 = this.eE();
      if (!this.gh()
         && this.dU().A.a(3) == 0
         && ((float)this.dU().A.a(3) < $$2 || $$3 / this.eS() < 0.5F)
         && $$2 < $$3
         && this.bj()
         && ($$1.d() != null || $$1.c() != null)
         && !this.x()) {
         this.bs.a(cfc.N, 200);
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
   public bsy b(cpr $$0, bsx $$1) {
      return chr.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cxh $$0) {
      chr.a(this, $$0);
      czo.a(kv.Z, $$0, $$0x -> {
         $$0x.a("Variant", this.t().a());
         $$0x.a("Age", this.g());
         bxa<?> $$1 = this.ea();
         if ($$1.a(cfc.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cfc.U));
         }
      });
   }

   @Override
   public void h(tq $$0) {
      chr.a(this, $$0);
      this.a(cje.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.ea().a(cfc.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cxh R_() {
      return new cxh(cxl.rs);
   }

   @Override
   public avz n() {
      return awa.dk;
   }

   @Override
   public boolean ex() {
      return !this.x() && super.ex();
   }

   public static void a(ard $$0, cje $$1, bvy $$2) {
      if ($$2.eF()) {
         btp $$3 = $$2.eG();
         if ($$3 != null) {
            bva $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == bvi.bR) {
               cpr $$5 = (cpr)$$4;
               List<cpr> $$6 = $$0.a(cpr.class, $$1.cQ().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(cpr $$0) {
      bue $$1 = $$0.c(bug.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bue(bug.j, $$3, 0), this);
      }

      $$0.e(bug.d);
   }

   @Override
   public boolean Z() {
      return super.Z() || this.m();
   }

   @Override
   protected avz e(btp $$0) {
      return awa.aM;
   }

   @Nullable
   @Override
   protected avz l_() {
      return awa.aL;
   }

   @Nullable
   @Override
   protected avz u() {
      return this.bj() ? awa.aO : awa.aN;
   }

   @Override
   protected avz aW() {
      return awa.aP;
   }

   @Override
   protected avz aV() {
      return awa.aQ;
   }

   @Override
   protected bxa.b<cje> eb() {
      return bxa.a(bH, bG);
   }

   @Override
   protected bxa<?> a(Dynamic<?> $$0) {
      return cjf.a(this.eb().a($$0));
   }

   @Override
   public bxa<cje> ea() {
      return (bxa<cje>)super.ea();
   }

   @Override
   protected void ab() {
      super.ab();
      agc.a(this);
   }

   @Override
   public void a_(fbx $$0) {
      if (this.bj()) {
         this.a(this.fq(), $$0);
         this.a(bwc.a, this.dx());
         this.i(this.dx().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cpr $$0, bsx $$1, cxh $$2) {
      if ($$2.a(cxl.rr)) {
         $$0.a($$1, cxk.a($$2, $$0, new cxh(cxl.ri)));
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
   public bvy f() {
      return this.Q();
   }

   public static boolean a(bvi<? extends bvy> $$0, dhq $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cb);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends buq.a {
      public final cje.e[] a;

      public b(cje.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cje.e a(azh $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cca {
      public c(final cje $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cje.this.x()) {
            super.a();
         }
      }
   }

   static class d extends ccb {
      private final cje l;

      public d(cje $$0) {
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

   public static enum e implements azv {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cje.e> g = axq.a(cje.e::a, values(), axq.a.a);
      public static final Codec<cje.e> f = azv.a(cje.e::values);
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

      public static cje.e a(int $$0) {
         return g.apply($$0);
      }

      public static cje.e a(azh $$0) {
         return a($$0, true);
      }

      public static cje.e b(azh $$0) {
         return a($$0, false);
      }

      private static cje.e a(azh $$0, boolean $$1) {
         cje.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cje.e[]::new);
         return af.a($$2, $$0);
      }
   }
}
