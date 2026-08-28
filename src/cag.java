import com.google.common.collect.ImmutableMap;

public class cag extends bwy<cog> {
   public cag() {
      super(ImmutableMap.of());
   }

   protected boolean a(arc $$0, cog $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arc $$0, cog $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bwh<?> $$3 = $$1.ec();
         if (!$$3.c(cqm.g)) {
            $$3.b(cej.t);
            $$3.b(cej.m);
            $$3.b(cej.n);
            $$3.b(cej.r);
            $$3.b(cej.q);
         }

         $$3.a(cqm.g);
      }
   }

   protected void c(arc $$0, cog $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bvf $$0) {
      return $$0.ec().a(cej.A);
   }

   public static boolean c(bvf $$0) {
      return $$0.ec().a(cej.x);
   }
}
