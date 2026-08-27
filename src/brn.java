import com.google.common.collect.ImmutableMap;

public class brn extends bof<cfd> {
   public brn() {
      super(ImmutableMap.of());
   }

   protected boolean a(ane $$0, cfd $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(ane $$0, cfd $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bno<?> $$3 = $$1.dN();
         if (!$$3.c(chc.g)) {
            $$3.b(bvq.t);
            $$3.b(bvq.m);
            $$3.b(bvq.n);
            $$3.b(bvq.r);
            $$3.b(bvq.q);
         }

         $$3.a(chc.g);
      }
   }

   protected void c(ane $$0, cfd $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bmo $$0) {
      return $$0.dN().a(bvq.A);
   }

   public static boolean c(bmo $$0) {
      return $$0.dN().a(bvq.x);
   }
}
