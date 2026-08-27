import javax.annotation.Nullable;

public class cbn {
   @Nullable
   public static esj a(brb $$0, int $$1, int $$2) {
      boolean $$3 = cbo.a($$0, $$1);
      return cbr.a($$0, () -> {
         id $$4 = cbr.a($$0.ei(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static esj a(brb $$0, int $$1, int $$2, esj $$3, double $$4) {
      esj $$5 = $$3.a($$0.dr(), $$0.dt(), $$0.dx());
      boolean $$6 = cbo.a($$0, $$1);
      return cbr.a($$0, () -> {
         id $$6x = cbr.a($$0.ei(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static esj a(brb $$0, int $$1, int $$2, esj $$3) {
      esj $$4 = $$0.dk().d($$3);
      boolean $$5 = cbo.a($$0, $$1);
      return cbr.a($$0, () -> {
         id $$5x = cbr.a($$0.ei(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static id a(brb $$0, int $$1, boolean $$2, id $$3) {
      id $$4 = cbr.a($$0, $$1, $$0.ei(), $$3);
      return !cbo.a($$4, $$0) && !cbo.a($$2, $$0, $$4) && !cbo.a($$0.K(), $$4) && !cbo.b($$0, $$4) ? $$4 : null;
   }
}
