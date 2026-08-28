import java.util.EnumSet;
import javax.annotation.Nullable;

public class clh extends cla {
   @Nullable
   private clh.b b;

   public clh(btv<? extends clh> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.b = new clh.b(this);
      this.bS.a(1, new cbb(this));
      this.bS.a(1, new caw(this, this.dS()));
      this.bS.a(3, this.b);
      this.bS.a(4, new cbr(this, 1.0, false));
      this.bS.a(5, new clh.a(this));
      this.bT.a(1, new ccz(this).a());
      this.bT.a(2, new cda<>(this, cnu.class, true));
   }

   public static bvq.a q() {
      return cla.gv().a(bvr.s, 8.0).a(bvr.v, 0.25).a(bvr.c, 1.0);
   }

   @Override
   protected bto.b bf() {
      return bto.b.c;
   }

   @Override
   protected awd w() {
      return awe.wY;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.xa;
   }

   @Override
   protected awd n_() {
      return awe.wZ;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.xb, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bsg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(awv.x)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aT = this.dI();
      super.l();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public float a(je $$0, dej $$1) {
      return dli.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(btv<clh> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (btu.a($$2)) {
         return true;
      } else {
         cnu $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cce {
      @Nullable
      private jj i;
      private boolean j;

      public a(clh $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.m() != null) {
            return false;
         } else if (!this.b.P().m()) {
            return false;
         } else {
            azl $$0 = this.b.dV();
            if (this.b.dS().ac().b(dec.c) && $$0.a(b(10)) == 0) {
               this.i = jj.b($$0);
               je $$1 = je.a(this.b.dx(), this.b.dz() + 0.5, this.b.dD()).a(this.i);
               duo $$2 = this.b.dS().a_($$1);
               if (dli.o($$2)) {
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
            deh $$0 = this.b.dS();
            je $$1 = je.a(this.b.dx(), this.b.dz() + 0.5, this.b.dD()).a(this.i);
            duo $$2 = $$0.a_($$1);
            if (dli.o($$2)) {
               $$0.a($$1, dli.p($$2), 3);
               this.b.V();
               this.b.as();
            }
         }
      }
   }

   static class b extends cbh {
      private final clh a;
      private int b;

      public b(clh $$0) {
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
            deg $$0 = this.a.dS();
            azl $$1 = this.a.dV();
            je $$2 = this.a.ds();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     je $$6 = $$2.b($$4, $$3, $$5);
                     duo $$7 = $$0.a_($$6);
                     dhj $$8 = $$7.b();
                     if ($$8 instanceof dli) {
                        if ($$0.ac().b(dec.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dli)$$8).q($$0.a_($$6)), 3);
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
