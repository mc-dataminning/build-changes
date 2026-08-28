import java.util.List;
import java.util.Optional;

public interface dmp {
   boolean a(djk var1, iv var2, eao var3);

   boolean a(djh var1, azv var2, iv var3, eao var4);

   void a(arq var1, azv var2, iv var3, eao var4);

   static boolean a_(djk $$0, iv $$1, eao $$2) {
      return a(jb.c.a.a().toList(), $$0, $$1, $$2).isPresent();
   }

   static Optional<iv> a(djh $$0, iv $$1, eao $$2) {
      return a(jb.c.a.c($$0.A), $$0, $$1, $$2);
   }

   private static Optional<iv> a(List<jb> $$0, djk $$1, iv $$2, eao $$3) {
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

   default dmp.a an_() {
      return dmp.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
