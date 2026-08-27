import com.google.common.collect.ImmutableMap;

public class bxp extends buh<clj> {
   public bxp() {
      super(ImmutableMap.of());
   }

   protected boolean a(aqm $$0, clj $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aqm $$0, clj $$1, long $$2) {
      if (c($$1) || b($$1)) {
         btq<?> $$3 = $$1.dS();
         if (!$$3.c(cnl.g)) {
            $$3.b(cbs.t);
            $$3.b(cbs.m);
            $$3.b(cbs.n);
            $$3.b(cbs.r);
            $$3.b(cbs.q);
         }

         $$3.a(cnl.g);
      }
   }

   protected void c(aqm $$0, clj $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bso $$0) {
      return $$0.dS().a(cbs.A);
   }

   public static boolean c(bso $$0) {
      return $$0.dS().a(cbs.x);
   }
}
