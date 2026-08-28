import java.util.function.UnaryOperator;

public interface auq {
   UnaryOperator<xa> a = UnaryOperator.identity();
   auq b = a(a, true);
   auq c = a(a("pack.source.builtin"), true);
   auq d = a(a("pack.source.feature"), false);
   auq e = a(a("pack.source.world"), true);
   auq f = a(a("pack.source.server"), true);

   xa a(xa var1);

   boolean a();

   static auq a(final UnaryOperator<xa> $$0, final boolean $$1) {
      return new auq() {
         @Override
         public xa a(xa $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<xa> a(String $$0) {
      xa $$1 = xa.c($$0);
      return $$1x -> xa.a("pack.nameAndSource", $$1x, $$1).a(o.h);
   }
}
