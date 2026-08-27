import java.util.Set;
import java.util.function.Predicate;

public interface bjv extends bjt {
   int o_ = 64;
   int p_ = 8;

   int b();

   boolean aj_();

   cng a(int var1);

   cng a(int var1, int var2);

   cng b(int var1);

   void a(int var1, cng var2);

   default int al_() {
      return 64;
   }

   void e();

   boolean a(cfq var1);

   default void d_(cfq $$0) {
   }

   default void c(cfq $$0) {
   }

   default boolean b(int $$0, cng $$1) {
      return true;
   }

   default boolean a(bjv $$0, int $$1, cng $$2) {
      return true;
   }

   default int a_(cnb $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cng $$3 = this.a($$2);
         if ($$3.d().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a(Set<cnb> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.d()));
   }

   default boolean a_(Predicate<cng> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cng $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dhd $$0, cfq $$1) {
      return a($$0, $$1, 8);
   }

   static boolean a(dhd $$0, cfq $$1, int $$2) {
      ctx $$3 = $$0.i();
      hx $$4 = $$0.aE_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.i((double)$$4.u() + 0.5, (double)$$4.v() + 0.5, (double)$$4.w() + 0.5) <= (double)($$2 * $$2);
      }
   }
}
