import java.util.Set;
import java.util.function.Predicate;

public interface bjt extends bjr {
   int n_ = 64;
   int o_ = 8;

   int b();

   boolean ai_();

   cmx a(int var1);

   cmx a(int var1, int var2);

   cmx b(int var1);

   void a(int var1, cmx var2);

   default int ak_() {
      return 64;
   }

   void e();

   boolean a(cfh var1);

   default void d_(cfh $$0) {
   }

   default void c(cfh $$0) {
   }

   default boolean b(int $$0, cmx $$1) {
      return true;
   }

   default boolean a(bjt $$0, int $$1, cmx $$2) {
      return true;
   }

   default int a_(cms $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cmx $$3 = this.a($$2);
         if ($$3.d().equals($$0)) {
            $$1 += $$3.L();
         }
      }

      return $$1;
   }

   default boolean a(Set<cms> $$0) {
      return this.a_($$1 -> !$$1.b() && $$0.contains($$1.d()));
   }

   default boolean a_(Predicate<cmx> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cmx $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dgu $$0, cfh $$1) {
      return a($$0, $$1, 8);
   }

   static boolean a(dgu $$0, cfh $$1, int $$2) {
      cto $$3 = $$0.i();
      hx $$4 = $$0.aB_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.i((double)$$4.u() + 0.5, (double)$$4.v() + 0.5, (double)$$4.w() + 0.5) <= (double)($$2 * $$2);
      }
   }
}
