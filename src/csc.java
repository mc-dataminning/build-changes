import com.mojang.datafixers.util.Pair;
import io.netty.buffer.ByteBuf;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

public class csc extends crv {
   public static final int b = 3;
   public static final double c = 0.1;
   public static final double d = 0.005;
   @Nullable
   private csc.b i;
   private int j;
   private float k;
   private int l = 0;
   public final List<csc.a> e = new LinkedList<>();
   public final List<csc.a> f = new LinkedList<>();
   public double g = 0.0;
   public csc.a h = csc.a.b;

   public csc(crn $$0) {
      super($$0);
   }

   @Override
   public void g() {
      if (this.h() instanceof arx $$0) {
         jh var5 = this.a.p();
         dxo $$4 = this.h().a_(var5);
         if (this.a.m()) {
            this.a.a(djs.h($$4));
            this.a(var5, $$4, true);
         }

         this.a.bf();
         this.a.b($$0);
      } else {
         this.u();
         boolean $$1 = djs.h(this.h().a_(this.a.p()));
         this.a.a($$1);
      }
   }

   private void u() {
      if (--this.l <= 0) {
         this.s();
         this.f.clear();
         if (!this.e.isEmpty()) {
            this.f.addAll(this.e);
            this.e.clear();
            this.g = 0.0;

            for (csc.a $$0 : this.f) {
               this.g = this.g + (double)$$0.g;
            }

            this.l = this.g == 0.0 ? 0 : 3;
         }
      }

      if (this.t()) {
         this.b(this.e(1.0F));
         this.a(this.f(1.0F));
         this.a(this.c(1.0F));
         this.b(this.d(1.0F));
      }
   }

   public void s() {
      this.h = new csc.a(this.k(), this.j(), this.p(), this.o(), 0.0F);
   }

   public boolean t() {
      return !this.f.isEmpty();
   }

   public float c(float $$0) {
      csc.b $$1 = this.g($$0);
      return azu.i($$1.a, $$1.c.f, $$1.b.f);
   }

   public float d(float $$0) {
      csc.b $$1 = this.g($$0);
      return azu.i($$1.a, $$1.c.e, $$1.b.e);
   }

   public fbr e(float $$0) {
      csc.b $$1 = this.g($$0);
      return azu.a((double)$$1.a, $$1.c.c, $$1.b.c);
   }

   public fbr f(float $$0) {
      csc.b $$1 = this.g($$0);
      return azu.a((double)$$1.a, $$1.c.d, $$1.b.d);
   }

   private csc.b g(float $$0) {
      if ($$0 == this.k && this.l == this.j && this.i != null) {
         return this.i;
      } else {
         float $$1 = ((float)(3 - this.l) + $$0) / 3.0F;
         float $$2 = 0.0F;
         float $$3 = 1.0F;
         boolean $$4 = false;

         int $$5;
         for ($$5 = 0; $$5 < this.f.size(); $$5++) {
            float $$6 = this.f.get($$5).g;
            if (!($$6 <= 0.0F)) {
               $$2 += $$6;
               if ((double)$$2 >= this.g * (double)$$1) {
                  float $$7 = $$2 - $$6;
                  $$3 = (float)(((double)$$1 * this.g - (double)$$7) / (double)$$6);
                  $$4 = true;
                  break;
               }
            }
         }

         if (!$$4) {
            $$5 = this.f.size() - 1;
         }

         csc.a $$8 = this.f.get($$5);
         csc.a $$9 = $$5 > 0 ? this.f.get($$5 - 1) : this.h;
         this.i = new csc.b($$3, $$8, $$9);
         this.j = this.l;
         this.k = $$0;
         return this.i;
      }
   }

