import javax.annotation.Nullable;

public class cgt {
   @Nullable
   public static fbx a(bwg $$0, int $$1, int $$2) {
      boolean $$3 = cgu.a($$0, $$1);
      return cgx.a($$0, () -> {
         ji $$4 = cgx.a($$0.dX(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static fbx a(bwg $$0, int $$1, int $$2, fbx $$3, double $$4) {
      fbx $$5 = $$3.a($$0.dz(), $$0.dB(), $$0.dF());
      boolean $$6 = cgu.a($$0, $$1);
      return cgx.a($$0, () -> {
         ji $$6x = cgx.a($$0.dX(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static fbx a(bwg $$0, int $$1, int $$2, fbx $$3) {
      fbx $$4 = $$0.ds().d($$3);
      boolean $$5 = cgu.a($$0, $$1);
      return cgx.a($$0, () -> {
         ji $$5x = cgx.a($$0.dX(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static ji a(bwg $$0, int $$1, boolean $$2, ji $$3) {
      ji $$4 = cgx.a($$0, $$1, $$0.dX(), $$3);
      return !cgu.a($$4, $$0) && !cgu.a($$2, $$0, $$4) && !cgu.a($$0.O(), $$4) && !cgu.b($$0, $$4) ? $$4 : null;
   }
}
