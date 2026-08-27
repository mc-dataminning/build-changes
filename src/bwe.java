import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bwe {
   @Nullable
   public static ejz a(blu $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static ejz a(blu $$0, int $$1, int $$2, ToDoubleFunction<hx> $$3) {
      boolean $$4 = bwc.a($$0, $$1);
      return bwf.a(() -> {
         hx $$4x = bwf.a($$0.eh(), $$1, $$2);
         hx $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ejz a(blu $$0, int $$1, int $$2, ejz $$3) {
      ejz $$4 = $$3.a($$0.ds(), $$0.du(), $$0.dy());
      boolean $$5 = bwc.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ejz b(blu $$0, int $$1, int $$2, ejz $$3) {
      ejz $$4 = $$0.dl().d($$3);
      boolean $$5 = bwc.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ejz a(blu $$0, int $$1, int $$2, ejz $$3, boolean $$4) {
      return bwf.a($$0, () -> {
         hx $$5 = bwf.a($$0.eh(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            hx $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static hx a(blu $$0, hx $$1) {
      $$1 = bwf.a($$1, $$0.dN().ak(), $$1x -> bwc.c($$0, $$1x));
      return !bwc.a($$0, $$1) && !bwc.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static hx a(blu $$0, int $$1, boolean $$2, hx $$3) {
      hx $$4 = bwf.a($$0, $$1, $$0.eh(), $$3);
      return !bwc.a($$4, $$0) && !bwc.a($$2, $$0, $$4) && !bwc.a($$0.N(), $$4) ? $$4 : null;
   }
}
