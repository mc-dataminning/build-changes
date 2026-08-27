import java.util.Set;
import java.util.function.Predicate;

public interface bmv extends bmt {
   int o_ = 64;
   float p_ = 4.0F;

   int b();

   boolean ai_();

   cqk a(int var1);

   cqk a(int var1, int var2);

   cqk b(int var1);

   void a(int var1, cqk var2);

   default int ak_() {
      return 64;
   }

   void e();

   boolean a(cis var1);

   default void d_(cis $$0) {
   }

   default void c(cis $$0) {
   }

   default boolean b(int $$0, cqk $$1) {
      return true;
   }

   default boolean a(bmv $$0, int $$1, cqk $$2) {
      return true;
   }

   default int a_(cqf $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cqk $$3 = this.a($$2);
         if ($$3.d().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cqf> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.d()));
   }

   default boolean a_(Predicate<cqk> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cqk $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dkg $$0, cis $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dkg $$0, cis $$1, float $$2) {
      cwz $$3 = $$0.i();
      ib $$4 = $$0.aC_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
