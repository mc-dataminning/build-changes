import javax.annotation.Nullable;

public class cfv {
   @Nullable
   public static ezn a(bvi $$0, int $$1, int $$2) {
      boolean $$3 = cfw.a($$0, $$1);
      return cfz.a($$0, () -> {
         jh $$4 = cfz.a($$0.ea(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ezn a(bvi $$0, int $$1, int $$2, ezn $$3, double $$4) {
      ezn $$5 = $$3.a($$0.dC(), $$0.dE(), $$0.dI());
      boolean $$6 = cfw.a($$0, $$1);
      return cfz.a($$0, () -> {
         jh $$6x = cfz.a($$0.ea(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ezn a(bvi $$0, int $$1, int $$2, ezn $$3) {
      ezn $$4 = $$0.dv().d($$3);
      boolean $$5 = cfw.a($$0, $$1);
      return cfz.a($$0, () -> {
         jh $$5x = cfz.a($$0.ea(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static jh a(bvi $$0, int $$1, boolean $$2, jh $$3) {
      jh $$4 = cfz.a($$0, $$1, $$0.ea(), $$3);
      return !cfw.a($$4, $$0) && !cfw.a($$2, $$0, $$4) && !cfw.a($$0.P(), $$4) && !cfw.b($$0, $$4) ? $$4 : null;
   }
}