   public void a(jh $$0, dxo $$1, boolean $$2) {
      if (djs.h($$1)) {
         dyr $$3 = $$1.c(((djs)$$1.b()).c());
         Pair<kl, kl> $$4 = crn.a($$3);
         fbr $$5 = new fbr((kl)$$4.getFirst()).c(0.5);
         fbr $$6 = new fbr((kl)$$4.getSecond()).c(0.5);
         fbr $$7 = $$5.f();
         fbr $$8 = $$6.f();
         if (this.j().g() > 1.0E-5F && this.j().b($$7) < this.j().b($$8) || this.b($$8, $$3)) {
            fbr $$9 = $$7;
            $$7 = $$8;
            $$8 = $$9;
         }

         float $$10 = 180.0F - (float)(Math.atan2($$7.f, $$7.d) * 180.0 / Math.PI);
         $$10 += this.a.s() ? 180.0F : 0.0F;
         fbr $$11 = this.k();
         boolean $$12 = $$5.a() != $$6.a() && $$5.c() != $$6.c();
         fbr $$16;
         if ($$12) {
            fbr $$13 = $$6.d($$5);
            fbr $$14 = $$11.d($$0.c()).d($$5);
            fbr $$15 = $$13.c($$13.b($$14) / $$13.b($$13));
            $$16 = $$0.c().e($$5).e($$15);
            $$10 = 180.0F - (float)(Math.atan2($$15.f, $$15.d) * 180.0 / Math.PI);
            $$10 += this.a.s() ? 180.0F : 0.0F;
         } else {
            boolean $$17 = $$5.d($$6).d != 0.0;
            boolean $$18 = $$5.d($$6).f != 0.0;
            $$16 = new fbr($$18 ? $$0.b().d : $$11.d, (double)$$0.v(), $$17 ? $$0.b().f : $$11.f);
         }

         fbr $$20 = $$16.d($$11);
         this.b($$11.e($$20));
         float $$21 = 0.0F;
         boolean $$22 = $$5.b() != $$6.b();
         if ($$22) {
            fbr $$23 = $$0.c().e($$8);
            double $$24 = $$23.f(this.k());
            this.b(this.k().b(0.0, $$24 + 0.1, 0.0));
            $$21 = this.a.s() ? 45.0F : -45.0F;
         } else {
            this.b(this.k().b(0.0, 0.1, 0.0));
         }

         this.a($$10, $$21);
         double $$25 = $$11.f(this.k());
         if ($$25 > 0.0) {
            this.e.add(new csc.a(this.k(), this.j(), this.p(), this.o(), $$2 ? 0.0F : (float)$$25));
         }
      }
   }

   private void a(float $$0, float $$1) {
      double $$2 = (double)Math.abs($$0 - this.p());
      if ($$2 >= 175.0 && $$2 <= 185.0) {
         this.a.b(!this.a.s());
         $$0 -= 180.0F;
         $$1 *= -1.0F;
      }

      $$1 = Math.clamp($$1, -45.0F, 45.0F);
      this.a($$1 % 360.0F);
      this.b($$0 % 360.0F);
   }

   @Override
   public void a(arx $$0) {
      for (csc.c $$1 = new csc.c(); $$1.a() && this.a.bL(); $$1.b = false) {
         fbr $$2 = this.j();
         jh $$3 = this.a.p();
         dxo $$4 = this.h().a_($$3);
         boolean $$5 = djs.h($$4);
         if (this.a.cq() != $$5) {
            this.a.a($$5);
            this.a($$3, $$4, false);
         }

         if ($$5) {
            this.a.k();
            this.a.bz();
            if ($$4.a(dkf.hE)) {
               this.a.a($$3.u(), $$3.v(), $$3.w(), $$4.c(dqe.f));
            }

            dyr $$6 = $$4.c(((djs)$$4.b()).c());
            fbr $$7 = this.a($$0, $$2.f(), $$1, $$3, $$4, $$6);
            if ($$1.b) {
               $$1.a = $$7.i();
            } else {
               $$1.a = $$1.a + ($$7.i() - $$2.i());
            }

            this.a($$7);
            $$1.a = this.a.a($$3, $$6, $$1.a);
         } else {
            this.a.e($$0);
            $$1.a = 0.0;
         }

         fbr $$8 = this.k();
         fbr $$9 = $$8.d(this.a.bC());
         double $$10 = $$9.g();
         if ($$10 > 1.0E-5F) {
            if (!($$9.j() > 1.0E-5F)) {
               if (!this.a.cq()) {
                  this.a(this.a.aJ() ? 0.0F : azu.i(0.2F, this.o(), 0.0F));
               }
            } else {
               float $$11 = 180.0F - (float)(Math.atan2($$9.f, $$9.d) * 180.0 / Math.PI);
               float $$12 = this.a.aJ() && !this.a.cq() ? 0.0F : 90.0F - (float)(Math.atan2($$9.i(), $$9.e) * 180.0 / Math.PI);
               $$11 += this.a.s() ? 180.0F : 0.0F;
               $$12 *= this.a.s() ? -1.0F : 1.0F;
               this.a($$11, $$12);
            }

            this.e.add(new csc.a($$8, this.j(), this.p(), this.o(), (float)Math.min($$10, this.b($$0))));
         } else if ($$2.j() > 0.0) {
            this.e.add(new csc.a($$8, this.j(), this.p(), this.o(), 1.0F));
         }

         if ($$10 > 1.0E-5F || $$1.b) {
            this.a.aK();
            this.a.aK();
         }
      }
   }

