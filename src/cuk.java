import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class cuk extends cvc {
   private static final ffq b = new ffq(0.0, 0.0, 0.0);
   private static final akl<Optional<ebe>> c = akp.a(cuk.class, akn.j);
   private static final akl<Integer> d = akp.a(cuk.class, akn.b);
   private static final ImmutableMap<byg, ImmutableList<Integer>> h = ImmutableMap.of(
      byg.a, ImmutableList.of(0, 1, -1), byg.f, ImmutableList.of(0, 1, -1), byg.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private static final boolean i = false;
   private boolean j;
   private boolean k = false;
   private final cus l;
   private static final Map<eci, Pair<ka, ka>> m = Maps.newEnumMap(
      (Map)ag.a(
         () -> {
            ka $$0 = jb.e.q();
            ka $$1 = jb.f.q();
            ka $$2 = jb.c.q();
            ka $$3 = jb.d.q();
            ka $$4 = $$0.p();
            ka $$5 = $$1.p();
            ka $$6 = $$2.p();
            ka $$7 = $$3.p();
            return ImmutableMap.of(
               eci.a,
               Pair.of($$2, $$3),
               eci.b,
               Pair.of($$0, $$1),
               eci.c,
               Pair.of($$4, $$1),
               eci.d,
               Pair.of($$0, $$5),
               eci.e,
               Pair.of($$2, $$7),
               eci.f,
               Pair.of($$6, $$3),
               eci.g,
               Pair.of($$3, $$1),
               eci.h,
               Pair.of($$3, $$0),
               eci.i,
               Pair.of($$2, $$0),
               eci.j,
               Pair.of($$2, $$1)
            );
         }
      )
   );

   protected cuk(bxc<?> $$0, djx $$1) {
      super($$0, $$1);
      this.I = true;
      if (b($$1)) {
         this.l = new cuz(this);
      } else {
         this.l = new cva(this);
      }
   }

   protected cuk(bxc<?> $$0, djx $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.p($$2, $$3, $$4);
   }

   public void p(double $$0, double $$1, double $$2) {
      this.a_($$0, $$1, $$2);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
   }

   @Nullable
   public static <T extends cuk> T a(djx $$0, double $$1, double $$2, double $$3, bxc<T> $$4, bxb $$5, czy $$6, @Nullable crx $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         bxc.a($$0, $$6, $$7).accept($$8);
         if ($$8.f() instanceof cuz $$9) {
            iv $$10 = $$8.j();
            ebe $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public cus f() {
      return this.l;
   }

   @Override
   protected bwt.c bf() {
      return bwt.c.c;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(c, Optional.empty());
      $$0.a(d, this.x());
   }

   @Override
   public boolean i(bwt $$0) {
      return cui.a(this, $$0);
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public ffq a(jb.a $$0, m.a $$1) {
      return bxu.k(super.a($$0, $$1));
   }

   @Override
   protected ffq a(bwt $$0, bww $$1, float $$2) {
      boolean $$3 = $$0 instanceof crj || $$0 instanceof crp;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public ffq b(bxu $$0) {
      jb $$1 = this.cP();
      if ($$1.o() == jb.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cuq.a($$1);
         iv $$3 = this.dv();
         iv.a $$4 = new iv.a();
         ImmutableList<byg> $$5 = $$0.fO();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            byg $$6 = (byg)$$14.next();
            bww $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)h.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dV().a(cuq.a(this.dV(), $$4), () -> cuq.a(this.dV(), $$4.e()));
                  if (cuq.a($$11)) {
                     ffl $$12 = new ffl((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     ffq $$13 = ffq.a($$4, $$11);
                     if (cuq.a(this.dV(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cR().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            byg $$15 = (byg)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azo.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cuq.a($$4, $$17, $$0x -> this.dV().a_($$0x).g(this.dV(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aS() {
      ebe $$0 = this.dV().a_(this.dv());
      return $$0.a(axe.P) ? 1.0F : super.aS();
   }

   @Override
   public void q(float $$0) {
      this.l(-this.I());
      this.d(10);
      this.b(this.G() + this.G() * 10.0F);
   }

   @Override
   public boolean bF() {
      return !this.dQ();
   }

   public static Pair<ka, ka> a(eci $$0) {
      return m.get($$0);
   }

   @Override
   public jb cP() {
      return this.l.l();
   }

   @Override
   protected double bc() {
      return this.bi() ? 0.005 : 0.04;
   }

   @Override
   public void h() {
      if (this.H() > 0) {
         this.d(this.H() - 1);
      }

      if (this.G() > 0.0F) {
         this.b(this.G() - 1.0F);
      }

      this.ax();
      this.bV();
      this.l.b();
      this.bo();
      if (this.bv()) {
         this.aB();
         this.aC();
         this.Z *= 0.5;
      }

      this.ak = false;
   }

   public boolean g() {
      return this.ak;
   }

   public iv j() {
      int $$0 = azo.a(this.dA());
      int $$1 = azo.a(this.dC());
      int $$2 = azo.a(this.dG());
      if (b(this.dV())) {
         double $$3 = this.dC() - 0.1 - 1.0E-5F;
         if (this.dV().a_(iv.a((double)$$0, $$3, (double)$$2)).a(axe.P)) {
            $$1 = azo.a($$3);
         }
      } else if (this.dV().a_(new iv($$0, $$1 - 1, $$2)).a(axe.P)) {
         $$1--;
      }

      return new iv($$0, $$1, $$2);
   }

   protected double a(ars $$0) {
      return this.l.b($$0);
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   public void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void be() {
      super.be();
   }

   @Override
   public void av() {
      super.av();
   }

   @Override
   public boolean bo() {
      return super.bo();
   }

   @Override
   public ffq ae() {
      return this.l.c(super.ae());
   }

   @Override
   public bxp R_() {
      return this.l.a();
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.l.a($$0, $$1, $$2);
   }

   protected void b(ars $$0) {
      this.l.a($$0);
   }

   protected void e(ars $$0) {
      double $$1 = this.a($$0);
      ffq $$2 = this.dy();
      this.n(azo.a($$2.d, -$$1, $$1), $$2.e, azo.a($$2.f, -$$1, $$1));
      if (this.aH()) {
         this.i(this.dy().c(0.5));
      }

      this.a(bxy.a, this.dy());
      if (!this.aH()) {
         this.i(this.dy().c(0.95));
      }
   }

   protected double a(iv $$0, eci $$1, double $$2) {
      return this.l.a($$0, $$1, $$2);
   }

   @Override
   public void a(bxy $$0, ffq $$1) {
      if (b(this.dV())) {
         ffq $$2 = this.dt().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.l.d();
         if ($$3) {
            super.a($$0, $$2.d(this.dt()));
         }

         if ($$0.equals(bxy.c)) {
            this.j = false;
         }
      } else {
         super.a($$0, $$1);
         this.aI();
      }
   }

   @Override
   public void aI() {
      if (!b(this.dV())) {
         this.a(this.dt(), this.dt());
      } else {
         super.aI();
      }
   }

   @Override
   public boolean cp() {
      return this.j;
   }

   public void a(boolean $$0) {
      this.j = $$0;
   }

   public boolean m() {
      return this.k;
   }

   public void b(boolean $$0) {
      this.k = $$0;
   }

   public ffq a(iv $$0) {
      ebe $$1 = this.dV().a_($$0);
      if ($$1.a(dne.bw) && $$1.c(dtf.d)) {
         eci $$2 = $$1.c(((dmr)$$1.b()).c());
         if ($$2 == eci.b) {
            if (this.b($$0.h())) {
               return new ffq(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new ffq(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == eci.a) {
            if (this.b($$0.f())) {
               return new ffq(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new ffq(0.0, 0.0, -1.0);
            }
         }

         return ffq.c;
      } else {
         return ffq.c;
      }
   }

   public boolean b(iv $$0) {
      return this.dV().a_($$0).d(this.dV(), $$0);
   }

   @Override
   protected ffq a(ffq $$0) {
      double $$1 = this.l.m();
      ffq $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bi()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(tz $$0) {
      alg<uy> $$1 = this.dX().a(un.a);
      this.a($$0.a("DisplayState", ebe.a, $$1));
      this.c($$0.b("DisplayOffset", this.x()));
      this.k = $$0.b("FlippedRotation", false);
      this.ak = $$0.b("HasTicked", false);
   }

   @Override
   protected void b(tz $$0) {
      this.A().ifPresent($$1x -> {
         alg<uy> $$2 = this.dX().a(un.a);
         $$0.a("DisplayState", ebe.a, $$2, $$1x);
      });
      int $$1 = this.w();
      if ($$1 != this.x()) {
         $$0.a("DisplayOffset", $$1);
      }

      $$0.a("FlippedRotation", this.k);
      $$0.a("HasTicked", this.ak);
   }

   @Override
   public void h(bwt $$0) {
      if (!this.dV().C) {
         if (!$$0.ad && !this.ad) {
            if (!this.y($$0)) {
               double $$1 = $$0.dA() - this.dA();
               double $$2 = $$0.dG() - this.dG();
               double $$3 = $$1 * $$1 + $$2 * $$2;
               if ($$3 >= 1.0E-4F) {
                  $$3 = Math.sqrt($$3);
                  $$1 /= $$3;
                  $$2 /= $$3;
                  double $$4 = 1.0 / $$3;
                  if ($$4 > 1.0) {
                     $$4 = 1.0;
                  }

                  $$1 *= $$4;
                  $$2 *= $$4;
                  $$1 *= 0.1F;
                  $$2 *= 0.1F;
                  $$1 *= 0.5;
                  $$2 *= 0.5;
                  if ($$0 instanceof cuk $$5) {
                     this.a($$5, $$1, $$2);
                  } else {
                     this.i(-$$1, 0.0, -$$2);
                     $$0.i($$1 / 4.0, 0.0, $$2 / 4.0);
                  }
               }
            }
         }
      }
   }

   private void a(cuk $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dV())) {
         $$3 = this.dy().d;
         $$4 = this.dy().f;
      } else {
         $$3 = $$0.dA() - this.dA();
         $$4 = $$0.dG() - this.dG();
      }

      ffq $$7 = new ffq($$3, 0.0, $$4).d();
      ffq $$8 = new ffq((double)azo.b(this.dL() * (float) (Math.PI / 180.0)), 0.0, (double)azo.a(this.dL() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dV())) {
         ffq $$10 = this.dy();
         ffq $$11 = $$0.dy();
         if ($$0.z() && !this.z()) {
            this.i($$10.d(0.2, 1.0, 0.2));
            this.i($$11.d - $$1, 0.0, $$11.f - $$2);
            $$0.i($$11.d(0.95, 1.0, 0.95));
         } else if (!$$0.z() && this.z()) {
            $$0.i($$11.d(0.2, 1.0, 0.2));
            $$0.i($$10.d + $$1, 0.0, $$10.f + $$2);
            this.i($$10.d(0.95, 1.0, 0.95));
         } else {
            double $$12 = ($$11.d + $$10.d) / 2.0;
            double $$13 = ($$11.f + $$10.f) / 2.0;
            this.i($$10.d(0.2, 1.0, 0.2));
            this.i($$12 - $$1, 0.0, $$13 - $$2);
            $$0.i($$11.d(0.2, 1.0, 0.2));
            $$0.i($$12 + $$1, 0.0, $$13 + $$2);
         }
      }
   }

   public ebe n() {
      return this.A().orElseGet(this::v);
   }

   private Optional<ebe> A() {
      return this.ar().a(c);
   }

   public ebe v() {
      return dne.a.m();
   }

   public int w() {
      return this.ar().a(d);
   }

   public int x() {
      return 6;
   }

   public void a(Optional<ebe> $$0) {
      this.ar().a(c, $$0);
   }

   public void c(int $$0) {
      this.ar().a(d, $$0);
   }

   public static boolean b(djx $$0) {
      return $$0.K().b(cvj.d);
   }

   @Override
   public abstract czy dI();

   public boolean y() {
      return false;
   }

   public boolean z() {
      return false;
   }
}
