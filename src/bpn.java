import java.util.Set;
import java.util.function.Predicate;

public interface bpn extends bpl {
   float o_ = 4.0F;

   int b();

   boolean c();

   cto a(int var1);

   cto a(int var1, int var2);

   cto b(int var1);

   void a(int var1, cto var2);

   default int ah_() {
      return 99;
   }

   default int e_(cto $$0) {
      return Math.min(this.ah_(), $$0.j());
   }

   void e();

   boolean a(clw var1);

   default void d_(clw $$0) {
   }

   default void c(clw $$0) {
   }

   default boolean b(int $$0, cto $$1) {
      return true;
   }

   default boolean a(bpn $$0, int $$1, cto $$2) {
      return true;
   }

   default int a_(ctj $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cto $$3 = this.a($$2);
         if ($$3.g().equals($$0)) {
            $$1 += $$3.I();
         }
      }

      return $$1;
   }

   default boolean a(Set<ctj> $$0) {
      return this.a_($$1 -> !$$1.e() && $$0.contains($$1.g()));
   }

   default boolean a_(Predicate<cto> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cto $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dog $$0, clw $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dog $$0, clw $$1, float $$2) {
      dax $$3 = $$0.i();
      io $$4 = $$0.az_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
