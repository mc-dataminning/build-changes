import java.util.List;
import java.util.function.Predicate;

public class btc {
   public static final String a = "Items";

   public static cxo a(List<cxo> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !$$0.get($$1).f() && $$2 > 0 ? $$0.get($$1).a($$2) : cxo.j;
   }

   public static cxo a(List<cxo> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.set($$1, cxo.j) : cxo.j;
   }

   public static ux a(ux $$0, jz<cxo> $$1, js.a $$2) {
      return a($$0, $$1, true, $$2);
   }

   public static ux a(ux $$0, jz<cxo> $$1, boolean $$2, js.a $$3) {
      vd $$4 = new vd();

      for (int $$5 = 0; $$5 < $$1.size(); $$5++) {
         cxo $$6 = $$1.get($$5);
         if (!$$6.f()) {
            ux $$7 = new ux();
            $$7.a("Slot", (byte)$$5);
            $$4.add($$6.b($$3, $$7));
         }
      }

      if (!$$4.isEmpty() || $$2) {
         $$0.a("Items", $$4);
      }

      return $$0;
   }

   public static void b(ux $$0, jz<cxo> $$1, js.a $$2) {
      vd $$3 = $$0.c("Items", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ux $$5 = $$3.a($$4);
         int $$6 = $$5.f("Slot") & 255;
         if ($$6 >= 0 && $$6 < $$1.size()) {
            $$1.set($$6, cxo.a($$2, (vu)$$5).orElse(cxo.j));
         }
      }
   }

   public static int a(btb $$0, Predicate<cxo> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cxo $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.f()) {
            $$0.a($$5, cxo.j);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(cxo $$0, Predicate<cxo> $$1, int $$2, boolean $$3) {
      if ($$0.f() || !$$1.test($$0)) {
         return 0;
      } else if ($$3) {
         return $$0.L();
      } else {
         int $$4 = $$2 < 0 ? $$0.L() : Math.min($$2, $$0.L());
         $$0.h($$4);
         return $$4;
      }
   }
}
