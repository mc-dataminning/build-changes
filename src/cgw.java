import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cgw {
   @Nullable
   public static fbx a(bwg $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static fbx a(bwg $$0, int $$1, int $$2, ToDoubleFunction<ji> $$3) {
      boolean $$4 = cgu.a($$0, $$1);
      return cgx.a(() -> {
         ji $$4x = cgx.a($$0.dX(), $$1, $$2);
         ji $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static fbx a(bwg $$0, int $$1, int $$2, fbx $$3) {
      fbx $$4 = $$3.a($$0.dz(), $$0.dB(), $$0.dF());
      boolean $$5 = cgu.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static fbx b(bwg $$0, int $$1, int $$2, fbx $$3) {
      fbx $$4 = $$0.ds().d($$3);
      boolean $$5 = cgu.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static fbx a(bwg $$0, int $$1, int $$2, fbx $$3, boolean $$4) {
      return cgx.a($$0, () -> {
         ji $$5 = cgx.a($$0.dX(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            ji $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static ji a(bwg $$0, ji $$1) {
      $$1 = cgx.a($$1, $$0.dU().ao(), $$1x -> cgu.c($$0, $$1x));
      return !cgu.a($$0, $$1) && !cgu.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static ji a(bwg $$0, int $$1, boolean $$2, ji $$3) {
      ji $$4 = cgx.a($$0, $$1, $$0.dX(), $$3);
      return !cgu.a($$4, $$0) && !cgu.a($$2, $$0, $$4) && !cgu.a($$0.O(), $$4) ? $$4 : null;
   }
}
