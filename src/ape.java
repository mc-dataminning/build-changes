import java.util.function.UnaryOperator;

public interface ape {
   UnaryOperator<vb> a = UnaryOperator.identity();
   ape b = a(a, true);
   ape c = a(a("pack.source.builtin"), true);
   ape d = a(a("pack.source.feature"), false);
   ape e = a(a("pack.source.world"), true);
   ape f = a(a("pack.source.server"), true);

   vb a(vb var1);

   boolean a();

   static ape a(final UnaryOperator<vb> $$0, final boolean $$1) {
      return new ape() {
         @Override
         public vb a(vb $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<vb> a(String $$0) {
      vb $$1 = vb.c($$0);
      return $$1x -> vb.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
