import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cov extends cpi {
   private static final evt c = new evt(0.0, 0.0, 0.0);
   private static final akk<Integer> d = ako.a(cov.class, akm.b);
   private static final akk<Integer> e = ako.a(cov.class, akm.b);
   private static final akk<Boolean> i = ako.a(cov.class, akm.k);
   private static final ImmutableMap<bud, ImmutableList<Integer>> j = ImmutableMap.of(
      bud.a, ImmutableList.of(0, 1, -1), bud.f, ImmutableList.of(0, 1, -1), bud.d, ImmutableList.of(0, 1)
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
   private evt s = evt.b;
   private static final Map<dti, Pair<kd, kd>> t = ac.a(Maps.newEnumMap(dti.class), $$0 -> {
      kd $$1 = je.e.q();
      kd $$2 = je.f.q();
      kd $$3 = je.c.q();
      kd $$4 = je.d.q();
      kd $$5 = $$1.o();
      kd $$6 = $$2.o();
      kd $$7 = $$3.o();
      kd $$8 = $$4.o();
      $$0.put(dti.a, Pair.of($$3, $$4));
      $$0.put(dti.b, Pair.of($$1, $$2));
      $$0.put(dti.c, Pair.of($$5, $$2));
      $$0.put(dti.d, Pair.of($$1, $$6));
      $$0.put(dti.e, Pair.of($$3, $$8));
      $$0.put(dti.f, Pair.of($$7, $$4));
      $$0.put(dti.g, Pair.of($$4, $$2));
      $$0.put(dti.h, Pair.of($$4, $$1));
      $$0.put(dti.i, Pair.of($$3, $$1));
      $$0.put(dti.j, Pair.of($$3, $$2));
   });

   protected cov(btc<?> $$0, dca $$1) {
      super($$0, $$1);
      this.J = true;
   }

   protected cov(btc<?> $$0, dca $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static cov a(arf $$0, double $$1, double $$2, double $$3, cov.a $$4, cur $$5, @Nullable cmz $$6) {
      cov $$7 = (cov)(switch ($$4) {
         case b -> new cpc($$0, $$1, $$2, $$3);
         case c -> new cpe($$0, $$1, $$2, $$3);
         case d -> new cph($$0, $$1, $$2, $$3);
         case e -> new cpg($$0, $$1, $$2, $$3);
         case f -> new cpf($$0, $$1, $$2, $$3);
         case g -> new cpd($$0, $$1, $$2, $$3);
         default -> new cpb($$0, $$1, $$2, $$3);
      });
      btc.<cov>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected bsw.b bb() {
      return bsw.b.c;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(d, dfb.i(dfd.a.o()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(bsw $$0) {
      return cox.a(this, $$0);
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   protected evt a(je.a $$0, l.a $$1) {
      return btr.j(super.a($$0, $$1));
   }

   @Override
   protected evt a(bsw $$0, bsz $$1, float $$2) {
      boolean $$3 = $$0 instanceof cmm || $$0 instanceof cms;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public evt b(btr $$0) {
      je $$1 = this.cI();
      if ($$1.o() == je.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cpa.a($$1);
         iz $$3 = this.dp();
         iz.a $$4 = new iz.a();
         ImmutableList<bud> $$5 = $$0.fI();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bud $$6 = (bud)$$14.next();
            bsz $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dP().a(cpa.a(this.dP(), $$4), () -> cpa.a(this.dP(), $$4.d()));
                  if (cpa.a($$11)) {
                     evo $$12 = new evo((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     evt $$13 = evt.a($$4, $$11);
                     if (cpa.a(this.dP(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cK().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bud $$15 = (bud)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = ayz.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cpa.a($$4, $$17, $$0x -> this.dP().a_($$0x).k(this.dP(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aN() {
      dse $$0 = this.dP().a_(this.dp());
      return $$0.a(awp.N) ? 1.0F : super.aN();
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bz() {
      return !this.dK();
   }

   private static Pair<kd, kd> a(dti $$0) {
      return t.get($$0);
   }

   @Override
   public je cI() {
      return this.k ? this.cH().g().h() : this.cH().h();
   }

   @Override
   protected double aY() {
      return this.be() ? 0.005 : 0.04;
   }

   @Override
   public void l() {
      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      this.av();
      this.bO();
      if (this.dP().B) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.at();
            this.a(this.dF(), this.dH());
         }
      } else {
         this.ba();
         int $$0 = ayz.a(this.du());
         int $$1 = ayz.a(this.dw());
         int $$2 = ayz.a(this.dA());
         if (this.dP().a_(new iz($$0, $$1 - 1, $$2)).a(awp.N)) {
            $$1--;
         }

         iz $$3 = new iz($$0, $$1, $$2);
         dse $$4 = this.dP().a_($$3);
         this.l = deq.g($$4);
         if (this.l) {
            this.c($$3, $$4);
            if ($$4.a(dfd.hh)) {
               this.a($$0, $$1, $$2, $$4.c(dkx.f));
            }
         } else {
            this.s();
         }

         this.aS();
         this.s(0.0F);
         double $$5 = this.L - this.du();
         double $$6 = this.N - this.dA();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.r((float)(ayz.d($$6, $$5) * 180.0 / Math.PI));
            if (this.k) {
               this.r(this.dF() + 180.0F);
            }
         }

         double $$7 = (double)ayz.g(this.dF() - this.O);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.r(this.dF() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dF(), this.dH());
         if (this.v() == cov.a.a && this.ds().i() > 0.01) {
            List<bsw> $$8 = this.dP().a(this, this.cK().c(0.2F, 0.0, 0.2F), btb.a(this));
            if (!$$8.isEmpty()) {
               for (bsw $$9 : $$8) {
                  if (!($$9 instanceof cmz) && !($$9 instanceof cft) && !($$9 instanceof cov) && !this.bS() && !$$9.bR()) {
                     $$9.n(this);
                  } else {
                     $$9.h(this);
                  }
               }
            }
         } else {
            for (bsw $$10 : this.dP().a_(this, this.cK().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$10) && $$10.bA() && $$10 instanceof cov) {
                  $$10.h(this);
               }
            }
         }

         this.bl();
         if (this.bs()) {
            this.aA();
            this.ac *= 0.5F;
         }

         this.an = false;
      }
   }

   protected double p() {
      return (this.be() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   protected void s() {
      double $$0 = this.p();
      evt $$1 = this.ds();
      this.o(ayz.a($$1.c, -$$0, $$0), $$1.d, ayz.a($$1.e, -$$0, $$0));
      if (this.aE()) {
         this.h(this.ds().a(0.5));
      }

      this.a(btw.a, this.ds());
      if (!this.aE()) {
         this.h(this.ds().a(0.95));
      }
   }

   @Override
   protected void c(iz $$0, dse $$1) {
      this.n();
      double $$2 = this.du();
      double $$3 = this.dw();
      double $$4 = this.dA();
      evt $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dfd.bp)) {
         $$6 = $$1.c(dkx.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.be()) {
         $$8 *= 0.2;
      }

      evt $$9 = this.ds();
      dti $$10 = $$1.c(((deq)$$1.b()).c());
      switch ($$10) {
         case c:
            this.h($$9.b(-$$8, 0.0, 0.0));
            $$3++;
            break;
         case d:
            this.h($$9.b($$8, 0.0, 0.0));
            $$3++;
            break;
         case e:
            this.h($$9.b(0.0, 0.0, $$8));
            $$3++;
            break;
         case f:
            this.h($$9.b(0.0, 0.0, -$$8));
            $$3++;
      }

      $$9 = this.ds();
      Pair<kd, kd> $$11 = a($$10);
      kd $$12 = (kd)$$11.getFirst();
      kd $$13 = (kd)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new evt($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.h($$9);
      bsw $$19 = this.cT();
      if ($$19 instanceof cmz) {
         evt $$20 = $$19.ds();
         double $$21 = $$20.i();
         double $$22 = this.ds().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.h(this.ds().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.ds().h();
         if ($$23 < 0.03) {
            this.h(evt.b);
         } else {
            this.h(this.ds().d(0.5, 0.0, 0.5));
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
      double $$33 = this.bS() ? 0.75 : 1.0;
      double $$34 = this.p();
      $$9 = this.ds();
      this.a(btw.a, new evt(ayz.a($$33 * $$9.c, -$$34, $$34), 0.0, ayz.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && ayz.a(this.du()) - $$0.u() == $$12.u() && ayz.a(this.dA()) - $$0.w() == $$12.w()) {
         this.a_(this.du(), this.dw() + (double)$$12.v(), this.dA());
      } else if ($$13.v() != 0 && ayz.a(this.du()) - $$0.u() == $$13.u() && ayz.a(this.dA()) - $$0.w() == $$13.w()) {
         this.a_(this.du(), this.dw() + (double)$$13.v(), this.dA());
      }

      this.u();
      evt $$35 = this.q(this.du(), this.dw(), this.dA());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         evt $$37 = this.ds();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.h($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.du(), $$35.d, this.dA());
      }

      int $$39 = ayz.a(this.du());
      int $$40 = ayz.a(this.dA());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         evt $$41 = this.ds();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         evt $$43 = this.ds();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.h($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            evt $$46 = this.ds();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dti.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dti.a) {
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
   public boolean ci() {
      return this.l;
   }

   private boolean a(iz $$0) {
      return this.dP().a_($$0).g(this.dP(), $$0);
   }

   protected void u() {
      double $$0 = this.bS() ? 0.997 : 0.96;
      evt $$1 = this.ds();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.be()) {
         $$1 = $$1.a(0.95F);
      }

      this.h($$1);
   }

   @Nullable
   public evt a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = ayz.a($$0);
      int $$5 = ayz.a($$1);
      int $$6 = ayz.a($$2);
      if (this.dP().a_(new iz($$4, $$5 - 1, $$6)).a(awp.N)) {
         $$5--;
      }

      dse $$7 = this.dP().a_(new iz($$4, $$5, $$6));
      if (deq.g($$7)) {
         dti $$8 = $$7.c(((deq)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<kd, kd> $$9 = a($$8);
         kd $$10 = (kd)$$9.getFirst();
         kd $$11 = (kd)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && ayz.a($$0) - $$4 == $$10.u() && ayz.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && ayz.a($$0) - $$4 == $$11.u() && ayz.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public evt q(double $$0, double $$1, double $$2) {
      int $$3 = ayz.a($$0);
      int $$4 = ayz.a($$1);
      int $$5 = ayz.a($$2);
      if (this.dP().a_(new iz($$3, $$4 - 1, $$5)).a(awp.N)) {
         $$4--;
      }

      dse $$6 = this.dP().a_(new iz($$3, $$4, $$5));
      if (deq.g($$6)) {
         dti $$7 = $$6.c(((deq)$$6.b()).c());
         Pair<kd, kd> $$8 = a($$7);
         kd $$9 = (kd)$$8.getFirst();
         kd $$10 = (kd)$$8.getSecond();
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

         return new evt($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public evo h_() {
      evo $$0 = this.cK();
      return this.A() ? $$0.g((double)Math.abs(this.y()) / 16.0) : $$0;
   }

   @Override
   protected void a(us $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(vh.a(this.dP().a(lq.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(us $$0) {
      if (this.A()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", vh.a(this.w()));
         $$0.a("DisplayOffset", this.y());
      }
   }

   @Override
   public void h(bsw $$0) {
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
                  if ($$0 instanceof cov) {
                     double $$5 = $$0.du() - this.du();
                     double $$6 = $$0.dA() - this.dA();
                     evt $$7 = new evt($$5, 0.0, $$6).d();
                     evt $$8 = new evt((double)ayz.b(this.dF() * (float) (Math.PI / 180.0)), 0.0, (double)ayz.a(this.dF() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     evt $$10 = this.ds();
                     evt $$11 = $$0.ds();
                     if (((cov)$$0).v() == cov.a.c && this.v() != cov.a.c) {
                        this.h($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.h($$11.d(0.95, 1.0, 0.95));
                     } else if (((cov)$$0).v() != cov.a.c && this.v() == cov.a.c) {
                        $$0.h($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$10.c + $$1, 0.0, $$10.e + $$2);
                        this.h($$10.d(0.95, 1.0, 0.95));
                     } else {
                        double $$12 = ($$11.c + $$10.c) / 2.0;
                        double $$13 = ($$11.e + $$10.e) / 2.0;
                        this.h($$10.d(0.2, 1.0, 0.2));
                        this.j($$12 - $$1, 0.0, $$13 - $$2);
                        $$0.h($$11.d(0.2, 1.0, 0.2));
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
      this.h(this.s);
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
   public double L_() {
      return this.m > 0 ? this.p : this.dA();
   }

   @Override
   public float M_() {
      return this.m > 0 ? (float)this.r : this.dH();
   }

   @Override
   public float e_() {
      return this.m > 0 ? (float)this.q : this.dF();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new evt($$0, $$1, $$2);
      this.h(this.s);
   }

   public abstract cov.a v();

   public dse w() {
      return !this.A() ? this.x() : dfb.a(this.ap().a(d));
   }

   public dse x() {
      return dfd.a.o();
   }

   public int y() {
      return !this.A() ? this.z() : this.ap().a(e);
   }

   public int z() {
      return 6;
   }

   public void c(dse $$0) {
      this.ap().a(d, dfb.i($$0));
      this.a(true);
   }

   public void c(int $$0) {
      this.ap().a(e, $$0);
      this.a(true);
   }

   public boolean A() {
      return this.ap().a(i);
   }

   public void a(boolean $$0) {
      this.ap().a(i, $$0);
   }

   @Override
   public cur dC() {
      return new cur(switch (this.v()) {
         case b -> cuu.nN;
         case c -> cuu.nO;
         case d -> cuu.nP;
         default -> cuu.nM;
         case f -> cuu.nQ;
         case g -> cuu.uM;
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
