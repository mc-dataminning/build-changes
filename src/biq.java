import java.util.Set;
import java.util.function.Predicate;

public interface biq extends bio {
   int m_ = 64;
   int n_ = 8;

   int b();

   boolean ai_();

   clj a(int var1);

   clj a(int var1, int var2);

   clj b(int var1);

   void a(int var1, clj var2);

   default int aj_() {
      return 64;
   }

   void e();

   boolean a(cdu var1);

   default void d_(cdu $$0) {
   }

   default void c(cdu $$0) {
   }

   default boolean b(int $$0, clj $$1) {
      return true;
   }

   default boolean a(biq $$0, int $$1, clj $$2) {
      return true;
   }

   default int a_(cle $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         clj $$3 = this.a($$2);
         if ($$3.d().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a(Set<cle> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.d()));
   }

   default boolean a_(Predicate<clj> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         clj $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dfd $$0, cdu $$1) {
      return a($$0, $$1, 8);
   }

   static boolean a(dfd $$0, cdu $$1, int $$2) {
      csa $$3 = $$0.k();
      ht $$4 = $$0.p();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.i((double)$$4.u() + 0.5, (double)$$4.v() + 0.5, (double)$$4.w() + 0.5) <= (double)($$2 * $$2);
      }
   }
}
