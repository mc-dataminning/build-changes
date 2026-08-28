import java.util.Set;
import java.util.function.Predicate;

public interface bqk extends bqi {
   float p_ = 4.0F;

   int b();

   boolean c();

   cuq a(int var1);

   cuq a(int var1, int var2);

   cuq b(int var1);

   void a(int var1, cuq var2);

   default int al_() {
      return 99;
   }

   default int e_(cuq $$0) {
      return Math.min(this.al_(), $$0.j());
   }

   void e();

   boolean a(cmx var1);

   default void d_(cmx $$0) {
   }

   default void c(cmx $$0) {
   }

   default boolean b(int $$0, cuq $$1) {
      return true;
   }

   default boolean a(bqk $$0, int $$1, cuq $$2) {
      return true;
   }

   default int a_(cul $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cuq $$3 = this.a($$2);
         if ($$3.g().equals($$0)) {
            $$1 += $$3.H();
         }
      }

      return $$1;
   }

   default boolean a(Set<cul> $$0) {
      return this.a_($$1 -> !$$1.e() && $$0.contains($$1.g()));
   }

   default boolean a_(Predicate<cuq> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cuq $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dqh $$0, cmx $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dqh $$0, cmx $$1, float $$2) {
      dcw $$3 = $$0.i();
      jd $$4 = $$0.aD_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
