import java.util.function.UnaryOperator;

public interface aua {
   UnaryOperator<xo> a = UnaryOperator.identity();
   aua b = a(a, true);
   aua c = a(a("pack.source.builtin"), true);
   aua d = a(a("pack.source.feature"), false);
   aua e = a(a("pack.source.world"), true);
   aua f = a(a("pack.source.server"), true);

   xo a(xo var1);

   boolean a();

   static aua a(final UnaryOperator<xo> $$0, final boolean $$1) {
      return new aua() {
         @Override
         public xo a(xo $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xo> a(String $$0) {
      xo $$1 = xo.c($$0);
      return $$1x -> xo.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
