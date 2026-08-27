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

public class bze extends bxx implements bmi, bni<bze.d>, bxz {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bws<? extends bwr<? super bze>>> bU = ImmutableList.of(bws.c, bws.n, bws.f, bws.o, bws.p);
   protected static final ImmutableList<? extends bvm<?>> bW = ImmutableList.of(
      bvm.r, bvm.g, bvm.h, bvm.k, bvm.l, bvm.n, bvm.m, bvm.E, bvm.t, bvm.o, bvm.p, bvm.J, new bvm[]{bvm.y, bvm.M, bvm.B, bvm.N, bvm.O, bvm.Q, bvm.T, bvm.Y}
   );
   private static final agm<Integer> ca = agp.a(bze.class, ago.b);
   private static final agm<Boolean> cb = agp.a(bze.class, ago.k);
   private static final agm<Boolean> cc = agp.a(bze.class, ago.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public bze(bly<? extends bze> $$0, cto $$1) {
      super($$0, $$1);
      this.a(efb.j, 0.0F);
      this.bL = new bze.c(this);
      this.bK = new bze.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(hx $$0, ctr $$1) {
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
      this.a(bze.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gk()) {
         super.R();
      }
   }

   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      boolean $$5 = false;
      if ($$2 == bmo.l) {
         return $$3;
      } else {
         auu $$6 = $$0.F_();
         if ($$3 instanceof bze.a) {
            if (((bze.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bze.a(bze.d.a($$6), bze.d.a($$6));
         }

         this.a(((bze.a)$$3).a($$6));
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

   public bze.d ge() {
      return bze.d.a(this.an.b(ca));
   }

   public void a(bze.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(auu $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(ctr $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public bmp eS() {
      return bmp.e;
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
   public blp a(and $$0, blp $$1) {
      bze $$2 = bly.f.a((cto)$$0);
      if ($$2 != null) {
         bze.d $$3;
         if (a(this.ag)) {
            $$3 = bze.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.ge() : ((bze)$$1).ge();
         }

         $$2.a($$3);
         $$2.fJ();
      }

      return $$2;
   }

   @Override
   public boolean m(cmx $$0) {
      return $$0.a(aso.aA);
   }

   @Override
   public boolean a(cfh $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dM().af().a("axolotlBrain");
      this.dO().a((and)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("axolotlActivityUpdate");
      bzf.a(this);
      this.dM().af().c();
      if (!this.fU()) {
         Optional<Integer> $$0 = this.dO().c(bvm.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bnp.a gl() {
      return bmm.C().a(bnq.l, 14.0).a(bnq.m, 1.0).a(bnq.c, 2.0);
   }

   @Override
   protected bvu b(cto $$0) {
      return new bvr(this, $$0);
   }

   @Override
   public boolean C(blu $$0) {
      boolean $$1 = $$0.a(this.dN().b((bmk)this), (float)((int)this.b(bnq.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(arr.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bks $$0, float $$1) {
      float $$2 = this.ev();
      if (!this.dM().B
         && !this.fU()
         && this.dM().z.a(3) == 0
         && ((float)this.dM().z.a(3) < $$1 || $$2 / this.eM() < 0.5F)
         && $$1 < $$2
         && this.aZ()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gk()) {
         this.bz.a(bvm.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
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
   public bka b(cfh $$0, bjz $$1) {
      return bxz.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cmx $$0) {
      bxz.a(this, $$0);
      sn $$1 = $$0.w();
      $$1.a("Variant", this.ge().a());
      $$1.a("Age", this.h());
      bnk<?> $$2 = this.dO();
      if ($$2.a(bvm.T)) {
         $$1.a("HuntingCooldown", $$2.e(bvm.T));
      }
   }

   @Override
   public void c(sn $$0) {
      bxz.a(this, $$0);
      this.a(bze.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dO().a(bvm.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cmx b() {
      return new cmx(cna.qG);
   }

   @Override
   public arq A() {
      return arr.cL;
   }

   @Override
   public boolean eo() {
      return !this.gk() && super.eo();
   }

   public static void a(bze $$0, bmk $$1) {
      cto $$2 = $$0.dM();
      if ($$1.ew()) {
         bks $$3 = $$1.ex();
         if ($$3 != null) {
            blu $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == bly.bv) {
               cfh $$5 = (cfh)$$4;
               List<cfh> $$6 = $$2.a(cfh.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cfh $$0) {
      blh $$1 = $$0.b(blj.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new blh(blj.j, $$3, 0), this);
      }

      $$0.d(blj.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.w();
   }

   @Override
   protected arq d(bks $$0) {
      return arr.ax;
   }

   @Nullable
   @Override
   protected arq n_() {
      return arr.aw;
   }

   @Nullable
   @Override
   protected arq y() {
      return this.aZ() ? arr.az : arr.ay;
   }

   @Override
   protected arq aO() {
      return arr.aA;
   }

   @Override
   protected arq aN() {
      return arr.aB;
   }

   @Override
   protected bnk.b<bze> dP() {
      return bnk.a(bW, bU);
   }

   @Override
   protected bnk<?> a(Dynamic<?> $$0) {
      return bzf.a(this.dP().a($$0));
   }

   @Override
   public bnk<bze> dO() {
      return (bnk<bze>)super.dO();
   }

   @Override
   protected void Y() {
      super.Y();
      adi.a(this);
   }

   @Override
   public void a(els $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bmq.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cfh $$0, bjz $$1, cmx $$2) {
      if ($$2.a(cna.qF)) {
         $$0.a($$1, new cmx(cna.qw));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   public static boolean a(bly<? extends bmk> $$0, cud $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.a_($$3.d()).a(asg.bQ);
   }

   public static class a extends blp.a {
      public final bze.d[] a;

      public a(bze.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bze.d a(auu $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bsk {
      public b(bze $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bze.this.gk()) {
            super.a();
         }
      }
   }

   static class c extends bsl {
      private final bze l;

      public c(bze $$0) {
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

   public static enum d implements avj {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bze.d> g = atf.a(bze.d::a, values(), atf.a.a);
      public static final Codec<bze.d> f = avj.a(bze.d::values);
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

      public static bze.d a(int $$0) {
         return g.apply($$0);
      }

      public static bze.d a(auu $$0) {
         return a($$0, true);
      }

      public static bze.d b(auu $$0) {
         return a($$0, false);
      }

      private static bze.d a(auu $$0, boolean $$1) {
         bze.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bze.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
