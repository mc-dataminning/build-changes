import java.util.List;
import java.util.function.Predicate;

public class buw {
   public static final String a = "Items";

   public static dak a(List<dak> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !$$0.get($$1).f() && $$2 > 0 ? $$0.get($$1).a($$2) : dak.l;
   }

   public static dak a(List<dak> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.set($$1, dak.l) : dak.l;
   }

   public static ua a(ua $$0, jp<dak> $$1, ji.a $$2) {
      return a($$0, $$1, true, $$2);
   }

   public static ua a(ua $$0, jp<dak> $$1, boolean $$2, ji.a $$3) {
      ug $$4 = new ug();

      for (int $$5 = 0; $$5 < $$1.size(); $$5++) {
         dak $$6 = $$1.get($$5);
         if (!$$6.f()) {
            ua $$7 = new ua();
            $$7.a("Slot", (byte)$$5);
            $$4.add($$6.b($$3, $$7));
         }
      }

      if (!$$4.isEmpty() || $$2) {
         $$0.a("Items", $$4);
      }

      return $$0;
   }

   public static void b(ua $$0, jp<dak> $$1, ji.a $$2) {
      ug $$3 = $$0.p("Items");

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ua $$5 = $$3.b($$4);
         int $$6 = $$5.b("Slot", (byte)0) & 255;
         if ($$6 >= 0 && $$6 < $$1.size()) {
            $$1.set($$6, dak.a($$2, $$5).orElse(dak.l));
         }
      }
   }

   public static int a(buv $$0, Predicate<dak> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         dak $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.f()) {
            $$0.a($$5, dak.l);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(dak $$0, Predicate<dak> $$1, int $$2, boolean $$3) {
      if ($$0.f() || !$$1.test($$0)) {
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
