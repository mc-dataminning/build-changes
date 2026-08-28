import java.util.EnumSet;
import javax.annotation.Nullable;

public class clc extends ckv {
   @Nullable
   private clc.b b;

   public clc(btq<? extends clc> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.b = new clc.b(this);
      this.bT.a(1, new caw(this));
      this.bT.a(1, new car(this, this.dS()));
      this.bT.a(3, this.b);
      this.bT.a(4, new cbm(this, 1.0, false));
      this.bT.a(5, new clc.a(this));
      this.bU.a(1, new ccu(this).a());
      this.bU.a(2, new ccv<>(this, cnp.class, true));
   }

   public static bvl.a q() {
      return ckv.gu().a(bvm.s, 8.0).a(bvm.v, 0.25).a(bvm.c, 1.0);
   }

   @Override
   protected btj.b bf() {
      return btj.b.c;
   }

   @Override
   protected awc w() {
      return awd.wY;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.xa;
   }

   @Override
   protected awc n_() {
      return awd.wZ;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.xb, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(awu.x)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aU = this.dI();
      super.l();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public float a(je $$0, ddv $$1) {
      return dku.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(btq<clc> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (btp.a($$2)) {
         return true;
      } else {
         cnp $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cbz {
      @Nullable
      private jj i;
      private boolean j;

      public a(clc $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cbc.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.m() != null) {
            return false;
         } else if (!this.b.P().m()) {
            return false;
         } else {
            azk $$0 = this.b.dV();
            if (this.b.dS().ac().b(ddo.c) && $$0.a(b(10)) == 0) {
               this.i = jj.b($$0);
               je $$1 = je.a(this.b.dx(), this.b.dz() + 0.5, this.b.dD()).a(this.i);
               dua $$2 = this.b.dS().a_($$1);
               if (dku.o($$2)) {
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
            ddt $$0 = this.b.dS();
            je $$1 = je.a(this.b.dx(), this.b.dz() + 0.5, this.b.dD()).a(this.i);
            dua $$2 = $$0.a_($$1);
            if (dku.o($$2)) {
               $$0.a($$1, dku.p($$2), 3);
               this.b.V();
               this.b.as();
            }
         }
      }
   }

   static class b extends cbc {
      private final clc a;
      private int b;

      public b(clc $$0) {
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
            dds $$0 = this.a.dS();
            azk $$1 = this.a.dV();
            je $$2 = this.a.ds();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     je $$6 = $$2.b($$4, $$3, $$5);
                     dua $$7 = $$0.a_($$6);
                     dgv $$8 = $$7.b();
                     if ($$8 instanceof dku) {
                        if ($$0.ac().b(ddo.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dku)$$8).q($$0.a_($$6)), 3);
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
