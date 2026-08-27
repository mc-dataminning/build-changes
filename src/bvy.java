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

public class bvy extends bur implements bje, bke<bvy.d>, but {
   public static final int bT = 200;
   protected static final ImmutableList<? extends btm<? extends btl<? super bvy>>> bU = ImmutableList.of(btm.c, btm.n, btm.f, btm.o, btm.p);
   protected static final ImmutableList<? extends bsh<?>> bW = ImmutableList.of(
      bsh.r, bsh.g, bsh.h, bsh.k, bsh.l, bsh.n, bsh.m, bsh.E, bsh.t, bsh.o, bsh.p, bsh.J, new bsh[]{bsh.y, bsh.M, bsh.B, bsh.N, bsh.O, bsh.Q, bsh.T, bsh.Y}
   );
   private static final aef<Integer> ca = aei.a(bvy.class, aeh.b);
   private static final aef<Boolean> cb = aei.a(bvy.class, aeh.k);
   private static final aef<Boolean> cc = aei.a(bvy.class, aeh.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public bvy(biu<? extends bvy> $$0, cpv $$1) {
      super($$0, $$1);
      this.a(eax.j, 0.0F);
      this.bL = new bvy.c(this);
      this.bK = new bvy.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(gw $$0, cpy $$1) {
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
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gd().a());
      $$0.a("FromBucket", this.t());
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.a(bvy.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gj()) {
         super.P();
      }
   }

   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      boolean $$5 = false;
      if ($$2 == bjk.l) {
         return $$3;
      } else {
         asc $$6 = $$0.D_();
         if ($$3 instanceof bvy.a) {
            if (((bvy.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bvy.a(bvy.d.a($$6), bvy.d.a($$6));
         }

         this.a(((bvy.a)$$3).a($$6));
         if ($$5) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void ar() {
      int $$0 = this.ci();
      super.ar();
      if (!this.fT()) {
         this.t($$0);
      }
   }

   protected void t(int $$0) {
      if (this.bw() && !this.ba()) {
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
   public void s() {
      int $$0 = this.ci() + 1800;
      this.j(Math.min($$0, this.ch()));
   }

   @Override
   public int ch() {
      return 6000;
   }

   public bvy.d gd() {
      return bvy.d.a(this.an.b(ca));
   }

   public void a(bvy.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(asc $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cpy $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean dQ() {
      return true;
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public bjl eR() {
      return bjl.e;
   }

   public void x(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gj() {
      return this.an.b(cb);
   }

   @Override
   public boolean t() {
      return this.an.b(cc);
   }

   @Override
   public void w(boolean $$0) {
      this.an.b(cc, $$0);
   }

   @Nullable
   @Override
   public bil a(akr $$0, bil $$1) {
      bvy $$2 = biu.f.a((cpv)$$0);
      if ($$2 != null) {
         bvy.d $$3;
         if (a(this.ag)) {
            $$3 = bvy.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.gd() : ((bvy)$$1).gd();
         }

         $$2.a($$3);
         $$2.fI();
      }

      return $$2;
   }

   @Override
   public boolean m(cjf $$0) {
      return $$0.a(aqb.aA);
   }

   @Override
   public boolean a(cbu $$0) {
      return true;
   }

   @Override
   protected void Y() {
      this.dL().ad().a("axolotlBrain");
      this.dN().a((akr)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("axolotlActivityUpdate");
      bvz.a(this);
      this.dL().ad().c();
      if (!this.fT()) {
         Optional<Integer> $$0 = this.dN().c(bsh.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bkl.a gk() {
      return bji.A().a(bkm.a, 14.0).a(bkm.d, 1.0).a(bkm.f, 2.0);
   }

   @Override
   protected bsp b(cpv $$0) {
      return new bsm(this, $$0);
   }

   @Override
   public boolean C(biq $$0) {
      boolean $$1 = $$0.a(this.dM().b((bjg)this), (float)((int)this.b(bkm.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(ape.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      float $$2 = this.eu();
      if (!this.dL().B
         && !this.fT()
         && this.dL().z.a(3) == 0
         && ((float)this.dL().z.a(3) < $$1 || $$2 / this.eL() < 0.5F)
         && $$1 < $$2
         && this.aY()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gj()) {
         this.bz.a(bsh.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return $$1.b * 0.655F;
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      return but.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cjf $$0) {
      but.a(this, $$0);
      qx $$1 = $$0.w();
      $$1.a("Variant", this.gd().a());
      $$1.a("Age", this.h());
      bkg<?> $$2 = this.dN();
      if ($$2.a(bsh.T)) {
         $$1.a("HuntingCooldown", $$2.e(bsh.T));
      }
   }

   @Override
   public void c(qx $$0) {
      but.a(this, $$0);
      this.a(bvy.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dN().a(bsh.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cjf b() {
      return new cjf(cji.pV);
   }

   @Override
   public apd y() {
      return ape.cC;
   }

   @Override
   public boolean en() {
      return !this.gj() && super.en();
   }

   public static void a(bvy $$0, bjg $$1) {
      cpv $$2 = $$0.dL();
      if ($$1.ev()) {
         bho $$3 = $$1.ew();
         if ($$3 != null) {
            biq $$4 = $$3.d();
            if ($$4 != null && $$4.ah() == biu.bt) {
               cbu $$5 = (cbu)$$4;
               List<cbu> $$6 = $$2.a(cbu.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cbu $$0) {
      bid $$1 = $$0.b(bif.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bid(bif.j, $$3, 0), this);
      }

      $$0.d(bif.d);
   }

   @Override
   public boolean U() {
      return super.U() || this.t();
   }

   @Override
   protected apd d(bho $$0) {
      return ape.ax;
   }

   @Nullable
   @Override
   protected apd l_() {
      return ape.aw;
   }

   @Nullable
   @Override
   protected apd w() {
      return this.aY() ? ape.az : ape.ay;
   }

   @Override
   protected apd aN() {
      return ape.aA;
   }

   @Override
   protected apd aM() {
      return ape.aB;
   }

   @Override
   protected bkg.b<bvy> dO() {
      return bkg.a(bW, bU);
   }

   @Override
   protected bkg<?> a(Dynamic<?> $$0) {
      return bvz.a(this.dO().a($$0));
   }

   @Override
   public bkg<bvy> dN() {
      return (bkg<bvy>)super.dN();
   }

   @Override
   protected void X() {
      super.X();
      abc.a(this);
   }

   @Override
   public void h(ehn $$0) {
      if (this.cX() && this.aY()) {
         this.a(this.fe(), $$0);
         this.a(bjm.a, this.do());
         this.f(this.do().a(0.9));
      } else {
         super.h($$0);
      }
   }

   @Override
   protected void a(cbu $$0, bgx $$1, cjf $$2) {
      if ($$2.a(cji.pU)) {
         $$0.a($$1, new cjf(cji.pL));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && !this.ad();
   }

   public static boolean a(biu<? extends bjg> $$0, cqk $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.a_($$3.d()).a(apt.bQ);
   }

   public static class a extends bil.a {
      public final bvy.d[] a;

      public a(bvy.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bvy.d a(asc $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bpf {
      public b(bvy $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bvy.this.gj()) {
            super.a();
         }
      }
   }

   static class c extends bpg {
      private final bvy l;

      public c(bvy $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gj()) {
            super.a();
         }
      }
   }

   public static enum d implements asp {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bvy.d> g = aqs.a(bvy.d::a, values(), aqs.a.a);
      public static final Codec<bvy.d> f = asp.a(bvy.d::values);
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

      public static bvy.d a(int $$0) {
         return g.apply($$0);
      }

      public static bvy.d a(asc $$0) {
         return a($$0, true);
      }

      public static bvy.d b(asc $$0) {
         return a($$0, false);
      }

      private static bvy.d a(asc $$0, boolean $$1) {
         bvy.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bvy.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
