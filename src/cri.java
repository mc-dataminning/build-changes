import com.mojang.datafixers.util.Pair;
import io.netty.buffer.ByteBuf;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

public class cri extends crb {
   public static final int b = 3;
   public static final double c = 0.1;
   public static final double d = 0.005;
   @Nullable
   private cri.b i;
   private int j;
   private float k;
   private int l = 0;
   public final List<cri.a> e = new LinkedList<>();
   public final List<cri.a> f = new LinkedList<>();
   public double g = 0.0;
   public cri.a h = cri.a.b;

   public cri(cqt $$0) {
      super($$0);
   }

   @Override
   public void f() {
      if (this.g() instanceof arp $$0) {
         jh var5 = this.a.n();
         dvv $$4 = this.g().a_(var5);
         if (this.a.l()) {
            this.a.a(dif.h($$4));
            this.a(var5, $$4, true);
         }

         this.a.bf();
         this.a.b($$0);
      } else {
         this.t();
         boolean $$1 = dif.h(this.g().a_(this.a.n()));
         this.a.a($$1);
      }
   }

   private void t() {
      if (--this.l <= 0) {
         this.r();
         this.f.clear();
         if (!this.e.isEmpty()) {
            this.f.addAll(this.e);
            this.e.clear();
            this.g = 0.0;

            for (cri.a $$0 : this.f) {
               this.g = this.g + (double)$$0.g;
            }

            this.l = this.g == 0.0 ? 0 : 3;
         }
      }

      if (this.s()) {
         this.b(this.e(1.0F));
         this.a(this.f(1.0F));
         this.a(this.c(1.0F));
         this.b(this.d(1.0F));
      }
   }

   public void r() {
      this.h = new cri.a(this.j(), this.i(), this.o(), this.n(), 0.0F);
   }

   public boolean s() {
      return !this.f.isEmpty();
   }

   public float c(float $$0) {
      cri.b $$1 = this.g($$0);
      return azm.i($$1.a, $$1.c.f, $$1.b.f);
   }

   public float d(float $$0) {
      cri.b $$1 = this.g($$0);
      return azm.i($$1.a, $$1.c.e, $$1.b.e);
   }

   public ezy e(float $$0) {
      cri.b $$1 = this.g($$0);
      return azm.a((double)$$1.a, $$1.c.c, $$1.b.c);
   }

   public ezy f(float $$0) {
      cri.b $$1 = this.g($$0);
      return azm.a((double)$$1.a, $$1.c.d, $$1.b.d);
   }

