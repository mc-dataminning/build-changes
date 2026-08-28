public class cmh {
   private static final cmh.b a = new cmh.b(a(a().a(b(cyw.p), 5).a(b(cyw.h), 5).a(b(cyw.i), 5).a(b(cyw.m), 3).a(a(cyw.a), 82).a()));
   private static final cmh.b b = new cmh.b(a(a().a(b(cyw.h), 5).a(b(cyw.i), 5).a(b(cyw.a), 5).a(b(cyw.p), 3).a(a(cyw.m), 82).a()));
   private static final cmh.b c = new cmh.b(a(a().a(b(cyw.i), 5).a(b(cyw.h), 5).a(b(cyw.a), 5).a(b(cyw.m), 3).a(a(cyw.p), 82).a()));

   private static cmh.a a(cyw $$0) {
      return a(a().a(b($$0), 499).a(b(cyw.g), 1).a());
   }

   public static cyw a(jf<dla> $$0, azx $$1) {
      cmh.b $$2 = a($$0);
      return $$2.a().get($$1);
   }

   private static cmh.b a(jf<dla> $$0) {
      if ($$0.a(axd.al)) {
         return b;
      } else {
         return $$0.a(axd.ak) ? c : a;
      }
   }

   private static cmh.a a(btb<cmh.a> $$0) {
      if ($$0.c()) {
         throw new IllegalArgumentException("List must be non-empty");
      } else {
         return $$1 -> $$0.b($$1).get($$1);
      }
   }

   private static cmh.a b(cyw $$0) {
      return $$1 -> $$0;
   }

   private static btb.a<cmh.a> a() {
      return btb.b();
   }

   @FunctionalInterface
   interface a {
      cyw get(azx var1);
   }

   static record b(cmh.a a) {
   }
}
