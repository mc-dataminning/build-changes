import com.google.common.collect.ImmutableMap;

public class byr extends bvj<cml> {
   public byr() {
      super(ImmutableMap.of());
   }

   protected boolean a(arf $$0, cml $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arf $$0, cml $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bus<?> $$3 = $$1.dS();
         if (!$$3.c(coo.g)) {
            $$3.b(ccu.t);
            $$3.b(ccu.m);
            $$3.b(ccu.n);
            $$3.b(ccu.r);
            $$3.b(ccu.q);
         }

         $$3.a(coo.g);
      }
   }

   protected void c(arf $$0, cml $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(btq $$0) {
      return $$0.dS().a(ccu.A);
   }

   public static boolean c(btq $$0) {
      return $$0.dS().a(ccu.x);
   }
}
