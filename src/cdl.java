import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cdl extends biq {
   private static final aef<Integer> c = aei.a(cdl.class, aeh.b);
   private static final aef<Integer> d = aei.a(cdl.class, aeh.b);
   private static final aef<Float> e = aei.a(cdl.class, aeh.d);
   private static final aef<Integer> f = aei.a(cdl.class, aeh.b);
   private static final aef<Integer> g = aei.a(cdl.class, aeh.b);
   private static final aef<Boolean> h = aei.a(cdl.class, aeh.k);
   private static final ImmutableMap<bjs, ImmutableList<Integer>> i = ImmutableMap.of(
      bjs.a, ImmutableList.of(0, 1, -1), bjs.f, ImmutableList.of(0, 1, -1), bjs.d, ImmutableList.of(0, 1)
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
   private ehn r = ehn.b;
   private static final Map<dgn, Pair<ib, ib>> s = ac.a(Maps.newEnumMap(dgn.class), $$0 -> {
      ib $$1 = hc.e.q();
      ib $$2 = hc.f.q();
      ib $$3 = hc.c.q();
      ib $$4 = hc.d.q();
      ib $$5 = $$1.o();
      ib $$6 = $$2.o();
      ib $$7 = $$3.o();
      ib $$8 = $$4.o();
      $$0.put(dgn.a, Pair.of($$3, $$4));
      $$0.put(dgn.b, Pair.of($$1, $$2));
      $$0.put(dgn.c, Pair.of($$5, $$2));
      $$0.put(dgn.d, Pair.of($$1, $$6));
      $$0.put(dgn.e, Pair.of($$3, $$8));
      $$0.put(dgn.f, Pair.of($$7, $$4));
      $$0.put(dgn.g, Pair.of($$4, $$2));
      $$0.put(dgn.h, Pair.of($$4, $$1));
      $$0.put(dgn.i, Pair.of($$3, $$1));
      $$0.put(dgn.j, Pair.of($$3, $$2));
   });

   protected cdl(biu<?> $$0, cpv $$1) {
      super($$0, $$1);
      this.I = true;
   }

   protected cdl(biu<?> $$0, cpv $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.e($$2, $$3, $$4);
      this.K = $$2;
      this.L = $$3;
      this.M = $$4;
   }

   public static cdl a(cpv $$0, double $$1, double $$2, double $$3, cdl.a $$4) {
      if ($$4 == cdl.a.b) {
         return new cds($$0, $$1, $$2, $$3);
      } else if ($$4 == cdl.a.c) {
         return new cdu($$0, $$1, $$2, $$3);
      } else if ($$4 == cdl.a.d) {
         return new cdx($$0, $$1, $$2, $$3);
      } else if ($$4 == cdl.a.e) {
         return new cdw($$0, $$1, $$2, $$3);
      } else if ($$4 == cdl.a.f) {
         return new cdv($$0, $$1, $$2, $$3);
      } else {
         return (cdl)($$4 == cdl.a.g ? new cdt($$0, $$1, $$2, $$3) : new cdr($$0, $$1, $$2, $$3));
      }
   }

   @Override
   protected biq.b aV() {
      return biq.b.c;
   }

   @Override
   protected void a_() {
      this.an.a(c, 0);
      this.an.a(d, 1);
      this.an.a(e, 0.0F);
      this.an.a(f, csv.i(csw.a.n()));
      this.an.a(g, 6);
      this.an.a(h, false);
   }

   @Override
   public boolean h(biq $$0) {
      return cdn.a(this, $$0);
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   protected ehn a(hc.a $$0, l.a $$1) {
      return bjg.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, 0.0F, 0.0F);
   }

   @Override
   public ehn b(bjg $$0) {
      hc $$1 = this.cF();
      if ($$1.o() == hc.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cdq.a($$1);
         gw $$3 = this.dl();
         gw.a $$4 = new gw.a();
         ImmutableList<bjs> $$5 = $$0.fz();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bjs $$6 = (bjs)$$14.next();
            bir $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a, 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)i.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dL().a(cdq.a(this.dL(), $$4), () -> cdq.a(this.dL(), $$4.d()));
                  if (cdq.a($$11)) {
                     ehi $$12 = new ehi((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b, (double)$$8);
                     ehn $$13 = ehn.a($$4, $$11);
                     if (cdq.a(this.dL(), $$0, $$12.c($$13))) {
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
            bjs $$15 = (bjs)var22.next();
            double $$16 = (double)$$0.a($$15).b;
            int $$17 = arx.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cdq.a($$4, $$17, $$0x -> this.dL().a_($$0x).k(this.dL(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.dL().B || this.dG()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.d(-this.y());
         this.c(10);
         this.bp();
         this.a(this.w() + $$1 * 10.0F);
         this.a(djt.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cbu && ((cbu)$$0.d()).fS().d;
         if ($$2 || this.w() > 40.0F) {
            this.bB();
            if ($$2 && !this.ad()) {
               this.al();
            } else {
               this.a($$0);
            }
         }

         return true;
      }
   }

   @Override
   protected float aK() {
      dfj $$0 = this.dL().a_(this.dl());
      return $$0.a(apt.N) ? 1.0F : super.aK();
   }

   public void a(bho $$0) {
      this.ak();
      if (this.dL().X().b(cpr.h)) {
         cjf $$1 = new cjf(this.q());
         if (this.ad()) {
            $$1.a(this.ae());
         }

         this.b($$1);
      }
   }

   abstract cja q();

   @Override
   public void m(float $$0) {
      this.d(-this.y());
      this.c(10);
      this.a(this.w() + this.w() * 10.0F);
   }

   @Override
   public boolean bs() {
      return !this.dG();
   }

   private static Pair<ib, ib> a(dgn $$0) {
      return s.get($$0);
   }

   @Override
   public hc cF() {
      return this.j ? this.cE().g().h() : this.cE().h();
   }

   @Override
   public void l() {
      if (this.x() > 0) {
         this.c(this.x() - 1);
      }

      if (this.w() > 0.0F) {
         this.a(this.w() - 1.0F);
      }

      this.as();
      this.bI();
      if (this.dL().B) {
         if (this.l > 0) {
            this.a(this.l, this.m, this.n, this.o, this.p, this.q);
            this.l--;
         } else {
            this.aq();
            this.a(this.dB(), this.dD());
         }
      } else {
         if (!this.aU()) {
            double $$0 = this.aY() ? -0.005 : -0.04;
            this.f(this.do().b(0.0, $$0, 0.0));
         }

         int $$1 = arx.a(this.dq());
         int $$2 = arx.a(this.ds());
         int $$3 = arx.a(this.dw());
         if (this.dL().a_(new gw($$1, $$2 - 1, $$3)).a(apt.N)) {
            $$2--;
         }

         gw $$4 = new gw($$1, $$2, $$3);
         dfj $$5 = this.dL().a_($$4);
         this.k = csl.g($$5);
         if (this.k) {
            this.c($$4, $$5);
            if ($$5.a(csw.hh)) {
               this.a($$1, $$2, $$3, $$5.c(cyq.e));
            }
         } else {
            this.t();
         }

         this.aP();
         this.s(0.0F);
         double $$6 = this.K - this.dq();
         double $$7 = this.M - this.dw();
         if ($$6 * $$6 + $$7 * $$7 > 0.001) {
            this.r((float)(arx.d($$7, $$6) * 180.0 / Math.PI));
            if (this.j) {
               this.r(this.dB() + 180.0F);
            }
         }

         double $$8 = (double)arx.g(this.dB() - this.N);
         if ($$8 < -170.0 || $$8 >= 170.0) {
            this.r(this.dB() + 180.0F);
            this.j = !this.j;
         }

         this.a(this.dB(), this.dD());
         if (this.z() == cdl.a.a && this.do().i() > 0.01) {
            List<biq> $$9 = this.dL().a(this, this.cH().c(0.2F, 0.0, 0.2F), bit.a(this));
            if (!$$9.isEmpty()) {
               for (biq $$10 : $$9) {
                  if (!($$10 instanceof cbu) && !($$10 instanceof bvd) && !($$10 instanceof cdl) && !this.bP() && !$$10.bO()) {
                     $$10.n(this);
                  } else {
                     $$10.g(this);
                  }
               }
            }
         } else {
            for (biq $$11 : this.dL().a_(this, this.cH().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$11) && $$11.bt() && $$11 instanceof cdl) {
                  $$11.g(this);
               }
            }
         }

         this.bf();
         if (this.bm()) {
            this.ax();
            this.ab *= 0.5F;
         }

         this.am = false;
      }
   }

   protected double s() {
      return (this.aY() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   protected void t() {
      double $$0 = this.s();
      ehn $$1 = this.do();
      this.o(arx.a($$1.c, -$$0, $$0), $$1.d, arx.a($$1.e, -$$0, $$0));
      if (this.aB()) {
         this.f(this.do().a(0.5));
      }

      this.a(bjm.a, this.do());
      if (!this.aB()) {
         this.f(this.do().a(0.95));
      }
   }

   @Override
   protected void c(gw $$0, dfj $$1) {
      this.n();
      double $$2 = this.dq();
      double $$3 = this.ds();
      double $$4 = this.dw();
      ehn $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(csw.bp)) {
         $$6 = $$1.c(cyq.e);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.aY()) {
         $$8 *= 0.2;
      }

      ehn $$9 = this.do();
      dgn $$10 = $$1.c(((csl)$$1.b()).b());
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

      $$9 = this.do();
      Pair<ib, ib> $$11 = a($$10);
      ib $$12 = (ib)$$11.getFirst();
      ib $$13 = (ib)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new ehn($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.f($$9);
      biq $$19 = this.cR();
      if ($$19 instanceof cbu) {
         ehn $$20 = $$19.do();
         double $$21 = $$20.i();
         double $$22 = this.do().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.f(this.do().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.do().h();
         if ($$23 < 0.03) {
            this.f(ehn.b);
         } else {
            this.f(this.do().d(0.5, 0.0, 0.5));
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
      double $$33 = this.bP() ? 0.75 : 1.0;
      double $$34 = this.s();
      $$9 = this.do();
      this.a(bjm.a, new ehn(arx.a($$33 * $$9.c, -$$34, $$34), 0.0, arx.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && arx.a(this.dq()) - $$0.u() == $$12.u() && arx.a(this.dw()) - $$0.w() == $$12.w()) {
         this.e(this.dq(), this.ds() + (double)$$12.v(), this.dw());
      } else if ($$13.v() != 0 && arx.a(this.dq()) - $$0.u() == $$13.u() && arx.a(this.dw()) - $$0.w() == $$13.w()) {
         this.e(this.dq(), this.ds() + (double)$$13.v(), this.dw());
      }

      this.v();
      ehn $$35 = this.q(this.dq(), this.ds(), this.dw());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         ehn $$37 = this.do();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.f($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.e(this.dq(), $$35.d, this.dw());
      }

      int $$39 = arx.a(this.dq());
      int $$40 = arx.a(this.dw());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         ehn $$41 = this.do();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         ehn $$43 = this.do();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.f($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            ehn $$46 = this.do();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dgn.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dgn.a) {
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
      return this.k;
   }

   private boolean a(gw $$0) {
      return this.dL().a_($$0).g(this.dL(), $$0);
   }

   protected void v() {
      double $$0 = this.bP() ? 0.997 : 0.96;
      ehn $$1 = this.do();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.aY()) {
         $$1 = $$1.a(0.95F);
      }

      this.f($$1);
   }

   @Nullable
   public ehn a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = arx.a($$0);
      int $$5 = arx.a($$1);
      int $$6 = arx.a($$2);
      if (this.dL().a_(new gw($$4, $$5 - 1, $$6)).a(apt.N)) {
         $$5--;
      }

      dfj $$7 = this.dL().a_(new gw($$4, $$5, $$6));
      if (csl.g($$7)) {
         dgn $$8 = $$7.c(((csl)$$7.b()).b());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<ib, ib> $$9 = a($$8);
         ib $$10 = (ib)$$9.getFirst();
         ib $$11 = (ib)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && arx.a($$0) - $$4 == $$10.u() && arx.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && arx.a($$0) - $$4 == $$11.u() && arx.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public ehn q(double $$0, double $$1, double $$2) {
      int $$3 = arx.a($$0);
      int $$4 = arx.a($$1);
      int $$5 = arx.a($$2);
      if (this.dL().a_(new gw($$3, $$4 - 1, $$5)).a(apt.N)) {
         $$4--;
      }

      dfj $$6 = this.dL().a_(new gw($$3, $$4, $$5));
      if (csl.g($$6)) {
         dgn $$7 = $$6.c(((csl)$$6.b()).b());
         Pair<ib, ib> $$8 = a($$7);
         ib $$9 = (ib)$$8.getFirst();
         ib $$10 = (ib)$$8.getSecond();
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

         return new ehn($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public ehi g_() {
      ehi $$0 = this.cH();
      return this.F() ? $$0.g((double)Math.abs(this.C()) / 16.0) : $$0;
   }

   @Override
   protected void a(qx $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(rj.a(this.dL().a(je.e), $$0.p("DisplayState")));
         this.m($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(qx $$0) {
      if (this.F()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", rj.a(this.A()));
         $$0.a("DisplayOffset", this.C());
      }
   }

   @Override
   public void g(biq $$0) {
      if (!this.dL().B) {
         if (!$$0.af && !this.af) {
            if (!this.x($$0)) {
               double $$1 = $$0.dq() - this.dq();
               double $$2 = $$0.dw() - this.dw();
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
                  if ($$0 instanceof cdl) {
                     double $$5 = $$0.dq() - this.dq();
                     double $$6 = $$0.dw() - this.dw();
                     ehn $$7 = new ehn($$5, 0.0, $$6).d();
                     ehn $$8 = new ehn((double)arx.b(this.dB() * (float) (Math.PI / 180.0)), 0.0, (double)arx.a(this.dB() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     ehn $$10 = this.do();
                     ehn $$11 = $$0.do();
                     if (((cdl)$$0).z() == cdl.a.c && this.z() != cdl.a.c) {
                        this.f($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.f($$11.d(0.95, 1.0, 0.95));
                     } else if (((cdl)$$0).z() != cdl.a.c && this.z() == cdl.a.c) {
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
   public double n_() {
      return this.m;
   }

   @Override
   public double K_() {
      return this.n;
   }

   @Override
   public double L_() {
      return this.o;
   }

   @Override
   public float d_() {
      return (float)this.q;
   }

   @Override
   public float o_() {
      return (float)this.p;
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.r = new ehn($$0, $$1, $$2);
      this.f(this.r);
   }

   public void a(float $$0) {
      this.an.b(e, $$0);
   }

   public float w() {
      return this.an.b(e);
   }

   public void c(int $$0) {
      this.an.b(c, $$0);
   }

   public int x() {
      return this.an.b(c);
   }

   public void d(int $$0) {
      this.an.b(d, $$0);
   }

   public int y() {
      return this.an.b(d);
   }

   public abstract cdl.a z();

   public dfj A() {
      return !this.F() ? this.B() : csv.a(this.am().b(f));
   }

   public dfj B() {
      return csw.a.n();
   }

   public int C() {
      return !this.F() ? this.E() : this.am().b(g);
   }

   public int E() {
      return 6;
   }

   public void c(dfj $$0) {
      this.am().b(f, csv.i($$0));
      this.a(true);
   }

   public void m(int $$0) {
      this.am().b(g, $$0);
      this.a(true);
   }

   public boolean F() {
      return this.am().b(h);
   }

   public void a(boolean $$0) {
      this.am().b(h, $$0);
   }

   @Override
   public cjf dy() {
      return new cjf(switch (this.z()) {
         case c -> cji.nc;
         case b -> cji.nb;
         case d -> cji.nd;
         case f -> cji.ne;
         case g -> cji.tS;
         default -> cji.na;
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
