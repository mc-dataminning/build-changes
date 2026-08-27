import com.google.common.collect.ImmutableMap;

public class bte extends bpw<cgu> {
   public bte() {
      super(ImmutableMap.of());
   }

   protected boolean a(aov $$0, cgu $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aov $$0, cgu $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bpf<?> $$3 = $$1.dO();
         if (!$$3.c(ciu.g)) {
            $$3.b(bxh.t);
            $$3.b(bxh.m);
            $$3.b(bxh.n);
            $$3.b(bxh.r);
            $$3.b(bxh.q);
         }

         $$3.a(ciu.g);
      }
   }

   protected void c(aov $$0, cgu $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bog $$0) {
      return $$0.dO().a(bxh.A);
   }

   public static boolean c(bog $$0) {
      return $$0.dO().a(bxh.x);
   }
}
