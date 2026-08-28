import java.util.function.UnaryOperator;

public interface atq {
   UnaryOperator<wz> a = UnaryOperator.identity();
   atq b = a(a, true);
   atq c = a(a("pack.source.builtin"), true);
   atq d = a(a("pack.source.feature"), false);
   atq e = a(a("pack.source.world"), true);
   atq f = a(a("pack.source.server"), true);

   wz a(wz var1);

   boolean a();

   static atq a(final UnaryOperator<wz> $$0, final boolean $$1) {
      return new atq() {
         @Override
         public wz a(wz $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<wz> a(String $$0) {
      wz $$1 = wz.c($$0);
      return $$1x -> wz.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
