import com.google.common.collect.ImmutableMap;

public class byp extends bvh<cmk> {
   public byp() {
      super(ImmutableMap.of());
   }

   protected boolean a(aqu $$0, cmk $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aqu $$0, cmk $$1, long $$2) {
      if (c($$1) || b($$1)) {
         buq<?> $$3 = $$1.dT();
         if (!$$3.c(com.g)) {
            $$3.b(ccs.t);
            $$3.b(ccs.m);
            $$3.b(ccs.n);
            $$3.b(ccs.r);
            $$3.b(ccs.q);
         }

         $$3.a(com.g);
      }
   }

   protected void c(aqu $$0, cmk $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(btn $$0) {
      return $$0.dT().a(ccs.A);
   }

   public static boolean c(btn $$0) {
      return $$0.dT().a(ccs.x);
   }
}
