import com.google.common.collect.ImmutableMap;

public class bqu extends bnm<cee> {
   public bqu() {
      super(ImmutableMap.of());
   }

   protected boolean a(amp $$0, cee $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(amp $$0, cee $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bmv<?> $$3 = $$1.dO();
         if (!$$3.c(cgd.g)) {
            $$3.b(bux.t);
            $$3.b(bux.m);
            $$3.b(bux.n);
            $$3.b(bux.r);
            $$3.b(bux.q);
         }

         $$3.a(cgd.g);
      }
   }

   protected void c(amp $$0, cee $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(blv $$0) {
      return $$0.dO().a(bux.A);
   }

   public static boolean c(blv $$0) {
      return $$0.dO().a(bux.x);
   }
}
