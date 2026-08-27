import java.util.List;
import java.util.function.Predicate;

public class bpq {
   public static final String a = "Items";

   public static ctq a(List<ctq> $$0, int $$1, int $$2) {
      return $$1 >= 0 && $$1 < $$0.size() && !$$0.get($$1).e() && $$2 > 0 ? $$0.get($$1).a($$2) : ctq.i;
   }

   public static ctq a(List<ctq> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.set($$1, ctq.i) : ctq.i;
   }

   public static ud a(ud $$0, jg<ctq> $$1, iz.a $$2) {
      return a($$0, $$1, true, $$2);
   }

   public static ud a(ud $$0, jg<ctq> $$1, boolean $$2, iz.a $$3) {
      uj $$4 = new uj();

      for (int $$5 = 0; $$5 < $$1.size(); $$5++) {
         ctq $$6 = $$1.get($$5);
         if (!$$6.e()) {
            ud $$7 = new ud();
            $$7.a("Slot", (byte)$$5);
            $$4.add($$6.b($$3, $$7));
         }
      }

      if (!$$4.isEmpty() || $$2) {
         $$0.a("Items", $$4);
      }

      return $$0;
   }

   public static void b(ud $$0, jg<ctq> $$1, iz.a $$2) {
      uj $$3 = $$0.c("Items", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         ud $$5 = $$3.a($$4);
         int $$6 = $$5.f("Slot") & 255;
         if ($$6 >= 0 && $$6 < $$1.size()) {
            $$1.set($$6, ctq.a($$2, (va)$$5).orElse(ctq.i));
         }
      }
   }

   public static int a(bpp $$0, Predicate<ctq> $$1, int $$2, boolean $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         ctq $$6 = $$0.a($$5);
         int $$7 = a($$6, $$1, $$2 - $$4, $$3);
         if ($$7 > 0 && !$$3 && $$6.e()) {
            $$0.a($$5, ctq.i);
         }

         $$4 += $$7;
      }

      return $$4;
   }

   public static int a(ctq $$0, Predicate<ctq> $$1, int $$2, boolean $$3) {
      if ($$0.e() || !$$1.test($$0)) {
         return 0;
      } else if ($$3) {
         return $$0.I();
      } else {
         int $$4 = $$2 < 0 ? $$0.I() : Math.min($$2, $$0.I());
         $$0.h($$4);
         return $$4;
      }
   }
}
