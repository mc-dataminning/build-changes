import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class csx extends csp {
   private static final double b = 0.01;
   private static final double c = 0.2;
   private static final double d = 0.4;
   private static final double e = 0.4;
   private final bwm f;
   private fcu g = fcu.c;

   public csx(csh $$0) {
      super($$0);
      this.f = new bwm($$0, this::a);
   }

   @Override
   public bwm a() {
      return this.f;
   }

   public void a(bwm $$0) {
      this.a(this.g);
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.g = new fcu($$0, $$1, $$2);
      this.a(this.g);
   }

   @Override
   public void b() {
      if (this.c() instanceof arn $$0) {
         this.a.bf();
         jj var11 = this.a.j();
         dym $$3 = this.c().a_(var11);
         boolean $$4 = dkj.h($$3);
         this.a.a($$4);
         if ($$4) {
            this.a($$0);
            if ($$3.a(dkw.hE)) {
               this.a.a(var11.u(), var11.v(), var11.w(), $$3.c(dqv.d));
            }
         } else {
            this.a.e($$0);
         }

         this.a.aK();
         this.a(0.0F);
         double $$5 = this.a.K - this.g();
         double $$6 = this.a.M - this.i();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.b((float)(azk.d($$6, $$5) * 180.0 / Math.PI));
            if (this.a.m()) {
               this.b(this.k() + 180.0F);
            }
         }

         double $$7 = (double)azk.h(this.k() - this.a.N);
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
            this.a.ay();
            this.a(this.j() % 360.0F);
            this.b(this.k() % 360.0F);
         }
      }
   }

   @Override
   public void a(arn $$0) {
      jj $$1 = this.a.j();
      dym $$2 = this.c().a_($$1);
      this.a.k();
      double $$3 = this.a.dA();
      double $$4 = this.a.dC();
      double $$5 = this.a.dG();
      fcu $$6 = this.d($$3, $$4, $$5);
      $$4 = (double)$$1.v();
      boolean $$7 = false;
      boolean $$8 = false;
      if ($$2.a(dkw.bw)) {
         $$7 = $$2.c(dqv.d);
         $$8 = !$$7;
      }

      double $$9 = 0.0078125;
      if (this.a.bj()) {
         $$9 *= 0.2;
      }

      fcu $$10 = this.e();
      dzq $$11 = $$2.c(((dkj)$$2.b()).c());
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
      Pair<kn, kn> $$12 = csh.a($$11);
      kn $$13 = (kn)$$12.getFirst();
      kn $$14 = (kn)$$12.getSecond();
      double $$15 = (double)($$14.u() - $$13.u());
      double $$16 = (double)($$14.w() - $$13.w());
      double $$17 = Math.sqrt($$15 * $$15 + $$16 * $$16);
      double $$18 = $$10.d * $$15 + $$10.f * $$16;
      if ($$18 < 0.0) {
         $$15 = -$$15;
         $$16 = -$$16;
      }

      double $$19 = Math.min(2.0, $$10.i());
      $$10 = new fcu($$19 * $$15 / $$17, $$10.e, $$19 * $$16 / $$17);
      this.a($$10);
      bvs $$20 = this.a.cZ();
      fcu $$22;
      if (this.a.cZ() instanceof aro $$21) {
         $$22 = $$21.aj();
      } else {
         $$22 = fcu.c;
      }

      if ($$20 instanceof cqi && $$22.h() > 0.0) {
         fcu $$24 = $$22.d();
         double $$25 = this.e().j();
         if ($$24.h() > 0.0 && $$25 < 0.01) {
            this.a(this.e().b($$22.d * 0.001, 0.0, $$22.f * 0.001));
            $$8 = false;
         }
      }

      if ($$8) {
         double $$26 = this.e().i();
         if ($$26 < 0.03) {
            this.a(fcu.c);
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
      double $$36 = this.a.ca() ? 0.75 : 1.0;
      double $$37 = this.a.a($$0);
      $$10 = this.e();
      this.a.a(bwv.a, new fcu(azk.a($$36 * $$10.d, -$$37, $$37), 0.0, azk.a($$36 * $$10.f, -$$37, $$37)));
      if ($$13.v() != 0 && azk.a(this.a.dA()) - $$1.u() == $$13.u() && azk.a(this.a.dG()) - $$1.w() == $$13.w()) {
         this.c(this.a.dA(), this.a.dC() + (double)$$13.v(), this.a.dG());
      } else if ($$14.v() != 0 && azk.a(this.a.dA()) - $$1.u() == $$14.u() && azk.a(this.a.dG()) - $$1.w() == $$14.w()) {
         this.c(this.a.dA(), this.a.dC() + (double)$$14.v(), this.a.dG());
      }

      this.a(this.a.a(this.e()));
      fcu $$38 = this.d(this.a.dA(), this.a.dC(), this.a.dG());
      if ($$38 != null && $$6 != null) {
         double $$39 = ($$6.e - $$38.e) * 0.05;
         fcu $$40 = this.e();
         double $$41 = $$40.i();
         if ($$41 > 0.0) {
            this.a($$40.d(($$41 + $$39) / $$41, 1.0, ($$41 + $$39) / $$41));
         }

         this.c(this.a.dA(), $$38.e, this.a.dG());
      }

      int $$42 = azk.a(this.a.dA());
      int $$43 = azk.a(this.a.dG());
      if ($$42 != $$1.u() || $$43 != $$1.w()) {
         fcu $$44 = this.e();
         double $$45 = $$44.i();
         this.b($$45 * (double)($$42 - $$1.u()), $$44.e, $$45 * (double)($$43 - $$1.w()));
      }

      if ($$7) {
         fcu $$46 = this.e();
         double $$47 = $$46.i();
         if ($$47 > 0.01) {
            double $$48 = 0.06;
            this.a($$46.b($$46.d / $$47 * 0.06, 0.0, $$46.f / $$47 * 0.06));
         } else {
            fcu $$49 = this.e();
            double $$50 = $$49.d;
            double $$51 = $$49.f;
            if ($$11 == dzq.b) {
               if (this.a.b($$1.h())) {
                  $$50 = 0.02;
               } else if (this.a.b($$1.i())) {
                  $$50 = -0.02;
               }
            } else {
               if ($$11 != dzq.a) {
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
   public fcu a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = azk.a($$0);
      int $$5 = azk.a($$1);
      int $$6 = azk.a($$2);
      if (this.c().a_(new jj($$4, $$5 - 1, $$6)).a(awz.P)) {
         $$5--;
      }

      dym $$7 = this.c().a_(new jj($$4, $$5, $$6));
      if (dkj.h($$7)) {
         dzq $$8 = $$7.c(((dkj)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<kn, kn> $$9 = csh.a($$8);
         kn $$10 = (kn)$$9.getFirst();
         kn $$11 = (kn)$$9.getSecond();
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
   public fcu d(double $$0, double $$1, double $$2) {
      int $$3 = azk.a($$0);
      int $$4 = azk.a($$1);
      int $$5 = azk.a($$2);
      if (this.c().a_(new jj($$3, $$4 - 1, $$5)).a(awz.P)) {
         $$4--;
      }

      dym $$6 = this.c().a_(new jj($$3, $$4, $$5));
      if (dkj.h($$6)) {
         dzq $$7 = $$6.c(((dkj)$$6.b()).c());
         Pair<kn, kn> $$8 = csh.a($$7);
         kn $$9 = (kn)$$8.getFirst();
         kn $$10 = (kn)$$8.getSecond();
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

         return new fcu($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public double a(jj $$0, dzq $$1, double $$2) {
      return 0.0;
   }

   @Override
   public boolean d() {
      fcp $$0 = this.a.cR().c(0.2F, 0.0, 0.2F);
      if (this.a.z() && this.e().j() >= 0.01) {
         List<bvs> $$1 = this.c().a(this.a, $$0, bvz.a(this.a));
         if (!$$1.isEmpty()) {
            for (bvs $$2 : $$1) {
               if (!($$2 instanceof cqi) && !($$2 instanceof cis) && !($$2 instanceof csh) && !this.a.ca() && !$$2.bZ()) {
                  $$2.n(this.a);
               } else {
                  $$2.h(this.a);
               }
            }
         }
      } else {
         for (bvs $$3 : this.c().a_(this.a, $$0)) {
            if (!this.a.y($$3) && $$3.bH() && $$3 instanceof csh) {
               $$3.h(this.a);
            }
         }
      }

      return false;
   }

   @Override
   public jo l() {
      return this.a.m() ? this.a.cO().g().h() : this.a.cO().h();
   }

   @Override
   public fcu c(fcu $$0) {
      return !Double.isNaN($$0.d) && !Double.isNaN($$0.e) && !Double.isNaN($$0.f) ? new fcu(azk.a($$0.d, -0.4, 0.4), $$0.e, azk.a($$0.f, -0.4, 0.4)) : fcu.c;
   }

   @Override
   public double b(arn $$0) {
      return this.a.bj() ? 0.2 : 0.4;
   }

   @Override
   public double m() {
      return this.a.ca() ? 0.997 : 0.96;
   }
}
