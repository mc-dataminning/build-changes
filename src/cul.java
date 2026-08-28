import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cul extends cwx {
   public static final int a = 20;
   public static final int b = 15;

   public cul(cvx.a $$0) {
      super($$0);
   }

   @Override
   public boolean a(cwb $$0, dfb $$1, bva $$2, int $$3) {
      if (!($$2 instanceof com $$4)) {
         return false;
      } else {
         cwb $$5 = $$4.d($$0);
         if ($$5.f()) {
            return false;
         } else {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if ((double)$$7 < 0.1) {
               return false;
            } else {
               List<cwb> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof arn $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.fC(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dC(), $$4.dE(), $$4.dI(), awl.aG, awm.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(awv.c.b(this));
               return true;
            }
         }
      }
   }

   @Override
   protected void a(bva $$0, cpg $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bva $$6) {
      $$1.a($$0, $$0.dP(), $$0.dN() + $$5, 0.0F, $$3, $$4);
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
   public int a(cwb $$0, bva $$1) {
      return 72000;
   }

   @Override
   public cwd b(cwb $$0) {
      return cwd.e;
   }

   @Override
   public bsd a(dfb $$0, com $$1, bsc $$2) {
      cwb $$3 = $$1.b($$2);
      boolean $$4 = !$$1.d($$3).f();
      if (!$$1.fX() && !$$4) {
         return bsd.d;
      } else {
         $$1.c($$2);
         return bsd.c;
      }
   }

   @Override
   public Predicate<cwb> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
