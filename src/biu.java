import java.util.Set;
import java.util.function.Predicate;

public interface biu extends bis {
   int m_ = 64;
   int n_ = 8;

   int b();

   boolean aj_();

   clo a(int var1);

   clo a(int var1, int var2);

   clo b(int var1);

   void a(int var1, clo var2);

   default int al_() {
      return 64;
   }

   void e();

   boolean a(cdz var1);

   default void d_(cdz $$0) {
   }

   default void c(cdz $$0) {
   }

   default boolean b(int $$0, clo $$1) {
      return true;
   }

   default boolean a(biu $$0, int $$1, clo $$2) {
      return true;
   }

   default int a_(clj $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         clo $$3 = this.a($$2);
         if ($$3.d().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a(Set<clj> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.d()));
   }

   default boolean a_(Predicate<clo> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         clo $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dfi $$0, cdz $$1) {
      return a($$0, $$1, 8);
   }

   static boolean a(dfi $$0, cdz $$1, int $$2) {
      csf $$3 = $$0.i();
      hx $$4 = $$0.aC_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.i((double)$$4.u() + 0.5, (double)$$4.v() + 0.5, (double)$$4.w() + 0.5) <= (double)($$2 * $$2);
      }
   }
}
