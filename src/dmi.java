import java.util.List;
import java.util.Optional;

public interface dmi {
   boolean a(djd var1, iu var2, eah var3);

   boolean a(dja var1, azv var2, iu var3, eah var4);

   void a(arq var1, azv var2, iu var3, eah var4);

   static boolean a_(djd $$0, iu $$1, eah $$2) {
      return a(ja.c.a.a().toList(), $$0, $$1, $$2).isPresent();
   }

   static Optional<iu> a(dja $$0, iu $$1, eah $$2) {
      return a(ja.c.a.c($$0.A), $$0, $$1, $$2);
   }

   private static Optional<iu> a(List<ja> $$0, djd $$1, iu $$2, eah $$3) {
      for (ja $$4 : $$0) {
         iu $$5 = $$2.a($$4);
         if ($$1.v($$5) && $$3.a($$1, $$5)) {
            return Optional.of($$5);
         }
      }

      return Optional.empty();
   }

   default iu a(iu $$0) {
      return switch (this.an_()) {
         case a -> $$0.d();
         case b -> $$0;
      };
   }

   default dmi.a an_() {
      return dmi.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
