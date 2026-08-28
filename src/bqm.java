import java.util.Set;
import java.util.function.Predicate;

public interface bqm extends bqk {
   float o_ = 4.0F;

   int b();

   boolean c();

   cuo a(int var1);

   cuo a(int var1, int var2);

   cuo b(int var1);

   void a(int var1, cuo var2);

   default int ah_() {
      return 99;
   }

   default int e_(cuo $$0) {
      return Math.min(this.ah_(), $$0.j());
   }

   void e();

   boolean a(cmw var1);

   default void d_(cmw $$0) {
   }

   default void c(cmw $$0) {
   }

   default boolean b(int $$0, cuo $$1) {
      return true;
   }

   default boolean a(bqm $$0, int $$1, cuo $$2) {
      return true;
   }

   default int a_(cuj $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cuo $$3 = this.a($$2);
         if ($$3.g().equals($$0)) {
            $$1 += $$3.I();
         }
      }

      return $$1;
   }

   default boolean a(Set<cuj> $$0) {
      return this.a_($$1 -> !$$1.e() && $$0.contains($$1.g()));
   }

   default boolean a_(Predicate<cuo> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cuo $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dpg $$0, cmw $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dpg $$0, cmw $$1, float $$2) {
      dbx $$3 = $$0.i();
      iz $$4 = $$0.ay_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
