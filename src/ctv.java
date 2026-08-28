import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ctv extends cwl {
   public static final int a = 20;
   public static final int b = 15;

   public ctv(cvk.a $$0) {
      super($$0);
   }

   @Override
   public void a(cvp $$0, deg $$1, buk $$2, int $$3) {
      if ($$2 instanceof cnu $$4) {
         cvp $$5 = $$4.f($$0);
         if (!$$5.f()) {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if (!((double)$$7 < 0.1)) {
               List<cvp> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof arh $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.fw(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dx(), $$4.dz(), $$4.dD(), awe.aG, awf.h, 1.0F, 1.0F / ($$1.C_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(awo.c.b(this));
            }
         }
      }
   }

   @Override
   protected void a(buk $$0, coo $$1, int $$2, float $$3, float $$4, float $$5, @Nullable buk $$6) {
      $$1.a($$0, $$0.dK(), $$0.dI() + $$5, 0.0F, $$3, $$4);
   }

   public static float a(int $$0) {
      float $$1 = (float)$$0 / 20.0F;
      $$1 = ($$1 * $$1 + $$1 * 2.0F) / 3.0F;
      if ($$1 > 1.0F) {
         $$1 = 1.0F;
      }

      return $$1;
   }

   @Override
   public int a(cvp $$0, buk $$1) {
      return 72000;
   }

   @Override
   public cvr a(cvp $$0) {
      return cvr.e;
   }

   @Override
   public brp a(deg $$0, cnu $$1, bro $$2) {
      cvp $$3 = $$1.b($$2);
      boolean $$4 = !$$1.f($$3).f();
      if (!$$1.fQ() && !$$4) {
         return brp.d;
      } else {
         $$1.c($$2);
         return brp.c;
      }
   }

   @Override
   public Predicate<cvp> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
