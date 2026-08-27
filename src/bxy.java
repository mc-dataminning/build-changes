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

public class bxy extends bwr implements ble, bme<bxy.d>, bwt {
   public static final int bT = 200;
   protected static final ImmutableList<? extends bvm<? extends bvl<? super bxy>>> bU = ImmutableList.of(bvm.c, bvm.n, bvm.f, bvm.o, bvm.p);
   protected static final ImmutableList<? extends buh<?>> bW = ImmutableList.of(
      buh.r, buh.g, buh.h, buh.k, buh.l, buh.n, buh.m, buh.E, buh.t, buh.o, buh.p, buh.J, new buh[]{buh.y, buh.M, buh.B, buh.N, buh.O, buh.Q, buh.T, buh.Y}
   );
   private static final afo<Integer> ca = afr.a(bxy.class, afq.b);
   private static final afo<Boolean> cb = afr.a(bxy.class, afq.k);
   private static final afo<Boolean> cc = afr.a(bxy.class, afq.k);
   public static final double bX = 20.0;
   public static final int bY = 1200;
   private static final int cd = 6000;
   public static final String bZ = "Variant";
   private static final int ce = 1800;
   private static final int cf = 2400;
   private final Map<String, Vector3f> cg = Maps.newHashMap();
   private static final int ch = 100;

   public bxy(bku<? extends bxy> $$0, csa $$1) {
      super($$0, $$1);
      this.a(edd.j, 0.0F);
      this.bL = new bxy.c(this);
      this.bK = new bxy.b(this, 20);
      this.t(1.0F);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.cg;
   }

