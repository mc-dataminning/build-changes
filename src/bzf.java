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

public class bzf extends bxy implements bmj, bnj<bzf.d>, bya {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bwt<? extends bws<? super bzf>>> bU = ImmutableList.of(bwt.c, bwt.n, bwt.f, bwt.o, bwt.p);
   protected static final ImmutableList<? extends bvn<?>> bW = ImmutableList.of(
      bvn.r, bvn.g, bvn.h, bvn.k, bvn.l, bvn.n, bvn.m, bvn.E, bvn.t, bvn.o, bvn.p, bvn.J, new bvn[]{bvn.y, bvn.M, bvn.B, bvn.N, bvn.O, bvn.Q, bvn.T, bvn.Y}
   );
   private static final agm<Integer> ca = agp.a(bzf.class, ago.b);
   private static final agm<Boolean> cb = agp.a(bzf.class, ago.k);
   private static final agm<Boolean> cc = agp.a(bzf.class, ago.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public bzf(blz<? extends bzf> $$0, ctp $$1) {
      super($$0, $$1);
      this.a(efc.j, 0.0F);
      this.bL = new bzf.c(this);
      this.bK = new bzf.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(hx $$0, cts $$1) {
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
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Variant", this.ge().a());
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a(bzf.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gk()) {
         super.R();
      }
   }

   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      boolean $$5 = false;
      if ($$2 == bmp.l) {
         return $$3;
      } else {
         auv $$6 = $$0.F_();
         if ($$3 instanceof bzf.a) {
            if (((bzf.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bzf.a(bzf.d.a($$6), bzf.d.a($$6));
         }

         this.a(((bzf.a)$$3).a($$6));
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

   public bzf.d ge() {
      return bzf.d.a(this.an.b(ca));
   }

   public void a(bzf.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(auv $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cts $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public bmq eS() {
      return bmq.e;
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
   public blq a(and $$0, blq $$1) {
      bzf $$2 = blz.f.a((ctp)$$0);
      if ($$2 != null) {
         bzf.d $$3;
         if (a(this.ag)) {
            $$3 = bzf.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.ge() : ((bzf)$$1).ge();
         }

         $$2.a($$3);
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean m(cmy $$0) {
      return $$0.a(asp.aA);
   }

   @Override
   public boolean a(cfi $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dM().af().a("axolotlBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("axolotlActivityUpdate");
      bzg.a(this);
      this.dM().af().c();
      if (!this.fU()) {
         Optional<Integer> $$0 = this.dO().c(bvn.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bnq.a gl() {
      return bmn.C().a(bnr.l, 14.0).a(bnr.m, 1.0).a(bnr.c, 2.0);
   }

   @Override
   protected bvv b(ctp $$0) {
      return new bvs(this, $$0);
   }

   @Override
   public boolean C(blv $$0) {
      boolean $$1 = $$0.a(this.dN().b((bml)this), (float)((int)this.b(bnr.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(ars.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      float $$2 = this.ev();
      if (!this.dM().B
         && !this.fU()
         && this.dM().z.a(3) == 0
         && ((float)this.dM().z.a(3) < $$1 || $$2 / this.eM() < 0.5F)
         && $$1 < $$2
         && this.aZ()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gk()) {
         this.bz.a(bvn.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
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
   public bkb b(cfi $$0, bka $$1) {
      return bya.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cmy $$0) {
      bya.a(this, $$0);
      sn $$1 = $$0.w();
      $$1.a("Variant", this.ge().a());
      $$1.a("Age", this.h());
      bnl<?> $$2 = this.dO();
      if ($$2.a(bvn.T)) {
         $$1.a("HuntingCooldown", $$2.e(bvn.T));
      }
   }

   @Override
   public void c(sn $$0) {
      bya.a(this, $$0);
      this.a(bzf.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dO().a(bvn.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cmy b() {
      return new cmy(cnb.qG);
   }

   @Override
   public arr A() {
      return ars.cL;
   }

   @Override
   public boolean eo() {
      return !this.gk() && super.eo();
   }

   public static void a(bzf $$0, bml $$1) {
      ctp $$2 = $$0.dM();
      if ($$1.ew()) {
         bkt $$3 = $$1.ex();
         if ($$3 != null) {
            blv $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == blz.bv) {
               cfi $$5 = (cfi)$$4;
               List<cfi> $$6 = $$2.a(cfi.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cfi $$0) {
      bli $$1 = $$0.b(blk.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bli(blk.j, $$3, 0), this);
      }

      $$0.d(blk.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.w();
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.ax;
   }

   @Nullable
   @Override
   protected arr n_() {
      return ars.aw;
   }

   @Nullable
   @Override
   protected arr y() {
      return this.aZ() ? ars.az : ars.ay;
   }

   @Override
   protected arr aO() {
      return ars.aA;
   }

   @Override
   protected arr aN() {
      return ars.aB;
   }

   @Override
   protected bnl.b<bzf> dP() {
      return bnl.a(bW, bU);
   }

   @Override
   protected bnl<?> a(Dynamic<?> $$0) {
      return bzg.a(this.dP().a($$0));
   }

   @Override
   public bnl<bzf> dO() {
      return (bnl<bzf>)super.dO();
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   public void a(elt $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bmr.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cfi $$0, bka $$1, cmy $$2) {
      if ($$2.a(cnb.qF)) {
         $$0.a($$1, new cmy(cnb.qw));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   public static boolean a(blz<? extends bml> $$0, cue $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.a_($$3.d()).a(ash.bQ);
   }

   public static class a extends blq.a {
      public final bzf.d[] a;

      public a(bzf.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bzf.d a(auv $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bsl {
      public b(bzf $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bzf.this.gk()) {
            super.a();
         }
      }
   }

   static class c extends bsm {
      private final bzf l;

      public c(bzf $$0) {
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

   public static enum d implements avk {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bzf.d> g = atg.a(bzf.d::a, values(), atg.a.a);
      public static final Codec<bzf.d> f = avk.a(bzf.d::values);
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

      public static bzf.d a(int $$0) {
         return g.apply($$0);
      }

      public static bzf.d a(auv $$0) {
         return a($$0, true);
      }

      public static bzf.d b(auv $$0) {
         return a($$0, false);
      }

      private static bzf.d a(auv $$0, boolean $$1) {
         bzf.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bzf.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
