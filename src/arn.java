import java.util.function.UnaryOperator;

public interface arn {
   UnaryOperator<vq> a = UnaryOperator.identity();
   arn b = a(a, true);
   arn c = a(a("pack.source.builtin"), true);
   arn d = a(a("pack.source.feature"), false);
   arn e = a(a("pack.source.world"), true);
   arn f = a(a("pack.source.server"), true);

   vq a(vq var1);

   boolean a();

   static arn a(final UnaryOperator<vq> $$0, final boolean $$1) {
      return new arn() {
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
