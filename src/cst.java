import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cst extends cvn {
   public static final int a = 20;
   public static final int b = 15;

   public cst(cul.a $$0) {
      super($$0);
   }

   @Override
   public void a(cuq $$0, dcw $$1, btn $$2, int $$3) {
      if ($$2 instanceof cmx $$4) {
         cuq $$5 = $$4.g($$0);
         if (!$$5.e()) {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if (!((double)$$7 < 0.1)) {
               List<cuq> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof aqu $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.ft(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.du(), $$4.dw(), $$4.dA(), avp.aG, avq.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(avz.c.b(this));
            }
         }
      }
   }

   @Override
   protected void a(btn $$0, cnp $$1, int $$2, float $$3, float $$4, float $$5, @Nullable btn $$6) {
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
   public int a(cuq $$0, btn $$1) {
      return 72000;
   }

   @Override
   public cwo b(cuq $$0) {
      return cwo.e;
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).e();
      if (!$$1.fM() && !$$4) {
         return bqs.d($$3);
      } else {
         $$1.c($$2);
         return bqs.b($$3);
      }
   }

   @Override
   public Predicate<cuq> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
