import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class cva extends cus {
   private static final double b = 0.01;
   private static final double c = 0.2;
   private static final double d = 0.4;
   private static final double e = 0.4;
   private final bxp f;
   private ffq g = ffq.c;

   public cva(cuk $$0) {
      super($$0);
      this.f = new bxp($$0, this::a);
   }

   @Override
   public bxp a() {
      return this.f;
   }

   public void a(bxp $$0) {
      this.a(this.g);
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.g = new ffq($$0, $$1, $$2);
      this.a(this.g);
   }

   @Override
   public void b() {
      if (this.c() instanceof ars $$0) {
         this.a.be();
         iv var11 = this.a.j();
         ebe $$3 = this.c().a_(var11);
         boolean $$4 = dmr.h($$3);
         this.a.a($$4);
         if ($$4) {
            this.a($$0);
            if ($$3.a(dne.hI)) {
               this.a.a(var11.u(), var11.v(), var11.w(), $$3.c(dtf.d));
            }
         } else {
            this.a.e($$0);
         }

         this.a.aI();
         this.a(0.0F);
         double $$5 = this.a.K - this.g();
         double $$6 = this.a.M - this.i();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.b((float)(azo.d($$6, $$5) * 180.0 / Math.PI));
            if (this.a.m()) {
               this.b(this.k() + 180.0F);
            }
         }

         double $$7 = (double)azo.h(this.k() - this.a.N);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.b(this.k() + 180.0F);
            this.a.b(!this.a.m());
         }

         this.a(this.j() % 360.0F);
         this.b(this.k() % 360.0F);
         this.d();
      } else {
         if (this.f.d()) {
            this.f.e();
         } else {
            this.a.av();
            this.a(this.j() % 360.0F);
            this.b(this.k() % 360.0F);
         }
      }
   }

   @Override
   public void a(ars $$0) {
      iv $$1 = this.a.j();
      ebe $$2 = this.c().a_($$1);
      this.a.k();
      double $$3 = this.a.dA();
      double $$4 = this.a.dC();
      double $$5 = this.a.dG();
      ffq $$6 = this.d($$3, $$4, $$5);
      $$4 = (double)$$1.v();
      boolean $$7 = false;
      boolean $$8 = false;
      if ($$2.a(dne.bw)) {
         $$7 = $$2.c(dtf.d);
         $$8 = !$$7;
      }

      double $$9 = 0.0078125;
      if (this.a.bi()) {
         $$9 *= 0.2;
      }

      ffq $$10 = this.e();
      eci $$11 = $$2.c(((dmr)$$2.b()).c());
      switch ($$11) {
         case c:
            this.a($$10.b(-$$9, 0.0, 0.0));
            $$4++;
            break;
         case d:
            this.a($$10.b($$9, 0.0, 0.0));
            $$4++;
            break;
         case e:
            this.a($$10.b(0.0, 0.0, $$9));
            $$4++;
            break;
         case f:
            this.a($$10.b(0.0, 0.0, -$$9));
            $$4++;
      }

      $$10 = this.e();
      Pair<ka, ka> $$12 = cuk.a($$11);
      ka $$13 = (ka)$$12.getFirst();
      ka $$14 = (ka)$$12.getSecond();
      double $$15 = (double)($$14.u() - $$13.u());
      double $$16 = (double)($$14.w() - $$13.w());
      double $$17 = Math.sqrt($$15 * $$15 + $$16 * $$16);
      double $$18 = $$10.d * $$15 + $$10.f * $$16;
      if ($$18 < 0.0) {
         $$15 = -$$15;
         $$16 = -$$16;
      }

      double $$19 = Math.min(2.0, $$10.i());
      $$10 = new ffq($$19 * $$15 / $$17, $$10.e, $$19 * $$16 / $$17);
      this.a($$10);
      bwt $$20 = this.a.cZ();
      ffq $$22;
      if (this.a.cZ() instanceof art $$21) {
         $$22 = $$21.ag();
      } else {
         $$22 = ffq.c;
      }

      if ($$20 instanceof crx && $$22.h() > 0.0) {
         ffq $$24 = $$22.d();
         double $$25 = this.e().j();
         if ($$24.h() > 0.0 && $$25 < 0.01) {
            this.a(this.e().b($$22.d * 0.001, 0.0, $$22.f * 0.001));
            $$8 = false;
         }
      }

      if ($$8) {
         double $$26 = this.e().i();
         if ($$26 < 0.03) {
            this.a(ffq.c);
         } else {
            this.a(this.e().d(0.5, 0.0, 0.5));
         }
      }

      double $$27 = (double)$$1.u() + 0.5 + (double)$$13.u() * 0.5;
      double $$28 = (double)$$1.w() + 0.5 + (double)$$13.w() * 0.5;
      double $$29 = (double)$$1.u() + 0.5 + (double)$$14.u() * 0.5;
      double $$30 = (double)$$1.w() + 0.5 + (double)$$14.w() * 0.5;
      $$15 = $$29 - $$27;
      $$16 = $$30 - $$28;
      double $$31;
      if ($$15 == 0.0) {
         $$31 = $$5 - (double)$$1.w();
      } else if ($$16 == 0.0) {
         $$31 = $$3 - (double)$$1.u();
      } else {
         double $$33 = $$3 - $$27;
         double $$34 = $$5 - $$28;
         $$31 = ($$33 * $$15 + $$34 * $$16) * 2.0;
      }

      $$3 = $$27 + $$15 * $$31;
      $$5 = $$28 + $$16 * $$31;
      this.c($$3, $$4, $$5);
      double $$36 = this.a.bZ() ? 0.75 : 1.0;
      double $$37 = this.a.a($$0);
      $$10 = this.e();
      this.a.a(bxy.a, new ffq(azo.a($$36 * $$10.d, -$$37, $$37), 0.0, azo.a($$36 * $$10.f, -$$37, $$37)));
      if ($$13.v() != 0 && azo.a(this.a.dA()) - $$1.u() == $$13.u() && azo.a(this.a.dG()) - $$1.w() == $$13.w()) {
         this.c(this.a.dA(), this.a.dC() + (double)$$13.v(), this.a.dG());
      } else if ($$14.v() != 0 && azo.a(this.a.dA()) - $$1.u() == $$14.u() && azo.a(this.a.dG()) - $$1.w() == $$14.w()) {
         this.c(this.a.dA(), this.a.dC() + (double)$$14.v(), this.a.dG());
      }

      this.a(this.a.a(this.e()));
      ffq $$38 = this.d(this.a.dA(), this.a.dC(), this.a.dG());
      if ($$38 != null && $$6 != null) {
         double $$39 = ($$6.e - $$38.e) * 0.05;
         ffq $$40 = this.e();
         double $$41 = $$40.i();
         if ($$41 > 0.0) {
            this.a($$40.d(($$41 + $$39) / $$41, 1.0, ($$41 + $$39) / $$41));
         }

         this.c(this.a.dA(), $$38.e, this.a.dG());
      }

      int $$42 = azo.a(this.a.dA());
      int $$43 = azo.a(this.a.dG());
      if ($$42 != $$1.u() || $$43 != $$1.w()) {
         ffq $$44 = this.e();
         double $$45 = $$44.i();
         this.b($$45 * (double)($$42 - $$1.u()), $$44.e, $$45 * (double)($$43 - $$1.w()));
      }

      if ($$7) {
         ffq $$46 = this.e();
         double $$47 = $$46.i();
         if ($$47 > 0.01) {
            double $$48 = 0.06;
            this.a($$46.b($$46.d / $$47 * 0.06, 0.0, $$46.f / $$47 * 0.06));
         } else {
            ffq $$49 = this.e();
            double $$50 = $$49.d;
            double $$51 = $$49.f;
            if ($$11 == eci.b) {
               if (this.a.b($$1.h())) {
                  $$50 = 0.02;
               } else if (this.a.b($$1.i())) {
                  $$50 = -0.02;
               }
            } else {
               if ($$11 != eci.a) {
                  return;
               }

               if (this.a.b($$1.f())) {
                  $$51 = 0.02;
               } else if (this.a.b($$1.g())) {
                  $$51 = -0.02;
               }
            }

            this.b($$50, $$49.e, $$51);
         }
      }
   }

   @Nullable
   public ffq a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = azo.a($$0);
      int $$5 = azo.a($$1);
      int $$6 = azo.a($$2);
      if (this.c().a_(new iv($$4, $$5 - 1, $$6)).a(axe.P)) {
         $$5--;
      }

      ebe $$7 = this.c().a_(new iv($$4, $$5, $$6));
      if (dmr.h($$7)) {
         eci $$8 = $$7.c(((dmr)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<ka, ka> $$9 = cuk.a($$8);
         ka $$10 = (ka)$$9.getFirst();
         ka $$11 = (ka)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && azo.a($$0) - $$4 == $$10.u() && azo.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && azo.a($$0) - $$4 == $$11.u() && azo.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.d($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public ffq d(double $$0, double $$1, double $$2) {
      int $$3 = azo.a($$0);
      int $$4 = azo.a($$1);
      int $$5 = azo.a($$2);
      if (this.c().a_(new iv($$3, $$4 - 1, $$5)).a(axe.P)) {
         $$4--;
      }

      ebe $$6 = this.c().a_(new iv($$3, $$4, $$5));
      if (dmr.h($$6)) {
         eci $$7 = $$6.c(((dmr)$$6.b()).c());
         Pair<ka, ka> $$8 = cuk.a($$7);
         ka $$9 = (ka)$$8.getFirst();
         ka $$10 = (ka)$$8.getSecond();
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

         return new ffq($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public double a(iv $$0, eci $$1, double $$2) {
      return 0.0;
   }

   @Override
   public boolean d() {
      ffl $$0 = this.a.cR().c(0.2F, 0.0, 0.2F);
      if (this.a.y() && this.e().j() >= 0.01) {
         List<bwt> $$1 = this.c().a(this.a, $$0, bxa.a(this.a));
         if (!$$1.isEmpty()) {
            for (bwt $$2 : $$1) {
               if (!($$2 instanceof crx) && !($$2 instanceof cka) && !($$2 instanceof cuk) && !this.a.bZ() && !$$2.bY()) {
                  $$2.n(this.a);
               } else {
                  $$2.h(this.a);
               }
            }
         }
      } else {
         for (bwt $$3 : this.c().a_(this.a, $$0)) {
            if (!this.a.y($$3) && $$3.bG() && $$3 instanceof cuk) {
               $$3.h(this.a);
            }
         }
      }

      return false;
   }

   @Override
   public jb l() {
      return this.a.m() ? this.a.cO().g().h() : this.a.cO().h();
   }

   @Override
   public ffq c(ffq $$0) {
      return !Double.isNaN($$0.d) && !Double.isNaN($$0.e) && !Double.isNaN($$0.f) ? new ffq(azo.a($$0.d, -0.4, 0.4), $$0.e, azo.a($$0.f, -0.4, 0.4)) : ffq.c;
   }

   @Override
   public double b(ars $$0) {
      return this.a.bi() ? 0.2 : 0.4;
   }

   @Override
   public double m() {
      return this.a.bZ() ? 0.997 : 0.96;
   }
}
