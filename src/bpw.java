import java.util.Set;
import java.util.function.Predicate;

public interface bpw extends bpu {
   float o_ = 4.0F;

   int b();

   boolean c();

   cua a(int var1);

   cua a(int var1, int var2);

   cua b(int var1);

   void a(int var1, cua var2);

   default int ah_() {
      return 99;
   }

   default int e_(cua $$0) {
      return Math.min(this.ah_(), $$0.j());
   }

   void e();

   boolean a(cmh var1);

   default void d_(cmh $$0) {
   }

   default void c(cmh $$0) {
   }

   default boolean b(int $$0, cua $$1) {
      return true;
   }

   default boolean a(bpw $$0, int $$1, cua $$2) {
      return true;
   }

   default int a_(ctv $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cua $$3 = this.a($$2);
         if ($$3.g().equals($$0)) {
            $$1 += $$3.H();
         }
      }

      return $$1;
   }

   default boolean a(Set<ctv> $$0) {
      return this.a_($$1 -> !$$1.e() && $$0.contains($$1.g()));
   }

   default boolean a_(Predicate<cua> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cua $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dpn $$0, cmh $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dpn $$0, cmh $$1, float $$2) {
      dcd $$3 = $$0.i();
      ja $$4 = $$0.az_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
