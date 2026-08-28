import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class crr extends csj {
   private static final fbs b = new fbs(0.0, 0.0, 0.0);
   private static final alc<Integer> c = alg.a(crr.class, ale.b);
   private static final alc<Integer> d = alg.a(crr.class, ale.b);
   private static final alc<Boolean> h = alg.a(crr.class, ale.k);
   private static final ImmutableMap<bwn, ImmutableList<Integer>> i = ImmutableMap.of(
      bwn.a, ImmutableList.of(0, 1, -1), bwn.f, ImmutableList.of(0, 1, -1), bwn.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private boolean j;
   private boolean k;
   private final crz l;
   private static final Map<dyq, Pair<kl, kl>> m = ae.a(Maps.newEnumMap(dyq.class), $$0 -> {
      kl $$1 = jm.e.q();
      kl $$2 = jm.f.q();
      kl $$3 = jm.c.q();
      kl $$4 = jm.d.q();
      kl $$5 = $$1.p();
      kl $$6 = $$2.p();
      kl $$7 = $$3.p();
      kl $$8 = $$4.p();
      $$0.put(dyq.a, Pair.of($$3, $$4));
      $$0.put(dyq.b, Pair.of($$1, $$2));
      $$0.put(dyq.c, Pair.of($$5, $$2));
      $$0.put(dyq.d, Pair.of($$1, $$6));
      $$0.put(dyq.e, Pair.of($$3, $$8));
      $$0.put(dyq.f, Pair.of($$7, $$4));
      $$0.put(dyq.g, Pair.of($$4, $$2));
      $$0.put(dyq.h, Pair.of($$4, $$1));
      $$0.put(dyq.i, Pair.of($$3, $$1));
      $$0.put(dyq.j, Pair.of($$3, $$2));
   });

   protected crr(bvm<?> $$0, dha $$1) {
      super($$0, $$1);
      this.I = true;
      if (b($$1)) {
         this.l = new csg(this);
      } else {
         this.l = new csh(this);
      }
   }

   protected crr(bvm<?> $$0, dha $$1, double $$2, double $$3, double $$4) {
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
   public static <T extends crr> T a(dha $$0, double $$1, double $$2, double $$3, bvm<T> $$4, bvl $$5, cxk $$6, @Nullable cps $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         bvm.a($$0, $$6, $$7).accept($$8);
         if ($$8.l() instanceof csg $$9) {
            jh $$10 = $$8.p();
            dxn $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public crz l() {
      return this.l;
   }

   @Override
   protected bvf.b bg() {
      return bvf.b.c;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(c, dke.j(dkg.a.m()));
      $$0.a(d, 6);
      $$0.a(h, false);
   }

   @Override
   public boolean i(bvf $$0) {
      return crp.a(this, $$0);
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   public fbs a(jm.a $$0, l.a $$1) {
      return bwb.j(super.a($$0, $$1));
   }

   @Override
   protected fbs a(bvf $$0, bvi $$1, float $$2) {
      boolean $$3 = $$0 instanceof cpe || $$0 instanceof cpk;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public fbs b(bwb $$0) {
      jm $$1 = this.cP();
      if ($$1.o() == jm.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = crx.a($$1);
         jh $$3 = this.dv();
         jh.a $$4 = new jh.a();
         ImmutableList<bwn> $$5 = $$0.fM();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bwn $$6 = (bwn)$$14.next();
            bvi $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)i.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dV().a(crx.a(this.dV(), $$4), () -> crx.a(this.dV(), $$4.e()));
                  if (crx.a($$11)) {
                     fbn $$12 = new fbn((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     fbs $$13 = fbs.a($$4, $$11);
                     if (crx.a(this.dV(), $$0, $$12.c($$13))) {
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
            bwn $$15 = (bwn)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = bae.c($$14x - (double)$$4.v() + $$16);
            double $$18 = crx.a($$4, $$17, $$0x -> this.dV().a_($$0x).g(this.dV(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aT() {
      dxn $$0 = this.dV().a_(this.dv());
      return $$0.a(axu.P) ? 1.0F : super.aT();
   }

   @Override
   public void p(float $$0) {
      this.l(-this.O());
      this.d(10);
      this.b(this.L() + this.L() * 10.0F);
   }

   @Override
   public boolean bH() {
      return !this.dQ();
   }

   public static Pair<kl, kl> a(dyq $$0) {
      return m.get($$0);
   }

   @Override
   public jm cP() {
      return this.l.q();
   }

   @Override
   protected double bd() {
      return this.bj() ? 0.005 : 0.04;
   }

   @Override
   public void h() {
      if (this.N() > 0) {
         this.d(this.N() - 1);
      }

      if (this.L() > 0.0F) {
         this.b(this.L() - 1.0F);
      }

      this.aA();
      this.bW();
      this.l.g();
      this.bq();
      if (this.bx()) {
         this.aE();
         this.Z *= 0.5F;
      }

      this.ak = false;
   }

   public boolean m() {
      return this.ak;
   }

   public jh p() {
      int $$0 = bae.a(this.dA());
      int $$1 = bae.a(this.dC());
      int $$2 = bae.a(this.dG());
      if (b(this.dV())) {
         double $$3 = this.dC() - 0.1 - 1.0E-5F;
         if (this.dV().a_(jh.a((double)$$0, $$3, (double)$$2)).a(axu.P)) {
            $$1 = bae.a($$3);
         }
      } else if (this.dV().a_(new jh($$0, $$1 - 1, $$2)).a(axu.P)) {
         $$1--;
      }

      return new jh($$0, $$1, $$2);
   }

   protected double a(ash $$0) {
      return this.l.b($$0);
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   public void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void bf() {
      super.bf();
   }

   @Override
   public void ay() {
      super.ay();
   }

   @Override
   public boolean bq() {
      return super.bq();
   }

   @Override
   public fbs ah() {
      return this.l.c(super.ah());
   }

   @Override
   public void f_() {
      this.l.a();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.l.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public double R_() {
      return this.l.b();
   }

   @Override
   public double S_() {
      return this.l.c();
   }

   @Override
   public double g_() {
      return this.l.d();
   }

   @Override
   public float r_() {
      return this.l.e();
   }

   @Override
   public float h_() {
      return this.l.f();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.l.a($$0, $$1, $$2);
   }

   protected void b(ash $$0) {
      this.l.a($$0);
   }

   protected void e(ash $$0) {
      double $$1 = this.a($$0);
      fbs $$2 = this.dy();
      this.n(bae.a($$2.d, -$$1, $$1), $$2.e, bae.a($$2.f, -$$1, $$1));
      if (this.aJ()) {
         this.h(this.dy().c(0.5));
      }

      this.a(bwf.a, this.dy());
      if (!this.aJ()) {
         this.h(this.dy().c(0.95));
      }
   }

   protected double a(jh $$0, dyq $$1, double $$2) {
      return this.l.a($$0, $$1, $$2);
   }

   @Override
   public void a(bwf $$0, fbs $$1) {
      if (b(this.dV())) {
         fbs $$2 = this.dt().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.l.i();
         if ($$3) {
            super.a($$0, $$2.d(this.dt()));
         }

         if ($$0.equals(bwf.c)) {
            this.j = false;
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean cq() {
      return this.j;
   }

   public void a(boolean $$0) {
      this.j = $$0;
   }

   @Override
   public boolean s() {
      return this.k;
   }

   public void b(boolean $$0) {
      this.k = $$0;
   }

   public fbs a(jh $$0) {
      dxn $$1 = this.dV().a_($$0);
      if ($$1.a(dkg.bw) && $$1.c(dqd.f)) {
         dyq $$2 = $$1.c(((djt)$$1.b()).c());
         if ($$2 == dyq.b) {
            if (this.b($$0.h())) {
               return new fbs(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new fbs(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dyq.a) {
            if (this.b($$0.f())) {
               return new fbs(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new fbs(0.0, 0.0, -1.0);
            }
         }

         return fbs.c;
      } else {
         return fbs.c;
      }
   }

   public boolean b(jh $$0) {
      return this.dV().a_($$0).d(this.dV(), $$0);
   }

   @Override
   protected fbs a(fbs $$0) {
      double $$1 = this.l.r();
      fbs $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bj()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(ux $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(vm.a(this.dV().a(mb.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.k = $$0.q("FlippedRotation");
      this.ak = $$0.q("HasTicked");
   }

   @Override
   protected void b(ux $$0) {
      if (this.A()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", vm.a(this.t()));
         $$0.a("DisplayOffset", this.y());
      }

      $$0.a("FlippedRotation", this.k);
      $$0.a("HasTicked", this.ak);
   }

   @Override
   public void h(bvf $$0) {
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
                  if ($$0 instanceof crr $$5) {
                     this.a($$5, $$1, $$2);
                  } else {
                     this.j(-$$1, 0.0, -$$2);
                     $$0.j($$1 / 4.0, 0.0, $$2 / 4.0);
                  }
               }
            }
         }
      }
   }

   private void a(crr $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dV())) {
         $$3 = this.dy().d;
         $$4 = this.dy().f;
      } else {
         $$3 = $$0.dA() - this.dA();
         $$4 = $$0.dG() - this.dG();
      }

      fbs $$7 = new fbs($$3, 0.0, $$4).d();
      fbs $$8 = new fbs((double)bae.b(this.dL() * (float) (Math.PI / 180.0)), 0.0, (double)bae.a(this.dL() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dV())) {
         fbs $$10 = this.dy();
         fbs $$11 = $$0.dy();
         if ($$0.E() && !this.E()) {
            this.h($$10.d(0.2, 1.0, 0.2));
            this.j($$11.d - $$1, 0.0, $$11.f - $$2);
            $$0.h($$11.d(0.95, 1.0, 0.95));
         } else if (!$$0.E() && this.E()) {
            $$0.h($$11.d(0.2, 1.0, 0.2));
            $$0.j($$10.d + $$1, 0.0, $$10.f + $$2);
            this.h($$10.d(0.95, 1.0, 0.95));
         } else {
            double $$12 = ($$11.d + $$10.d) / 2.0;
            double $$13 = ($$11.f + $$10.f) / 2.0;
            this.h($$10.d(0.2, 1.0, 0.2));
            this.j($$12 - $$1, 0.0, $$13 - $$2);
            $$0.h($$11.d(0.2, 1.0, 0.2));
            $$0.j($$12 + $$1, 0.0, $$13 + $$2);
         }
      }
   }

   public dxn t() {
      return !this.A() ? this.w() : dke.a(this.au().a(c));
   }

   public dxn w() {
      return dkg.a.m();
   }

   public int y() {
      return !this.A() ? this.z() : this.au().a(d);
   }

   public int z() {
      return 6;
   }

   public void c(dxn $$0) {
      this.au().a(c, dke.j($$0));
      this.r(true);
   }

   public void c(int $$0) {
      this.au().a(d, $$0);
      this.r(true);
   }

   public boolean A() {
      return this.au().a(h);
   }

   public void r(boolean $$0) {
      this.au().a(h, $$0);
   }

   public static boolean b(dha $$0) {
      return $$0.J().b(csq.e);
   }

   @Override
   public abstract cxk dI();

   public boolean D() {
      return false;
   }

   public boolean E() {
      return false;
   }
}
