import java.util.Optional;

public interface din<T extends Enum<T>> {
   int z_ = 4;

   Optional<dus> k_(dus var1);

   float aw_();

   default void a_(dus $$0, arj $$1, jf $$2, azn $$3) {
      float $$4 = 0.05688889F;
      if ($$3.i() < 0.05688889F) {
         this.c($$0, $$1, $$2, $$3).ifPresent($$2x -> $$1.b($$2, $$2x));
      }
   }

   T c();

   default Optional<dus> c(dus $$0, arj $$1, jf $$2, azn $$3) {
      int $$4 = this.c().ordinal();
      int $$5 = 0;
      int $$6 = 0;

      for (jf $$7 : jf.a($$2, 4, 4, 4)) {
         int $$8 = $$7.k($$2);
         if ($$8 > 4) {
            break;
         }

         if (!$$7.equals($$2) && $$1.a_($$7).b() instanceof din<?> $$9) {
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
      float $$13 = $$12 * $$12 * this.aw_();
      return $$3.i() < $$13 ? this.k_($$0) : Optional.empty();
   }
}
