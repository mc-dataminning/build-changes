import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cdr extends biw {
   private static final float c = 0.0F;
   private static final float d = 0.1875F;
   private static final aef<Integer> e = aei.a(cdr.class, aeh.b);
   private static final aef<Integer> f = aei.a(cdr.class, aeh.b);
   private static final aef<Float> g = aei.a(cdr.class, aeh.d);
   private static final aef<Integer> h = aei.a(cdr.class, aeh.b);
   private static final aef<Integer> i = aei.a(cdr.class, aeh.b);
   private static final aef<Boolean> j = aei.a(cdr.class, aeh.k);
   private static final ImmutableMap<bjy, ImmutableList<Integer>> k = ImmutableMap.of(
      bjy.a, ImmutableList.of(0, 1, -1), bjy.f, ImmutableList.of(0, 1, -1), bjy.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean l;
   private boolean m;
   private int n;
   private double o;
   private double p;
   private double q;
   private double r;
   private double s;
   private ehh t = ehh.b;
   private static final Map<dgh, Pair<hy, hy>> u = ac.a(Maps.newEnumMap(dgh.class), $$0 -> {
      hy $$1 = ha.e.q();
      hy $$2 = ha.f.q();
      hy $$3 = ha.c.q();
      hy $$4 = ha.d.q();
      hy $$5 = $$1.o();
      hy $$6 = $$2.o();
      hy $$7 = $$3.o();
      hy $$8 = $$4.o();
      $$0.put(dgh.a, Pair.of($$3, $$4));
      $$0.put(dgh.b, Pair.of($$1, $$2));
      $$0.put(dgh.c, Pair.of($$5, $$2));
      $$0.put(dgh.d, Pair.of($$1, $$6));
      $$0.put(dgh.e, Pair.of($$3, $$8));
      $$0.put(dgh.f, Pair.of($$7, $$4));
      $$0.put(dgh.g, Pair.of($$4, $$2));
      $$0.put(dgh.h, Pair.of($$4, $$1));
      $$0.put(dgh.i, Pair.of($$3, $$1));
      $$0.put(dgh.j, Pair.of($$3, $$2));
   });

   protected cdr(bja<?> $$0, cqb $$1) {
      super($$0, $$1);
      this.I = true;
   }

   protected cdr(bja<?> $$0, cqb $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.e($$2, $$3, $$4);
      this.K = $$2;
      this.L = $$3;
      this.M = $$4;
   }

   public static cdr a(cqb $$0, double $$1, double $$2, double $$3, cdr.a $$4) {
      if ($$4 == cdr.a.b) {
         return new cdy($$0, $$1, $$2, $$3);
      } else if ($$4 == cdr.a.c) {
         return new cea($$0, $$1, $$2, $$3);
      } else if ($$4 == cdr.a.d) {
         return new ced($$0, $$1, $$2, $$3);
      } else if ($$4 == cdr.a.e) {
         return new cec($$0, $$1, $$2, $$3);
      } else if ($$4 == cdr.a.f) {
         return new ceb($$0, $$1, $$2, $$3);
      } else {
         return (cdr)($$4 == cdr.a.g ? new cdz($$0, $$1, $$2, $$3) : new cdx($$0, $$1, $$2, $$3));
      }
   }

   @Override
   protected biw.b aU() {
      return biw.b.c;
   }

   @Override
   protected void a_() {
      this.an.a(e, 0);
      this.an.a(f, 1);
      this.an.a(g, 0.0F);
      this.an.a(h, ctc.i(cte.a.o()));
      this.an.a(i, 6);
      this.an.a(j, false);
   }

   @Override
   public boolean h(biw $$0) {
      return cdt.a(this, $$0);
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   protected ehh a(ha.a $$0, l.a $$1) {
      return bjm.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      boolean $$3 = $$0 instanceof cbn || $$0 instanceof cbt;
      return new Vector3f(0.0F, $$3 ? 0.0F : 0.1875F, 0.0F);
   }

   @Override
   public ehh b(bjm $$0) {
      ha $$1 = this.cE();
      if ($$1.o() == ha.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cdw.a($$1);
         gw $$3 = this.dl();
         gw.a $$4 = new gw.a();
         ImmutableList<bjy> $$5 = $$0.fA();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bjy $$6 = (bjy)$$14.next();
            bix $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a, 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)k.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dL().a(cdw.a(this.dL(), $$4), () -> cdw.a(this.dL(), $$4.d()));
                  if (cdw.a($$11)) {
                     ehc $$12 = new ehc((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b, (double)$$8);
                     ehh $$13 = ehh.a($$4, $$11);
                     if (cdw.a(this.dL(), $$0, $$12.c($$13))) {
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
            bjy $$15 = (bjy)var22.next();
            double $$16 = (double)$$0.a($$15).b;
            int $$17 = asb.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cdw.a($$4, $$17, $$0x -> this.dL().a_($$0x).k(this.dL(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      if (this.dL().B || this.dG()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.d(-this.y());
         this.c(10);
         this.bo();
         this.a(this.w() + $$1 * 10.0F);
         this.a(djn.o, $$0.d());
         boolean $$2 = $$0.d() instanceof cca && ((cca)$$0.d()).fT().d;
         if ($$2 || this.w() > 40.0F) {
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
      dfd $$0 = this.dL().a_(this.dl());
      return $$0.a(apv.N) ? 1.0F : super.aJ();
   }

   public void a(bhu $$0) {
      this.aj();
      if (this.dL().X().b(cpx.h)) {
         cjl $$1 = new cjl(this.q());
         if (this.ac()) {
            $$1.a(this.ad());
         }

         this.b($$1);
      }
   }

   abstract cjg q();

   @Override
   public void m(float $$0) {
      this.d(-this.y());
      this.c(10);
      this.a(this.w() + this.w() * 10.0F);
   }

   @Override
   public boolean br() {
      return !this.dG();
   }

   private static Pair<hy, hy> a(dgh $$0) {
      return u.get($$0);
   }

   @Override
   public ha cE() {
      return this.l ? this.cD().g().h() : this.cD().h();
   }

   @Override
   public void l() {
      if (this.x() > 0) {
         this.c(this.x() - 1);
      }

      if (this.w() > 0.0F) {
         this.a(this.w() - 1.0F);
      }

      this.ar();
      this.bH();
      if (this.dL().B) {
         if (this.n > 0) {
            this.a(this.n, this.o, this.p, this.q, this.r, this.s);
            this.n--;
         } else {
            this.ap();
            this.a(this.dB(), this.dD());
         }
      } else {
         if (!this.aT()) {
            double $$0 = this.aX() ? -0.005 : -0.04;
            this.f(this.do().b(0.0, $$0, 0.0));
         }

         int $$1 = asb.a(this.dq());
         int $$2 = asb.a(this.ds());
         int $$3 = asb.a(this.dw());
         if (this.dL().a_(new gw($$1, $$2 - 1, $$3)).a(apv.N)) {
            $$2--;
         }

         gw $$4 = new gw($$1, $$2, $$3);
         dfd $$5 = this.dL().a_($$4);
         this.m = csr.g($$5);
         if (this.m) {
            this.c($$4, $$5);
            if ($$5.a(cte.hh)) {
               this.a($$1, $$2, $$3, $$5.c(cyw.f));
            }
         } else {
            this.t();
         }

         this.aO();
         this.s(0.0F);
         double $$6 = this.K - this.dq();
         double $$7 = this.M - this.dw();
         if ($$6 * $$6 + $$7 * $$7 > 0.001) {
            this.r((float)(asb.d($$7, $$6) * 180.0 / Math.PI));
            if (this.l) {
               this.r(this.dB() + 180.0F);
            }
         }

         double $$8 = (double)asb.g(this.dB() - this.N);
         if ($$8 < -170.0 || $$8 >= 170.0) {
            this.r(this.dB() + 180.0F);
            this.l = !this.l;
         }

         this.a(this.dB(), this.dD());
         if (this.z() == cdr.a.a && this.do().i() > 0.01) {
            List<biw> $$9 = this.dL().a(this, this.cG().c(0.2F, 0.0, 0.2F), biz.a(this));
            if (!$$9.isEmpty()) {
               for (biw $$10 : $$9) {
                  if (!($$10 instanceof cca) && !($$10 instanceof bvj) && !($$10 instanceof cdr) && !this.bO() && !$$10.bN()) {
                     $$10.n(this);
                  } else {
                     $$10.g(this);
                  }
               }
            }
         } else {
            for (biw $$11 : this.dL().a_(this, this.cG().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$11) && $$11.bs() && $$11 instanceof cdr) {
                  $$11.g(this);
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

   protected double s() {
      return (this.aX() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   protected void t() {
      double $$0 = this.s();
      ehh $$1 = this.do();
      this.o(asb.a($$1.c, -$$0, $$0), $$1.d, asb.a($$1.e, -$$0, $$0));
      if (this.aA()) {
         this.f(this.do().a(0.5));
      }

      this.a(bjs.a, this.do());
      if (!this.aA()) {
         this.f(this.do().a(0.95));
      }
   }

   @Override
   protected void c(gw $$0, dfd $$1) {
      this.n();
      double $$2 = this.dq();
      double $$3 = this.ds();
      double $$4 = this.dw();
      ehh $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(cte.bp)) {
         $$6 = $$1.c(cyw.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.aX()) {
         $$8 *= 0.2;
      }

      ehh $$9 = this.do();
      dgh $$10 = $$1.c(((csr)$$1.b()).c());
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
      Pair<hy, hy> $$11 = a($$10);
      hy $$12 = (hy)$$11.getFirst();
      hy $$13 = (hy)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new ehh($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.f($$9);
      biw $$19 = this.cQ();
      if ($$19 instanceof cca) {
         ehh $$20 = $$19.do();
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
            this.f(ehh.b);
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
      double $$33 = this.bO() ? 0.75 : 1.0;
      double $$34 = this.s();
      $$9 = this.do();
      this.a(bjs.a, new ehh(asb.a($$33 * $$9.c, -$$34, $$34), 0.0, asb.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && asb.a(this.dq()) - $$0.u() == $$12.u() && asb.a(this.dw()) - $$0.w() == $$12.w()) {
         this.e(this.dq(), this.ds() + (double)$$12.v(), this.dw());
      } else if ($$13.v() != 0 && asb.a(this.dq()) - $$0.u() == $$13.u() && asb.a(this.dw()) - $$0.w() == $$13.w()) {
         this.e(this.dq(), this.ds() + (double)$$13.v(), this.dw());
      }

      this.v();
      ehh $$35 = this.q(this.dq(), this.ds(), this.dw());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         ehh $$37 = this.do();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.f($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.e(this.dq(), $$35.d, this.dw());
      }

      int $$39 = asb.a(this.dq());
      int $$40 = asb.a(this.dw());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         ehh $$41 = this.do();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         ehh $$43 = this.do();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.f($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            ehh $$46 = this.do();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dgh.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dgh.a) {
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
      return this.m;
   }

   private boolean a(gw $$0) {
      return this.dL().a_($$0).g(this.dL(), $$0);
   }

   protected void v() {
      double $$0 = this.bO() ? 0.997 : 0.96;
      ehh $$1 = this.do();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.aX()) {
         $$1 = $$1.a(0.95F);
      }

      this.f($$1);
   }

   @Nullable
   public ehh a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = asb.a($$0);
      int $$5 = asb.a($$1);
      int $$6 = asb.a($$2);
      if (this.dL().a_(new gw($$4, $$5 - 1, $$6)).a(apv.N)) {
         $$5--;
      }

      dfd $$7 = this.dL().a_(new gw($$4, $$5, $$6));
      if (csr.g($$7)) {
         dgh $$8 = $$7.c(((csr)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<hy, hy> $$9 = a($$8);
         hy $$10 = (hy)$$9.getFirst();
         hy $$11 = (hy)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && asb.a($$0) - $$4 == $$10.u() && asb.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && asb.a($$0) - $$4 == $$11.u() && asb.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public ehh q(double $$0, double $$1, double $$2) {
      int $$3 = asb.a($$0);
      int $$4 = asb.a($$1);
      int $$5 = asb.a($$2);
      if (this.dL().a_(new gw($$3, $$4 - 1, $$5)).a(apv.N)) {
         $$4--;
      }

      dfd $$6 = this.dL().a_(new gw($$3, $$4, $$5));
      if (csr.g($$6)) {
         dgh $$7 = $$6.c(((csr)$$6.b()).c());
         Pair<hy, hy> $$8 = a($$7);
         hy $$9 = (hy)$$8.getFirst();
         hy $$10 = (hy)$$8.getSecond();
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

         return new ehh($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public ehc g_() {
      ehc $$0 = this.cG();
      return this.F() ? $$0.g((double)Math.abs(this.C()) / 16.0) : $$0;
   }

   @Override
   protected void a(qw $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(rj.a(this.dL().a(jc.e), $$0.p("DisplayState")));
         this.m($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(qw $$0) {
      if (this.F()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", rj.a(this.A()));
         $$0.a("DisplayOffset", this.C());
      }
   }

   @Override
   public void g(biw $$0) {
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
                  if ($$0 instanceof cdr) {
                     double $$5 = $$0.dq() - this.dq();
                     double $$6 = $$0.dw() - this.dw();
                     ehh $$7 = new ehh($$5, 0.0, $$6).d();
                     ehh $$8 = new ehh((double)asb.b(this.dB() * (float) (Math.PI / 180.0)), 0.0, (double)asb.a(this.dB() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     ehh $$10 = this.do();
                     ehh $$11 = $$0.do();
                     if (((cdr)$$0).z() == cdr.a.c && this.z() != cdr.a.c) {
                        this.f($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.f($$11.d(0.95, 1.0, 0.95));
                     } else if (((cdr)$$0).z() != cdr.a.c && this.z() == cdr.a.c) {
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
      this.o = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = (double)$$3;
      this.s = (double)$$4;
      this.n = $$5 + 2;
      this.f(this.t);
   }

   @Override
   public double n_() {
      return this.n > 0 ? this.o : this.dq();
   }

   @Override
   public double K_() {
      return this.n > 0 ? this.p : this.ds();
   }

   @Override
   public double L_() {
      return this.n > 0 ? this.q : this.dw();
   }

   @Override
   public float d_() {
      return this.n > 0 ? (float)this.s : this.dD();
   }

   @Override
   public float o_() {
      return this.n > 0 ? (float)this.r : this.dB();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.t = new ehh($$0, $$1, $$2);
      this.f(this.t);
   }

   public void a(float $$0) {
      this.an.b(g, $$0);
   }

   public float w() {
      return this.an.b(g);
   }

   public void c(int $$0) {
      this.an.b(e, $$0);
   }

   public int x() {
      return this.an.b(e);
   }

   public void d(int $$0) {
      this.an.b(f, $$0);
   }

   public int y() {
      return this.an.b(f);
   }

   public abstract cdr.a z();

   public dfd A() {
      return !this.F() ? this.B() : ctc.a(this.al().b(h));
   }

   public dfd B() {
      return cte.a.o();
   }

   public int C() {
      return !this.F() ? this.E() : this.al().b(i);
   }

   public int E() {
      return 6;
   }

   public void c(dfd $$0) {
      this.al().b(h, ctc.i($$0));
      this.a(true);
   }

   public void m(int $$0) {
      this.al().b(i, $$0);
      this.a(true);
   }

   public boolean F() {
      return this.al().b(j);
   }

   public void a(boolean $$0) {
      this.al().b(j, $$0);
   }

   @Override
   public cjl dy() {
      return new cjl(switch (this.z()) {
         case c -> cjo.nc;
         case b -> cjo.nb;
         case d -> cjo.nd;
         case f -> cjo.ne;
         case g -> cjo.tS;
         default -> cjo.na;
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
