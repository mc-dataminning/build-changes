import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class bts {
   @Nullable
   public static ehe a(bjh $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::h);
   }

   @Nullable
   public static ehe a(bjh $$0, int $$1, int $$2, ToDoubleFunction<gu> $$3) {
      boolean $$4 = btq.a($$0, $$1);
      return btt.a(() -> {
         gu $$4x = btt.a($$0.ee(), $$1, $$2);
         gu $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ehe a(bjh $$0, int $$1, int $$2, ehe $$3) {
      ehe $$4 = $$3.a($$0.dp(), $$0.dr(), $$0.dv());
      boolean $$5 = btq.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ehe b(bjh $$0, int $$1, int $$2, ehe $$3) {
      ehe $$4 = $$0.di().d($$3);
      boolean $$5 = btq.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ehe a(bjh $$0, int $$1, int $$2, ehe $$3, boolean $$4) {
      return btt.a($$0, () -> {
         gu $$5 = btt.a($$0.ee(), $$1, $$2, 0, $$3.c, $$3.e, (float) (Math.PI / 2));
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
      $$1 = btt.a($$1, $$0.dK().aj(), $$1x -> btq.c($$0, $$1x));
      return !btq.a($$0, $$1) && !btq.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static gu a(bjh $$0, int $$1, boolean $$2, gu $$3) {
      gu $$4 = btt.a($$0, $$1, $$0.ee(), $$3);
      return !btq.a($$4, $$0) && !btq.a($$2, $$0, $$4) && !btq.a($$0.H(), $$4) ? $$4 : null;
   }
}
