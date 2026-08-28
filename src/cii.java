import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cii extends cgw implements bwf<cii.e>, cgy {
   public static final int bY = 200;
   private static final int cj = 10;
   protected static final ImmutableList<? extends cfq<? extends cfp<? super cii>>> bZ = ImmutableList.of(cfq.c, cfq.o, cfq.f, cfq.p, cfq.q);
   protected static final ImmutableList<? extends cej<?>> ca = ImmutableList.of(
      cej.r, cej.g, cej.h, cej.k, cej.l, cej.n, cej.m, cej.E, cej.t, cej.o, cej.p, cej.K, new cej[]{cej.y, cej.N, cej.B, cej.O, cej.P, cej.R, cej.U, cej.Z}
   );
   private static final ajx<Integer> ck = akb.a(cii.class, ajz.b);
   private static final ajx<Boolean> cl = akb.a(cii.class, ajz.k);
   private static final ajx<Boolean> cm = akb.a(cii.class, ajz.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int cn = 6000;
   public static final String ce = "Variant";
   private static final int co = 1800;
   private static final int cp = 2400;
   public final axm cf = new axm(10, ayy::m);
   public final axm cg = new axm(10, ayy::m);
   public final axm ch = new axm(10, ayy::m);
   public final axm ci = new axm(10, ayy::m);
   private static final int cq = 100;

   public cii(buq<? extends cii> $$0, dgg $$1) {
      super($$0, $$1);
      this.a(eto.j, 0.0F);
      this.bP = new cii.d(this);
      this.bO = new cii.c(this, 20);
   }

   @Override
   public float a(ji $$0, dgj $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
      $$0.a(cl, false);
      $$0.a(cm, false);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp().a());
      $$0.a("FromBucket", this.p());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(cii.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gq()) {
         super.R();
      }
   }

   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      boolean $$4 = false;
      if ($$2 == bup.l) {
         return $$3;
      } else {
         azg $$5 = $$0.H_();
         if ($$3 instanceof cii.b) {
            if (((cii.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cii.b(cii.e.a($$5), cii.e.a($$5));
         }

         this.a(((cii.b)$$3).a($$5));
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
      if (!this.gc()) {
         this.s($$0);
      }

      if (this.dW().B_()) {
         this.gs();
      }
   }

   private void gs() {
      cii.a $$0;
      if (this.gq()) {
         $$0 = cii.a.a;
      } else if (this.bm()) {
         $$0 = cii.a.b;
      } else if (this.aJ()) {
         $$0 = cii.a.c;
      } else {
         $$0 = cii.a.d;
      }

      this.cf.a($$0 == cii.a.a);
      this.cg.a($$0 == cii.a.b);
      this.ch.a($$0 == cii.a.c);
      boolean $$4 = this.aT.d() || this.dO() != this.O || this.dM() != this.N;
      this.ci.a($$4);
   }

   protected void s(int $$0) {
      if (this.bL() && !this.bl()) {
         this.j($$0 - 1);
         if (this.ct() == -20) {
            this.j(0);
            this.a(this.dX().t(), 2.0F);
         }
      } else {
         this.j(this.cs());
      }
   }

   public void x() {
      int $$0 = this.ct() + 1800;
      this.j(Math.min($$0, this.cs()));
   }

   @Override
   public int cs() {
      return 6000;
   }

   public cii.e gp() {
      return cii.e.a(this.al.a(ck));
   }

   public void a(cii.e $$0) {
      this.al.a(ck, $$0.a());
   }

   private static boolean a(azg $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dgj $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cJ() {
      return false;
   }

   public void y(boolean $$0) {
      this.al.a(cl, $$0);
   }

   public boolean gq() {
      return this.al.a(cl);
   }

   @Override
   public boolean p() {
      return this.al.a(cm);
   }

   @Override
   public void x(boolean $$0) {
      this.al.a(cm, $$0);
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      cii $$2 = buq.h.a($$0, bup.e);
      if ($$2 != null) {
         cii.e $$3;
         if (a(this.ae)) {
            $$3 = cii.e.b(this.ae);
         } else {
            $$3 = this.ae.h() ? this.gp() : ((cii)$$1).gp();
         }

         $$2.a($$3);
         $$2.aj();
      }

      return $$2;
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.aC);
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected void a(arc $$0) {
      bor $$1 = boq.a();
      $$1.a("axolotlBrain");
      this.ec().a($$0, this);
      $$1.c();
      $$1.a("axolotlActivityUpdate");
      cij.a(this);
      $$1.c();
      if (!this.gc()) {
         Optional<Integer> $$2 = this.ec().c(cej.N);
         this.y($$2.isPresent() && $$2.get() > 0);
      }
   }

   public static bwm.a gr() {
      return cgw.gu().a(bwn.s, 14.0).a(bwn.v, 1.0).a(bwn.c, 2.0).a(bwn.B, 1.0);
   }

   @Override
   protected cer b(dgg $$0) {
      return new ceo(this, $$0);
   }

   @Override
   public void gg() {
      this.a(avz.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      float $$3 = this.eE();
      if (!this.gc()
         && this.dW().A.a(3) == 0
         && ((float)this.dW().A.a(3) < $$2 || $$3 / this.eS() < 0.5F)
         && $$2 < $$3
         && this.bj()
         && ($$1.d() != null || $$1.c() != null)
         && !this.gq()) {
         this.bE.a(cej.N, 200);
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   public int ab() {
      return 1;
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      return cgy.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void i(cwn $$0) {
      cgy.a(this, $$0);
      cyw.a(kv.X, $$0, $$0x -> {
         $$0x.a("Variant", this.gp().a());
         $$0x.a("Age", this.Y_());
         bwh<?> $$1 = this.ec();
         if ($$1.a(cej.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cej.U));
         }
      });
   }

   @Override
   public void h(tq $$0) {
      cgy.a(this, $$0);
      this.a(cii.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.ec().a(cej.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cwn W_() {
      return new cwn(cwr.rq);
   }

   @Override
   public avy t() {
      return avz.dk;
   }

   @Override
   public boolean ex() {
      return !this.gq() && super.ex();
   }

   public static void a(arc $$0, cii $$1, bvf $$2) {
      if ($$2.eF()) {
         bsz $$3 = $$2.eG();
         if ($$3 != null) {
            buj $$4 = $$3.d();
            if ($$4 != null && $$4.aq() == buq.bR) {
               cov $$5 = (cov)$$4;
               List<cov> $$6 = $$0.a(cov.class, $$1.cR().g(20.0));
               if ($$6.contains($$5)) {
                  $$1.a($$5);
               }
            }
         }
      }
   }

   public void a(cov $$0) {
      bto $$1 = $$0.c(btq.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bto(btq.j, $$3, 0), this);
      }

      $$0.e(btq.d);
   }

   @Override
   public boolean X() {
      return super.X() || this.p();
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.aM;
   }

   @Nullable
   @Override
   protected avy o_() {
      return avz.aL;
   }

   @Nullable
   @Override
   protected avy u() {
      return this.bj() ? avz.aO : avz.aN;
   }

   @Override
   protected avy aW() {
      return avz.aP;
   }

   @Override
   protected avy aV() {
      return avz.aQ;
   }

   @Override
   protected bwh.b<cii> ed() {
      return bwh.a(ca, bZ);
   }

   @Override
   protected bwh<?> a(Dynamic<?> $$0) {
      return cij.a(this.ed().a($$0));
   }

   @Override
   public bwh<cii> ec() {
      return (bwh<cii>)super.ec();
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   @Override
   public void a_(fay $$0) {
      if (this.di() && this.bj()) {
         this.a(this.fp(), $$0);
         this.a(bvj.a, this.dz());
         this.h(this.dz().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cov $$0, bsh $$1, cwn $$2) {
      if ($$2.a(cwr.rp)) {
         $$0.a($$1, cwq.a($$2, $$0, new cwn(cwr.rg)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.p() && !this.l_();
   }

   @Nullable
   @Override
   public bvf O_() {
      return this.O();
   }

   public static boolean a(buq<? extends bvf> $$0, dgx $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.a_($$3.e()).a(awo.ca);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bua.a {
      public final cii.e[] a;

      public b(cii.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public cii.e a(azg $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cbh {
      public c(final cii $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cii.this.gq()) {
            super.a();
         }
      }
   }

   static class d extends cbi {
      private final cii l;

      public d(cii $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gq()) {
            super.a();
         }
      }
   }

   public static enum e implements azu {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cii.e> g = axp.a(cii.e::a, values(), axp.a.a);
      public static final Codec<cii.e> f = azu.a(cii.e::values);
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

      public static cii.e a(int $$0) {
         return g.apply($$0);
      }

      public static cii.e a(azg $$0) {
         return a($$0, true);
      }

      public static cii.e b(azg $$0) {
         return a($$0, false);
      }

      private static cii.e a(azg $$0, boolean $$1) {
         cii.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cii.e[]::new);
         return af.a($$2, $$0);
      }
   }
}
