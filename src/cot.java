import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cot extends cpg {
   private static final exa c = new exa(0.0, 0.0, 0.0);
   private static final ajw<Integer> d = aka.a(cot.class, ajy.b);
   private static final ajw<Integer> e = aka.a(cot.class, ajy.b);
   private static final ajw<Boolean> i = aka.a(cot.class, ajy.k);
   private static final ImmutableMap<bua, ImmutableList<Integer>> j = ImmutableMap.of(
      bua.a, ImmutableList.of(0, 1, -1), bua.f, ImmutableList.of(0, 1, -1), bua.d, ImmutableList.of(0, 1)
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
   private exa s = exa.b;
   private static final Map<dug, Pair<kh, kh>> t = ad.a(Maps.newEnumMap(dug.class), $$0 -> {
      kh $$1 = ji.e.q();
      kh $$2 = ji.f.q();
      kh $$3 = ji.c.q();
      kh $$4 = ji.d.q();
      kh $$5 = $$1.p();
      kh $$6 = $$2.p();
      kh $$7 = $$3.p();
      kh $$8 = $$4.p();
      $$0.put(dug.a, Pair.of($$3, $$4));
      $$0.put(dug.b, Pair.of($$1, $$2));
      $$0.put(dug.c, Pair.of($$5, $$2));
      $$0.put(dug.d, Pair.of($$1, $$6));
      $$0.put(dug.e, Pair.of($$3, $$8));
      $$0.put(dug.f, Pair.of($$7, $$4));
      $$0.put(dug.g, Pair.of($$4, $$2));
      $$0.put(dug.h, Pair.of($$4, $$1));
      $$0.put(dug.i, Pair.of($$3, $$1));
      $$0.put(dug.j, Pair.of($$3, $$2));
   });

   protected cot(bsx<?> $$0, dcw $$1) {
      super($$0, $$1);
      this.J = true;
   }

   protected cot(bsx<?> $$0, dcw $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static cot a(aqu $$0, double $$1, double $$2, double $$3, cot.a $$4, cuq $$5, @Nullable cmx $$6) {
      cot $$7 = (cot)(switch ($$4) {
         case b -> new cpa($$0, $$1, $$2, $$3);
         case c -> new cpc($$0, $$1, $$2, $$3);
         case d -> new cpf($$0, $$1, $$2, $$3);
         case e -> new cpe($$0, $$1, $$2, $$3);
         case f -> new cpd($$0, $$1, $$2, $$3);
         case g -> new cpb($$0, $$1, $$2, $$3);
         default -> new coz($$0, $$1, $$2, $$3);
      });
      bsx.<cot>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.c;
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(d, dfy.i(dga.a.o()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(bsr $$0) {
      return cov.a(this, $$0);
   }

   @Override
   public boolean bB() {
      return true;
   }

   @Override
   public exa a(ji.a $$0, l.a $$1) {
      return btn.k(super.a($$0, $$1));
   }

   @Override
   protected exa a(bsr $$0, bsu $$1, float $$2) {
      boolean $$3 = $$0 instanceof cmk || $$0 instanceof cmq;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public exa b(btn $$0) {
      ji $$1 = this.cJ();
      if ($$1.o() == ji.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = coy.a($$1);
         jd $$3 = this.dp();
         jd.a $$4 = new jd.a();
         ImmutableList<bua> $$5 = $$0.fF();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bua $$6 = (bua)$$14.next();
            bsu $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dP().a(coy.a(this.dP(), $$4), () -> coy.a(this.dP(), $$4.e()));
                  if (coy.a($$11)) {
                     ewv $$12 = new ewv((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     exa $$13 = exa.a($$4, $$11);
                     if (coy.a(this.dP(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cL().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bua $$15 = (bua)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = ayo.c($$14x - (double)$$4.v() + $$16);
            double $$18 = coy.a($$4, $$17, $$0x -> this.dP().a_($$0x).k(this.dP(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aO() {
      dtc $$0 = this.dP().a_(this.dp());
      return $$0.a(awe.N) ? 1.0F : super.aO();
   }

   @Override
   public void n(float $$0) {
      this.m(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bA() {
      return !this.dK();
   }

   private static Pair<kh, kh> a(dug $$0) {
      return t.get($$0);
   }

   @Override
   public ji cJ() {
      return this.k ? this.cI().g().h() : this.cI().h();
   }

   @Override
   protected double aZ() {
      return this.bf() ? 0.005 : 0.04;
   }

   @Override
   public void l() {
      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      this.ax();
      this.bP();
      if (this.dP().B) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.av();
            this.a(this.dF(), this.dH());
         }
      } else {
         this.bb();
         int $$0 = ayo.a(this.du());
         int $$1 = ayo.a(this.dw());
         int $$2 = ayo.a(this.dA());
         if (this.dP().a_(new jd($$0, $$1 - 1, $$2)).a(awe.N)) {
            $$1--;
         }

         jd $$3 = new jd($$0, $$1, $$2);
         dtc $$4 = this.dP().a_($$3);
         this.l = dfn.g($$4);
         if (this.l) {
            this.c($$3, $$4);
            if ($$4.a(dga.hh)) {
               this.a($$0, $$1, $$2, $$4.c(dlv.f));
            }
         } else {
            this.s();
         }

         this.aT();
         this.u(0.0F);
         double $$5 = this.L - this.du();
         double $$6 = this.N - this.dA();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.t((float)(ayo.d($$6, $$5) * 180.0 / Math.PI));
            if (this.k) {
               this.t(this.dF() + 180.0F);
            }
         }

         double $$7 = (double)ayo.g(this.dF() - this.O);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.t(this.dF() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dF(), this.dH());
         if (this.v() == cot.a.a && this.ds().i() > 0.01) {
            List<bsr> $$8 = this.dP().a(this, this.cL().c(0.2F, 0.0, 0.2F), bsw.a(this));
            if (!$$8.isEmpty()) {
               for (bsr $$9 : $$8) {
                  if (!($$9 instanceof cmx) && !($$9 instanceof cfq) && !($$9 instanceof cot) && !this.bT() && !$$9.bS()) {
                     $$9.n(this);
                  } else {
                     $$9.h(this);
                  }
               }
            }
         } else {
            for (bsr $$10 : this.dP().a_(this, this.cL().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$10) && $$10.bB() && $$10 instanceof cot) {
                  $$10.h(this);
               }
            }
         }

         this.bm();
         if (this.bt()) {
            this.aB();
            this.ac *= 0.5F;
         }

         this.an = false;
      }
   }

   protected double p() {
      return (this.bf() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   protected void s() {
      double $$0 = this.p();
      exa $$1 = this.ds();
      this.n(ayo.a($$1.c, -$$0, $$0), $$1.d, ayo.a($$1.e, -$$0, $$0));
      if (this.aF()) {
         this.i(this.ds().a(0.5));
      }

      this.a(bts.a, this.ds());
      if (!this.aF()) {
         this.i(this.ds().a(0.95));
      }
   }

   @Override
   protected void c(jd $$0, dtc $$1) {
      this.n();
      double $$2 = this.du();
      double $$3 = this.dw();
      double $$4 = this.dA();
      exa $$5 = this.p($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dga.bp)) {
         $$6 = $$1.c(dlv.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.bf()) {
         $$8 *= 0.2;
      }

      exa $$9 = this.ds();
      dug $$10 = $$1.c(((dfn)$$1.b()).c());
      switch ($$10) {
         case c:
            this.i($$9.b(-$$8, 0.0, 0.0));
            $$3++;
            break;
         case d:
            this.i($$9.b($$8, 0.0, 0.0));
            $$3++;
            break;
         case e:
            this.i($$9.b(0.0, 0.0, $$8));
            $$3++;
            break;
         case f:
            this.i($$9.b(0.0, 0.0, -$$8));
            $$3++;
      }

      $$9 = this.ds();
      Pair<kh, kh> $$11 = a($$10);
      kh $$12 = (kh)$$11.getFirst();
      kh $$13 = (kh)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new exa($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.i($$9);
      bsr $$19 = this.cU();
      if ($$19 instanceof cmx) {
         exa $$20 = $$19.ds();
         double $$21 = $$20.i();
         double $$22 = this.ds().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.i(this.ds().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.ds().h();
         if ($$23 < 0.03) {
            this.i(exa.b);
         } else {
            this.i(this.ds().d(0.5, 0.0, 0.5));
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
      double $$33 = this.bT() ? 0.75 : 1.0;
      double $$34 = this.p();
      $$9 = this.ds();
      this.a(bts.a, new exa(ayo.a($$33 * $$9.c, -$$34, $$34), 0.0, ayo.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && ayo.a(this.du()) - $$0.u() == $$12.u() && ayo.a(this.dA()) - $$0.w() == $$12.w()) {
         this.a_(this.du(), this.dw() + (double)$$12.v(), this.dA());
      } else if ($$13.v() != 0 && ayo.a(this.du()) - $$0.u() == $$13.u() && ayo.a(this.dA()) - $$0.w() == $$13.w()) {
         this.a_(this.du(), this.dw() + (double)$$13.v(), this.dA());
      }

      this.t();
      exa $$35 = this.p(this.du(), this.dw(), this.dA());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         exa $$37 = this.ds();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.i($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.du(), $$35.d, this.dA());
      }

      int $$39 = ayo.a(this.du());
      int $$40 = ayo.a(this.dA());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         exa $$41 = this.ds();
         double $$42 = $$41.h();
         this.n($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         exa $$43 = this.ds();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.i($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            exa $$46 = this.ds();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dug.b) {
               if (this.a($$0.h())) {
                  $$47 = 0.02;
               } else if (this.a($$0.i())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dug.a) {
                  return;
               }

               if (this.a($$0.f())) {
                  $$48 = 0.02;
               } else if (this.a($$0.g())) {
                  $$48 = -0.02;
               }
            }

            this.n($$47, $$46.d, $$48);
         }
      }
   }

   @Override
   public boolean cj() {
      return this.l;
   }

   private boolean a(jd $$0) {
      return this.dP().a_($$0).g(this.dP(), $$0);
   }

   protected void t() {
      double $$0 = this.bT() ? 0.997 : 0.96;
      exa $$1 = this.ds();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.bf()) {
         $$1 = $$1.a(0.95F);
      }

      this.i($$1);
   }

   @Nullable
   public exa a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = ayo.a($$0);
      int $$5 = ayo.a($$1);
      int $$6 = ayo.a($$2);
      if (this.dP().a_(new jd($$4, $$5 - 1, $$6)).a(awe.N)) {
         $$5--;
      }

      dtc $$7 = this.dP().a_(new jd($$4, $$5, $$6));
      if (dfn.g($$7)) {
         dug $$8 = $$7.c(((dfn)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<kh, kh> $$9 = a($$8);
         kh $$10 = (kh)$$9.getFirst();
         kh $$11 = (kh)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && ayo.a($$0) - $$4 == $$10.u() && ayo.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && ayo.a($$0) - $$4 == $$11.u() && ayo.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.p($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public exa p(double $$0, double $$1, double $$2) {
      int $$3 = ayo.a($$0);
      int $$4 = ayo.a($$1);
      int $$5 = ayo.a($$2);
      if (this.dP().a_(new jd($$3, $$4 - 1, $$5)).a(awe.N)) {
         $$4--;
      }

      dtc $$6 = this.dP().a_(new jd($$3, $$4, $$5));
      if (dfn.g($$6)) {
         dug $$7 = $$6.c(((dfn)$$6.b()).c());
         Pair<kh, kh> $$8 = a($$7);
         kh $$9 = (kh)$$8.getFirst();
         kh $$10 = (kh)$$8.getSecond();
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

         return new exa($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public ewv h_() {
      ewv $$0 = this.cL();
      return this.A() ? $$0.g((double)Math.abs(this.y()) / 16.0) : $$0;
   }

   @Override
   protected void a(ub $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(uq.a(this.dP().a(lu.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(ub $$0) {
      if (this.A()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", uq.a(this.w()));
         $$0.a("DisplayOffset", this.y());
      }
   }

   @Override
   public void h(bsr $$0) {
      if (!this.dP().B) {
         if (!$$0.ag && !this.ag) {
            if (!this.x($$0)) {
               double $$1 = $$0.du() - this.du();
               double $$2 = $$0.dA() - this.dA();
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
                  if ($$0 instanceof cot) {
                     double $$5 = $$0.du() - this.du();
                     double $$6 = $$0.dA() - this.dA();
                     exa $$7 = new exa($$5, 0.0, $$6).d();
                     exa $$8 = new exa((double)ayo.b(this.dF() * (float) (Math.PI / 180.0)), 0.0, (double)ayo.a(this.dF() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     exa $$10 = this.ds();
                     exa $$11 = $$0.ds();
                     if (((cot)$$0).v() == cot.a.c && this.v() != cot.a.c) {
                        this.i($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.i($$11.d(0.95, 1.0, 0.95));
                     } else if (((cot)$$0).v() != cot.a.c && this.v() == cot.a.c) {
                        $$0.i($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$10.c + $$1, 0.0, $$10.e + $$2);
                        this.i($$10.d(0.95, 1.0, 0.95));
                     } else {
                        double $$12 = ($$11.c + $$10.c) / 2.0;
                        double $$13 = ($$11.e + $$10.e) / 2.0;
                        this.i($$10.d(0.2, 1.0, 0.2));
                        this.j($$12 - $$1, 0.0, $$13 - $$2);
                        $$0.i($$11.d(0.2, 1.0, 0.2));
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
      this.i(this.s);
   }

   @Override
   public double c_() {
      return this.m > 0 ? this.n : this.du();
   }

   @Override
   public double d_() {
      return this.m > 0 ? this.o : this.dw();
   }

   @Override
   public double P_() {
      return this.m > 0 ? this.p : this.dA();
   }

   @Override
   public float Q_() {
      return this.m > 0 ? (float)this.r : this.dH();
   }

   @Override
   public float e_() {
      return this.m > 0 ? (float)this.q : this.dF();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new exa($$0, $$1, $$2);
      this.i(this.s);
   }

   public abstract cot.a v();

   public dtc w() {
      return !this.A() ? this.x() : dfy.a(this.ar().a(d));
   }

   public dtc x() {
      return dga.a.o();
   }

   public int y() {
      return !this.A() ? this.z() : this.ar().a(e);
   }

   public int z() {
      return 6;
   }

   public void c(dtc $$0) {
      this.ar().a(d, dfy.i($$0));
      this.a(true);
   }

   public void c(int $$0) {
      this.ar().a(e, $$0);
      this.a(true);
   }

   public boolean A() {
      return this.ar().a(i);
   }

   public void a(boolean $$0) {
      this.ar().a(i, $$0);
   }

   @Override
   public cuq dC() {
      return new cuq(switch (this.v()) {
         case b -> cut.nN;
         case c -> cut.nO;
         case d -> cut.nP;
         default -> cut.nM;
         case f -> cut.nQ;
         case g -> cut.uM;
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
