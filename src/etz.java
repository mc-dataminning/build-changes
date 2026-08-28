import java.util.Optional;
import javax.annotation.Nullable;

public abstract class etz extends etu {
   public static final float e = 0.44444445F;

   @Override
   public etv d() {
      return etx.d;
   }

   @Override
   public etv e() {
      return etx.e;
   }

   @Override
   public cxd a() {
      return cxl.rj;
   }

   @Override
   public void a(dgz $$0, ji $$1, etw $$2, azh $$3) {
      ji $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lt.ab, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awa.ou, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awa.os, awb.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(ard $$0, ji $$1, etw $$2, azh $$3) {
      if ($$0.O().b(dgv.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            ji $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dxq $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((dhc)$$0, $$5)) {
                     $$0.b($$5, djr.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               ji $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.d()) && this.b($$0, $$9)) {
                  $$0.b($$9.d(), djr.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dhc $$0, ji $$1) {
      for (jn $$2 : jn.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dhc $$0, ji $$1) {
      return $$0.d($$1.v()) && !$$0.B($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lr h() {
      return lt.i;
   }

   @Override
   protected void a(dha $$0, ji $$1, dxq $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dhc $$0) {
      return $$0.B_().i() ? 4 : 2;
   }

   @Override
   public dxq b(etw $$0) {
      return dkg.K.m().b(doy.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(etv $$0) {
      return $$0 == etx.e || $$0 == etx.d;
   }

   @Override
   public int c(dhc $$0) {
      return $$0.B_().i() ? 1 : 2;
   }

   @Override
   public boolean a(etw $$0, dgf $$1, ji $$2, etv $$3, jn $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awv.a);
   }

   @Override
   public int a(dhc $$0) {
      return $$0.B_().i() ? 10 : 30;
   }

   @Override
   public int a(dgz $$0, ji $$1, etw $$2, etw $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.C_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dha $$0, ji $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(ard $$0) {
      return $$0.O().b(dgv.W);
   }

   @Override
   protected void a(dha $$0, ji $$1, dxq $$2, jn $$3, etw $$4) {
      if ($$3 == jn.a) {
         etw $$5 = $$0.b_($$1);
         if (this.a(awv.b) && $$5.a(awv.a)) {
            if ($$2.b() instanceof doy) {
               $$0.a($$1, dkg.b.m(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<avz> j() {
      return Optional.of(awa.dm);
   }

   public static class a extends etz {
      @Override
      protected void a(dxr.a<etv, etw> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(etw $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(etw $$0) {
         return false;
      }
   }

   public static class b extends etz {
      @Override
      public int d(etw $$0) {
         return 8;
      }

      @Override
      public boolean c(etw $$0) {
         return true;
      }
   }
}
