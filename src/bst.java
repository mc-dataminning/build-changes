import java.util.Set;
import java.util.function.Predicate;

public interface bst extends bsr {
   float r_ = 4.0F;

   int b();

   boolean c();

   cxg a(int var1);

   cxg a(int var1, int var2);

   cxg b(int var1);

   void a(int var1, cxg var2);

   default int ao_() {
      return 99;
   }

   default int e_(cxg $$0) {
      return Math.min(this.ao_(), $$0.k());
   }

   void e();

   boolean a(cpo var1);

   default void c_(cpo $$0) {
   }

   default void c(cpo $$0) {
   }

   default boolean b(int $$0, cxg $$1) {
      return true;
   }

   default boolean a(bst $$0, int $$1, cxg $$2) {
      return true;
   }

   default int a_(cxc $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cxg $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cxc> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cxg> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cxg $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(duq $$0, cpo $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(duq $$0, cpo $$1, float $$2) {
      dgz $$3 = $$0.i();
      jh $$4 = $$0.aB_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
