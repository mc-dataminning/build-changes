import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class csn extends cvd {
   public static final int a = 20;
   public static final int b = 15;

   public csn(cuf.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuk $$0, dbt $$1, btk $$2, int $$3) {
      if ($$2 instanceof cms $$4) {
         cuk $$5 = $$4.g($$0);
         if (!$$5.e()) {
            int $$6 = this.b($$0) - $$3;
            float $$7 = a($$6);
            if (!((double)$$7 < 0.1)) {
               List<cuk> $$8 = a($$0, $$5, $$4);
               if (!$$1.x_() && !$$8.isEmpty()) {
                  this.a($$1, $$4, $$4.fw(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.du(), $$4.dw(), $$4.dA(), avw.aG, avx.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(awg.c.b(this));
            }
         }
      }
   }

   @Override
   protected void a(btk $$0, cnk $$1, int $$2, float $$3, float $$4, float $$5, @Nullable btk $$6) {
      $$1.a($$0, $$0.dH(), $$0.dF() + $$5, 0.0F, $$3, $$4);
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
   public int b(cuk $$0) {
      return 72000;
   }

   @Override
   public cwf c(cuk $$0) {
      return cwf.e;
   }

   @Override
   public bqq<cuk> a(dbt $$0, cms $$1, bqo $$2) {
      cuk $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).e();
      if (!$$1.fP() && !$$4) {
         return bqq.d($$3);
      } else {
         $$1.c($$2);
         return bqq.b($$3);
      }
   }

   @Override
   public Predicate<cuk> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
