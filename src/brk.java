import com.google.common.collect.ImmutableMap;

public class brk extends boc<cev> {
   public brk() {
      super(ImmutableMap.of());
   }

   protected boolean a(and $$0, cev $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(and $$0, cev $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bnl<?> $$3 = $$1.dO();
         if (!$$3.c(cgu.g)) {
            $$3.b(bvn.t);
            $$3.b(bvn.m);
            $$3.b(bvn.n);
            $$3.b(bvn.r);
            $$3.b(bvn.q);
         }

         $$3.a(cgu.g);
      }
   }

   protected void c(and $$0, cev $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bml $$0) {
      return $$0.dO().a(bvn.A);
   }

   public static boolean c(bml $$0) {
      return $$0.dO().a(bvn.x);
   }
}
