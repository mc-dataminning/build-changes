import com.google.common.collect.ImmutableMap;

public class byd extends buv<cly> {
   public byd() {
      super(ImmutableMap.of());
   }

   protected boolean a(aqm $$0, cly $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aqm $$0, cly $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bue<?> $$3 = $$1.dV();
         if (!$$3.c(coa.g)) {
            $$3.b(ccg.t);
            $$3.b(ccg.m);
            $$3.b(ccg.n);
            $$3.b(ccg.r);
            $$3.b(ccg.q);
         }

         $$3.a(coa.g);
      }
   }

   protected void c(aqm $$0, cly $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(btc $$0) {
      return $$0.dV().a(ccg.A);
   }

   public static boolean c(btc $$0) {
      return $$0.dV().a(ccg.x);
   }
}
