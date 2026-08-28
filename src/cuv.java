import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public abstract class cuv extends cvn {
   private static final fgc b = new fgc(0.0, 0.0, 0.0);
   private static final aku<Optional<ebq>> c = aky.a(cuv.class, akw.j);
   private static final aku<Integer> d = aky.a(cuv.class, akw.b);
   private static final ImmutableMap<byr, ImmutableList<Integer>> h = ImmutableMap.of(
      byr.a, ImmutableList.of(0, 1, -1), byr.f, ImmutableList.of(0, 1, -1), byr.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private static final boolean i = false;
   private boolean j;
   private boolean k = false;
   private final cvd l;
   private static final Map<ecu, Pair<kb, kb>> m = Maps.newEnumMap(
      (Map)ag.a(
         () -> {
            kb $$0 = jc.e.q();
            kb $$1 = jc.f.q();
            kb $$2 = jc.c.q();
            kb $$3 = jc.d.q();
            kb $$4 = $$0.p();
            kb $$5 = $$1.p();
            kb $$6 = $$2.p();
            kb $$7 = $$3.p();
            return ImmutableMap.of(
               ecu.a,
               Pair.of($$2, $$3),
               ecu.b,
               Pair.of($$0, $$1),
               ecu.c,
               Pair.of($$4, $$1),
               ecu.d,
               Pair.of($$0, $$5),
               ecu.e,
               Pair.of($$2, $$7),
               ecu.f,
               Pair.of($$6, $$3),
               ecu.g,
               Pair.of($$3, $$1),
               ecu.h,
               Pair.of($$3, $$0),
               ecu.i,
               Pair.of($$2, $$0),
               ecu.j,
               Pair.of($$2, $$1)
            );
         }
      )
   );

   protected cuv(bxn<?> $$0, dkj $$1) {
      super($$0, $$1);
      this.I = true;
      if (b($$1)) {
         this.l = new cvk(this);
      } else {
         this.l = new cvl(this);
      }
   }

   protected cuv(bxn<?> $$0, dkj $$1, double $$2, double $$3, double $$4) {
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
   public static <T extends cuv> T a(dkj $$0, double $$1, double $$2, double $$3, bxn<T> $$4, bxm $$5, dak $$6, @Nullable csi $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         bxn.a($$0, $$6, $$7).accept($$8);
         if ($$8.f() instanceof cvk $$9) {
            iw $$10 = $$8.j();
            ebq $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public cvd f() {
      return this.l;
   }

   @Override
   protected bxe.c bf() {
      return bxe.c.c;
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(c, Optional.empty());
      $$0.a(d, this.x());
   }

   @Override
   public boolean i(bxe $$0) {
      return cut.a(this, $$0);
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public fgc a(jc.a $$0, m.a $$1) {
      return byf.k(super.a($$0, $$1));
   }

   @Override
   protected fgc a(bxe $$0, bxh $$1, float $$2) {
      boolean $$3 = $$0 instanceof cru || $$0 instanceof csa;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public fgc b(byf $$0) {
      jc $$1 = this.cP();
      if ($$1.o() == jc.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cvb.a($$1);
         iw $$3 = this.dv();
         iw.a $$4 = new iw.a();
         ImmutableList<byr> $$5 = $$0.fO();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            byr $$6 = (byr)$$14.next();
            bxh $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)h.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dV().a(cvb.a(this.dV(), $$4), () -> cvb.a(this.dV(), $$4.e()));
                  if (cvb.a($$11)) {
                     ffx $$12 = new ffx((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     fgc $$13 = fgc.a($$4, $$11);
                     if (cvb.a(this.dV(), $$0, $$12.c($$13))) {
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
            byr $$15 = (byr)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azz.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cvb.a($$4, $$17, $$0x -> this.dV().a_($$0x).g(this.dV(), $$0x));
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
      ebq $$0 = this.dV().a_(this.dv());
      return $$0.a(axn.P) ? 1.0F : super.aS();
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

   public static Pair<kb, kb> a(ecu $$0) {
      return m.get($$0);
   }

   @Override
   public jc cP() {
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

   public iw j() {
      int $$0 = azz.a(this.dA());
      int $$1 = azz.a(this.dC());
      int $$2 = azz.a(this.dG());
      if (b(this.dV())) {
         double $$3 = this.dC() - 0.1 - 1.0E-5F;
         if (this.dV().a_(iw.a((double)$$0, $$3, (double)$$2)).a(axn.P)) {
            $$1 = azz.a($$3);
         }
      } else if (this.dV().a_(new iw($$0, $$1 - 1, $$2)).a(axn.P)) {
         $$1--;
      }

      return new iw($$0, $$1, $$2);
   }

   protected double a(asb $$0) {
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
   public fgc ae() {
      return this.l.c(super.ae());
   }

   @Override
   public bya S_() {
      return this.l.a();
   }

   @Override
   public void k(double $$0, double $$1, double $$2) {
      this.l.a($$0, $$1, $$2);
   }

   protected void b(asb $$0) {
      this.l.a($$0);
   }

   protected void e(asb $$0) {
      double $$1 = this.a($$0);
      fgc $$2 = this.dy();
      this.n(azz.a($$2.d, -$$1, $$1), $$2.e, azz.a($$2.f, -$$1, $$1));
      if (this.aH()) {
         this.i(this.dy().c(0.5));
      }

      this.a(byj.a, this.dy());
      if (!this.aH()) {
         this.i(this.dy().c(0.95));
      }
   }

   protected double a(iw $$0, ecu $$1, double $$2) {
      return this.l.a($$0, $$1, $$2);
   }

   @Override
   public void a(byj $$0, fgc $$1) {
      if (b(this.dV())) {
         fgc $$2 = this.dt().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.l.d();
         if ($$3) {
            super.a($$0, $$2.d(this.dt()));
         }

         if ($$0.equals(byj.c)) {
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

   public fgc a(iw $$0) {
      ebq $$1 = this.dV().a_($$0);
      if ($$1.a(dnq.bw) && $$1.c(dtr.d)) {
         ecu $$2 = $$1.c(((dnd)$$1.b()).c());
         if ($$2 == ecu.b) {
            if (this.b($$0.h())) {
               return new fgc(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new fgc(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == ecu.a) {
            if (this.b($$0.f())) {
               return new fgc(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new fgc(0.0, 0.0, -1.0);
            }
         }

         return fgc.c;
      } else {
         return fgc.c;
      }
   }

   public boolean b(iw $$0) {
      return this.dV().a_($$0).d(this.dV(), $$0);
   }

   @Override
   protected fgc a(fgc $$0) {
      double $$1 = this.l.m();
      fgc $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bi()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(ua $$0) {
      alp<va> $$1 = this.dX().a(uo.a);
      this.a($$0.a("DisplayState", ebq.a, $$1));
      this.c($$0.b("DisplayOffset", this.x()));
      this.k = $$0.b("FlippedRotation", false);
      this.ak = $$0.b("HasTicked", false);
   }

   @Override
   protected void b(ua $$0) {
      this.A().ifPresent($$1x -> {
         alp<va> $$2 = this.dX().a(uo.a);
         $$0.a("DisplayState", ebq.a, $$2, $$1x);
      });
      int $$1 = this.w();
      if ($$1 != this.x()) {
         $$0.a("DisplayOffset", $$1);
      }

      $$0.a("FlippedRotation", this.k);
      $$0.a("HasTicked", this.ak);
   }

   @Override
   public void h(bxe $$0) {
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
                  if ($$0 instanceof cuv $$5) {
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

   private void a(cuv $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dV())) {
         $$3 = this.dy().d;
         $$4 = this.dy().f;
      } else {
         $$3 = $$0.dA() - this.dA();
         $$4 = $$0.dG() - this.dG();
      }

      fgc $$7 = new fgc($$3, 0.0, $$4).d();
      fgc $$8 = new fgc((double)azz.b(this.dL() * (float) (Math.PI / 180.0)), 0.0, (double)azz.a(this.dL() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dV())) {
         fgc $$10 = this.dy();
         fgc $$11 = $$0.dy();
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

   public ebq n() {
      return this.A().orElseGet(this::v);
   }

   private Optional<ebq> A() {
      return this.ar().a(c);
   }

   public ebq v() {
      return dnq.a.m();
   }

   public int w() {
      return this.ar().a(d);
   }

   public int x() {
      return 6;
   }

   public void a(Optional<ebq> $$0) {
      this.ar().a(c, $$0);
   }

   public void c(int $$0) {
      this.ar().a(d, $$0);
   }

   public static boolean b(dkj $$0) {
      return $$0.K().b(cvu.d);
   }

   @Override
   public abstract dak dI();

   public boolean y() {
      return false;
   }

   public boolean z() {
      return false;
   }
}
