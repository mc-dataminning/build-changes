import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmz extends cms {
   @Nullable
   private cmz.b a;

   public cmz(bvi<? extends cmz> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.a = new cmz.b(this);
      this.bC.a(1, new ccq(this));
      this.bC.a(1, new ccl(this, this.dU()));
      this.bC.a(3, this.a);
      this.bC.a(4, new cdg(this, 1.0, false));
      this.bC.a(5, new cmz.a(this));
      this.bD.a(1, new ceo(this).a());
      this.bD.a(2, new cep<>(this, cpr.class, true));
   }

   public static bxf.a j() {
      return cms.gv().a(bxg.s, 8.0).a(bxg.v, 0.25).a(bxg.c, 1.0);
   }

   @Override
   protected bva.c bg() {
      return bva.c.c;
   }

   @Override
   protected avz u() {
      return awa.xH;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.xJ;
   }

   @Override
   protected avz l_() {
      return awa.xI;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.xK, 0.15F, 1.0F);
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(awr.x)) && this.a != null) {
            this.a.h();
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void h() {
      this.aV = this.dK();
      super.h();
   }

   @Override
   public void s(float $$0) {
      this.w($$0);
      super.s($$0);
   }

   @Override
   public float a(ji $$0, dhc $$1) {
      return dog.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bvi<cmz> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bvh.a($$2)) {
         return true;
      } else {
         cpr $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cdt {
      @Nullable
      private jn i;
      private boolean j;

      public a(cmz $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(ccw.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.f() != null) {
            return false;
         } else if (!this.b.O().k()) {
            return false;
         } else {
            azh $$0 = this.b.dX();
            if (a(this.b).O().b(dgv.c) && $$0.a(b(10)) == 0) {
               this.i = jn.b($$0);
               ji $$1 = ji.a(this.b.dz(), this.b.dB() + 0.5, this.b.dF()).a(this.i);
               dxq $$2 = this.b.dU().a_($$1);
               if (dog.o($$2)) {
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
            dha $$0 = this.b.dU();
            ji $$1 = ji.a(this.b.dz(), this.b.dB() + 0.5, this.b.dF()).a(this.i);
            dxq $$2 = $$0.a_($$1);
            if (dog.o($$2)) {
               $$0.a($$1, dog.p($$2), 3);
               this.b.U();
               this.b.at();
            }
         }
      }
   }

   static class b extends ccw {
      private final cmz a;
      private int b;

      public b(cmz $$0) {
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
            dgz $$0 = this.a.dU();
            azh $$1 = this.a.dX();
            ji $$2 = this.a.du();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ji $$6 = $$2.b($$4, $$3, $$5);
                     dxq $$7 = $$0.a_($$6);
                     dke $$8 = $$7.b();
                     if ($$8 instanceof dog) {
                        if (a($$0).O().b(dgv.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dog)$$8).q($$0.a_($$6)), 3);
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
