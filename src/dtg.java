import java.util.Map;
import java.util.function.Function;

public interface dtg {
   int d = 1;
   int e = 4;
   eaz f = eap.V;

   default Function<dzz, ffc> a(eax<ja> $$0, eaz $$1) {
      Map<ja, ffc> $$2 = fez.c(dma.a(0.0, 0.0, 0.0, 8.0, this.b(), 8.0));
      return $$3 -> {
         ffc $$4 = fez.a();
         ja $$5 = $$3.c($$0);
         int $$6 = $$3.c($$1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$4 = fez.a($$4, $$2.get($$5));
            $$5 = $$5.i();
         }

         return $$4.b();
      };
   }

   default eaz c() {
      return f;
   }

   default double b() {
      return 1.0;
   }

   default boolean a(dzz $$0, dcr $$1, eaz $$2) {
      return !$$1.h() && $$1.n().a($$0.b().h()) && $$0.c($$2) < 4;
   }

   default dzz a(dcr $$0, dma $$1, eaz $$2, eax<ja> $$3) {
      dzz $$4 = $$0.q().a_($$0.a());
      return $$4.a($$1) ? $$4.b($$2, Integer.valueOf(Math.min(4, $$4.c($$2) + 1))) : $$1.m().b($$3, $$0.g().g());
   }
}
