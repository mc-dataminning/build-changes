import java.util.Set;
import java.util.function.Predicate;

public interface bqi extends bqg {
   float o_ = 4.0F;

   int b();

   boolean c();

   cuk a(int var1);

   cuk a(int var1, int var2);

   cuk b(int var1);

   void a(int var1, cuk var2);

   default int ai_() {
      return 99;
   }

   default int e_(cuk $$0) {
      return Math.min(this.ai_(), $$0.j());
   }

   void e();

   boolean a(cms var1);

   default void d_(cms $$0) {
   }

   default void c(cms $$0) {
   }

   default boolean b(int $$0, cuk $$1) {
      return true;
   }

   default boolean a(bqi $$0, int $$1, cuk $$2) {
      return true;
   }

   default int a_(cuf $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cuk $$3 = this.a($$2);
         if ($$3.g().equals($$0)) {
            $$1 += $$3.I();
         }
      }

      return $$1;
   }

   default boolean a(Set<cuf> $$0) {
      return this.a_($$1 -> !$$1.e() && $$0.contains($$1.g()));
   }

   default boolean a_(Predicate<cuk> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cuk $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dpc $$0, cms $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dpc $$0, cms $$1, float $$2) {
      dbt $$3 = $$0.i();
      iz $$4 = $$0.aA_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