   @Override
   public float a(ht $$0, csd $$1) {
      return 0.0F;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(ca, 0);
      this.an.a(cb, false);
      this.an.a(cc, false);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Variant", this.gf().a());
      $$0.a("FromBucket", this.w());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(bxy.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void R() {
      if (!this.gl()) {
         super.R();
      }
   }

   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      boolean $$5 = false;
      if ($$2 == blk.l) {
         return $$3;
      } else {
         ats $$6 = $$0.E_();
         if ($$3 instanceof bxy.a) {
            if (((bxy.a)$$3).a() >= 2) {
               $$5 = true;
            }
         } else {
            $$3 = new bxy.a(bxy.d.a($$6), bxy.d.a($$6));
         }

         this.a(((bxy.a)$$3).a($$6));
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
            this.a(this.dO().r(), 2.0F);
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

   public bxy.d gf() {
      return bxy.d.a(this.an.b(ca));
   }

   public void a(bxy.d $$0) {
      this.an.b(ca, $$0.a());
   }

   private static boolean a(ats $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(csd $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cz() {
      return false;
   }

   @Override
   public bll eT() {
      return bll.e;
   }

   public void x(boolean $$0) {
      this.an.b(cb, $$0);
   }

   public boolean gl() {
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
   public bkl a(ame $$0, bkl $$1) {
      bxy $$2 = bku.f.a((csa)$$0);
      if ($$2 != null) {
         bxy.d $$3;
         if (a(this.ag)) {
            $$3 = bxy.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.gf() : ((bxy)$$1).gf();
         }

         $$2.a($$3);
         $$2.fK();
      }

      return $$2;
   }

   @Override
   public boolean m(clj $$0) {
      return $$0.a(aro.aA);
   }

   @Override
   public boolean a(cdu $$0) {
      return true;
   }

   @Override
   protected void Z() {
      this.dN().ae().a("axolotlBrain");
      this.dP().a((ame)this.dN(), this);
      this.dN().ae().c();
      this.dN().ae().a("axolotlActivityUpdate");
      bxz.a(this);
      this.dN().ae().c();
      if (!this.fV()) {
         Optional<Integer> $$0 = this.dP().c(buh.M);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bml.a gm() {
      return bli.C().a(bmm.l, 14.0).a(bmm.m, 1.0).a(bmm.c, 2.0);
   }

   @Override
   protected bup b(csa $$0) {
      return new bum(this, $$0);
   }

   @Override
   public boolean C(bkq $$0) {
      boolean $$1 = $$0.a(this.dO().b((blg)this), (float)((int)this.b(bmm.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aqr.av, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      float $$2 = this.ew();
      if (!this.dN().B
         && !this.fV()
         && this.dN().z.a(3) == 0
         && ((float)this.dN().z.a(3) < $$1 || $$2 / this.eN() < 0.5F)
         && $$1 < $$2
         && this.aZ()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gl()) {
         this.bz.a(buh.M, 200);
      }

      return super.a($$0, $$1);
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
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
   public bix b(cdu $$0, biw $$1) {
      return bwt.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void l(clj $$0) {
      bwt.a(this, $$0);
      rz $$1 = $$0.w();
      $$1.a("Variant", this.gf().a());
      $$1.a("Age", this.h());
      bmg<?> $$2 = this.dP();
      if ($$2.a(buh.T)) {
         $$1.a("HuntingCooldown", $$2.e(buh.T));
      }
   }

   @Override
   public void c(rz $$0) {
      bwt.a(this, $$0);
      this.a(bxy.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dP().a(buh.T, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public clj b() {
      return new clj(clm.qG);
   }

   @Override
   public aqq A() {
      return aqr.cC;
   }

   @Override
   public boolean ep() {
      return !this.gl() && super.ep();
   }

   public static void a(bxy $$0, blg $$1) {
      csa $$2 = $$0.dN();
      if ($$1.ex()) {
         bjo $$3 = $$1.ey();
         if ($$3 != null) {
            bkq $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == bku.bt) {
               cdu $$5 = (cdu)$$4;
               List<cdu> $$6 = $$2.a(cdu.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cdu $$0) {
      bkd $$1 = $$0.b(bkf.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.d() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bkd(bkf.j, $$3, 0), this);
      }

      $$0.d(bkf.d);
   }

   @Override
   public boolean W() {
      return super.W() || this.w();
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.ax;
   }

   @Nullable
   @Override
   protected aqq m_() {
      return aqr.aw;
   }

   @Nullable
   @Override
   protected aqq y() {
      return this.aZ() ? aqr.az : aqr.ay;
   }

   @Override
   protected aqq aO() {
      return aqr.aA;
   }

   @Override
   protected aqq aN() {
      return aqr.aB;
   }

   @Override
   protected bmg.b<bxy> dQ() {
      return bmg.a(bW, bU);
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      return bxz.a(this.dQ().a($$0));
   }

   @Override
   public bmg<bxy> dP() {
      return (bmg<bxy>)super.dP();
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
   }

   @Override
   public void a(eju $$0) {
      if (this.cY() && this.aZ()) {
         this.a(this.fg(), $$0);
         this.a(blm.a, this.dq());
         this.g(this.dq().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cdu $$0, biw $$1, clj $$2) {
      if ($$2.a(clm.qF)) {
         $$0.a($$1, new clj(clm.qw));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.w() && !this.ae();
   }

   public static boolean a(bku<? extends blg> $$0, csp $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.a_($$3.d()).a(arg.bQ);
   }

   public static class a extends bkl.a {
      public final bxy.d[] a;

      public a(bxy.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public bxy.d a(ats $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends brf {
      public b(bxy $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!bxy.this.gl()) {
            super.a();
         }
      }
   }

   static class c extends brg {
      private final bxy l;

      public c(bxy $$0) {
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

   public static enum d implements aug {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<bxy.d> g = asf.a(bxy.d::a, values(), asf.a.a);
      public static final Codec<bxy.d> f = aug.a(bxy.d::values);
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

      public static bxy.d a(int $$0) {
         return g.apply($$0);
      }

      public static bxy.d a(ats $$0) {
         return a($$0, true);
      }

      public static bxy.d b(ats $$0) {
         return a($$0, false);
      }

      private static bxy.d a(ats $$0, boolean $$1) {
         bxy.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(bxy.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
