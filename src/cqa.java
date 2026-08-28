import com.mojang.datafixers.util.Pair;
import io.netty.buffer.ByteBuf;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

public class cqa extends cpt {
   public static final int b = 3;
   public static final double c = 0.1;
   @Nullable
   private cqa.b h;
   private int i;
   private float j;
   private int k = 0;
   public final List<cqa.a> d = new LinkedList<>();
   public final List<cqa.a> e = new LinkedList<>();
   public double f = 0.0;
   public cqa.a g = cqa.a.c;
   private boolean l = true;

   public cqa(cpm $$0) {
      super($$0);
   }

   @Override
   public void f() {
      if (this.g().B) {
         this.u();
         boolean $$0 = dgk.h(this.g().a_(this.a.o()));
         this.a.a($$0);
         this.l = false;
      } else {
         je $$1 = this.a.o();
         dua $$2 = this.g().a_($$1);
         if (this.l) {
            this.a.a(dgk.h($$2));
            this.a($$1, $$2);
         }

         this.a.be();
         this.a.t();
         this.l = false;
      }
   }

   private void u() {
      if (--this.k <= 0) {
         this.s();
         this.e.clear();
         if (!this.d.isEmpty()) {
            this.e.addAll(this.d);
            this.d.clear();
            this.k = 3;
            this.f = 0.0;

            for (cqa.a $$0 : this.e) {
               this.f = this.f + (double)$$0.h;
            }
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
      this.g = new cqa.a(this.j(), this.i(), this.o(), this.n(), 0.0F);
   }

   public boolean t() {
      return !this.e.isEmpty();
   }

   public float c(float $$0) {
      cqa.b $$1 = this.g($$0);
      return azc.i($$1.a, $$1.c.g, $$1.b.g);
   }

   public float d(float $$0) {
      cqa.b $$1 = this.g($$0);
      return azc.i($$1.a, $$1.c.f, $$1.b.f);
   }

   public eye e(float $$0) {
      cqa.b $$1 = this.g($$0);
      return azc.a((double)$$1.a, $$1.c.d, $$1.b.d);
   }

   public eye f(float $$0) {
      cqa.b $$1 = this.g($$0);
      return azc.a((double)$$1.a, $$1.c.e, $$1.b.e);
   }

   private cqa.b g(float $$0) {
      if ($$0 == this.j && this.k == this.i && this.h != null) {
         return this.h;
      } else {
         float $$1 = ((float)(3 - this.k) + $$0) / 3.0F;
         float $$2 = 0.0F;
         float $$3 = 1.0F;
         boolean $$4 = false;

         int $$5;
         for ($$5 = 0; $$5 < this.e.size(); $$5++) {
            float $$6 = this.e.get($$5).h;
            if (!($$6 <= 0.0F)) {
               $$2 += $$6;
               if ((double)$$2 >= this.f * (double)$$1) {
                  float $$7 = $$2 - $$6;
                  $$3 = (float)(((double)$$1 * this.f - (double)$$7) / (double)$$6);
                  $$4 = true;
                  break;
               }
            }
         }

         if (!$$4) {
            $$5 = this.e.size() - 1;
         }

         cqa.a $$8 = this.e.get($$5);
         cqa.a $$9 = $$5 > 0 ? this.e.get($$5 - 1) : this.g;
         this.h = new cqa.b($$3, $$8, $$9);
         this.i = this.k;
         this.j = $$0;
         return this.h;
      }
   }

   private void a(je $$0, dua $$1) {
      if (dgk.h($$1)) {
         dve $$2 = $$1.c(((dgk)$$1.b()).c());
         Pair<ki, ki> $$3 = cpm.a($$2);
         ki $$4 = (ki)$$3.getFirst();
         ki $$5 = (ki)$$3.getSecond();
         eye $$6 = new eye($$4).c(0.5).f();
         eye $$7 = new eye($$5).c(0.5).f();
         if (this.i().g() > 1.0E-5F && this.i().b($$6) < this.i().b($$7)) {
            $$6 = $$7;
         }

         float $$8 = 180.0F - (float)(Math.atan2($$6.f, $$6.d) * 180.0 / Math.PI);
         $$8 += this.a.w() ? 180.0F : 0.0F;
         this.b($$8);
         boolean $$9 = $$4.v() != $$5.v();
         eye $$10 = this.j();
         eye $$11 = $$0.c().d($$10);
         this.b($$10.e($$11));
         if ($$9) {
            eye $$12 = $$0.c().e($$7);
            double $$13 = $$12.f(this.j());
            this.b(this.j().b(0.0, $$13 + 0.1, 0.0));
         } else {
            this.b(this.j().b(0.0, 0.1, 0.0));
            this.a(0.0F);
         }

         double $$14 = $$10.f(this.j());
         if ($$14 > 0.0) {
            this.d.add(new cqa.a(this.j(), this.i(), this.o(), this.n(), (float)$$14));
         }
      }
   }

   @Override
   public void h() {
      for (cqa.c $$0 = new cqa.c(); $$0.a(); $$0.b = false) {
         je $$1 = this.a.o();
         dua $$2 = this.g().a_($$1);
         boolean $$3 = dgk.h($$2);
         if (this.a.cn() != $$3) {
            this.a.a($$3);
            this.a($$1, $$2);
         }

         if ($$3) {
            this.a.n();
            this.a.by();
            if ($$2.a(dgx.hh)) {
               this.a.a($$1.u(), $$1.v(), $$1.w(), $$2.c(dms.f));
            }

            dve $$4 = $$2.c(((dgk)$$2.b()).c());
            eye $$5 = this.a(this.i().f(), $$0, $$1, $$2, $$4);
            if ($$0.b) {
               $$0.a = $$5.i();
            } else {
               $$0.a = $$0.a + ($$5.i() - this.i().i());
            }

            this.a($$5);
            $$0.a = this.a.a($$1, $$4, $$0.a);
         } else {
            this.a.v();
            $$0.a = 0.0;
         }

         eye $$6 = this.j();
         double $$7 = this.a.bz().d($$6).g();
         if ($$7 > 1.0E-5F) {
            float $$8 = this.o();
            if (this.i().j() > 0.0) {
               $$8 = 180.0F - (float)(Math.atan2(this.i().f, this.i().d) * 180.0 / Math.PI);
               $$8 += this.a.w() ? 180.0F : 0.0F;
            }

            float $$9 = this.a.aH() && !this.a.cn() ? 0.0F : 90.0F - (float)(Math.atan2(this.i().i(), this.i().e) * 180.0 / Math.PI);
            $$9 *= this.a.w() ? -1.0F : 1.0F;
            double $$10 = (double)Math.abs($$8 - this.o());
            if ($$10 >= 175.0 && $$10 <= 185.0) {
               this.a.b(!this.a.w());
               $$8 -= 180.0F;
               $$9 *= -1.0F;
            }

            $$9 = Math.clamp($$9, -45.0F, 45.0F);
            this.a($$9 % 360.0F);
            this.b($$8 % 360.0F);
            this.d.add(new cqa.a($$6, this.i(), $$8, $$9, (float)$$7));
         }

         if ($$7 > 1.0E-5F || $$0.b) {
            this.a.aI();
         }
      }
   }

   private eye a(eye $$0, cqa.c $$1, je $$2, dua $$3, dve $$4) {
      eye $$5 = $$0;
      if (!$$1.c) {
         eye $$6 = this.a($$0, $$4);
         if ($$6.j() != $$0.j()) {
            $$1.c = true;
            $$5 = $$6;
         }
      }

      if ($$1.b) {
         eye $$7 = this.d($$5);
         if ($$7.j() != $$5.j()) {
            $$1.d = true;
            $$5 = $$7;
         }
      }

      if (!$$1.d) {
         eye $$8 = this.a($$5, $$3);
         if ($$8.j() != $$5.j()) {
            $$1.d = true;
            $$5 = $$8;
         }
      }

      if ($$1.b) {
         $$5 = this.a.a($$5);
         if ($$5.h() > 0.0) {
            double $$9 = Math.min($$5.g(), this.a.q());
            $$5 = $$5.d().c($$9);
         }
      }

      if (!$$1.e) {
         eye $$10 = this.a($$5, $$2, $$3);
         if ($$10.j() != $$5.j()) {
            $$1.e = true;
            $$5 = $$10;
         }
      }

      return $$5;
   }

   private eye a(eye $$0, dve $$1) {
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

   private eye d(eye $$0) {
      btj $$1 = this.a.cX();
      eye $$2 = this.a.D();
      if ($$1 instanceof arh && $$2.h() > 0.0) {
         eye $$3 = $$2.d();
         double $$4 = $$0.j();
         if ($$3.h() > 0.0 && $$4 < 0.01) {
            return $$0.e(new eye($$3.d, 0.0, $$3.f).d().c(0.001));
         }
      } else {
         this.a.j(eye.c);
      }

      return $$0;
   }

   private eye a(eye $$0, dua $$1) {
      if ($$1.a(dgx.bp) && !$$1.c(dms.f)) {
         return $$0.g() < 0.03 ? eye.c : $$0.c(0.5);
      } else {
         return $$0;
      }
   }

   private eye a(eye $$0, je $$1, dua $$2) {
      if ($$2.a(dgx.bp) && $$2.c(dms.f)) {
         if ($$0.g() > 0.01) {
            return $$0.d().c($$0.g() + 0.06);
         } else {
            eye $$3 = this.a.a($$1);
            return $$3.h() <= 0.0 ? $$0 : $$3.c($$0.g() + 0.2);
         }
      } else {
         return $$0;
      }
   }

   @Override
   public double a(je $$0, dve $$1, double $$2) {
      if ($$2 < 1.0E-5F) {
         return 0.0;
      } else {
         eye $$3 = this.j();
         Pair<ki, ki> $$4 = cpm.a($$1);
         ki $$5 = (ki)$$4.getFirst();
         ki $$6 = (ki)$$4.getSecond();
         eye $$7 = this.i().f();
         if ($$7.g() < 1.0E-5F) {
            this.a(eye.c);
            return 0.0;
         } else {
            boolean $$8 = $$5.v() != $$6.v();
            eye $$9 = new eye($$6).c(0.5).f();
            eye $$10 = new eye($$5).c(0.5).f();
            if ($$7.b($$10) < $$7.b($$9)) {
               $$10 = $$9;
            }

            eye $$11 = $$0.c().e($$10).b(0.0, 0.1, 0.0).e($$10.d().c(1.0E-5F));
            if ($$8 && !this.b($$7, $$1)) {
               $$11 = $$11.b(0.0, 1.0, 0.0);
            }

            eye $$12 = $$11.d(this.j()).d();
            $$7 = $$12.c($$7.g() / $$12.i());
            eye $$13 = $$3.e($$7.d().c($$2 * (double)($$8 ? azc.g : 1.0F)));
            if ($$3.g($$11) <= $$3.g($$13)) {
               $$2 = $$11.d($$13).i();
               $$13 = $$11;
            } else {
               $$2 = 0.0;
            }

            this.a.a(buj.a, $$13.d($$3));
            je $$14 = je.a((jx)$$13);
            dua $$15 = this.g().a_($$14);
            if ($$8 && dgk.h($$15)) {
               this.b($$13);
            }

            if (this.j().f($$3) < 1.0E-5F && $$13.f($$3) > 1.0E-5F) {
               this.a(eye.c);
               return 0.0;
            } else {
               this.a($$7);
               return $$2;
            }
         }
      }
   }

   @Override
   public double q() {
      return (double)this.g().ac().c(ddo.Z) * (this.a.bi() ? 0.5 : 1.0) / 20.0;
   }

   private boolean b(eye $$0, dve $$1) {
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
      return this.a.bX() ? 0.997 : 0.975;
   }

   public static record a(eye d, eye e, float f, float g, float h) {
      public static final zb<ByteBuf, Float> a = yz.c.a(cqa.a::a, cqa.a::a);
      public static final zb<ByteBuf, cqa.a> b = zb.a(eye.b, cqa.a::a, eye.b, cqa.a::b, a, cqa.a::c, a, cqa.a::d, yz.i, cqa.a::e, cqa.a::new);
      public static cqa.a c = new cqa.a(eye.c, eye.c, 0.0F, 0.0F, 0.0F);

      private static byte a(float $$0) {
         return (byte)azc.d($$0 * 256.0F / 360.0F);
      }

      private static float a(byte $$0) {
         return (float)$$0 * 360.0F / 256.0F;
      }

      public eye a() {
         return this.d;
      }

      public eye b() {
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

   static record b(float a, cqa.a b, cqa.a c) {
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
