import com.google.common.collect.ImmutableMap;

public class byq extends bvi<cmk> {
   public byq() {
      super(ImmutableMap.of());
   }

   protected boolean a(arf $$0, cmk $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arf $$0, cmk $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bur<?> $$3 = $$1.dS();
         if (!$$3.c(com.g)) {
            $$3.b(cct.t);
            $$3.b(cct.m);
            $$3.b(cct.n);
            $$3.b(cct.r);
            $$3.b(cct.q);
         }

         $$3.a(com.g);
      }
   }

   protected void c(arf $$0, cmk $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(btp $$0) {
      return $$0.dS().a(cct.A);
   }

   public static boolean c(btp $$0) {
      return $$0.dS().a(cct.x);
   }
}
