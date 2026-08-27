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

public class bvr extends buk implements biw, bjx<bvr.d>, bum {
   public static final int bT = 200;
   protected static final ImmutableList<? extends btf<? extends bte<? super bvr>>> bU = ImmutableList.of(btf.c, btf.n, btf.f, btf.o, btf.p);
   protected static final ImmutableList<? extends bsa<?>> bW = ImmutableList.of(
      bsa.r, bsa.g, bsa.h, bsa.k, bsa.l, bsa.n, bsa.m, bsa.E, bsa.t, bsa.o, bsa.p, bsa.J, new bsa[]{bsa.y, bsa.M, bsa.B, bsa.N, bsa.O, bsa.Q, bsa.T, bsa.Y}
   );
   private static final adz<Integer> ca = aec.a(bvr.class, aeb.b);
   private static final adz<Boolean> cb = aec.a(bvr.class, aeb.k);
   private static final adz<Boolean> cc = aec.a(bvr.class, aeb.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public bvr(bim<? extends bvr> $$0, cpm $$1) {
      super($$0, $$1);
      this.a(eao.j, 0.0F);
      this.bL = new bvr.c(this);
      this.bK = new bvr.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(gu $$0, cpp $$1) {
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
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Variant", this.fZ().a());
      $$0.a("FromBucket", this.q());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(bvr.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void M() {
      if (!this.gf()) {
         super.M();
      }
   }

   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      boolean $$5 = false;
      if ($$2 == bjc.l) {
         return $$3;
      } else {
         aru $$6 = $$0.y_();
         if ($$3 instanceof bvr.a) {
            if (((bvr.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bvr.a(bvr.d.a($$6), bvr.d.a($$6));
         }

         this.a(((bvr.a)$$3).a($$6));
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

   public bvr.d fZ() {
      return bvr.d.a(this.an.b(ca));
   }

   public void a(bvr.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(aru $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cpp $$0) {
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
   public bjd eQ() {
      return bjd.e;
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
   public bid a(akk $$0, bid $$1) {
      bvr $$2 = bim.f.a((cpm)$$0);
      if ($$2 != null) {
         bvr.d $$3;
         if (a(this.ag)) {
            $$3 = bvr.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.fZ() : ((bvr)$$1).fZ();
         }

         $$2.a($$3);
         $$2.fF();
      }

      return $$2;
   }

   @Override
   public double i(biy $$0) {
      return 1.5 + (double)$$0.df() * 2.0;
   }

   @Override
   public boolean m(ciy $$0) {
      return $$0.a(apt.aA);
   }

   @Override
   public boolean a(cbn $$0) {
      return true;
   }

   @Override
   protected void V() {
      this.dK().ad().a("axolotlBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("axolotlActivityUpdate");
      bvs.a(this);
      this.dK().ad().c();
      if (!this.fQ()) {
         Optional<Integer> $$0 = this.dM().c(bsa.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bke.a gg() {
      return bja.x().a(bkf.a, 14.0).a(bkf.d, 1.0).a(bkf.f, 2.0);
   }

   @Override
   protected bsi b(cpm $$0) {
      return new bsf(this, $$0);
   }

   @Override
   public boolean C(bii $$0) {
      boolean $$1 = $$0.a(this.dL().b((biy)this), (float)((int)this.b(bkf.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aow.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      float $$2 = this.et();
      if (!this.dK().B
         && !this.fQ()
         && this.dK().z.a(3) == 0
         && ((float)this.dK().z.a(3) < $$1 || $$2 / this.eK() < 0.5F)
         && $$1 < $$2
         && this.aX()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gf()) {
         this.bz.a(bsa.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
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
   public bgq b(cbn $$0, bgp $$1) {
      return bum.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(ciy $$0) {
      bum.a(this, $$0);
      qr $$1 = $$0.w();
      $$1.a("Variant", this.fZ().a());
      $$1.a("Age", this.h());
      bjz<?> $$2 = this.dM();
      if ($$2.a(bsa.T)) {
         $$1.a("HuntingCooldown", $$2.e(bsa.T));
      }
   }

   @Override
   public void c(qr $$0) {
      bum.a(this, $$0);
      this.a(bvr.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dM().a(bsa.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public ciy b() {
      return new ciy(cjb.pV);
   }

   @Override
   public aov t() {
      return aow.cC;
   }

   @Override
   public boolean em() {
      return !this.gf() && super.em();
   }

   public static void a(bvr $$0, biy $$1) {
      cpm $$2 = $$0.dK();
      if ($$1.eu()) {
         bhg $$3 = $$1.ev();
         if ($$3 != null) {
            bii $$4 = $$3.d();
            if ($$4 != null && $$4.ag() == bim.bt) {
               cbn $$5 = (cbn)$$4;
               List<cbn> $$6 = $$2.a(cbn.class, $$0.cG().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cbn $$0) {
      bhv $$1 = $$0.b(bhx.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bhv(bhx.j, $$3, 0), this);
      }

      $$0.d(bhx.d);
   }

   @Override
   public boolean R() {
      return super.R() || this.q();
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.ax;
   }

   @Nullable
   @Override
   protected aov h_() {
      return aow.aw;
   }

   @Nullable
   @Override
   protected aov r() {
      return this.aX() ? aow.az : aow.ay;
   }

   @Override
   protected aov aM() {
      return aow.aA;
   }

   @Override
   protected aov aL() {
      return aow.aB;
   }

   @Override
   protected bjz.b<bvr> dN() {
      return bjz.a(bW, bU);
   }

   @Override
   protected bjz<?> a(Dynamic<?> $$0) {
      return bvs.a(this.dN().a($$0));
   }

   @Override
   public bjz<bvr> dM() {
      return (bjz<bvr>)super.dM();
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   @Override
   public void h(ehe $$0) {
      if (this.cW() && this.aX()) {
         this.a(this.fd(), $$0);
         this.a(bje.a, this.dn());
         this.f(this.dn().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   protected void a(cbn $$0, bgp $$1, ciy $$2) {
      if ($$2.a(cjb.pU)) {
         $$0.a($$1, new ciy(cjb.pL));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.q() && !this.ac();
   }

   public static boolean a(bim<? extends biy> $$0, cqb $$1, bjc $$2, gu $$3, aru $$4) {
      return $$1.a_($$3.d()).a(apl.bQ);
   }

   public static class a extends bid.a {
      public final bvr.d[] a;

      public a(bvr.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bvr.d a(aru $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends boy {
      public b(bvr $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bvr.this.gf()) {
            super.a();
         }
      }
   }

   static class c extends boz {
      private final bvr l;

      public c(bvr $$0) {
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

   public static enum d implements ash {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bvr.d> g = aqk.a(bvr.d::a, values(), aqk.a.a);
      public static final Codec<bvr.d> f = ash.a(bvr.d::values);
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

      public static bvr.d a(int $$0) {
         return g.apply($$0);
      }

      public static bvr.d a(aru $$0) {
         return a($$0, true);
      }

      public static bvr.d b(aru $$0) {
         return a($$0, false);
      }

      private static bvr.d a(aru $$0, boolean $$1) {
         bvr.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bvr.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
