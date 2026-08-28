import java.util.Map;
import java.util.function.Function;

public interface duj {
   int d = 1;
   int e = 4;
   ece f = ebu.V;

   default Function<ebe, fgk> a(ecc<jb> $$0, ece $$1) {
      Map<jb, fgk> $$2 = fgh.c(dnc.a(0.0, 0.0, 0.0, 8.0, this.b(), 8.0));
      return $$3 -> {
         fgk $$4 = fgh.a();
         jb $$5 = $$3.c($$0);
         int $$6 = $$3.c($$1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$4 = fgh.a($$4, $$2.get($$5));
            $$5 = $$5.i();
         }

         return $$4.b();
      };
   }

   default ece c() {
      return f;
   }

   default double b() {
      return 1.0;
   }

   default boolean a(ebe $$0, ddr $$1, ece $$2) {
      return !$$1.h() && $$1.n().a($$0.b().h()) && $$0.c($$2) < 4;
   }

   default ebe a(ddr $$0, dnc $$1, ece $$2, ecc<jb> $$3) {
      ebe $$4 = $$0.q().a_($$0.a());
      return $$4.a($$1) ? $$4.b($$2, Integer.valueOf(Math.min(4, $$4.c($$2) + 1))) : $$1.m().b($$3, $$0.g().g());
   }
}
