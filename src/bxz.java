import com.google.common.collect.ImmutableMap;

public class bxz extends bur<clu> {
   public bxz() {
      super(ImmutableMap.of());
   }

   protected boolean a(aqk $$0, clu $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(aqk $$0, clu $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bua<?> $$3 = $$1.dT();
         if (!$$3.c(cnw.g)) {
            $$3.b(ccc.t);
            $$3.b(ccc.m);
            $$3.b(ccc.n);
            $$3.b(ccc.r);
            $$3.b(ccc.q);
         }

         $$3.a(cnw.g);
      }
   }

   protected void c(aqk $$0, clu $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bsy $$0) {
      return $$0.dT().a(ccc.A);
   }

   public static boolean c(bsy $$0) {
      return $$0.dT().a(ccc.x);
   }
}
