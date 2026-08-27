import javax.annotation.Nullable;

public class cdl {
   @Nullable
   public static eum a(bsz $$0, int $$1, int $$2) {
      boolean $$3 = cdm.a($$0, $$1);
      return cdp.a($$0, () -> {
         io $$4 = cdp.a($$0.el(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static eum a(bsz $$0, int $$1, int $$2, eum $$3, double $$4) {
      eum $$5 = $$3.a($$0.du(), $$0.dw(), $$0.dA());
      boolean $$6 = cdm.a($$0, $$1);
      return cdp.a($$0, () -> {
         io $$6x = cdp.a($$0.el(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static eum a(bsz $$0, int $$1, int $$2, eum $$3) {
      eum $$4 = $$0.dn().d($$3);
      boolean $$5 = cdm.a($$0, $$1);
      return cdp.a($$0, () -> {
         io $$5x = cdp.a($$0.el(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static io a(bsz $$0, int $$1, boolean $$2, io $$3) {
      io $$4 = cdp.a($$0, $$1, $$0.el(), $$3);
      return !cdm.a($$4, $$0) && !cdm.a($$2, $$0, $$4) && !cdm.a($$0.K(), $$4) && !cdm.b($$0, $$4) ? $$4 : null;
   }
}
