import com.google.common.collect.ImmutableMap;

public class ccv extends bzn<crl> {
   public ccv() {
      super(ImmutableMap.of());
   }

   protected boolean a(aru $$0, crl $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aru $$0, crl $$1, long $$2) {
      if (c($$1) || b($$1)) {
         byw<?> $$3 = $$1.ec();
         if (!$$3.c(ctt.g)) {
            $$3.b(cgy.u);
            $$3.b(cgy.n);
            $$3.b(cgy.o);
            $$3.b(cgy.s);
            $$3.b(cgy.r);
         }

         $$3.a(ctt.g);
      }
   }

   protected void c(aru $$0, crl $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bxw $$0) {
      return $$0.ec().a(cgy.B);
   }

   public static boolean c(bxw $$0) {
      return $$0.ec().a(cgy.y);
   }
}
