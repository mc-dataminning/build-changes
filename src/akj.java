import java.util.function.UnaryOperator;

public interface akj {
   UnaryOperator<sw> a = UnaryOperator.identity();
   akj b = a(a, true);
   akj c = a(a("pack.source.builtin"), true);
   akj d = a(a("pack.source.feature"), false);
   akj e = a(a("pack.source.world"), true);
   akj f = a(a("pack.source.server"), true);

   sw a(sw var1);

   boolean a();

   static akj a(final UnaryOperator<sw> $$0, final boolean $$1) {
      return new akj() {
         @Override
         public sw a(sw $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<sw> a(String $$0) {
      sw $$1 = sw.c($$0);
      return $$1x -> sw.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
