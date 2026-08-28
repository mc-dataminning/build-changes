import javax.annotation.Nullable;

public class cei {
   @Nullable
   public static evp a(btw $$0, int $$1, int $$2) {
      boolean $$3 = cej.a($$0, $$1);
      return cem.a($$0, () -> {
         iz $$4 = cem.a($$0.el(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static evp a(btw $$0, int $$1, int $$2, evp $$3, double $$4) {
      evp $$5 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$6 = cej.a($$0, $$1);
      return cem.a($$0, () -> {
         iz $$6x = cem.a($$0.el(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static evp a(btw $$0, int $$1, int $$2, evp $$3) {
      evp $$4 = $$0.dn().d($$3);
      boolean $$5 = cej.a($$0, $$1);
      return cem.a($$0, () -> {
         iz $$5x = cem.a($$0.el(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static iz a(btw $$0, int $$1, boolean $$2, iz $$3) {
      iz $$4 = cem.a($$0, $$1, $$0.el(), $$3);
      return !cej.a($$4, $$0) && !cej.a($$2, $$0, $$4) && !cej.a($$0.K(), $$4) && !cej.b($$0, $$4) ? $$4 : null;
   }
}
