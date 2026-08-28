import java.util.Set;
import java.util.function.Predicate;

public interface btj extends bth {
   float r_ = 4.0F;

   int b();

   boolean c();

   cxy a(int var1);

   cxy a(int var1, int var2);

   cxy b(int var1);

   void a(int var1, cxy var2);

   default int aj_() {
      return 99;
   }

   default int e_(cxy $$0) {
      return Math.min(this.aj_(), $$0.k());
   }

   void e();

   boolean a(cqi var1);

   default void c_(cqi $$0) {
   }

   default void c(cqi $$0) {
   }

   default boolean b(int $$0, cxy $$1) {
      return true;
   }

   default boolean a(btj $$0, int $$1, cxy $$2) {
      return true;
   }

   default int a_(cxu $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cxy $$3 = this.a($$2);
         if ($$3.h().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cxu> $$0) {
      return this.a_($$1 -> !$$1.f() && $$0.contains($$1.h()));
   }

   default boolean a_(Predicate<cxy> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cxy $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dvl $$0, cqi $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dvl $$0, cqi $$1, float $$2) {
      dhp $$3 = $$0.i();
      jj $$4 = $$0.aw_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
