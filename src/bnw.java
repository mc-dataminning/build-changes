import com.google.common.collect.ImmutableMap;

public class bnw extends bkp<caz> {
   public bnw() {
      super(ImmutableMap.of());
   }

   protected boolean a(akk $$0, caz $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(akk $$0, caz $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bjy<?> $$3 = $$1.dM();
         if (!$$3.c(ccx.g)) {
            $$3.b(brz.t);
            $$3.b(brz.m);
            $$3.b(brz.n);
            $$3.b(brz.r);
            $$3.b(brz.q);
         }

         $$3.a(ccx.g);
      }
   }

   protected void c(akk $$0, caz $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(biy $$0) {
      return $$0.dM().a(brz.A);
   }

   public static boolean c(biy $$0) {
      return $$0.dM().a(brz.x);
   }
}
