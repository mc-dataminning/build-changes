import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class ckp extends clc {
   private static final ept c = new ept(0.0, 0.0, 0.0);
   private static final aim<Integer> d = aiq.a(ckp.class, aio.b);
   private static final aim<Integer> e = aiq.a(ckp.class, aio.b);
   private static final aim<Boolean> i = aiq.a(ckp.class, aio.k);
   private static final ImmutableMap<bqa, ImmutableList<Integer>> j = ImmutableMap.of(
      bqa.a, ImmutableList.of(0, 1, -1), bqa.f, ImmutableList.of(0, 1, -1), bqa.d, ImmutableList.of(0, 1)
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
   private ept s = ept.b;
   private static final Map<dof, Pair<jg, jg>> t = ac.a(Maps.newEnumMap(dof.class), $$0 -> {
      jg $$1 = ih.e.q();
      jg $$2 = ih.f.q();
      jg $$3 = ih.c.q();
      jg $$4 = ih.d.q();
      jg $$5 = $$1.o();
      jg $$6 = $$2.o();
      jg $$7 = $$3.o();
      jg $$8 = $$4.o();
      $$0.put(dof.a, Pair.of($$3, $$4));
      $$0.put(dof.b, Pair.of($$1, $$2));
      $$0.put(dof.c, Pair.of($$5, $$2));
      $$0.put(dof.d, Pair.of($$1, $$6));
      $$0.put(dof.e, Pair.of($$3, $$8));
      $$0.put(dof.f, Pair.of($$7, $$4));
      $$0.put(dof.g, Pair.of($$4, $$2));
      $$0.put(dof.h, Pair.of($$4, $$1));
      $$0.put(dof.i, Pair.of($$3, $$1));
      $$0.put(dof.j, Pair.of($$3, $$2));
   });

   protected ckp(bpd<?> $$0, cxb $$1) {
      super($$0, $$1);
      this.I = true;
   }

   protected ckp(bpd<?> $$0, cxb $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.K = $$2;
      this.L = $$3;
      this.M = $$4;
   }

   public static ckp a(apf $$0, double $$1, double $$2, double $$3, ckp.a $$4, cqm $$5, @Nullable ciu $$6) {
      ckp $$7 = (ckp)(switch ($$4) {
         case b -> new ckw($$0, $$1, $$2, $$3);
         case c -> new cky($$0, $$1, $$2, $$3);
         case d -> new clb($$0, $$1, $$2, $$3);
         case e -> new cla($$0, $$1, $$2, $$3);
         case f -> new ckz($$0, $$1, $$2, $$3);
         case g -> new ckx($$0, $$1, $$2, $$3);
         default -> new ckv($$0, $$1, $$2, $$3);
      });
      bpd.<ckp>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected box.b aZ() {
      return box.b.c;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(d, dac.i(dae.a.o()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(box $$0) {
      return ckr.a(this, $$0);
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   protected ept a(ih.a $$0, l.a $$1) {
      return bpp.i(super.a($$0, $$1));
   }

   @Override
   protected ept a(box $$0, bpa $$1, float $$2) {
      boolean $$3 = $$0 instanceof cih || $$0 instanceof cin;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public ept b(bpp $$0) {
      ih $$1 = this.cF();
      if ($$1.o() == ih.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cku.a($$1);
         ib $$3 = this.dm();
         ib.a $$4 = new ib.a();
         ImmutableList<bqa> $$5 = $$0.fF();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bqa $$6 = (bqa)$$14.next();
            bpa $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dM().a(cku.a(this.dM(), $$4), () -> cku.a(this.dM(), $$4.d()));
                  if (cku.a($$11)) {
                     epo $$12 = new epo((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     ept $$13 = ept.a($$4, $$11);
                     if (cku.a(this.dM(), $$0, $$12.c($$13))) {
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
            bqa $$15 = (bqa)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = aww.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cku.a($$4, $$17, $$0x -> this.dM().a_($$0x).k(this.dM(), $$0x));
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
      dnb $$0 = this.dM().a_(this.dm());
      return $$0.a(aun.N) ? 1.0F : super.aL();
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

   private static Pair<jg, jg> a(dof $$0) {
      return t.get($$0);
   }

   @Override
   public ih cF() {
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
         int $$0 = aww.a(this.dr());
         int $$1 = aww.a(this.dt());
         int $$2 = aww.a(this.dx());
         if (this.dM().a_(new ib($$0, $$1 - 1, $$2)).a(aun.N)) {
            $$1--;
         }

         ib $$3 = new ib($$0, $$1, $$2);
         dnb $$4 = this.dM().a_($$3);
         this.l = czr.g($$4);
         if (this.l) {
            this.c($$3, $$4);
            if ($$4.a(dae.hh)) {
               this.a($$0, $$1, $$2, $$4.c(dfx.f));
            }
         } else {
            this.r();
         }

         this.aQ();
         this.s(0.0F);
         double $$5 = this.K - this.dr();
         double $$6 = this.M - this.dx();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.r((float)(aww.d($$6, $$5) * 180.0 / Math.PI));
            if (this.k) {
               this.r(this.dC() + 180.0F);
            }
         }

         double $$7 = (double)aww.g(this.dC() - this.N);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.r(this.dC() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dC(), this.dE());
         if (this.v() == ckp.a.a && this.dp().i() > 0.01) {
            List<box> $$8 = this.dM().a(this, this.cH().c(0.2F, 0.0, 0.2F), bpc.a(this));
            if (!$$8.isEmpty()) {
               for (box $$9 : $$8) {
                  if (!($$9 instanceof ciu) && !($$9 instanceof cbq) && !($$9 instanceof ckp) && !this.bP() && !$$9.bO()) {
                     $$9.n(this);
                  } else {
                     $$9.h(this);
                  }
               }
            }
         } else {
            for (box $$10 : this.dM().a_(this, this.cH().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$10) && $$10.bx() && $$10 instanceof ckp) {
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
      ept $$1 = this.dp();
      this.o(aww.a($$1.c, -$$0, $$0), $$1.d, aww.a($$1.e, -$$0, $$0));
      if (this.aC()) {
         this.g(this.dp().a(0.5));
      }

      this.a(bpu.a, this.dp());
      if (!this.aC()) {
         this.g(this.dp().a(0.95));
      }
   }

   @Override
   protected void c(ib $$0, dnb $$1) {
      this.n();
      double $$2 = this.dr();
      double $$3 = this.dt();
      double $$4 = this.dx();
      ept $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dae.bp)) {
         $$6 = $$1.c(dfx.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.bc()) {
         $$8 *= 0.2;
      }

      ept $$9 = this.dp();
      dof $$10 = $$1.c(((czr)$$1.b()).c());
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
      Pair<jg, jg> $$11 = a($$10);
      jg $$12 = (jg)$$11.getFirst();
      jg $$13 = (jg)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new ept($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.g($$9);
      box $$19 = this.cQ();
      if ($$19 instanceof ciu) {
         ept $$20 = $$19.dp();
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
            this.g(ept.b);
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
      this.a(bpu.a, new ept(aww.a($$33 * $$9.c, -$$34, $$34), 0.0, aww.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && aww.a(this.dr()) - $$0.u() == $$12.u() && aww.a(this.dx()) - $$0.w() == $$12.w()) {
         this.a_(this.dr(), this.dt() + (double)$$12.v(), this.dx());
      } else if ($$13.v() != 0 && aww.a(this.dr()) - $$0.u() == $$13.u() && aww.a(this.dx()) - $$0.w() == $$13.w()) {
         this.a_(this.dr(), this.dt() + (double)$$13.v(), this.dx());
      }

      this.s();
      ept $$35 = this.q(this.dr(), this.dt(), this.dx());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         ept $$37 = this.dp();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.g($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.dr(), $$35.d, this.dx());
      }

      int $$39 = aww.a(this.dr());
      int $$40 = aww.a(this.dx());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         ept $$41 = this.dp();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         ept $$43 = this.dp();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.g($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            ept $$46 = this.dp();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dof.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dof.a) {
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

   private boolean a(ib $$0) {
      return this.dM().a_($$0).g(this.dM(), $$0);
   }

   protected void s() {
      double $$0 = this.bP() ? 0.997 : 0.96;
      ept $$1 = this.dp();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.bc()) {
         $$1 = $$1.a(0.95F);
      }

      this.g($$1);
   }

   @Nullable
   public ept a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = aww.a($$0);
      int $$5 = aww.a($$1);
      int $$6 = aww.a($$2);
      if (this.dM().a_(new ib($$4, $$5 - 1, $$6)).a(aun.N)) {
         $$5--;
      }

      dnb $$7 = this.dM().a_(new ib($$4, $$5, $$6));
      if (czr.g($$7)) {
         dof $$8 = $$7.c(((czr)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<jg, jg> $$9 = a($$8);
         jg $$10 = (jg)$$9.getFirst();
         jg $$11 = (jg)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && aww.a($$0) - $$4 == $$10.u() && aww.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && aww.a($$0) - $$4 == $$11.u() && aww.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public ept q(double $$0, double $$1, double $$2) {
      int $$3 = aww.a($$0);
      int $$4 = aww.a($$1);
      int $$5 = aww.a($$2);
      if (this.dM().a_(new ib($$3, $$4 - 1, $$5)).a(aun.N)) {
         $$4--;
      }

      dnb $$6 = this.dM().a_(new ib($$3, $$4, $$5));
      if (czr.g($$6)) {
         dof $$7 = $$6.c(((czr)$$6.b()).c());
         Pair<jg, jg> $$8 = a($$7);
         jg $$9 = (jg)$$8.getFirst();
         jg $$10 = (jg)$$8.getSecond();
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

         return new ept($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public epo h_() {
      epo $$0 = this.cH();
      return this.A() ? $$0.g((double)Math.abs(this.y()) / 16.0) : $$0;
   }

   @Override
   protected void a(ta $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(tp.a(this.dM().a(kj.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(ta $$0) {
      if (this.A()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", tp.a(this.w()));
         $$0.a("DisplayOffset", this.y());
      }
   }

   @Override
   public void h(box $$0) {
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
                  if ($$0 instanceof ckp) {
                     double $$5 = $$0.dr() - this.dr();
                     double $$6 = $$0.dx() - this.dx();
                     ept $$7 = new ept($$5, 0.0, $$6).d();
                     ept $$8 = new ept((double)aww.b(this.dC() * (float) (Math.PI / 180.0)), 0.0, (double)aww.a(this.dC() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     ept $$10 = this.dp();
                     ept $$11 = $$0.dp();
                     if (((ckp)$$0).v() == ckp.a.c && this.v() != ckp.a.c) {
                        this.g($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.g($$11.d(0.95, 1.0, 0.95));
                     } else if (((ckp)$$0).v() != ckp.a.c && this.v() == ckp.a.c) {
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
      this.s = new ept($$0, $$1, $$2);
      this.g(this.s);
   }

   public abstract ckp.a v();

   public dnb w() {
      return !this.A() ? this.x() : dac.a(this.an().a(d));
   }

   public dnb x() {
      return dae.a.o();
   }

   public int y() {
      return !this.A() ? this.z() : this.an().a(e);
   }

   public int z() {
      return 6;
   }

   public void c(dnb $$0) {
      this.an().a(d, dac.i($$0));
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
   public cqm dz() {
      return new cqm(switch (this.v()) {
         case b -> cqp.nM;
         case c -> cqp.nN;
         case d -> cqp.nO;
         default -> cqp.nL;
         case f -> cqp.nP;
         case g -> cqp.uK;
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
