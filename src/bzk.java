import com.google.common.collect.ImmutableMap;

public class bzk extends bwc<cnh> {
   public bzk() {
      super(ImmutableMap.of());
   }

   protected boolean a(arh $$0, cnh $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arh $$0, cnh $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bvl<?> $$3 = $$1.dX();
         if (!$$3.c(cpm.g)) {
            $$3.b(cdn.t);
            $$3.b(cdn.m);
            $$3.b(cdn.n);
            $$3.b(cdn.r);
            $$3.b(cdn.q);
         }

         $$3.a(cpm.g);
      }
   }

   protected void c(arh $$0, cnh $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(buk $$0) {
      return $$0.dX().a(cdn.A);
   }

   public static boolean c(buk $$0) {
      return $$0.dX().a(cdn.x);
   }
}
