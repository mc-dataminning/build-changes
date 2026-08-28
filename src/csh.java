import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class csh extends crz {
   private static final double b = 0.01;
   private static final double c = 0.2;
   private static final double d = 0.4;
   private static final double e = 0.4;
   private int f;
   private double g;
   private double h;
   private double i;
   private double j;
   private double k;
   private fbs l = fbs.c;

   public csh(crr $$0) {
      super($$0);
   }

   @Override
   public void a() {
      this.f = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = (double)$$3;
      this.k = (double)$$4;
      this.f = $$5 + 2;
      this.a(this.l);
   }

   @Override
   public double b() {
      return this.f > 0 ? this.g : this.a.dA();
   }

   @Override
   public double c() {
      return this.f > 0 ? this.h : this.a.dC();
   }

   @Override
   public double d() {
      return this.f > 0 ? this.i : this.a.dG();
   }

   @Override
   public float e() {
      return this.f > 0 ? (float)this.k : this.o();
   }

   @Override
   public float f() {
      return this.f > 0 ? (float)this.j : this.p();
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.l = new fbs($$0, $$1, $$2);
      this.a(this.l);
   }

   @Override
   public void g() {
      if (this.h() instanceof ash $$0) {
         this.a.bf();
         jh var11 = this.a.p();
         dxn $$3 = this.h().a_(var11);
         boolean $$4 = djt.h($$3);
         this.a.a($$4);
         if ($$4) {
            this.a($$0);
            if ($$3.a(dkg.hx)) {
               this.a.a(var11.u(), var11.v(), var11.w(), $$3.c(dqd.f));
            }
         } else {
            this.a.e($$0);
         }

         this.a.aK();
         this.a.aK();
         this.a(0.0F);
         double $$5 = this.a.K - this.l();
         double $$6 = this.a.M - this.n();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.b((float)(bae.d($$6, $$5) * 180.0 / Math.PI));
            if (this.a.s()) {
               this.b(this.p() + 180.0F);
            }
         }

         double $$7 = (double)bae.h(this.p() - this.a.N);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.b(this.p() + 180.0F);
            this.a.b(!this.a.s());
         }

         this.a(this.o() % 360.0F);
         this.b(this.p() % 360.0F);
         this.i();
      } else {
         if (this.f > 0) {
            this.a.a(this.f, this.g, this.h, this.i, this.j, this.k);
            this.f--;
         } else {
            this.a.ay();
            this.a(this.o() % 360.0F);
            this.b(this.p() % 360.0F);
         }
      }
   }

   @Override
   public void a(ash $$0) {
      jh $$1 = this.a.p();
      dxn $$2 = this.h().a_($$1);
      this.a.k();
      double $$3 = this.a.dA();
      double $$4 = this.a.dC();
      double $$5 = this.a.dG();
      fbs $$6 = this.d($$3, $$4, $$5);
      $$4 = (double)$$1.v();
      boolean $$7 = false;
      boolean $$8 = false;
      if ($$2.a(dkg.bw)) {
         $$7 = $$2.c(dqd.f);
         $$8 = !$$7;
      }

      double $$9 = 0.0078125;
      if (this.a.bj()) {
         $$9 *= 0.2;
      }

      fbs $$10 = this.j();
      dyq $$11 = $$2.c(((djt)$$2.b()).c());
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

      $$10 = this.j();
      Pair<kl, kl> $$12 = crr.a($$11);
      kl $$13 = (kl)$$12.getFirst();
      kl $$14 = (kl)$$12.getSecond();
      double $$15 = (double)($$14.u() - $$13.u());
      double $$16 = (double)($$14.w() - $$13.w());
      double $$17 = Math.sqrt($$15 * $$15 + $$16 * $$16);
      double $$18 = $$10.d * $$15 + $$10.f * $$16;
      if ($$18 < 0.0) {
         $$15 = -$$15;
         $$16 = -$$16;
      }

      double $$19 = Math.min(2.0, $$10.i());
      $$10 = new fbs($$19 * $$15 / $$17, $$10.e, $$19 * $$16 / $$17);
      this.a($$10);
      bvf $$20 = this.a.da();
      fbs $$22;
      if (this.a.da() instanceof asi $$21) {
         $$22 = $$21.aj();
      } else {
         $$22 = fbs.c;
      }

      if ($$20 instanceof cps && $$22.h() > 0.0) {
         fbs $$24 = $$22.d();
         double $$25 = this.j().j();
         if ($$24.h() > 0.0 && $$25 < 0.01) {
            this.a(this.j().b($$22.d * 0.001, 0.0, $$22.f * 0.001));
            $$8 = false;
         }
      }

      if ($$8) {
         double $$26 = this.j().i();
         if ($$26 < 0.03) {
            this.a(fbs.c);
         } else {
            this.a(this.j().d(0.5, 0.0, 0.5));
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
      $$10 = this.j();
      this.a.a(bwf.a, new fbs(bae.a($$36 * $$10.d, -$$37, $$37), 0.0, bae.a($$36 * $$10.f, -$$37, $$37)));
      if ($$13.v() != 0 && bae.a(this.a.dA()) - $$1.u() == $$13.u() && bae.a(this.a.dG()) - $$1.w() == $$13.w()) {
         this.c(this.a.dA(), this.a.dC() + (double)$$13.v(), this.a.dG());
      } else if ($$14.v() != 0 && bae.a(this.a.dA()) - $$1.u() == $$14.u() && bae.a(this.a.dG()) - $$1.w() == $$14.w()) {
         this.c(this.a.dA(), this.a.dC() + (double)$$14.v(), this.a.dG());
      }

      this.a(this.a.a(this.j()));
      fbs $$38 = this.d(this.a.dA(), this.a.dC(), this.a.dG());
      if ($$38 != null && $$6 != null) {
         double $$39 = ($$6.e - $$38.e) * 0.05;
         fbs $$40 = this.j();
         double $$41 = $$40.i();
         if ($$41 > 0.0) {
            this.a($$40.d(($$41 + $$39) / $$41, 1.0, ($$41 + $$39) / $$41));
         }

         this.c(this.a.dA(), $$38.e, this.a.dG());
      }

      int $$42 = bae.a(this.a.dA());
      int $$43 = bae.a(this.a.dG());
      if ($$42 != $$1.u() || $$43 != $$1.w()) {
         fbs $$44 = this.j();
         double $$45 = $$44.i();
         this.b($$45 * (double)($$42 - $$1.u()), $$44.e, $$45 * (double)($$43 - $$1.w()));
      }

      if ($$7) {
         fbs $$46 = this.j();
         double $$47 = $$46.i();
         if ($$47 > 0.01) {
            double $$48 = 0.06;
            this.a($$46.b($$46.d / $$47 * 0.06, 0.0, $$46.f / $$47 * 0.06));
         } else {
            fbs $$49 = this.j();
            double $$50 = $$49.d;
            double $$51 = $$49.f;
            if ($$11 == dyq.b) {
               if (this.a.b($$1.h())) {
                  $$50 = 0.02;
               } else if (this.a.b($$1.i())) {
                  $$50 = -0.02;
               }
            } else {
               if ($$11 != dyq.a) {
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
   public fbs a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = bae.a($$0);
      int $$5 = bae.a($$1);
      int $$6 = bae.a($$2);
      if (this.h().a_(new jh($$4, $$5 - 1, $$6)).a(axu.P)) {
         $$5--;
      }

      dxn $$7 = this.h().a_(new jh($$4, $$5, $$6));
      if (djt.h($$7)) {
         dyq $$8 = $$7.c(((djt)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<kl, kl> $$9 = crr.a($$8);
         kl $$10 = (kl)$$9.getFirst();
         kl $$11 = (kl)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && bae.a($$0) - $$4 == $$10.u() && bae.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && bae.a($$0) - $$4 == $$11.u() && bae.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.d($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public fbs d(double $$0, double $$1, double $$2) {
      int $$3 = bae.a($$0);
      int $$4 = bae.a($$1);
      int $$5 = bae.a($$2);
      if (this.h().a_(new jh($$3, $$4 - 1, $$5)).a(axu.P)) {
         $$4--;
      }

      dxn $$6 = this.h().a_(new jh($$3, $$4, $$5));
      if (djt.h($$6)) {
         dyq $$7 = $$6.c(((djt)$$6.b()).c());
         Pair<kl, kl> $$8 = crr.a($$7);
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

         return new fbs($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public double a(jh $$0, dyq $$1, double $$2) {
      return 0.0;
   }

   @Override
   public boolean i() {
      fbn $$0 = this.a.cR().c(0.2F, 0.0, 0.2F);
      if (this.a.D() && this.j().j() >= 0.01) {
         List<bvf> $$1 = this.h().a(this.a, $$0, bvk.a(this.a));
         if (!$$1.isEmpty()) {
            for (bvf $$2 : $$1) {
               if (!($$2 instanceof cps) && !($$2 instanceof cie) && !($$2 instanceof crr) && !this.a.ca() && !$$2.bZ()) {
                  $$2.n(this.a);
               } else {
                  $$2.h(this.a);
               }
            }
         }
      } else {
         for (bvf $$3 : this.h().a_(this.a, $$0)) {
            if (!this.a.y($$3) && $$3.bI() && $$3 instanceof crr) {
               $$3.h(this.a);
            }
         }
      }

      return false;
   }

   @Override
   public jm q() {
      return this.a.s() ? this.a.cO().g().h() : this.a.cO().h();
   }

   @Override
   public fbs c(fbs $$0) {
      return new fbs(bae.a($$0.d, -0.4, 0.4), $$0.e, bae.a($$0.f, -0.4, 0.4));
   }

   @Override
   public double b(ash $$0) {
      return this.a.bj() ? 0.2 : 0.4;
   }

   @Override
   public double r() {
      return this.a.ca() ? 0.997 : 0.96;
   }
}
