import java.util.function.UnaryOperator;

public interface atd {
   UnaryOperator<wu> a = UnaryOperator.identity();
   atd b = a(a, true);
   atd c = a(a("pack.source.builtin"), true);
   atd d = a(a("pack.source.feature"), false);
   atd e = a(a("pack.source.world"), true);
   atd f = a(a("pack.source.server"), true);

   wu a(wu var1);

   boolean a();

   static atd a(final UnaryOperator<wu> $$0, final boolean $$1) {
      return new atd() {
         @Override
         public wu a(wu $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<wu> a(String $$0) {
      wu $$1 = wu.c($$0);
      return $$1x -> wu.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
