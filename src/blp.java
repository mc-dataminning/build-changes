import java.util.Set;
import java.util.function.Predicate;

public interface blp extends bln {
   int o_ = 64;
   float p_ = 4.0F;

   int b();

   boolean aj_();

   cpd a(int var1);

   cpd a(int var1, int var2);

   cpd b(int var1);

   void a(int var1, cpd var2);

   default int al_() {
      return 64;
   }

   void e();

   boolean a(chl var1);

   default void d_(chl $$0) {
   }

   default void c(chl $$0) {
   }

   default boolean b(int $$0, cpd $$1) {
      return true;
   }

   default boolean a(blp $$0, int $$1, cpd $$2) {
      return true;
   }

   default int a_(coy $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cpd $$3 = this.a($$2);
         if ($$3.d().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<coy> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.d()));
   }

   default boolean a_(Predicate<cpd> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cpd $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dix $$0, chl $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dix $$0, chl $$1, float $$2) {
      cvr $$3 = $$0.i();
      hz $$4 = $$0.aE_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
