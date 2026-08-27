import java.util.function.UnaryOperator;

public interface asa {
   UnaryOperator<vu> a = UnaryOperator.identity();
   asa b = a(a, true);
   asa c = a(a("pack.source.builtin"), true);
   asa d = a(a("pack.source.feature"), false);
   asa e = a(a("pack.source.world"), true);
   asa f = a(a("pack.source.server"), true);

   vu a(vu var1);

   boolean a();

   static asa a(final UnaryOperator<vu> $$0, final boolean $$1) {
      return new asa() {
         @Override
         public vu a(vu $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<vu> a(String $$0) {
      vu $$1 = vu.c($$0);
      return $$1x -> vu.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
