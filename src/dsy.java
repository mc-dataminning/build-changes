import java.util.Map;
import java.util.function.Function;

public interface dsy {
   int d = 1;
   int e = 4;
   eao f = eae.V;

   default Function<dzo, feq> a(eam<ja> $$0, eao $$1) {
      Map<ja, feq> $$2 = fen.c(dlu.a(0.0, 0.0, 0.0, 8.0, this.b(), 8.0));
      return $$3 -> {
         feq $$4 = fen.a();
         ja $$5 = $$3.c($$0);
         int $$6 = $$3.c($$1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$4 = fen.a($$4, $$2.get($$5));
            $$5 = $$5.i();
         }

         return $$4.b();
      };
   }

   default eao c() {
      return f;
   }

   default double b() {
      return 1.0;
   }

   default boolean a(dzo $$0, dcl $$1, eao $$2) {
      return !$$1.h() && $$1.n().a($$0.b().h()) && $$0.c($$2) < 4;
   }

   default dzo a(dcl $$0, dlu $$1, eao $$2, eam<ja> $$3) {
      dzo $$4 = $$0.q().a_($$0.a());
      return $$4.a($$1) ? $$4.b($$2, Integer.valueOf(Math.min(4, $$4.c($$2) + 1))) : $$1.m().b($$3, $$0.g().g());
   }
}
