import java.util.Set;
import java.util.function.Predicate;

public interface bnt extends bnr {
   int o_ = 64;
   float p_ = 4.0F;

   int b();

   boolean ah_();

   crj a(int var1);

   crj a(int var1, int var2);

   crj b(int var1);

   void a(int var1, crj var2);

   default int aj_() {
      return 64;
   }

   void e();

   boolean a(cjt var1);

   default void d_(cjt $$0) {
   }

   default void c(cjt $$0) {
   }

   default boolean b(int $$0, crj $$1) {
      return true;
   }

   default boolean a(bnt $$0, int $$1, crj $$2) {
      return true;
   }

   default int a_(cre $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         crj $$3 = this.a($$2);
         if ($$3.f().equals($$0)) {
            $$1 += $$3.G();
         }
      }

      return $$1;
   }

   default boolean a(Set<cre> $$0) {
      return this.a_($$1 -> !$$1.d() && $$0.contains($$1.f()));
   }

   default boolean a_(Predicate<crj> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         crj $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dmf $$0, cjt $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dmf $$0, cjt $$1, float $$2) {
      cyx $$3 = $$0.i();
      ib $$4 = $$0.aA_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
