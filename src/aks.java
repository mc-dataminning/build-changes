import java.util.Iterator;

public interface aks {
   static <T> void a(int $$0, int $$1, dal<?> $$2, Iterable<T> $$3, aks.a<T> $$4) {
      int $$5 = $$0;
      int $$6 = $$1;
      if ($$2.b() instanceof dar $$8) {
         $$5 = $$8.j();
         $$6 = $$8.k();
      }

      Iterator<T> $$9 = $$3.iterator();
      int $$10 = 0;

      for (int $$11 = 0; $$11 < $$1; $$11++) {
         boolean $$12 = (float)$$6 < (float)$$1 / 2.0F;
         int $$13 = azj.d((float)$$1 / 2.0F - (float)$$6 / 2.0F);
         if ($$12 && $$13 > $$11) {
            $$10 += $$0;
            $$11++;
         }

         for (int $$14 = 0; $$14 < $$0; $$14++) {
            if (!$$9.hasNext()) {
               return;
            }

            $$12 = (float)$$5 < (float)$$0 / 2.0F;
            $$13 = azj.d((float)$$0 / 2.0F - (float)$$5 / 2.0F);
            int $$15 = $$5;
            boolean $$16 = $$14 < $$5;
            if ($$12) {
               $$15 = $$13 + $$5;
               $$16 = $$13 <= $$14 && $$14 < $$13 + $$5;
            }

            if ($$16) {
               $$4.addItemToSlot($$9.next(), $$10, $$14, $$11);
            } else if ($$15 == $$14) {
               $$10 += $$0 - $$14;
               break;
            }

            $$10++;
         }
      }
   }

   @FunctionalInterface
   public interface a<T> {
      void addItemToSlot(T var1, int var2, int var3, int var4);
   }
}
