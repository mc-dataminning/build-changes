import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cnc extends cnp {
   private static final etp c = new etp(0.0, 0.0, 0.0);
   private static final ajm<Integer> d = ajq.a(cnc.class, ajo.b);
   private static final ajm<Integer> e = ajq.a(cnc.class, ajo.b);
   private static final ajm<Boolean> i = ajq.a(cnc.class, ajo.k);
   private static final ImmutableMap<bsl, ImmutableList<Integer>> j = ImmutableMap.of(
      bsl.a, ImmutableList.of(0, 1, -1), bsl.f, ImmutableList.of(0, 1, -1), bsl.d, ImmutableList.of(0, 1)
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
   private etp s = etp.b;
   private static final Map<drl, Pair<jr, jr>> t = ac.a(Maps.newEnumMap(drl.class), $$0 -> {
      jr $$1 = is.e.q();
      jr $$2 = is.f.q();
      jr $$3 = is.c.q();
      jr $$4 = is.d.q();
      jr $$5 = $$1.o();
      jr $$6 = $$2.o();
      jr $$7 = $$3.o();
      jr $$8 = $$4.o();
      $$0.put(drl.a, Pair.of($$3, $$4));
      $$0.put(drl.b, Pair.of($$1, $$2));
      $$0.put(drl.c, Pair.of($$5, $$2));
      $$0.put(drl.d, Pair.of($$1, $$6));
      $$0.put(drl.e, Pair.of($$3, $$8));
      $$0.put(drl.f, Pair.of($$7, $$4));
      $$0.put(drl.g, Pair.of($$4, $$2));
      $$0.put(drl.h, Pair.of($$4, $$1));
      $$0.put(drl.i, Pair.of($$3, $$1));
      $$0.put(drl.j, Pair.of($$3, $$2));
   });

   protected cnc(brn<?> $$0, dad $$1) {
      super($$0, $$1);
      this.J = true;
   }

   protected cnc(brn<?> $$0, dad $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static cnc a(aqh $$0, double $$1, double $$2, double $$3, cnc.a $$4, csz $$5, @Nullable clh $$6) {
      cnc $$7 = (cnc)(switch ($$4) {
         case b -> new cnj($$0, $$1, $$2, $$3);
         case c -> new cnl($$0, $$1, $$2, $$3);
         case d -> new cno($$0, $$1, $$2, $$3);
         case e -> new cnn($$0, $$1, $$2, $$3);
         case f -> new cnm($$0, $$1, $$2, $$3);
         case g -> new cnk($$0, $$1, $$2, $$3);
         default -> new cni($$0, $$1, $$2, $$3);
      });
      brn.<cnc>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected brh.b aZ() {
      return brh.b.c;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(d, dde.i(ddg.a.n()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(brh $$0) {
      return cne.a(this, $$0);
   }

   @Override
   public boolean by() {
      return true;
   }

   @Override
   protected etp a(is.a $$0, l.a $$1) {
      return bsa.i(super.a($$0, $$1));
   }

   @Override
   protected etp a(brh $$0, brk $$1, float $$2) {
      boolean $$3 = $$0 instanceof cku || $$0 instanceof cla;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public etp b(bsa $$0) {
      is $$1 = this.cG();
      if ($$1.o() == is.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cnh.a($$1);
         in $$3 = this.dn();
         in.a $$4 = new in.a();
         ImmutableList<bsl> $$5 = $$0.fG();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bsl $$6 = (bsl)$$14.next();
            brk $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dN().a(cnh.a(this.dN(), $$4), () -> cnh.a(this.dN(), $$4.d()));
                  if (cnh.a($$11)) {
                     etk $$12 = new etk((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     etp $$13 = etp.a($$4, $$11);
                     if (cnh.a(this.dN(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cI().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bsl $$15 = (bsl)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = axz.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cnh.a($$4, $$17, $$0x -> this.dN().a_($$0x).k(this.dN(), $$0x));
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
      dqh $$0 = this.dN().a_(this.dn());
      return $$0.a(avr.N) ? 1.0F : super.aL();
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bx() {
      return !this.dI();
   }

   private static Pair<jr, jr> a(drl $$0) {
      return t.get($$0);
   }

   @Override
   public is cG() {
      return this.k ? this.cF().g().h() : this.cF().h();
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
      this.bM();
      if (this.dN().B) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.ar();
            this.a(this.dD(), this.dF());
         }
      } else {
         this.aY();
         int $$0 = axz.a(this.ds());
         int $$1 = axz.a(this.du());
         int $$2 = axz.a(this.dy());
         if (this.dN().a_(new in($$0, $$1 - 1, $$2)).a(avr.N)) {
            $$1--;
         }

         in $$3 = new in($$0, $$1, $$2);
         dqh $$4 = this.dN().a_($$3);
         this.l = dct.g($$4);
         if (this.l) {
            this.c($$3, $$4);
            if ($$4.a(ddg.hh)) {
               this.a($$0, $$1, $$2, $$4.c(dja.f));
            }
         } else {
            this.r();
         }

         this.aQ();
         this.s(0.0F);
         double $$5 = this.L - this.ds();
         double $$6 = this.N - this.dy();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.r((float)(axz.d($$6, $$5) * 180.0 / Math.PI));
            if (this.k) {
               this.r(this.dD() + 180.0F);
            }
         }

         double $$7 = (double)axz.g(this.dD() - this.O);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.r(this.dD() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dD(), this.dF());
         if (this.v() == cnc.a.a && this.dq().i() > 0.01) {
            List<brh> $$8 = this.dN().a(this, this.cI().c(0.2F, 0.0, 0.2F), brm.a(this));
            if (!$$8.isEmpty()) {
               for (brh $$9 : $$8) {
                  if (!($$9 instanceof clh) && !($$9 instanceof ceb) && !($$9 instanceof cnc) && !this.bQ() && !$$9.bP()) {
                     $$9.n(this);
                  } else {
                     $$9.h(this);
                  }
               }
            }
         } else {
            for (brh $$10 : this.dN().a_(this, this.cI().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$10) && $$10.by() && $$10 instanceof cnc) {
                  $$10.h(this);
               }
            }
         }

         this.bj();
         if (this.bq()) {
            this.ay();
            this.ac *= 0.5F;
         }

         this.an = false;
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
      etp $$1 = this.dq();
      this.o(axz.a($$1.c, -$$0, $$0), $$1.d, axz.a($$1.e, -$$0, $$0));
      if (this.aC()) {
         this.g(this.dq().a(0.5));
      }

      this.a(bsf.a, this.dq());
      if (!this.aC()) {
         this.g(this.dq().a(0.95));
      }
   }

   @Override
   protected void c(in $$0, dqh $$1) {
      this.n();
      double $$2 = this.ds();
      double $$3 = this.du();
      double $$4 = this.dy();
      etp $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(ddg.bp)) {
         $$6 = $$1.c(dja.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.bc()) {
         $$8 *= 0.2;
      }

      etp $$9 = this.dq();
      drl $$10 = $$1.c(((dct)$$1.b()).c());
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

      $$9 = this.dq();
      Pair<jr, jr> $$11 = a($$10);
      jr $$12 = (jr)$$11.getFirst();
      jr $$13 = (jr)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new etp($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.g($$9);
      brh $$19 = this.cR();
      if ($$19 instanceof clh) {
         etp $$20 = $$19.dq();
         double $$21 = $$20.i();
         double $$22 = this.dq().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.g(this.dq().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.dq().h();
         if ($$23 < 0.03) {
            this.g(etp.b);
         } else {
            this.g(this.dq().d(0.5, 0.0, 0.5));
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
      double $$33 = this.bQ() ? 0.75 : 1.0;
      double $$34 = this.p();
      $$9 = this.dq();
      this.a(bsf.a, new etp(axz.a($$33 * $$9.c, -$$34, $$34), 0.0, axz.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && axz.a(this.ds()) - $$0.u() == $$12.u() && axz.a(this.dy()) - $$0.w() == $$12.w()) {
         this.a_(this.ds(), this.du() + (double)$$12.v(), this.dy());
      } else if ($$13.v() != 0 && axz.a(this.ds()) - $$0.u() == $$13.u() && axz.a(this.dy()) - $$0.w() == $$13.w()) {
         this.a_(this.ds(), this.du() + (double)$$13.v(), this.dy());
      }

      this.u();
      etp $$35 = this.q(this.ds(), this.du(), this.dy());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         etp $$37 = this.dq();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.g($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.ds(), $$35.d, this.dy());
      }

      int $$39 = axz.a(this.ds());
      int $$40 = axz.a(this.dy());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         etp $$41 = this.dq();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         etp $$43 = this.dq();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.g($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            etp $$46 = this.dq();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == drl.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != drl.a) {
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
   public boolean cg() {
      return this.l;
   }

   private boolean a(in $$0) {
      return this.dN().a_($$0).g(this.dN(), $$0);
   }

   protected void u() {
      double $$0 = this.bQ() ? 0.997 : 0.96;
      etp $$1 = this.dq();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.bc()) {
         $$1 = $$1.a(0.95F);
      }

      this.g($$1);
   }

   @Nullable
   public etp a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = axz.a($$0);
      int $$5 = axz.a($$1);
      int $$6 = axz.a($$2);
      if (this.dN().a_(new in($$4, $$5 - 1, $$6)).a(avr.N)) {
         $$5--;
      }

      dqh $$7 = this.dN().a_(new in($$4, $$5, $$6));
      if (dct.g($$7)) {
         drl $$8 = $$7.c(((dct)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<jr, jr> $$9 = a($$8);
         jr $$10 = (jr)$$9.getFirst();
         jr $$11 = (jr)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && axz.a($$0) - $$4 == $$10.u() && axz.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && axz.a($$0) - $$4 == $$11.u() && axz.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public etp q(double $$0, double $$1, double $$2) {
      int $$3 = axz.a($$0);
      int $$4 = axz.a($$1);
      int $$5 = axz.a($$2);
      if (this.dN().a_(new in($$3, $$4 - 1, $$5)).a(avr.N)) {
         $$4--;
      }

      dqh $$6 = this.dN().a_(new in($$3, $$4, $$5));
      if (dct.g($$6)) {
         drl $$7 = $$6.c(((dct)$$6.b()).c());
         Pair<jr, jr> $$8 = a($$7);
         jr $$9 = (jr)$$8.getFirst();
         jr $$10 = (jr)$$8.getSecond();
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

         return new etp($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public etk h_() {
      etk $$0 = this.cI();
      return this.A() ? $$0.g((double)Math.abs(this.y()) / 16.0) : $$0;
   }

   @Override
   protected void a(ua $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(up.a(this.dN().a(le.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(ua $$0) {
      if (this.A()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", up.a(this.w()));
         $$0.a("DisplayOffset", this.y());
      }
   }

   @Override
   public void h(brh $$0) {
      if (!this.dN().B) {
         if (!$$0.ag && !this.ag) {
            if (!this.x($$0)) {
               double $$1 = $$0.ds() - this.ds();
               double $$2 = $$0.dy() - this.dy();
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
                  if ($$0 instanceof cnc) {
                     double $$5 = $$0.ds() - this.ds();
                     double $$6 = $$0.dy() - this.dy();
                     etp $$7 = new etp($$5, 0.0, $$6).d();
                     etp $$8 = new etp((double)axz.b(this.dD() * (float) (Math.PI / 180.0)), 0.0, (double)axz.a(this.dD() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     etp $$10 = this.dq();
                     etp $$11 = $$0.dq();
                     if (((cnc)$$0).v() == cnc.a.c && this.v() != cnc.a.c) {
                        this.g($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.g($$11.d(0.95, 1.0, 0.95));
                     } else if (((cnc)$$0).v() != cnc.a.c && this.v() == cnc.a.c) {
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
      return this.m > 0 ? this.n : this.ds();
   }

   @Override
   public double d_() {
      return this.m > 0 ? this.o : this.du();
   }

   @Override
   public double L_() {
      return this.m > 0 ? this.p : this.dy();
   }

   @Override
   public float M_() {
      return this.m > 0 ? (float)this.r : this.dF();
   }

   @Override
   public float e_() {
      return this.m > 0 ? (float)this.q : this.dD();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new etp($$0, $$1, $$2);
      this.g(this.s);
   }

   public abstract cnc.a v();

   public dqh w() {
      return !this.A() ? this.x() : dde.a(this.an().a(d));
   }

   public dqh x() {
      return ddg.a.n();
   }

   public int y() {
      return !this.A() ? this.z() : this.an().a(e);
   }

   public int z() {
      return 6;
   }

   public void c(dqh $$0) {
      this.an().a(d, dde.i($$0));
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
   public csz dA() {
      return new csz(switch (this.v()) {
         case b -> ctc.nN;
         case c -> ctc.nO;
         case d -> ctc.nP;
         default -> ctc.nM;
         case f -> ctc.nQ;
         case g -> ctc.uM;
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
