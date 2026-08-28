import java.util.function.UnaryOperator;

public interface aub {
   UnaryOperator<wo> a = UnaryOperator.identity();
   aub b = a(a, true);
   aub c = a(a("pack.source.builtin"), true);
   aub d = a(a("pack.source.feature"), false);
   aub e = a(a("pack.source.world"), true);
   aub f = a(a("pack.source.server"), true);

   wo a(wo var1);

   boolean a();

   static aub a(final UnaryOperator<wo> $$0, final boolean $$1) {
      return new aub() {
         @Override
         public wo a(wo $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<wo> a(String $$0) {
      wo $$1 = wo.c($$0);
      return $$1x -> wo.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
