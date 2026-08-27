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

public class ccn extends cbd implements bpm, bqn<ccn.d>, cbf {
   public static final int bX = 200;
   protected static final ImmutableList<? extends bzy<? extends bzx<? super ccn>>> bY = ImmutableList.of(bzy.c, bzy.o, bzy.f, bzy.p, bzy.q);
   protected static final ImmutableList<? extends byr<?>> ca = ImmutableList.of(
      byr.r, byr.g, byr.h, byr.k, byr.l, byr.n, byr.m, byr.E, byr.t, byr.o, byr.p, byr.K, new byr[]{byr.y, byr.N, byr.B, byr.O, byr.P, byr.R, byr.U, byr.Z}
   );
   private static final aim<Integer> ce = aiq.a(ccn.class, aio.b);
   private static final aim<Boolean> cf = aiq.a(ccn.class, aio.k);
   private static final aim<Boolean> cg = aiq.a(ccn.class, aio.k);
   public static final double cb = 20.0;
   public static final int cc = 1200;
   private static final int ch = 6000;
   public static final String cd = "Variant";
   private static final int ci = 1800;
   private static final int cj = 2400;
   private final Map<String, Vector3f> ck = Maps.newHashMap();
   private static final int cl = 100;

   public ccn(bpc<? extends ccn> $$0, cwz $$1) {
      super($$0, $$1);
      this.a(eiy.j, 0.0F);
      this.bO = new ccn.c(this);
      this.bN = new ccn.b(this, 20);
   }

   @Override
   public Map<String, Vector3f> a() {
      return this.ck;
   }

   @Override
   public float a(ib $$0, cxc $$1) {
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
      this.a(ccn.d.a($$0.h("Variant")));
      this.w($$0.q("FromBucket"));
   }

