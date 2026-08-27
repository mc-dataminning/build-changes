import com.google.common.collect.ImmutableMap;

public class bvt extends bsl<cjn> {
   public bvt() {
      super(ImmutableMap.of());
   }

   protected boolean a(apu $$0, cjn $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(apu $$0, cjn $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bru<?> $$3 = $$1.dP();
         if (!$$3.c(clp.g)) {
            $$3.b(bzw.t);
            $$3.b(bzw.m);
            $$3.b(bzw.n);
            $$3.b(bzw.r);
            $$3.b(bzw.q);
         }

         $$3.a(clp.g);
      }
   }

   protected void c(apu $$0, cjn $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bqt $$0) {
      return $$0.dP().a(bzw.A);
   }

   public static boolean c(bqt $$0) {
      return $$0.dP().a(bzw.x);
   }
}
