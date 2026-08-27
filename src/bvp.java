import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvp extends bui implements biu, bjv<bvp.d>, buk {
   public static final int bT = 200;
   protected static final ImmutableList<? extends btd<? extends btc<? super bvp>>> bU = ImmutableList.of(btd.c, btd.n, btd.f, btd.o, btd.p);
   protected static final ImmutableList<? extends bry<?>> bW = ImmutableList.of(
      bry.r, bry.g, bry.h, bry.k, bry.l, bry.n, bry.m, bry.E, bry.t, bry.o, bry.p, bry.J, new bry[]{bry.y, bry.M, bry.B, bry.N, bry.O, bry.Q, bry.T, bry.Y}
   );
   private static final adx<Integer> ca = aea.a(bvp.class, adz.b);
   private static final adx<Boolean> cb = aea.a(bvp.class, adz.k);
   private static final adx<Boolean> cc = aea.a(bvp.class, adz.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public bvp(bik<? extends bvp> $$0, cpk $$1) {
      super($$0, $$1);
      this.a(eam.j, 0.0F);
      this.bL = new bvp.c(this);
      this.bK = new bvp.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(gv $$0, cpn $$1) {
      return 0.0F;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Variant", this.fZ().a());
      $$0.a("FromBucket", this.q());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.a(bvp.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void M() {
      if (!this.gf()) {
         super.M();
      }
   }

   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      boolean $$5 = false;
      if ($$2 == bja.l) {
         return $$3;
      } else {
         art $$6 = $$0.y_();
         if ($$3 instanceof bvp.a) {
            if (((bvp.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bvp.a(bvp.d.a($$6), bvp.d.a($$6));
         }

         this.a(((bvp.a)$$3).a($$6));
         if ($$5) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void aq() {
      int $$0 = this.ch();
      super.aq();
      if (!this.fQ()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bv() && !this.aZ()) {
         this.j($$0 - 1);
         if (this.ch() == -20) {
            this.j(0);
            this.a(this.dL().r(), 2.0F);
         }
      } else {
         this.j(this.cg());
      }
   }

   @Override
   public void p() {
      int $$0 = this.ch() + 1800;
      this.j(Math.min($$0, this.cg()));
   }

   @Override
   public int cg() {
      return 6000;
   }

   public bvp.d fZ() {
      return bvp.d.a(this.an.b(ca));
   }

   public void a(bvp.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(art $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cpn $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean dP() {
      return true;
   }

   @Override
   public boolean cy() {
      return false;
   }

   @Override
   public bjb eQ() {
      return bjb.e;
   }

   public void x(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gf() {
      return this.an.b(cb);
   }

   @Override
   public boolean q() {
      return this.an.b(cc);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   @Nullable
   @Override
   public bib a(aki $$0, bib $$1) {
      bvp $$2 = bik.f.a((cpk)$$0);
      if ($$2 != null) {
         bvp.d $$3;
         if (a(this.ag)) {
            $$3 = bvp.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.fZ() : ((bvp)$$1).fZ();
         }

         $$2.a($$3);
         $$2.fF();
      }

      return $$2;
   }

   @Override
   public double i(biw $$0) {
      return 1.5 + (double)$$0.df() * 2.0;
   }

   @Override
   public boolean m(ciw $$0) {
      return $$0.a(apr.aA);
   }

   @Override
   public boolean a(cbl $$0) {
      return true;
   }

   @Override
   protected void V() {
      this.dK().ad().a("axolotlBrain");
      this.dM().a((aki)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("axolotlActivityUpdate");
      bvq.a(this);
      this.dK().ad().c();
      if (!this.fQ()) {
         Optional<Integer> $$0 = this.dM().c(bry.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bkc.a gg() {
      return biy.x().a(bkd.a, 14.0).a(bkd.d, 1.0).a(bkd.f, 2.0);
   }

   @Override
   protected bsg b(cpk $$0) {
      return new bsd(this, $$0);
   }

   @Override
   public boolean C(big $$0) {
      boolean $$1 = $$0.a(this.dL().b((biw)this), (float)((int)this.b(bkd.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aou.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      float $$2 = this.et();
      if (!this.dK().B
         && !this.fQ()
         && this.dK().z.a(3) == 0
         && ((float)this.dK().z.a(3) < $$1 || $$2 / this.eK() < 0.5F)
         && $$1 < $$2
         && this.aX()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gf()) {
         this.bz.a(bry.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b * 0.655F;
   }

   @Override
   public int W() {
      return 1;
   }

   @Override
   public int X() {
      return 1;
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      return buk.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(ciw $$0) {
      buk.a(this, $$0);
      qs $$1 = $$0.w();
      $$1.a("Variant", this.fZ().a());
      $$1.a("Age", this.h());
      bjx<?> $$2 = this.dM();
      if ($$2.a(bry.T)) {
         $$1.a("HuntingCooldown", $$2.e(bry.T));
      }
   }

   @Override
   public void c(qs $$0) {
      buk.a(this, $$0);
      this.a(bvp.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dM().a(bry.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public ciw b() {
      return new ciw(ciz.pV);
   }

   @Override
   public aot t() {
      return aou.cC;
   }

   @Override
   public boolean em() {
      return !this.gf() && super.em();
   }

   public static void a(bvp $$0, biw $$1) {
      cpk $$2 = $$0.dK();
      if ($$1.eu()) {
         bhe $$3 = $$1.ev();
         if ($$3 != null) {
            big $$4 = $$3.d();
            if ($$4 != null && $$4.ag() == bik.bt) {
               cbl $$5 = (cbl)$$4;
               List<cbl> $$6 = $$2.a(cbl.class, $$0.cG().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cbl $$0) {
      bht $$1 = $$0.b(bhv.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bht(bhv.j, $$3, 0), this);
      }

      $$0.d(bhv.d);
   }

   @Override
   public boolean R() {
      return super.R() || this.q();
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.ax;
   }

   @Nullable
   @Override
   protected aot h_() {
      return aou.aw;
   }

   @Nullable
   @Override
   protected aot r() {
      return this.aX() ? aou.az : aou.ay;
   }

   @Override
   protected aot aM() {
      return aou.aA;
   }

   @Override
   protected aot aL() {
      return aou.aB;
   }

   @Override
   protected bjx.b<bvp> dN() {
      return bjx.a(bW, bU);
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      return bvq.a(this.dN().a($$0));
   }

   @Override
   public bjx<bvp> dM() {
      return (bjx<bvp>)super.dM();
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
   }

   @Override
   public void h(ehf $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fd(), $$0);
         this.a(bjc.a, this.dn());
         this.f(this.dn().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   protected void a(cbl $$0, bgn $$1, ciw $$2) {
      if ($$2.a(ciz.pU)) {
         $$0.a($$1, new ciw(ciz.pL));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && !this.ac();
   }

   public static boolean a(bik<? extends biw> $$0, cpz $$1, bja $$2, gv $$3, art $$4) {
      return $$1.a_($$3.d()).a(apj.bQ);
   }

   public static class a extends bib.a {
      public final bvp.d[] a;

      public a(bvp.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bvp.d a(art $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bow {
      public b(bvp $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bvp.this.gf()) {
            super.a();
         }
      }
   }

   static class c extends box {
      private final bvp l;

      public c(bvp $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gf()) {
            super.a();
         }
      }
   }

   public static enum d implements asf {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bvp.d> g = aqi.a(bvp.d::a, values(), aqi.a.a);
      public static final Codec<bvp.d> f = asf.a(bvp.d::values);
      private final int h;
      private final String i;
      private final boolean j;

      private d(int $$0, String $$1, boolean $$2) {
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

      public static bvp.d a(int $$0) {
         return g.apply($$0);
      }

      public static bvp.d a(art $$0) {
         return a($$0, true);
      }

      public static bvp.d b(art $$0) {
         return a($$0, false);
      }

      private static bvp.d a(art $$0, boolean $$1) {
         bvp.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bvp.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