   private fbr a(arx $$0, fbr $$1, csc.c $$2, jh $$3, dxo $$4, dyr $$5) {
      fbr $$6 = $$1;
      if (!$$2.c) {
         fbr $$7 = this.a($$1, $$5);
         if ($$7.j() != $$1.j()) {
            $$2.c = true;
            $$6 = $$7;
         }
      }

      if ($$2.b) {
         fbr $$8 = this.d($$6);
         if ($$8.j() != $$6.j()) {
            $$2.d = true;
            $$6 = $$8;
         }
      }

      if (!$$2.d) {
         fbr $$9 = this.a($$6, $$4);
         if ($$9.j() != $$6.j()) {
            $$2.d = true;
            $$6 = $$9;
         }
      }

      if ($$2.b) {
         $$6 = this.a.a($$6);
         if ($$6.h() > 0.0) {
            double $$10 = Math.min($$6.g(), this.a.a($$0));
            $$6 = $$6.d().c($$10);
         }
      }

      if (!$$2.e) {
         fbr $$11 = this.a($$6, $$3, $$4);
         if ($$11.j() != $$6.j()) {
            $$2.e = true;
            $$6 = $$11;
         }
      }

      return $$6;
   }

   private fbr a(fbr $$0, dyr $$1) {
      double $$2 = Math.max(0.0078125, $$0.i() * 0.02);
      if (this.a.bj()) {
         $$2 *= 0.2;
      }
      return switch ($$1) {
         case c -> $$0.b(-$$2, 0.0, 0.0);
         case d -> $$0.b($$2, 0.0, 0.0);
         case e -> $$0.b(0.0, 0.0, $$2);
         case f -> $$0.b(0.0, 0.0, -$$2);
         default -> $$0;
      };
   }

