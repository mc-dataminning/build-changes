import java.util.Optional;

public interface ctk<T extends Enum<T>> {
   int w_ = 4;

   Optional<dey> i_(dey var1);

   float a();

   default void a_(dey $$0, aki $$1, gv $$2, art $$3) {
      float $$4 = 0.05688889F;
      if ($$3.i() < 0.05688889F) {
         this.c($$0, $$1, $$2, $$3);
      }
   }

   T b();

   default void c(dey $$0, aki $$1, gv $$2, art $$3) {
      int $$4 = this.b().ordinal();
      int $$5 = 0;
      int $$6 = 0;

      for (gv $$7 : gv.a($$2, 4, 4, 4)) {
         int $$8 = $$7.k($$2);
         if ($$8 > 4) {
            break;
         }

         if (!$$7.equals($$2)) {
            dey $$9 = $$1.a_($$7);
            csk $$10 = $$9.b();
            if ($$10 instanceof ctk) {
               Enum<?> $$11 = ((ctk)$$10).b();
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
