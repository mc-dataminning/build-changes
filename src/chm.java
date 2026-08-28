import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chm extends cga implements bvj<chm.e>, cgc {
   public static final int bY = 200;
   private static final int cj = 10;
   protected static final ImmutableList<? extends ceu<? extends cet<? super chm>>> bZ = ImmutableList.of(ceu.c, ceu.o, ceu.f, ceu.p, ceu.q);
   protected static final ImmutableList<? extends cdn<?>> ca = ImmutableList.of(
      cdn.r, cdn.g, cdn.h, cdn.k, cdn.l, cdn.n, cdn.m, cdn.E, cdn.t, cdn.o, cdn.p, cdn.K, new cdn[]{cdn.y, cdn.N, cdn.B, cdn.O, cdn.P, cdn.R, cdn.U, cdn.Z}
   );
   private static final akg<Integer> ck = akk.a(chm.class, aki.b);
   private static final akg<Boolean> cl = akk.a(chm.class, aki.k);
   private static final akg<Boolean> cm = akk.a(chm.class, aki.k);
   public static final double cc = 20.0;
   public static final int cd = 1200;
   private static final int cn = 6000;
   public static final String ce = "Variant";
   private static final int co = 1800;
   private static final int cp = 2400;
   public final axr cf = new axr(10, azd::l);
   public final axr cg = new axr(10, azd::l);
   public final axr ch = new axr(10, azd::l);
   public final axr ci = new axr(10, azd::l);
   private static final int cq = 100;

   public chm(btv<? extends chm> $$0, deg $$1) {
      super($$0, $$1);
      this.a(erg.j, 0.0F);
      this.bP = new chm.d(this);
      this.bO = new chm.c(this, 20);
   }

   @Override
   public float a(je $$0, dej $$1) {
      return 0.0F;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ck, 0);
      $$0.a(cl, false);
      $$0.a(cm, false);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(chm.e.a($$0.h("Variant")));
      this.x($$0.q("FromBucket"));
   }

   @Override
   public void U() {
      if (!this.gq()) {
         super.U();
      }
   }

   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      boolean $$4 = false;
      if ($$2 == btu.l) {
         return $$3;
      } else {
         azl $$5 = $$0.C_();
         if ($$3 instanceof chm.b) {
            if (((chm.b)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new chm.b(chm.e.a($$5), chm.e.a($$5));
         }

         this.a(((chm.b)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void ay() {
      int $$0 = this.cq();
      super.ay();
      if (!this.ge()) {
         this.t($$0);
      }

      if (this.dS().w_()) {
         this.gs();
      }
   }

   private void gs() {
      chm.a $$0;
      if (this.gq()) {
         $$0 = chm.a.a;
      } else if (this.bl()) {
         $$0 = chm.a.b;
      } else if (this.aH()) {
         $$0 = chm.a.c;
      } else {
         $$0 = chm.a.d;
      }

      this.cf.a($$0 == chm.a.a);
      this.cg.a($$0 == chm.a.b);
      this.ch.a($$0 == chm.a.c);
      boolean $$4 = this.aP.d() || this.dK() != this.P || this.dI() != this.O;
      this.ci.a($$4);
   }

   protected void t(int $$0) {
      if (this.bI() && !this.bk()) {
         this.j($$0 - 1);
         if (this.cq() == -20) {
            this.j(0);
            this.a(this.dT().t(), 2.0F);
         }
      } else {
         this.j(this.cp());
      }
   }

   @Override
   public void q() {
      int $$0 = this.cq() + 1800;
      this.j(Math.min($$0, this.cp()));
   }

   @Override
   public int cp() {
      return 6000;
   }

   public chm.e gp() {
      return chm.e.a(this.am.a(ck));
   }

   public void a(chm.e $$0) {
      this.am.a(ck, $$0.a());
   }

   private static boolean a(azl $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(dej $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cG() {
      return false;
   }

   public void y(boolean $$0) {
      this.am.a(cl, $$0);
   }

   public boolean gq() {
      return this.am.a(cl);
   }

   @Override
   public boolean t() {
      return this.am.a(cm);
   }

   @Override
   public void x(boolean $$0) {
      this.am.a(cm, $$0);
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      chm $$2 = btv.f.a($$0, btu.e);
      if ($$2 != null) {
         chm.e $$3;
         if (a(this.af)) {
            $$3 = chm.e.b(this.af);
         } else {
            $$3 = this.af.h() ? this.gp() : ((chm)$$1).gp();
         }

         $$2.a($$3);
         $$2.fW();
      }

      return $$2;
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.ay);
   }

   @Override
   public boolean A() {
      return true;
   }

   @Override
   protected void ad() {
      this.dS().ah().a("axolotlBrain");
      this.dX().a((arh)this.dS(), this);
      this.dS().ah().c();
      this.dS().ah().a("axolotlActivityUpdate");
      chn.a(this);
      this.dS().ah().c();
      if (!this.ge()) {
         Optional<Integer> $$0 = this.dX().c(cdn.N);
         this.y($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bvq.a gr() {
      return cga.gu().a(bvr.s, 14.0).a(bvr.v, 1.0).a(bvr.c, 2.0).a(bvr.B, 1.0);
   }

   @Override
   protected cdv b(deg $$0) {
      return new cds(this, $$0);
   }

   @Override
   public void gi() {
      this.a(awe.aK, 1.0F, 1.0F);
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      float $$2 = this.eA();
      if (!this.dS().B
         && !this.ge()
         && this.dS().z.a(3) == 0
         && ((float)this.dS().z.a(3) < $$1 || $$2 / this.eQ() < 0.5F)
         && $$1 < $$2
         && this.bi()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gq()) {
         this.bB.a(cdn.N, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   public int ae() {
      return 1;
   }

   @Override
   public int ag() {
      return 1;
   }

   @Override
   public brp b(cnu $$0, bro $$1) {
      return cgc.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void m(cvp $$0) {
      cgc.a(this, $$0);
      cye.a(kr.S, $$0, $$0x -> {
         $$0x.a("Variant", this.gp().a());
         $$0x.a("Age", this.g());
         bvl<?> $$1 = this.dX();
         if ($$1.a(cdn.U)) {
            $$0x.a("HuntingCooldown", $$1.e(cdn.U));
         }
      });
   }

   @Override
   public void h(uf $$0) {
      cgc.a(this, $$0);
      this.a(chm.e.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dX().a(cdn.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cvp V_() {
      return new cvp(cvt.qK);
   }

   @Override
   public awd y() {
      return awe.dj;
   }

   @Override
   public boolean et() {
      return !this.gq() && super.et();
   }

   public static void a(chm $$0, buk $$1) {
      deg $$2 = $$0.dS();
      if ($$1.eB()) {
         bsg $$3 = $$1.eC();
         if ($$3 != null) {
            bto $$4 = $$3.d();
            if ($$4 != null && $$4.ao() == btv.by) {
               cnu $$5 = (cnu)$$4;
               List<cnu> $$6 = $$2.a(cnu.class, $$0.cO().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.a($$5);
               }
            }
         }
      }
   }

   public void a(cnu $$0) {
      bsv $$1 = $$0.c(bsx.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bsv(bsx.j, $$3, 0), this);
      }

      $$0.e(bsx.d);
   }

   @Override
   public boolean aa() {
      return super.aa() || this.t();
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.aM;
   }

   @Nullable
   @Override
   protected awd n_() {
      return awe.aL;
   }

   @Nullable
   @Override
   protected awd w() {
      return this.bi() ? awe.aO : awe.aN;
   }

   @Override
   protected awd aU() {
      return awe.aP;
   }

   @Override
   protected awd aT() {
      return awe.aQ;
   }

   @Override
   protected bvl.b<chm> dY() {
      return bvl.a(ca, bZ);
   }

   @Override
   protected bvl<?> a(Dynamic<?> $$0) {
      return chn.a(this.dY().a($$0));
   }

   @Override
   public bvl<chm> dX() {
      return (bvl<chm>)super.dX();
   }

   @Override
   protected void ac() {
      super.ac();
      agn.a(this);
   }

   @Override
   public void a_(eys $$0) {
      if (this.de() && this.bi()) {
         this.a(this.fm(), $$0);
         this.a(buo.a, this.dv());
         this.h(this.dv().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   protected void a(cnu $$0, bro $$1, cvp $$2) {
      if ($$2.a(cvt.qJ)) {
         $$0.a($$1, cvs.a($$2, $$0, new cvp(cvt.qA)));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ak();
   }

   @Nullable
   @Override
   public buk m() {
      return this.R();
   }

   public static boolean a(btv<? extends buk> $$0, dew $$1, btu $$2, je $$3, azl $$4) {
      return $$1.a_($$3.e()).a(awt.bZ);
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }

   public static class b extends bth.a {
      public final chm.e[] a;

      public b(chm.e... $$0) {
         super(false);
         this.a = $$0;
      }

      public chm.e a(azl $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class c extends cal {
      public c(final chm $$0, final int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!chm.this.gq()) {
            super.a();
         }
      }
   }

   static class d extends cam {
      private final chm l;

      public d(chm $$0) {
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

   public static enum e implements azz {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<chm.e> g = axu.a(chm.e::a, values(), axu.a.a);
      public static final Codec<chm.e> f = azz.a(chm.e::values);
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

      public static chm.e a(int $$0) {
         return g.apply($$0);
      }

      public static chm.e a(azl $$0) {
         return a($$0, true);
      }

      public static chm.e b(azl $$0) {
         return a($$0, false);
      }

      private static chm.e a(azl $$0, boolean $$1) {
         chm.e[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(chm.e[]::new);
         return ad.a($$2, $$0);
      }
   }
}
