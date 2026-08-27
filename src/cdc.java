import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cdc extends big {
   private static final adx<Integer> c = aea.a(cdc.class, adz.b);
   private static final adx<Integer> d = aea.a(cdc.class, adz.b);
   private static final adx<Float> e = aea.a(cdc.class, adz.d);
   private static final adx<Integer> f = aea.a(cdc.class, adz.b);
   private static final adx<Integer> g = aea.a(cdc.class, adz.b);
   private static final adx<Boolean> h = aea.a(cdc.class, adz.k);
   private static final ImmutableMap<bji, ImmutableList<Integer>> i = ImmutableMap.of(
      bji.a, ImmutableList.of(0, 1, -1), bji.f, ImmutableList.of(0, 1, -1), bji.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean j;
   private boolean k;
   private int l;
   private double m;
   private double n;
   private double o;
   private double p;
   private double q;
   private ehf r = ehf.b;
   private static final Map<dgc, Pair<ia, ia>> s = ac.a(Maps.newEnumMap(dgc.class), $$0 -> {
      ia $$1 = hb.e.q();
      ia $$2 = hb.f.q();
      ia $$3 = hb.c.q();
      ia $$4 = hb.d.q();
      ia $$5 = $$1.o();
      ia $$6 = $$2.o();
      ia $$7 = $$3.o();
      ia $$8 = $$4.o();
      $$0.put(dgc.a, Pair.of($$3, $$4));
      $$0.put(dgc.b, Pair.of($$1, $$2));
      $$0.put(dgc.c, Pair.of($$5, $$2));
      $$0.put(dgc.d, Pair.of($$1, $$6));
      $$0.put(dgc.e, Pair.of($$3, $$8));
      $$0.put(dgc.f, Pair.of($$7, $$4));
      $$0.put(dgc.g, Pair.of($$4, $$2));
      $$0.put(dgc.h, Pair.of($$4, $$1));
      $$0.put(dgc.i, Pair.of($$3, $$1));
      $$0.put(dgc.j, Pair.of($$3, $$2));
   });

   protected cdc(bik<?> $$0, cpk $$1) {
      super($$0, $$1);
      this.I = true;
   }

   protected cdc(bik<?> $$0, cpk $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.e($$2, $$3, $$4);
      this.K = $$2;
      this.L = $$3;
      this.M = $$4;
   }

   public static cdc a(cpk $$0, double $$1, double $$2, double $$3, cdc.a $$4) {
      if ($$4 == cdc.a.b) {
         return new cdj($$0, $$1, $$2, $$3);
      } else if ($$4 == cdc.a.c) {
         return new cdl($$0, $$1, $$2, $$3);
      } else if ($$4 == cdc.a.d) {
         return new cdo($$0, $$1, $$2, $$3);
      } else if ($$4 == cdc.a.e) {
         return new cdn($$0, $$1, $$2, $$3);
      } else if ($$4 == cdc.a.f) {
         return new cdm($$0, $$1, $$2, $$3);
      } else {
         return (cdc)($$4 == cdc.a.g ? new cdk($$0, $$1, $$2, $$3) : new cdi($$0, $$1, $$2, $$3));
      }
   }

   @Override
   protected big.b aU() {
      return big.b.c;
   }

   @Override
   protected void a_() {
      this.an.a(c, 0);
      this.an.a(d, 1);
      this.an.a(e, 0.0F);
      this.an.a(f, csk.i(csl.a.n()));
      this.an.a(g, 6);
      this.an.a(h, false);
   }

   @Override
   public boolean h(big $$0) {
      return cde.a(this, $$0);
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   protected ehf a(hb.a $$0, l.a $$1) {
      return biw.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, 0.0F, 0.0F);
   }

   @Override
   public ehf b(biw $$0) {
      hb $$1 = this.cE();
      if ($$1.o() == hb.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cdh.a($$1);
         gv $$3 = this.dk();
         gv.a $$4 = new gv.a();
         ImmutableList<bji> $$5 = $$0.fy();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bji $$6 = (bji)$$14.next();
            bih $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a, 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)i.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dK().a(cdh.a(this.dK(), $$4), () -> cdh.a(this.dK(), $$4.d()));
                  if (cdh.a($$11)) {
                     eha $$12 = new eha((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b, (double)$$8);
                     ehf $$13 = ehf.a($$4, $$11);
                     if (cdh.a(this.dK(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cG().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bji $$15 = (bji)var22.next();
            double $$16 = (double)$$0.a($$15).b;
            int $$17 = aro.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cdh.a($$4, $$17, $$0x -> this.dK().a_($$0x).k(this.dK(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.dK().B || this.dF()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.d(-this.s());
         this.c(10);
         this.bo();
         this.a(this.q() + $$1 * 10.0F);
         this.a(dji.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cbl && ((cbl)$$0.d()).fR().d;
         if ($$2 || this.q() > 40.0F) {
            this.bA();
            if ($$2 && !this.ac()) {
               this.ak();
            } else {
               this.a($$0);
            }
         }

         return true;
      }
   }

   @Override
   protected float aJ() {
      dey $$0 = this.dK().a_(this.dk());
      return $$0.a(apj.N) ? 1.0F : super.aJ();
   }

   public void a(bhe $$0) {
      this.aj();
      if (this.dK().X().b(cpg.h)) {
         ciw $$1 = new ciw(this.j());
         if (this.ac()) {
            $$1.a(this.ad());
         }

         this.b($$1);
      }
   }

   abstract cir j();

   @Override
   public void m(float $$0) {
      this.d(-this.s());
      this.c(10);
      this.a(this.q() + this.q() * 10.0F);
   }

   @Override
   public boolean br() {
      return !this.dF();
   }

   private static Pair<ia, ia> a(dgc $$0) {
      return s.get($$0);
   }

   @Override
   public hb cE() {
      return this.j ? this.cD().g().h() : this.cD().h();
   }

   @Override
   public void l() {
      if (this.r() > 0) {
         this.c(this.r() - 1);
      }

      if (this.q() > 0.0F) {
         this.a(this.q() - 1.0F);
      }

      this.ar();
      this.bH();
      if (this.dK().B) {
         if (this.l > 0) {
            this.a(this.l, this.m, this.n, this.o, this.p, this.q);
            this.l--;
         } else {
            this.ap();
            this.a(this.dA(), this.dC());
         }
      } else {
         if (!this.aT()) {
            double $$0 = this.aX() ? -0.005 : -0.04;
            this.f(this.dn().b(0.0, $$0, 0.0));
         }

         int $$1 = aro.a(this.dp());
         int $$2 = aro.a(this.dr());
         int $$3 = aro.a(this.dv());
         if (this.dK().a_(new gv($$1, $$2 - 1, $$3)).a(apj.N)) {
            $$2--;
         }

         gv $$4 = new gv($$1, $$2, $$3);
         dey $$5 = this.dK().a_($$4);
         this.k = csa.g($$5);
         if (this.k) {
            this.c($$4, $$5);
            if ($$5.a(csl.hh)) {
               this.a($$1, $$2, $$3, $$5.c(cyf.e));
            }
         } else {
            this.o();
         }

         this.aO();
         this.s(0.0F);
         double $$6 = this.K - this.dp();
         double $$7 = this.M - this.dv();
         if ($$6 * $$6 + $$7 * $$7 > 0.001) {
            this.r((float)(aro.d($$7, $$6) * 180.0 / Math.PI));
            if (this.j) {
               this.r(this.dA() + 180.0F);
            }
         }

         double $$8 = (double)aro.g(this.dA() - this.N);
         if ($$8 < -170.0 || $$8 >= 170.0) {
            this.r(this.dA() + 180.0F);
            this.j = !this.j;
         }

         this.a(this.dA(), this.dC());
         if (this.t() == cdc.a.a && this.dn().i() > 0.01) {
            List<big> $$9 = this.dK().a(this, this.cG().c(0.2F, 0.0, 0.2F), bij.a(this));
            if (!$$9.isEmpty()) {
               for (int $$10 = 0; $$10 < $$9.size(); $$10++) {
                  big $$11 = $$9.get($$10);
                  if (!($$11 instanceof cbl) && !($$11 instanceof buu) && !($$11 instanceof cdc) && !this.bO() && !$$11.bN()) {
                     $$11.n(this);
                  } else {
                     $$11.g(this);
                  }
               }
            }
         } else {
            for (big $$12 : this.dK().a_(this, this.cG().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$12) && $$12.bs() && $$12 instanceof cdc) {
                  $$12.g(this);
               }
            }
         }

         this.be();
         if (this.bl()) {
            this.aw();
            this.ab *= 0.5F;
         }

         this.am = false;
      }
   }

   protected double m() {
      return (this.aX() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   protected void o() {
      double $$0 = this.m();
      ehf $$1 = this.dn();
      this.o(aro.a($$1.c, -$$0, $$0), $$1.d, aro.a($$1.e, -$$0, $$0));
      if (this.aA()) {
         this.f(this.dn().a(0.5));
      }

      this.a(bjc.a, this.dn());
      if (!this.aA()) {
         this.f(this.dn().a(0.95));
      }
   }

   @Override
   protected void c(gv $$0, dey $$1) {
      this.n();
      double $$2 = this.dp();
      double $$3 = this.dr();
      double $$4 = this.dv();
      ehf $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(csl.bp)) {
         $$6 = $$1.c(cyf.e);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.aX()) {
         $$8 *= 0.2;
      }

      ehf $$9 = this.dn();
      dgc $$10 = $$1.c(((csa)$$1.b()).b());
      switch ($$10) {
         case c:
            this.f($$9.b(-$$8, 0.0, 0.0));
            $$3++;
            break;
         case d:
            this.f($$9.b($$8, 0.0, 0.0));
            $$3++;
            break;
         case e:
            this.f($$9.b(0.0, 0.0, $$8));
            $$3++;
            break;
         case f:
            this.f($$9.b(0.0, 0.0, -$$8));
            $$3++;
      }

      $$9 = this.dn();
      Pair<ia, ia> $$11 = a($$10);
      ia $$12 = (ia)$$11.getFirst();
      ia $$13 = (ia)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new ehf($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.f($$9);
      big $$19 = this.cQ();
      if ($$19 instanceof cbl) {
         ehf $$20 = $$19.dn();
         double $$21 = $$20.i();
         double $$22 = this.dn().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.f(this.dn().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.dn().h();
         if ($$23 < 0.03) {
            this.f(ehf.b);
         } else {
            this.f(this.dn().d(0.5, 0.0, 0.5));
         }
      }

      double $$24 = (double)$$0.u() + 0.5 + (double)$$12.u() * 0.5;
      double $$25 = (double)$$0.w() + 0.5 + (double)$$12.w() * 0.5;
      double $$26 = (double)$$0.u() + 0.5 + (double)$$13.u() * 0.5;
      double $$27 = (double)$$0.w() + 0.5 + (double)$$13.w() * 0.5;
      $$14 = $$26 - $$24;
      $$15 = $$27 - $$25;
      double $$28;
      if ($$14 == 0.0) {
         $$28 = $$4 - (double)$$0.w();
      } else if ($$15 == 0.0) {
         $$28 = $$2 - (double)$$0.u();
      } else {
         double $$30 = $$2 - $$24;
         double $$31 = $$4 - $$25;
         $$28 = ($$30 * $$14 + $$31 * $$15) * 2.0;
      }

      $$2 = $$24 + $$14 * $$28;
      $$4 = $$25 + $$15 * $$28;
      this.e($$2, $$3, $$4);
      double $$33 = this.bO() ? 0.75 : 1.0;
      double $$34 = this.m();
      $$9 = this.dn();
      this.a(bjc.a, new ehf(aro.a($$33 * $$9.c, -$$34, $$34), 0.0, aro.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && aro.a(this.dp()) - $$0.u() == $$12.u() && aro.a(this.dv()) - $$0.w() == $$12.w()) {
         this.e(this.dp(), this.dr() + (double)$$12.v(), this.dv());
      } else if ($$13.v() != 0 && aro.a(this.dp()) - $$0.u() == $$13.u() && aro.a(this.dv()) - $$0.w() == $$13.w()) {
         this.e(this.dp(), this.dr() + (double)$$13.v(), this.dv());
      }

      this.p();
      ehf $$35 = this.q(this.dp(), this.dr(), this.dv());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         ehf $$37 = this.dn();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.f($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.e(this.dp(), $$35.d, this.dv());
      }

      int $$39 = aro.a(this.dp());
      int $$40 = aro.a(this.dv());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         ehf $$41 = this.dn();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         ehf $$43 = this.dn();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.f($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            ehf $$46 = this.dn();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dgc.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dgc.a) {
                  return;
               }

               if (this.a($$0.e())) {
                  $$48 = 0.02;
               } else if (this.a($$0.f())) {
                  $$48 = -0.02;
               }
            }

            this.o($$47, $$46.d, $$48);
         }
      }
   }

   @Override
   public boolean ce() {
      return this.k;
   }

   private boolean a(gv $$0) {
      return this.dK().a_($$0).g(this.dK(), $$0);
   }

   protected void p() {
      double $$0 = this.bO() ? 0.997 : 0.96;
      ehf $$1 = this.dn();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.aX()) {
         $$1 = $$1.a(0.95F);
      }

      this.f($$1);
   }

   @Nullable
   public ehf a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = aro.a($$0);
      int $$5 = aro.a($$1);
      int $$6 = aro.a($$2);
      if (this.dK().a_(new gv($$4, $$5 - 1, $$6)).a(apj.N)) {
         $$5--;
      }

      dey $$7 = this.dK().a_(new gv($$4, $$5, $$6));
      if (csa.g($$7)) {
         dgc $$8 = $$7.c(((csa)$$7.b()).b());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<ia, ia> $$9 = a($$8);
         ia $$10 = (ia)$$9.getFirst();
         ia $$11 = (ia)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && aro.a($$0) - $$4 == $$10.u() && aro.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && aro.a($$0) - $$4 == $$11.u() && aro.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public ehf q(double $$0, double $$1, double $$2) {
      int $$3 = aro.a($$0);
      int $$4 = aro.a($$1);
      int $$5 = aro.a($$2);
      if (this.dK().a_(new gv($$3, $$4 - 1, $$5)).a(apj.N)) {
         $$4--;
      }

      dey $$6 = this.dK().a_(new gv($$3, $$4, $$5));
      if (csa.g($$6)) {
         dgc $$7 = $$6.c(((csa)$$6.b()).b());
         Pair<ia, ia> $$8 = a($$7);
         ia $$9 = (ia)$$8.getFirst();
         ia $$10 = (ia)$$8.getSecond();
         double $$11 = (double)$$3 + 0.5 + (double)$$9.u() * 0.5;
         double $$12 = (double)$$4 + 0.0625 + (double)$$9.v() * 0.5;
         double $$13 = (double)$$5 + 0.5 + (double)$$9.w() * 0.5;
         double $$14 = (double)$$3 + 0.5 + (double)$$10.u() * 0.5;
         double $$15 = (double)$$4 + 0.0625 + (double)$$10.v() * 0.5;
         double $$16 = (double)$$5 + 0.5 + (double)$$10.w() * 0.5;
         double $$17 = $$14 - $$11;
         double $$18 = ($$15 - $$12) * 2.0;
         double $$19 = $$16 - $$13;
         double $$20;
         if ($$17 == 0.0) {
            $$20 = $$2 - (double)$$5;
         } else if ($$19 == 0.0) {
            $$20 = $$0 - (double)$$3;
         } else {
            double $$22 = $$0 - $$11;
            double $$23 = $$2 - $$13;
            $$20 = ($$22 * $$17 + $$23 * $$19) * 2.0;
         }

         $$0 = $$11 + $$17 * $$20;
         $$1 = $$12 + $$18 * $$20;
         $$2 = $$13 + $$19 * $$20;
         if ($$18 < 0.0) {
            $$1++;
         } else if ($$18 > 0.0) {
            $$1 += 0.5;
         }

         return new ehf($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public eha k_() {
      eha $$0 = this.cG();
      return this.z() ? $$0.g((double)Math.abs(this.x()) / 16.0) : $$0;
   }

   @Override
   protected void a(qs $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(re.a(this.dK().a(jd.e), $$0.p("DisplayState")));
         this.m($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(qs $$0) {
      if (this.z()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", re.a(this.v()));
         $$0.a("DisplayOffset", this.x());
      }
   }

   @Override
   public void g(big $$0) {
      if (!this.dK().B) {
         if (!$$0.af && !this.af) {
            if (!this.x($$0)) {
               double $$1 = $$0.dp() - this.dp();
               double $$2 = $$0.dv() - this.dv();
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
                  if ($$0 instanceof cdc) {
                     double $$5 = $$0.dp() - this.dp();
                     double $$6 = $$0.dv() - this.dv();
                     ehf $$7 = new ehf($$5, 0.0, $$6).d();
                     ehf $$8 = new ehf((double)aro.b(this.dA() * (float) (Math.PI / 180.0)), 0.0, (double)aro.a(this.dA() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     ehf $$10 = this.dn();
                     ehf $$11 = $$0.dn();
                     if (((cdc)$$0).t() == cdc.a.c && this.t() != cdc.a.c) {
                        this.f($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.f($$11.d(0.95, 1.0, 0.95));
                     } else if (((cdc)$$0).t() != cdc.a.c && this.t() == cdc.a.c) {
                        $$0.f($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$10.c + $$1, 0.0, $$10.e + $$2);
                        this.f($$10.d(0.95, 1.0, 0.95));
                     } else {
                        double $$12 = ($$11.c + $$10.c) / 2.0;
                        double $$13 = ($$11.e + $$10.e) / 2.0;
                        this.f($$10.d(0.2, 1.0, 0.2));
                        this.j($$12 - $$1, 0.0, $$13 - $$2);
                        $$0.f($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$12 + $$1, 0.0, $$13 + $$2);
                     }
                  } else {
                     this.j(-$$1, 0.0, -$$2);
                     $$0.j($$1 / 4.0, 0.0, $$2 / 4.0);
                  }
               }
            }
         }
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.p = (double)$$3;
      this.q = (double)$$4;
      this.l = $$5 + 2;
      this.f(this.r);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.r = new ehf($$0, $$1, $$2);
      this.f(this.r);
   }

   public void a(float $$0) {
      this.an.b(e, $$0);
   }

   public float q() {
      return this.an.b(e);
   }

   public void c(int $$0) {
      this.an.b(c, $$0);
   }

   public int r() {
      return this.an.b(c);
   }

   public void d(int $$0) {
      this.an.b(d, $$0);
   }

   public int s() {
      return this.an.b(d);
   }

   public abstract cdc.a t();

   public dey v() {
      return !this.z() ? this.w() : csk.a(this.al().b(f));
   }

   public dey w() {
      return csl.a.n();
   }

   public int x() {
      return !this.z() ? this.y() : this.al().b(g);
   }

   public int y() {
      return 6;
   }

   public void c(dey $$0) {
      this.al().b(f, csk.i($$0));
      this.a(true);
   }

   public void m(int $$0) {
      this.al().b(g, $$0);
      this.a(true);
   }

   public boolean z() {
      return this.al().b(h);
   }

   public void a(boolean $$0) {
      this.al().b(h, $$0);
   }

   @Override
   public ciw dx() {
      return new ciw(switch (this.t()) {
         case c -> ciz.nc;
         case b -> ciz.nb;
         case d -> ciz.nd;
         case f -> ciz.ne;
         case g -> ciz.tS;
         default -> ciz.na;
      });
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
