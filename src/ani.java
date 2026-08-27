import java.util.function.UnaryOperator;

public interface ani {
   UnaryOperator<tl> a = UnaryOperator.identity();
   ani b = a(a, true);
   ani c = a(a("pack.source.builtin"), true);
   ani d = a(a("pack.source.feature"), false);
   ani e = a(a("pack.source.world"), true);
   ani f = a(a("pack.source.server"), true);

   tl a(tl var1);

   boolean a();

   static ani a(final UnaryOperator<tl> $$0, final boolean $$1) {
      return new ani() {
         @Override
         public tl a(tl $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<tl> a(String $$0) {
      tl $$1 = tl.c($$0);
      return $$1x -> tl.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
