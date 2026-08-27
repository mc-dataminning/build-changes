import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cqg extends csu {
   public static final int a = 20;
   public static final int b = 15;

   public cqg(cry.a $$0) {
      super($$0);
   }

   @Override
   public void a(csd $$0, czu $$1, bre $$2, int $$3) {
      if ($$2 instanceof ckl $$4) {
         csd $$5 = $$4.g($$0);
         if (!$$5.d()) {
            int $$6 = this.b($$0) - $$3;
            float $$7 = a($$6);
            if (!((double)$$7 < 0.1)) {
               List<csd> $$8 = a($$0, $$5, $$4);
               if (!$$1.x_() && !$$8.isEmpty()) {
                  this.a($$1, $$4, $$4.fu(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.ds(), $$4.du(), $$4.dy(), auz.aG, ava.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(avj.c.b(this));
            }
         }
      }
   }

   @Override
   protected void a(bre $$0, cld $$1, int $$2, float $$3, float $$4, float $$5, @Nullable bre $$6) {
      $$1.a($$0, $$0.dF(), $$0.dD() + $$5, 0.0F, $$3, $$4);
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
   public int b(csd $$0) {
      return 72000;
   }

   @Override
   public ctw c(csd $$0) {
      return ctw.e;
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      csd $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).d();
      if (!$$1.fN() && !$$4) {
         return bor.d($$3);
      } else {
         $$1.c($$2);
         return bor.b($$3);
      }
   }

   @Override
   public Predicate<csd> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
