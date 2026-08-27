import java.util.Set;
import java.util.function.Predicate;

public interface bju extends bjs {
   int n_ = 64;
   int o_ = 8;

   int b();

   boolean ai_();

   cmy a(int var1);

   cmy a(int var1, int var2);

   cmy b(int var1);

   void a(int var1, cmy var2);

   default int ak_() {
      return 64;
   }

   void e();

   boolean a(cfi var1);

   default void d_(cfi $$0) {
   }

   default void c(cfi $$0) {
   }

   default boolean b(int $$0, cmy $$1) {
      return true;
   }

   default boolean a(bju $$0, int $$1, cmy $$2) {
      return true;
   }

   default int a_(cmt $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cmy $$3 = this.a($$2);
         if ($$3.d().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a(Set<cmt> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.d()));
   }

   default boolean a_(Predicate<cmy> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cmy $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dgv $$0, cfi $$1) {
      return a($$0, $$1, 8);
   }

   static boolean a(dgv $$0, cfi $$1, int $$2) {
      ctp $$3 = $$0.i();
      hx $$4 = $$0.aB_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.i((double)$$4.u() + 0.5, (double)$$4.v() + 0.5, (double)$$4.w() + 0.5) <= (double)($$2 * $$2);
      }
   }
}
