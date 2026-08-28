import java.util.function.UnaryOperator;

public interface aus {
   UnaryOperator<xc> a = UnaryOperator.identity();
   aus b = a(a, true);
   aus c = a(a("pack.source.builtin"), true);
   aus d = a(a("pack.source.feature"), false);
   aus e = a(a("pack.source.world"), true);
   aus f = a(a("pack.source.server"), true);

   xc a(xc var1);

   boolean a();

   static aus a(final UnaryOperator<xc> $$0, final boolean $$1) {
      return new aus() {
         @Override
         public xc a(xc $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xc> a(String $$0) {
      xc $$1 = xc.c($$0);
      return $$1x -> xc.a("pack.nameAndSource", $$1x, $$1).a(o.h);
   }
}
