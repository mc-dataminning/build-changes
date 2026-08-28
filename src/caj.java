import com.google.common.collect.ImmutableMap;

public class caj extends bxb<coj> {
   public caj() {
      super(ImmutableMap.of());
   }

   protected boolean a(ard $$0, coj $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(ard $$0, coj $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bwk<?> $$3 = $$1.eb();
         if (!$$3.c(cqp.g)) {
            $$3.b(cem.t);
            $$3.b(cem.m);
            $$3.b(cem.n);
            $$3.b(cem.r);
            $$3.b(cem.q);
         }

         $$3.a(cqp.g);
      }
   }

   protected void c(ard $$0, coj $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bvi $$0) {
      return $$0.eb().a(cem.A);
   }

   public static boolean c(bvi $$0) {
      return $$0.eb().a(cem.x);
   }
}
