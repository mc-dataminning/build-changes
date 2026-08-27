import com.google.common.collect.ImmutableMap;

public class bvo extends bsg<cjg> {
   public bvo() {
      super(ImmutableMap.of());
   }

   protected boolean a(aps $$0, cjg $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aps $$0, cjg $$1, long $$2) {
      if (c($$1) || b($$1)) {
         brp<?> $$3 = $$1.dP();
         if (!$$3.c(cli.g)) {
            $$3.b(bzr.t);
            $$3.b(bzr.m);
            $$3.b(bzr.n);
            $$3.b(bzr.r);
            $$3.b(bzr.q);
         }

         $$3.a(cli.g);
      }
   }

   protected void c(aps $$0, cjg $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bqo $$0) {
      return $$0.dP().a(bzr.A);
   }

   public static boolean c(bqo $$0) {
      return $$0.dP().a(bzr.x);
   }
}
