import java.util.function.UnaryOperator;

public interface anh {
   UnaryOperator<tn> a = UnaryOperator.identity();
   anh b = a(a, true);
   anh c = a(a("pack.source.builtin"), true);
   anh d = a(a("pack.source.feature"), false);
   anh e = a(a("pack.source.world"), true);
   anh f = a(a("pack.source.server"), true);

   tn a(tn var1);

   boolean a();

   static anh a(final UnaryOperator<tn> $$0, final boolean $$1) {
      return new anh() {
         @Override
         public tn a(tn $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<tn> a(String $$0) {
      tn $$1 = tn.c($$0);
      return $$1x -> tn.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
