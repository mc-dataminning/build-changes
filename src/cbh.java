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

public class cbh extends bzx implements bog, bph<cbh.d>, bzz {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bys<? extends byr<? super cbh>>> bU = ImmutableList.of(bys.c, bys.o, bys.f, bys.p, bys.q);
   protected static final ImmutableList<? extends bxl<?>> bW = ImmutableList.of(
      bxl.r, bxl.g, bxl.h, bxl.k, bxl.l, bxl.n, bxl.m, bxl.E, bxl.t, bxl.o, bxl.p, bxl.K, new bxl[]{bxl.y, bxl.N, bxl.B, bxl.O, bxl.P, bxl.R, bxl.U, bxl.Z}
   );
   private static final aie<Integer> ca = aih.a(cbh.class, aig.b);
   private static final aie<Boolean> cb = aih.a(cbh.class, aig.k);
   private static final aie<Boolean> cc = aih.a(cbh.class, aig.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public cbh(bnw<? extends cbh> $$0, cvr $$1) {
      super($$0, $$1);
      this.a(ehh.j, 0.0F);
      this.bL = new cbh.c(this);
      this.bK = new cbh.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(hz $$0, cvu $$1) {
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
      this.a(cbh.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gm()) {
         super.R();
      }
   }

   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      boolean $$5 = false;
      if ($$2 == bom.l) {
         return $$3;
      } else {
         awp $$6 = $$0.F_();
         if ($$3 instanceof cbh.a) {
            if (((cbh.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new cbh.a(cbh.d.a($$6), cbh.d.a($$6));
         }

         this.a(((cbh.a)$$3).a($$6));
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

   public cbh.d gg() {
      return cbh.d.a(this.am.b(ca));
   }

   public void a(cbh.d $$0) {
      this.am.b(ca, $$0.a());
   }

   private static boolean a(awp $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cvu $$0) {
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
   public bnl a(aow $$0, bnl $$1) {
      cbh $$2 = bnw.g.a((cvr)$$0);
      if ($$2 != null) {
         cbh.d $$3;
         if (a(this.af)) {
            $$3 = cbh.d.b(this.af);
         } else {
            $$3 = this.af.h() ? this.gg() : ((cbh)$$1).gg();
         }

         $$2.a($$3);
         $$2.fL();
      }

      return $$2;
   }

   @Override
   public boolean m(cpd $$0) {
      return $$0.a(aui.aA);
   }

   @Override
   public boolean a(chl $$0) {
      return true;
   }

   @Override
   protected void aa() {
      this.dM().ae().a("axolotlBrain");
      this.dO().a((aow)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("axolotlActivityUpdate");
      cbi.a(this);
      this.dM().ae().c();
      if (!this.fW()) {
         Optional<Integer> $$0 = this.dO().c(bxl.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bpo.a gn() {
      return bok.C().a(bpp.n, 14.0).a(bpp.o, 1.0).a(bpp.c, 2.0).a(bpp.r, 1.0);
   }

   @Override
   protected bxt b(cvr $$0) {
      return new bxq(this, $$0);
   }

   @Override
   public boolean B(bnq $$0) {
      boolean $$1 = $$0.a(this.dN().b((boi)this), (float)((int)this.g(bpp.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(atl.aI, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      float $$2 = this.ew();
      if (!this.dM().B
         && !this.fW()
         && this.dM().z.a(3) == 0
         && ((float)this.dM().z.a(3) < $$1 || $$2 / this.eN() < 0.5F)
         && $$1 < $$2
         && this.aZ()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gm()) {
         this.bz.a(bxl.N, 200);
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
   public blw b(chl $$0, blv $$1) {
      return bzz.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(cpd $$0) {
      bzz.a(this, $$0);
      sw $$1 = $$0.x();
      $$1.a("Variant", this.gg().a());
      $$1.a("Age", this.h());
      bpj<?> $$2 = this.dO();
      if ($$2.a(bxl.U)) {
         $$1.a("HuntingCooldown", $$2.e(bxl.U));
      }
   }

   @Override
   public void c(sw $$0) {
      bzz.a(this, $$0);
      this.a(cbh.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dO().a(bxl.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cpd b() {
      return new cpd(cpg.qI);
   }

   @Override
   public atk A() {
      return atl.db;
   }

   @Override
   public boolean ep() {
      return !this.gm() && super.ep();
   }

   public static void a(cbh $$0, boi $$1) {
      cvr $$2 = $$0.dM();
      if ($$1.ex()) {
         bmp $$3 = $$1.ey();
         if ($$3 != null) {
            bnq $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == bnw.bw) {
               chl $$5 = (chl)$$4;
               List<chl> $$6 = $$2.a(chl.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(chl $$0) {
      bnd $$1 = $$0.c(bnf.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.c() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bnd(bnf.j, $$3, 0), this);
      }

      $$0.e(bnf.d);
   }

   @Override
   public boolean X() {
      return super.X() || this.w();
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.aK;
   }

   @Nullable
   @Override
   protected atk n_() {
      return atl.aJ;
   }

   @Nullable
   @Override
   protected atk y() {
      return this.aZ() ? atl.aM : atl.aL;
   }

   @Override
   protected atk aO() {
      return atl.aN;
   }

   @Override
   protected atk aN() {
      return atl.aO;
   }

   @Override
   protected bpj.b<cbh> dP() {
      return bpj.a(bW, bU);
   }

   @Override
   protected bpj<?> a(Dynamic<?> $$0) {
      return cbi.a(this.dP().a($$0));
   }

   @Override
   public bpj<cbh> dO() {
      return (bpj<cbh>)super.dO();
   }

   @Override
   protected void Z() {
      super.Z();
      aep.a(this);
   }

   @Override
   public void a(enz $$0) {
      if (this.cX() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bon.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(chl $$0, blv $$1, cpd $$2) {
      if ($$2.a(cpg.qH)) {
         $$0.a($$1, new cpd(cpg.qy));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   public static boolean a(bnw<? extends boi> $$0, cwg $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.a_($$3.d()).a(aua.bR);
   }

   public static class a extends bnl.a {
      public final cbh.d[] a;

      public a(cbh.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cbh.d a(awp $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends buj {
      public b(cbh $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cbh.this.gm()) {
            super.a();
         }
      }
   }

   static class c extends buk {
      private final cbh l;

      public c(cbh $$0) {
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

      private static final IntFunction<cbh.d> g = ava.a(cbh.d::a, values(), ava.a.a);
      public static final Codec<cbh.d> f = axc.a(cbh.d::values);
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

      public static cbh.d a(int $$0) {
         return g.apply($$0);
      }

      public static cbh.d a(awp $$0) {
         return a($$0, true);
      }

      public static cbh.d b(awp $$0) {
         return a($$0, false);
      }

      private static cbh.d a(awp $$0, boolean $$1) {
         cbh.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cbh.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
