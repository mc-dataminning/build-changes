import com.google.common.collect.ImmutableMap;

public class cay extends bxq<cpa> {
   public cay() {
      super(ImmutableMap.of());
   }

   protected boolean a(arx $$0, cpa $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arx $$0, cpa $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bwz<?> $$3 = $$1.ec();
         if (!$$3.c(crf.g)) {
            $$3.b(cfb.t);
            $$3.b(cfb.m);
            $$3.b(cfb.n);
            $$3.b(cfb.r);
            $$3.b(cfb.q);
         }

         $$3.a(crf.g);
      }
   }

   protected void c(arx $$0, cpa $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bvx $$0) {
      return $$0.ec().a(cfb.A);
   }

   public static boolean c(bvx $$0) {
      return $$0.ec().a(cfb.x);
   }
}
