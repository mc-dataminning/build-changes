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

public class byz extends bxs implements bmd, bnd<byz.d>, bxu {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bwn<? extends bwm<? super byz>>> bU = ImmutableList.of(bwn.c, bwn.n, bwn.f, bwn.o, bwn.p);
   protected static final ImmutableList<? extends bvh<?>> bW = ImmutableList.of(
      bvh.r, bvh.g, bvh.h, bvh.k, bvh.l, bvh.n, bvh.m, bvh.E, bvh.t, bvh.o, bvh.p, bvh.J, new bvh[]{bvh.y, bvh.M, bvh.B, bvh.N, bvh.O, bvh.Q, bvh.T, bvh.Y}
   );
   private static final agj<Integer> ca = agm.a(byz.class, agl.b);
   private static final agj<Boolean> cb = agm.a(byz.class, agl.k);
   private static final agj<Boolean> cc = agm.a(byz.class, agl.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public byz(blt<? extends byz> $$0, cti $$1) {
      super($$0, $$1);
      this.a(eev.j, 0.0F);
      this.bL = new byz.c(this);
      this.bK = new byz.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(hx $$0, ctl $$1) {
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
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Variant", this.ge().a());
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.a(byz.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gk()) {
         super.R();
      }
   }

   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      boolean $$5 = false;
      if ($$2 == bmj.l) {
         return $$3;
      } else {
         aup $$6 = $$0.F_();
         if ($$3 instanceof byz.a) {
            if (((byz.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new byz.a(byz.d.a($$6), byz.d.a($$6));
         }

         this.a(((byz.a)$$3).a($$6));
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

   public byz.d ge() {
      return byz.d.a(this.an.b(ca));
   }

   public void a(byz.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(aup $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(ctl $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public bmk eS() {
      return bmk.e;
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
   public blk a(amz $$0, blk $$1) {
      byz $$2 = blt.f.a((cti)$$0);
      if ($$2 != null) {
         byz.d $$3;
         if (a(this.ag)) {
            $$3 = byz.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.ge() : ((byz)$$1).ge();
         }

         $$2.a($$3);
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean m(cmr $$0) {
      return $$0.a(asj.aA);
   }

   @Override
   public boolean a(cfb $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dM().af().a("axolotlBrain");
      this.dO().a((amz)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("axolotlActivityUpdate");
      bza.a(this);
      this.dM().af().c();
      if (!this.fU()) {
         Optional<Integer> $$0 = this.dO().c(bvh.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bnk.a gl() {
      return bmh.C().a(bnl.l, 14.0).a(bnl.m, 1.0).a(bnl.c, 2.0);
   }

   @Override
   protected bvp b(cti $$0) {
      return new bvm(this, $$0);
   }

   @Override
   public boolean C(blp $$0) {
      boolean $$1 = $$0.a(this.dN().b((bmf)this), (float)((int)this.b(bnl.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(arm.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      float $$2 = this.ev();
      if (!this.dM().B
         && !this.fU()
         && this.dM().z.a(3) == 0
         && ((float)this.dM().z.a(3) < $$1 || $$2 / this.eM() < 0.5F)
         && $$1 < $$2
         && this.aZ()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gk()) {
         this.bz.a(bvh.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
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
   public bjv b(cfb $$0, bju $$1) {
      return bxu.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cmr $$0) {
      bxu.a(this, $$0);
      sl $$1 = $$0.w();
      $$1.a("Variant", this.ge().a());
      $$1.a("Age", this.h());
      bnf<?> $$2 = this.dO();
      if ($$2.a(bvh.T)) {
         $$1.a("HuntingCooldown", $$2.e(bvh.T));
      }
   }

   @Override
   public void c(sl $$0) {
      bxu.a(this, $$0);
      this.a(byz.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dO().a(bvh.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cmr b() {
      return new cmr(cmu.qG);
   }

   @Override
   public arl A() {
      return arm.cL;
   }

   @Override
   public boolean eo() {
      return !this.gk() && super.eo();
   }

   public static void a(byz $$0, bmf $$1) {
      cti $$2 = $$0.dM();
      if ($$1.ew()) {
         bkn $$3 = $$1.ex();
         if ($$3 != null) {
            blp $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == blt.bv) {
               cfb $$5 = (cfb)$$4;
               List<cfb> $$6 = $$2.a(cfb.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cfb $$0) {
      blc $$1 = $$0.b(ble.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new blc(ble.j, $$3, 0), this);
      }

      $$0.d(ble.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.w();
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.ax;
   }

   @Nullable
   @Override
   protected arl n_() {
      return arm.aw;
   }

   @Nullable
   @Override
   protected arl y() {
      return this.aZ() ? arm.az : arm.ay;
   }

   @Override
   protected arl aO() {
      return arm.aA;
   }

   @Override
   protected arl aN() {
      return arm.aB;
   }

   @Override
   protected bnf.b<byz> dP() {
      return bnf.a(bW, bU);
   }

   @Override
   protected bnf<?> a(Dynamic<?> $$0) {
      return bza.a(this.dP().a($$0));
   }

   @Override
   public bnf<byz> dO() {
      return (bnf<byz>)super.dO();
   }

   @Override
   protected void Y() {
      super.Y();
      adf.a(this);
   }

   @Override
   public void a(elm $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bml.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cfb $$0, bju $$1, cmr $$2) {
      if ($$2.a(cmu.qF)) {
         $$0.a($$1, new cmr(cmu.qw));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   public static boolean a(blt<? extends bmf> $$0, ctx $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.a_($$3.d()).a(asb.bQ);
   }

   public static class a extends blk.a {
      public final byz.d[] a;

      public a(byz.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public byz.d a(aup $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bsf {
      public b(byz $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!byz.this.gk()) {
            super.a();
         }
      }
   }

   static class c extends bsg {
      private final byz l;

      public c(byz $$0) {
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

   public static enum d implements ave {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<byz.d> g = ata.a(byz.d::a, values(), ata.a.a);
      public static final Codec<byz.d> f = ave.a(byz.d::values);
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

      public static byz.d a(int $$0) {
         return g.apply($$0);
      }

      public static byz.d a(aup $$0) {
         return a($$0, true);
      }

      public static byz.d b(aup $$0) {
         return a($$0, false);
      }

      private static byz.d a(aup $$0, boolean $$1) {
         byz.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(byz.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
