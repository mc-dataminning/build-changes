import java.util.function.UnaryOperator;

public interface atx {
   UnaryOperator<xl> a = UnaryOperator.identity();
   atx b = a(a, true);
   atx c = a(a("pack.source.builtin"), true);
   atx d = a(a("pack.source.feature"), false);
   atx e = a(a("pack.source.world"), true);
   atx f = a(a("pack.source.server"), true);

   xl a(xl var1);

   boolean a();

   static atx a(final UnaryOperator<xl> $$0, final boolean $$1) {
      return new atx() {
         @Override
         public xl a(xl $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xl> a(String $$0) {
      xl $$1 = xl.c($$0);
      return $$1x -> xl.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
