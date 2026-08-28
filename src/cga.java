import javax.annotation.Nullable;

public class cga {
   @Nullable
   public static fay a(bvn $$0, int $$1, int $$2) {
      boolean $$3 = cgb.a($$0, $$1);
      return cge.a($$0, () -> {
         ji $$4 = cge.a($$0.dZ(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static fay a(bvn $$0, int $$1, int $$2, fay $$3, double $$4) {
      fay $$5 = $$3.a($$0.dB(), $$0.dD(), $$0.dH());
      boolean $$6 = cgb.a($$0, $$1);
      return cge.a($$0, () -> {
         ji $$6x = cge.a($$0.dZ(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static fay a(bvn $$0, int $$1, int $$2, fay $$3) {
      fay $$4 = $$0.du().d($$3);
      boolean $$5 = cgb.a($$0, $$1);
      return cge.a($$0, () -> {
         ji $$5x = cge.a($$0.dZ(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ji a(bvn $$0, int $$1, boolean $$2, ji $$3) {
      ji $$4 = cge.a($$0, $$1, $$0.dZ(), $$3);
      return !cgb.a($$4, $$0) && !cgb.a($$2, $$0, $$4) && !cgb.a($$0.L(), $$4) && !cgb.b($$0, $$4) ? $$4 : null;
   }
}
