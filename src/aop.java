import java.util.function.UnaryOperator;

public interface aop {
   UnaryOperator<ur> a = UnaryOperator.identity();
   aop b = a(a, true);
   aop c = a(a("pack.source.builtin"), true);
   aop d = a(a("pack.source.feature"), false);
   aop e = a(a("pack.source.world"), true);
   aop f = a(a("pack.source.server"), true);

   ur a(ur var1);

   boolean a();

   static aop a(final UnaryOperator<ur> $$0, final boolean $$1) {
      return new aop() {
         @Override
         public ur a(ur $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<ur> a(String $$0) {
      ur $$1 = ur.c($$0);
      return $$1x -> ur.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
