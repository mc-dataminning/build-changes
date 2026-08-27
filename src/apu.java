import java.util.function.UnaryOperator;

public interface apu {
   UnaryOperator<vf> a = UnaryOperator.identity();
   apu b = a(a, true);
   apu c = a(a("pack.source.builtin"), true);
   apu d = a(a("pack.source.feature"), false);
   apu e = a(a("pack.source.world"), true);
   apu f = a(a("pack.source.server"), true);

   vf a(vf var1);

   boolean a();

   static apu a(final UnaryOperator<vf> $$0, final boolean $$1) {
      return new apu() {
         @Override
         public vf a(vf $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<vf> a(String $$0) {
      vf $$1 = vf.c($$0);
      return $$1x -> vf.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
