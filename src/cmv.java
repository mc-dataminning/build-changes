import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmv extends cmo {
   @Nullable
   private cmv.b a;

   public cmv(bvi<? extends cmv> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.a = new cmv.b(this);
      this.bT.a(1, new ccp(this));
      this.bT.a(1, new cck(this, this.dW()));
      this.bT.a(3, this.a);
      this.bT.a(4, new cdf(this, 1.0, false));
      this.bT.a(5, new cmv.a(this));
      this.bU.a(1, new cen(this).a());
      this.bU.a(2, new ceo<>(this, cpo.class, true));
   }

   public static bxe.a m() {
      return cmo.gt().a(bxf.s, 8.0).a(bxf.v, 0.25).a(bxf.c, 1.0);
   }

   @Override
   protected bvb.c bg() {
      return bvb.c.c;
   }

   @Override
   protected awu u() {
      return awv.xx;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.xz;
   }

   @Override
   protected awu o_() {
      return awv.xy;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.xA, 0.15F, 1.0F);
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(axm.x)) && this.a != null) {
            this.a.h();
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void h() {
      this.aX = this.dM();
      super.h();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public float a(jh $$0, dhc $$1) {
      return doe.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bvi<cmv> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bvh.a($$2)) {
         return true;
      } else {
         cpo $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cds {
      @Nullable
      private jm i;
      private boolean j;

      public a(cmv $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(ccv.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.O_() != null) {
            return false;
         } else if (!this.b.L().m()) {
            return false;
         } else {
            bac $$0 = this.b.dZ();
            if (a(this.b).O().b(dgv.c) && $$0.a(b(10)) == 0) {
               this.i = jm.b($$0);
               jh $$1 = jh.a(this.b.dB(), this.b.dD() + 0.5, this.b.dH()).a(this.i);
               dxo $$2 = this.b.dW().a_($$1);
               if (doe.o($$2)) {
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
            dha $$0 = this.b.dW();
            jh $$1 = jh.a(this.b.dB(), this.b.dD() + 0.5, this.b.dH()).a(this.i);
            dxo $$2 = $$0.a_($$1);
            if (doe.o($$2)) {
               $$0.a($$1, doe.p($$2), 3);
               this.b.S();
               this.b.at();
            }
         }
      }
   }

   static class b extends ccv {
      private final cmv a;
      private int b;

      public b(cmv $$0) {
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
            dgz $$0 = this.a.dW();
            bac $$1 = this.a.dZ();
            jh $$2 = this.a.dw();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jh $$6 = $$2.b($$4, $$3, $$5);
                     dxo $$7 = $$0.a_($$6);
                     dkd $$8 = $$7.b();
                     if ($$8 instanceof doe) {
                        if (a($$0).O().b(dgv.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((doe)$$8).q($$0.a_($$6)), 3);
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
