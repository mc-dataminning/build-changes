import java.util.stream.Stream;

public class ciz {
   public static bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      $$1.c($$2);
      return bgr.b($$1.b($$2));
   }

   public static cix a(cix $$0, cbm $$1, cix $$2, boolean $$3) {
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

   public static cix a(cix $$0, cbm $$1, cix $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(byf $$0, Stream<cix> $$1) {
      cpl $$2 = $$0.dK();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new byf($$2, $$0.dp(), $$0.dr(), $$0.dv(), $$2x)));
      }
   }
}
