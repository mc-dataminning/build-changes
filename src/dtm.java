import java.util.Map;
import java.util.function.Function;

public interface dtm {
   int d = 1;
   int e = 4;
   ebh f = eax.V;

   default Function<eah, ffk> a(ebf<ja> $$0, ebh $$1) {
      Map<ja, ffk> $$2 = ffh.c(dmf.a(0.0, 0.0, 0.0, 8.0, this.b(), 8.0));
      return $$3 -> {
         ffk $$4 = ffh.a();
         ja $$5 = $$3.c($$0);
         int $$6 = $$3.c($$1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$4 = ffh.a($$4, $$2.get($$5));
            $$5 = $$5.i();
         }

         return $$4.b();
      };
   }

   default ebh c() {
      return f;
   }

   default double b() {
      return 1.0;
   }

   default boolean a(eah $$0, dcw $$1, ebh $$2) {
      return !$$1.h() && $$1.n().a($$0.b().h()) && $$0.c($$2) < 4;
   }

   default eah a(dcw $$0, dmf $$1, ebh $$2, ebf<ja> $$3) {
      eah $$4 = $$0.q().a_($$0.a());
      return $$4.a($$1) ? $$4.b($$2, Integer.valueOf(Math.min(4, $$4.c($$2) + 1))) : $$1.m().b($$3, $$0.g().g());
   }
}
