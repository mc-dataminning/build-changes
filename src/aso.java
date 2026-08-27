import java.util.function.UnaryOperator;

public interface aso {
   UnaryOperator<wg> a = UnaryOperator.identity();
   aso b = a(a, true);
   aso c = a(a("pack.source.builtin"), true);
   aso d = a(a("pack.source.feature"), false);
   aso e = a(a("pack.source.world"), true);
   aso f = a(a("pack.source.server"), true);

   wg a(wg var1);

   boolean a();

   static aso a(final UnaryOperator<wg> $$0, final boolean $$1) {
      return new aso() {
         @Override
         public wg a(wg $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<wg> a(String $$0) {
      wg $$1 = wg.c($$0);
      return $$1x -> wg.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
