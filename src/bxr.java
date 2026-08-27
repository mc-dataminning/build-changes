import com.google.common.collect.ImmutableMap;

public class bxr extends buj<cll> {
   public bxr() {
      super(ImmutableMap.of());
   }

   protected boolean a(aqn $$0, cll $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aqn $$0, cll $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bts<?> $$3 = $$1.dS();
         if (!$$3.c(cnn.g)) {
            $$3.b(cbu.t);
            $$3.b(cbu.m);
            $$3.b(cbu.n);
            $$3.b(cbu.r);
            $$3.b(cbu.q);
         }

         $$3.a(cnn.g);
      }
   }

   protected void c(aqn $$0, cll $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bsq $$0) {
      return $$0.dS().a(cbu.A);
   }

   public static boolean c(bsq $$0) {
      return $$0.dS().a(cbu.x);
   }
}
