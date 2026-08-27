import java.util.Optional;

public interface cqn<T extends Enum<T>> {
   int w_ = 4;

   Optional<dcb> i_(dcb var1);

   float a();

   default void a_(dcb $$0, aif $$1, gu $$2, apf $$3) {
      float $$4 = 0.05688889F;
      if ($$3.i() < 0.05688889F) {
         this.c($$0, $$1, $$2, $$3);
      }
   }

   T b();

   default void c(dcb $$0, aif $$1, gu $$2, apf $$3) {
      int $$4 = this.b().ordinal();
      int $$5 = 0;
      int $$6 = 0;

      for (gu $$7 : gu.a($$2, 4, 4, 4)) {
         int $$8 = $$7.k($$2);
         if ($$8 > 4) {
            break;
         }

         if (!$$7.equals($$2)) {
            dcb $$9 = $$1.a_($$7);
            cpn $$10 = $$9.b();
            if ($$10 instanceof cqn) {
               Enum<?> $$11 = ((cqn)$$10).b();
               if (this.b().getClass() == $$11.getClass()) {
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
      float $$14 = $$13 * $$13 * this.a();
      if ($$3.i() < $$14) {
         this.i_($$0).ifPresent($$2x -> $$1.b($$2, $$2x));
      }
   }
}
