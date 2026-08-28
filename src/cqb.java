import com.mojang.datafixers.util.Pair;
import javax.annotation.Nullable;

public class cqb extends cpt {
   private static final double b = 0.01;
   private int c;
   private double d;
   private double e;
   private double f;
   private double g;
   private double h;
   private eye i = eye.c;

   public cqb(cpm $$0) {
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
      return this.c > 0 ? this.d : this.a.dx();
   }

   @Override
   public double b() {
      return this.c > 0 ? this.e : this.a.dz();
   }

   @Override
   public double c() {
      return this.c > 0 ? this.f : this.a.dD();
   }

   @Override
   public float d() {
      return this.c > 0 ? (float)this.h : this.n();
   }

   @Override
   public float e() {
      return this.c > 0 ? (float)this.g : this.o();
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.i = new eye($$0, $$1, $$2);
      this.a(this.i);
   }

   @Override
   public void f() {
      if (this.g().B) {
         if (this.c > 0) {
            this.a.a(this.c, this.d, this.e, this.f, this.g, this.h);
            this.c--;
         } else {
            this.a.ax();
            this.a(this.n() % 360.0F);
            this.b(this.o() % 360.0F);
         }
      } else {
         this.a.be();
         je $$0 = this.a.o();
         dua $$1 = this.g().a_($$0);
         boolean $$2 = dgk.h($$1);
         this.a.a($$2);
         if ($$2) {
            this.h();
            if ($$1.a(dgx.hh)) {
               this.a.a($$0.u(), $$0.v(), $$0.w(), $$1.c(dms.f));
            }
         } else {
            this.a.v();
         }

         this.a.aI();
         this.a(0.0F);
         double $$3 = this.a.L - this.k();
         double $$4 = this.a.N - this.m();
         if ($$3 * $$3 + $$4 * $$4 > 0.001) {
            this.b((float)(azc.d($$4, $$3) * 180.0 / Math.PI));
            if (this.a.w()) {
               this.b(this.o() + 180.0F);
            }
         }

         double $$5 = (double)azc.g(this.o() - this.a.O);
         if ($$5 < -170.0 || $$5 >= 170.0) {
            this.b(this.o() + 180.0F);
            this.a.b(!this.a.w());
         }

         this.a(this.n() % 360.0F);
         this.b(this.o() % 360.0F);
         this.a.a(this.a.cO().c(0.2F, 0.0, 0.2F), 0.01);
      }
   }

   @Override
   public void h() {
      je $$0 = this.a.o();
      dua $$1 = this.g().a_($$0);
      this.a.n();
      double $$2 = this.a.dx();
      double $$3 = this.a.dz();
      double $$4 = this.a.dD();
      eye $$5 = this.d($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dgx.bp)) {
         $$6 = $$1.c(dms.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.a.bi()) {
         $$8 *= 0.2;
      }

      eye $$9 = this.i();
      dve $$10 = $$1.c(((dgk)$$1.b()).c());
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

      $$9 = this.i();
      Pair<ki, ki> $$11 = cpm.a($$10);
      ki $$12 = (ki)$$11.getFirst();
      ki $$13 = (ki)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.d * $$14 + $$9.f * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.i());
      $$9 = new eye($$18 * $$14 / $$16, $$9.e, $$18 * $$15 / $$16);
      this.a($$9);
      btj $$19 = this.a.cX();
      eye $$20 = this.a.D();
      if ($$19 instanceof cnp && $$20.h() > 0.0) {
         eye $$21 = $$20.d();
         double $$22 = this.i().j();
         if ($$21.h() > 0.0 && $$22 < 0.01) {
            this.a(this.i().b($$20.d * 0.001, 0.0, $$20.f * 0.001));
            $$7 = false;
         }
      } else {
         this.a.j(eye.c);
      }

