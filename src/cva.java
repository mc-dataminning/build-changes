import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cva extends cxm {
   public static final int a = 20;
   public static final int b = 15;

   public cva(cwm.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cwq $$0, dgj $$1, bvi $$2, int $$3) {
      if (!($$2 instanceof coy $$4)) {
         return false;
      } else {
         cwq $$5 = $$4.d($$0);
         if ($$5.f()) {
            return false;
         } else {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if ((double)$$7 < 0.1) {
               return false;
            } else {
               List<cwq> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof ard $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.fA(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dA(), $$4.dC(), $$4.dG(), awa.aG, awb.h, 1.0F, 1.0F / ($$1.H_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(awk.c.b(this));
               return true;
            }
         }
      }
   }

   @Override
   protected void a(bvi $$0, cpr $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bvi $$6) {
      $$1.a($$0, $$0.dN(), $$0.dL() + $$5, 0.0F, $$3, $$4);
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
   public int a(cwq $$0, bvi $$1) {
      return 72000;
   }

   @Override
   public cws b(cwq $$0) {
      return cws.e;
   }

   @Override
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      boolean $$4 = !$$1.d($$3).f();
      if (!$$1.fV() && !$$4) {
         return bsl.d;
      } else {
         $$1.c($$2);
         return bsl.c;
      }
   }

   @Override
   public Predicate<cwq> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
