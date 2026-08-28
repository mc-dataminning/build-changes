import com.google.common.collect.ImmutableMap;

public class cbh extends bxz<cpj> {
   public cbh() {
      super(ImmutableMap.of());
   }

   protected boolean a(ash $$0, cpj $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(ash $$0, cpj $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bxi<?> $$3 = $$1.ec();
         if (!$$3.c(cro.g)) {
            $$3.b(cfk.t);
            $$3.b(cfk.m);
            $$3.b(cfk.n);
            $$3.b(cfk.r);
            $$3.b(cfk.q);
         }

         $$3.a(cro.g);
      }
   }

   protected void c(ash $$0, cpj $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bwg $$0) {
      return $$0.ec().a(cfk.A);
   }

   public static boolean c(bwg $$0) {
      return $$0.ec().a(cfk.x);
   }
}
