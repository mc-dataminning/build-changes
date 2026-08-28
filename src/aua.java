import java.util.function.UnaryOperator;

public interface aua {
   UnaryOperator<wo> a = UnaryOperator.identity();
   aua b = a(a, true);
   aua c = a(a("pack.source.builtin"), true);
   aua d = a(a("pack.source.feature"), false);
   aua e = a(a("pack.source.world"), true);
   aua f = a(a("pack.source.server"), true);

   wo a(wo var1);

   boolean a();

   static aua a(final UnaryOperator<wo> $$0, final boolean $$1) {
      return new aua() {
         @Override
         public wo a(wo $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<wo> a(String $$0) {
      wo $$1 = wo.c($$0);
      return $$1x -> wo.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
