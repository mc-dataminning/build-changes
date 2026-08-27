import java.util.List;
import java.util.function.Predicate;

public class bnz {
   public static final String a = "Items";

   public static crs a(List<crs> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !$$0.get($$1).d() && $$2 > 0 ? $$0.get($$1).a($$2) : crs.i;
   }

   public static crs a(List<crs> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.set($$1, crs.i) : crs.i;
   }

   public static to a(to $$0, iw<crs> $$1, ip.a $$2) {
      return a($$0, $$1, true, $$2);
   }

   public static to a(to $$0, iw<crs> $$1, boolean $$2, ip.a $$3) {
      tu $$4 = new tu();

      for (int $$5 = 0; $$5 < $$1.size(); $$5++) {
         crs $$6 = $$1.get($$5);
         if (!$$6.d()) {
            to $$7 = new to();
            $$7.a("Slot", (byte)$$5);
            $$4.add($$6.b($$3, $$7));
         }
      }

      if (!$$4.isEmpty() || $$2) {
         $$0.a("Items", $$4);
      }

      return $$0;
   }

   public static void b(to $$0, iw<crs> $$1, ip.a $$2) {
      tu $$3 = $$0.c("Items", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         to $$5 = $$3.a($$4);
         int $$6 = $$5.f("Slot") & 255;
         if ($$6 >= 0 && $$6 < $$1.size()) {
            $$1.set($$6, crs.a($$2, (ul)$$5).orElse(crs.i));
         }
      }
   }

   public static int a(bny $$0, Predicate<crs> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         crs $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.d()) {
            $$0.a($$5, crs.i);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(crs $$0, Predicate<crs> $$1, int $$2, boolean $$3) {
      if ($$0.d() || !$$1.test($$0)) {
         return 0;
      } else if ($$3) {
         return $$0.G();
      } else {
         int $$4 = $$2 < 0 ? $$0.G() : Math.min($$2, $$0.G());
         $$0.g($$4);
         return $$4;
      }
   }
}
