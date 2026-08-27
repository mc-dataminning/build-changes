import java.util.List;
import java.util.function.Predicate;

public class blo {
   public static coz a(List<coz> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !$$0.get($$1).b() && $$2 > 0 ? $$0.get($$1).a($$2) : coz.h;
   }

   public static coz a(List<coz> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.set($$1, coz.h) : coz.h;
   }

   public static sw a(sw $$0, is<coz> $$1) {
      return a($$0, $$1, true);
   }

   public static sw a(sw $$0, is<coz> $$1, boolean $$2) {
      tc $$3 = new tc();

      for (int $$4 = 0; $$4 < $$1.size(); $$4++) {
         coz $$5 = $$1.get($$4);
         if (!$$5.b()) {
            sw $$6 = new sw();
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

   public static void b(sw $$0, is<coz> $$1) {
      tc $$2 = $$0.c("Items", 10);

      for (int $$3 = 0; $$3 < $$2.size(); $$3++) {
         sw $$4 = $$2.a($$3);
         int $$5 = $$4.f("Slot") & 255;
         if ($$5 >= 0 && $$5 < $$1.size()) {
            $$1.set($$5, coz.a($$4));
         }
      }
   }

   public static int a(bln $$0, Predicate<coz> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         coz $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.b()) {
            $$0.a($$5, coz.h);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(coz $$0, Predicate<coz> $$1, int $$2, boolean $$3) {
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