   private cri.b g(float $$0) {
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

         cri.a $$8 = this.f.get($$5);
         cri.a $$9 = $$5 > 0 ? this.f.get($$5 - 1) : this.h;
         this.i = new cri.b($$3, $$8, $$9);
         this.j = this.l;
         this.k = $$0;
         return this.i;
      }
   }

   public void a(jh $$0, dvv $$1, boolean $$2) {
      if (dif.h($$1)) {
         dwy $$3 = $$1.c(((dif)$$1.b()).c());
         Pair<kl, kl> $$4 = cqt.a($$3);
         ezy $$5 = new ezy((kl)$$4.getFirst()).c(0.5);
         ezy $$6 = new ezy((kl)$$4.getSecond()).c(0.5);
         ezy $$7 = $$5.f();
         ezy $$8 = $$6.f();
         if (this.i().g() > 1.0E-5F && this.i().b($$7) < this.i().b($$8) || this.b($$8, $$3)) {
            ezy $$9 = $$7;
            $$7 = $$8;
            $$8 = $$9;
         }

         float $$10 = 180.0F - (float)(Math.atan2($$7.f, $$7.d) * 180.0 / Math.PI);
         $$10 += this.a.q() ? 180.0F : 0.0F;
         ezy $$11 = this.j();
         boolean $$12 = $$5.a() != $$6.a() && $$5.c() != $$6.c();
         ezy $$16;
         if ($$12) {
            ezy $$13 = $$6.d($$5);
            ezy $$14 = $$11.d($$0.c()).d($$5);
            ezy $$15 = $$13.c($$13.b($$14) / $$13.b($$13));
            $$16 = $$0.c().e($$5).e($$15);
            $$10 = 180.0F - (float)(Math.atan2($$15.f, $$15.d) * 180.0 / Math.PI);
            $$10 += this.a.q() ? 180.0F : 0.0F;
         } else {
            boolean $$17 = $$5.d($$6).d != 0.0;
            boolean $$18 = $$5.d($$6).f != 0.0;
            $$16 = new ezy($$18 ? $$0.b().d : $$11.d, (double)$$0.v(), $$17 ? $$0.b().f : $$11.f);
         }

         ezy $$20 = $$16.d($$11);
         this.b($$11.e($$20));
         float $$21 = 0.0F;
         boolean $$22 = $$5.b() != $$6.b();
         if ($$22) {
            ezy $$23 = $$0.c().e($$8);
            double $$24 = $$23.f(this.j());
            this.b(this.j().b(0.0, $$24 + 0.1, 0.0));
            $$21 = this.a.q() ? 45.0F : -45.0F;
         } else {
            this.b(this.j().b(0.0, 0.1, 0.0));
         }

         this.a($$10, $$21);
         double $$25 = $$11.f(this.j());
         if ($$25 > 0.0) {
            this.e.add(new cri.a(this.j(), this.i(), this.o(), this.n(), $$2 ? 0.0F : (float)$$25));
         }
      }
   }

   private void a(float $$0, float $$1) {
      double $$2 = (double)Math.abs($$0 - this.o());
      if ($$2 >= 175.0 && $$2 <= 185.0) {
         this.a.b(!this.a.q());
         $$0 -= 180.0F;
         $$1 *= -1.0F;
      }

      $$1 = Math.clamp($$1, -45.0F, 45.0F);
      this.a($$1 % 360.0F);
      this.b($$0 % 360.0F);
   }

   @Override
   public void a(arp $$0) {
      for (cri.c $$1 = new cri.c(); $$1.a() && this.a.bL(); $$1.b = false) {
         ezy $$2 = this.i();
         jh $$3 = this.a.n();
         dvv $$4 = this.g().a_($$3);
         boolean $$5 = dif.h($$4);
         if (this.a.cq() != $$5) {
            this.a.a($$5);
            this.a($$3, $$4, false);
         }

         if ($$5) {
            this.a.k();
            this.a.bz();
            if ($$4.a(dis.hh)) {
               this.a.a($$3.u(), $$3.v(), $$3.w(), $$4.c(dom.f));
            }

            dwy $$6 = $$4.c(((dif)$$4.b()).c());
            ezy $$7 = this.a($$0, $$2.f(), $$1, $$3, $$4, $$6);
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

         ezy $$8 = this.j();
         ezy $$9 = $$8.d(this.a.bC());
         double $$10 = $$9.g();
         if ($$10 > 1.0E-5F) {
            if (!($$9.j() > 1.0E-5F)) {
               if (!this.a.cq()) {
                  this.a(this.a.aJ() ? 0.0F : azm.i(0.2F, this.n(), 0.0F));
               }
            } else {
               float $$11 = 180.0F - (float)(Math.atan2($$9.f, $$9.d) * 180.0 / Math.PI);
               float $$12 = this.a.aJ() && !this.a.cq() ? 0.0F : 90.0F - (float)(Math.atan2($$9.i(), $$9.e) * 180.0 / Math.PI);
               $$11 += this.a.q() ? 180.0F : 0.0F;
               $$12 *= this.a.q() ? -1.0F : 1.0F;
               this.a($$11, $$12);
            }

            this.e.add(new cri.a($$8, this.i(), this.o(), this.n(), (float)Math.min($$10, this.b($$0))));
         } else if ($$2.j() > 0.0) {
            this.e.add(new cri.a($$8, this.i(), this.o(), this.n(), 1.0F));
         }

         if ($$10 > 1.0E-5F || $$1.b) {
            this.a.aK();
         }
      }
   }

   private ezy a(arp $$0, ezy $$1, cri.c $$2, jh $$3, dvv $$4, dwy $$5) {
      ezy $$6 = $$1;
      if (!$$2.c) {
         ezy $$7 = this.a($$1, $$5);
         if ($$7.j() != $$1.j()) {
            $$2.c = true;
            $$6 = $$7;
         }
      }

      if ($$2.b) {
         ezy $$8 = this.d($$6);
         if ($$8.j() != $$6.j()) {
            $$2.d = true;
            $$6 = $$8;
         }
      }

      if (!$$2.d) {
         ezy $$9 = this.a($$6, $$4);
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
         ezy $$11 = this.a($$6, $$3, $$4);
         if ($$11.j() != $$6.j()) {
            $$2.e = true;
            $$6 = $$11;
         }
      }

      return $$6;
   }

   private ezy a(ezy $$0, dwy $$1) {
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

   private ezy d(ezy $$0) {
      if (this.a.da() instanceof arq $$1) {
         ezy $$3 = $$1.aj();
         if ($$3.h() > 0.0) {
            ezy $$4 = $$3.d();
            double $$5 = $$0.j();
            if ($$4.h() > 0.0 && $$5 < 0.01) {
               return $$0.e(new ezy($$4.d, 0.0, $$4.f).d().c(0.001));
            }
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   private ezy a(ezy $$0, dvv $$1) {
      if ($$1.a(dis.bp) && !$$1.c(dom.f)) {
         return $$0.g() < 0.03 ? ezy.c : $$0.c(0.5);
      } else {
         return $$0;
      }
   }

   private ezy a(ezy $$0, jh $$1, dvv $$2) {
      if ($$2.a(dis.bp) && $$2.c(dom.f)) {
         if ($$0.g() > 0.01) {
            return $$0.d().c($$0.g() + 0.06);
         } else {
            ezy $$3 = this.a.a($$1);
            return $$3.h() <= 0.0 ? $$0 : $$3.c($$0.g() + 0.2);
         }
      } else {
         return $$0;
      }
   }

   @Override
   public double a(jh $$0, dwy $$1, double $$2) {
      if ($$2 < 1.0E-5F) {
         return 0.0;
      } else {
         ezy $$3 = this.j();
         Pair<kl, kl> $$4 = cqt.a($$1);
         kl $$5 = (kl)$$4.getFirst();
         kl $$6 = (kl)$$4.getSecond();
         ezy $$7 = this.i().f();
         if ($$7.g() < 1.0E-5F) {
            this.a(ezy.c);
            return 0.0;
         } else {
            boolean $$8 = $$5.v() != $$6.v();
            ezy $$9 = new ezy($$6).c(0.5).f();
            ezy $$10 = new ezy($$5).c(0.5).f();
            if ($$7.b($$10) < $$7.b($$9)) {
               $$10 = $$9;
            }

            ezy $$11 = $$0.c().e($$10).b(0.0, 0.1, 0.0).e($$10.d().c(1.0E-5F));
            if ($$8 && !this.b($$7, $$1)) {
               $$11 = $$11.b(0.0, 1.0, 0.0);
            }

            ezy $$12 = $$11.d(this.j()).d();
            $$7 = $$12.c($$7.g() / $$12.i());
            ezy $$13 = $$3.e($$7.d().c($$2 * (double)($$8 ? azm.g : 1.0F)));
            if ($$3.g($$11) <= $$3.g($$13)) {
               $$2 = $$11.d($$13).i();
               $$13 = $$11;
            } else {
               $$2 = 0.0;
            }

            this.a.a(bvl.a, $$13.d($$3));
            dvv $$14 = this.g().a_(jh.a((ka)$$13));
            if ($$8) {
               if (dif.h($$14)) {
                  dwy $$15 = $$14.c(((dif)$$14.b()).c());
                  if (this.a($$1, $$15)) {
                     return 0.0;
                  }
               }

               double $$16 = $$11.f().f(this.j().f());
               double $$17 = $$11.e + (this.b($$7, $$1) ? $$16 : -$$16);
               if (this.j().e < $$17) {
                  this.c(this.j().d, $$17, this.j().f);
               }
            }

            if (this.j().f($$3) < 1.0E-5F && $$13.f($$3) > 1.0E-5F) {
               this.a(ezy.c);
               return 0.0;
            } else {
               this.a($$7);
               return $$2;
            }
         }
      }
   }

   private boolean a(dwy $$0, dwy $$1) {
      if (this.i().h() < 0.005 && $$1.b() && this.b(this.i(), $$0) && !this.b(this.i(), $$1)) {
         this.a(ezy.c);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public double b(arp $$0) {
      return (double)$$0.N().c(dfi.Z) * (this.a.bj() ? 0.5 : 1.0) / 20.0;
   }

   private boolean b(ezy $$0, dwy $$1) {
      return switch ($$1) {
         case c -> $$0.d < 0.0;
         case d -> $$0.d > 0.0;
         case e -> $$0.f > 0.0;
         case f -> $$0.f < 0.0;
         default -> false;
      };
   }

   @Override
   public double q() {
      return this.a.ca() ? 0.997 : 0.975;
   }

   @Override
   public boolean h() {
      boolean $$0 = this.a(this.a.cR().c(0.2, 0.0, 0.2));
      if (!this.a.P && !this.a.Q) {
         return false;
      } else {
         boolean $$1 = this.b(this.a.cR().g(1.0E-7));
         return $$0 && !$$1;
      }
   }

   public boolean a(ezt $$0) {
      if (this.a.A() && !this.a.ca()) {
         List<bul> $$1 = this.g().a(this.a, $$0, buq.a(this.a));
         if (!$$1.isEmpty()) {
            for (bul $$2 : $$1) {
               if (!($$2 instanceof cou) && !($$2 instanceof chk) && !($$2 instanceof cqt) && !this.a.ca() && !$$2.bZ()) {
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

   public boolean b(ezt $$0) {
      boolean $$1 = false;
      if (this.a.A()) {
         List<bul> $$2 = this.g().a(this.a, $$0, buq.a(this.a));
         if (!$$2.isEmpty()) {
            for (bul $$3 : $$2) {
               if ($$3 instanceof cou || $$3 instanceof chk || $$3 instanceof cqt || this.a.ca() || $$3.bZ()) {
                  $$3.h(this.a);
                  $$1 = true;
               }
            }
         }
      } else {
         for (bul $$4 : this.g().a_(this.a, $$0)) {
            if (!this.a.y($$4) && $$4.bI() && $$4 instanceof cqt) {
               $$4.h(this.a);
               $$1 = true;
            }
         }
      }

      return $$1;
   }

   public static record a(ezy c, ezy d, float e, float f, float g) {
      public static final zh<ByteBuf, cri.a> a = zh.a(ezy.b, cri.a::a, ezy.b, cri.a::b, zf.d, cri.a::c, zf.d, cri.a::d, zf.k, cri.a::e, cri.a::new);
      public static cri.a b = new cri.a(ezy.c, ezy.c, 0.0F, 0.0F, 0.0F);

      public ezy a() {
         return this.c;
      }

      public ezy b() {
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

   static record b(float a, cri.a b, cri.a c) {
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
