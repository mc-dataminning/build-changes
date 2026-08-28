import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class csh extends cuw {
   public static final int a = 20;
   public static final int b = 15;

   public csh(cty.a $$0) {
      super($$0);
   }

   @Override
   public void a(cud $$0, dcg $$1, btc $$2, int $$3) {
      if ($$2 instanceof cml $$4) {
         cud $$5 = $$4.g($$0);
         if (!$$5.e()) {
            int $$6 = this.a($$0, $$2) - $$3;
            float $$7 = a($$6);
            if (!((double)$$7 < 0.1)) {
               List<cud> $$8 = a($$0, $$5, $$4);
               if ($$1 instanceof aqm $$9 && !$$8.isEmpty()) {
                  this.a($$9, $$4, $$4.fu(), $$0, $$8, $$7 * 3.0F, 1.0F, $$7 == 1.0F, null);
               }

               $$1.a(null, $$4.dw(), $$4.dy(), $$4.dC(), avh.aG, avi.h, 1.0F, 1.0F / ($$1.E_().i() * 0.4F + 1.2F) + $$7 * 0.5F);
               $$4.b(avr.c.b(this));
            }
         }
      }
   }

   @Override
   protected void a(btc $$0, cnd $$1, int $$2, float $$3, float $$4, float $$5, @Nullable btc $$6) {
      $$1.a($$0, $$0.dJ(), $$0.dH() + $$5, 0.0F, $$3, $$4);
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
   public int a(cud $$0, btc $$1) {
      return 72000;
   }

   @Override
   public cvy b(cud $$0) {
      return cvy.e;
   }

   @Override
   public bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      cud $$3 = $$1.b($$2);
      boolean $$4 = !$$1.g($$3).e();
      if (!$$1.fN() && !$$4) {
         return bqi.d($$3);
      } else {
         $$1.c($$2);
         return bqi.b($$3);
      }
   }

   @Override
   public Predicate<cud> b() {
      return c;
   }

   @Override
   public int c() {
      return 15;
   }
}
