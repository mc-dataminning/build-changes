public class cmj {
   private static final cmj.b a = new cmj.b(a(a().a(b(cyy.p), 5).a(b(cyy.h), 5).a(b(cyy.i), 5).a(b(cyy.m), 3).a(a(cyy.a), 82).a()));
   private static final cmj.b b = new cmj.b(a(a().a(b(cyy.h), 5).a(b(cyy.i), 5).a(b(cyy.a), 5).a(b(cyy.p), 3).a(a(cyy.m), 82).a()));
   private static final cmj.b c = new cmj.b(a(a().a(b(cyy.i), 5).a(b(cyy.h), 5).a(b(cyy.a), 5).a(b(cyy.m), 3).a(a(cyy.p), 82).a()));

   private static cmj.a a(cyy $$0) {
      return a(a().a(b($$0), 499).a(b(cyy.g), 1).a());
   }

   public static cyy a(jg<dlc> $$0, azz $$1) {
      cmj.b $$2 = a($$0);
      return $$2.a().get($$1);
   }

   private static cmj.b a(jg<dlc> $$0) {
      if ($$0.a(axf.al)) {
         return b;
      } else {
         return $$0.a(axf.ak) ? c : a;
      }
   }

   private static cmj.a a(btd<cmj.a> $$0) {
      if ($$0.c()) {
         throw new IllegalArgumentException("List must be non-empty");
      } else {
         return $$1 -> $$0.b($$1).get($$1);
      }
   }

   private static cmj.a b(cyy $$0) {
      return $$1 -> $$0;
   }

   private static btd.a<cmj.a> a() {
      return btd.b();
   }

   @FunctionalInterface
   interface a {
      cyy get(azz var1);
   }

   static record b(cmj.a a) {
   }
}
