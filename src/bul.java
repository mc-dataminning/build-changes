import java.util.List;
import java.util.function.Predicate;

public class bul {
   public static final String a = "Items";

   public static czy a(List<czy> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !$$0.get($$1).f() && $$2 > 0 ? $$0.get($$1).a($$2) : czy.k;
   }

   public static czy a(List<czy> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.set($$1, czy.k) : czy.k;
   }

   public static tz a(tz $$0, jo<czy> $$1, jh.a $$2) {
      return a($$0, $$1, true, $$2);
   }

   public static tz a(tz $$0, jo<czy> $$1, boolean $$2, jh.a $$3) {
      uf $$4 = new uf();

      for (int $$5 = 0; $$5 < $$1.size(); $$5++) {
         czy $$6 = $$1.get($$5);
         if (!$$6.f()) {
            tz $$7 = new tz();
            $$7.a("Slot", (byte)$$5);
            $$4.add($$6.b($$3, $$7));
         }
      }

      if (!$$4.isEmpty() || $$2) {
         $$0.a("Items", $$4);
      }

      return $$0;
   }

   public static void b(tz $$0, jo<czy> $$1, jh.a $$2) {
      uf $$3 = $$0.p("Items");

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         tz $$5 = $$3.b($$4);
         int $$6 = $$5.b("Slot", (byte)0) & 255;
         if ($$6 >= 0 && $$6 < $$1.size()) {
            $$1.set($$6, czy.a($$2, $$5).orElse(czy.k));
         }
      }
   }

   public static int a(buk $$0, Predicate<czy> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         czy $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.f()) {
            $$0.a($$5, czy.k);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(czy $$0, Predicate<czy> $$1, int $$2, boolean $$3) {
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
