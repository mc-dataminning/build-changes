import com.google.common.collect.ImmutableMap;

public class caz extends bxr<cpd> {
   public caz() {
      super(ImmutableMap.of());
   }

   protected boolean a(ard $$0, cpd $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(ard $$0, cpd $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bxa<?> $$3 = $$1.ea();
         if (!$$3.c(cri.g)) {
            $$3.b(cfc.t);
            $$3.b(cfc.m);
            $$3.b(cfc.n);
            $$3.b(cfc.r);
            $$3.b(cfc.q);
         }

         $$3.a(cri.g);
      }
   }

   protected void c(ard $$0, cpd $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bvy $$0) {
      return $$0.ea().a(cfc.A);
   }

   public static boolean c(bvy $$0) {
      return $$0.ea().a(cfc.x);
   }
}
