import java.util.Map;
import java.util.function.Function;

public interface dry {
   int d = 1;
   int e = 4;
   dzm f = dzc.V;

   default Function<dym, fdo> a(dzk<jo> $$0, dzm $$1) {
      Map<jo, fdo> $$2 = fdl.c(dku.a(0.0, 0.0, 0.0, 8.0, this.b(), 8.0));
      return $$3 -> {
         fdo $$4 = fdl.a();
         jo $$5 = $$3.c($$0);
         int $$6 = $$3.c($$1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$4 = fdl.a($$4, $$2.get($$5));
            $$5 = $$5.i();
         }

         return $$4.b();
      };
   }

   default dzm c() {
      return f;
   }

   default double b() {
      return 1.0;
   }

   default boolean a(dym $$0, dbn $$1, dzm $$2) {
      return !$$1.h() && $$1.n().a($$0.b().i()) && $$0.c($$2) < 4;
   }

   default dym a(dbn $$0, dku $$1, dzm $$2, dzk<jo> $$3) {
      dym $$4 = $$0.q().a_($$0.a());
      return $$4.a($$1) ? $$4.b($$2, Integer.valueOf(Math.min(4, $$4.c($$2) + 1))) : $$1.m().b($$3, $$0.g().g());
   }
}
