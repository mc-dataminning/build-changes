import javax.annotation.Nullable;

public class cel {
   @Nullable
   public static evs a(btz $$0, int $$1, int $$2) {
      boolean $$3 = cem.a($$0, $$1);
      return cep.a($$0, () -> {
         iz $$4 = cep.a($$0.el(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static evs a(btz $$0, int $$1, int $$2, evs $$3, double $$4) {
      evs $$5 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$6 = cem.a($$0, $$1);
      return cep.a($$0, () -> {
         iz $$6x = cep.a($$0.el(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static evs a(btz $$0, int $$1, int $$2, evs $$3) {
      evs $$4 = $$0.dn().d($$3);
      boolean $$5 = cem.a($$0, $$1);
      return cep.a($$0, () -> {
         iz $$5x = cep.a($$0.el(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static iz a(btz $$0, int $$1, boolean $$2, iz $$3) {
      iz $$4 = cep.a($$0, $$1, $$0.el(), $$3);
      return !cem.a($$4, $$0) && !cem.a($$2, $$0, $$4) && !cem.a($$0.K(), $$4) && !cem.b($$0, $$4) ? $$4 : null;
   }
}
