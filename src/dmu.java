import java.util.List;
import java.util.Optional;

public interface dmu {
   boolean a(djp var1, iv var2, eat var3);

   boolean a(djm var1, azv var2, iv var3, eat var4);

   void a(arq var1, azv var2, iv var3, eat var4);

   static boolean a_(djp $$0, iv $$1, eat $$2) {
      return a(jb.c.a.a().toList(), $$0, $$1, $$2).isPresent();
   }

   static Optional<iv> a(djm $$0, iv $$1, eat $$2) {
      return a(jb.c.a.c($$0.A), $$0, $$1, $$2);
   }

   private static Optional<iv> a(List<jb> $$0, djp $$1, iv $$2, eat $$3) {
      for (jb $$4 : $$0) {
         iv $$5 = $$2.a($$4);
         if ($$1.v($$5) && $$3.a($$1, $$5)) {
            return Optional.of($$5);
         }
      }

      return Optional.empty();
   }

   default iv a(iv $$0) {
      return switch (this.an_()) {
         case a -> $$0.d();
         case b -> $$0;
      };
   }

   default dmu.a an_() {
      return dmu.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