      if ($$7) {
         double $$23 = this.i().i();
         if ($$23 < 0.03) {
            this.a(eye.c);
         } else {
            this.a(this.i().d(0.5, 0.0, 0.5));
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
      this.c($$2, $$3, $$4);
      double $$33 = this.a.bX() ? 0.75 : 1.0;
      double $$34 = this.a.q();
      $$9 = this.i();
      this.a.a(buj.a, new eye(azc.a($$33 * $$9.d, -$$34, $$34), 0.0, azc.a($$33 * $$9.f, -$$34, $$34)));
      if ($$12.v() != 0 && azc.a(this.a.dx()) - $$0.u() == $$12.u() && azc.a(this.a.dD()) - $$0.w() == $$12.w()) {
         this.c(this.a.dx(), this.a.dz() + (double)$$12.v(), this.a.dD());
      } else if ($$13.v() != 0 && azc.a(this.a.dx()) - $$0.u() == $$13.u() && azc.a(this.a.dD()) - $$0.w() == $$13.w()) {
         this.c(this.a.dx(), this.a.dz() + (double)$$13.v(), this.a.dD());
      }

      this.a(this.a.a(this.i()));
      eye $$35 = this.d(this.a.dx(), this.a.dz(), this.a.dD());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.e - $$35.e) * 0.05;
         eye $$37 = this.i();
         double $$38 = $$37.i();
         if ($$38 > 0.0) {
            this.a($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.c(this.a.dx(), $$35.e, this.a.dD());
      }

      int $$39 = azc.a(this.a.dx());
      int $$40 = azc.a(this.a.dD());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         eye $$41 = this.i();
         double $$42 = $$41.i();
         this.b($$42 * (double)($$39 - $$0.u()), $$41.e, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         eye $$43 = this.i();
         double $$44 = $$43.i();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.a($$43.b($$43.d / $$44 * 0.06, 0.0, $$43.f / $$44 * 0.06));
         } else {
            eye $$46 = this.i();
            double $$47 = $$46.d;
            double $$48 = $$46.f;
            if ($$10 == dve.b) {
               if (this.a.b($$0.h())) {
                  $$47 = 0.02;
               } else if (this.a.b($$0.i())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dve.a) {
                  return;
               }

               if (this.a.b($$0.f())) {
                  $$48 = 0.02;
               } else if (this.a.b($$0.g())) {
                  $$48 = -0.02;
               }
            }

            this.b($$47, $$46.e, $$48);
         }
      }
   }

   @Nullable
   public eye a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = azc.a($$0);
      int $$5 = azc.a($$1);
      int $$6 = azc.a($$2);
      if (this.g().a_(new je($$4, $$5 - 1, $$6)).a(aws.O)) {
         $$5--;
      }

      dua $$7 = this.g().a_(new je($$4, $$5, $$6));
      if (dgk.h($$7)) {
         dve $$8 = $$7.c(((dgk)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<ki, ki> $$9 = cpm.a($$8);
         ki $$10 = (ki)$$9.getFirst();
         ki $$11 = (ki)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && azc.a($$0) - $$4 == $$10.u() && azc.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && azc.a($$0) - $$4 == $$11.u() && azc.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.d($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public eye d(double $$0, double $$1, double $$2) {
      int $$3 = azc.a($$0);
      int $$4 = azc.a($$1);
      int $$5 = azc.a($$2);
      if (this.g().a_(new je($$3, $$4 - 1, $$5)).a(aws.O)) {
         $$4--;
      }

      dua $$6 = this.g().a_(new je($$3, $$4, $$5));
      if (dgk.h($$6)) {
         dve $$7 = $$6.c(((dgk)$$6.b()).c());
         Pair<ki, ki> $$8 = cpm.a($$7);
         ki $$9 = (ki)$$8.getFirst();
         ki $$10 = (ki)$$8.getSecond();
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

         return new eye($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public double a(je $$0, dve $$1, double $$2) {
      return 0.0;
   }

   @Override
   public jj p() {
      return this.a.w() ? this.a.cL().g().h() : this.a.cL().h();
   }

   @Override
   public eye c(eye $$0) {
      double $$1 = this.a.q();
      return new eye(azc.a($$0.d, -$$1, $$1), $$0.e, azc.a($$0.f, -$$1, $$1));
   }

   @Override
   public double q() {
      return (this.a.bi() ? 4.0 : 8.0) / 20.0;
   }

   @Override
   public double r() {
      return this.a.bX() ? 0.997 : 0.96;
   }
}
