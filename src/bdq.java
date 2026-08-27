import java.util.Set;
import java.util.function.Predicate;

public interface bdq extends bdo {
   int m_ = 64;
   int n_ = 8;

   int b();

   boolean ab_();

   cfz a(int var1);

   cfz a(int var1, int var2);

   cfz b(int var1);

   void a(int var1, cfz var2);

   default int ac_() {
      return 64;
   }

   void e();

   boolean a(byo var1);

   default void d_(byo $$0) {
   }

   default void c(byo $$0) {
   }

   default boolean b(int $$0, cfz $$1) {
      return true;
   }

   default boolean a(bdq $$0, int $$1, cfz $$2) {
      return true;
   }

   default int a_(cfu $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cfz $$3 = this.a($$2);
         if ($$3.d().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a(Set<cfu> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.d()));
   }

   default boolean a_(Predicate<cfz> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cfz $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(czn $$0, byo $$1) {
      return a($$0, $$1, 8);
   }

   static boolean a(czn $$0, byo $$1, int $$2) {
      cmm $$3 = $$0.k();
      gu $$4 = $$0.p();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.i((double)$$4.u() + 0.5, (double)$$4.v() + 0.5, (double)$$4.w() + 0.5) <= (double)($$2 * $$2);
      }
   }
}
