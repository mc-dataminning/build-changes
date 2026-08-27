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

public class bzm extends byc implements bmm, bnm<bzm.d>, bye {
   public static final int bU = 200;
   protected static final ImmutableList<? extends bwx<? extends bww<? super bzm>>> bV = ImmutableList.of(bwx.c, bwx.o, bwx.f, bwx.p, bwx.q);
   protected static final ImmutableList<? extends bvq<?>> bX = ImmutableList.of(
      bvq.r, bvq.g, bvq.h, bvq.k, bvq.l, bvq.n, bvq.m, bvq.E, bvq.t, bvq.o, bvq.p, bvq.K, new bvq[]{bvq.y, bvq.N, bvq.B, bvq.O, bvq.P, bvq.R, bvq.U, bvq.Z}
   );
   private static final agn<Integer> cb = agq.a(bzm.class, agp.b);
   private static final agn<Boolean> cc = agq.a(bzm.class, agp.k);
   private static final agn<Boolean> cd = agq.a(bzm.class, agp.k);
   public static final double bY = 20.0;
   public static final int bZ = 1200;
   private static final int ce = 6000;
   public static final String ca = "Variant";
   private static final int cf = 1800;
   private static final int cg = 2400;
   private final Map<String, Vector3f> ch = Maps.newHashMap();
   private static final int ci = 100;

   public bzm(bmc<? extends bzm> $$0, ctx $$1) {
      super($$0, $$1);
      this.a(efk.j, 0.0F);
      this.bM = new bzm.c(this);
      this.bL = new bzm.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.ch;
   }

