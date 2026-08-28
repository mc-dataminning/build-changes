import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cqv extends crn {
   private static final faz b = new faz(0.0, 0.0, 0.0);
   private static final ajy<Integer> c = akc.a(cqv.class, aka.b);
   private static final ajy<Integer> d = akc.a(cqv.class, aka.b);
   private static final ajy<Boolean> h = akc.a(cqv.class, aka.k);
   private static final ImmutableMap<bvs, ImmutableList<Integer>> i = ImmutableMap.of(
      bvs.a, ImmutableList.of(0, 1, -1), bvs.f, ImmutableList.of(0, 1, -1), bvs.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private boolean j;
   private boolean k;
   private final crd l;
   private static final Map<dxz, Pair<km, km>> m = af.a(Maps.newEnumMap(dxz.class), $$0 -> {
      km $$1 = jn.e.q();
      km $$2 = jn.f.q();
      km $$3 = jn.c.q();
      km $$4 = jn.d.q();
      km $$5 = $$1.p();
      km $$6 = $$2.p();
      km $$7 = $$3.p();
      km $$8 = $$4.p();
      $$0.put(dxz.a, Pair.of($$3, $$4));
      $$0.put(dxz.b, Pair.of($$1, $$2));
      $$0.put(dxz.c, Pair.of($$5, $$2));
      $$0.put(dxz.d, Pair.of($$1, $$6));
      $$0.put(dxz.e, Pair.of($$3, $$8));
      $$0.put(dxz.f, Pair.of($$7, $$4));
      $$0.put(dxz.g, Pair.of($$4, $$2));
      $$0.put(dxz.h, Pair.of($$4, $$1));
      $$0.put(dxz.i, Pair.of($$3, $$1));
      $$0.put(dxz.j, Pair.of($$3, $$2));
   });

   protected cqv(bur<?> $$0, dgh $$1) {
      super($$0, $$1);
      this.I = true;
      if (b($$1)) {
         this.l = new crk(this);
      } else {
         this.l = new crl(this);
      }
   }

   protected cqv(bur<?> $$0, dgh $$1, double $$2, double $$3, double $$4) {
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
   public static <T extends cqv> T a(dgh $$0, double $$1, double $$2, double $$3, bur<T> $$4, buq $$5, cwo $$6, @Nullable cow $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         bur.a($$0, $$6, $$7).accept($$8);
         if ($$8.l() instanceof crk $$9) {
            ji $$10 = $$8.p();
            dww $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public crd l() {
      return this.l;
   }

   @Override
   protected buk.c bg() {
      return buk.c.c;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(c, djl.j(djn.a.m()));
      $$0.a(d, 6);
      $$0.a(h, false);
   }

   @Override
   public boolean i(buk $$0) {
      return cqt.a(this, $$0);
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   public faz a(jn.a $$0, l.a $$1) {
      return bvg.k(super.a($$0, $$1));
   }

   @Override
   protected faz a(buk $$0, bun $$1, float $$2) {
      boolean $$3 = $$0 instanceof coh || $$0 instanceof coo;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public faz b(bvg $$0) {
      jn $$1 = this.cP();
      if ($$1.o() == jn.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = crb.a($$1);
         ji $$3 = this.dv();
         ji.a $$4 = new ji.a();
         ImmutableList<bvs> $$5 = $$0.fO();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bvs $$6 = (bvs)$$14.next();
            bun $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)i.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dV().a(crb.a(this.dV(), $$4), () -> crb.a(this.dV(), $$4.e()));
                  if (crb.a($$11)) {
                     fau $$12 = new fau((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     faz $$13 = faz.a($$4, $$11);
                     if (crb.a(this.dV(), $$0, $$12.c($$13))) {
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
            bvs $$15 = (bvs)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = ayz.c($$14x - (double)$$4.v() + $$16);
            double $$18 = crb.a($$4, $$17, $$0x -> this.dV().a_($$0x).g(this.dV(), $$0x));
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
      dww $$0 = this.dV().a_(this.dv());
      return $$0.a(awp.P) ? 1.0F : super.aT();
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

   public static Pair<km, km> a(dxz $$0) {
      return m.get($$0);
   }

   @Override
   public jn cP() {
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

   public ji p() {
      int $$0 = ayz.a(this.dA());
      int $$1 = ayz.a(this.dC());
      int $$2 = ayz.a(this.dG());
      if (b(this.dV())) {
         double $$3 = this.dC() - 0.1 - 1.0E-5F;
         if (this.dV().a_(ji.a((double)$$0, $$3, (double)$$2)).a(awp.P)) {
            $$1 = ayz.a($$3);
         }
      } else if (this.dV().a_(new ji($$0, $$1 - 1, $$2)).a(awp.P)) {
         $$1--;
      }

      return new ji($$0, $$1, $$2);
   }

   protected double a(ard $$0) {
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
   public faz ah() {
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

   protected void b(ard $$0) {
      this.l.a($$0);
   }

   protected void e(ard $$0) {
      double $$1 = this.a($$0);
      faz $$2 = this.dy();
      this.n(ayz.a($$2.d, -$$1, $$1), $$2.e, ayz.a($$2.f, -$$1, $$1));
      if (this.aJ()) {
         this.i(this.dy().c(0.5));
      }

      this.a(bvk.a, this.dy());
      if (!this.aJ()) {
         this.i(this.dy().c(0.95));
      }
   }

   protected double a(ji $$0, dxz $$1, double $$2) {
      return this.l.a($$0, $$1, $$2);
   }

   @Override
   public void a(bvk $$0, faz $$1) {
      if (b(this.dV())) {
         faz $$2 = this.dt().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.l.i();
         if ($$3) {
            super.a($$0, $$2.d(this.dt()));
         }

         if ($$0.equals(bvk.c)) {
            this.j = false;
         }
      } else {
         super.a($$0, $$1);
         this.aK();
      }
   }

   @Override
   public void aK() {
      if (!b(this.dV())) {
         this.a(this.dt(), this.dt());
      } else {
         super.aK();
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

   public faz a(ji $$0) {
      dww $$1 = this.dV().a_($$0);
      if ($$1.a(djn.bw) && $$1.c(dpm.f)) {
         dxz $$2 = $$1.c(((dja)$$1.b()).c());
         if ($$2 == dxz.b) {
            if (this.b($$0.h())) {
               return new faz(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new faz(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dxz.a) {
            if (this.b($$0.f())) {
               return new faz(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new faz(0.0, 0.0, -1.0);
            }
         }

         return faz.c;
      } else {
         return faz.c;
      }
   }

   public boolean b(ji $$0) {
      return this.dV().a_($$0).d(this.dV(), $$0);
   }

   @Override
   protected faz a(faz $$0) {
      double $$1 = this.l.r();
      faz $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bj()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(tq $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(uf.a(this.dV().a(mc.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.k = $$0.q("FlippedRotation");
      this.ak = $$0.q("HasTicked");
   }

   @Override
   protected void b(tq $$0) {
      if (this.A()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", uf.a(this.t()));
         $$0.a("DisplayOffset", this.y());
      }

      $$0.a("FlippedRotation", this.k);
      $$0.a("HasTicked", this.ak);
   }

   @Override
   public void h(buk $$0) {
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
                  if ($$0 instanceof cqv $$5) {
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

   private void a(cqv $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dV())) {
         $$3 = this.dy().d;
         $$4 = this.dy().f;
      } else {
         $$3 = $$0.dA() - this.dA();
         $$4 = $$0.dG() - this.dG();
      }

      faz $$7 = new faz($$3, 0.0, $$4).d();
      faz $$8 = new faz((double)ayz.b(this.dL() * (float) (Math.PI / 180.0)), 0.0, (double)ayz.a(this.dL() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dV())) {
         faz $$10 = this.dy();
         faz $$11 = $$0.dy();
         if ($$0.C() && !this.C()) {
            this.i($$10.d(0.2, 1.0, 0.2));
            this.j($$11.d - $$1, 0.0, $$11.f - $$2);
            $$0.i($$11.d(0.95, 1.0, 0.95));
         } else if (!$$0.C() && this.C()) {
            $$0.i($$11.d(0.2, 1.0, 0.2));
            $$0.j($$10.d + $$1, 0.0, $$10.f + $$2);
            this.i($$10.d(0.95, 1.0, 0.95));
         } else {
            double $$12 = ($$11.d + $$10.d) / 2.0;
            double $$13 = ($$11.f + $$10.f) / 2.0;
            this.i($$10.d(0.2, 1.0, 0.2));
            this.j($$12 - $$1, 0.0, $$13 - $$2);
            $$0.i($$11.d(0.2, 1.0, 0.2));
            $$0.j($$12 + $$1, 0.0, $$13 + $$2);
         }
      }
   }

   public dww t() {
      return !this.A() ? this.w() : djl.a(this.au().a(c));
   }

   public dww w() {
      return djn.a.m();
   }

   public int y() {
      return !this.A() ? this.z() : this.au().a(d);
   }

   public int z() {
      return 6;
   }

   public void c(dww $$0) {
      this.au().a(c, djl.j($$0));
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

   public static boolean b(dgh $$0) {
      return $$0.K().b(cru.d);
   }

   @Override
   public abstract cwo dI();

   public boolean B() {
      return false;
   }

   public boolean C() {
      return false;
   }
}
