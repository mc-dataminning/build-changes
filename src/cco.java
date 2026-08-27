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

public class cco extends cbe implements bpn, bqo<cco.d>, cbg {
   public static final int bX = 200;
   protected static final ImmutableList<? extends bzz<? extends bzy<? super cco>>> bY = ImmutableList.of(bzz.c, bzz.o, bzz.f, bzz.p, bzz.q);
   protected static final ImmutableList<? extends bys<?>> ca = ImmutableList.of(
      bys.r, bys.g, bys.h, bys.k, bys.l, bys.n, bys.m, bys.E, bys.t, bys.o, bys.p, bys.K, new bys[]{bys.y, bys.N, bys.B, bys.O, bys.P, bys.R, bys.U, bys.Z}
   );
   private static final aim<Integer> ce = aiq.a(cco.class, aio.b);
   private static final aim<Boolean> cf = aiq.a(cco.class, aio.k);
   private static final aim<Boolean> cg = aiq.a(cco.class, aio.k);
   public static final double cb = 20.0;
   public static final int cc = 1200;
   private static final int ch = 6000;
   public static final String cd = "Variant";
   private static final int ci = 1800;
   private static final int cj = 2400;
   private final Map<String, Vector3f> ck = Maps.newHashMap();
   private static final int cl = 100;

   public cco(bpd<? extends cco> $$0, cxb $$1) {
      super($$0, $$1);
      this.a(ejg.j, 0.0F);
      this.bO = new cco.c(this);
      this.bN = new cco.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.ck;
   }

