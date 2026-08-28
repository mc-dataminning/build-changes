import java.util.Set;
import java.util.function.Predicate;

public interface brl extends brj {
   float q_ = 4.0F;

   int b();

   boolean c();

   cvs a(int var1);

   cvs a(int var1, int var2);

   cvs b(int var1);

   void a(int var1, cvs var2);

   default int al_() {
      return 99;
   }

   default int f_(cvs $$0) {
      return Math.min(this.al_(), $$0.k());
   }

   void e();

   boolean a(cnx var1);

   default void d_(cnx $$0) {
   }

   default void c(cnx $$0) {
   }

   default boolean b(int $$0, cvs $$1) {
      return true;
   }

   default boolean a(brl $$0, int $$1, cvs $$2) {
      return true;
   }

   default int a_(cvn $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cvs $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.K();
         }
      }

      return $$1;
   }

   default boolean a_(Set<cvn> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cvs> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cvs $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(drv $$0, cnx $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(drv $$0, cnx $$1, float $$2) {
      dej $$3 = $$0.i();
      jf $$4 = $$0.aC_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
