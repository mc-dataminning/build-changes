import java.util.function.UnaryOperator;

public interface ata {
   UnaryOperator<ws> a = UnaryOperator.identity();
   ata b = a(a, true);
   ata c = a(a("pack.source.builtin"), true);
   ata d = a(a("pack.source.feature"), false);
   ata e = a(a("pack.source.world"), true);
   ata f = a(a("pack.source.server"), true);

   ws a(ws var1);

   boolean a();

   static ata a(final UnaryOperator<ws> $$0, final boolean $$1) {
      return new ata() {
         @Override
         public ws a(ws $$0x) {
            return $$0.apply($$0);
         }

         @Override
         public boolean a() {
            return $$1;
         }
      };
   }

   private static UnaryOperator<ws> a(String $$0) {
      ws $$1 = ws.c($$0);
      return $$1x -> ws.a("pack.nameAndSource", $$1x, $$1).a(n.h);
   }
}
