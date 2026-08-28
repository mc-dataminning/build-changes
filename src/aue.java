import java.util.function.UnaryOperator;

public interface aue {
   UnaryOperator<xd> a = UnaryOperator.identity();
   aue b = a(a, true);
   aue c = a(a("pack.source.builtin"), true);
   aue d = a(a("pack.source.feature"), false);
   aue e = a(a("pack.source.world"), true);
   aue f = a(a("pack.source.server"), true);

   xd a(xd var1);

   boolean a();

   static aue a(final UnaryOperator<xd> $$0, final boolean $$1) {
      return new aue() {
         @Override
         public xd a(xd $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xd> a(String $$0) {
      xd $$1 = xd.c($$0);
      return $$1x -> xd.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
