import java.util.function.UnaryOperator;

public interface auo {
   UnaryOperator<wy> a = UnaryOperator.identity();
   auo b = a(a, true);
   auo c = a(a("pack.source.builtin"), true);
   auo d = a(a("pack.source.feature"), false);
   auo e = a(a("pack.source.world"), true);
   auo f = a(a("pack.source.server"), true);

   wy a(wy var1);

   boolean a();

   static auo a(final UnaryOperator<wy> $$0, final boolean $$1) {
      return new auo() {
         @Override
         public wy a(wy $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<wy> a(String $$0) {
      wy $$1 = wy.c($$0);
      return $$1x -> wy.a("pack.nameAndSource", $$1x, $$1).a(o.h);
   }
}
