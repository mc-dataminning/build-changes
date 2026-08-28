import java.util.function.UnaryOperator;

public interface aum {
   UnaryOperator<xi> a = UnaryOperator.identity();
   aum b = a(a, true);
   aum c = a(a("pack.source.builtin"), true);
   aum d = a(a("pack.source.feature"), false);
   aum e = a(a("pack.source.world"), true);
   aum f = a(a("pack.source.server"), true);

   xi a(xi var1);

   boolean a();

   static aum a(final UnaryOperator<xi> $$0, final boolean $$1) {
      return new aum() {
         @Override
         public xi a(xi $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xi> a(String $$0) {
      xi $$1 = xi.c($$0);
      return $$1x -> xi.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
