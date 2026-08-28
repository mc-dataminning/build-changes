import java.util.function.UnaryOperator;

public interface aul {
   UnaryOperator<wv> a = UnaryOperator.identity();
   aul b = a(a, true);
   aul c = a(a("pack.source.builtin"), true);
   aul d = a(a("pack.source.feature"), false);
   aul e = a(a("pack.source.world"), true);
   aul f = a(a("pack.source.server"), true);

   wv a(wv var1);

   boolean a();

   static aul a(final UnaryOperator<wv> $$0, final boolean $$1) {
      return new aul() {
         @Override
         public wv a(wv $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<wv> a(String $$0) {
      wv $$1 = wv.c($$0);
      return $$1x -> wv.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
