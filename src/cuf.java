public class cuf {
   public static bqi<cud> a(dcg $$0, cml $$1, bqg $$2) {
      $$1.c($$2);
      return bqi.b($$1.b($$2));
   }

   public static cud a(cud $$0, cml $$1, cud $$2, boolean $$3) {
      boolean $$4 = $$1.fN();
      if ($$3 && $$4) {
         if (!$$1.ga().i($$2)) {
            $$1.ga().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.e()) {
            return $$2;
         } else {
            if (!$$1.ga().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cud a(cud $$0, cml $$1, cud $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(civ $$0, Iterable<cud> $$1) {
      dcg $$2 = $$0.dR();
      if (!$$2.B) {
         $$1.forEach($$2x -> $$2.b(new civ($$2, $$0.dw(), $$0.dy(), $$0.dC(), $$2x)));
      }
   }
}