   @Override
   public void P() {
      if (!this.gt()) {
         super.P();
      }
   }

   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      boolean $$4 = false;
      if ($$2 == bps.l) {
         return $$3;
      } else {
         axd $$5 = $$0.E_();
         if ($$3 instanceof ccn.a) {
            if (((ccn.a)$$3).a() >= 2) {
               $$4 = true;
            }
         } else {
            $$3 = new ccn.a(ccn.d.a($$5), ccn.d.a($$5));
         }

         this.a(((ccn.a)$$3).a($$5));
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

   public ccn.d gn() {
      return ccn.d.a(this.an.a(ce));
   }

   public void a(ccn.d $$0) {
      this.an.a(ce, $$0.a());
   }

   private static boolean a(axd $$0) {
      return $$0.a(1200) == 0;
   }

   @Override
   public boolean a(cxc $$0) {
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
   public bor a(apf $$0, bor $$1) {
      ccn $$2 = bpc.g.a((cwz)$$0);
      if ($$2 != null) {
         ccn.d $$3;
         if (a(this.ag)) {
            $$3 = ccn.d.b(this.ag);
         } else {
            $$3 = this.ag.h() ? this.gn() : ((ccn)$$1).gn();
         }

         $$2.a($$3);
         $$2.fS();
      }

      return $$2;
   }

   @Override
   public boolean o(cqk $$0) {
      return $$0.a(auv.aA);
   }

   @Override
   public boolean a(cis $$0) {
      return true;
   }

   @Override
   protected void Y() {
      this.dM().ae().a("axolotlBrain");
      this.dP().a((apf)this.dM(), this);
      this.dM().ae().c();
      this.dM().ae().a("axolotlActivityUpdate");
      cco.a(this);
      this.dM().ae().c();
      if (!this.gd()) {
         Optional<Integer> $$0 = this.dP().c(byr.N);
         this.x($$0.isPresent() && $$0.get() > 0);
      }
   }

   public static bqu.a gu() {
      return bpq.A().a(bqv.q, 14.0).a(bqv.r, 1.0).a(bqv.c, 2.0).a(bqv.v, 1.0);
   }

   @Override
   protected byz b(cwz $$0) {
      return new byw(this, $$0);
   }

   @Override
   public boolean C(bow $$0) {
      boolean $$1 = $$0.a(this.dN().b((bpo)this), (float)((int)this.g(bqv.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aty.aK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      float $$2 = this.ex();
      if (!this.dM().B
         && !this.gd()
         && this.dM().z.a(3) == 0
         && ((float)this.dM().z.a(3) < $$1 || $$2 / this.eO() < 0.5F)
         && $$1 < $$2
         && this.bc()
         && ($$0.d() != null || $$0.c() != null)
         && !this.gt()) {
         this.bC.a(byr.N, 200);
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
   public bnc b(cis $$0, bnb $$1) {
      return cbf.a($$0, $$1, this).orElse(super.b($$0, $$1));
   }

   @Override
   public void n(cqk $$0) {
      cbf.a(this, $$0);
      ta $$1 = $$0.x();
      $$1.a("Variant", this.gn().a());
      $$1.a("Age", this.g());
      bqp<?> $$2 = this.dP();
      if ($$2.a(byr.U)) {
         $$1.a("HuntingCooldown", $$2.e(byr.U));
      }
   }

   @Override
   public void c(ta $$0) {
      cbf.a(this, $$0);
      this.a(ccn.d.a($$0.h("Variant")));
      if ($$0.e("Age")) {
         this.c_($$0.h("Age"));
      }

      if ($$0.e("HuntingCooldown")) {
         this.dP().a(byr.U, true, $$0.i("HuntingCooldown"));
      }
   }

   @Override
   public cqk b() {
      return new cqk(cqn.qI);
   }

   @Override
   public atx y() {
      return aty.de;
   }

   @Override
   public boolean eq() {
      return !this.gt() && super.eq();
   }

   public static void a(ccn $$0, bpo $$1) {
      cwz $$2 = $$0.dM();
      if ($$1.ey()) {
         bnv $$3 = $$1.ez();
         if ($$3 != null) {
            bow $$4 = $$3.d();
            if ($$4 != null && $$4.ai() == bpc.bx) {
               cis $$5 = (cis)$$4;
               List<cis> $$6 = $$2.a(cis.class, $$0.cH().g(20.0));
               if ($$6.contains($$5)) {
                  $$0.f($$5);
               }
            }
         }
      }
   }

   public void f(cis $$0) {
      boj $$1 = $$0.c(bol.j);
      if ($$1 == null || $$1.a(2399)) {
         int $$2 = $$1 != null ? $$1.c() : 0;
         int $$3 = Math.min(2400, 100 + $$2);
         $$0.b(new boj(bol.j, $$3, 0), this);
      }

      $$0.e(bol.d);
   }

   @Override
   public boolean V() {
      return super.V() || this.s();
   }

   @Override
   protected atx d(bnv $$0) {
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
   protected bqp.b<ccn> dQ() {
      return bqp.a(ca, bY);
   }

   @Override
   protected bqp<?> a(Dynamic<?> $$0) {
      return cco.a(this.dQ().a($$0));
   }

   @Override
   public bqp<ccn> dP() {
      return (bqp<ccn>)super.dP();
   }

   @Override
   protected void X() {
      super.X();
      aew.a(this);
   }

   @Override
   public void a(epr $$0) {
      if (this.cX() && this.bc()) {
         this.a(this.fk(), $$0);
         this.a(bpt.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   protected void a(cis $$0, bnb $$1, cqk $$2) {
      if ($$2.a(cqn.qH)) {
         $$0.a($$1, new cqk(cqn.qy));
      } else {
         super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.s() && !this.ae();
   }

   public static boolean a(bpc<? extends bpo> $$0, cxo $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bS);
   }

   public static class a extends bor.a {
      public final ccn.d[] a;

      public a(ccn.d... $$0) {
         super(false);
         this.a = $$0;
      }

      public ccn.d a(axd $$0) {
         return this.a[$$0.a(this.a.length)];
      }
   }

   class b extends bvp {
      public b(ccn $$0, int $$1) {
         super($$0, $$1);
      }

      @Override
      public void a() {
         if (!ccn.this.gt()) {
            super.a();
         }
      }
   }

   static class c extends bvq {
      private final ccn l;

      public c(ccn $$0) {
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

      private static final IntFunction<ccn.d> g = avn.a(ccn.d::a, values(), avn.a.a);
      public static final Codec<ccn.d> f = axq.a(ccn.d::values);
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

      public static ccn.d a(int $$0) {
         return g.apply($$0);
      }

      public static ccn.d a(axd $$0) {
         return a($$0, true);
      }

      public static ccn.d b(axd $$0) {
         return a($$0, false);
      }

      private static ccn.d a(axd $$0, boolean $$1) {
         ccn.d[] $$2 = Arrays.stream(values()).filter($$1x -> $$1x.j == $$1).toArray(ccn.d[]::new);
         return ac.a($$2, $$0);
      }
   }
}
