import java.util.function.UnaryOperator;

public interface anb {
   UnaryOperator<ti> a = UnaryOperator.identity();
   anb b = a(a, true);
   anb c = a(a("pack.source.builtin"), true);
   anb d = a(a("pack.source.feature"), false);
   anb e = a(a("pack.source.world"), true);
   anb f = a(a("pack.source.server"), true);

   ti a(ti var1);

   boolean a();

   static anb a(final UnaryOperator<ti> $$0, final boolean $$1) {
      return new anb() {
         @Override
         public ti a(ti $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<ti> a(String $$0) {
      ti $$1 = ti.c($$0);
      return $$1x -> ti.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
