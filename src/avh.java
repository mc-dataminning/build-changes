import java.util.function.UnaryOperator;

public interface avh {
   UnaryOperator<xv> a = UnaryOperator.identity();
   avh b = a(a, true);
   avh c = a(a("pack.source.builtin"), true);
   avh d = a(a("pack.source.feature"), false);
   avh e = a(a("pack.source.world"), true);
   avh f = a(a("pack.source.server"), true);

   xv a(xv var1);

   boolean a();

   static avh a(final UnaryOperator<xv> $$0, final boolean $$1) {
      return new avh() {
         @Override
         public xv a(xv $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xv> a(String $$0) {
      xv $$1 = xv.c($$0);
      return $$1x -> xv.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
