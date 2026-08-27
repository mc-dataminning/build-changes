import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class btq {
   @Nullable
   public static ehf a(bjf $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static ehf a(bjf $$0, int $$1, int $$2, ToDoubleFunction<gv> $$3) {
      boolean $$4 = bto.a($$0, $$1);
      return btr.a(() -> {
         gv $$4x = btr.a($$0.ee(), $$1, $$2);
         gv $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ehf a(bjf $$0, int $$1, int $$2, ehf $$3) {
      ehf $$4 = $$3.a($$0.dp(), $$0.dr(), $$0.dv());
      boolean $$5 = bto.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ehf b(bjf $$0, int $$1, int $$2, ehf $$3) {
      ehf $$4 = $$0.di().d($$3);
      boolean $$5 = bto.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ehf a(bjf $$0, int $$1, int $$2, ehf $$3, boolean $$4) {
      return btr.a($$0, () -> {
         gv $$5 = btr.a($$0.ee(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            gv $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static gv a(bjf $$0, gv $$1) {
      $$1 = btr.a($$1, $$0.dK().aj(), $$1x -> bto.c($$0, $$1x));
      return !bto.a($$0, $$1) && !bto.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static gv a(bjf $$0, int $$1, boolean $$2, gv $$3) {
      gv $$4 = btr.a($$0, $$1, $$0.ee(), $$3);
      return !bto.a($$4, $$0) && !bto.a($$2, $$0, $$4) && !bto.a($$0.H(), $$4) ? $$4 : null;
   }
}
