import com.google.common.collect.ImmutableMap;

public class bok extends bld<cbn> {
   public bok() {
      super(ImmutableMap.of());
   }

   protected boolean a(akt $$0, cbn $$1, long $$2) {
      return c($$1) || b($$1);
   }

   protected void b(akt $$0, cbn $$1, long $$2) {
      if (c($$1) || b($$1)) {
         bkm<?> $$3 = $$1.dN();
         if (!$$3.c(cdl.g)) {
            $$3.b(bsn.t);
            $$3.b(bsn.m);
            $$3.b(bsn.n);
            $$3.b(bsn.r);
            $$3.b(bsn.q);
         }

         $$3.a(cdl.g);
      }
   }

   protected void c(akt $$0, cbn $$1, long $$2) {
      if ($$2 % 100L == 0L) {
         $$1.a($$0, $$2, 3);
      }
   }

   public static boolean b(bjm $$0) {
      return $$0.dN().a(bsn.A);
   }

   public static boolean c(bjm $$0) {
      return $$0.dN().a(bsn.x);
   }
}
