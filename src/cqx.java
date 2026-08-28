import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cqx extends crp {
   private static final fbb b = new fbb(0.0, 0.0, 0.0);
   private static final ajy<Integer> c = akc.a(cqx.class, aka.b);
   private static final ajy<Integer> d = akc.a(cqx.class, aka.b);
   private static final ajy<Boolean> h = akc.a(cqx.class, aka.k);
   private static final ImmutableMap<bvu, ImmutableList<Integer>> i = ImmutableMap.of(
      bvu.a, ImmutableList.of(0, 1, -1), bvu.f, ImmutableList.of(0, 1, -1), bvu.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private boolean j;
   private boolean k;
   private final crf l;
   private static final Map<dyb, Pair<km, km>> m = af.a(Maps.newEnumMap(dyb.class), $$0 -> {
      km $$1 = jn.e.q();
      km $$2 = jn.f.q();
      km $$3 = jn.c.q();
      km $$4 = jn.d.q();
      km $$5 = $$1.p();
      km $$6 = $$2.p();
      km $$7 = $$3.p();
      km $$8 = $$4.p();
      $$0.put(dyb.a, Pair.of($$3, $$4));
      $$0.put(dyb.b, Pair.of($$1, $$2));
      $$0.put(dyb.c, Pair.of($$5, $$2));
      $$0.put(dyb.d, Pair.of($$1, $$6));
      $$0.put(dyb.e, Pair.of($$3, $$8));
      $$0.put(dyb.f, Pair.of($$7, $$4));
      $$0.put(dyb.g, Pair.of($$4, $$2));
      $$0.put(dyb.h, Pair.of($$4, $$1));
      $$0.put(dyb.i, Pair.of($$3, $$1));
      $$0.put(dyb.j, Pair.of($$3, $$2));
   });

   protected cqx(but<?> $$0, dgj $$1) {
      super($$0, $$1);
      this.I = true;
      if (b($$1)) {
         this.l = new crm(this);
      } else {
         this.l = new crn(this);
      }
   }

   protected cqx(but<?> $$0, dgj $$1, double $$2, double $$3, double $$4) {
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
   public static <T extends cqx> T a(dgj $$0, double $$1, double $$2, double $$3, but<T> $$4, bus $$5, cwq $$6, @Nullable coy $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         but.a($$0, $$6, $$7).accept($$8);
         if ($$8.l() instanceof crm $$9) {
            ji $$10 = $$8.p();
            dwy $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public crf l() {
      return this.l;
   }

   @Override
   protected bum.c bg() {
      return bum.c.c;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(c, djn.j(djp.a.m()));
      $$0.a(d, 6);
      $$0.a(h, false);
   }

   @Override
   public boolean i(bum $$0) {
      return cqv.a(this, $$0);
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   public fbb a(jn.a $$0, l.a $$1) {
      return bvi.k(super.a($$0, $$1));
   }

   @Override
   protected fbb a(bum $$0, bup $$1, float $$2) {
      boolean $$3 = $$0 instanceof coj || $$0 instanceof coq;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public fbb b(bvi $$0) {
      jn $$1 = this.cP();
      if ($$1.o() == jn.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = crd.a($$1);
         ji $$3 = this.dv();
         ji.a $$4 = new ji.a();
         ImmutableList<bvu> $$5 = $$0.fO();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bvu $$6 = (bvu)$$14.next();
            bup $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)i.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dV().a(crd.a(this.dV(), $$4), () -> crd.a(this.dV(), $$4.e()));
                  if (crd.a($$11)) {
                     faw $$12 = new faw((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     fbb $$13 = fbb.a($$4, $$11);
                     if (crd.a(this.dV(), $$0, $$12.c($$13))) {
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
            bvu $$15 = (bvu)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = ayz.c($$14x - (double)$$4.v() + $$16);
            double $$18 = crd.a($$4, $$17, $$0x -> this.dV().a_($$0x).g(this.dV(), $$0x));
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
      dwy $$0 = this.dV().a_(this.dv());
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

   public static Pair<km, km> a(dyb $$0) {
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
   public fbb ah() {
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
      fbb $$2 = this.dy();
      this.n(ayz.a($$2.d, -$$1, $$1), $$2.e, ayz.a($$2.f, -$$1, $$1));
      if (this.aJ()) {
         this.i(this.dy().c(0.5));
      }

      this.a(bvm.a, this.dy());
      if (!this.aJ()) {
         this.i(this.dy().c(0.95));
      }
   }

   protected double a(ji $$0, dyb $$1, double $$2) {
      return this.l.a($$0, $$1, $$2);
   }

   @Override
   public void a(bvm $$0, fbb $$1) {
      if (b(this.dV())) {
         fbb $$2 = this.dt().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.l.i();
         if ($$3) {
            super.a($$0, $$2.d(this.dt()));
         }

         if ($$0.equals(bvm.c)) {
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

   public fbb a(ji $$0) {
      dwy $$1 = this.dV().a_($$0);
      if ($$1.a(djp.bw) && $$1.c(dpo.f)) {
         dyb $$2 = $$1.c(((djc)$$1.b()).c());
         if ($$2 == dyb.b) {
            if (this.b($$0.h())) {
               return new fbb(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new fbb(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dyb.a) {
            if (this.b($$0.f())) {
               return new fbb(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new fbb(0.0, 0.0, -1.0);
            }
         }

         return fbb.c;
      } else {
         return fbb.c;
      }
   }

   public boolean b(ji $$0) {
      return this.dV().a_($$0).d(this.dV(), $$0);
   }

   @Override
   protected fbb a(fbb $$0) {
      double $$1 = this.l.r();
      fbb $$2 = $$0.d($$1, 0.0, $$1);
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
   public void h(bum $$0) {
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
                  if ($$0 instanceof cqx $$5) {
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

   private void a(cqx $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dV())) {
         $$3 = this.dy().d;
         $$4 = this.dy().f;
      } else {
         $$3 = $$0.dA() - this.dA();
         $$4 = $$0.dG() - this.dG();
      }

      fbb $$7 = new fbb($$3, 0.0, $$4).d();
      fbb $$8 = new fbb((double)ayz.b(this.dL() * (float) (Math.PI / 180.0)), 0.0, (double)ayz.a(this.dL() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dV())) {
         fbb $$10 = this.dy();
         fbb $$11 = $$0.dy();
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

   public dwy t() {
      return !this.A() ? this.w() : djn.a(this.au().a(c));
   }

   public dwy w() {
      return djp.a.m();
   }

   public int y() {
      return !this.A() ? this.z() : this.au().a(d);
   }

   public int z() {
      return 6;
   }

   public void c(dwy $$0) {
      this.au().a(c, djn.j($$0));
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

   public static boolean b(dgj $$0) {
      return $$0.K().b(crw.d);
   }

   @Override
   public abstract cwq dI();

   public boolean B() {
      return false;
   }

   public boolean C() {
      return false;
   }
}
