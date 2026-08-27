import java.util.Set;
import java.util.function.Predicate;

public interface bme extends bmc {
   int o_ = 64;
   float p_ = 4.0F;

   int b();

   boolean aj_();

   cpq a(int var1);

   cpq a(int var1, int var2);

   cpq b(int var1);

   void a(int var1, cpq var2);

   default int al_() {
      return 64;
   }

   void e();

   boolean a(cia var1);

   default void d_(cia $$0) {
   }

   default void c(cia $$0) {
   }

   default boolean b(int $$0, cpq $$1) {
      return true;
   }

   default boolean a(bme $$0, int $$1, cpq $$2) {
      return true;
   }

   default int a_(cpl $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cpq $$3 = this.a($$2);
         if ($$3.d().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cpl> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.d()));
   }

   default boolean a_(Predicate<cpq> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cpq $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(djl $$0, cia $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(djl $$0, cia $$1, float $$2) {
      cwe $$3 = $$0.i();
      ib $$4 = $$0.aD_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
