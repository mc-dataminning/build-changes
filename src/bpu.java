import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class bpu {
   public static final String a = "Items";

   public static int a(bpt $$0, cuh $$1) {
      IntList $$2 = new IntArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cuh $$4 = $$0.a($$3);
         if ($$4.d()) {
            $$2.add($$3);
         }
      }

      if ($$2.isEmpty()) {
         return -1;
      } else {
         Collections.shuffle($$2);
         int $$5 = $$2.getInt(0);
         $$0.a($$5, $$1);
         return $$5;
      }
   }

   public static cuh a(List<cuh> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !$$0.get($$1).d() && $$2 > 0 ? $$0.get($$1).a($$2) : cuh.i;
   }

   public static cuh a(List<cuh> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.set($$1, cuh.i) : cuh.i;
   }

   public static uk a(uk $$0, jj<cuh> $$1, jc.a $$2) {
      return a($$0, $$1, true, $$2);
   }

   public static uk a(uk $$0, jj<cuh> $$1, boolean $$2, jc.a $$3) {
      uq $$4 = new uq();

      for (int $$5 = 0; $$5 < $$1.size(); $$5++) {
         cuh $$6 = $$1.get($$5);
         if (!$$6.d()) {
            uk $$7 = new uk();
            $$7.a("Slot", (byte)$$5);
            $$4.add($$6.b($$3, $$7));
         }
      }

      if (!$$4.isEmpty() || $$2) {
         $$0.a("Items", $$4);
      }

      return $$0;
   }

   public static void b(uk $$0, jj<cuh> $$1, jc.a $$2) {
      uq $$3 = $$0.c("Items", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         uk $$5 = $$3.a($$4);
         int $$6 = $$5.f("Slot") & 255;
         if ($$6 >= 0 && $$6 < $$1.size()) {
            $$1.set($$6, cuh.a($$2, (vh)$$5).orElse(cuh.i));
         }
      }
   }

   public static int a(bpt $$0, Predicate<cuh> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cuh $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.d()) {
            $$0.a($$5, cuh.i);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(cuh $$0, Predicate<cuh> $$1, int $$2, boolean $$3) {
      if ($$0.d() || !$$1.test($$0)) {
         return 0;
      } else if ($$3) {
         return $$0.G();
      } else {
         int $$4 = $$2 < 0 ? $$0.G() : Math.min($$2, $$0.G());
         $$0.h($$4);
         return $$4;
      }
   }
}
