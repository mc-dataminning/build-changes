import java.util.Optional;

public interface cwg<T extends Enum<T>> {
   int w_ = 4;

   Optional<dhn> i_(dhn var1);

   float ax_();

   default void a_(dhn $$0, ami $$1, hx $$2, atw $$3) {
      float $$4 = 0.05688889F;
      if ($$3.i() < 0.05688889F) {
         this.c($$0, $$1, $$2, $$3).ifPresent($$2x -> $$1.b($$2, $$2x));
      }
   }

   T c();

   default Optional<dhn> c(dhn $$0, ami $$1, hx $$2, atw $$3) {
      int $$4 = this.c().ordinal();
      int $$5 = 0;
      int $$6 = 0;

      for (hx $$7 : hx.a($$2, 4, 4, 4)) {
         int $$8 = $$7.k($$2);
         if ($$8 > 4) {
            break;
         }

         if (!$$7.equals($$2) && $$1.a_($$7).b() instanceof cwg<?> $$9) {
            Enum<?> $$10 = $$9.c();
            if (this.c().getClass() == $$10.getClass()) {
               int $$11 = $$10.ordinal();
               if ($$11 < $$4) {
                  return Optional.empty();
               }

               if ($$11 > $$4) {
                  $$6++;
               } else {
                  $$5++;
               }
            }
         }
      }

      float $$12 = (float)($$6 + 1) / (float)($$6 + $$5 + 1);
      float $$13 = $$12 * $$12 * this.ax_();
      return $$3.i() < $$13 ? this.i_($$0) : Optional.empty();
   }
}
