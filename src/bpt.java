import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public interface bpt extends bpr {
   float o_ = 4.0F;

   int b();

   boolean c();

   cuh a(int var1);

   cuh a(int var1, int var2);

   cuh b(int var1);

   void a(int var1, cuh var2);

   default int ai_() {
      return 99;
   }

   default int a(cuh $$0) {
      return Math.min(this.ai_(), $$0.i());
   }

   void e();

   boolean a(cly var1);

   default void d_(cly $$0) {
   }

   default void c(cly $$0) {
   }

   default boolean b(int $$0, cuh $$1) {
      return true;
   }

   default boolean a(bpt $$0, int $$1, cuh $$2) {
      return true;
   }

   default int a_(cuc $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.b(); $$2++) {
         cuh $$3 = this.a($$2);
         if ($$3.f().equals($$0)) {
            $$1 += $$3.G();
         }
      }

      return $$1;
   }

   default boolean a(Set<cuc> $$0) {
      return this.b($$1 -> !$$1.d() && $$0.contains($$1.f()));
   }

   default List<cuh> a_(Predicate<cuh> $$0) {
      List<cuh> $$1 = Lists.newArrayList();
      this.a($$2 -> {
         if ($$0.test($$2)) {
            $$1.add($$2);
         }
      });
      return $$1;
   }

   default void a(Consumer<cuh> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cuh $$2 = this.a($$1);
         if (!$$2.d()) {
            $$0.accept($$2);
         }
      }
   }

   default boolean b(Predicate<cuh> $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         cuh $$2 = this.a($$1);
         if ($$0.test($$2)) {
            return true;
         }
      }

      return false;
   }

   static boolean a(dqc $$0, cly $$1) {
      return a($$0, $$1, 4.0F);
   }

   static boolean a(dqc $$0, cly $$1, float $$2) {
      dca $$3 = $$0.i();
      ir $$4 = $$0.az_();
      if ($$3 == null) {
         return false;
      } else {
         return $$3.c_($$4) != $$0 ? false : $$1.a($$4, (double)$$2);
      }
   }
}
