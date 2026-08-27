import java.util.function.UnaryOperator;

public interface apv {
   UnaryOperator<vg> a = UnaryOperator.identity();
   apv b = a(a, true);
   apv c = a(a("pack.source.builtin"), true);
   apv d = a(a("pack.source.feature"), false);
   apv e = a(a("pack.source.world"), true);
   apv f = a(a("pack.source.server"), true);

   vg a(vg var1);

   boolean a();

   static apv a(final UnaryOperator<vg> $$0, final boolean $$1) {
      return new apv() {
         @Override
         public vg a(vg $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<vg> a(String $$0) {
      vg $$1 = vg.c($$0);
      return $$1x -> vg.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
