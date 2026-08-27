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

public class cbd extends bzt implements boe, bpd<cbd.d>, bzv {
   public static final int bT = 200;
   protected static final ImmutableList<? extends byo<? extends byn<? super cbd>>> bU = ImmutableList.of(byo.c, byo.o, byo.f, byo.p, byo.q);
   protected static final ImmutableList<? extends bxh<?>> bW = ImmutableList.of(
      bxh.r, bxh.g, bxh.h, bxh.k, bxh.l, bxh.n, bxh.m, bxh.E, bxh.t, bxh.o, bxh.p, bxh.K, new bxh[]{bxh.y, bxh.N, bxh.B, bxh.O, bxh.P, bxh.R, bxh.U, bxh.Z}
   );
   private static final aie<Integer> ca = aih.a(cbd.class, aig.b);
   private static final aie<Boolean> cb = aih.a(cbd.class, aig.k);
   private static final aie<Boolean> cc = aih.a(cbd.class, aig.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public cbd(bnu<? extends cbd> $$0, cvn $$1) {
      super($$0, $$1);
      this.a(eha.j, 0.0F);
      this.bL = new cbd.c(this);
      this.bK = new cbd.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(hz $$0, cvq $$1) {
      return 0.0F;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(ca, 0);
      this.am.a(cb, false);
      this.am.a(cc, false);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Variant", this.gg().a());
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a(cbd.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gm()) {
         super.R();
      }
   }

   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      boolean $$5 = false;
      if ($$2 == bok.l) {
         return $$3;
      } else {
         awo $$6 = $$0.F_();
         if ($$3 instanceof cbd.a) {
            if (((cbd.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new cbd.a(cbd.d.a($$6), cbd.d.a($$6));
         }

         this.a(((cbd.a)$$3).a($$6));
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
      if (!this.fW()) {
         this.u($$0);
      }
   }

   protected void u(int $$0) {
      if (this.bx() && !this.bb()) {
         this.k($$0 - 1);
         if (this.ci() == -20) {
            this.k(0);
            this.a(this.dN().r(), 2.0F);
         }
      } else {
         this.k(this.ch());
      }
   }

   @Override
   public void u() {
      int $$0 = this.ci() + 1800;
      this.k(Math.min($$0, this.ch()));
   }

   @Override
   public int ch() {
      return 6000;
   }

   public cbd.d gg() {
      return cbd.d.a(this.am.b(ca));
   }

   public void a(cbd.d $$0) {
      this.am.b(ca, $$0.a());
   }

   private static boolean a(awo $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cvq $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cz() {
      return false;
   }

   public void x(boolean $$0) {
      this.am.b(cb, $$0);
   }

   public boolean gm() {
      return this.am.b(cb);
   }

   @Override
   public boolean w() {
      return this.am.b(cc);
   }

   @Override
   public void w(boolean $$0) {
      this.am.b(cc, $$0);
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      cbd $$2 = bnu.g.a((cvn)$$0);
      if ($$2 != null) {
         cbd.d $$3;
         if (a(this.af)) {
            $$3 = cbd.d.b(this.af);
         } else {
            $$3 = this.af.h() ? this.gg() : ((cbd)$$1).gg();
         }

         $$2.a($$3);
         $$2.fL();
      }

      return $$2;
   }

   @Override
   public boolean m(coz $$0) {
      return $$0.a(auh.aA);
   }

   @Override
   public boolean a(chh $$0) {
      return true;
   }

   @Override
   protected void aa() {
      this.dM().af().a("axolotlBrain");
      this.dO().a((aov)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("axolotlActivityUpdate");
      cbe.a(this);
      this.dM().af().c();
      if (!this.fW()) {
         Optional<Integer> $$0 = this.dO().c(bxh.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bpk.a gn() {
      return boi.C().a(bpl.n, 14.0).a(bpl.o, 1.0).a(bpl.c, 2.0).a(bpl.r, 1.0);
   }

   @Override
   protected bxp b(cvn $$0) {
      return new bxm(this, $$0);
   }

   @Override
   public boolean B(bno $$0) {
      boolean $$1 = $$0.a(this.dN().b((bog)this), (float)((int)this.g(bpl.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(atk.aH, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      float $$2 = this.ew();
      if (!this.dM().B
         && !this.fW()
         && this.dM().z.a(3) == 0
         && ((float)this.dM().z.a(3) < $$1 || $$2 / this.eN() < 0.5F)
         && $$1 < $$2
         && this.aZ()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gm()) {
         this.bz.a(bxh.N, 200);
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
   public blu b(chh $$0, blt $$1) {
      return bzv.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(coz $$0) {
      bzv.a(this, $$0);
      sw $$1 = $$0.x();
      $$1.a("Variant", this.gg().a());
      $$1.a("Age", this.h());
      bpf<?> $$2 = this.dO();
      if ($$2.a(bxh.U)) {
         $$1.a("HuntingCooldown", $$2.e(bxh.U));
      }
   }

   @Override
   public void c(sw $$0) {
      bzv.a(this, $$0);
      this.a(cbd.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dO().a(bxh.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public coz b() {
      return new coz(cpc.qI);
   }

   @Override
   public atj A() {
      return atk.da;
   }

   @Override
   public boolean ep() {
      return !this.gm() && super.ep();
   }

   public static void a(cbd $$0, bog $$1) {
      cvn $$2 = $$0.dM();
      if ($$1.ex()) {
         bmn $$3 = $$1.ey();
         if ($$3 != null) {
            bno $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == bnu.bw) {
               chh $$5 = (chh)$$4;
               List<chh> $$6 = $$2.a(chh.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(chh $$0) {
      bnb $$1 = $$0.c(bnd.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.c() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bnb(bnd.j, $$3, 0), this);
      }

      $$0.e(bnd.d);
   }

   @Override
   public boolean X() {
      return super.X() || this.w();
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.aJ;
   }

   @Nullable
   @Override
   protected atj n_() {
      return atk.aI;
   }

   @Nullable
   @Override
   protected atj y() {
      return this.aZ() ? atk.aL : atk.aK;
   }

   @Override
   protected atj aO() {
      return atk.aM;
   }

   @Override
   protected atj aN() {
      return atk.aN;
   }

   @Override
   protected bpf.b<cbd> dP() {
      return bpf.a(bW, bU);
   }

   @Override
   protected bpf<?> a(Dynamic<?> $$0) {
      return cbe.a(this.dP().a($$0));
   }

   @Override
   public bpf<cbd> dO() {
      return (bpf<cbd>)super.dO();
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   public void a(ens $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bol.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(chh $$0, blt $$1, coz $$2) {
      if ($$2.a(cpc.qH)) {
         $$0.a($$1, new coz(cpc.qy));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   public static boolean a(bnu<? extends bog> $$0, cwc $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.a_($$3.d()).a(atz.bR);
   }

   public static class a extends bnj.a {
      public final cbd.d[] a;

      public a(cbd.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cbd.d a(awo $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends buf {
      public b(cbd $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cbd.this.gm()) {
            super.a();
         }
      }
   }

   static class c extends bug {
      private final cbd l;

      public c(cbd $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gm()) {
            super.a();
         }
      }
   }

   public static enum d implements axc {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cbd.d> g = auz.a(cbd.d::a, values(), auz.a.a);
      public static final Codec<cbd.d> f = axc.a(cbd.d::values);
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

      public static cbd.d a(int $$0) {
         return g.apply($$0);
      }

      public static cbd.d a(awo $$0) {
         return a($$0, true);
      }

      public static cbd.d b(awo $$0) {
         return a($$0, false);
      }

      private static cbd.d a(awo $$0, boolean $$1) {
         cbd.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cbd.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
