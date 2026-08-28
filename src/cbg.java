import com.google.common.collect.ImmutableMap;

public class cbg extends bxy<cpi> {
   public cbg() {
      super(ImmutableMap.of());
   }

   protected boolean a(ash $$0, cpi $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(ash $$0, cpi $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bxh<?> $$3 = $$1.ec();
         if (!$$3.c(crn.g)) {
            $$3.b(cfj.t);
            $$3.b(cfj.m);
            $$3.b(cfj.n);
            $$3.b(cfj.r);
            $$3.b(cfj.q);
         }

         $$3.a(crn.g);
      }
   }

   protected void c(ash $$0, cpi $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bwf $$0) {
      return $$0.ec().a(cfj.A);
   }

   public static boolean c(bwf $$0) {
      return $$0.ec().a(cfj.x);
   }
}
