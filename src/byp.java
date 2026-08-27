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

public class byp extends bxi implements blt, bmt<byp.d>, bxk {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bwd<? extends bwc<? super byp>>> bU = ImmutableList.of(bwd.c, bwd.n, bwd.f, bwd.o, bwd.p);
   protected static final ImmutableList<? extends bux<?>> bW = ImmutableList.of(
      bux.r, bux.g, bux.h, bux.k, bux.l, bux.n, bux.m, bux.E, bux.t, bux.o, bux.p, bux.J, new bux[]{bux.y, bux.M, bux.B, bux.N, bux.O, bux.Q, bux.T, bux.Y}
   );
   private static final afz<Integer> ca = agc.a(byp.class, agb.b);
   private static final afz<Boolean> cb = agc.a(byp.class, agb.k);
   private static final afz<Boolean> cc = agc.a(byp.class, agb.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public byp(blj<? extends byp> $$0, csy $$1) {
      super($$0, $$1);
      this.a(eek.j, 0.0F);
      this.bL = new byp.c(this);
      this.bK = new byp.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(hv $$0, ctb $$1) {
      return 0.0F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("Variant", this.ge().a());
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.a(byp.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gk()) {
         super.R();
      }
   }

   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      boolean $$5 = false;
      if ($$2 == blz.l) {
         return $$3;
      } else {
         auf $$6 = $$0.F_();
         if ($$3 instanceof byp.a) {
            if (((byp.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new byp.a(byp.d.a($$6), byp.d.a($$6));
         }

         this.a(((byp.a)$$3).a($$6));
         if ($$5) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void as() {
      int $$0 = this.ci();
      super.as();
      if (!this.fU()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bx() && !this.bb()) {
         this.j($$0 - 1);
         if (this.ci() == -20) {
            this.j(0);
            this.a(this.dN().r(), 2.0F);
         }
      } else {
         this.j(this.ch());
      }
   }

   @Override
   public void u() {
      int $$0 = this.ci() + 1800;
      this.j(Math.min($$0, this.ch()));
   }

   @Override
   public int ch() {
      return 6000;
   }

   public byp.d ge() {
      return byp.d.a(this.an.b(ca));
   }

   public void a(byp.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(auf $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(ctb $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public bma eS() {
      return bma.e;
   }

   public void x(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gk() {
      return this.an.b(cb);
   }

   @Override
   public boolean w() {
      return this.an.b(cc);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   @Nullable
   @Override
   public bla a(amp $$0, bla $$1) {
      byp $$2 = blj.f.a((csy)$$0);
      if ($$2 != null) {
         byp.d $$3;
         if (a(this.ag)) {
            $$3 = byp.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.ge() : ((byp)$$1).ge();
         }

         $$2.a($$3);
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean m(cmh $$0) {
      return $$0.a(arz.aA);
   }

   @Override
   public boolean a(cer $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dM().ae().a("axolotlBrain");
      this.dO().a((amp)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("axolotlActivityUpdate");
      byq.a(this);
      this.dM().ae().c();
      if (!this.fU()) {
         Optional<Integer> $$0 = this.dO().c(bux.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bna.a gl() {
      return blx.C().a(bnb.l, 14.0).a(bnb.m, 1.0).a(bnb.c, 2.0);
   }

   @Override
   protected bvf b(csy $$0) {
      return new bvc(this, $$0);
   }

   @Override
   public boolean C(blf $$0) {
      boolean $$1 = $$0.a(this.dN().b((blv)this), (float)((int)this.b(bnb.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(arc.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      float $$2 = this.ev();
      if (!this.dM().B
         && !this.fU()
         && this.dM().z.a(3) == 0
         && ((float)this.dM().z.a(3) < $$1 || $$2 / this.eM() < 0.5F)
         && $$1 < $$2
         && this.aZ()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gk()) {
         this.bz.a(bux.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return $$1.b * 0.655F;
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
   public bjl b(cer $$0, bjk $$1) {
      return bxk.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cmh $$0) {
      bxk.a(this, $$0);
      sj $$1 = $$0.w();
      $$1.a("Variant", this.ge().a());
      $$1.a("Age", this.h());
      bmv<?> $$2 = this.dO();
      if ($$2.a(bux.T)) {
         $$1.a("HuntingCooldown", $$2.e(bux.T));
      }
   }

   @Override
   public void c(sj $$0) {
      bxk.a(this, $$0);
      this.a(byp.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dO().a(bux.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cmh b() {
      return new cmh(cmk.qG);
   }

   @Override
   public arb A() {
      return arc.cL;
   }

   @Override
   public boolean eo() {
      return !this.gk() && super.eo();
   }

   public static void a(byp $$0, blv $$1) {
      csy $$2 = $$0.dM();
      if ($$1.ew()) {
         bkd $$3 = $$1.ex();
         if ($$3 != null) {
            blf $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == blj.bv) {
               cer $$5 = (cer)$$4;
               List<cer> $$6 = $$2.a(cer.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cer $$0) {
      bks $$1 = $$0.b(bku.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bks(bku.j, $$3, 0), this);
      }

      $$0.d(bku.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.w();
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.ax;
   }

   @Nullable
   @Override
   protected arb n_() {
      return arc.aw;
   }

   @Nullable
   @Override
   protected arb y() {
      return this.aZ() ? arc.az : arc.ay;
   }

   @Override
   protected arb aO() {
      return arc.aA;
   }

   @Override
   protected arb aN() {
      return arc.aB;
   }

   @Override
   protected bmv.b<byp> dP() {
      return bmv.a(bW, bU);
   }

   @Override
   protected bmv<?> a(Dynamic<?> $$0) {
      return byq.a(this.dP().a($$0));
   }

   @Override
   public bmv<byp> dO() {
      return (bmv<byp>)super.dO();
   }

   @Override
   protected void Y() {
      super.Y();
      acv.a(this);
   }

   @Override
   public void a(elb $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bmb.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cer $$0, bjk $$1, cmh $$2) {
      if ($$2.a(cmk.qF)) {
         $$0.a($$1, new cmh(cmk.qw));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   public static boolean a(blj<? extends blv> $$0, ctn $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.a_($$3.d()).a(arr.bQ);
   }

   public static class a extends bla.a {
      public final byp.d[] a;

      public a(byp.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public byp.d a(auf $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends brv {
      public b(byp $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!byp.this.gk()) {
            super.a();
         }
      }
   }

   static class c extends brw {
      private final byp l;

      public c(byp $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gk()) {
            super.a();
         }
      }
   }

   public static enum d implements aut {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<byp.d> g = asq.a(byp.d::a, values(), asq.a.a);
      public static final Codec<byp.d> f = aut.a(byp.d::values);
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

      public static byp.d a(int $$0) {
         return g.apply($$0);
      }

      public static byp.d a(auf $$0) {
         return a($$0, true);
      }

      public static byp.d b(auf $$0) {
         return a($$0, false);
      }

      private static byp.d a(auf $$0, boolean $$1) {
         byp.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(byp.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
