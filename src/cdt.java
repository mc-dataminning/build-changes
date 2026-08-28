import javax.annotation.Nullable;

public class cdt {
   @Nullable
   public static evz a(bth $$0, int $$1, int $$2) {
      boolean $$3 = cdu.a($$0, $$1);
      return cdx.a($$0, () -> {
         ja $$4 = cdx.a($$0.dS(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static evz a(bth $$0, int $$1, int $$2, evz $$3, double $$4) {
      evz $$5 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$6 = cdu.a($$0, $$1);
      return cdx.a($$0, () -> {
         ja $$6x = cdx.a($$0.dS(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static evz a(bth $$0, int $$1, int $$2, evz $$3) {
      evz $$4 = $$0.dn().d($$3);
      boolean $$5 = cdu.a($$0, $$1);
      return cdx.a($$0, () -> {
         ja $$5x = cdx.a($$0.dS(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ja a(bth $$0, int $$1, boolean $$2, ja $$3) {
      ja $$4 = cdx.a($$0, $$1, $$0.dS(), $$3);
      return !cdu.a($$4, $$0) && !cdu.a($$2, $$0, $$4) && !cdu.a($$0.K(), $$4) && !cdu.b($$0, $$4) ? $$4 : null;
   }
}
