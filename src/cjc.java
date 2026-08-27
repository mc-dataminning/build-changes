import java.util.stream.Stream;

public class cjc {
   public static bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      $$1.c($$2);
      return bgu.b($$1.b($$2));
   }

   public static cja a(cja $$0, cbp $$1, cja $$2, boolean $$3) {
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

   public static cja a(cja $$0, cbp $$1, cja $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(byi $$0, Stream<cja> $$1) {
      cpq $$2 = $$0.dK();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new byi($$2, $$0.dp(), $$0.dr(), $$0.dv(), $$2x)));
      }
   }
}
