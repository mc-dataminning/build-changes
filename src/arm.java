import java.util.function.UnaryOperator;

public interface arm {
   UnaryOperator<vq> a = UnaryOperator.identity();
   arm b = a(a, true);
   arm c = a(a("pack.source.builtin"), true);
   arm d = a(a("pack.source.feature"), false);
   arm e = a(a("pack.source.world"), true);
   arm f = a(a("pack.source.server"), true);

   vq a(vq var1);

   boolean a();

   static arm a(final UnaryOperator<vq> $$0, final boolean $$1) {
      return new arm() {
         @Override
         public vq a(vq $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<vq> a(String $$0) {
      vq $$1 = vq.c($$0);
      return $$1x -> vq.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
