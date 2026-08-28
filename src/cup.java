import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class cup extends cuh {
   private static final double b = 0.01;
   private static final double c = 0.2;
   private static final double d = 0.4;
   private static final double e = 0.4;
   private final bxe f;
   private ffc g = ffc.c;

   public cup(ctz $$0) {
      super($$0);
      this.f = new bxe($$0, this::a);
   }

   @Override
   public bxe a() {
      return this.f;
   }

   public void a(bxe $$0) {
      this.a(this.g);
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.g = new ffc($$0, $$1, $$2);
      this.a(this.g);
   }

   @Override
   public void b() {
      if (this.c() instanceof arq $$0) {
         this.a.bd();
         iv var11 = this.a.j();
         eat $$3 = this.c().a_(var11);
         boolean $$4 = dmg.h($$3);
         this.a.a($$4);
         if ($$4) {
            this.a($$0);
            if ($$3.a(dmt.hI)) {
               this.a.a(var11.u(), var11.v(), var11.w(), $$3.c(dsu.d));
            }
         } else {
            this.a.e($$0);
         }

         this.a.aI();
         this.a(0.0F);
         double $$5 = this.a.K - this.g();
         double $$6 = this.a.M - this.i();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.b((float)(azm.d($$6, $$5) * 180.0 / Math.PI));
            if (this.a.m()) {
               this.b(this.k() + 180.0F);
            }
         }

         double $$7 = (double)azm.h(this.k() - this.a.N);
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
   public void a(arq $$0) {
      iv $$1 = this.a.j();
      eat $$2 = this.c().a_($$1);
      this.a.k();
      double $$3 = this.a.dz();
      double $$4 = this.a.dB();
      double $$5 = this.a.dF();
      ffc $$6 = this.d($$3, $$4, $$5);
      $$4 = (double)$$1.v();
      boolean $$7 = false;
      boolean $$8 = false;
      if ($$2.a(dmt.bw)) {
         $$7 = $$2.c(dsu.d);
         $$8 = !$$7;
      }

      double $$9 = 0.0078125;
      if (this.a.bh()) {
         $$9 *= 0.2;
      }

      ffc $$10 = this.e();
      ebx $$11 = $$2.c(((dmg)$$2.b()).c());
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
      Pair<ka, ka> $$12 = ctz.a($$11);
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
      $$10 = new ffc($$19 * $$15 / $$17, $$10.e, $$19 * $$16 / $$17);
      this.a($$10);
      bwi $$20 = this.a.cY();
      ffc $$22;
      if (this.a.cY() instanceof arr $$21) {
         $$22 = $$21.ag();
      } else {
         $$22 = ffc.c;
      }

      if ($$20 instanceof crm && $$22.h() > 0.0) {
         ffc $$24 = $$22.d();
         double $$25 = this.e().j();
         if ($$24.h() > 0.0 && $$25 < 0.01) {
            this.a(this.e().b($$22.d * 0.001, 0.0, $$22.f * 0.001));
            $$8 = false;
         }
      }

      if ($$8) {
         double $$26 = this.e().i();
         if ($$26 < 0.03) {
            this.a(ffc.c);
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
      double $$36 = this.a.bY() ? 0.75 : 1.0;
      double $$37 = this.a.a($$0);
      $$10 = this.e();
      this.a.a(bxn.a, new ffc(azm.a($$36 * $$10.d, -$$37, $$37), 0.0, azm.a($$36 * $$10.f, -$$37, $$37)));
      if ($$13.v() != 0 && azm.a(this.a.dz()) - $$1.u() == $$13.u() && azm.a(this.a.dF()) - $$1.w() == $$13.w()) {
         this.c(this.a.dz(), this.a.dB() + (double)$$13.v(), this.a.dF());
      } else if ($$14.v() != 0 && azm.a(this.a.dz()) - $$1.u() == $$14.u() && azm.a(this.a.dF()) - $$1.w() == $$14.w()) {
         this.c(this.a.dz(), this.a.dB() + (double)$$14.v(), this.a.dF());
      }

      this.a(this.a.a(this.e()));
      ffc $$38 = this.d(this.a.dz(), this.a.dB(), this.a.dF());
      if ($$38 != null && $$6 != null) {
         double $$39 = ($$6.e - $$38.e) * 0.05;
         ffc $$40 = this.e();
         double $$41 = $$40.i();
         if ($$41 > 0.0) {
            this.a($$40.d(($$41 + $$39) / $$41, 1.0, ($$41 + $$39) / $$41));
         }

         this.c(this.a.dz(), $$38.e, this.a.dF());
      }

      int $$42 = azm.a(this.a.dz());
      int $$43 = azm.a(this.a.dF());
      if ($$42 != $$1.u() || $$43 != $$1.w()) {
         ffc $$44 = this.e();
         double $$45 = $$44.i();
         this.b($$45 * (double)($$42 - $$1.u()), $$44.e, $$45 * (double)($$43 - $$1.w()));
      }

      if ($$7) {
         ffc $$46 = this.e();
         double $$47 = $$46.i();
         if ($$47 > 0.01) {
            double $$48 = 0.06;
            this.a($$46.b($$46.d / $$47 * 0.06, 0.0, $$46.f / $$47 * 0.06));
         } else {
            ffc $$49 = this.e();
            double $$50 = $$49.d;
            double $$51 = $$49.f;
            if ($$11 == ebx.b) {
               if (this.a.b($$1.h())) {
                  $$50 = 0.02;
               } else if (this.a.b($$1.i())) {
                  $$50 = -0.02;
               }
            } else {
               if ($$11 != ebx.a) {
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
   public ffc a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = azm.a($$0);
      int $$5 = azm.a($$1);
      int $$6 = azm.a($$2);
      if (this.c().a_(new iv($$4, $$5 - 1, $$6)).a(axc.P)) {
         $$5--;
      }

      eat $$7 = this.c().a_(new iv($$4, $$5, $$6));
      if (dmg.h($$7)) {
         ebx $$8 = $$7.c(((dmg)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<ka, ka> $$9 = ctz.a($$8);
         ka $$10 = (ka)$$9.getFirst();
         ka $$11 = (ka)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && azm.a($$0) - $$4 == $$10.u() && azm.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && azm.a($$0) - $$4 == $$11.u() && azm.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.d($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public ffc d(double $$0, double $$1, double $$2) {
      int $$3 = azm.a($$0);
      int $$4 = azm.a($$1);
      int $$5 = azm.a($$2);
      if (this.c().a_(new iv($$3, $$4 - 1, $$5)).a(axc.P)) {
         $$4--;
      }

      eat $$6 = this.c().a_(new iv($$3, $$4, $$5));
      if (dmg.h($$6)) {
         ebx $$7 = $$6.c(((dmg)$$6.b()).c());
         Pair<ka, ka> $$8 = ctz.a($$7);
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

         return new ffc($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public double a(iv $$0, ebx $$1, double $$2) {
      return 0.0;
   }

   @Override
   public boolean d() {
      fex $$0 = this.a.cQ().c(0.2F, 0.0, 0.2F);
      if (this.a.y() && this.e().j() >= 0.01) {
         List<bwi> $$1 = this.c().a(this.a, $$0, bwp.a(this.a));
         if (!$$1.isEmpty()) {
            for (bwi $$2 : $$1) {
               if (!($$2 instanceof crm) && !($$2 instanceof cjp) && !($$2 instanceof ctz) && !this.a.bY() && !$$2.bX()) {
                  $$2.n(this.a);
               } else {
                  $$2.h(this.a);
               }
            }
         }
      } else {
         for (bwi $$3 : this.c().a_(this.a, $$0)) {
            if (!this.a.y($$3) && $$3.bF() && $$3 instanceof ctz) {
               $$3.h(this.a);
            }
         }
      }

      return false;
   }

   @Override
   public jb l() {
      return this.a.m() ? this.a.cN().g().h() : this.a.cN().h();
   }

   @Override
   public ffc c(ffc $$0) {
      return !Double.isNaN($$0.d) && !Double.isNaN($$0.e) && !Double.isNaN($$0.f) ? new ffc(azm.a($$0.d, -0.4, 0.4), $$0.e, azm.a($$0.f, -0.4, 0.4)) : ffc.c;
   }

   @Override
   public double b(arq $$0) {
      return this.a.bh() ? 0.2 : 0.4;
   }

   @Override
   public double m() {
      return this.a.bY() ? 0.997 : 0.96;
   }
}
