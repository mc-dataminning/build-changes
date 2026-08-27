import java.util.Optional;

public interface cud<T extends Enum<T>> {
   int w_ = 4;

   Optional<dfd> i_(dfd var1);

   float b();

   default void a_(dfd $$0, akt $$1, gw $$2, ash $$3) {
      float $$4 = 0.05688889F;
      if ($$3.i() < 0.05688889F) {
         this.c($$0, $$1, $$2, $$3);
      }
   }

   T c();

   default void c(dfd $$0, akt $$1, gw $$2, ash $$3) {
      int $$4 = this.c().ordinal();
      int $$5 = 0;
      int $$6 = 0;

      for (gw $$7 : gw.a($$2, 4, 4, 4)) {
         int $$8 = $$7.k($$2);
         if ($$8 > 4) {
            break;
         }

         if (!$$7.equals($$2)) {
            dfd $$9 = $$1.a_($$7);
            ctc $$10 = $$9.b();
            if ($$10 instanceof cud) {
               Enum<?> $$11 = ((cud)$$10).c();
               if (this.c().getClass() == $$11.getClass()) {
                  int $$12 = $$11.ordinal();
                  if ($$12 < $$4) {
                     return;
                  }

                  if ($$12 > $$4) {
                     $$6++;
                  } else {
                     $$5++;
                  }
               }
            }
         }
      }

      float $$13 = (float)($$6 + 1) / (float)($$6 + $$5 + 1);
      float $$14 = $$13 * $$13 * this.b();
      if ($$3.i() < $$14) {
         this.i_($$0).ifPresent($$2x -> $$1.b($$2, $$2x));
      }
   }
}
