import java.util.Set;
import java.util.function.Predicate;

public interface brd extends brb {
   float q_ = 4.0F;

   int b();

   boolean c();

   cvl a(int var1);

   cvl a(int var1, int var2);

   cvl b(int var1);

   void a(int var1, cvl var2);

   default int ak_() {
      return 99;
   }

   default int f_(cvl $$0) {
      return Math.min(this.ak_(), $$0.k());
   }

   void e();

   boolean a(cnp var1);

   default void d_(cnp $$0) {
   }

   default void c(cnp $$0) {
   }

   default boolean b(int $$0, cvl $$1) {
      return true;
   }

   default boolean a(brd $$0, int $$1, cvl $$2) {
      return true;
   }

   default int a_(cvg $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cvl $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.J();
         }
      }

      return $$1;
   }

   default boolean a_(Set<cvg> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cvl> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cvl $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dre $$0, cnp $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dre $$0, cnp $$1, float $$2) {
      dds $$3 = $$0.i();
      je $$4 = $$0.aD_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
