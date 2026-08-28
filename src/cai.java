import com.google.common.collect.ImmutableMap;

public class cai extends bxa<cof> {
   public cai() {
      super(ImmutableMap.of());
   }

   protected boolean a(arp $$0, cof $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(arp $$0, cof $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bwj<?> $$3 = $$1.eb();
         if (!$$3.c(cql.g)) {
            $$3.b(cel.t);
            $$3.b(cel.m);
            $$3.b(cel.n);
            $$3.b(cel.r);
            $$3.b(cel.q);
         }

         $$3.a(cql.g);
      }
   }

   protected void c(arp $$0, cof $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bvh $$0) {
      return $$0.eb().a(cel.A);
   }

   public static boolean c(bvh $$0) {
      return $$0.eb().a(cel.x);
   }
}
