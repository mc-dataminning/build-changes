import com.google.common.collect.ImmutableMap;

public class bqe extends bmx<cdh> {
   public bqe() {
      super(ImmutableMap.of());
   }

   protected boolean a(ame $$0, cdh $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(ame $$0, cdh $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bmg<?> $$3 = $$1.dP();
         if (!$$3.c(cff.g)) {
            $$3.b(buh.t);
            $$3.b(buh.m);
            $$3.b(buh.n);
            $$3.b(buh.r);
            $$3.b(buh.q);
         }

         $$3.a(cff.g);
      }
   }

   protected void c(ame $$0, cdh $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(blg $$0) {
      return $$0.dP().a(buh.A);
   }

   public static boolean c(blg $$0) {
      return $$0.dP().a(buh.x);
   }
}
