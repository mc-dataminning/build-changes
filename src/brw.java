import java.util.Set;
import java.util.function.Predicate;

public interface brw extends bru {
   float q_ = 4.0F;

   int b();

   boolean c();

   cwb a(int var1);

   cwb a(int var1, int var2);

   cwb b(int var1);

   void a(int var1, cwb var2);

   default int am_() {
      return 99;
   }

   default int e_(cwb $$0) {
      return Math.min(this.am_(), $$0.k());
   }

   void e();

   boolean a(com var1);

   default void d_(com $$0) {
   }

   default void c(com $$0) {
   }

   default boolean b(int $$0, cwb $$1) {
      return true;
   }

   default boolean a(brw $$0, int $$1, cwb $$2) {
      return true;
   }

   default int a_(cvx $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwb $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a(Set<cvx> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cwb> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cwb $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dsm $$0, com $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dsm $$0, com $$1, float $$2) {
      dfb $$3 = $$0.i();
      jh $$4 = $$0.aB_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
