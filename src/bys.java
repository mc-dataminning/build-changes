import com.google.common.collect.ImmutableMap;

public class bys extends bvk<cmm> {
   public bys() {
      super(ImmutableMap.of());
   }

   protected boolean a(arf $$0, cmm $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arf $$0, cmm $$1, long $$2) {
      if (c($$1) || b($$1)) {
         but<?> $$3 = $$1.dS();
         if (!$$3.c(cop.g)) {
            $$3.b(ccv.t);
            $$3.b(ccv.m);
            $$3.b(ccv.n);
            $$3.b(ccv.r);
            $$3.b(ccv.q);
         }

         $$3.a(cop.g);
      }
   }

   protected void c(arf $$0, cmm $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(btr $$0) {
      return $$0.dS().a(ccv.A);
   }

   public static boolean c(btr $$0) {
      return $$0.dS().a(ccv.x);
   }
}
