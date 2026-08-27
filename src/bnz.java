import com.google.common.collect.ImmutableMap;

public class bnz extends bks<cbc> {
   public bnz() {
      super(ImmutableMap.of());
   }

   protected boolean a(akn $$0, cbc $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(akn $$0, cbc $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bkb<?> $$3 = $$1.dM();
         if (!$$3.c(cda.g)) {
            $$3.b(bsc.t);
            $$3.b(bsc.m);
            $$3.b(bsc.n);
            $$3.b(bsc.r);
            $$3.b(bsc.q);
         }

         $$3.a(cda.g);
      }
   }

   protected void c(akn $$0, cbc $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bjb $$0) {
      return $$0.dM().a(bsc.A);
   }

   public static boolean c(bjb $$0) {
      return $$0.dM().a(bsc.x);
   }
}
