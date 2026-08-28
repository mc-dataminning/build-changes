import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class csg extends cry {
   private static final double b = 0.01;
   private static final double c = 0.2;
   private static final double d = 0.4;
   private static final double e = 0.4;
   private final bvt f;
   private fbx g = fbx.c;

   public csg(crq $$0) {
      super($$0);
      this.f = new bvt($$0, this::a);
   }

   @Override
   public bvt a() {
      return this.f;
   }

   public void a(bvt $$0) {
      this.a(this.g);
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.g = new fbx($$0, $$1, $$2);
      this.a(this.g);
   }

   @Override
   public void b() {
      if (this.c() instanceof ard $$0) {
         this.a.bf();
         ji var11 = this.a.j();
         dxq $$3 = this.c().a_(var11);
         boolean $$4 = djt.h($$3);
         this.a.a($$4);
         if ($$4) {
            this.a($$0);
            if ($$3.a(dkg.hE)) {
               this.a.a(var11.u(), var11.v(), var11.w(), $$3.c(dqf.d));
            }
         } else {
            this.a.e($$0);
         }

         this.a.aK();
         this.a(0.0F);
         double $$5 = this.a.K - this.g();
         double $$6 = this.a.M - this.i();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.b((float)(ayz.d($$6, $$5) * 180.0 / Math.PI));
            if (this.a.m()) {
               this.b(this.k() + 180.0F);
            }
         }

         double $$7 = (double)ayz.h(this.k() - this.a.N);
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
   public void a(ard $$0) {
      ji $$1 = this.a.j();
      dxq $$2 = this.c().a_($$1);
      this.a.k();
      double $$3 = this.a.dz();
      double $$4 = this.a.dB();
      double $$5 = this.a.dF();
      fbx $$6 = this.d($$3, $$4, $$5);
      $$4 = (double)$$1.v();
      boolean $$7 = false;
      boolean $$8 = false;
      if ($$2.a(dkg.bw)) {
         $$7 = $$2.c(dqf.d);
         $$8 = !$$7;
      }

      double $$9 = 0.0078125;
      if (this.a.bj()) {
         $$9 *= 0.2;
      }

      fbx $$10 = this.e();
      dyu $$11 = $$2.c(((djt)$$2.b()).c());
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
      Pair<km, km> $$12 = crq.a($$11);
      km $$13 = (km)$$12.getFirst();
      km $$14 = (km)$$12.getSecond();
      double $$15 = (double)($$14.u() - $$13.u());
      double $$16 = (double)($$14.w() - $$13.w());
      double $$17 = Math.sqrt($$15 * $$15 + $$16 * $$16);
      double $$18 = $$10.d * $$15 + $$10.f * $$16;
      if ($$18 < 0.0) {
         $$15 = -$$15;
         $$16 = -$$16;
      }

      double $$19 = Math.min(2.0, $$10.i());
      $$10 = new fbx($$19 * $$15 / $$17, $$10.e, $$19 * $$16 / $$17);
      this.a($$10);
      bva $$20 = this.a.cY();
      fbx $$22;
      if (this.a.cY() instanceof are $$21) {
         $$22 = $$21.aj();
      } else {
         $$22 = fbx.c;
      }

      if ($$20 instanceof cpr && $$22.h() > 0.0) {
         fbx $$24 = $$22.d();
         double $$25 = this.e().j();
         if ($$24.h() > 0.0 && $$25 < 0.01) {
            this.a(this.e().b($$22.d * 0.001, 0.0, $$22.f * 0.001));
            $$8 = false;
         }
      }

      if ($$8) {
         double $$26 = this.e().i();
         if ($$26 < 0.03) {
            this.a(fbx.c);
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
      this.a.a(bwc.a, new fbx(ayz.a($$36 * $$10.d, -$$37, $$37), 0.0, ayz.a($$36 * $$10.f, -$$37, $$37)));
      if ($$13.v() != 0 && ayz.a(this.a.dz()) - $$1.u() == $$13.u() && ayz.a(this.a.dF()) - $$1.w() == $$13.w()) {
         this.c(this.a.dz(), this.a.dB() + (double)$$13.v(), this.a.dF());
      } else if ($$14.v() != 0 && ayz.a(this.a.dz()) - $$1.u() == $$14.u() && ayz.a(this.a.dF()) - $$1.w() == $$14.w()) {
         this.c(this.a.dz(), this.a.dB() + (double)$$14.v(), this.a.dF());
      }

      this.a(this.a.a(this.e()));
      fbx $$38 = this.d(this.a.dz(), this.a.dB(), this.a.dF());
      if ($$38 != null && $$6 != null) {
         double $$39 = ($$6.e - $$38.e) * 0.05;
         fbx $$40 = this.e();
         double $$41 = $$40.i();
         if ($$41 > 0.0) {
            this.a($$40.d(($$41 + $$39) / $$41, 1.0, ($$41 + $$39) / $$41));
         }

         this.c(this.a.dz(), $$38.e, this.a.dF());
      }

      int $$42 = ayz.a(this.a.dz());
      int $$43 = ayz.a(this.a.dF());
      if ($$42 != $$1.u() || $$43 != $$1.w()) {
         fbx $$44 = this.e();
         double $$45 = $$44.i();
         this.b($$45 * (double)($$42 - $$1.u()), $$44.e, $$45 * (double)($$43 - $$1.w()));
      }

      if ($$7) {
         fbx $$46 = this.e();
         double $$47 = $$46.i();
         if ($$47 > 0.01) {
            double $$48 = 0.06;
            this.a($$46.b($$46.d / $$47 * 0.06, 0.0, $$46.f / $$47 * 0.06));
         } else {
            fbx $$49 = this.e();
            double $$50 = $$49.d;
            double $$51 = $$49.f;
            if ($$11 == dyu.b) {
               if (this.a.b($$1.h())) {
                  $$50 = 0.02;
               } else if (this.a.b($$1.i())) {
                  $$50 = -0.02;
               }
            } else {
               if ($$11 != dyu.a) {
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
   public fbx a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = ayz.a($$0);
      int $$5 = ayz.a($$1);
      int $$6 = ayz.a($$2);
      if (this.c().a_(new ji($$4, $$5 - 1, $$6)).a(awp.P)) {
         $$5--;
      }

      dxq $$7 = this.c().a_(new ji($$4, $$5, $$6));
      if (djt.h($$7)) {
         dyu $$8 = $$7.c(((djt)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<km, km> $$9 = crq.a($$8);
         km $$10 = (km)$$9.getFirst();
         km $$11 = (km)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && ayz.a($$0) - $$4 == $$10.u() && ayz.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && ayz.a($$0) - $$4 == $$11.u() && ayz.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.d($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public fbx d(double $$0, double $$1, double $$2) {
      int $$3 = ayz.a($$0);
      int $$4 = ayz.a($$1);
      int $$5 = ayz.a($$2);
      if (this.c().a_(new ji($$3, $$4 - 1, $$5)).a(awp.P)) {
         $$4--;
      }

      dxq $$6 = this.c().a_(new ji($$3, $$4, $$5));
      if (djt.h($$6)) {
         dyu $$7 = $$6.c(((djt)$$6.b()).c());
         Pair<km, km> $$8 = crq.a($$7);
         km $$9 = (km)$$8.getFirst();
         km $$10 = (km)$$8.getSecond();
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

         return new fbx($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public double a(ji $$0, dyu $$1, double $$2) {
      return 0.0;
   }

   @Override
   public boolean d() {
      fbs $$0 = this.a.cQ().c(0.2F, 0.0, 0.2F);
      if (this.a.z() && this.e().j() >= 0.01) {
         List<bva> $$1 = this.c().a(this.a, $$0, bvg.a(this.a));
         if (!$$1.isEmpty()) {
            for (bva $$2 : $$1) {
               if (!($$2 instanceof cpr) && !($$2 instanceof cib) && !($$2 instanceof crq) && !this.a.bZ() && !$$2.bY()) {
                  $$2.n(this.a);
               } else {
                  $$2.h(this.a);
               }
            }
         }
      } else {
         for (bva $$3 : this.c().a_(this.a, $$0)) {
            if (!this.a.y($$3) && $$3.bG() && $$3 instanceof crq) {
               $$3.h(this.a);
            }
         }
      }

      return false;
   }

   @Override
   public jn l() {
      return this.a.m() ? this.a.cN().g().h() : this.a.cN().h();
   }

   @Override
   public fbx c(fbx $$0) {
      return new fbx(ayz.a($$0.d, -0.4, 0.4), $$0.e, ayz.a($$0.f, -0.4, 0.4));
   }

   @Override
   public double b(ard $$0) {
      return this.a.bj() ? 0.2 : 0.4;
   }

   @Override
   public double m() {
      return this.a.bZ() ? 0.997 : 0.96;
   }
}
