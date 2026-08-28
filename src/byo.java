import com.google.common.collect.ImmutableMap;

public class byo extends bvg<cmi> {
   public byo() {
      super(ImmutableMap.of());
   }

   protected boolean a(are $$0, cmi $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(are $$0, cmi $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bup<?> $$3 = $$1.dS();
         if (!$$3.c(cok.g)) {
            $$3.b(ccr.t);
            $$3.b(ccr.m);
            $$3.b(ccr.n);
            $$3.b(ccr.r);
            $$3.b(ccr.q);
         }

         $$3.a(cok.g);
      }
   }

   protected void c(are $$0, cmi $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(btn $$0) {
      return $$0.dS().a(ccr.A);
   }

   public static boolean c(btn $$0) {
      return $$0.dS().a(ccr.x);
   }
}
