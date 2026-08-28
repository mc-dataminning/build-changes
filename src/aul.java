import java.util.function.UnaryOperator;

public interface aul {
   UnaryOperator<xh> a = UnaryOperator.identity();
   aul b = a(a, true);
   aul c = a(a("pack.source.builtin"), true);
   aul d = a(a("pack.source.feature"), false);
   aul e = a(a("pack.source.world"), true);
   aul f = a(a("pack.source.server"), true);

   xh a(xh var1);

   boolean a();

   static aul a(final UnaryOperator<xh> $$0, final boolean $$1) {
      return new aul() {
         @Override
         public xh a(xh $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xh> a(String $$0) {
      xh $$1 = xh.c($$0);
      return $$1x -> xh.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
