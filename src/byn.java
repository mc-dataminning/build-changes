import com.google.common.collect.ImmutableMap;

public class byn extends bvf<cmi> {
   public byn() {
      super(ImmutableMap.of());
   }

   protected boolean a(aqt $$0, cmi $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aqt $$0, cmi $$1, long $$2) {
      if (c($$1) || b($$1)) {
         buo<?> $$3 = $$1.dU();
         if (!$$3.c(cok.g)) {
            $$3.b(ccq.t);
            $$3.b(ccq.m);
            $$3.b(ccq.n);
            $$3.b(ccq.r);
            $$3.b(ccq.q);
         }

         $$3.a(cok.g);
      }
   }

   protected void c(aqt $$0, cmi $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(btl $$0) {
      return $$0.dU().a(ccq.A);
   }

   public static boolean c(btl $$0) {
      return $$0.dU().a(ccq.x);
   }
}
