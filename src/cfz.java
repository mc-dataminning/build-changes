import javax.annotation.Nullable;

public class cfz {
   @Nullable
   public static ezr a(bvm $$0, int $$1, int $$2) {
      boolean $$3 = cga.a($$0, $$1);
      return cgd.a($$0, () -> {
         jh $$4 = cgd.a($$0.eb(), $$1, $$2);
         return a($$0, $$1, $$3, $$4);
      });
   }

   @Nullable
   public static ezr a(bvm $$0, int $$1, int $$2, ezr $$3, double $$4) {
      ezr $$5 = $$3.a($$0.dD(), $$0.dF(), $$0.dJ());
      boolean $$6 = cga.a($$0, $$1);
      return cgd.a($$0, () -> {
         jh $$6x = cgd.a($$0.eb(), $$1, $$2, 0, $$5.d, $$5.f, $$4);
         return $$6x == null ? null : a($$0, $$1, $$6, $$6x);
      });
   }

   @Nullable
   public static ezr a(bvm $$0, int $$1, int $$2, ezr $$3) {
      ezr $$4 = $$0.dw().d($$3);
      boolean $$5 = cga.a($$0, $$1);
      return cgd.a($$0, () -> {
         jh $$5x = cgd.a($$0.eb(), $$1, $$2, 0, $$4.d, $$4.f, (float) (Math.PI / 2));
         return $$5x == null ? null : a($$0, $$1, $$5, $$5x);
      });
   }

   @Nullable
   private static jh a(bvm $$0, int $$1, boolean $$2, jh $$3) {
      jh $$4 = cgd.a($$0, $$1, $$0.eb(), $$3);
      return !cga.a($$4, $$0) && !cga.a($$2, $$0, $$4) && !cga.a($$0.P(), $$4) && !cga.b($$0, $$4) ? $$4 : null;
   }
}
