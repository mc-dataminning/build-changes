import java.util.Set;
import java.util.function.Predicate;

public interface bgm extends bgk {
   int m_ = 64;
   int n_ = 8;

   int b();

   boolean aa_();

   cja a(int var1);

   cja a(int var1, int var2);

   cja b(int var1);

   void a(int var1, cja var2);

   default int ab_() {
      return 64;
   }

   void e();

   boolean a(cbp var1);

   default void d_(cbp $$0) {
   }

   default void c(cbp $$0) {
   }

   default boolean b(int $$0, cja $$1) {
      return true;
   }

   default boolean a(bgm $$0, int $$1, cja $$2) {
      return true;
   }

   default int a_(civ $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cja $$3 = this.a($$2);
         if ($$3.d().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a(Set<civ> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.d()));
   }

   default boolean a_(Predicate<cja> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cja $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dcq $$0, cbp $$1) {
      return a($$0, $$1, 8);
   }

   static boolean a(dcq $$0, cbp $$1, int $$2) {
      cpq $$3 = $$0.k();
      gw $$4 = $$0.p();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.i((double)$$4.u() + 0.5, (double)$$4.v() + 0.5, (double)$$4.w() + 0.5) <= (double)($$2 * $$2);
      }
   }
}