   @Override
   public float a(hx $$0, cua $$1) {
      return 0.0F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(cb, 0);
      this.an.a(cc, false);
      this.an.a(cd, false);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Variant", this.gf().a());
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a(bzm.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gl()) {
         super.R();
      }
   }

   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      boolean $$5 = false;
      if ($$2 == bms.l) {
         return $$3;
      } else {
         auw $$6 = $$0.F_();
         if ($$3 instanceof bzm.a) {
            if (((bzm.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bzm.a(bzm.d.a($$6), bzm.d.a($$6));
         }

         this.a(((bzm.a)$$3).a($$6));
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
      if (!this.fV()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bx() && !this.bb()) {
         this.j($$0 - 1);
         if (this.ci() == -20) {
            this.j(0);
            this.a(this.dM().r(), 2.0F);
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

   public bzm.d gf() {
      return bzm.d.a(this.an.b(cb));
   }

   public void a(bzm.d $$0) {
      this.an.b(cb, $$0.a());
   }

   private static boolean a(auw $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cua $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public bmt eS() {
      return bmt.e;
   }

   public void x(boolean $$0) {
      this.an.b(cc, $$0);
   }

   public boolean gl() {
      return this.an.b(cc);
   }

   @Override
   public boolean w() {
      return this.an.b(cd);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(cd, $$0);
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      bzm $$2 = bmc.g.a((ctx)$$0);
      if ($$2 != null) {
         bzm.d $$3;
         if (a(this.ag)) {
            $$3 = bzm.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.gf() : ((bzm)$$1).gf();
         }

         $$2.a($$3);
         $$2.fK();
      }

      return $$2;
   }

   @Override
   public boolean m(cng $$0) {
      return $$0.a(asq.aA);
   }

   @Override
   public boolean a(cfq $$0) {
      return true;
   }

   @Override
   protected void aa() {
      this.dL().af().a("axolotlBrain");
      this.dN().a((ane)this.dL(), this);
      this.dL().af().c();
      this.dL().af().a("axolotlActivityUpdate");
      bzn.a(this);
      this.dL().af().c();
      if (!this.fV()) {
         Optional<Integer> $$0 = this.dN().c(bvq.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bnt.a gm() {
      return bmq.C().a(bnu.n, 14.0).a(bnu.o, 1.0).a(bnu.c, 2.0).a(bnu.r, 1.0);
   }

   @Override
   protected bvy b(ctx $$0) {
      return new bvv(this, $$0);
   }

   @Override
   public boolean B(blw $$0) {
      boolean $$1 = $$0.a(this.dM().b((bmo)this), (float)((int)this.g(bnu.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(art.aH, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      float $$2 = this.ev();
      if (!this.dL().B
         && !this.fV()
         && this.dL().z.a(3) == 0
         && ((float)this.dL().z.a(3) < $$1 || $$2 / this.eM() < 0.5F)
         && $$1 < $$2
         && this.aZ()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gl()) {
         this.bz.a(bvq.N, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   public int ab() {
      return 1;
   }

   @Override
   public int fH() {
      return 1;
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      return bye.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cng $$0) {
      bye.a(this, $$0);
      so $$1 = $$0.w();
      $$1.a("Variant", this.gf().a());
      $$1.a("Age", this.h());
      bno<?> $$2 = this.dN();
      if ($$2.a(bvq.U)) {
         $$1.a("HuntingCooldown", $$2.e(bvq.U));
      }
   }

   @Override
   public void c(so $$0) {
      bye.a(this, $$0);
      this.a(bzm.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dN().a(bvq.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cng b() {
      return new cng(cnj.qI);
   }

   @Override
   public ars A() {
      return art.da;
   }

   @Override
   public boolean eo() {
      return !this.gl() && super.eo();
   }

   public static void a(bzm $$0, bmo $$1) {
      ctx $$2 = $$0.dL();
      if ($$1.ew()) {
         bkv $$3 = $$1.ex();
         if ($$3 != null) {
            blw $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == bmc.bw) {
               cfq $$5 = (cfq)$$4;
               List<cfq> $$6 = $$2.a(cfq.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cfq $$0) {
      blj $$1 = $$0.c(bll.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.c() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new blj(bll.j, $$3, 0), this);
      }

      $$0.e(bll.d);
   }

   @Override
   public boolean X() {
      return super.X() || this.w();
   }

   @Override
   protected ars d(bkv $$0) {
      return art.aJ;
   }

   @Nullable
   @Override
   protected ars n_() {
      return art.aI;
   }

   @Nullable
   @Override
   protected ars y() {
      return this.aZ() ? art.aL : art.aK;
   }

   @Override
   protected ars aO() {
      return art.aM;
   }

   @Override
   protected ars aN() {
      return art.aN;
   }

   @Override
   protected bno.b<bzm> dO() {
      return bno.a(bX, bV);
   }

   @Override
   protected bno<?> a(Dynamic<?> $$0) {
      return bzn.a(this.dO().a($$0));
   }

   @Override
   public bno<bzm> dN() {
      return (bno<bzm>)super.dN();
   }

   @Override
   protected void Z() {
      super.Z();
      adj.a(this);
   }

   @Override
   public void a(emc $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bmu.a, this.do());
         this.g(this.do().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cfq $$0, bkb $$1, cng $$2) {
      if ($$2.a(cnj.qH)) {
         $$0.a($$1, new cng(cnj.qy));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   public static boolean a(bmc<? extends bmo> $$0, cum $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.a_($$3.d()).a(asi.bQ);
   }

   public static class a extends blr.a {
      public final bzm.d[] a;

      public a(bzm.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bzm.d a(auw $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bso {
      public b(bzm $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bzm.this.gl()) {
            super.a();
         }
      }
   }

   static class c extends bsp {
      private final bzm l;

      public c(bzm $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gl()) {
            super.a();
         }
      }
   }

   public static enum d implements avl {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bzm.d> g = ath.a(bzm.d::a, values(), ath.a.a);
      public static final Codec<bzm.d> f = avl.a(bzm.d::values);
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

      public static bzm.d a(int $$0) {
         return g.apply($$0);
      }

      public static bzm.d a(auw $$0) {
         return a($$0, true);
      }

      public static bzm.d b(auw $$0) {
         return a($$0, false);
      }

      private static bzm.d a(auw $$0, boolean $$1) {
         bzm.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bzm.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
