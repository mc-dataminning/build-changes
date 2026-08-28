import java.util.Map;
import java.util.function.Function;

public interface dtt {
   int d = 1;
   int e = 4;
   ebo f = ebe.V;

   default Function<eao, ffr> a(ebm<jb> $$0, ebo $$1) {
      Map<jb, ffr> $$2 = ffo.c(dmm.a(0.0, 0.0, 0.0, 8.0, this.b(), 8.0));
      return $$3 -> {
         ffr $$4 = ffo.a();
         jb $$5 = $$3.c($$0);
         int $$6 = $$3.c($$1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$4 = ffo.a($$4, $$2.get($$5));
            $$5 = $$5.i();
         }

         return $$4.b();
      };
   }

   default ebo c() {
      return f;
   }

   default double b() {
      return 1.0;
   }

   default boolean a(eao $$0, ddd $$1, ebo $$2) {
      return !$$1.h() && $$1.n().a($$0.b().h()) && $$0.c($$2) < 4;
   }

   default eao a(ddd $$0, dmm $$1, ebo $$2, ebm<jb> $$3) {
      eao $$4 = $$0.q().a_($$0.a());
      return $$4.a($$1) ? $$4.b($$2, Integer.valueOf(Math.min(4, $$4.c($$2) + 1))) : $$1.m().b($$3, $$0.g().g());
   }
}
