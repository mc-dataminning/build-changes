import com.google.common.collect.ImmutableMap;

public class bzf extends bvx<cnc> {
   public bzf() {
      super(ImmutableMap.of());
   }

   protected boolean a(arg $$0, cnc $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arg $$0, cnc $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bvg<?> $$3 = $$1.dX();
         if (!$$3.c(cpg.g)) {
            $$3.b(cdi.t);
            $$3.b(cdi.m);
            $$3.b(cdi.n);
            $$3.b(cdi.r);
            $$3.b(cdi.q);
         }

         $$3.a(cpg.g);
      }
   }

   protected void c(arg $$0, cnc $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(buf $$0) {
      return $$0.dX().a(cdi.A);
   }

   public static boolean c(buf $$0) {
      return $$0.dX().a(cdi.x);
   }
}
