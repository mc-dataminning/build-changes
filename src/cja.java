import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cja extends cjn {
   private static final ens c = new ens(0.0, 0.0, 0.0);
   private static final aie<Integer> d = aih.a(cja.class, aig.b);
   private static final aie<Integer> e = aih.a(cja.class, aig.b);
   private static final aie<Boolean> i = aih.a(cja.class, aig.k);
   private static final ImmutableMap<bor, ImmutableList<Integer>> j = ImmutableMap.of(
      bor.a, ImmutableList.of(0, 1, -1), bor.f, ImmutableList.of(0, 1, -1), bor.d, ImmutableList.of(0, 1)
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
   private ens s = ens.b;
   private static final Map<dmj, Pair<jd, jd>> t = ac.a(Maps.newEnumMap(dmj.class), $$0 -> {
      jd $$1 = ie.e.q();
      jd $$2 = ie.f.q();
      jd $$3 = ie.c.q();
      jd $$4 = ie.d.q();
      jd $$5 = $$1.o();
      jd $$6 = $$2.o();
      jd $$7 = $$3.o();
      jd $$8 = $$4.o();
      $$0.put(dmj.a, Pair.of($$3, $$4));
      $$0.put(dmj.b, Pair.of($$1, $$2));
      $$0.put(dmj.c, Pair.of($$5, $$2));
      $$0.put(dmj.d, Pair.of($$1, $$6));
      $$0.put(dmj.e, Pair.of($$3, $$8));
      $$0.put(dmj.f, Pair.of($$7, $$4));
      $$0.put(dmj.g, Pair.of($$4, $$2));
      $$0.put(dmj.h, Pair.of($$4, $$1));
      $$0.put(dmj.i, Pair.of($$3, $$1));
      $$0.put(dmj.j, Pair.of($$3, $$2));
   });

   protected cja(bnu<?> $$0, cvn $$1) {
      super($$0, $$1);
      this.H = true;
   }

   protected cja(bnu<?> $$0, cvn $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.J = $$2;
      this.K = $$3;
      this.L = $$4;
   }

   public static cja a(aov $$0, double $$1, double $$2, double $$3, cja.a $$4, coz $$5, @Nullable chh $$6) {
      cja $$7 = (cja)(switch ($$4) {
         case b -> new cjh($$0, $$1, $$2, $$3);
         case c -> new cjj($$0, $$1, $$2, $$3);
         case d -> new cjm($$0, $$1, $$2, $$3);
         case e -> new cjl($$0, $$1, $$2, $$3);
         case f -> new cjk($$0, $$1, $$2, $$3);
         case g -> new cji($$0, $$1, $$2, $$3);
         default -> new cjg($$0, $$1, $$2, $$3);
      });
      bnu.<cja>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected bno.b aW() {
      return bno.b.c;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, cyo.i(cyq.a.o()));
      this.am.a(e, 6);
      this.am.a(i, false);
   }

   @Override
   public boolean h(bno $$0) {
      return cjc.a(this, $$0);
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected ens a(ie.a $$0, l.a $$1) {
      return bog.i(super.a($$0, $$1));
   }

   @Override
   protected ens a(bno $$0, bnr $$1, float $$2) {
      boolean $$3 = $$0 instanceof cgu || $$0 instanceof cha;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public ens b(bog $$0) {
      ie $$1 = this.cF();
      if ($$1.o() == ie.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cjf.a($$1);
         hz $$3 = this.dm();
         hz.a $$4 = new hz.a();
         ImmutableList<bor> $$5 = $$0.fA();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bor $$6 = (bor)$$14.next();
            bnr $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dM().a(cjf.a(this.dM(), $$4), () -> cjf.a(this.dM(), $$4.d()));
                  if (cjf.a($$11)) {
                     enn $$12 = new enn((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     ens $$13 = ens.a($$4, $$11);
                     if (cjf.a(this.dM(), $$0, $$12.c($$13))) {
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
            bor $$15 = (bor)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = awh.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cjf.a($$4, $$17, $$0x -> this.dM().a_($$0x).k(this.dM(), $$0x));
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
      dlf $$0 = this.dM().a_(this.dm());
      return $$0.a(atz.N) ? 1.0F : super.aL();
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bt() {
      return !this.dH();
   }

   private static Pair<jd, jd> a(dmj $$0) {
      return t.get($$0);
   }

   @Override
   public ie cF() {
      return this.k ? this.cE().g().h() : this.cE().h();
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
      this.bI();
      if (this.dM().B) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.ar();
            this.a(this.dC(), this.dE());
         }
      } else {
         if (!this.aV()) {
            double $$0 = this.aZ() ? -0.005 : -0.04;
            this.g(this.dp().b(0.0, $$0, 0.0));
         }

         int $$1 = awh.a(this.dr());
         int $$2 = awh.a(this.dt());
         int $$3 = awh.a(this.dx());
         if (this.dM().a_(new hz($$1, $$2 - 1, $$3)).a(atz.N)) {
            $$2--;
         }

         hz $$4 = new hz($$1, $$2, $$3);
         dlf $$5 = this.dM().a_($$4);
         this.l = cyd.g($$5);
         if (this.l) {
            this.c($$4, $$5);
            if ($$5.a(cyq.hh)) {
               this.a($$1, $$2, $$3, $$5.c(dej.f));
            }
         } else {
            this.s();
         }

         this.aQ();
         this.s(0.0F);
         double $$6 = this.J - this.dr();
         double $$7 = this.L - this.dx();
         if ($$6 * $$6 + $$7 * $$7 > 0.001) {
            this.r((float)(awh.d($$7, $$6) * 180.0 / Math.PI));
            if (this.k) {
               this.r(this.dC() + 180.0F);
            }
         }

         double $$8 = (double)awh.g(this.dC() - this.M);
         if ($$8 < -170.0 || $$8 >= 170.0) {
            this.r(this.dC() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dC(), this.dE());
         if (this.w() == cja.a.a && this.dp().i() > 0.01) {
            List<bno> $$9 = this.dM().a(this, this.cH().c(0.2F, 0.0, 0.2F), bnt.a(this));
            if (!$$9.isEmpty()) {
               for (bno $$10 : $$9) {
                  if (!($$10 instanceof chh) && !($$10 instanceof caf) && !($$10 instanceof cja) && !this.bP() && !$$10.bO()) {
                     $$10.m(this);
                  } else {
                     $$10.g(this);
                  }
               }
            }
         } else {
            for (bno $$11 : this.dM().a_(this, this.cH().c(0.2F, 0.0, 0.2F))) {
               if (!this.w($$11) && $$11.bu() && $$11 instanceof cja) {
                  $$11.g(this);
               }
            }
         }

         this.bg();
         if (this.bn()) {
            this.ay();
            this.aa *= 0.5F;
         }

         this.al = false;
      }
   }

   protected double q() {
      return (this.aZ() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   protected void s() {
      double $$0 = this.q();
      ens $$1 = this.dp();
      this.o(awh.a($$1.c, -$$0, $$0), $$1.d, awh.a($$1.e, -$$0, $$0));
      if (this.aC()) {
         this.g(this.dp().a(0.5));
      }

      this.a(bol.a, this.dp());
      if (!this.aC()) {
         this.g(this.dp().a(0.95));
      }
   }

   @Override
   protected void c(hz $$0, dlf $$1) {
      this.n();
      double $$2 = this.dr();
      double $$3 = this.dt();
      double $$4 = this.dx();
      ens $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(cyq.bp)) {
         $$6 = $$1.c(dej.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.aZ()) {
         $$8 *= 0.2;
      }

      ens $$9 = this.dp();
      dmj $$10 = $$1.c(((cyd)$$1.b()).c());
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
      Pair<jd, jd> $$11 = a($$10);
      jd $$12 = (jd)$$11.getFirst();
      jd $$13 = (jd)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new ens($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.g($$9);
      bno $$19 = this.cQ();
      if ($$19 instanceof chh) {
         ens $$20 = $$19.dp();
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
            this.g(ens.b);
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
      double $$34 = this.q();
      $$9 = this.dp();
      this.a(bol.a, new ens(awh.a($$33 * $$9.c, -$$34, $$34), 0.0, awh.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && awh.a(this.dr()) - $$0.u() == $$12.u() && awh.a(this.dx()) - $$0.w() == $$12.w()) {
         this.a_(this.dr(), this.dt() + (double)$$12.v(), this.dx());
      } else if ($$13.v() != 0 && awh.a(this.dr()) - $$0.u() == $$13.u() && awh.a(this.dx()) - $$0.w() == $$13.w()) {
         this.a_(this.dr(), this.dt() + (double)$$13.v(), this.dx());
      }

      this.u();
      ens $$35 = this.q(this.dr(), this.dt(), this.dx());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         ens $$37 = this.dp();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.g($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.dr(), $$35.d, this.dx());
      }

      int $$39 = awh.a(this.dr());
      int $$40 = awh.a(this.dx());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         ens $$41 = this.dp();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         ens $$43 = this.dp();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.g($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            ens $$46 = this.dp();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dmj.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dmj.a) {
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

   private boolean a(hz $$0) {
      return this.dM().a_($$0).g(this.dM(), $$0);
   }

   protected void u() {
      double $$0 = this.bP() ? 0.997 : 0.96;
      ens $$1 = this.dp();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.aZ()) {
         $$1 = $$1.a(0.95F);
      }

      this.g($$1);
   }

   @Nullable
   public ens a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = awh.a($$0);
      int $$5 = awh.a($$1);
      int $$6 = awh.a($$2);
      if (this.dM().a_(new hz($$4, $$5 - 1, $$6)).a(atz.N)) {
         $$5--;
      }

      dlf $$7 = this.dM().a_(new hz($$4, $$5, $$6));
      if (cyd.g($$7)) {
         dmj $$8 = $$7.c(((cyd)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<jd, jd> $$9 = a($$8);
         jd $$10 = (jd)$$9.getFirst();
         jd $$11 = (jd)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && awh.a($$0) - $$4 == $$10.u() && awh.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && awh.a($$0) - $$4 == $$11.u() && awh.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public ens q(double $$0, double $$1, double $$2) {
      int $$3 = awh.a($$0);
      int $$4 = awh.a($$1);
      int $$5 = awh.a($$2);
      if (this.dM().a_(new hz($$3, $$4 - 1, $$5)).a(atz.N)) {
         $$4--;
      }

      dlf $$6 = this.dM().a_(new hz($$3, $$4, $$5));
      if (cyd.g($$6)) {
         dmj $$7 = $$6.c(((cyd)$$6.b()).c());
         Pair<jd, jd> $$8 = a($$7);
         jd $$9 = (jd)$$8.getFirst();
         jd $$10 = (jd)$$8.getSecond();
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

         return new ens($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public enn i_() {
      enn $$0 = this.cH();
      return this.B() ? $$0.g((double)Math.abs(this.z()) / 16.0) : $$0;
   }

   @Override
   protected void a(sw $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(tl.a(this.dM().a(kg.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(sw $$0) {
      if (this.B()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", tl.a(this.x()));
         $$0.a("DisplayOffset", this.z());
      }
   }

   @Override
   public void g(bno $$0) {
      if (!this.dM().B) {
         if (!$$0.ae && !this.ae) {
            if (!this.w($$0)) {
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
                  if ($$0 instanceof cja) {
                     double $$5 = $$0.dr() - this.dr();
                     double $$6 = $$0.dx() - this.dx();
                     ens $$7 = new ens($$5, 0.0, $$6).d();
                     ens $$8 = new ens((double)awh.b(this.dC() * (float) (Math.PI / 180.0)), 0.0, (double)awh.a(this.dC() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     ens $$10 = this.dp();
                     ens $$11 = $$0.dp();
                     if (((cja)$$0).w() == cja.a.c && this.w() != cja.a.c) {
                        this.g($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.g($$11.d(0.95, 1.0, 0.95));
                     } else if (((cja)$$0).w() != cja.a.c && this.w() == cja.a.c) {
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
   public double p_() {
      return this.m > 0 ? this.n : this.dr();
   }

   @Override
   public double N_() {
      return this.m > 0 ? this.o : this.dt();
   }

   @Override
   public double O_() {
      return this.m > 0 ? this.p : this.dx();
   }

   @Override
   public float f_() {
      return this.m > 0 ? (float)this.r : this.dE();
   }

   @Override
   public float q_() {
      return this.m > 0 ? (float)this.q : this.dC();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new ens($$0, $$1, $$2);
      this.g(this.s);
   }

   public abstract cja.a w();

   public dlf x() {
      return !this.B() ? this.y() : cyo.a(this.an().b(d));
   }

   public dlf y() {
      return cyq.a.o();
   }

   public int z() {
      return !this.B() ? this.A() : this.an().b(e);
   }

   public int A() {
      return 6;
   }

   public void c(dlf $$0) {
      this.an().b(d, cyo.i($$0));
      this.a(true);
   }

   public void c(int $$0) {
      this.an().b(e, $$0);
      this.a(true);
   }

   public boolean B() {
      return this.an().b(i);
   }

   public void a(boolean $$0) {
      this.an().b(i, $$0);
   }

   @Override
   public coz dz() {
      return new coz(switch (this.w()) {
         case b -> cpc.nM;
         case c -> cpc.nN;
         case d -> cpc.nO;
         default -> cpc.nL;
         case f -> cpc.nP;
         case g -> cpc.uI;
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
