import com.mojang.datafixers.util.Pair;
import io.netty.buffer.ByteBuf;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

public class cvk extends cvd {
   public static final int b = 3;
   public static final double c = 0.1;
   public static final double d = 0.005;
   @Nullable
   private cvk.b i;
   private int j;
   private float k;
   private int l = 0;
   public final List<cvk.a> e = new LinkedList<>();
   public final List<cvk.a> f = new LinkedList<>();
   public double g = 0.0;
   public cvk.a h = cvk.a.b;

   public cvk(cuv $$0) {
      super($$0);
   }

   @Override
   public void b() {
      if (this.c() instanceof asb $$0) {
         iw var5 = this.a.j();
         ebq $$4 = this.c().a_(var5);
         if (this.a.g()) {
            this.a.a(dnd.h($$4));
            this.a(var5, $$4, true);
         }

         this.a.be();
         this.a.b($$0);
      } else {
         this.p();
         boolean $$1 = dnd.h(this.c().a_(this.a.j()));
         this.a.a($$1);
      }
   }

   private void p() {
      if (--this.l <= 0) {
         this.n();
         this.f.clear();
         if (!this.e.isEmpty()) {
            this.f.addAll(this.e);
            this.e.clear();
            this.g = 0.0;

            for (cvk.a $$0 : this.f) {
               this.g = this.g + (double)$$0.g;
            }

            this.l = this.g == 0.0 ? 0 : 3;
         }
      }

      if (this.o()) {
         this.b(this.e(1.0F));
         this.a(this.f(1.0F));
         this.a(this.c(1.0F));
         this.b(this.d(1.0F));
      }
   }

   public void n() {
      this.h = new cvk.a(this.f(), this.e(), this.k(), this.j(), 0.0F);
   }

   public boolean o() {
      return !this.f.isEmpty();
   }

   public float c(float $$0) {
      cvk.b $$1 = this.g($$0);
      return azz.i($$1.a, $$1.c.f, $$1.b.f);
   }

   public float d(float $$0) {
      cvk.b $$1 = this.g($$0);
      return azz.i($$1.a, $$1.c.e, $$1.b.e);
   }

   public fgc e(float $$0) {
      cvk.b $$1 = this.g($$0);
      return azz.a((double)$$1.a, $$1.c.c, $$1.b.c);
   }

   public fgc f(float $$0) {
      cvk.b $$1 = this.g($$0);
      return azz.a((double)$$1.a, $$1.c.d, $$1.b.d);
   }

