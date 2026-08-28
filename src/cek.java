import javax.annotation.Nullable;

public class cek {
   @Nullable
   public static evr a(bty $$0, int $$1, int $$2) {
      boolean $$3 = cel.a($$0, $$1);
      return ceo.a($$0, () -> {
         iz $$4 = ceo.a($$0.el(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static evr a(bty $$0, int $$1, int $$2, evr $$3, double $$4) {
      evr $$5 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$6 = cel.a($$0, $$1);
      return ceo.a($$0, () -> {
         iz $$6x = ceo.a($$0.el(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static evr a(bty $$0, int $$1, int $$2, evr $$3) {
      evr $$4 = $$0.dn().d($$3);
      boolean $$5 = cel.a($$0, $$1);
      return ceo.a($$0, () -> {
         iz $$5x = ceo.a($$0.el(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static iz a(bty $$0, int $$1, boolean $$2, iz $$3) {
      iz $$4 = ceo.a($$0, $$1, $$0.el(), $$3);
      return !cel.a($$4, $$0) && !cel.a($$2, $$0, $$4) && !cel.a($$0.K(), $$4) && !cel.b($$0, $$4) ? $$4 : null;
   }
}
