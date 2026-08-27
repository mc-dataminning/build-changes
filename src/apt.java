import java.util.function.UnaryOperator;

public interface apt {
   UnaryOperator<vf> a = UnaryOperator.identity();
   apt b = a(a, true);
   apt c = a(a("pack.source.builtin"), true);
   apt d = a(a("pack.source.feature"), false);
   apt e = a(a("pack.source.world"), true);
   apt f = a(a("pack.source.server"), true);

   vf a(vf var1);

   boolean a();

   static apt a(final UnaryOperator<vf> $$0, final boolean $$1) {
      return new apt() {
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
