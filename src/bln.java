import java.util.Set;
import java.util.function.Predicate;

public interface bln extends bll {
   int o_ = 64;
   float p_ = 4.0F;

   int b();

   boolean aj_();

   coz a(int var1);

   coz a(int var1, int var2);

   coz b(int var1);

   void a(int var1, coz var2);

   default int al_() {
      return 64;
   }

   void e();

   boolean a(chh var1);

   default void d_(chh $$0) {
   }

   default void c(chh $$0) {
   }

   default boolean b(int $$0, coz $$1) {
      return true;
   }

   default boolean a(bln $$0, int $$1, coz $$2) {
      return true;
   }

   default int a_(cou $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         coz $$3 = this.a($$2);
         if ($$3.d().equals($$0)) {
            $$1 += $$3.M();
         }
      }

      return $$1;
   }

   default boolean a(Set<cou> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.d()));
   }

   default boolean a_(Predicate<coz> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         coz $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dit $$0, chh $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dit $$0, chh $$1, float $$2) {
      cvn $$3 = $$0.i();
      hz $$4 = $$0.aE_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
