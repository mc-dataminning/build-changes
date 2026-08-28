import java.util.function.UnaryOperator;

public interface ati {
   UnaryOperator<wu> a = UnaryOperator.identity();
   ati b = a(a, true);
   ati c = a(a("pack.source.builtin"), true);
   ati d = a(a("pack.source.feature"), false);
   ati e = a(a("pack.source.world"), true);
   ati f = a(a("pack.source.server"), true);

   wu a(wu var1);

   boolean a();

   static ati a(final UnaryOperator<wu> $$0, final boolean $$1) {
      return new ati() {
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
