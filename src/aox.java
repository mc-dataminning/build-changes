import java.util.function.UnaryOperator;

public interface aox {
   UnaryOperator<uv> a = UnaryOperator.identity();
   aox b = a(a, true);
   aox c = a(a("pack.source.builtin"), true);
   aox d = a(a("pack.source.feature"), false);
   aox e = a(a("pack.source.world"), true);
   aox f = a(a("pack.source.server"), true);

   uv a(uv var1);

   boolean a();

   static aox a(final UnaryOperator<uv> $$0, final boolean $$1) {
      return new aox() {
         @Override
         public uv a(uv $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<uv> a(String $$0) {
      uv $$1 = uv.c($$0);
      return $$1x -> uv.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
