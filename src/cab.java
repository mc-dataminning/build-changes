import com.google.common.collect.ImmutableMap;

public class cab extends bwt<cny> {
   public cab() {
      super(ImmutableMap.of());
   }

   protected boolean a(arn $$0, cny $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arn $$0, cny $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bwc<?> $$3 = $$1.ed();
         if (!$$3.c(cqe.g)) {
            $$3.b(cee.t);
            $$3.b(cee.m);
            $$3.b(cee.n);
            $$3.b(cee.r);
            $$3.b(cee.q);
         }

         $$3.a(cqe.g);
      }
   }

   protected void c(arn $$0, cny $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bva $$0) {
      return $$0.ed().a(cee.A);
   }

   public static boolean c(bva $$0) {
      return $$0.ed().a(cee.x);
   }
}
