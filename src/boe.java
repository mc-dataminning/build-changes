import com.google.common.collect.ImmutableMap;

public class boe extends bkx<cbh> {
   public boe() {
      super(ImmutableMap.of());
   }

   protected boolean a(akr $$0, cbh $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(akr $$0, cbh $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bkg<?> $$3 = $$1.dN();
         if (!$$3.c(cdf.g)) {
            $$3.b(bsh.t);
            $$3.b(bsh.m);
            $$3.b(bsh.n);
            $$3.b(bsh.r);
            $$3.b(bsh.q);
         }

         $$3.a(cdf.g);
      }
   }

   protected void c(akr $$0, cbh $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bjg $$0) {
      return $$0.dN().a(bsh.A);
   }

   public static boolean c(bjg $$0) {
      return $$0.dN().a(bsh.x);
   }
}
