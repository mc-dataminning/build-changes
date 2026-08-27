import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cnw extends coj {
   private static final ewu c = new ewu(0.0, 0.0, 0.0);
   private static final ajy<Integer> d = akc.a(cnw.class, aka.b);
   private static final ajy<Integer> e = akc.a(cnw.class, aka.b);
   private static final ajy<Boolean> i = akc.a(cnw.class, aka.k);
   private static final ImmutableMap<bsz, ImmutableList<Integer>> j = ImmutableMap.of(
      bsz.a, ImmutableList.of(0, 1, -1), bsz.f, ImmutableList.of(0, 1, -1), bsz.d, ImmutableList.of(0, 1)
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
   private ewu s = ewu.b;
   private static final Map<dug, Pair<jv, jv>> t = ad.a(Maps.newEnumMap(dug.class), $$0 -> {
      jv $$1 = iw.e.q();
      jv $$2 = iw.f.q();
      jv $$3 = iw.c.q();
      jv $$4 = iw.d.q();
      jv $$5 = $$1.o();
      jv $$6 = $$2.o();
      jv $$7 = $$3.o();
      jv $$8 = $$4.o();
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

   protected cnw(bsb<?> $$0, dca $$1) {
      super($$0, $$1);
      this.K = true;
   }

   protected cnw(bsb<?> $$0, dca $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.M = $$2;
      this.N = $$3;
      this.O = $$4;
   }

   public static cnw a(aqt $$0, double $$1, double $$2, double $$3, cnw.a $$4, cuh $$5, @Nullable cly $$6) {
      cnw $$7 = (cnw)(switch ($$4) {
         case b -> new cod($$0, $$1, $$2, $$3);
         case c -> new cof($$0, $$1, $$2, $$3);
         case d -> new coi($$0, $$1, $$2, $$3);
         case e -> new coh($$0, $$1, $$2, $$3);
         case f -> new cog($$0, $$1, $$2, $$3);
         case g -> new coe($$0, $$1, $$2, $$3);
         default -> new coc($$0, $$1, $$2, $$3);
      });
      bsb.<cnw>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected brv.c bf() {
      return brv.c.c;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(d, dfc.i(dfe.a.n()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(brv $$0) {
      return cny.a(this, $$0);
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   protected ewu a(iw.a $$0, l.a $$1) {
      return bso.i(super.a($$0, $$1));
   }

   @Override
   protected ewu a(brv $$0, bry $$1, float $$2) {
      boolean $$3 = $$0 instanceof cll || $$0 instanceof clr;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public ewu b(bso $$0) {
      iw $$1 = this.cN();
      if ($$1.o() == iw.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cob.a($$1);
         ir $$3 = this.du();
         ir.a $$4 = new ir.a();
         ImmutableList<bsz> $$5 = $$0.fR();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bsz $$6 = (bsz)$$14.next();
            bry $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dU().a(cob.a(this.dU(), $$4), () -> cob.a(this.dU(), $$4.d()));
                  if (cob.a($$11)) {
                     ewp $$12 = new ewp((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     ewu $$13 = ewu.a($$4, $$11);
                     if (cob.a(this.dU(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cP().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bsz $$15 = (bsz)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = aym.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cob.a($$4, $$17, $$0x -> this.dU().a_($$0x).k(this.dU(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aQ() {
      dtc $$0 = this.dU().a_(this.du());
      return $$0.a(awe.N) ? 1.0F : super.aQ();
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.M() + this.M() * 10.0F);
   }

   @Override
   public boolean bE() {
      return !this.dP();
   }

   private static Pair<jv, jv> a(dug $$0) {
      return t.get($$0);
   }

   @Override
   public iw cN() {
      return this.k ? this.cM().g().h() : this.cM().h();
   }

   @Override
   protected double bc() {
      return this.bi() ? 0.005 : 0.04;
   }

   @Override
   public void l() {
      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.M() > 0.0F) {
         this.b(this.M() - 1.0F);
      }

      this.av();
      this.bT();
      if (this.dU().C) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.at();
            this.a(this.dK(), this.dM());
         }
      } else {
         this.be();
         int $$0 = aym.a(this.dz());
         int $$1 = aym.a(this.dB());
         int $$2 = aym.a(this.dF());
         if (this.dU().a_(new ir($$0, $$1 - 1, $$2)).a(awe.N)) {
            $$1--;
         }

         ir $$3 = new ir($$0, $$1, $$2);
         dtc $$4 = this.dU().a_($$3);
         this.l = deq.g($$4);
         if (this.l) {
            this.c($$3, $$4);
            if ($$4.a(dfe.ib)) {
               this.a($$0, $$1, $$2, $$4.c(dll.f));
            }
         } else {
            this.r();
         }

         this.aW();
         this.s(0.0F);
         double $$5 = this.M - this.dz();
         double $$6 = this.O - this.dF();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.r((float)(aym.d($$6, $$5) * 180.0 / Math.PI));
            if (this.k) {
               this.r(this.dK() + 180.0F);
            }
         }

         double $$7 = (double)aym.g(this.dK() - this.P);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.r(this.dK() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dK(), this.dM());
         if (this.u() == cnw.a.a && this.dx().i() > 0.01) {
            List<brv> $$8 = this.dU().a(this, this.cP().c(0.2F, 0.0, 0.2F), bsa.a(this));
            if (!$$8.isEmpty()) {
               for (brv $$9 : $$8) {
                  if (!($$9 instanceof cly) && !($$9 instanceof ceq) && !($$9 instanceof cnw) && !this.bX() && !$$9.bW()) {
                     $$9.n(this);
                  } else {
                     $$9.h(this);
                  }
               }
            }
         } else {
            for (brv $$10 : this.dU().a_(this, this.cP().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$10) && $$10.bF() && $$10 instanceof cnw) {
                  $$10.h(this);
               }
            }
         }

         this.bp();
         if (this.bx()) {
            this.aA();
            this.ad *= 0.5F;
         }

         this.ar = false;
      }
   }

   protected double p() {
      return (this.bi() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   protected void r() {
      double $$0 = this.p();
      ewu $$1 = this.dx();
      this.o(aym.a($$1.c, -$$0, $$0), $$1.d, aym.a($$1.e, -$$0, $$0));
      if (this.aE()) {
         this.g(this.dx().a(0.5));
      }

      this.a(bst.a, this.dx());
      if (!this.aE()) {
         this.g(this.dx().a(0.95));
      }
   }

   @Override
   protected void c(ir $$0, dtc $$1) {
      this.n();
      double $$2 = this.dz();
      double $$3 = this.dB();
      double $$4 = this.dF();
      ewu $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dfe.bZ)) {
         $$6 = $$1.c(dll.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.bi()) {
         $$8 *= 0.2;
      }

      ewu $$9 = this.dx();
      dug $$10 = $$1.c(((deq)$$1.b()).c());
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

      $$9 = this.dx();
      Pair<jv, jv> $$11 = a($$10);
      jv $$12 = (jv)$$11.getFirst();
      jv $$13 = (jv)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new ewu($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.g($$9);
      brv $$19 = this.cY();
      if ($$19 instanceof cly) {
         ewu $$20 = $$19.dx();
         double $$21 = $$20.i();
         double $$22 = this.dx().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.g(this.dx().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.dx().h();
         if ($$23 < 0.03) {
            this.g(ewu.b);
         } else {
            this.g(this.dx().d(0.5, 0.0, 0.5));
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
      double $$33 = this.bX() ? 0.75 : 1.0;
      double $$34 = this.p();
      $$9 = this.dx();
      this.a(bst.a, new ewu(aym.a($$33 * $$9.c, -$$34, $$34), 0.0, aym.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && aym.a(this.dz()) - $$0.u() == $$12.u() && aym.a(this.dF()) - $$0.w() == $$12.w()) {
         this.a_(this.dz(), this.dB() + (double)$$12.v(), this.dF());
      } else if ($$13.v() != 0 && aym.a(this.dz()) - $$0.u() == $$13.u() && aym.a(this.dF()) - $$0.w() == $$13.w()) {
         this.a_(this.dz(), this.dB() + (double)$$13.v(), this.dF());
      }

      this.t();
      ewu $$35 = this.q(this.dz(), this.dB(), this.dF());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         ewu $$37 = this.dx();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.g($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.dz(), $$35.d, this.dF());
      }

      int $$39 = aym.a(this.dz());
      int $$40 = aym.a(this.dF());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         ewu $$41 = this.dx();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         ewu $$43 = this.dx();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.g($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            ewu $$46 = this.dx();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dug.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dug.a) {
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
   public boolean cn() {
      return this.l;
   }

   private boolean a(ir $$0) {
      return this.dU().a_($$0).g(this.dU(), $$0);
   }

   protected void t() {
      double $$0 = this.bX() ? 0.997 : 0.96;
      ewu $$1 = this.dx();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.bi()) {
         $$1 = $$1.a(0.95F);
      }

      this.g($$1);
   }

   @Nullable
   public ewu a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = aym.a($$0);
      int $$5 = aym.a($$1);
      int $$6 = aym.a($$2);
      if (this.dU().a_(new ir($$4, $$5 - 1, $$6)).a(awe.N)) {
         $$5--;
      }

      dtc $$7 = this.dU().a_(new ir($$4, $$5, $$6));
      if (deq.g($$7)) {
         dug $$8 = $$7.c(((deq)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<jv, jv> $$9 = a($$8);
         jv $$10 = (jv)$$9.getFirst();
         jv $$11 = (jv)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && aym.a($$0) - $$4 == $$10.u() && aym.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && aym.a($$0) - $$4 == $$11.u() && aym.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public ewu q(double $$0, double $$1, double $$2) {
      int $$3 = aym.a($$0);
      int $$4 = aym.a($$1);
      int $$5 = aym.a($$2);
      if (this.dU().a_(new ir($$3, $$4 - 1, $$5)).a(awe.N)) {
         $$4--;
      }

      dtc $$6 = this.dU().a_(new ir($$3, $$4, $$5));
      if (deq.g($$6)) {
         dug $$7 = $$6.c(((deq)$$6.b()).c());
         Pair<jv, jv> $$8 = a($$7);
         jv $$9 = (jv)$$8.getFirst();
         jv $$10 = (jv)$$8.getSecond();
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

         return new ewu($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public ewp h_() {
      ewp $$0 = this.cP();
      return this.A() ? $$0.g((double)Math.abs(this.y()) / 16.0) : $$0;
   }

   @Override
   protected void a(uk $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(uz.a(this.dU().a(li.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(uk $$0) {
      if (this.A()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", uz.a(this.w()));
         $$0.a("DisplayOffset", this.y());
      }
   }

   @Override
   public void h(brv $$0) {
      if (!this.dU().C) {
         if (!$$0.ah && !this.ah) {
            if (!this.x($$0)) {
               double $$1 = $$0.dz() - this.dz();
               double $$2 = $$0.dF() - this.dF();
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
                  if ($$0 instanceof cnw) {
                     double $$5 = $$0.dz() - this.dz();
                     double $$6 = $$0.dF() - this.dF();
                     ewu $$7 = new ewu($$5, 0.0, $$6).d();
                     ewu $$8 = new ewu((double)aym.b(this.dK() * (float) (Math.PI / 180.0)), 0.0, (double)aym.a(this.dK() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     ewu $$10 = this.dx();
                     ewu $$11 = $$0.dx();
                     if (((cnw)$$0).u() == cnw.a.c && this.u() != cnw.a.c) {
                        this.g($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.g($$11.d(0.95, 1.0, 0.95));
                     } else if (((cnw)$$0).u() != cnw.a.c && this.u() == cnw.a.c) {
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
      return this.m > 0 ? this.n : this.dz();
   }

   @Override
   public double d_() {
      return this.m > 0 ? this.o : this.dB();
   }

   @Override
   public double M_() {
      return this.m > 0 ? this.p : this.dF();
   }

   @Override
   public float N_() {
      return this.m > 0 ? (float)this.r : this.dM();
   }

   @Override
   public float e_() {
      return this.m > 0 ? (float)this.q : this.dK();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new ewu($$0, $$1, $$2);
      this.g(this.s);
   }

   public abstract cnw.a u();

   public dtc w() {
      return !this.A() ? this.x() : dfc.a(this.ap().a(d));
   }

   public dtc x() {
      return dfe.a.n();
   }

   public int y() {
      return !this.A() ? this.z() : this.ap().a(e);
   }

   public int z() {
      return 6;
   }

   public void c(dtc $$0) {
      this.ap().a(d, dfc.i($$0));
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
   public cuh dH() {
      return new cuh(switch (this.u()) {
         case b -> cuk.pd;
         case c -> cuk.pe;
         case d -> cuk.pf;
         default -> cuk.pc;
         case f -> cuk.pg;
         case g -> cuk.wx;
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
