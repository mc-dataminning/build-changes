import java.util.function.UnaryOperator;

public interface apo {
   UnaryOperator<vd> a = UnaryOperator.identity();
   apo b = a(a, true);
   apo c = a(a("pack.source.builtin"), true);
   apo d = a(a("pack.source.feature"), false);
   apo e = a(a("pack.source.world"), true);
   apo f = a(a("pack.source.server"), true);

   vd a(vd var1);

   boolean a();

   static apo a(final UnaryOperator<vd> $$0, final boolean $$1) {
      return new apo() {
         @Override
         public vd a(vd $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<vd> a(String $$0) {
      vd $$1 = vd.c($$0);
      return $$1x -> vd.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
