import java.util.EnumSet;
import javax.annotation.Nullable;

public class cov extends coo {
   @Nullable
   private cov.b a;

   public cov(bwr<? extends cov> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.a = new cov.b(this);
      this.bD.a(1, new cdz(this));
      this.bD.a(1, new cdu(this, this.dU()));
      this.bD.a(3, this.a);
      this.bD.a(4, new cep(this, 1.0, false));
      this.bD.a(5, new cov.a(this));
      this.bE.a(1, new cfx(this).a());
      this.bE.a(2, new cfy<>(this, crm.class, true));
   }

   public static byo.a j() {
      return coo.gw().a(byp.s, 8.0).a(byp.v, 0.25).a(byp.c, 1.0);
   }

   @Override
   protected bwi.c be() {
      return bwi.c.c;
   }

   @Override
   protected awm u() {
      return awn.xN;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.xP;
   }

   @Override
   protected awm l_() {
      return awn.xO;
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(awn.xQ, 0.15F, 1.0F);
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(axd.x)) && this.a != null) {
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
   public float a(iv $$0, djp $$1) {
      return dqv.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bwr<cov> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bwq.a($$2)) {
         return true;
      } else {
         crm $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cfc {
      @Nullable
      private jb i;
      private boolean j;

      public a(cov $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cef.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.f() != null) {
            return false;
         } else if (!this.b.O().k()) {
            return false;
         } else {
            azv $$0 = this.b.dX();
            if (a(this.b).O().c(dji.d) && $$0.a(b(10)) == 0) {
               this.i = jb.b($$0);
               iv $$1 = iv.a(this.b.dz(), this.b.dB() + 0.5, this.b.dF()).a(this.i);
               eat $$2 = this.b.dU().a_($$1);
               if (dqv.o($$2)) {
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
            djn $$0 = this.b.dU();
            iv $$1 = iv.a(this.b.dz(), this.b.dB() + 0.5, this.b.dF()).a(this.i);
            eat $$2 = $$0.a_($$1);
            if (dqv.o($$2)) {
               $$0.a($$1, dqv.p($$2), 3);
               this.b.U();
               this.b.aq();
            }
         }
      }
   }

   static class b extends cef {
      private final cov a;
      private int b;

      public b(cov $$0) {
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
            djm $$0 = this.a.dU();
            azv $$1 = this.a.dX();
            iv $$2 = this.a.du();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     iv $$6 = $$2.b($$4, $$3, $$5);
                     eat $$7 = $$0.a_($$6);
                     dmr $$8 = $$7.b();
                     if ($$8 instanceof dqv) {
                        if (a($$0).O().c(dji.d)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dqv)$$8).q($$0.a_($$6)), 3);
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
