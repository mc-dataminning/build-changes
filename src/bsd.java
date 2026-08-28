import java.util.Set;
import java.util.function.Predicate;

public interface bsd extends bsb {
   float r_ = 4.0F;

   int b();

   boolean c();

   cwm a(int var1);

   cwm a(int var1, int var2);

   cwm b(int var1);

   void a(int var1, cwm var2);

   default int an_() {
      return 99;
   }

   default int e_(cwm $$0) {
      return Math.min(this.an_(), $$0.k());
   }

   void e();

   boolean a(cou var1);

   default void c_(cou $$0) {
   }

   default void c(cou $$0) {
   }

   default boolean b(int $$0, cwm $$1) {
      return true;
   }

   default boolean a(bsd $$0, int $$1, cwm $$2) {
      return true;
   }

   default int a_(cwi $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cwm $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a(Set<cwi> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cwm> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cwm $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dsy $$0, cou $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dsy $$0, cou $$1, float $$2) {
      dfm $$3 = $$0.i();
      jh $$4 = $$0.aA_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
