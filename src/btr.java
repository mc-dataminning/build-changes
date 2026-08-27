import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class btr {
   @Nullable
   public static ehd a(bjh $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static ehd a(bjh $$0, int $$1, int $$2, ToDoubleFunction<gu> $$3) {
      boolean $$4 = btp.a($$0, $$1);
      return bts.a(() -> {
         gu $$4x = bts.a($$0.ee(), $$1, $$2);
         gu $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ehd a(bjh $$0, int $$1, int $$2, ehd $$3) {
      ehd $$4 = $$3.a($$0.dp(), $$0.dr(), $$0.dv());
      boolean $$5 = btp.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ehd b(bjh $$0, int $$1, int $$2, ehd $$3) {
      ehd $$4 = $$0.di().d($$3);
      boolean $$5 = btp.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ehd a(bjh $$0, int $$1, int $$2, ehd $$3, boolean $$4) {
      return bts.a($$0, () -> {
         gu $$5 = bts.a($$0.ee(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            gu $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static gu a(bjh $$0, gu $$1) {
      $$1 = bts.a($$1, $$0.dK().aj(), $$1x -> btp.c($$0, $$1x));
      return !btp.a($$0, $$1) && !btp.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static gu a(bjh $$0, int $$1, boolean $$2, gu $$3) {
      gu $$4 = bts.a($$0, $$1, $$0.ee(), $$3);
      return !btp.a($$4, $$0) && !btp.a($$2, $$0, $$4) && !btp.a($$0.H(), $$4) ? $$4 : null;
   }
}
