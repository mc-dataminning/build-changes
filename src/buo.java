import com.google.common.collect.ImmutableMap;

public class buo extends brg<cif> {
   public buo() {
      super(ImmutableMap.of());
   }

   protected boolean a(apf $$0, cif $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(apf $$0, cif $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bqp<?> $$3 = $$1.dP();
         if (!$$3.c(ckh.g)) {
            $$3.b(byr.t);
            $$3.b(byr.m);
            $$3.b(byr.n);
            $$3.b(byr.r);
            $$3.b(byr.q);
         }

         $$3.a(ckh.g);
      }
   }

   protected void c(apf $$0, cif $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bpo $$0) {
      return $$0.dP().a(byr.A);
   }

   public static boolean c(bpo $$0) {
      return $$0.dP().a(byr.x);
   }
}
