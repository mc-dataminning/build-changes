public class clw {
   private static final clw.b a = new clw.b(a(a().a(b(cyl.p), 5).a(b(cyl.h), 5).a(b(cyl.i), 5).a(b(cyl.m), 3).a(a(cyl.a), 82).a()));
   private static final clw.b b = new clw.b(a(a().a(b(cyl.h), 5).a(b(cyl.i), 5).a(b(cyl.a), 5).a(b(cyl.p), 3).a(a(cyl.m), 82).a()));
   private static final clw.b c = new clw.b(a(a().a(b(cyl.i), 5).a(b(cyl.h), 5).a(b(cyl.a), 5).a(b(cyl.m), 3).a(a(cyl.p), 82).a()));

   private static clw.a a(cyl $$0) {
      return a(a().a(b($$0), 499).a(b(cyl.g), 1).a());
   }

   public static cyl a(jf<dkp> $$0, azv $$1) {
      clw.b $$2 = a($$0);
      return $$2.a().get($$1);
   }

   private static clw.b a(jf<dkp> $$0) {
      if ($$0.a(axb.al)) {
         return b;
      } else {
         return $$0.a(axb.ak) ? c : a;
      }
   }

   private static clw.a a(bsq<clw.a> $$0) {
      if ($$0.c()) {
         throw new IllegalArgumentException("List must be non-empty");
      } else {
         return $$1 -> $$0.b($$1).get($$1);
      }
   }

   private static clw.a b(cyl $$0) {
      return $$1 -> $$0;
   }

   private static bsq.a<clw.a> a() {
      return bsq.b();
   }

   @FunctionalInterface
   interface a {
      cyl get(azv var1);
   }

   static record b(clw.a a) {
   }
}
