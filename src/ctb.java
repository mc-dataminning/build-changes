import java.util.stream.Stream;

public class ctb {
   public static bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      $$1.c($$2);
      return bpn.b($$1.b($$2));
   }

   public static csz a(csz $$0, clh $$1, csz $$2, boolean $$3) {
      boolean $$4 = $$1.fN();
      if ($$3 && $$4) {
         if (!$$1.ga().i($$2)) {
            $$1.ga().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.d()) {
            return $$2;
         } else {
            if (!$$1.ga().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static csz a(csz $$0, clh $$1, csz $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(chr $$0, Stream<csz> $$1) {
      dad $$2 = $$0.dN();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new chr($$2, $$0.ds(), $$0.du(), $$0.dy(), $$2x)));
      }
   }
}
