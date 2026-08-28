import java.util.Set;
import java.util.function.Predicate;

public interface btr extends btp {
   float r_ = 4.0F;

   int b();

   boolean c();

   cys a(int var1);

   cys a(int var1, int var2);

   cys b(int var1);

   void a(int var1, cys var2);

   default int aj_() {
      return 99;
   }

   default int e_(cys $$0) {
      return Math.min(this.aj_(), $$0.k());
   }

   void e();

   boolean a(cqs var1);

   default void c_(cqs $$0) {
   }

   default void c(cqs $$0) {
   }

   default boolean b(int $$0, cys $$1) {
      return true;
   }

   default boolean a(btr $$0, int $$1, cys $$2) {
      return true;
   }

   default int a_(cyo $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cys $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cyo> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cys> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cys $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dwn $$0, cqs $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dwn $$0, cqs $$1, float $$2) {
      dip $$3 = $$0.i();
      iu $$4 = $$0.aw_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
