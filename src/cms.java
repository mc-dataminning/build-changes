public class cms {
   private static final cms.b a = new cms.b(a(a().a(b(czi.p), 5).a(b(czi.h), 5).a(b(czi.i), 5).a(b(czi.m), 3).a(a(czi.a), 82).a()));
   private static final cms.b b = new cms.b(a(a().a(b(czi.h), 5).a(b(czi.i), 5).a(b(czi.a), 5).a(b(czi.p), 3).a(a(czi.m), 82).a()));
   private static final cms.b c = new cms.b(a(a().a(b(czi.i), 5).a(b(czi.h), 5).a(b(czi.a), 5).a(b(czi.m), 3).a(a(czi.p), 82).a()));

   private static cms.a a(czi $$0) {
      return a(a().a(b($$0), 499).a(b(czi.g), 1).a());
   }

   public static czi a(jg<dlm> $$0, bai $$1) {
      cms.b $$2 = a($$0);
      return $$2.a().get($$1);
   }

   private static cms.b a(jg<dlm> $$0) {
      if ($$0.a(axm.al)) {
         return b;
      } else {
         return $$0.a(axm.ak) ? c : a;
      }
   }

   private static cms.a a(btm<cms.a> $$0) {
      if ($$0.c()) {
         throw new IllegalArgumentException("List must be non-empty");
      } else {
         return $$1 -> $$0.b($$1).get($$1);
      }
   }

   private static cms.a b(czi $$0) {
      return $$1 -> $$0;
   }

   private static btm.a<cms.a> a() {
      return btm.b();
   }

   @FunctionalInterface
   interface a {
      czi get(bai var1);
   }

   static record b(cms.a a) {
   }
}
