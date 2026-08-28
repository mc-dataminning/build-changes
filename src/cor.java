import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cor extends cpe {
   private static final eww c = new eww(0.0, 0.0, 0.0);
   private static final ajv<Integer> d = ajz.a(cor.class, ajx.b);
   private static final ajv<Integer> e = ajz.a(cor.class, ajx.b);
   private static final ajv<Boolean> i = ajz.a(cor.class, ajx.k);
   private static final ImmutableMap<bty, ImmutableList<Integer>> j = ImmutableMap.of(
      bty.a, ImmutableList.of(0, 1, -1), bty.f, ImmutableList.of(0, 1, -1), bty.d, ImmutableList.of(0, 1)
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
   private eww s = eww.b;
   private static final Map<due, Pair<kh, kh>> t = ad.a(Maps.newEnumMap(due.class), $$0 -> {
      kh $$1 = ji.e.q();
      kh $$2 = ji.f.q();
      kh $$3 = ji.c.q();
      kh $$4 = ji.d.q();
      kh $$5 = $$1.o();
      kh $$6 = $$2.o();
      kh $$7 = $$3.o();
      kh $$8 = $$4.o();
      $$0.put(due.a, Pair.of($$3, $$4));
      $$0.put(due.b, Pair.of($$1, $$2));
      $$0.put(due.c, Pair.of($$5, $$2));
      $$0.put(due.d, Pair.of($$1, $$6));
      $$0.put(due.e, Pair.of($$3, $$8));
      $$0.put(due.f, Pair.of($$7, $$4));
      $$0.put(due.g, Pair.of($$4, $$2));
      $$0.put(due.h, Pair.of($$4, $$1));
      $$0.put(due.i, Pair.of($$3, $$1));
      $$0.put(due.j, Pair.of($$3, $$2));
   });

   protected cor(bsw<?> $$0, dcu $$1) {
      super($$0, $$1);
      this.J = true;
   }

   protected cor(bsw<?> $$0, dcu $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static cor a(aqt $$0, double $$1, double $$2, double $$3, cor.a $$4, cuo $$5, @Nullable cmv $$6) {
      cor $$7 = (cor)(switch ($$4) {
         case b -> new coy($$0, $$1, $$2, $$3);
         case c -> new cpa($$0, $$1, $$2, $$3);
         case d -> new cpd($$0, $$1, $$2, $$3);
         case e -> new cpc($$0, $$1, $$2, $$3);
         case f -> new cpb($$0, $$1, $$2, $$3);
         case g -> new coz($$0, $$1, $$2, $$3);
         default -> new cox($$0, $$1, $$2, $$3);
      });
      bsw.<cor>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected bsq.b bc() {
      return bsq.b.c;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(d, dfw.i(dfy.a.o()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(bsq $$0) {
      return cot.a(this, $$0);
   }

   @Override
   public boolean bB() {
      return true;
   }

   @Override
   public eww a(ji.a $$0, l.a $$1) {
      return btl.k(super.a($$0, $$1));
   }

   @Override
   protected eww a(bsq $$0, bst $$1, float $$2) {
      boolean $$3 = $$0 instanceof cmi || $$0 instanceof cmo;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public eww b(btl $$0) {
      ji $$1 = this.cJ();
      if ($$1.o() == ji.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cow.a($$1);
         jd $$3 = this.dq();
         jd.a $$4 = new jd.a();
         ImmutableList<bty> $$5 = $$0.fF();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bty $$6 = (bty)$$14.next();
            bst $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dQ().a(cow.a(this.dQ(), $$4), () -> cow.a(this.dQ(), $$4.d()));
                  if (cow.a($$11)) {
                     ewr $$12 = new ewr((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     eww $$13 = eww.a($$4, $$11);
                     if (cow.a(this.dQ(), $$0, $$12.c($$13))) {
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
            bty $$15 = (bty)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = ayn.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cow.a($$4, $$17, $$0x -> this.dQ().a_($$0x).k(this.dQ(), $$0x));
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
      dta $$0 = this.dQ().a_(this.dq());
      return $$0.a(awd.N) ? 1.0F : super.aO();
   }

   @Override
   public void n(float $$0) {
      this.m(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bA() {
      return !this.dL();
   }

   private static Pair<kh, kh> a(due $$0) {
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
      if (this.dQ().B) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.av();
            this.a(this.dG(), this.dI());
         }
      } else {
         this.bb();
         int $$0 = ayn.a(this.dv());
         int $$1 = ayn.a(this.dx());
         int $$2 = ayn.a(this.dB());
         if (this.dQ().a_(new jd($$0, $$1 - 1, $$2)).a(awd.N)) {
            $$1--;
         }

         jd $$3 = new jd($$0, $$1, $$2);
         dta $$4 = this.dQ().a_($$3);
         this.l = dfl.g($$4);
         if (this.l) {
            this.c($$3, $$4);
            if ($$4.a(dfy.hh)) {
               this.a($$0, $$1, $$2, $$4.c(dlt.f));
            }
         } else {
            this.s();
         }

         this.aT();
         this.t(0.0F);
         double $$5 = this.L - this.dv();
         double $$6 = this.N - this.dB();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.s((float)(ayn.d($$6, $$5) * 180.0 / Math.PI));
            if (this.k) {
               this.s(this.dG() + 180.0F);
            }
         }

         double $$7 = (double)ayn.g(this.dG() - this.O);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.s(this.dG() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dG(), this.dI());
         if (this.v() == cor.a.a && this.dt().i() > 0.01) {
            List<bsq> $$8 = this.dQ().a(this, this.cL().c(0.2F, 0.0, 0.2F), bsv.a(this));
            if (!$$8.isEmpty()) {
               for (bsq $$9 : $$8) {
                  if (!($$9 instanceof cmv) && !($$9 instanceof cfo) && !($$9 instanceof cor) && !this.bT() && !$$9.bS()) {
                     $$9.n(this);
                  } else {
                     $$9.h(this);
                  }
               }
            }
         } else {
            for (bsq $$10 : this.dQ().a_(this, this.cL().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$10) && $$10.bB() && $$10 instanceof cor) {
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
      eww $$1 = this.dt();
      this.n(ayn.a($$1.c, -$$0, $$0), $$1.d, ayn.a($$1.e, -$$0, $$0));
      if (this.aF()) {
         this.i(this.dt().a(0.5));
      }

      this.a(btq.a, this.dt());
      if (!this.aF()) {
         this.i(this.dt().a(0.95));
      }
   }

   @Override
   protected void c(jd $$0, dta $$1) {
      this.n();
      double $$2 = this.dv();
      double $$3 = this.dx();
      double $$4 = this.dB();
      eww $$5 = this.p($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dfy.bp)) {
         $$6 = $$1.c(dlt.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.bf()) {
         $$8 *= 0.2;
      }

      eww $$9 = this.dt();
      due $$10 = $$1.c(((dfl)$$1.b()).c());
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

      $$9 = this.dt();
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
      $$9 = new eww($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.i($$9);
      bsq $$19 = this.cU();
      if ($$19 instanceof cmv) {
         eww $$20 = $$19.dt();
         double $$21 = $$20.i();
         double $$22 = this.dt().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.i(this.dt().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.dt().h();
         if ($$23 < 0.03) {
            this.i(eww.b);
         } else {
            this.i(this.dt().d(0.5, 0.0, 0.5));
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
      $$9 = this.dt();
      this.a(btq.a, new eww(ayn.a($$33 * $$9.c, -$$34, $$34), 0.0, ayn.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && ayn.a(this.dv()) - $$0.u() == $$12.u() && ayn.a(this.dB()) - $$0.w() == $$12.w()) {
         this.a_(this.dv(), this.dx() + (double)$$12.v(), this.dB());
      } else if ($$13.v() != 0 && ayn.a(this.dv()) - $$0.u() == $$13.u() && ayn.a(this.dB()) - $$0.w() == $$13.w()) {
         this.a_(this.dv(), this.dx() + (double)$$13.v(), this.dB());
      }

      this.t();
      eww $$35 = this.p(this.dv(), this.dx(), this.dB());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         eww $$37 = this.dt();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.i($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.dv(), $$35.d, this.dB());
      }

      int $$39 = ayn.a(this.dv());
      int $$40 = ayn.a(this.dB());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         eww $$41 = this.dt();
         double $$42 = $$41.h();
         this.n($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         eww $$43 = this.dt();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.i($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            eww $$46 = this.dt();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == due.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != due.a) {
                  return;
               }

               if (this.a($$0.e())) {
                  $$48 = 0.02;
               } else if (this.a($$0.f())) {
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
      return this.dQ().a_($$0).g(this.dQ(), $$0);
   }

   protected void t() {
      double $$0 = this.bT() ? 0.997 : 0.96;
      eww $$1 = this.dt();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.bf()) {
         $$1 = $$1.a(0.95F);
      }

      this.i($$1);
   }

   @Nullable
   public eww a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = ayn.a($$0);
      int $$5 = ayn.a($$1);
      int $$6 = ayn.a($$2);
      if (this.dQ().a_(new jd($$4, $$5 - 1, $$6)).a(awd.N)) {
         $$5--;
      }

      dta $$7 = this.dQ().a_(new jd($$4, $$5, $$6));
      if (dfl.g($$7)) {
         due $$8 = $$7.c(((dfl)$$7.b()).c());
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
         if ($$10.v() != 0 && ayn.a($$0) - $$4 == $$10.u() && ayn.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && ayn.a($$0) - $$4 == $$11.u() && ayn.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.p($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public eww p(double $$0, double $$1, double $$2) {
      int $$3 = ayn.a($$0);
      int $$4 = ayn.a($$1);
      int $$5 = ayn.a($$2);
      if (this.dQ().a_(new jd($$3, $$4 - 1, $$5)).a(awd.N)) {
         $$4--;
      }

      dta $$6 = this.dQ().a_(new jd($$3, $$4, $$5));
      if (dfl.g($$6)) {
         due $$7 = $$6.c(((dfl)$$6.b()).c());
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

         return new eww($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public ewr h_() {
      ewr $$0 = this.cL();
      return this.A() ? $$0.g((double)Math.abs(this.y()) / 16.0) : $$0;
   }

   @Override
   protected void a(ua $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(up.a(this.dQ().a(lu.f), $$0.p("DisplayState")));
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
   public void h(bsq $$0) {
      if (!this.dQ().B) {
         if (!$$0.ag && !this.ag) {
            if (!this.x($$0)) {
               double $$1 = $$0.dv() - this.dv();
               double $$2 = $$0.dB() - this.dB();
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
                  if ($$0 instanceof cor) {
                     double $$5 = $$0.dv() - this.dv();
                     double $$6 = $$0.dB() - this.dB();
                     eww $$7 = new eww($$5, 0.0, $$6).d();
                     eww $$8 = new eww((double)ayn.b(this.dG() * (float) (Math.PI / 180.0)), 0.0, (double)ayn.a(this.dG() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     eww $$10 = this.dt();
                     eww $$11 = $$0.dt();
                     if (((cor)$$0).v() == cor.a.c && this.v() != cor.a.c) {
                        this.i($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.i($$11.d(0.95, 1.0, 0.95));
                     } else if (((cor)$$0).v() != cor.a.c && this.v() == cor.a.c) {
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
      return this.m > 0 ? this.n : this.dv();
   }

   @Override
   public double d_() {
      return this.m > 0 ? this.o : this.dx();
   }

   @Override
   public double L_() {
      return this.m > 0 ? this.p : this.dB();
   }

   @Override
   public float M_() {
      return this.m > 0 ? (float)this.r : this.dI();
   }

   @Override
   public float e_() {
      return this.m > 0 ? (float)this.q : this.dG();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new eww($$0, $$1, $$2);
      this.i(this.s);
   }

   public abstract cor.a v();

   public dta w() {
      return !this.A() ? this.x() : dfw.a(this.ar().a(d));
   }

   public dta x() {
      return dfy.a.o();
   }

   public int y() {
      return !this.A() ? this.z() : this.ar().a(e);
   }

   public int z() {
      return 6;
   }

   public void c(dta $$0) {
      this.ar().a(d, dfw.i($$0));
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
   public cuo dD() {
      return new cuo(switch (this.v()) {
         case b -> cur.nN;
         case c -> cur.nO;
         case d -> cur.nP;
         default -> cur.nM;
         case f -> cur.nQ;
         case g -> cur.uM;
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
