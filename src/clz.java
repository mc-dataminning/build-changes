public class clz {
   private static final clz.b a = new clz.b(a(a().a(b(cyi.p), 5).a(b(cyi.h), 5).a(b(cyi.i), 5).a(b(cyi.m), 3).a(a(cyi.a), 82).a()));
   private static final clz.b b = new clz.b(a(a().a(b(cyi.h), 5).a(b(cyi.e), 5).a(b(cyi.b), 5).a(b(cyi.o), 3).a(a(cyi.m), 82).a()));
   private static final clz.b c = new clz.b(a(a().a(b(cyi.i), 5).a(b(cyi.d), 5).a(b(cyi.l), 5).a(b(cyi.j), 3).a(a(cyi.p), 82).a()));

   private static clz.a a(cyi $$0) {
      return a(a().a(b($$0), 499).a(b(cyi.g), 1).a());
   }

   public static cyi a(jf<dkk> $$0, azv $$1) {
      clz.b $$2 = a($$0);
      return $$2.a().get($$1);
   }

   private static clz.b a(jf<dkk> $$0) {
      if ($$0.a(axb.al)) {
         return b;
      } else {
         return $$0.a(axb.ak) ? c : a;
      }
   }

   private static clz.a a(bsq<clz.a> $$0) {
      if ($$0.c()) {
         throw new IllegalArgumentException("List must be non-empty");
      } else {
         return $$1 -> $$0.b($$1).get($$1);
      }
   }

   private static clz.a b(cyi $$0) {
      return $$1 -> $$0;
   }

   private static bsq.a<clz.a> a() {
      return bsq.b();
   }

   @FunctionalInterface
   interface a {
      cyi get(azv var1);
   }

   static record b(clz.a a) {
   }
}
