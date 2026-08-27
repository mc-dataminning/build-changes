import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cjt extends ckg {
   private static final eov c = new eov(0.0, 0.0, 0.0);
   private static final aii<Integer> d = ail.a(cjt.class, aik.b);
   private static final aii<Integer> e = ail.a(cjt.class, aik.b);
   private static final aii<Boolean> i = ail.a(cjt.class, aik.k);
   private static final ImmutableMap<bpi, ImmutableList<Integer>> j = ImmutableMap.of(
      bpi.a, ImmutableList.of(0, 1, -1), bpi.f, ImmutableList.of(0, 1, -1), bpi.d, ImmutableList.of(0, 1)
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
   private eov s = eov.b;
   private static final Map<dni, Pair<jf, jf>> t = ac.a(Maps.newEnumMap(dni.class), $$0 -> {
      jf $$1 = ih.e.q();
      jf $$2 = ih.f.q();
      jf $$3 = ih.c.q();
      jf $$4 = ih.d.q();
      jf $$5 = $$1.o();
      jf $$6 = $$2.o();
      jf $$7 = $$3.o();
      jf $$8 = $$4.o();
      $$0.put(dni.a, Pair.of($$3, $$4));
      $$0.put(dni.b, Pair.of($$1, $$2));
      $$0.put(dni.c, Pair.of($$5, $$2));
      $$0.put(dni.d, Pair.of($$1, $$6));
      $$0.put(dni.e, Pair.of($$3, $$8));
      $$0.put(dni.f, Pair.of($$7, $$4));
      $$0.put(dni.g, Pair.of($$4, $$2));
      $$0.put(dni.h, Pair.of($$4, $$1));
      $$0.put(dni.i, Pair.of($$3, $$1));
      $$0.put(dni.j, Pair.of($$3, $$2));
   });

   protected cjt(bol<?> $$0, cwe $$1) {
      super($$0, $$1);
      this.H = true;
   }

   protected cjt(bol<?> $$0, cwe $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.J = $$2;
      this.K = $$3;
      this.L = $$4;
   }

   public static cjt a(apa $$0, double $$1, double $$2, double $$3, cjt.a $$4, cpq $$5, @Nullable cia $$6) {
      cjt $$7 = (cjt)(switch ($$4) {
         case b -> new cka($$0, $$1, $$2, $$3);
         case c -> new ckc($$0, $$1, $$2, $$3);
         case d -> new ckf($$0, $$1, $$2, $$3);
         case e -> new cke($$0, $$1, $$2, $$3);
         case f -> new ckd($$0, $$1, $$2, $$3);
         case g -> new ckb($$0, $$1, $$2, $$3);
         default -> new cjz($$0, $$1, $$2, $$3);
      });
      bol.<cjt>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected bof.b aW() {
      return bof.b.c;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, czf.i(czh.a.o()));
      this.am.a(e, 6);
      this.am.a(i, false);
   }

   @Override
   public boolean h(bof $$0) {
      return cjv.a(this, $$0);
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected eov a(ih.a $$0, l.a $$1) {
      return box.i(super.a($$0, $$1));
   }

   @Override
   protected eov a(bof $$0, boi $$1, float $$2) {
      boolean $$3 = $$0 instanceof chn || $$0 instanceof cht;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public eov b(box $$0) {
      ih $$1 = this.cC();
      if ($$1.o() == ih.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cjy.a($$1);
         ib $$3 = this.dj();
         ib.a $$4 = new ib.a();
         ImmutableList<bpi> $$5 = $$0.fC();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bpi $$6 = (bpi)$$14.next();
            boi $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dJ().a(cjy.a(this.dJ(), $$4), () -> cjy.a(this.dJ(), $$4.d()));
                  if (cjy.a($$11)) {
                     eoq $$12 = new eoq((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     eov $$13 = eov.a($$4, $$11);
                     if (cjy.a(this.dJ(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cE().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bpi $$15 = (bpi)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = awm.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cjy.a($$4, $$17, $$0x -> this.dJ().a_($$0x).k(this.dJ(), $$0x));
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
      dme $$0 = this.dJ().a_(this.dj());
      return $$0.a(aue.N) ? 1.0F : super.aL();
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bt() {
      return !this.dE();
   }

   private static Pair<jf, jf> a(dni $$0) {
      return t.get($$0);
   }

   @Override
   public ih cC() {
      return this.k ? this.cB().g().h() : this.cB().h();
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
      if (this.dJ().B) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.ar();
            this.a(this.dz(), this.dB());
         }
      } else {
         if (!this.aV()) {
            double $$0 = this.aZ() ? -0.005 : -0.04;
            this.g(this.dm().b(0.0, $$0, 0.0));
         }

         int $$1 = awm.a(this.do());
         int $$2 = awm.a(this.dq());
         int $$3 = awm.a(this.du());
         if (this.dJ().a_(new ib($$1, $$2 - 1, $$3)).a(aue.N)) {
            $$2--;
         }

         ib $$4 = new ib($$1, $$2, $$3);
         dme $$5 = this.dJ().a_($$4);
         this.l = cyu.g($$5);
         if (this.l) {
            this.c($$4, $$5);
            if ($$5.a(czh.hh)) {
               this.a($$1, $$2, $$3, $$5.c(dfa.f));
            }
         } else {
            this.s();
         }

         this.aQ();
         this.s(0.0F);
         double $$6 = this.J - this.do();
         double $$7 = this.L - this.du();
         if ($$6 * $$6 + $$7 * $$7 > 0.001) {
            this.r((float)(awm.d($$7, $$6) * 180.0 / Math.PI));
            if (this.k) {
               this.r(this.dz() + 180.0F);
            }
         }

         double $$8 = (double)awm.g(this.dz() - this.M);
         if ($$8 < -170.0 || $$8 >= 170.0) {
            this.r(this.dz() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dz(), this.dB());
         if (this.w() == cjt.a.a && this.dm().i() > 0.01) {
            List<bof> $$9 = this.dJ().a(this, this.cE().c(0.2F, 0.0, 0.2F), bok.a(this));
            if (!$$9.isEmpty()) {
               for (bof $$10 : $$9) {
                  if (!($$10 instanceof cia) && !($$10 instanceof cay) && !($$10 instanceof cjt) && !this.bM() && !$$10.bL()) {
                     $$10.m(this);
                  } else {
                     $$10.g(this);
                  }
               }
            }
         } else {
            for (bof $$11 : this.dJ().a_(this, this.cE().c(0.2F, 0.0, 0.2F))) {
               if (!this.w($$11) && $$11.bu() && $$11 instanceof cjt) {
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
      eov $$1 = this.dm();
      this.o(awm.a($$1.c, -$$0, $$0), $$1.d, awm.a($$1.e, -$$0, $$0));
      if (this.aC()) {
         this.g(this.dm().a(0.5));
      }

      this.a(bpc.a, this.dm());
      if (!this.aC()) {
         this.g(this.dm().a(0.95));
      }
   }

   @Override
   protected void c(ib $$0, dme $$1) {
      this.n();
      double $$2 = this.do();
      double $$3 = this.dq();
      double $$4 = this.du();
      eov $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(czh.bp)) {
         $$6 = $$1.c(dfa.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.aZ()) {
         $$8 *= 0.2;
      }

      eov $$9 = this.dm();
      dni $$10 = $$1.c(((cyu)$$1.b()).c());
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

      $$9 = this.dm();
      Pair<jf, jf> $$11 = a($$10);
      jf $$12 = (jf)$$11.getFirst();
      jf $$13 = (jf)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new eov($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.g($$9);
      bof $$19 = this.cN();
      if ($$19 instanceof cia) {
         eov $$20 = $$19.dm();
         double $$21 = $$20.i();
         double $$22 = this.dm().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.g(this.dm().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.dm().h();
         if ($$23 < 0.03) {
            this.g(eov.b);
         } else {
            this.g(this.dm().d(0.5, 0.0, 0.5));
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
      double $$33 = this.bM() ? 0.75 : 1.0;
      double $$34 = this.q();
      $$9 = this.dm();
      this.a(bpc.a, new eov(awm.a($$33 * $$9.c, -$$34, $$34), 0.0, awm.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && awm.a(this.do()) - $$0.u() == $$12.u() && awm.a(this.du()) - $$0.w() == $$12.w()) {
         this.a_(this.do(), this.dq() + (double)$$12.v(), this.du());
      } else if ($$13.v() != 0 && awm.a(this.do()) - $$0.u() == $$13.u() && awm.a(this.du()) - $$0.w() == $$13.w()) {
         this.a_(this.do(), this.dq() + (double)$$13.v(), this.du());
      }

      this.u();
      eov $$35 = this.q(this.do(), this.dq(), this.du());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         eov $$37 = this.dm();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.g($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.do(), $$35.d, this.du());
      }

      int $$39 = awm.a(this.do());
      int $$40 = awm.a(this.du());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         eov $$41 = this.dm();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         eov $$43 = this.dm();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.g($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            eov $$46 = this.dm();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dni.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dni.a) {
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
   public boolean cc() {
      return this.l;
   }

   private boolean a(ib $$0) {
      return this.dJ().a_($$0).g(this.dJ(), $$0);
   }

   protected void u() {
      double $$0 = this.bM() ? 0.997 : 0.96;
      eov $$1 = this.dm();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.aZ()) {
         $$1 = $$1.a(0.95F);
      }

      this.g($$1);
   }

   @Nullable
   public eov a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = awm.a($$0);
      int $$5 = awm.a($$1);
      int $$6 = awm.a($$2);
      if (this.dJ().a_(new ib($$4, $$5 - 1, $$6)).a(aue.N)) {
         $$5--;
      }

      dme $$7 = this.dJ().a_(new ib($$4, $$5, $$6));
      if (cyu.g($$7)) {
         dni $$8 = $$7.c(((cyu)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<jf, jf> $$9 = a($$8);
         jf $$10 = (jf)$$9.getFirst();
         jf $$11 = (jf)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && awm.a($$0) - $$4 == $$10.u() && awm.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && awm.a($$0) - $$4 == $$11.u() && awm.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public eov q(double $$0, double $$1, double $$2) {
      int $$3 = awm.a($$0);
      int $$4 = awm.a($$1);
      int $$5 = awm.a($$2);
      if (this.dJ().a_(new ib($$3, $$4 - 1, $$5)).a(aue.N)) {
         $$4--;
      }

      dme $$6 = this.dJ().a_(new ib($$3, $$4, $$5));
      if (cyu.g($$6)) {
         dni $$7 = $$6.c(((cyu)$$6.b()).c());
         Pair<jf, jf> $$8 = a($$7);
         jf $$9 = (jf)$$8.getFirst();
         jf $$10 = (jf)$$8.getSecond();
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

         return new eov($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public eoq i_() {
      eoq $$0 = this.cE();
      return this.B() ? $$0.g((double)Math.abs(this.z()) / 16.0) : $$0;
   }

   @Override
   protected void a(sy $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(tn.a(this.dJ().a(ki.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(sy $$0) {
      if (this.B()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", tn.a(this.x()));
         $$0.a("DisplayOffset", this.z());
      }
   }

   @Override
   public void g(bof $$0) {
      if (!this.dJ().B) {
         if (!$$0.ae && !this.ae) {
            if (!this.w($$0)) {
               double $$1 = $$0.do() - this.do();
               double $$2 = $$0.du() - this.du();
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
                  if ($$0 instanceof cjt) {
                     double $$5 = $$0.do() - this.do();
                     double $$6 = $$0.du() - this.du();
                     eov $$7 = new eov($$5, 0.0, $$6).d();
                     eov $$8 = new eov((double)awm.b(this.dz() * (float) (Math.PI / 180.0)), 0.0, (double)awm.a(this.dz() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     eov $$10 = this.dm();
                     eov $$11 = $$0.dm();
                     if (((cjt)$$0).w() == cjt.a.c && this.w() != cjt.a.c) {
                        this.g($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.g($$11.d(0.95, 1.0, 0.95));
                     } else if (((cjt)$$0).w() != cjt.a.c && this.w() == cjt.a.c) {
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
      return this.m > 0 ? this.n : this.do();
   }

   @Override
   public double N_() {
      return this.m > 0 ? this.o : this.dq();
   }

   @Override
   public double O_() {
      return this.m > 0 ? this.p : this.du();
   }

   @Override
   public float f_() {
      return this.m > 0 ? (float)this.r : this.dB();
   }

   @Override
   public float q_() {
      return this.m > 0 ? (float)this.q : this.dz();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new eov($$0, $$1, $$2);
      this.g(this.s);
   }

   public abstract cjt.a w();

   public dme x() {
      return !this.B() ? this.y() : czf.a(this.an().b(d));
   }

   public dme y() {
      return czh.a.o();
   }

   public int z() {
      return !this.B() ? this.A() : this.an().b(e);
   }

   public int A() {
      return 6;
   }

   public void c(dme $$0) {
      this.an().b(d, czf.i($$0));
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
   public cpq dw() {
      return new cpq(switch (this.w()) {
         case b -> cpt.nM;
         case c -> cpt.nN;
         case d -> cpt.nO;
         default -> cpt.nL;
         case f -> cpt.nP;
         case g -> cpt.uI;
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
