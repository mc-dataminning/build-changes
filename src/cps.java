import java.util.stream.Stream;

public class cps {
   public static bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      $$1.c($$2);
      return bmm.b($$1.b($$2));
   }

   public static cpq a(cpq $$0, cia $$1, cpq $$2, boolean $$3) {
      boolean $$4 = $$1.fW().d;
      if ($$3 && $$4) {
         if (!$$1.fV().h($$2)) {
            $$1.fV().e($$2);
         }

         return $$0;
      } else {
         if (!$$4) {
            $$0.h(1);
         }

         if ($$0.b()) {
            return $$2;
         } else {
            if (!$$1.fV().e($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cpq a(cpq $$0, cia $$1, cpq $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cel $$0, Stream<cpq> $$1) {
      cwe $$2 = $$0.dJ();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cel($$2, $$0.do(), $$0.dq(), $$0.du(), $$2x)));
      }
   }
}
