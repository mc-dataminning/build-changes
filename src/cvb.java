import java.util.Optional;

public interface cvb<T extends Enum<T>> {
   int w_ = 4;

   Optional<dgb> i_(dgb var1);

   float b();

   default void a_(dgb $$0, alq $$1, ht $$2, ate $$3) {
      float $$4 = 0.05688889F;
      if ($$3.i() < 0.05688889F) {
         this.c($$0, $$1, $$2, $$3);
      }
   }

   T c();

   default void c(dgb $$0, alq $$1, ht $$2, ate $$3) {
      int $$4 = this.c().ordinal();
      int $$5 = 0;
      int $$6 = 0;

      for (ht $$7 : ht.a($$2, 4, 4, 4)) {
         int $$8 = $$7.k($$2);
         if ($$8 > 4) {
            break;
         }

         if (!$$7.equals($$2)) {
            dgb $$9 = $$1.a_($$7);
            cua $$10 = $$9.b();
            if ($$10 instanceof cvb) {
               Enum<?> $$11 = ((cvb)$$10).c();
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
