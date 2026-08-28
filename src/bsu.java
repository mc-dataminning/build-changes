import java.util.List;
import java.util.function.Predicate;

public class bsu {
   public static final String a = "Items";

   public static cxg a(List<cxg> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !$$0.get($$1).f() && $$2 > 0 ? $$0.get($$1).a($$2) : cxg.j;
   }

   public static cxg a(List<cxg> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.set($$1, cxg.j) : cxg.j;
   }

   public static um a(um $$0, jz<cxg> $$1, js.a $$2) {
      return a($$0, $$1, true, $$2);
   }

   public static um a(um $$0, jz<cxg> $$1, boolean $$2, js.a $$3) {
      us $$4 = new us();

      for (int $$5 = 0; $$5 < $$1.size(); $$5++) {
         cxg $$6 = $$1.get($$5);
         if (!$$6.f()) {
            um $$7 = new um();
            $$7.a("Slot", (byte)$$5);
            $$4.add($$6.b($$3, $$7));
         }
      }

      if (!$$4.isEmpty() || $$2) {
         $$0.a("Items", $$4);
      }

      return $$0;
   }

   public static void b(um $$0, jz<cxg> $$1, js.a $$2) {
      us $$3 = $$0.c("Items", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         um $$5 = $$3.a($$4);
         int $$6 = $$5.f("Slot") & 255;
         if ($$6 >= 0 && $$6 < $$1.size()) {
            $$1.set($$6, cxg.a($$2, (vj)$$5).orElse(cxg.j));
         }
      }
   }

   public static int a(bst $$0, Predicate<cxg> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cxg $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.f()) {
            $$0.a($$5, cxg.j);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(cxg $$0, Predicate<cxg> $$1, int $$2, boolean $$3) {
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
