import java.util.Set;
import java.util.function.Predicate;

public interface bqn extends bql {
   float o_ = 4.0F;

   int b();

   boolean c();

   cup a(int var1);

   cup a(int var1, int var2);

   cup b(int var1);

   void a(int var1, cup var2);

   default int ah_() {
      return 99;
   }

   default int e_(cup $$0) {
      return Math.min(this.ah_(), $$0.j());
   }

   void e();

   boolean a(cmx var1);

   default void d_(cmx $$0) {
   }

   default void c(cmx $$0) {
   }

   default boolean b(int $$0, cup $$1) {
      return true;
   }

   default boolean a(bqn $$0, int $$1, cup $$2) {
      return true;
   }

   default int a_(cuk $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cup $$3 = this.a($$2);
         if ($$3.g().equals($$0)) {
            $$1 += $$3.I();
         }
      }

      return $$1;
   }

   default boolean a(Set<cuk> $$0) {
      return this.a_($$1 -> !$$1.e() && $$0.contains($$1.g()));
   }

   default boolean a_(Predicate<cup> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cup $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dph $$0, cmx $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dph $$0, cmx $$1, float $$2) {
      dby $$3 = $$0.i();
      iz $$4 = $$0.ay_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
