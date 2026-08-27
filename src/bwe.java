import com.google.common.collect.ImmutableMap;

public class bwe extends bsw<cjy> {
   public bwe() {
      super(ImmutableMap.of());
   }

   protected boolean a(aqe $$0, cjy $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aqe $$0, cjy $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bsf<?> $$3 = $$1.dQ();
         if (!$$3.c(cma.g)) {
            $$3.b(cah.t);
            $$3.b(cah.m);
            $$3.b(cah.n);
            $$3.b(cah.r);
            $$3.b(cah.q);
         }

         $$3.a(cma.g);
      }
   }

   protected void c(aqe $$0, cjy $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bre $$0) {
      return $$0.dQ().a(cah.A);
   }

   public static boolean c(bre $$0) {
      return $$0.dQ().a(cah.x);
   }
}
