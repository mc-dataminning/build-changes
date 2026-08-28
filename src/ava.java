import java.util.function.UnaryOperator;

public interface ava {
   UnaryOperator<xg> a = UnaryOperator.identity();
   ava b = a(a, true);
   ava c = a(a("pack.source.builtin"), true);
   ava d = a(a("pack.source.feature"), false);
   ava e = a(a("pack.source.world"), true);
   ava f = a(a("pack.source.server"), true);

   xg a(xg var1);

   boolean a();

   static ava a(final UnaryOperator<xg> $$0, final boolean $$1) {
      return new ava() {
         @Override
         public xg a(xg $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xg> a(String $$0) {
      xg $$1 = xg.c($$0);
      return $$1x -> xg.a("pack.nameAndSource", $$1x, $$1).a(o.h);
   }
}
