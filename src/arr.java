import java.util.function.UnaryOperator;

public interface arr {
   UnaryOperator<vs> a = UnaryOperator.identity();
   arr b = a(a, true);
   arr c = a(a("pack.source.builtin"), true);
   arr d = a(a("pack.source.feature"), false);
   arr e = a(a("pack.source.world"), true);
   arr f = a(a("pack.source.server"), true);

   vs a(vs var1);

   boolean a();

   static arr a(final UnaryOperator<vs> $$0, final boolean $$1) {
      return new arr() {
         @Override
         public vs a(vs $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<vs> a(String $$0) {
      vs $$1 = vs.c($$0);
      return $$1x -> vs.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