   @Override
   public float a(ib $$0, cxe $$1) {
      return 0.0F;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
      $$0.a(cf, false);
      $$0.a(cg, false);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Variant", this.gn().a());
      $$0.a("FromBucket", this.s());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a(cco.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gt()) {
         super.P();
      }
   }

   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      boolean $$4 = false;
      if ($$2 == bpt.l) {
         return $$3;
      } else {
         axd $$5 = $$0.E_();
         if ($$3 instanceof cco.a) {
            if (((cco.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new cco.a(cco.d.a($$5), cco.d.a($$5));
         }

         this.a(((cco.a)$$3).a($$5));
         if ($$4) {
            this.c_(-24000);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void as() {
      int $$0 = this.ci();
      super.as();
      if (!this.gd()) {
         this.u($$0);
      }
   }

   protected void u(int $$0) {
      if (this.bA() && !this.be()) {
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
   public void r() {
      int $$0 = this.ci() + 1800;
      this.k(Math.min($$0, this.ch()));
   }

   @Override
   public int ch() {
      return 6000;
   }

   public cco.d gn() {
      return cco.d.a(this.an.a(ce));
   }

   public void a(cco.d $$0) {
      this.an.a(ce, $$0.a());
   }

   private static boolean a(axd $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cxe $$0) {
      return $$0.f(this);
   }

   @Override
   public boolean cz() {
      return false;
   }

   public void x(boolean $$0) {
      this.an.a(cf, $$0);
   }

   public boolean gt() {
      return this.an.a(cf);
   }

   @Override
   public boolean s() {
      return this.an.a(cg);
   }

   @Override
   public void w(boolean $$0) {
      this.an.a(cg, $$0);
   }

   @Nullable
   @Override
   public bos a(apf $$0, bos $$1) {
      cco $$2 = bpd.g.a((cxb)$$0);
      if ($$2 != null) {
         cco.d $$3;
         if (a(this.ag)) {
            $$3 = cco.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.gn() : ((cco)$$1).gn();
         }

         $$2.a($$3);
         $$2.fS();
      }

      return $$2;
   }

   @Override
   public boolean o(cqm $$0) {
      return $$0.a(auv.aA);
   }

   @Override
   public boolean a(ciu $$0) {
      return true;
   }

   @Override
   protected void Y() {
      this.dM().ae().a("axolotlBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("axolotlActivityUpdate");
      ccp.a(this);
      this.dM().ae().c();
      if (!this.gd()) {
         Optional<Integer> $$0 = this.dP().c(bys.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bqv.a gu() {
      return bpr.A().a(bqw.q, 14.0).a(bqw.r, 1.0).a(bqw.c, 2.0).a(bqw.v, 1.0);
   }

   @Override
   protected bza b(cxb $$0) {
      return new byx(this, $$0);
   }

   @Override
   public boolean C(box $$0) {
      boolean $$1 = $$0.a(this.dN().b((bpp)this), (float)((int)this.g(bqw.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aty.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      float $$2 = this.ex();
      if (!this.dM().B
         && !this.gd()
         && this.dM().z.a(3) == 0
         && ((float)this.dM().z.a(3) < $$1 || $$2 / this.eO() < 0.5F)
         && $$1 < $$2
         && this.bc()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gt()) {
         this.bC.a(bys.N, 200);
      }

      return super.a($$0, $$1);
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
   public bnd b(ciu $$0, bnc $$1) {
      return cbg.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cqm $$0) {
      cbg.a(this, $$0);
      ta $$1 = $$0.x();
      $$1.a("Variant", this.gn().a());
      $$1.a("Age", this.g());
      bqq<?> $$2 = this.dP();
      if ($$2.a(bys.U)) {
         $$1.a("HuntingCooldown", $$2.e(bys.U));
      }
   }

   @Override
   public void c(ta $$0) {
      cbg.a(this, $$0);
      this.a(cco.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dP().a(bys.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cqm b() {
      return new cqm(cqp.qI);
   }

   @Override
   public atx y() {
      return aty.di;
   }

   @Override
   public boolean eq() {
      return !this.gt() && super.eq();
   }

   public static void a(cco $$0, bpp $$1) {
      cxb $$2 = $$0.dM();
      if ($$1.ey()) {
         bnw $$3 = $$1.ez();
         if ($$3 != null) {
            box $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == bpd.by) {
               ciu $$5 = (ciu)$$4;
               List<ciu> $$6 = $$2.a(ciu.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(ciu $$0) {
      bok $$1 = $$0.c(bom.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.c() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new bok(bom.j, $$3, 0), this);
      }

      $$0.e(bom.d);
   }

   @Override
   public boolean V() {
      return super.V() || this.s();
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.aM;
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.aL;
   }

   @Nullable
   @Override
   protected atx v() {
      return this.bc() ? aty.aO : aty.aN;
   }

   @Override
   protected atx aO() {
      return aty.aP;
   }

   @Override
   protected atx aN() {
      return aty.aQ;
   }

   @Override
   protected bqq.b<cco> dQ() {
      return bqq.a(ca, bY);
   }

   @Override
   protected bqq<?> a(Dynamic<?> $$0) {
      return ccp.a(this.dQ().a($$0));
   }

   @Override
   public bqq<cco> dP() {
      return (bqq<cco>)super.dP();
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   @Override
   public void a(ept $$0) {
      if (this.cX() && this.bc()) {
         this.a(this.fk(), $$0);
         this.a(bpu.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(ciu $$0, bnc $$1, cqm $$2) {
      if ($$2.a(cqp.qH)) {
         $$0.a($$1, new cqm(cqp.qy));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && !this.ae();
   }

   public static boolean a(bpd<? extends bpp> $$0, cxq $$1, bpt $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bS);
   }

   public static class a extends bos.a {
      public final cco.d[] a;

      public a(cco.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public cco.d a(axd $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bvq {
      public b(cco $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!cco.this.gt()) {
            super.a();
         }
      }
   }

   static class c extends bvr {
      private final cco l;

      public c(cco $$0) {
         super($$0, 85, 10, 0.1F, 0.5F, false);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (!this.l.gt()) {
            super.a();
         }
      }
   }

   public static enum d implements axq {
      a(0, "lucy", true),
      b(1, "wild", true),
      c(2, "gold", true),
      d(3, "cyan", true),
      e(4, "blue", false);

      private static final IntFunction<cco.d> g = avn.a(cco.d::a, values(), avn.a.a);
      public static final Codec<cco.d> f = axq.a(cco.d::values);
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

      public static cco.d a(int $$0) {
         return g.apply($$0);
      }

      public static cco.d a(axd $$0) {
         return a($$0, true);
      }

      public static cco.d b(axd $$0) {
         return a($$0, false);
      }

      private static cco.d a(axd $$0, boolean $$1) {
         cco.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(cco.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
