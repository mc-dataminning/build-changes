import java.util.Iterator;

public interface akr<T> {
   default void a(int $$0, int $$1, int $$2, cyv<?> $$3, Iterator<T> $$4, int $$5) {
      int $$6 = $$0;
      int $$7 = $$1;
      if ($$3.b() instanceof cza $$9) {
         $$6 = $$9.j();
         $$7 = $$9.k();
      }

      int $$10 = 0;

      for (int $$11 = 0; $$11 < $$1; $$11++) {
         if ($$10 == $$2) {
            $$10++;
         }

         boolean $$12 = (float)$$7 < (float)$$1 / 2.0F;
         int $$13 = ayx.d((float)$$1 / 2.0F - (float)$$7 / 2.0F);
         if ($$12 && $$13 > $$11) {
            $$10 += $$0;
            $$11++;
         }

         for (int $$14 = 0; $$14 < $$0; $$14++) {
            if (!$$4.hasNext()) {
               return;
            }

            $$12 = (float)$$6 < (float)$$0 / 2.0F;
            $$13 = ayx.d((float)$$0 / 2.0F - (float)$$6 / 2.0F);
            int $$15 = $$6;
            boolean $$16 = $$14 < $$6;
            if ($$12) {
               $$15 = $$13 + $$6;
               $$16 = $$13 <= $$14 && $$14 < $$13 + $$6;
            }

            if ($$16) {
               this.a($$4, $$10, $$5, $$11, $$14);
            } else if ($$15 == $$14) {
               $$10 += $$0 - $$14;
               break;
            }

            $$10++;
         }
      }
   }

   void a(Iterator<T> var1, int var2, int var3, int var4, int var5);
}