   private cvk.b g(float $$0) {
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

         cvk.a $$8 = this.f.get($$5);
         cvk.a $$9 = $$5 > 0 ? this.f.get($$5 - 1) : this.h;
         this.i = new cvk.b($$3, $$8, $$9);
         this.j = this.l;
         this.k = $$0;
         return this.i;
      }
   }

   public void a(iw $$0, ebq $$1, boolean $$2) {
      if (dnd.h($$1)) {
         ecu $$3 = $$1.c(((dnd)$$1.b()).c());
         Pair<kb, kb> $$4 = cuv.a($$3);
         fgc $$5 = new fgc((kb)$$4.getFirst()).c(0.5);
         fgc $$6 = new fgc((kb)$$4.getSecond()).c(0.5);
         fgc $$7 = $$5.f();
         fgc $$8 = $$6.f();
         if (this.e().g() > 1.0E-5F && this.e().b($$7) < this.e().b($$8) || this.b($$8, $$3)) {
            fgc $$9 = $$7;
            $$7 = $$8;
            $$8 = $$9;
         }

         float $$10 = 180.0F - (float)(Math.atan2($$7.f, $$7.d) * 180.0 / Math.PI);
         $$10 += this.a.m() ? 180.0F : 0.0F;
         fgc $$11 = this.f();
         boolean $$12 = $$5.a() != $$6.a() && $$5.c() != $$6.c();
         fgc $$16;
         if ($$12) {
            fgc $$13 = $$6.d($$5);
            fgc $$14 = $$11.d($$0.c()).d($$5);
            fgc $$15 = $$13.c($$13.b($$14) / $$13.b($$13));
            $$16 = $$0.c().e($$5).e($$15);
            $$10 = 180.0F - (float)(Math.atan2($$15.f, $$15.d) * 180.0 / Math.PI);
            $$10 += this.a.m() ? 180.0F : 0.0F;
         } else {
            boolean $$17 = $$5.d($$6).d != 0.0;
            boolean $$18 = $$5.d($$6).f != 0.0;
            $$16 = new fgc($$18 ? $$0.b().d : $$11.d, (double)$$0.v(), $$17 ? $$0.b().f : $$11.f);
         }

         fgc $$20 = $$16.d($$11);
         this.b($$11.e($$20));
         float $$21 = 0.0F;
         boolean $$22 = $$5.b() != $$6.b();
         if ($$22) {
            fgc $$23 = $$0.c().e($$8);
            double $$24 = $$23.f(this.f());
            this.b(this.f().b(0.0, $$24 + 0.1, 0.0));
            $$21 = this.a.m() ? 45.0F : -45.0F;
         } else {
            this.b(this.f().b(0.0, 0.1, 0.0));
         }

         this.a($$10, $$21);
         double $$25 = $$11.f(this.f());
         if ($$25 > 0.0) {
            this.e.add(new cvk.a(this.f(), this.e(), this.k(), this.j(), $$2 ? 0.0F : (float)$$25));
         }
      }
   }

   private void a(float $$0, float $$1) {
      double $$2 = (double)Math.abs($$0 - this.k());
      if ($$2 >= 175.0 && $$2 <= 185.0) {
         this.a.b(!this.a.m());
         $$0 -= 180.0F;
         $$1 *= -1.0F;
      }

      $$1 = Math.clamp($$1, -45.0F, 45.0F);
      this.a($$1 % 360.0F);
      this.b($$0 % 360.0F);
   }

   @Override
   public void a(asb $$0) {
      for (cvk.c $$1 = new cvk.c(); $$1.a() && this.a.bJ(); $$1.b = false) {
         fgc $$2 = this.e();
         iw $$3 = this.a.j();
         ebq $$4 = this.c().a_($$3);
         boolean $$5 = dnd.h($$4);
         if (this.a.cp() != $$5) {
            this.a.a($$5);
            this.a($$3, $$4, false);
         }

         if ($$5) {
            this.a.k();
            this.a.bx();
            if ($$4.a(dnq.hI)) {
               this.a.a($$3.u(), $$3.v(), $$3.w(), $$4.c(dtr.d));
            }

            ecu $$6 = $$4.c(((dnd)$$4.b()).c());
            fgc $$7 = this.a($$0, $$2.f(), $$1, $$3, $$4, $$6);
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

         fgc $$8 = this.f();
         fgc $$9 = $$8.d(this.a.bA());
         double $$10 = $$9.g();
         if ($$10 > 1.0E-5F) {
            if (!($$9.j() > 1.0E-5F)) {
               if (!this.a.cp()) {
                  this.a(this.a.aH() ? 0.0F : azz.i(0.2F, this.j(), 0.0F));
               }
            } else {
               float $$11 = 180.0F - (float)(Math.atan2($$9.f, $$9.d) * 180.0 / Math.PI);
               float $$12 = this.a.aH() && !this.a.cp() ? 0.0F : 90.0F - (float)(Math.atan2($$9.i(), $$9.e) * 180.0 / Math.PI);
               $$11 += this.a.m() ? 180.0F : 0.0F;
               $$12 *= this.a.m() ? -1.0F : 1.0F;
               this.a($$11, $$12);
            }

            this.e.add(new cvk.a($$8, this.e(), this.k(), this.j(), (float)Math.min($$10, this.b($$0))));
         } else if ($$2.j() > 0.0) {
            this.e.add(new cvk.a($$8, this.e(), this.k(), this.j(), 1.0F));
         }

         if ($$10 > 1.0E-5F || $$1.b) {
            this.a.aI();
            this.a.aI();
         }
      }
   }

   private fgc a(asb $$0, fgc $$1, cvk.c $$2, iw $$3, ebq $$4, ecu $$5) {
      fgc $$6 = $$1;
      if (!$$2.c) {
         fgc $$7 = this.a($$1, $$5);
         if ($$7.j() != $$1.j()) {
            $$2.c = true;
            $$6 = $$7;
         }
      }

      if ($$2.b) {
         fgc $$8 = this.d($$6);
         if ($$8.j() != $$6.j()) {
            $$2.d = true;
            $$6 = $$8;
         }
      }

      if (!$$2.d) {
         fgc $$9 = this.a($$6, $$4);
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
         fgc $$11 = this.a($$6, $$3, $$4);
         if ($$11.j() != $$6.j()) {
            $$2.e = true;
            $$6 = $$11;
         }
      }

      return $$6;
   }

   private fgc a(fgc $$0, ecu $$1) {
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

   private fgc d(fgc $$0) {
      if (this.a.cZ() instanceof asc $$1) {
         fgc $$3 = $$1.ag();
         if ($$3.h() > 0.0) {
            fgc $$4 = $$3.d();
            double $$5 = $$0.j();
            if ($$4.h() > 0.0 && $$5 < 0.01) {
               return $$0.e(new fgc($$4.d, 0.0, $$4.f).d().c(0.001));
            }
         }

         return $$0;
      } else {
         return $$0;
      }
   }

   private fgc a(fgc $$0, ebq $$1) {
      if ($$1.a(dnq.bw) && !$$1.c(dtr.d)) {
         return $$0.g() < 0.03 ? fgc.c : $$0.c(0.5);
      } else {
         return $$0;
      }
   }

   private fgc a(fgc $$0, iw $$1, ebq $$2) {
      if ($$2.a(dnq.bw) && $$2.c(dtr.d)) {
         if ($$0.g() > 0.01) {
            return $$0.d().c($$0.g() + 0.06);
         } else {
            fgc $$3 = this.a.a($$1);
            return $$3.h() <= 0.0 ? $$0 : $$3.c($$0.g() + 0.2);
         }
      } else {
         return $$0;
      }
   }

   @Override
   public double a(iw $$0, ecu $$1, double $$2) {
      if ($$2 < 1.0E-5F) {
         return 0.0;
      } else {
         fgc $$3 = this.f();
         Pair<kb, kb> $$4 = cuv.a($$1);
         kb $$5 = (kb)$$4.getFirst();
         kb $$6 = (kb)$$4.getSecond();
         fgc $$7 = this.e().f();
         if ($$7.g() < 1.0E-5F) {
            this.a(fgc.c);
            return 0.0;
         } else {
            boolean $$8 = $$5.v() != $$6.v();
            fgc $$9 = new fgc($$6).c(0.5).f();
            fgc $$10 = new fgc($$5).c(0.5).f();
            if ($$7.b($$10) < $$7.b($$9)) {
               $$10 = $$9;
            }

            fgc $$11 = $$0.c().e($$10).b(0.0, 0.1, 0.0).e($$10.d().c(1.0E-5F));
            if ($$8 && !this.b($$7, $$1)) {
               $$11 = $$11.b(0.0, 1.0, 0.0);
            }

            fgc $$12 = $$11.d(this.f()).d();
            $$7 = $$12.c($$7.g() / $$12.i());
            fgc $$13 = $$3.e($$7.d().c($$2 * (double)($$8 ? azz.g : 1.0F)));
            if ($$3.g($$11) <= $$3.g($$13)) {
               $$2 = $$11.d($$13).i();
               $$13 = $$11;
            } else {
               $$2 = 0.0;
            }

            this.a.a(byj.a, $$13.d($$3));
            ebq $$14 = this.c().a_(iw.a((jq)$$13));
            if ($$8) {
               if (dnd.h($$14)) {
                  ecu $$15 = $$14.c(((dnd)$$14.b()).c());
                  if (this.a($$1, $$15)) {
                     return 0.0;
                  }
               }

               double $$16 = $$11.f().f(this.f().f());
               double $$17 = $$11.e + (this.b($$7, $$1) ? $$16 : -$$16);
               if (this.f().e < $$17) {
                  this.c(this.f().d, $$17, this.f().f);
               }
            }

            if (this.f().f($$3) < 1.0E-5F && $$13.f($$3) > 1.0E-5F) {
               this.a(fgc.c);
               return 0.0;
            } else {
               this.a($$7);
               return $$2;
            }
         }
      }
   }

   private boolean a(ecu $$0, ecu $$1) {
      if (this.e().h() < 0.005 && $$1.b() && this.b(this.e(), $$0) && !this.b(this.e(), $$1)) {
         this.a(fgc.c);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public double b(asb $$0) {
      return (double)$$0.O().d(dkf.ab) * (this.a.bi() ? 0.5 : 1.0) / 20.0;
   }

   private boolean b(fgc $$0, ecu $$1) {
      return switch ($$1) {
         case c -> $$0.d < 0.0;
         case d -> $$0.d > 0.0;
         case e -> $$0.f > 0.0;
         case f -> $$0.f < 0.0;
         default -> false;
      };
   }

   @Override
   public double m() {
      return this.a.bZ() ? 0.997 : 0.975;
   }

   @Override
   public boolean d() {
      boolean $$0 = this.a(this.a.cR().c(0.2, 0.0, 0.2));
      if (!this.a.P && !this.a.Q) {
         return false;
      } else {
         boolean $$1 = this.b(this.a.cR().g(1.0E-7));
         return $$0 && !$$1;
      }
   }

   public boolean a(ffx $$0) {
      if (this.a.y() && !this.a.bZ()) {
         List<bxe> $$1 = this.c().a(this.a, $$0, bxl.a(this.a));
         if (!$$1.isEmpty()) {
            for (bxe $$2 : $$1) {
               if (!($$2 instanceof csi) && !($$2 instanceof ckl) && !($$2 instanceof cuv) && !this.a.bZ() && !$$2.bY()) {
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

   public boolean b(ffx $$0) {
      boolean $$1 = false;
      if (this.a.y()) {
         List<bxe> $$2 = this.c().a(this.a, $$0, bxl.a(this.a));
         if (!$$2.isEmpty()) {
            for (bxe $$3 : $$2) {
               if ($$3 instanceof csi || $$3 instanceof ckl || $$3 instanceof cuv || this.a.bZ() || $$3.bY()) {
                  $$3.h(this.a);
                  $$1 = true;
               }
            }
         }
      } else {
         for (bxe $$4 : this.c().a_(this.a, $$0)) {
            if (!this.a.y($$4) && $$4.bG() && $$4 instanceof cuv) {
               $$4.h(this.a);
               $$1 = true;
            }
         }
      }

      return $$1;
   }

   public static record a(fgc c, fgc d, float e, float f, float g) {
      public static final ze<ByteBuf, cvk.a> a = ze.a(fgc.b, cvk.a::a, fgc.b, cvk.a::b, zc.d, cvk.a::c, zc.d, cvk.a::d, zc.l, cvk.a::e, cvk.a::new);
      public static cvk.a b = new cvk.a(fgc.c, fgc.c, 0.0F, 0.0F, 0.0F);

      public fgc a() {
         return this.c;
      }

      public fgc b() {
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

   static record b(float a, cvk.a b, cvk.a c) {
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
