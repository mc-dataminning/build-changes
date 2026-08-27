import java.util.Set;
import java.util.function.Predicate;

public interface bpf extends bpd {
   float o_ = 4.0F;

   int b();

   boolean c();

   csz a(int var1);

   csz a(int var1, int var2);

   csz b(int var1);

   void a(int var1, csz var2);

   default int ah_() {
      return 99;
   }

   default int a(csz $$0) {
      return Math.min(this.ah_(), $$0.i());
   }

   void e();

   boolean a(clh var1);

   default void d_(clh $$0) {
   }

   default void c(clh $$0) {
   }

   default boolean b(int $$0, csz $$1) {
      return true;
   }

   default boolean a(bpf $$0, int $$1, csz $$2) {
      return true;
   }

   default int a_(csu $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         csz $$3 = this.a($$2);
         if ($$3.f().equals($$0)) {
            $$1 += $$3.G();
         }
      }

      return $$1;
   }

   default boolean a(Set<csu> $$0) {
      return this.a_($$1 -> !$$1.d() && $$0.contains($$1.f()));
   }

   default boolean a_(Predicate<csz> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         csz $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dnm $$0, clh $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dnm $$0, clh $$1, float $$2) {
      dad $$3 = $$0.i();
      in $$4 = $$0.az_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
