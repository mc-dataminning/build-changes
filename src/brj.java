import java.util.List;
import java.util.function.Predicate;

public class brj {
   public static final String a = "Items";

   public static cvp a(List<cvp> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !$$0.get($$1).f() && $$2 > 0 ? $$0.get($$1).a($$2) : cvp.k;
   }

   public static cvp a(List<cvp> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.set($$1, cvp.k) : cvp.k;
   }

   public static uf a(uf $$0, jw<cvp> $$1, jp.a $$2) {
      return a($$0, $$1, true, $$2);
   }

   public static uf a(uf $$0, jw<cvp> $$1, boolean $$2, jp.a $$3) {
      ul $$4 = new ul();

      for (int $$5 = 0; $$5 < $$1.size(); $$5++) {
         cvp $$6 = $$1.get($$5);
         if (!$$6.f()) {
            uf $$7 = new uf();
            $$7.a("Slot", (byte)$$5);
            $$4.add($$6.b($$3, $$7));
         }
      }

      if (!$$4.isEmpty() || $$2) {
         $$0.a("Items", $$4);
      }

      return $$0;
   }

   public static void b(uf $$0, jw<cvp> $$1, jp.a $$2) {
      ul $$3 = $$0.c("Items", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         uf $$5 = $$3.a($$4);
         int $$6 = $$5.f("Slot") & 255;
         if ($$6 >= 0 && $$6 < $$1.size()) {
            $$1.set($$6, cvp.a($$2, (vc)$$5).orElse(cvp.k));
         }
      }
   }

   public static int a(bri $$0, Predicate<cvp> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cvp $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.f()) {
            $$0.a($$5, cvp.k);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(cvp $$0, Predicate<cvp> $$1, int $$2, boolean $$3) {
      if ($$0.f() || !$$1.test($$0)) {
         return 0;
      } else if ($$3) {
         return $$0.J();
      } else {
         int $$4 = $$2 < 0 ? $$0.J() : Math.min($$2, $$0.J());
         $$0.h($$4);
         return $$4;
      }
   }
}
