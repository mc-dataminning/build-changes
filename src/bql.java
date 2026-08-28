import java.util.Set;
import java.util.function.Predicate;

public interface bql extends bqj {
   float o_ = 4.0F;

   int b();

   boolean c();

   cun a(int var1);

   cun a(int var1, int var2);

   cun b(int var1);

   void a(int var1, cun var2);

   default int ai_() {
      return 99;
   }

   default int e_(cun $$0) {
      return Math.min(this.ai_(), $$0.j());
   }

   void e();

   boolean a(cmv var1);

   default void d_(cmv $$0) {
   }

   default void c(cmv $$0) {
   }

   default boolean b(int $$0, cun $$1) {
      return true;
   }

   default boolean a(bql $$0, int $$1, cun $$2) {
      return true;
   }

   default int a_(cui $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cun $$3 = this.a($$2);
         if ($$3.g().equals($$0)) {
            $$1 += $$3.I();
         }
      }

      return $$1;
   }

   default boolean a(Set<cui> $$0) {
      return this.a_($$1 -> !$$1.e() && $$0.contains($$1.g()));
   }

   default boolean a_(Predicate<cun> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cun $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dpf $$0, cmv $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dpf $$0, cmv $$1, float $$2) {
      dbw $$3 = $$0.i();
      iz $$4 = $$0.az_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
