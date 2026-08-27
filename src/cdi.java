import javax.annotation.Nullable;

public class cdi {
   @Nullable
   public static ewu a(bsw $$0, int $$1, int $$2) {
      boolean $$3 = cdj.a($$0, $$1);
      return cdm.a($$0, () -> {
         ir $$4 = cdm.a($$0.et(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ewu a(bsw $$0, int $$1, int $$2, ewu $$3, double $$4) {
      ewu $$5 = $$3.a($$0.dz(), $$0.dB(), $$0.dF());
      boolean $$6 = cdj.a($$0, $$1);
      return cdm.a($$0, () -> {
         ir $$6x = cdm.a($$0.et(), $$1, $$2, 0, $$5.c, $$5.e, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ewu a(bsw $$0, int $$1, int $$2, ewu $$3) {
      ewu $$4 = $$0.ds().d($$3);
      boolean $$5 = cdj.a($$0, $$1);
      return cdm.a($$0, () -> {
         ir $$5x = cdm.a($$0.et(), $$1, $$2, 0, $$4.c, $$4.e, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ir a(bsw $$0, int $$1, boolean $$2, ir $$3) {
      ir $$4 = cdm.a($$0, $$1, $$0.et(), $$3);
      return !cdj.a($$4, $$0) && !cdj.a($$2, $$0, $$4) && !cdj.a($$0.J(), $$4) && !cdj.b($$0, $$4) ? $$4 : null;
   }
}
