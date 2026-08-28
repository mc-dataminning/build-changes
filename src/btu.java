import java.util.Set;
import java.util.function.Predicate;

public interface btu extends bts {
   float r_ = 4.0F;

   int b();

   boolean c();

   cyy a(int var1);

   cyy a(int var1, int var2);

   cyy b(int var1);

   void a(int var1, cyy var2);

   default int aj_() {
      return 99;
   }

   default int f_(cyy $$0) {
      return Math.min(this.aj_(), $$0.k());
   }

   void e();

   boolean a(cqy var1);

   default void c_(cqy $$0) {
   }

   default void c(cqy $$0) {
   }

   default boolean b(int $$0, cyy $$1) {
      return true;
   }

   default boolean a(btu $$0, int $$1, cyy $$2) {
      return true;
   }

   default int a_(cyu $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cyy $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cyu> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cyy> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cyy $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dwx $$0, cqy $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dwx $$0, cqy $$1, float $$2) {
      div $$3 = $$0.i();
      iu $$4 = $$0.aw_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
