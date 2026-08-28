import java.util.Iterator;

public interface akv {
   static <T> void a(int $$0, int $$1, der<?> $$2, Iterable<T> $$3, akv.a<T> $$4) {
      if ($$2 instanceof dff $$5) {
         a($$0, $$1, $$5.k(), $$5.l(), $$3, $$4);
      } else {
         a($$0, $$1, $$0, $$1, $$3, $$4);
      }
   }

   static <T> void a(int $$0, int $$1, int $$2, int $$3, Iterable<T> $$4, akv.a<T> $$5) {
      Iterator<T> $$6 = $$4.iterator();
      int $$7 = 0;

      for (int $$8 = 0; $$8 < $$1; $$8++) {
         boolean $$9 = (float)$$3 < (float)$$1 / 2.0F;
         int $$10 = azq.d((float)$$1 / 2.0F - (float)$$3 / 2.0F);
         if ($$9 && $$10 > $$8) {
            $$7 += $$0;
            $$8++;
         }

         for (int $$11 = 0; $$11 < $$0; $$11++) {
            if (!$$6.hasNext()) {
               return;
            }

            $$9 = (float)$$2 < (float)$$0 / 2.0F;
            $$10 = azq.d((float)$$0 / 2.0F - (float)$$2 / 2.0F);
            int $$12 = $$2;
            boolean $$13 = $$11 < $$2;
            if ($$9) {
               $$12 = $$10 + $$2;
               $$13 = $$10 <= $$11 && $$11 < $$10 + $$2;
            }

            if ($$13) {
               $$5.addItemToSlot($$6.next(), $$7, $$11, $$8);
            } else if ($$12 == $$11) {
               $$7 += $$0 - $$11;
               break;
            }

            $$7++;
         }
      }
   }

   @FunctionalInterface
   public interface a<T> {
      void addItemToSlot(T var1, int var2, int var3, int var4);
   }
}
