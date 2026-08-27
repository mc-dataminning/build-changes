import com.google.common.collect.ImmutableMap;

public class bqj extends bnc<cdm> {
   public bqj() {
      super(ImmutableMap.of());
   }

   protected boolean a(ami $$0, cdm $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(ami $$0, cdm $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bml<?> $$3 = $$1.dP();
         if (!$$3.c(cfk.g)) {
            $$3.b(bum.t);
            $$3.b(bum.m);
            $$3.b(bum.n);
            $$3.b(bum.r);
            $$3.b(bum.q);
         }

         $$3.a(cfk.g);
      }
   }

   protected void c(ami $$0, cdm $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bll $$0) {
      return $$0.dP().a(bum.A);
   }

   public static boolean c(bll $$0) {
      return $$0.dP().a(bum.x);
   }
}
