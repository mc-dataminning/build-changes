import java.util.stream.Stream;

public class cll {
   public static biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      $$1.c($$2);
      return biy.b($$1.b($$2));
   }

   public static clj a(clj $$0, cdu $$1, clj $$2, boolean $$3) {
      boolean $$4 = $$1.fU().d;
      if ($$3 && $$4) {
         if (!$$1.fT().h($$2)) {
            $$1.fT().e($$2);
         }

         return $$0;
      } else {
         if (!$$4) {
            $$0.h(1);
         }

         if ($$0.b()) {
            return $$2;
         } else {
            if (!$$1.fT().e($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static clj a(clj $$0, cdu $$1, clj $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(can $$0, Stream<clj> $$1) {
      csa $$2 = $$0.dN();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new can($$2, $$0.ds(), $$0.du(), $$0.dy(), $$2x)));
      }
   }
}
