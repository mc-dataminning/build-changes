import java.util.function.UnaryOperator;

public interface aub {
   UnaryOperator<xp> a = UnaryOperator.identity();
   aub b = a(a, true);
   aub c = a(a("pack.source.builtin"), true);
   aub d = a(a("pack.source.feature"), false);
   aub e = a(a("pack.source.world"), true);
   aub f = a(a("pack.source.server"), true);

   xp a(xp var1);

   boolean a();

   static aub a(final UnaryOperator<xp> $$0, final boolean $$1) {
      return new aub() {
         @Override
         public xp a(xp $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xp> a(String $$0) {
      xp $$1 = xp.c($$0);
      return $$1x -> xp.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
