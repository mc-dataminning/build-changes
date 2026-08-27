import java.util.stream.Stream;

public class cgb {
   public static bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      $$1.c($$2);
      return bdy.b($$1.b($$2));
   }

   public static cfz a(cfz $$0, byo $$1, cfz $$2, boolean $$3) {
      boolean $$4 = $$1.fO().d;
      if ($$3 && $$4) {
         if (!$$1.fN().h($$2)) {
            $$1.fN().e($$2);
         }

         return $$0;
      } else {
         if (!$$4) {
            $$0.h(1);
         }

         if ($$0.b()) {
            return $$2;
         } else {
            if (!$$1.fN().e($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cfz a(cfz $$0, byo $$1, cfz $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(bvh $$0, Stream<cfz> $$1) {
      cmm $$2 = $$0.dI();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new bvh($$2, $$0.dn(), $$0.dp(), $$0.dt(), $$2x)));
      }
   }
}
