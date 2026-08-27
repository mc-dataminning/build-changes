import java.util.Set;
import java.util.function.Predicate;

public interface boj extends boh {
   int o_ = 64;
   float p_ = 4.0F;

   int b();

   boolean c();

   csd a(int var1);

   csd a(int var1, int var2);

   csd b(int var1);

   void a(int var1, csd var2);

   default int ah_() {
      return 64;
   }

   void e();

   boolean a(ckl var1);

   default void d_(ckl $$0) {
   }

   default void c(ckl $$0) {
   }

   default boolean b(int $$0, csd $$1) {
      return true;
   }

   default boolean a(boj $$0, int $$1, csd $$2) {
      return true;
   }

   default int a_(cry $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         csd $$3 = this.a($$2);
         if ($$3.f().equals($$0)) {
            $$1 += $$3.G();
         }
      }

      return $$1;
   }

   default boolean a(Set<cry> $$0) {
      return this.a_($$1 -> !$$1.d() && $$0.contains($$1.f()));
   }

   default boolean a_(Predicate<csd> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         csd $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dnd $$0, ckl $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dnd $$0, ckl $$1, float $$2) {
      czu $$3 = $$0.i();
      im $$4 = $$0.az_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
