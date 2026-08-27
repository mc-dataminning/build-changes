import java.util.function.UnaryOperator;

public interface amw {
   UnaryOperator<te> a = UnaryOperator.identity();
   amw b = a(a, true);
   amw c = a(a("pack.source.builtin"), true);
   amw d = a(a("pack.source.feature"), false);
   amw e = a(a("pack.source.world"), true);
   amw f = a(a("pack.source.server"), true);

   te a(te var1);

   boolean a();

   static amw a(final UnaryOperator<te> $$0, final boolean $$1) {
      return new amw() {
         @Override
         public te a(te $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<te> a(String $$0) {
      te $$1 = te.c($$0);
      return $$1x -> te.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
