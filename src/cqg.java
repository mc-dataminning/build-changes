import com.mojang.datafixers.util.Pair;
import io.netty.buffer.ByteBuf;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

public class cqg extends cpz {
   public static final int b = 3;
   public static final double c = 0.1;
   public static final double d = 0.005;
   @Nullable
   private cqg.b i;
   private int j;
   private float k;
   private int l = 0;
   public final List<cqg.a> e = new LinkedList<>();
   public final List<cqg.a> f = new LinkedList<>();
   public double g = 0.0;
   public cqg.a h = cqg.a.c;

   public cqg(cps $$0) {
      super($$0);
   }

   @Override
   public void f() {
      if (this.g().B) {
         this.v();
         boolean $$0 = dgy.h(this.g().a_(this.a.q()));
         this.a.a($$0);
      } else {
         je $$1 = this.a.q();
         duo $$2 = this.g().a_($$1);
         if (this.a.o()) {
            this.a.a(dgy.h($$2));
            this.a($$1, $$2, true);
         }

         this.a.be();
         this.a.v();
      }
   }

   private void v() {
      if (--this.l <= 0) {
         this.t();
         this.f.clear();
         if (!this.e.isEmpty()) {
            this.f.addAll(this.e);
            this.e.clear();
            this.g = 0.0;

            for (cqg.a $$0 : this.f) {
               this.g = this.g + (double)$$0.h;
            }

            this.l = this.g == 0.0 ? 0 : 3;
         }
      }

      if (this.u()) {
         this.b(this.e(1.0F));
         this.a(this.f(1.0F));
         this.a(this.c(1.0F));
         this.b(this.d(1.0F));
      }
   }

   public void t() {
      this.h = new cqg.a(this.k(), this.j(), this.p(), this.o(), 0.0F);
   }

   public boolean u() {
      return !this.f.isEmpty();
   }

   public float c(float $$0) {
      cqg.b $$1 = this.g($$0);
      return azd.i($$1.a, $$1.c.g, $$1.b.g);
   }

   public float d(float $$0) {
      cqg.b $$1 = this.g($$0);
      return azd.i($$1.a, $$1.c.f, $$1.b.f);
   }

   public eys e(float $$0) {
      cqg.b $$1 = this.g($$0);
      return azd.a((double)$$1.a, $$1.c.d, $$1.b.d);
   }

   public eys f(float $$0) {
      cqg.b $$1 = this.g($$0);
      return azd.a((double)$$1.a, $$1.c.e, $$1.b.e);
   }

