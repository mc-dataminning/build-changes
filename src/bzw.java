import com.google.common.collect.ImmutableMap;

public class bzw extends bwo<cnt> {
   public bzw() {
      super(ImmutableMap.of());
   }

   protected boolean a(arm $$0, cnt $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arm $$0, cnt $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bvx<?> $$3 = $$1.ed();
         if (!$$3.c(cpz.g)) {
            $$3.b(cdz.t);
            $$3.b(cdz.m);
            $$3.b(cdz.n);
            $$3.b(cdz.r);
            $$3.b(cdz.q);
         }

         $$3.a(cpz.g);
      }
   }

   protected void c(arm $$0, cnt $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(buv $$0) {
      return $$0.ed().a(cdz.A);
   }

   public static boolean c(buv $$0) {
      return $$0.ed().a(cdz.x);
   }
}
