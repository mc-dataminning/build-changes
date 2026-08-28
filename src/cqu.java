import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class cqu extends cqm {
   private static final double b = 0.01;
   private int c;
   private double d;
   private double e;
   private double f;
   private double g;
   private double h;
   private ezh i = ezh.c;

   public cqu(cqf $$0) {
      super($$0);
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = (double)$$3;
      this.h = (double)$$4;
      this.c = $$5 + 2;
      this.a(this.i);
   }

   @Override
   public double a() {
      return this.c > 0 ? this.d : this.a.dC();
   }

   @Override
   public double b() {
      return this.c > 0 ? this.e : this.a.dE();
   }

   @Override
   public double c() {
      return this.c > 0 ? this.f : this.a.dI();
   }

   @Override
   public float d() {
      return this.c > 0 ? (float)this.h : this.o();
   }

   @Override
   public float e() {
      return this.c > 0 ? (float)this.g : this.p();
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.i = new ezh($$0, $$1, $$2);
      this.a(this.i);
   }

   @Override
   public void f() {
      if (this.g().C) {
         if (this.c > 0) {
            this.a.a(this.c, this.d, this.e, this.f, this.g, this.h);
            this.c--;
         } else {
            this.a.az();
            this.a(this.o() % 360.0F);
            this.b(this.p() % 360.0F);
         }
      } else {
         this.a.bg();
         jg $$0 = this.a.q();
         dvd $$1 = this.g().a_($$0);
         boolean $$2 = dhn.h($$1);
         this.a.a($$2);
         if ($$2) {
            this.h();
            if ($$1.a(dia.hh)) {
               this.a.a($$0.u(), $$0.v(), $$0.w(), $$1.c(dnu.f));
            }
         } else {
            this.a.w();
         }

         this.a.aK();
         this.a(0.0F);
         double $$3 = this.a.L - this.l();
         double $$4 = this.a.N - this.n();
         if ($$3 * $$3 + $$4 * $$4 > 0.001) {
            this.b((float)(azj.d($$4, $$3) * 180.0 / Math.PI));
            if (this.a.x()) {
               this.b(this.p() + 180.0F);
            }
         }

         double $$5 = (double)azj.h(this.p() - this.a.O);
         if ($$5 < -170.0 || $$5 >= 170.0) {
            this.b(this.p() + 180.0F);
            this.a.b(!this.a.x());
         }

         this.a(this.o() % 360.0F);
         this.b(this.p() % 360.0F);
         this.i();
      }
   }

   @Override
   public void h() {
      jg $$0 = this.a.q();
      dvd $$1 = this.g().a_($$0);
      this.a.n();
      double $$2 = this.a.dC();
      double $$3 = this.a.dE();
      double $$4 = this.a.dI();
      ezh $$5 = this.d($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dia.bp)) {
         $$6 = $$1.c(dnu.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.a.bk()) {
         $$8 *= 0.2;
      }

      ezh $$9 = this.j();
      dwh $$10 = $$1.c(((dhn)$$1.b()).c());
      switch ($$10) {
         case c:
            this.a($$9.b(-$$8, 0.0, 0.0));
            $$3++;
            break;
         case d:
            this.a($$9.b($$8, 0.0, 0.0));
            $$3++;
            break;
         case e:
            this.a($$9.b(0.0, 0.0, $$8));
            $$3++;
            break;
         case f:
            this.a($$9.b(0.0, 0.0, -$$8));
            $$3++;
      }

      $$9 = this.j();
      Pair<kk, kk> $$11 = cqf.a($$10);
      kk $$12 = (kk)$$11.getFirst();
      kk $$13 = (kk)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.d * $$14 + $$9.f * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.i());
      $$9 = new ezh($$18 * $$14 / $$16, $$9.e, $$18 * $$15 / $$16);
      this.a($$9);
      btz $$19 = this.a.db();
      ezh $$21;
      if (this.a.db() instanceof arn $$20) {
         $$21 = $$20.ak();
      } else {
         $$21 = ezh.c;
      }

      if ($$19 instanceof coh && $$21.h() > 0.0) {
         ezh $$23 = $$21.d();
         double $$24 = this.j().j();
         if ($$23.h() > 0.0 && $$24 < 0.01) {
            this.a(this.j().b($$21.d * 0.001, 0.0, $$21.f * 0.001));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$25 = this.j().i();
         if ($$25 < 0.03) {
            this.a(ezh.c);
         } else {
            this.a(this.j().d(0.5, 0.0, 0.5));
         }
      }

      double $$26 = (double)$$0.u() + 0.5 + (double)$$12.u() * 0.5;
      double $$27 = (double)$$0.w() + 0.5 + (double)$$12.w() * 0.5;
      double $$28 = (double)$$0.u() + 0.5 + (double)$$13.u() * 0.5;
      double $$29 = (double)$$0.w() + 0.5 + (double)$$13.w() * 0.5;
      $$14 = $$28 - $$26;
      $$15 = $$29 - $$27;
      double $$30;
      if ($$14 == 0.0) {
         $$30 = $$4 - (double)$$0.w();
      } else if ($$15 == 0.0) {
         $$30 = $$2 - (double)$$0.u();
      } else {
         double $$32 = $$2 - $$26;
         double $$33 = $$4 - $$27;
         $$30 = ($$32 * $$14 + $$33 * $$15) * 2.0;
      }

      $$2 = $$26 + $$14 * $$30;
      $$4 = $$27 + $$15 * $$30;
      this.c($$2, $$3, $$4);
      double $$35 = this.a.cb() ? 0.75 : 1.0;
      double $$36 = this.a.t();
      $$9 = this.j();
      this.a.a(buz.a, new ezh(azj.a($$35 * $$9.d, -$$36, $$36), 0.0, azj.a($$35 * $$9.f, -$$36, $$36)));
      if ($$12.v() != 0 && azj.a(this.a.dC()) - $$0.u() == $$12.u() && azj.a(this.a.dI()) - $$0.w() == $$12.w()) {
         this.c(this.a.dC(), this.a.dE() + (double)$$12.v(), this.a.dI());
      } else if ($$13.v() != 0 && azj.a(this.a.dC()) - $$0.u() == $$13.u() && azj.a(this.a.dI()) - $$0.w() == $$13.w()) {
         this.c(this.a.dC(), this.a.dE() + (double)$$13.v(), this.a.dI());
      }

      this.a(this.a.a(this.j()));
      ezh $$37 = this.d(this.a.dC(), this.a.dE(), this.a.dI());
      if ($$37 != null && $$5 != null) {
         double $$38 = ($$5.e - $$37.e) * 0.05;
         ezh $$39 = this.j();
         double $$40 = $$39.i();
         if ($$40 > 0.0) {
            this.a($$39.d(($$40 + $$38) / $$40, 1.0, ($$40 + $$38) / $$40));
         }

         this.c(this.a.dC(), $$37.e, this.a.dI());
      }

      int $$41 = azj.a(this.a.dC());
      int $$42 = azj.a(this.a.dI());
      if ($$41 != $$0.u() || $$42 != $$0.w()) {
         ezh $$43 = this.j();
         double $$44 = $$43.i();
         this.b($$44 * (double)($$41 - $$0.u()), $$43.e, $$44 * (double)($$42 - $$0.w()));
      }

      if ($$6) {
         ezh $$45 = this.j();
         double $$46 = $$45.i();
         if ($$46 > 0.01) {
            double $$47 = 0.06;
            this.a($$45.b($$45.d / $$46 * 0.06, 0.0, $$45.f / $$46 * 0.06));
         } else {
            ezh $$48 = this.j();
            double $$49 = $$48.d;
            double $$50 = $$48.f;
            if ($$10 == dwh.b) {
               if (this.a.b($$0.h())) {
                  $$49 = 0.02;
               } else if (this.a.b($$0.i())) {
                  $$49 = -0.02;
               }
            } else {
               if ($$10 != dwh.a) {
                  return;
               }

               if (this.a.b($$0.f())) {
                  $$50 = 0.02;
               } else if (this.a.b($$0.g())) {
                  $$50 = -0.02;
               }
            }

            this.b($$49, $$48.e, $$50);
         }
      }
   }

   @Nullable
   public ezh a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = azj.a($$0);
      int $$5 = azj.a($$1);
      int $$6 = azj.a($$2);
      if (this.g().a_(new jg($$4, $$5 - 1, $$6)).a(awz.O)) {
         $$5--;
      }

      dvd $$7 = this.g().a_(new jg($$4, $$5, $$6));
      if (dhn.h($$7)) {
         dwh $$8 = $$7.c(((dhn)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<kk, kk> $$9 = cqf.a($$8);
         kk $$10 = (kk)$$9.getFirst();
         kk $$11 = (kk)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && azj.a($$0) - $$4 == $$10.u() && azj.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && azj.a($$0) - $$4 == $$11.u() && azj.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.d($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public ezh d(double $$0, double $$1, double $$2) {
      int $$3 = azj.a($$0);
      int $$4 = azj.a($$1);
      int $$5 = azj.a($$2);
      if (this.g().a_(new jg($$3, $$4 - 1, $$5)).a(awz.O)) {
         $$4--;
      }

      dvd $$6 = this.g().a_(new jg($$3, $$4, $$5));
      if (dhn.h($$6)) {
         dwh $$7 = $$6.c(((dhn)$$6.b()).c());
         Pair<kk, kk> $$8 = cqf.a($$7);
         kk $$9 = (kk)$$8.getFirst();
         kk $$10 = (kk)$$8.getSecond();
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

         return new ezh($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public double a(jg $$0, dwh $$1, double $$2) {
      return 0.0;
   }

   @Override
   public boolean i() {
      ezc $$0 = this.a.cS().c(0.2F, 0.0, 0.2F);
      if (this.a.y() == cqf.a.a && this.j().j() >= 0.01) {
         List<btz> $$1 = this.g().a(this.a, $$0, bue.a(this.a));
         if (!$$1.isEmpty()) {
            for (btz $$2 : $$1) {
               if (!($$2 instanceof coh) && !($$2 instanceof cgy) && !($$2 instanceof cqf) && !this.a.cb() && !$$2.ca()) {
                  $$2.n(this.a);
               } else {
                  $$2.h(this.a);
               }
            }
         }
      } else {
         for (btz $$3 : this.g().a_(this.a, $$0)) {
            if (!this.a.y($$3) && $$3.bJ() && $$3 instanceof cqf) {
               $$3.h(this.a);
            }
         }
      }

      return false;
   }

   @Override
   public jl q() {
      return this.a.x() ? this.a.cP().g().h() : this.a.cP().h();
   }

   @Override
   public ezh c(ezh $$0) {
      double $$1 = this.a.t();
      return new ezh(azj.a($$0.d, -$$1, $$1), $$0.e, azj.a($$0.f, -$$1, $$1));
   }

   @Override
   public double r() {
      return (this.a.bk() ? 4.0 : 8.0) / 20.0;
   }

   @Override
   public double s() {
      return this.a.cb() ? 0.997 : 0.96;
   }
}
