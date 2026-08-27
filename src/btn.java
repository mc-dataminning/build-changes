import javax.annotation.Nullable;

public class btn {
   @Nullable
   public static ehf a(bjf $$0, int $$1, int $$2) {
      boolean $$3 = bto.a($$0, $$1);
      return btr.a($$0, () -> {
         gv $$4 = btr.a($$0.ee(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ehf a(bjf $$0, int $$1, int $$2, ehf $$3, double $$4) {
      ehf $$5 = $$3.a($$0.dp(), $$0.dr(), $$0.dv());
      boolean $$6 = bto.a($$0, $$1);
      return btr.a($$0, () -> {
         gv $$6x = btr.a($$0.ee(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ehf a(bjf $$0, int $$1, int $$2, ehf $$3) {
      ehf $$4 = $$0.di().d($$3);
      boolean $$5 = bto.a($$0, $$1);
      return btr.a($$0, () -> {
         gv $$5x = btr.a($$0.ee(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static gv a(bjf $$0, int $$1, boolean $$2, gv $$3) {
      gv $$4 = btr.a($$0, $$1, $$0.ee(), $$3);
      return !bto.a($$4, $$0) && !bto.a($$2, $$0, $$4) && !bto.a($$0.H(), $$4) && !bto.b($$0, $$4) ? $$4 : null;
   }
}