   private cqg.b g(float $$0) {
      if ($$0 == this.k && this.l == this.j && this.i != null) {
         return this.i;
      } else {
         float $$1 = ((float)(3 - this.l) + $$0) / 3.0F;
         float $$2 = 0.0F;
         float $$3 = 1.0F;
         boolean $$4 = false;

         int $$5;
         for ($$5 = 0; $$5 < this.f.size(); $$5++) {
            float $$6 = this.f.get($$5).h;
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

         cqg.a $$8 = this.f.get($$5);
         cqg.a $$9 = $$5 > 0 ? this.f.get($$5 - 1) : this.h;
         this.i = new cqg.b($$3, $$8, $$9);
         this.j = this.l;
         this.k = $$0;
         return this.i;
      }
   }

   public void a(je $$0, duo $$1, boolean $$2) {
      if (dgy.h($$1)) {
         dvs $$3 = $$1.c(((dgy)$$1.b()).c());
         Pair<ki, ki> $$4 = cps.a($$3);
         eys $$5 = new eys((ki)$$4.getFirst()).c(0.5);
         eys $$6 = new eys((ki)$$4.getSecond()).c(0.5);
         eys $$7 = $$5.f();
         eys $$8 = $$6.f();
         if (this.j().g() > 1.0E-5F && this.j().b($$7) < this.j().b($$8) || this.b($$8, $$3)) {
            eys $$9 = $$7;
            $$7 = $$8;
            $$8 = $$9;
         }

         float $$10 = 180.0F - (float)(Math.atan2($$7.f, $$7.d) * 180.0 / Math.PI);
         $$10 += this.a.x() ? 180.0F : 0.0F;
         eys $$11 = this.k();
         boolean $$12 = $$5.a() != $$6.a() && $$5.c() != $$6.c();
         eys $$16;
         if ($$12) {
            eys $$13 = $$6.d($$5);
            eys $$14 = $$11.d($$0.c()).d($$5);
            eys $$15 = $$13.c($$13.b($$14) / $$13.b($$13));
            $$16 = $$0.c().e($$5).e($$15);
            $$10 = 180.0F - (float)(Math.atan2($$15.f, $$15.d) * 180.0 / Math.PI);
            $$10 += this.a.x() ? 180.0F : 0.0F;
         } else {
            boolean $$17 = $$5.d($$6).d != 0.0;
            boolean $$18 = $$5.d($$6).f != 0.0;
            $$16 = new eys($$18 ? $$0.b().d : $$11.d, (double)$$0.v(), $$17 ? $$0.b().f : $$11.f);
         }

         eys $$20 = $$16.d($$11);
         this.b($$11.e($$20));
         float $$21 = 0.0F;
         boolean $$22 = $$5.b() != $$6.b();
         if ($$22) {
            eys $$23 = $$0.c().e($$8);
            double $$24 = $$23.f(this.k());
            this.b(this.k().b(0.0, $$24 + 0.1, 0.0));
            $$21 = this.a.x() ? 45.0F : -45.0F;
         } else {
            this.b(this.k().b(0.0, 0.1, 0.0));
         }

         this.a($$10, $$21);
         double $$25 = $$11.f(this.k());
         if ($$25 > 0.0) {
            this.e.add(new cqg.a(this.k(), this.j(), this.p(), this.o(), $$2 ? 0.0F : (float)$$25));
         }
      }
   }

   private void a(float $$0, float $$1) {
      double $$2 = (double)Math.abs($$0 - this.p());
      if ($$2 >= 175.0 && $$2 <= 185.0) {
         this.a.b(!this.a.x());
         $$0 -= 180.0F;
         $$1 *= -1.0F;
      }

      $$1 = Math.clamp($$1, -45.0F, 45.0F);
      this.a($$1 % 360.0F);
      this.b($$0 % 360.0F);
   }

   @Override
   public void h() {
      for (cqg.c $$0 = new cqg.c(); $$0.a(); $$0.b = false) {
         eys $$1 = this.j();
         je $$2 = this.a.q();
         duo $$3 = this.g().a_($$2);
         boolean $$4 = dgy.h($$3);
         if (this.a.cn() != $$4) {
            this.a.a($$4);
            this.a($$2, $$3, false);
         }

         if ($$4) {
            this.a.n();
            this.a.by();
            if ($$3.a(dhl.hh)) {
               this.a.a($$2.u(), $$2.v(), $$2.w(), $$3.c(dng.f));
            }

            dvs $$5 = $$3.c(((dgy)$$3.b()).c());
            eys $$6 = this.a($$1.f(), $$0, $$2, $$3, $$5);
            if ($$0.b) {
               $$0.a = $$6.i();
            } else {
               $$0.a = $$0.a + ($$6.i() - $$1.i());
            }

            this.a($$6);
            $$0.a = this.a.a($$2, $$5, $$0.a);
         } else {
            this.a.w();
            $$0.a = 0.0;
         }

         eys $$7 = this.k();
         eys $$8 = $$7.d(this.a.bz());
         double $$9 = $$8.g();
         if ($$9 > 1.0E-5F) {
            if (!($$8.j() > 1.0E-5F)) {
               if (!this.a.cn()) {
                  this.a(this.a.aH() ? 0.0F : azd.i(0.2F, this.o(), 0.0F));
               }
            } else {
               float $$10 = 180.0F - (float)(Math.atan2($$8.f, $$8.d) * 180.0 / Math.PI);
               float $$11 = this.a.aH() && !this.a.cn() ? 0.0F : 90.0F - (float)(Math.atan2($$8.i(), $$8.e) * 180.0 / Math.PI);
               $$10 += this.a.x() ? 180.0F : 0.0F;
               $$11 *= this.a.x() ? -1.0F : 1.0F;
               this.a($$10, $$11);
            }

            this.e.add(new cqg.a($$7, this.j(), this.p(), this.o(), (float)$$9));
         } else if ($$1.j() > 0.0) {
            this.e.add(new cqg.a($$7, this.j(), this.p(), this.o(), (float)$$1.g()));
         }

         if ($$9 > 1.0E-5F || $$0.b) {
            this.a.aI();
         }
      }
   }

   private eys a(eys $$0, cqg.c $$1, je $$2, duo $$3, dvs $$4) {
      eys $$5 = $$0;
      if (!$$1.c) {
         eys $$6 = this.a($$0, $$4);
         if ($$6.j() != $$0.j()) {
            $$1.c = true;
            $$5 = $$6;
         }
      }

      if ($$1.b) {
         eys $$7 = this.d($$5);
         if ($$7.j() != $$5.j()) {
            $$1.d = true;
            $$5 = $$7;
         }
      }

      if (!$$1.d) {
         eys $$8 = this.a($$5, $$3);
         if ($$8.j() != $$5.j()) {
            $$1.d = true;
            $$5 = $$8;
         }
      }

      if ($$1.b) {
         $$5 = this.a.a($$5);
         if ($$5.h() > 0.0) {
            double $$9 = Math.min($$5.g(), this.a.t());
            $$5 = $$5.d().c($$9);
         }
      }

      if (!$$1.e) {
         eys $$10 = this.a($$5, $$2, $$3);
         if ($$10.j() != $$5.j()) {
            $$1.e = true;
            $$5 = $$10;
         }
      }

      return $$5;
   }

   private eys a(eys $$0, dvs $$1) {
      double $$2 = Math.max(0.0078125, $$0.i() * 0.02);
      if (this.a.bi()) {
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

   private eys d(eys $$0) {
      bto $$1 = this.a.cX();
      eys $$2 = this.a.E();
      if ($$1 instanceof ari && $$2.h() > 0.0) {
         eys $$3 = $$2.d();
         double $$4 = $$0.j();
         if ($$3.h() > 0.0 && $$4 < 0.01) {
            return $$0.e(new eys($$3.d, 0.0, $$3.f).d().c(0.001));
         }
      } else {
         this.a.j(eys.c);
      }

      return $$0;
   }

   private eys a(eys $$0, duo $$1) {
      if ($$1.a(dhl.bp) && !$$1.c(dng.f)) {
         return $$0.g() < 0.03 ? eys.c : $$0.c(0.5);
      } else {
         return $$0;
      }
   }

   private eys a(eys $$0, je $$1, duo $$2) {
      if ($$2.a(dhl.bp) && $$2.c(dng.f)) {
         if ($$0.g() > 0.01) {
            return $$0.d().c($$0.g() + 0.06);
         } else {
            eys $$3 = this.a.a($$1);
            return $$3.h() <= 0.0 ? $$0 : $$3.c($$0.g() + 0.2);
         }
      } else {
         return $$0;
      }
   }

   @Override
   public double a(je $$0, dvs $$1, double $$2) {
      if ($$2 < 1.0E-5F) {
         return 0.0;
      } else {
         eys $$3 = this.k();
         Pair<ki, ki> $$4 = cps.a($$1);
         ki $$5 = (ki)$$4.getFirst();
         ki $$6 = (ki)$$4.getSecond();
         eys $$7 = this.j().f();
         if ($$7.g() < 1.0E-5F) {
            this.a(eys.c);
            return 0.0;
         } else {
            boolean $$8 = $$5.v() != $$6.v();
            eys $$9 = new eys($$6).c(0.5).f();
            eys $$10 = new eys($$5).c(0.5).f();
            if ($$7.b($$10) < $$7.b($$9)) {
               $$10 = $$9;
            }

            eys $$11 = $$0.c().e($$10).b(0.0, 0.1, 0.0).e($$10.d().c(1.0E-5F));
            if ($$8 && !this.b($$7, $$1)) {
               $$11 = $$11.b(0.0, 1.0, 0.0);
            }

            eys $$12 = $$11.d(this.k()).d();
            $$7 = $$12.c($$7.g() / $$12.i());
            eys $$13 = $$3.e($$7.d().c($$2 * (double)($$8 ? azd.g : 1.0F)));
            if ($$3.g($$11) <= $$3.g($$13)) {
               $$2 = $$11.d($$13).i();
               $$13 = $$11;
            } else {
               $$2 = 0.0;
            }

            this.a.a(buo.a, $$13.d($$3));
            duo $$14 = this.g().a_(je.a((jx)$$13));
            if ($$8) {
               if (dgy.h($$14)) {
                  dvs $$15 = $$14.c(((dgy)$$14.b()).c());
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
               this.a(eys.c);
               return 0.0;
            } else {
               this.a($$7);
               return $$2;
            }
         }
      }
   }

   private boolean a(dvs $$0, dvs $$1) {
      if (this.j().h() < 0.005 && $$1.b() && this.b(this.j(), $$0) && !this.b(this.j(), $$1)) {
         this.a(eys.c);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public double r() {
      return (double)this.g().ac().c(dec.Z) * (this.a.bi() ? 0.5 : 1.0) / 20.0;
   }

   private boolean b(eys $$0, dvs $$1) {
      return switch ($$1) {
         case c -> $$0.d < 0.0;
         case d -> $$0.d > 0.0;
         case e -> $$0.f > 0.0;
         case f -> $$0.f < 0.0;
         default -> false;
      };
   }

   @Override
   public double s() {
      return this.a.bX() ? 0.997 : 0.975;
   }

   @Override
   public boolean i() {
      boolean $$0 = this.a(this.a.cO().c(0.2, 0.0, 0.2));
      if (!this.a.Q && !this.a.R) {
         return false;
      } else {
         boolean $$1 = this.b(this.a.cO().g(1.0E-7));
         return $$0 && !$$1;
      }
   }

   public boolean a(eyn $$0) {
      if (this.a.y() == cps.a.a && !this.a.bX()) {
         List<bto> $$1 = this.g().a(this.a, $$0, btt.a(this.a));
         if (!$$1.isEmpty()) {
            for (bto $$2 : $$1) {
               if (!($$2 instanceof cnu) && !($$2 instanceof cgm) && !($$2 instanceof cps) && !this.a.bX() && !$$2.bW()) {
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

   public boolean b(eyn $$0) {
      boolean $$1 = false;
      if (this.a.y() == cps.a.a) {
         List<bto> $$2 = this.g().a(this.a, $$0, btt.a(this.a));
         if (!$$2.isEmpty()) {
            for (bto $$3 : $$2) {
               if ($$3 instanceof cnu || $$3 instanceof cgm || $$3 instanceof cps || this.a.bX() || $$3.bW()) {
                  $$3.h(this.a);
                  $$1 = true;
               }
            }
         }
      } else {
         for (bto $$4 : this.g().a_(this.a, $$0)) {
            if (!this.a.y($$4) && $$4.bF() && $$4 instanceof cps) {
               $$4.h(this.a);
               $$1 = true;
            }
         }
      }

      return $$1;
   }

   public static record a(eys d, eys e, float f, float g, float h) {
      public static final zb<ByteBuf, Float> a = yz.c.a(cqg.a::a, cqg.a::a);
      public static final zb<ByteBuf, cqg.a> b = zb.a(eys.b, cqg.a::a, eys.b, cqg.a::b, a, cqg.a::c, a, cqg.a::d, yz.i, cqg.a::e, cqg.a::new);
      public static cqg.a c = new cqg.a(eys.c, eys.c, 0.0F, 0.0F, 0.0F);

      private static byte a(float $$0) {
         return (byte)azd.d($$0 * 256.0F / 360.0F);
      }

      private static float a(byte $$0) {
         return (float)$$0 * 360.0F / 256.0F;
      }

      public eys a() {
         return this.d;
      }

      public eys b() {
         return this.e;
      }

      public float c() {
         return this.f;
      }

      public float d() {
         return this.g;
      }

      public float e() {
         return this.h;
      }
   }

   static record b(float a, cqg.a b, cqg.a c) {
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
