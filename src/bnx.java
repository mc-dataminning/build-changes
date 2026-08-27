import com.google.common.collect.ImmutableMap;

public class bnx extends bkq<cba> {
   public bnx() {
      super(ImmutableMap.of());
   }

   protected boolean a(akk $$0, cba $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(akk $$0, cba $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bjz<?> $$3 = $$1.dM();
         if (!$$3.c(ccy.g)) {
            $$3.b(bsa.t);
            $$3.b(bsa.m);
            $$3.b(bsa.n);
            $$3.b(bsa.r);
            $$3.b(bsa.q);
         }

         $$3.a(ccy.g);
      }
   }

   protected void c(akk $$0, cba $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(biy $$0) {
      return $$0.dM().a(bsa.A);
   }

   public static boolean c(biy $$0) {
      return $$0.dM().a(bsa.x);
   }
}
