import java.util.function.UnaryOperator;

public interface atp {
   UnaryOperator<wy> a = UnaryOperator.identity();
   atp b = a(a, true);
   atp c = a(a("pack.source.builtin"), true);
   atp d = a(a("pack.source.feature"), false);
   atp e = a(a("pack.source.world"), true);
   atp f = a(a("pack.source.server"), true);

   wy a(wy var1);

   boolean a();

   static atp a(final UnaryOperator<wy> $$0, final boolean $$1) {
      return new atp() {
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
      return $$1x -> wy.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
