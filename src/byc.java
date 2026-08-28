import com.google.common.collect.ImmutableMap;

public class byc extends buu<clx> {
   public byc() {
      super(ImmutableMap.of());
   }

   protected boolean a(aqm $$0, clx $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aqm $$0, clx $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bud<?> $$3 = $$1.dU();
         if (!$$3.c(cnz.g)) {
            $$3.b(ccf.t);
            $$3.b(ccf.m);
            $$3.b(ccf.n);
            $$3.b(ccf.r);
            $$3.b(ccf.q);
         }

         $$3.a(cnz.g);
      }
   }

   protected void c(aqm $$0, clx $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(btb $$0) {
      return $$0.dU().a(ccf.A);
   }

   public static boolean c(btb $$0) {
      return $$0.dU().a(ccf.x);
   }
}
