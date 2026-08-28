import java.util.function.UnaryOperator;

public interface auo {
   UnaryOperator<xj> a = UnaryOperator.identity();
   auo b = a(a, true);
   auo c = a(a("pack.source.builtin"), true);
   auo d = a(a("pack.source.feature"), false);
   auo e = a(a("pack.source.world"), true);
   auo f = a(a("pack.source.server"), true);

   xj a(xj var1);

   boolean a();

   static auo a(final UnaryOperator<xj> $$0, final boolean $$1) {
      return new auo() {
         @Override
         public xj a(xj $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xj> a(String $$0) {
      xj $$1 = xj.c($$0);
      return $$1x -> xj.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