   private fbr d(fbr $$0) {
      if (this.a.da() instanceof ary $$1) {
         fbr $$3 = $$1.aj();
         if ($$3.h() > 0.0) {
            fbr $$4 = $$3.d();
            double $$5 = $$0.j();
            if ($$4.h() > 0.0 && $$5 < 0.01) {
               return $$0.e(new fbr($$4.d, 0.0, $$4.f).d().c(0.001));
            }
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   private fbr a(fbr $$0, dxo $$1) {
      if ($$1.a(dkf.bw) && !$$1.c(dqe.f)) {
         return $$0.g() < 0.03 ? fbr.c : $$0.c(0.5);
      } else {
         return $$0;
      }
   }

   private fbr a(fbr $$0, jh $$1, dxo $$2) {
      if ($$2.a(dkf.bw) && $$2.c(dqe.f)) {
         if ($$0.g() > 0.01) {
            return $$0.d().c($$0.g() + 0.06);
         } else {
            fbr $$3 = this.a.a($$1);
            return $$3.h() <= 0.0 ? $$0 : $$3.c($$0.g() + 0.2);
         }
      } else {
         return $$0;
      }
   }

   @Override
   public double a(jh $$0, dyr $$1, double $$2) {
      if ($$2 < 1.0E-5F) {
         return 0.0;
      } else {
         fbr $$3 = this.k();
         Pair<kl, kl> $$4 = crn.a($$1);
         kl $$5 = (kl)$$4.getFirst();
         kl $$6 = (kl)$$4.getSecond();
         fbr $$7 = this.j().f();
         if ($$7.g() < 1.0E-5F) {
            this.a(fbr.c);
            return 0.0;
         } else {
            boolean $$8 = $$5.v() != $$6.v();
            fbr $$9 = new fbr($$6).c(0.5).f();
            fbr $$10 = new fbr($$5).c(0.5).f();
            if ($$7.b($$10) < $$7.b($$9)) {
               $$10 = $$9;
            }

            fbr $$11 = $$0.c().e($$10).b(0.0, 0.1, 0.0).e($$10.d().c(1.0E-5F));
            if ($$8 && !this.b($$7, $$1)) {
               $$11 = $$11.b(0.0, 1.0, 0.0);
            }

            fbr $$12 = $$11.d(this.k()).d();
            $$7 = $$12.c($$7.g() / $$12.i());
            fbr $$13 = $$3.e($$7.d().c($$2 * (double)($$8 ? azu.g : 1.0F)));
            if ($$3.g($$11) <= $$3.g($$13)) {
               $$2 = $$11.d($$13).i();
               $$13 = $$11;
            } else {
               $$2 = 0.0;
            }

            this.a.a(bwb.a, $$13.d($$3));
            dxo $$14 = this.h().a_(jh.a((ka)$$13));
            if ($$8) {
               if (djs.h($$14)) {
                  dyr $$15 = $$14.c(((djs)$$14.b()).c());
                  if (this.a($$1, $$15)) {
                     return 0.0;
                  }
               }

               double $$16 = $$11.f().f(this.k().f());
               double $$17 = $$11.e + (this.b($$7, $$1) ? $$16 : -$$16);
               if (this.k().e < $$17) {
                  this.c(this.k().d, $$17, this.k().f);
               }
            }

            if (this.k().f($$3) < 1.0E-5F && $$13.f($$3) > 1.0E-5F) {
               this.a(fbr.c);
               return 0.0;
            } else {
               this.a($$7);
               return $$2;
            }
         }
      }
   }

   private boolean a(dyr $$0, dyr $$1) {
      if (this.j().h() < 0.005 && $$1.b() && this.b(this.j(), $$0) && !this.b(this.j(), $$1)) {
         this.a(fbr.c);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public double b(arx $$0) {
      return (double)$$0.O().c(dgv.aa) * (this.a.bj() ? 0.5 : 1.0) / 20.0;
   }

   private boolean b(fbr $$0, dyr $$1) {
      return switch ($$1) {
         case c -> $$0.d < 0.0;
         case d -> $$0.d > 0.0;
         case e -> $$0.f > 0.0;
         case f -> $$0.f < 0.0;
         default -> false;
      };
   }

   @Override
   public double r() {
      return this.a.ca() ? 0.997 : 0.975;
   }

   @Override
   public boolean i() {
      boolean $$0 = this.a(this.a.cR().c(0.2, 0.0, 0.2));
      if (!this.a.P && !this.a.Q) {
         return false;
      } else {
         boolean $$1 = this.b(this.a.cR().g(1.0E-7));
         return $$0 && !$$1;
      }
   }

   public boolean a(fbm $$0) {
      if (this.a.D() && !this.a.ca()) {
         List<bvb> $$1 = this.h().a(this.a, $$0, bvg.a(this.a));
         if (!$$1.isEmpty()) {
            for (bvb $$2 : $$1) {
               if (!($$2 instanceof cpo) && !($$2 instanceof cia) && !($$2 instanceof crn) && !this.a.ca() && !$$2.bZ()) {
                  boolean $$3 = $$2.n(this.a);
                  if ($$3) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public boolean b(fbm $$0) {
      boolean $$1 = false;
      if (this.a.D()) {
         List<bvb> $$2 = this.h().a(this.a, $$0, bvg.a(this.a));
         if (!$$2.isEmpty()) {
            for (bvb $$3 : $$2) {
               if ($$3 instanceof cpo || $$3 instanceof cia || $$3 instanceof crn || this.a.ca() || $$3.bZ()) {
                  $$3.h(this.a);
                  $$1 = true;
               }
            }
         }
      } else {
         for (bvb $$4 : this.h().a_(this.a, $$0)) {
            if (!this.a.y($$4) && $$4.bI() && $$4 instanceof crn) {
               $$4.h(this.a);
               $$1 = true;
            }
         }
      }

      return $$1;
   }

   public static record a(fbr c, fbr d, float e, float f, float g) {
      public static final zi<ByteBuf, csc.a> a = zi.a(fbr.b, csc.a::a, fbr.b, csc.a::b, zg.d, csc.a::c, zg.d, csc.a::d, zg.l, csc.a::e, csc.a::new);
      public static csc.a b = new csc.a(fbr.c, fbr.c, 0.0F, 0.0F, 0.0F);

      public fbr a() {
         return this.c;
      }

      public fbr b() {
         return this.d;
      }

      public float c() {
         return this.e;
      }

      public float d() {
         return this.f;
      }

      public float e() {
         return this.g;
      }
   }

   static record b(float a, csc.a b, csc.a c) {
   }

   static class c {
      double a = 0.0;
      boolean b = true;
      boolean c = false;
      boolean d = false;
      boolean e = false;

      public boolean a() {
         return this.b || this.a > 1.0E-5F;
      }
   }
}
