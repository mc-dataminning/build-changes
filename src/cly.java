import java.util.EnumSet;
import javax.annotation.Nullable;

public class cly extends clr {
   @Nullable
   private cly.b b;

   public cly(bul<? extends cly> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.b = new cly.b(this);
      this.bS.a(1, new cbs(this));
      this.bS.a(1, new cbn(this, this.dX()));
      this.bS.a(3, this.b);
      this.bS.a(4, new cci(this, 1.0, false));
      this.bS.a(5, new cly.a(this));
      this.bT.a(1, new cdq(this).a());
      this.bT.a(2, new cdr<>(this, com.class, true));
   }

   public static bwh.a q() {
      return clr.gA().a(bwi.s, 8.0).a(bwi.v, 0.25).a(bwi.c, 1.0);
   }

   @Override
   protected bue.b bh() {
      return bue.b.c;
   }

   @Override
   protected awk w() {
      return awl.wW;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.wY;
   }

   @Override
   protected awk o_() {
      return awl.wX;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.wZ, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(axc.x)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aX = this.dN();
      super.l();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public float a(jh $$0, dfe $$1) {
      return dmc.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bul<cly> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (buk.a($$2)) {
         return true;
      } else {
         com $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends ccv {
      @Nullable
      private jm i;
      private boolean j;

      public a(cly $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cby.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.m() != null) {
            return false;
         } else if (!this.b.P().m()) {
            return false;
         } else {
            azs $$0 = this.b.ea();
            if (this.b.dX().ac().b(dex.c) && $$0.a(b(10)) == 0) {
               this.i = jm.b($$0);
               jh $$1 = jh.a(this.b.dC(), this.b.dE() + 0.5, this.b.dI()).a(this.i);
               dvj $$2 = this.b.dX().a_($$1);
               if (dmc.o($$2)) {
                  this.j = true;
                  return true;
               }
            }

            this.j = false;
            return super.b();
         }
      }

      @Override
      public boolean c() {
         return this.j ? false : super.c();
      }

      @Override
      public void d() {
         if (!this.j) {
            super.d();
         } else {
            dfc $$0 = this.b.dX();
            jh $$1 = jh.a(this.b.dC(), this.b.dE() + 0.5, this.b.dI()).a(this.i);
            dvj $$2 = $$0.a_($$1);
            if (dmc.o($$2)) {
               $$0.a($$1, dmc.p($$2), 3);
               this.b.V();
               this.b.av();
            }
         }
      }
   }

   static class b extends cby {
      private final cly a;
      private int b;

      public b(cly $$0) {
         this.a = $$0;
      }

      public void h() {
         if (this.b == 0) {
            this.b = this.a(20);
         }
      }

      @Override
      public boolean b() {
         return this.b > 0;
      }

      @Override
      public void a() {
         this.b--;
         if (this.b <= 0) {
            dfb $$0 = this.a.dX();
            azs $$1 = this.a.ea();
            jh $$2 = this.a.dx();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jh $$6 = $$2.b($$4, $$3, $$5);
                     dvj $$7 = $$0.a_($$6);
                     die $$8 = $$7.b();
                     if ($$8 instanceof dmc) {
                        if ($$0.ac().b(dex.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dmc)$$8).q($$0.a_($$6)), 3);
                        }

                        if ($$1.h()) {
                           return;
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
