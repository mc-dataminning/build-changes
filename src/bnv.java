import com.google.common.collect.ImmutableMap;

public class bnv extends bko<cay> {
   public bnv() {
      super(ImmutableMap.of());
   }

   protected boolean a(aki $$0, cay $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aki $$0, cay $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bjx<?> $$3 = $$1.dM();
         if (!$$3.c(ccw.g)) {
            $$3.b(bry.t);
            $$3.b(bry.m);
            $$3.b(bry.n);
            $$3.b(bry.r);
            $$3.b(bry.q);
         }

         $$3.a(ccw.g);
      }
   }

   protected void c(aki $$0, cay $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(biw $$0) {
      return $$0.dM().a(bry.A);
   }

   public static boolean c(biw $$0) {
      return $$0.dM().a(bry.x);
   }
}
