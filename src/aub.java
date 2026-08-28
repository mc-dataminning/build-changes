import java.util.function.UnaryOperator;

public interface aub {
   UnaryOperator<wp> a = UnaryOperator.identity();
   aub b = a(a, true);
   aub c = a(a("pack.source.builtin"), true);
   aub d = a(a("pack.source.feature"), false);
   aub e = a(a("pack.source.world"), true);
   aub f = a(a("pack.source.server"), true);

   wp a(wp var1);

   boolean a();

   static aub a(final UnaryOperator<wp> $$0, final boolean $$1) {
      return new aub() {
         @Override
         public wp a(wp $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<wp> a(String $$0) {
      wp $$1 = wp.c($$0);
      return $$1x -> wp.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
