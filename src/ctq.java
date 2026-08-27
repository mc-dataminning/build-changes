import java.util.stream.Stream;

public class ctq {
   public static bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      $$1.c($$2);
      return bpv.b($$1.b($$2));
   }

   public static cto a(cto $$0, clw $$1, cto $$2, boolean $$3) {
      boolean $$4 = $$1.fP();
      if ($$3 && $$4) {
         if (!$$1.gc().i($$2)) {
            $$1.gc().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.e()) {
            return $$2;
         } else {
            if (!$$1.gc().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cto a(cto $$0, clw $$1, cto $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cig $$0, Stream<cto> $$1) {
      dax $$2 = $$0.dP();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cig($$2, $$0.du(), $$0.dw(), $$0.dA(), $$2x)));
      }
   }
}
