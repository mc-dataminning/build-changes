import javax.annotation.Nullable;

public class cem {
   @Nullable
   public static evt a(bua $$0, int $$1, int $$2) {
      boolean $$3 = cen.a($$0, $$1);
      return ceq.a($$0, () -> {
         iz $$4 = ceq.a($$0.el(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static evt a(bua $$0, int $$1, int $$2, evt $$3, double $$4) {
      evt $$5 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$6 = cen.a($$0, $$1);
      return ceq.a($$0, () -> {
         iz $$6x = ceq.a($$0.el(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static evt a(bua $$0, int $$1, int $$2, evt $$3) {
      evt $$4 = $$0.dn().d($$3);
      boolean $$5 = cen.a($$0, $$1);
      return ceq.a($$0, () -> {
         iz $$5x = ceq.a($$0.el(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static iz a(bua $$0, int $$1, boolean $$2, iz $$3) {
      iz $$4 = ceq.a($$0, $$1, $$0.el(), $$3);
      return !cen.a($$4, $$0) && !cen.a($$2, $$0, $$4) && !cen.a($$0.K(), $$4) && !cen.b($$0, $$4) ? $$4 : null;
   }
}
