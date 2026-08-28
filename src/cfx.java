import javax.annotation.Nullable;

public class cfx {
   @Nullable
   public static ezr a(bvm $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6) {
      boolean $$7 = cga.a($$0, $$1);
      return cgd.a($$0, () -> a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
   }

   @Nullable
   public static jh a(bvm $$0, int $$1, int $$2, int $$3, double $$4, double $$5, double $$6, boolean $$7) {
      jh $$8 = cgd.a($$0.eb(), $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$8 == null) {
         return null;
      } else {
         jh $$9 = cgd.a($$0, $$1, $$0.eb(), $$8);
         if (!cga.a($$9, $$0) && !cga.a($$7, $$0, $$9)) {
            $$9 = cgd.a($$9, $$0.dY().al(), $$1x -> cga.c($$0, $$1x));
            return cga.b($$0, $$9) ? null : $$9;
         } else {
            return null;
         }
      }
   }
}
