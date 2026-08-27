import com.google.common.collect.ImmutableMap;

public class bxo extends bug<cll> {
   public bxo() {
      super(ImmutableMap.of());
   }

   protected boolean a(aqt $$0, cll $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aqt $$0, cll $$1, long $$2) {
      if (c($$1) || b($$1)) {
         btp<?> $$3 = $$1.dZ();
         if (!$$3.c(cnq.g)) {
            $$3.b(cbr.t);
            $$3.b(cbr.m);
            $$3.b(cbr.n);
            $$3.b(cbr.r);
            $$3.b(cbr.q);
         }

         $$3.a(cnq.g);
      }
   }

   protected void c(aqt $$0, cll $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bso $$0) {
      return $$0.dZ().a(cbr.A);
   }

   public static boolean c(bso $$0) {
      return $$0.dZ().a(cbr.x);
   }
}
