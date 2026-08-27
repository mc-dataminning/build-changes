import com.google.common.collect.ImmutableMap;

public class bpw extends bmp<ccz> {
   public bpw() {
      super(ImmutableMap.of());
   }

   protected boolean a(ama $$0, ccz $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(ama $$0, ccz $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bly<?> $$3 = $$1.dN();
         if (!$$3.c(cex.g)) {
            $$3.b(btz.t);
            $$3.b(btz.m);
            $$3.b(btz.n);
            $$3.b(btz.r);
            $$3.b(btz.q);
         }

         $$3.a(cex.g);
      }
   }

   protected void c(ama $$0, ccz $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bky $$0) {
      return $$0.dN().a(btz.A);
   }

   public static boolean c(bky $$0) {
      return $$0.dN().a(btz.x);
   }
}
