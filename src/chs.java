import javax.annotation.Nullable;

public class chs {
   @Nullable
   public static fdw a(bxh $$0, int $$1, int $$2) {
      boolean $$3 = cht.a($$0, $$1);
      return chw.a($$0, () -> {
         iu $$4 = chw.a($$0.dY(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static fdw a(bxh $$0, int $$1, int $$2, fdw $$3, double $$4) {
      fdw $$5 = $$3.a($$0.dA(), $$0.dC(), $$0.dG());
      boolean $$6 = cht.a($$0, $$1);
      return chw.a($$0, () -> {
         iu $$6x = chw.a($$0.dY(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static fdw a(bxh $$0, int $$1, int $$2, fdw $$3) {
      fdw $$4 = $$0.dt().d($$3);
      boolean $$5 = cht.a($$0, $$1);
      return chw.a($$0, () -> {
         iu $$5x = chw.a($$0.dY(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static iu a(bxh $$0, int $$1, boolean $$2, iu $$3) {
      iu $$4 = chw.a($$0, $$1, $$0.dY(), $$3);
      return !cht.a($$4, $$0) && !cht.a($$2, $$0, $$4) && !cht.a($$0.O(), $$4) && !cht.b($$0, $$4) ? $$4 : null;
   }
}
