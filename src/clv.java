import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class clv extends cmi {
   private static final esj c = new esj(0.0, 0.0, 0.0);
   private static final aja<Integer> d = aje.a(clv.class, ajc.b);
   private static final aja<Integer> e = aje.a(clv.class, ajc.b);
   private static final aja<Boolean> i = aje.a(clv.class, ajc.k);
   private static final ImmutableMap<bre, ImmutableList<Integer>> j = ImmutableMap.of(
      bre.a, ImmutableList.of(0, 1, -1), bre.f, ImmutableList.of(0, 1, -1), bre.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean k;
   private boolean l;
   private int m;
   private double n;
   private double o;
   private double p;
   private double q;
   private double r;
   private esj s = esj.b;
   private static final Map<dqm, Pair<ji, ji>> t = ac.a(Maps.newEnumMap(dqm.class), $$0 -> {
      ji $$1 = ij.e.q();
      ji $$2 = ij.f.q();
      ji $$3 = ij.c.q();
      ji $$4 = ij.d.q();
      ji $$5 = $$1.o();
      ji $$6 = $$2.o();
      ji $$7 = $$3.o();
      ji $$8 = $$4.o();
      $$0.put(dqm.a, Pair.of($$3, $$4));
      $$0.put(dqm.b, Pair.of($$1, $$2));
      $$0.put(dqm.c, Pair.of($$5, $$2));
      $$0.put(dqm.d, Pair.of($$1, $$6));
      $$0.put(dqm.e, Pair.of($$3, $$8));
      $$0.put(dqm.f, Pair.of($$7, $$4));
      $$0.put(dqm.g, Pair.of($$4, $$2));
      $$0.put(dqm.h, Pair.of($$4, $$1));
      $$0.put(dqm.i, Pair.of($$3, $$1));
      $$0.put(dqm.j, Pair.of($$3, $$2));
   });

   protected clv(bqg<?> $$0, czg $$1) {
      super($$0, $$1);
      this.I = true;
   }

   protected clv(bqg<?> $$0, czg $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.K = $$2;
      this.L = $$3;
      this.M = $$4;
   }

   public static clv a(apu $$0, double $$1, double $$2, double $$3, clv.a $$4, crs $$5, @Nullable cka $$6) {
      clv $$7 = (clv)(switch ($$4) {
         case b -> new cmc($$0, $$1, $$2, $$3);
         case c -> new cme($$0, $$1, $$2, $$3);
         case d -> new cmh($$0, $$1, $$2, $$3);
         case e -> new cmg($$0, $$1, $$2, $$3);
         case f -> new cmf($$0, $$1, $$2, $$3);
         case g -> new cmd($$0, $$1, $$2, $$3);
         default -> new cmb($$0, $$1, $$2, $$3);
      });
      bqg.<clv>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected bqa.b aZ() {
      return bqa.b.c;
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(d, dch.i(dcj.a.n()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(bqa $$0) {
      return clx.a(this, $$0);
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   protected esj a(ij.a $$0, l.a $$1) {
      return bqt.i(super.a($$0, $$1));
   }

   @Override
   protected esj a(bqa $$0, bqd $$1, float $$2) {
      boolean $$3 = $$0 instanceof cjn || $$0 instanceof cjt;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public esj b(bqt $$0) {
      ij $$1 = this.cF();
      if ($$1.o() == ij.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cma.a($$1);
         id $$3 = this.dm();
         id.a $$4 = new id.a();
         ImmutableList<bre> $$5 = $$0.fF();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bre $$6 = (bre)$$14.next();
            bqd $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dM().a(cma.a(this.dM(), $$4), () -> cma.a(this.dM(), $$4.d()));
                  if (cma.a($$11)) {
                     ese $$12 = new ese((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     esj $$13 = esj.a($$4, $$11);
                     if (cma.a(this.dM(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cH().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bre $$15 = (bre)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = axm.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cma.a($$4, $$17, $$0x -> this.dM().a_($$0x).k(this.dM(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aL() {
      dpi $$0 = this.dM().a_(this.dm());
      return $$0.a(ave.N) ? 1.0F : super.aL();
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bw() {
      return !this.dH();
   }

   private static Pair<ji, ji> a(dqm $$0) {
      return t.get($$0);
   }

   @Override
   public ij cF() {
      return this.k ? this.cE().g().h() : this.cE().h();
   }

   @Override
   protected double aW() {
      return this.bc() ? 0.005 : 0.04;
   }

   @Override
   public void l() {
      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      this.at();
      this.bL();
      if (this.dM().B) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.ar();
            this.a(this.dC(), this.dE());
         }
      } else {
         this.aY();
         int $$0 = axm.a(this.dr());
         int $$1 = axm.a(this.dt());
         int $$2 = axm.a(this.dx());
         if (this.dM().a_(new id($$0, $$1 - 1, $$2)).a(ave.N)) {
            $$1--;
         }

         id $$3 = new id($$0, $$1, $$2);
         dpi $$4 = this.dM().a_($$3);
         this.l = dbw.g($$4);
         if (this.l) {
            this.c($$3, $$4);
            if ($$4.a(dcj.hh)) {
               this.a($$0, $$1, $$2, $$4.c(dic.f));
            }
         } else {
            this.r();
         }

         this.aQ();
         this.s(0.0F);
         double $$5 = this.K - this.dr();
         double $$6 = this.M - this.dx();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.r((float)(axm.d($$6, $$5) * 180.0 / Math.PI));
            if (this.k) {
               this.r(this.dC() + 180.0F);
            }
         }

         double $$7 = (double)axm.g(this.dC() - this.N);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.r(this.dC() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dC(), this.dE());
         if (this.v() == clv.a.a && this.dp().i() > 0.01) {
            List<bqa> $$8 = this.dM().a(this, this.cH().c(0.2F, 0.0, 0.2F), bqf.a(this));
            if (!$$8.isEmpty()) {
               for (bqa $$9 : $$8) {
                  if (!($$9 instanceof cka) && !($$9 instanceof ccu) && !($$9 instanceof clv) && !this.bP() && !$$9.bO()) {
                     $$9.n(this);
                  } else {
                     $$9.h(this);
                  }
               }
            }
         } else {
            for (bqa $$10 : this.dM().a_(this, this.cH().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$10) && $$10.bx() && $$10 instanceof clv) {
                  $$10.h(this);
               }
            }
         }

         this.bj();
         if (this.bq()) {
            this.ay();
            this.ab *= 0.5F;
         }

         this.am = false;
      }
   }

   protected double p() {
      return (this.bc() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   protected void r() {
      double $$0 = this.p();
      esj $$1 = this.dp();
      this.o(axm.a($$1.c, -$$0, $$0), $$1.d, axm.a($$1.e, -$$0, $$0));
      if (this.aC()) {
         this.g(this.dp().a(0.5));
      }

      this.a(bqy.a, this.dp());
      if (!this.aC()) {
         this.g(this.dp().a(0.95));
      }
   }

   @Override
   protected void c(id $$0, dpi $$1) {
      this.n();
      double $$2 = this.dr();
      double $$3 = this.dt();
      double $$4 = this.dx();
      esj $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dcj.bp)) {
         $$6 = $$1.c(dic.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.bc()) {
         $$8 *= 0.2;
      }

      esj $$9 = this.dp();
      dqm $$10 = $$1.c(((dbw)$$1.b()).c());
      switch ($$10) {
         case c:
            this.g($$9.b(-$$8, 0.0, 0.0));
            $$3++;
            break;
         case d:
            this.g($$9.b($$8, 0.0, 0.0));
            $$3++;
            break;
         case e:
            this.g($$9.b(0.0, 0.0, $$8));
            $$3++;
            break;
         case f:
            this.g($$9.b(0.0, 0.0, -$$8));
            $$3++;
      }

      $$9 = this.dp();
      Pair<ji, ji> $$11 = a($$10);
      ji $$12 = (ji)$$11.getFirst();
      ji $$13 = (ji)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new esj($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.g($$9);
      bqa $$19 = this.cQ();
      if ($$19 instanceof cka) {
         esj $$20 = $$19.dp();
         double $$21 = $$20.i();
         double $$22 = this.dp().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.g(this.dp().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.dp().h();
         if ($$23 < 0.03) {
            this.g(esj.b);
         } else {
            this.g(this.dp().d(0.5, 0.0, 0.5));
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
      this.a_($$2, $$3, $$4);
      double $$33 = this.bP() ? 0.75 : 1.0;
      double $$34 = this.p();
      $$9 = this.dp();
      this.a(bqy.a, new esj(axm.a($$33 * $$9.c, -$$34, $$34), 0.0, axm.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && axm.a(this.dr()) - $$0.u() == $$12.u() && axm.a(this.dx()) - $$0.w() == $$12.w()) {
         this.a_(this.dr(), this.dt() + (double)$$12.v(), this.dx());
      } else if ($$13.v() != 0 && axm.a(this.dr()) - $$0.u() == $$13.u() && axm.a(this.dx()) - $$0.w() == $$13.w()) {
         this.a_(this.dr(), this.dt() + (double)$$13.v(), this.dx());
      }

      this.u();
      esj $$35 = this.q(this.dr(), this.dt(), this.dx());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         esj $$37 = this.dp();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.g($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.dr(), $$35.d, this.dx());
      }

      int $$39 = axm.a(this.dr());
      int $$40 = axm.a(this.dx());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         esj $$41 = this.dp();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         esj $$43 = this.dp();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.g($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            esj $$46 = this.dp();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dqm.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dqm.a) {
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
   public boolean cf() {
      return this.l;
   }

   private boolean a(id $$0) {
      return this.dM().a_($$0).g(this.dM(), $$0);
   }

   protected void u() {
      double $$0 = this.bP() ? 0.997 : 0.96;
      esj $$1 = this.dp();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.bc()) {
         $$1 = $$1.a(0.95F);
      }

      this.g($$1);
   }

   @Nullable
   public esj a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = axm.a($$0);
      int $$5 = axm.a($$1);
      int $$6 = axm.a($$2);
      if (this.dM().a_(new id($$4, $$5 - 1, $$6)).a(ave.N)) {
         $$5--;
      }

      dpi $$7 = this.dM().a_(new id($$4, $$5, $$6));
      if (dbw.g($$7)) {
         dqm $$8 = $$7.c(((dbw)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<ji, ji> $$9 = a($$8);
         ji $$10 = (ji)$$9.getFirst();
         ji $$11 = (ji)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && axm.a($$0) - $$4 == $$10.u() && axm.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && axm.a($$0) - $$4 == $$11.u() && axm.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public esj q(double $$0, double $$1, double $$2) {
      int $$3 = axm.a($$0);
      int $$4 = axm.a($$1);
      int $$5 = axm.a($$2);
      if (this.dM().a_(new id($$3, $$4 - 1, $$5)).a(ave.N)) {
         $$4--;
      }

      dpi $$6 = this.dM().a_(new id($$3, $$4, $$5));
      if (dbw.g($$6)) {
         dqm $$7 = $$6.c(((dbw)$$6.b()).c());
         Pair<ji, ji> $$8 = a($$7);
         ji $$9 = (ji)$$8.getFirst();
         ji $$10 = (ji)$$8.getSecond();
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

         return new esj($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public ese h_() {
      ese $$0 = this.cH();
      return this.A() ? $$0.g((double)Math.abs(this.y()) / 16.0) : $$0;
   }

   @Override
   protected void a(to $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(ud.a(this.dM().a(ku.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(to $$0) {
      if (this.A()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", ud.a(this.w()));
         $$0.a("DisplayOffset", this.y());
      }
   }

   @Override
   public void h(bqa $$0) {
      if (!this.dM().B) {
         if (!$$0.af && !this.af) {
            if (!this.x($$0)) {
               double $$1 = $$0.dr() - this.dr();
               double $$2 = $$0.dx() - this.dx();
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
                  if ($$0 instanceof clv) {
                     double $$5 = $$0.dr() - this.dr();
                     double $$6 = $$0.dx() - this.dx();
                     esj $$7 = new esj($$5, 0.0, $$6).d();
                     esj $$8 = new esj((double)axm.b(this.dC() * (float) (Math.PI / 180.0)), 0.0, (double)axm.a(this.dC() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     esj $$10 = this.dp();
                     esj $$11 = $$0.dp();
                     if (((clv)$$0).v() == clv.a.c && this.v() != clv.a.c) {
                        this.g($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.g($$11.d(0.95, 1.0, 0.95));
                     } else if (((clv)$$0).v() != clv.a.c && this.v() == clv.a.c) {
                        $$0.g($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$10.c + $$1, 0.0, $$10.e + $$2);
                        this.g($$10.d(0.95, 1.0, 0.95));
                     } else {
                        double $$12 = ($$11.c + $$10.c) / 2.0;
                        double $$13 = ($$11.e + $$10.e) / 2.0;
                        this.g($$10.d(0.2, 1.0, 0.2));
                        this.j($$12 - $$1, 0.0, $$13 - $$2);
                        $$0.g($$11.d(0.2, 1.0, 0.2));
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
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = (double)$$3;
      this.r = (double)$$4;
      this.m = $$5 + 2;
      this.g(this.s);
   }

   @Override
   public double c_() {
      return this.m > 0 ? this.n : this.dr();
   }

   @Override
   public double d_() {
      return this.m > 0 ? this.o : this.dt();
   }

   @Override
   public double L_() {
      return this.m > 0 ? this.p : this.dx();
   }

   @Override
   public float M_() {
      return this.m > 0 ? (float)this.r : this.dE();
   }

   @Override
   public float e_() {
      return this.m > 0 ? (float)this.q : this.dC();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new esj($$0, $$1, $$2);
      this.g(this.s);
   }

   public abstract clv.a v();

   public dpi w() {
      return !this.A() ? this.x() : dch.a(this.an().a(d));
   }

   public dpi x() {
      return dcj.a.n();
   }

   public int y() {
      return !this.A() ? this.z() : this.an().a(e);
   }

   public int z() {
      return 6;
   }

   public void c(dpi $$0) {
      this.an().a(d, dch.i($$0));
      this.a(true);
   }

   public void c(int $$0) {
      this.an().a(e, $$0);
      this.a(true);
   }

   public boolean A() {
      return this.an().a(i);
   }

   public void a(boolean $$0) {
      this.an().a(i, $$0);
   }

   @Override
   public crs dz() {
      return new crs(switch (this.v()) {
         case b -> crv.nM;
         case c -> crv.nN;
         case d -> crv.nO;
         default -> crv.nL;
         case f -> crv.nP;
         case g -> crv.uK;
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
