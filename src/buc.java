import javax.annotation.Nullable;

public class buc {
   @Nullable
   public static ehh a(bjv $$0, int $$1, int $$2) {
      boolean $$3 = bud.a($$0, $$1);
      return bug.a($$0, () -> {
         gw $$4 = bug.a($$0.ef(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ehh a(bjv $$0, int $$1, int $$2, ehh $$3, double $$4) {
      ehh $$5 = $$3.a($$0.dq(), $$0.ds(), $$0.dw());
      boolean $$6 = bud.a($$0, $$1);
      return bug.a($$0, () -> {
         gw $$6x = bug.a($$0.ef(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ehh a(bjv $$0, int $$1, int $$2, ehh $$3) {
      ehh $$4 = $$0.dj().d($$3);
      boolean $$5 = bud.a($$0, $$1);
      return bug.a($$0, () -> {
         gw $$5x = bug.a($$0.ef(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static gw a(bjv $$0, int $$1, boolean $$2, gw $$3) {
      gw $$4 = bug.a($$0, $$1, $$0.ef(), $$3);
      return !bud.a($$4, $$0) && !bud.a($$2, $$0, $$4) && !bud.a($$0.L(), $$4) && !bud.b($$0, $$4) ? $$4 : null;
   }
}
