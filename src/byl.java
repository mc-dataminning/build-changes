import com.google.common.collect.ImmutableMap;

public class byl extends bvd<cmf> {
   public byl() {
      super(ImmutableMap.of());
   }

   protected boolean a(arb $$0, cmf $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arb $$0, cmf $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bum<?> $$3 = $$1.dS();
         if (!$$3.c(coh.g)) {
            $$3.b(cco.t);
            $$3.b(cco.m);
            $$3.b(cco.n);
            $$3.b(cco.r);
            $$3.b(cco.q);
         }

         $$3.a(coh.g);
      }
   }

   protected void c(arb $$0, cmf $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(btk $$0) {
      return $$0.dS().a(cco.A);
   }

   public static boolean c(btk $$0) {
      return $$0.dS().a(cco.x);
   }
}
