import java.util.stream.Stream;

public class clq {
   public static bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      $$1.c($$2);
      return bjc.b($$1.b($$2));
   }

   public static clo a(clo $$0, cdz $$1, clo $$2, boolean $$3) {
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

   public static clo a(clo $$0, cdz $$1, clo $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cas $$0, Stream<clo> $$1) {
      csf $$2 = $$0.dN();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new cas($$2, $$0.ds(), $$0.du(), $$0.dy(), $$2x)));
      }
   }
}
