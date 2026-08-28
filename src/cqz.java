import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class cqz extends cqr {
   private static final double b = 0.01;
   private int c;
   private double d;
   private double e;
   private double f;
   private double g;
   private double h;
   private ezn i = ezn.c;

   public cqz(cqk $$0) {
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
      this.i = new ezn($$0, $$1, $$2);
      this.a(this.i);
   }

   @Override
   public void f() {
      if (this.g().C) {
         if (this.c > 0) {
            this.a.a(this.c, this.d, this.e, this.f, this.g, this.h);
            this.c--;
         } else {
            this.a.aA();
            this.a(this.o() % 360.0F);
            this.b(this.p() % 360.0F);
         }
      } else {
         this.a.bg();
         jh $$0 = this.a.q();
         dvj $$1 = this.g().a_($$0);
         boolean $$2 = dht.h($$1);
         this.a.a($$2);
         if ($$2) {
            this.h();
            if ($$1.a(dig.hh)) {
               this.a.a($$0.u(), $$0.v(), $$0.w(), $$1.c(doa.f));
            }
         } else {
            this.a.w();
         }

         this.a.aL();
         this.a(0.0F);
         double $$3 = this.a.L - this.l();
         double $$4 = this.a.N - this.n();
         if ($$3 * $$3 + $$4 * $$4 > 0.001) {
            this.b((float)(azk.d($$4, $$3) * 180.0 / Math.PI));
            if (this.a.x()) {
               this.b(this.p() + 180.0F);
            }
         }

         double $$5 = (double)azk.h(this.p() - this.a.O);
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
      jh $$0 = this.a.q();
      dvj $$1 = this.g().a_($$0);
      this.a.n();
      double $$2 = this.a.dC();
      double $$3 = this.a.dE();
      double $$4 = this.a.dI();
      ezn $$5 = this.d($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dig.bp)) {
         $$6 = $$1.c(doa.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.a.bk()) {
         $$8 *= 0.2;
      }

      ezn $$9 = this.j();
      dwn $$10 = $$1.c(((dht)$$1.b()).c());
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
      Pair<kl, kl> $$11 = cqk.a($$10);
      kl $$12 = (kl)$$11.getFirst();
      kl $$13 = (kl)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.d * $$14 + $$9.f * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.i());
      $$9 = new ezn($$18 * $$14 / $$16, $$9.e, $$18 * $$15 / $$16);
      this.a($$9);
      bue $$19 = this.a.db();
      ezn $$21;
      if (this.a.db() instanceof aro $$20) {
         $$21 = $$20.ak();
      } else {
         $$21 = ezn.c;
      }

      if ($$19 instanceof com && $$21.h() > 0.0) {
         ezn $$23 = $$21.d();
         double $$24 = this.j().j();
         if ($$23.h() > 0.0 && $$24 < 0.01) {
            this.a(this.j().b($$21.d * 0.001, 0.0, $$21.f * 0.001));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$25 = this.j().i();
         if ($$25 < 0.03) {
            this.a(ezn.c);
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
      this.a.a(bve.a, new ezn(azk.a($$35 * $$9.d, -$$36, $$36), 0.0, azk.a($$35 * $$9.f, -$$36, $$36)));
      if ($$12.v() != 0 && azk.a(this.a.dC()) - $$0.u() == $$12.u() && azk.a(this.a.dI()) - $$0.w() == $$12.w()) {
         this.c(this.a.dC(), this.a.dE() + (double)$$12.v(), this.a.dI());
      } else if ($$13.v() != 0 && azk.a(this.a.dC()) - $$0.u() == $$13.u() && azk.a(this.a.dI()) - $$0.w() == $$13.w()) {
         this.c(this.a.dC(), this.a.dE() + (double)$$13.v(), this.a.dI());
      }

      this.a(this.a.a(this.j()));
      ezn $$37 = this.d(this.a.dC(), this.a.dE(), this.a.dI());
      if ($$37 != null && $$5 != null) {
         double $$38 = ($$5.e - $$37.e) * 0.05;
         ezn $$39 = this.j();
         double $$40 = $$39.i();
         if ($$40 > 0.0) {
            this.a($$39.d(($$40 + $$38) / $$40, 1.0, ($$40 + $$38) / $$40));
         }

         this.c(this.a.dC(), $$37.e, this.a.dI());
      }

      int $$41 = azk.a(this.a.dC());
      int $$42 = azk.a(this.a.dI());
      if ($$41 != $$0.u() || $$42 != $$0.w()) {
         ezn $$43 = this.j();
         double $$44 = $$43.i();
         this.b($$44 * (double)($$41 - $$0.u()), $$43.e, $$44 * (double)($$42 - $$0.w()));
      }

      if ($$6) {
         ezn $$45 = this.j();
         double $$46 = $$45.i();
         if ($$46 > 0.01) {
            double $$47 = 0.06;
            this.a($$45.b($$45.d / $$46 * 0.06, 0.0, $$45.f / $$46 * 0.06));
         } else {
            ezn $$48 = this.j();
            double $$49 = $$48.d;
            double $$50 = $$48.f;
            if ($$10 == dwn.b) {
               if (this.a.b($$0.h())) {
                  $$49 = 0.02;
               } else if (this.a.b($$0.i())) {
                  $$49 = -0.02;
               }
            } else {
               if ($$10 != dwn.a) {
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
   public ezn a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = azk.a($$0);
      int $$5 = azk.a($$1);
      int $$6 = azk.a($$2);
      if (this.g().a_(new jh($$4, $$5 - 1, $$6)).a(axa.O)) {
         $$5--;
      }

      dvj $$7 = this.g().a_(new jh($$4, $$5, $$6));
      if (dht.h($$7)) {
         dwn $$8 = $$7.c(((dht)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<kl, kl> $$9 = cqk.a($$8);
         kl $$10 = (kl)$$9.getFirst();
         kl $$11 = (kl)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && azk.a($$0) - $$4 == $$10.u() && azk.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && azk.a($$0) - $$4 == $$11.u() && azk.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.d($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public ezn d(double $$0, double $$1, double $$2) {
      int $$3 = azk.a($$0);
      int $$4 = azk.a($$1);
      int $$5 = azk.a($$2);
      if (this.g().a_(new jh($$3, $$4 - 1, $$5)).a(axa.O)) {
         $$4--;
      }

      dvj $$6 = this.g().a_(new jh($$3, $$4, $$5));
      if (dht.h($$6)) {
         dwn $$7 = $$6.c(((dht)$$6.b()).c());
         Pair<kl, kl> $$8 = cqk.a($$7);
         kl $$9 = (kl)$$8.getFirst();
         kl $$10 = (kl)$$8.getSecond();
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

         return new ezn($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public double a(jh $$0, dwn $$1, double $$2) {
      return 0.0;
   }

   @Override
   public boolean i() {
      ezi $$0 = this.a.cS().c(0.2F, 0.0, 0.2F);
      if (this.a.y() == cqk.a.a && this.j().j() >= 0.01) {
         List<bue> $$1 = this.g().a(this.a, $$0, buj.a(this.a));
         if (!$$1.isEmpty()) {
            for (bue $$2 : $$1) {
               if (!($$2 instanceof com) && !($$2 instanceof chd) && !($$2 instanceof cqk) && !this.a.cb() && !$$2.ca()) {
                  $$2.n(this.a);
               } else {
                  $$2.h(this.a);
               }
            }
         }
      } else {
         for (bue $$3 : this.g().a_(this.a, $$0)) {
            if (!this.a.y($$3) && $$3.bJ() && $$3 instanceof cqk) {
               $$3.h(this.a);
            }
         }
      }

      return false;
   }

   @Override
   public jm q() {
      return this.a.x() ? this.a.cP().g().h() : this.a.cP().h();
   }

   @Override
   public ezn c(ezn $$0) {
      double $$1 = this.a.t();
      return new ezn(azk.a($$0.d, -$$1, $$1), $$0.e, azk.a($$0.f, -$$1, $$1));
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
