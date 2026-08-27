import java.util.List;
import java.util.function.Predicate;

public class bmw {
   public static cqk a(List<cqk> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !$$0.get($$1).b() && $$2 > 0 ? $$0.get($$1).a($$2) : cqk.h;
   }

   public static cqk a(List<cqk> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.set($$1, cqk.h) : cqk.h;
   }

   public static ta a(ta $$0, iu<cqk> $$1) {
      return a($$0, $$1, true);
   }

   public static ta a(ta $$0, iu<cqk> $$1, boolean $$2) {
      tg $$3 = new tg();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         cqk $$5 = $$1.get($$4);
         if (!$$5.b()) {
            ta $$6 = new ta();
            $$6.a("Slot", (byte)$$4);
            $$5.b($$6);
            $$3.add($$6);
         }
      }

      if (!$$3.isEmpty() || $$2) {
         $$0.a("Items", $$3);
      }

      return $$0;
   }

   public static void b(ta $$0, iu<cqk> $$1) {
      tg $$2 = $$0.c("Items", 10);

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         ta $$4 = $$2.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < $$1.size()) {
            $$1.set($$5, cqk.a($$4));
         }
      }
   }

   public static int a(bmv $$0, Predicate<cqk> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cqk $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.b()) {
            $$0.a($$5, cqk.h);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(cqk $$0, Predicate<cqk> $$1, int $$2, boolean $$3) {
      if ($$0.b() || !$$1.test($$0)) {
         return 0;
      } else if ($$3) {
         return $$0.M();
      } else {
         int $$4 = $$2 < 0 ? $$0.M() : Math.min($$2, $$0.M());
         $$0.h($$4);
         return $$4;
      }
   }
}
