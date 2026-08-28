import java.util.function.ToDoubleFunction;
import javax.annotation.Nullable;

public class cgc {
   @Nullable
   public static ezr a(bvm $$0, int $$1, int $$2) {
      return a($$0, $$1, $$2, $$0::c);
   }

   @Nullable
   public static ezr a(bvm $$0, int $$1, int $$2, ToDoubleFunction<jh> $$3) {
      boolean $$4 = cga.a($$0, $$1);
      return cgd.a(() -> {
         jh $$4x = cgd.a($$0.eb(), $$1, $$2);
         jh $$5 = a($$0, $$1, $$4, $$4x);
         return $$5 == null ? null : a($$0, $$5);
      }, $$3);
   }

   @Nullable
   public static ezr a(bvm $$0, int $$1, int $$2, ezr $$3) {
      ezr $$4 = $$3.a($$0.dD(), $$0.dF(), $$0.dJ());
      boolean $$5 = cga.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   public static ezr b(bvm $$0, int $$1, int $$2, ezr $$3) {
      ezr $$4 = $$0.dw().d($$3);
      boolean $$5 = cga.a($$0, $$1);
      return a($$0, $$1, $$2, $$4, $$5);
   }

   @Nullable
   private static ezr a(bvm $$0, int $$1, int $$2, ezr $$3, boolean $$4) {
      return cgd.a($$0, () -> {
         jh $$5 = cgd.a($$0.eb(), $$1, $$2, 0, $$3.d, $$3.f, (float) (Math.PI / 2));
         if ($$5 == null) {
            return null;
         } else {
            jh $$6 = a($$0, $$1, $$4, $$5);
            return $$6 == null ? null : a($$0, $$6);
         }
      });
   }

   @Nullable
   public static jh a(bvm $$0, jh $$1) {
      $$1 = cgd.a($$1, $$0.dY().al(), $$1x -> cga.c($$0, $$1x));
      return !cga.a($$0, $$1) && !cga.b($$0, $$1) ? $$1 : null;
   }

   @Nullable
   public static jh a(bvm $$0, int $$1, boolean $$2, jh $$3) {
      jh $$4 = cgd.a($$0, $$1, $$0.eb(), $$3);
      return !cga.a($$4, $$0) && !cga.a($$2, $$0, $$4) && !cga.a($$0.P(), $$4) ? $$4 : null;
   }
}
