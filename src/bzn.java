import com.google.common.collect.ImmutableMap;

public class bzn extends bwf<cnk> {
   public bzn() {
      super(ImmutableMap.of());
   }

   protected boolean a(arj $$0, cnk $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arj $$0, cnk $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bvo<?> $$3 = $$1.dY();
         if (!$$3.c(cpp.g)) {
            $$3.b(cdq.t);
            $$3.b(cdq.m);
            $$3.b(cdq.n);
            $$3.b(cdq.r);
            $$3.b(cdq.q);
         }

         $$3.a(cpp.g);
      }
   }

   protected void c(arj $$0, cnk $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bun $$0) {
      return $$0.dY().a(cdq.A);
   }

   public static boolean c(bun $$0) {
      return $$0.dY().a(cdq.x);
   }
}
