import java.util.Set;
import java.util.function.Predicate;

public interface bny extends bnw {
   int o_ = 64;
   float p_ = 4.0F;

   int b();

   boolean c();

   crs a(int var1);

   crs a(int var1, int var2);

   crs b(int var1);

   void a(int var1, crs var2);

   default int ah_() {
      return 64;
   }

   void e();

   boolean a(cka var1);

   default void d_(cka $$0) {
   }

   default void c(cka $$0) {
   }

   default boolean b(int $$0, crs $$1) {
      return true;
   }

   default boolean a(bny $$0, int $$1, crs $$2) {
      return true;
   }

   default int a_(crn $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         crs $$3 = this.a($$2);
         if ($$3.f().equals($$0)) {
            $$1 += $$3.G();
         }
      }

      return $$1;
   }

   default boolean a(Set<crn> $$0) {
      return this.a_($$1 -> !$$1.d() && $$0.contains($$1.f()));
   }

   default boolean a_(Predicate<crs> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         crs $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dmo $$0, cka $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dmo $$0, cka $$1, float $$2) {
      czg $$3 = $$0.i();
      id $$4 = $$0.az_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
