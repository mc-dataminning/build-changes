import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class csh extends cvi {
   public static final int a = 20;
   public static final int b = 15;

   public csh(cuc.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuh $$0, dca $$1, bso $$2, int $$3) {
      if ($$2 instanceof cly $$4) {
         cuh $$5 = $$4.g($$0);
         if (!$$5.d()) {
            int $$6 = this.b($$0) - $$3;
            float $$7 = a($$6);
            if (!((double)$$7 < 0.1)) {
               List<cuh> $$8 = a($$0, $$5, $$4);
               if (!$$1.x_() && !$$8.isEmpty()) {
                  this.a($$1, $$4, $$4.fF(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dz(), $$4.dB(), $$4.dF(), avo.aL, avq.h, 1.0F, 1.0F / ($$1.F_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(avz.c.b(this));
            }
         }
      }
   }

   @Override
   protected void a(bso $$0, cms $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bso $$6) {
      $$1.a($$0, $$0.dM(), $$0.dK() + $$5, 0.0F, $$3, $$4);
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
   public int b(cuh $$0) {
      return 72000;
   }

   @Override
   public cwk c(cuh $$0) {
      return cwk.e;
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).d();
      if (!$$1.fY() && !$$4) {
         return bqb.d($$3);
      } else {
         $$1.c($$2);
         return bqb.b($$3);
      }
   }

   @Override
   public Predicate<cuh> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
