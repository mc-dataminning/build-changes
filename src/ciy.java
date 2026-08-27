import java.util.stream.Stream;

public class ciy {
   public static bgp<ciw> a(cpk $$0, cbl $$1, bgn $$2) {
      $$1.c($$2);
      return bgp.b($$1.b($$2));
   }

   public static ciw a(ciw $$0, cbl $$1, ciw $$2, boolean $$3) {
      boolean $$4 = $$1.fR().d;
      if ($$3 && $$4) {
         if (!$$1.fQ().h($$2)) {
            $$1.fQ().e($$2);
         }

         return $$0;
      } else {
         if (!$$4) {
            $$0.h(1);
         }

         if ($$0.b()) {
            return $$2;
         } else {
            if (!$$1.fQ().e($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static ciw a(ciw $$0, cbl $$1, ciw $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(bye $$0, Stream<ciw> $$1) {
      cpk $$2 = $$0.dK();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new bye($$2, $$0.dp(), $$0.dr(), $$0.dv(), $$2x)));
      }
   }
}
