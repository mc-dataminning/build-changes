import java.util.List;
import java.util.function.Predicate;

public class brm {
   public static final String a = "Items";

   public static cvs a(List<cvs> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !$$0.get($$1).f() && $$2 > 0 ? $$0.get($$1).a($$2) : cvs.k;
   }

   public static cvs a(List<cvs> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.set($$1, cvs.k) : cvs.k;
   }

   public static ug a(ug $$0, jx<cvs> $$1, jq.a $$2) {
      return a($$0, $$1, true, $$2);
   }

   public static ug a(ug $$0, jx<cvs> $$1, boolean $$2, jq.a $$3) {
      um $$4 = new um();

      for (int $$5 = 0; $$5 < $$1.size(); $$5++) {
         cvs $$6 = $$1.get($$5);
         if (!$$6.f()) {
            ug $$7 = new ug();
            $$7.a("Slot", (byte)$$5);
            $$4.add($$6.b($$3, $$7));
         }
      }

      if (!$$4.isEmpty() || $$2) {
         $$0.a("Items", $$4);
      }

      return $$0;
   }

   public static void b(ug $$0, jx<cvs> $$1, jq.a $$2) {
      um $$3 = $$0.c("Items", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ug $$5 = $$3.a($$4);
         int $$6 = $$5.f("Slot") & 255;
         if ($$6 >= 0 && $$6 < $$1.size()) {
            $$1.set($$6, cvs.a($$2, (vd)$$5).orElse(cvs.k));
         }
      }
   }

   public static int a(brl $$0, Predicate<cvs> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cvs $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.f()) {
            $$0.a($$5, cvs.k);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(cvs $$0, Predicate<cvs> $$1, int $$2, boolean $$3) {
      if ($$0.f() || !$$1.test($$0)) {
         return 0;
      } else if ($$3) {
         return $$0.K();
      } else {
         int $$4 = $$2 < 0 ? $$0.K() : Math.min($$2, $$0.K());
         $$0.h($$4);
         return $$4;
      }
   }
}
