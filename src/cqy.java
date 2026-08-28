import com.mojang.datafixers.util.Pair;
import io.netty.buffer.ByteBuf;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

public class cqy extends cqr {
   public static final int b = 3;
   public static final double c = 0.1;
   public static final double d = 0.005;
   @Nullable
   private cqy.b i;
   private int j;
   private float k;
   private int l = 0;
   public final List<cqy.a> e = new LinkedList<>();
   public final List<cqy.a> f = new LinkedList<>();
   public double g = 0.0;
   public cqy.a h = cqy.a.b;

   public cqy(cqk $$0) {
      super($$0);
   }

   @Override
   public void f() {
      if (this.g().C) {
         this.v();
         boolean $$0 = dht.h(this.g().a_(this.a.q()));
         this.a.a($$0);
      } else {
         jh $$1 = this.a.q();
         dvj $$2 = this.g().a_($$1);
         if (this.a.o()) {
            this.a.a(dht.h($$2));
            this.a($$1, $$2, true);
         }

         this.a.bg();
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

            for (cqy.a $$0 : this.f) {
               this.g = this.g + (double)$$0.g;
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
      this.h = new cqy.a(this.k(), this.j(), this.p(), this.o(), 0.0F);
   }

   public boolean u() {
      return !this.f.isEmpty();
   }

   public float c(float $$0) {
      cqy.b $$1 = this.g($$0);
      return azk.i($$1.a, $$1.c.f, $$1.b.f);
   }

   public float d(float $$0) {
      cqy.b $$1 = this.g($$0);
      return azk.i($$1.a, $$1.c.e, $$1.b.e);
   }

   public ezn e(float $$0) {
      cqy.b $$1 = this.g($$0);
      return azk.a((double)$$1.a, $$1.c.c, $$1.b.c);
   }

   public ezn f(float $$0) {
      cqy.b $$1 = this.g($$0);
      return azk.a((double)$$1.a, $$1.c.d, $$1.b.d);
   }

   private cqy.b g(float $$0) {
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

         cqy.a $$8 = this.f.get($$5);
         cqy.a $$9 = $$5 > 0 ? this.f.get($$5 - 1) : this.h;
         this.i = new cqy.b($$3, $$8, $$9);
         this.j = this.l;
         this.k = $$0;
         return this.i;
      }
   }

   public void a(jh $$0, dvj $$1, boolean $$2) {
      if (dht.h($$1)) {
         dwn $$3 = $$1.c(((dht)$$1.b()).c());
         Pair<kl, kl> $$4 = cqk.a($$3);
         ezn $$5 = new ezn((kl)$$4.getFirst()).c(0.5);
         ezn $$6 = new ezn((kl)$$4.getSecond()).c(0.5);
         ezn $$7 = $$5.f();
         ezn $$8 = $$6.f();
         if (this.j().g() > 1.0E-5F && this.j().b($$7) < this.j().b($$8) || this.b($$8, $$3)) {
            ezn $$9 = $$7;
            $$7 = $$8;
            $$8 = $$9;
         }

         float $$10 = 180.0F - (float)(Math.atan2($$7.f, $$7.d) * 180.0 / Math.PI);
         $$10 += this.a.x() ? 180.0F : 0.0F;
         ezn $$11 = this.k();
         boolean $$12 = $$5.a() != $$6.a() && $$5.c() != $$6.c();
         ezn $$16;
         if ($$12) {
            ezn $$13 = $$6.d($$5);
            ezn $$14 = $$11.d($$0.c()).d($$5);
            ezn $$15 = $$13.c($$13.b($$14) / $$13.b($$13));
            $$16 = $$0.c().e($$5).e($$15);
            $$10 = 180.0F - (float)(Math.atan2($$15.f, $$15.d) * 180.0 / Math.PI);
            $$10 += this.a.x() ? 180.0F : 0.0F;
         } else {
            boolean $$17 = $$5.d($$6).d != 0.0;
            boolean $$18 = $$5.d($$6).f != 0.0;
            $$16 = new ezn($$18 ? $$0.b().d : $$11.d, (double)$$0.v(), $$17 ? $$0.b().f : $$11.f);
         }

         ezn $$20 = $$16.d($$11);
         this.b($$11.e($$20));
         float $$21 = 0.0F;
         boolean $$22 = $$5.b() != $$6.b();
         if ($$22) {
            ezn $$23 = $$0.c().e($$8);
            double $$24 = $$23.f(this.k());
            this.b(this.k().b(0.0, $$24 + 0.1, 0.0));
            $$21 = this.a.x() ? 45.0F : -45.0F;
         } else {
            this.b(this.k().b(0.0, 0.1, 0.0));
         }

         this.a($$10, $$21);
         double $$25 = $$11.f(this.k());
         if ($$25 > 0.0) {
            this.e.add(new cqy.a(this.k(), this.j(), this.p(), this.o(), $$2 ? 0.0F : (float)$$25));
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
      for (cqy.c $$0 = new cqy.c(); $$0.a() && this.a.bM(); $$0.b = false) {
         ezn $$1 = this.j();
         jh $$2 = this.a.q();
         dvj $$3 = this.g().a_($$2);
         boolean $$4 = dht.h($$3);
         if (this.a.cr() != $$4) {
            this.a.a($$4);
            this.a($$2, $$3, false);
         }

         if ($$4) {
            this.a.n();
            this.a.bA();
            if ($$3.a(dig.hh)) {
               this.a.a($$2.u(), $$2.v(), $$2.w(), $$3.c(doa.f));
            }

            dwn $$5 = $$3.c(((dht)$$3.b()).c());
            ezn $$6 = this.a($$1.f(), $$0, $$2, $$3, $$5);
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

         ezn $$7 = this.k();
         ezn $$8 = $$7.d(this.a.bD());
         double $$9 = $$8.g();
         if ($$9 > 1.0E-5F) {
            if (!($$8.j() > 1.0E-5F)) {
               if (!this.a.cr()) {
                  this.a(this.a.aK() ? 0.0F : azk.i(0.2F, this.o(), 0.0F));
               }
            } else {
               float $$10 = 180.0F - (float)(Math.atan2($$8.f, $$8.d) * 180.0 / Math.PI);
               float $$11 = this.a.aK() && !this.a.cr() ? 0.0F : 90.0F - (float)(Math.atan2($$8.i(), $$8.e) * 180.0 / Math.PI);
               $$10 += this.a.x() ? 180.0F : 0.0F;
               $$11 *= this.a.x() ? -1.0F : 1.0F;
               this.a($$10, $$11);
            }

            this.e.add(new cqy.a($$7, this.j(), this.p(), this.o(), (float)Math.min($$9, this.r())));
         } else if ($$1.j() > 0.0) {
            this.e.add(new cqy.a($$7, this.j(), this.p(), this.o(), 1.0F));
         }

         if ($$9 > 1.0E-5F || $$0.b) {
            this.a.aL();
         }
      }
   }

   private ezn a(ezn $$0, cqy.c $$1, jh $$2, dvj $$3, dwn $$4) {
      ezn $$5 = $$0;
      if (!$$1.c) {
         ezn $$6 = this.a($$0, $$4);
         if ($$6.j() != $$0.j()) {
            $$1.c = true;
            $$5 = $$6;
         }
      }

      if ($$1.b) {
         ezn $$7 = this.d($$5);
         if ($$7.j() != $$5.j()) {
            $$1.d = true;
            $$5 = $$7;
         }
      }

      if (!$$1.d) {
         ezn $$8 = this.a($$5, $$3);
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
         ezn $$10 = this.a($$5, $$2, $$3);
         if ($$10.j() != $$5.j()) {
            $$1.e = true;
            $$5 = $$10;
         }
      }

      return $$5;
   }

   private ezn a(ezn $$0, dwn $$1) {
      double $$2 = Math.max(0.0078125, $$0.i() * 0.02);
      if (this.a.bk()) {
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

   private ezn d(ezn $$0) {
      if (this.a.db() instanceof aro $$1) {
         ezn $$3 = $$1.ak();
         if ($$3.h() > 0.0) {
            ezn $$4 = $$3.d();
            double $$5 = $$0.j();
            if ($$4.h() > 0.0 && $$5 < 0.01) {
               return $$0.e(new ezn($$4.d, 0.0, $$4.f).d().c(0.001));
            }
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   private ezn a(ezn $$0, dvj $$1) {
      if ($$1.a(dig.bp) && !$$1.c(doa.f)) {
         return $$0.g() < 0.03 ? ezn.c : $$0.c(0.5);
      } else {
         return $$0;
      }
   }

   private ezn a(ezn $$0, jh $$1, dvj $$2) {
      if ($$2.a(dig.bp) && $$2.c(doa.f)) {
         if ($$0.g() > 0.01) {
            return $$0.d().c($$0.g() + 0.06);
         } else {
            ezn $$3 = this.a.a($$1);
            return $$3.h() <= 0.0 ? $$0 : $$3.c($$0.g() + 0.2);
         }
      } else {
         return $$0;
      }
   }

   @Override
   public double a(jh $$0, dwn $$1, double $$2) {
      if ($$2 < 1.0E-5F) {
         return 0.0;
      } else {
         ezn $$3 = this.k();
         Pair<kl, kl> $$4 = cqk.a($$1);
         kl $$5 = (kl)$$4.getFirst();
         kl $$6 = (kl)$$4.getSecond();
         ezn $$7 = this.j().f();
         if ($$7.g() < 1.0E-5F) {
            this.a(ezn.c);
            return 0.0;
         } else {
            boolean $$8 = $$5.v() != $$6.v();
            ezn $$9 = new ezn($$6).c(0.5).f();
            ezn $$10 = new ezn($$5).c(0.5).f();
            if ($$7.b($$10) < $$7.b($$9)) {
               $$10 = $$9;
            }

            ezn $$11 = $$0.c().e($$10).b(0.0, 0.1, 0.0).e($$10.d().c(1.0E-5F));
            if ($$8 && !this.b($$7, $$1)) {
               $$11 = $$11.b(0.0, 1.0, 0.0);
            }

            ezn $$12 = $$11.d(this.k()).d();
            $$7 = $$12.c($$7.g() / $$12.i());
            ezn $$13 = $$3.e($$7.d().c($$2 * (double)($$8 ? azk.g : 1.0F)));
            if ($$3.g($$11) <= $$3.g($$13)) {
               $$2 = $$11.d($$13).i();
               $$13 = $$11;
            } else {
               $$2 = 0.0;
            }

            this.a.a(bve.a, $$13.d($$3));
            dvj $$14 = this.g().a_(jh.a((ka)$$13));
            if ($$8) {
               if (dht.h($$14)) {
                  dwn $$15 = $$14.c(((dht)$$14.b()).c());
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
               this.a(ezn.c);
               return 0.0;
            } else {
               this.a($$7);
               return $$2;
            }
         }
      }
   }

   private boolean a(dwn $$0, dwn $$1) {
      if (this.j().h() < 0.005 && $$1.b() && this.b(this.j(), $$0) && !this.b(this.j(), $$1)) {
         this.a(ezn.c);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public double r() {
      return (double)this.g().ac().c(dex.Z) * (this.a.bk() ? 0.5 : 1.0) / 20.0;
   }

   private boolean b(ezn $$0, dwn $$1) {
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
      return this.a.cb() ? 0.997 : 0.975;
   }

   @Override
   public boolean i() {
      boolean $$0 = this.a(this.a.cS().c(0.2, 0.0, 0.2));
      if (!this.a.Q && !this.a.R) {
         return false;
      } else {
         boolean $$1 = this.b(this.a.cS().g(1.0E-7));
         return $$0 && !$$1;
      }
   }

   public boolean a(ezi $$0) {
      if (this.a.y() == cqk.a.a && !this.a.cb()) {
         List<bue> $$1 = this.g().a(this.a, $$0, buj.a(this.a));
         if (!$$1.isEmpty()) {
            for (bue $$2 : $$1) {
               if (!($$2 instanceof com) && !($$2 instanceof chd) && !($$2 instanceof cqk) && !this.a.cb() && !$$2.ca()) {
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

   public boolean b(ezi $$0) {
      boolean $$1 = false;
      if (this.a.y() == cqk.a.a) {
         List<bue> $$2 = this.g().a(this.a, $$0, buj.a(this.a));
         if (!$$2.isEmpty()) {
            for (bue $$3 : $$2) {
               if ($$3 instanceof com || $$3 instanceof chd || $$3 instanceof cqk || this.a.cb() || $$3.ca()) {
                  $$3.h(this.a);
                  $$1 = true;
               }
            }
         }
      } else {
         for (bue $$4 : this.g().a_(this.a, $$0)) {
            if (!this.a.y($$4) && $$4.bJ() && $$4 instanceof cqk) {
               $$4.h(this.a);
               $$1 = true;
            }
         }
      }

      return $$1;
   }

   public static record a(ezn c, ezn d, float e, float f, float g) {
      public static final zg<ByteBuf, cqy.a> a = zg.a(ezn.b, cqy.a::a, ezn.b, cqy.a::b, ze.d, cqy.a::c, ze.d, cqy.a::d, ze.j, cqy.a::e, cqy.a::new);
      public static cqy.a b = new cqy.a(ezn.c, ezn.c, 0.0F, 0.0F, 0.0F);

      public ezn a() {
         return this.c;
      }

      public ezn b() {
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

   static record b(float a, cqy.a b, cqy.a c) {
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
