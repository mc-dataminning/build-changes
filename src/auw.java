import java.util.function.UnaryOperator;

public interface auw {
   UnaryOperator<xk> a = UnaryOperator.identity();
   auw b = a(a, true);
   auw c = a(a("pack.source.builtin"), true);
   auw d = a(a("pack.source.feature"), false);
   auw e = a(a("pack.source.world"), true);
   auw f = a(a("pack.source.server"), true);

   xk a(xk var1);

   boolean a();

   static auw a(final UnaryOperator<xk> $$0, final boolean $$1) {
      return new auw() {
         @Override
         public xk a(xk $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xk> a(String $$0) {
      xk $$1 = xk.c($$0);
      return $$1x -> xk.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
