import java.util.Set;
import java.util.function.Predicate;

public interface bpp extends bpn {
   float o_ = 4.0F;

   int b();

   boolean c();

   ctq a(int var1);

   ctq a(int var1, int var2);

   ctq b(int var1);

   void a(int var1, ctq var2);

   default int ai_() {
      return 99;
   }

   default int e_(ctq $$0) {
      return Math.min(this.ai_(), $$0.j());
   }

   void e();

   boolean a(cly var1);

   default void d_(cly $$0) {
   }

   default void c(cly $$0) {
   }

   default boolean b(int $$0, ctq $$1) {
      return true;
   }

   default boolean a(bpp $$0, int $$1, ctq $$2) {
      return true;
   }

   default int a_(ctl $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         ctq $$3 = this.a($$2);
         if ($$3.g().equals($$0)) {
            $$1 += $$3.I();
         }
      }

      return $$1;
   }

   default boolean a(Set<ctl> $$0) {
      return this.a_($$1 -> !$$1.e() && $$0.contains($$1.g()));
   }

   default boolean a_(Predicate<ctq> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         ctq $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(doi $$0, cly $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(doi $$0, cly $$1, float $$2) {
      daz $$3 = $$0.i();
      io $$4 = $$0.aA_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
