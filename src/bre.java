import com.google.common.collect.ImmutableMap;

public class bre extends bnw<ceo> {
   public bre() {
      super(ImmutableMap.of());
   }

   protected boolean a(amz $$0, ceo $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(amz $$0, ceo $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bnf<?> $$3 = $$1.dO();
         if (!$$3.c(cgn.g)) {
            $$3.b(bvh.t);
            $$3.b(bvh.m);
            $$3.b(bvh.n);
            $$3.b(bvh.r);
            $$3.b(bvh.q);
         }

         $$3.a(cgn.g);
      }
   }

   protected void c(amz $$0, ceo $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bmf $$0) {
      return $$0.dO().a(bvh.A);
   }

   public static boolean c(bmf $$0) {
      return $$0.dO().a(bvh.x);
   }
}
