import java.util.Map;
import java.util.function.Function;

public interface dri {
   int d = 1;
   int e = 4;
   dyq f = dyg.V;

   default Function<dxq, fcr> a(dyo<jn> $$0, dyq $$1) {
      Map<jn, fcr> $$2 = fco.c(dke.a(0.0, 0.0, 0.0, 8.0, this.b(), 8.0));
      return $$3 -> {
         fcr $$4 = fco.a();
         jn $$5 = $$3.c($$0);
         int $$6 = $$3.c($$1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$4 = fco.a($$4, $$2.get($$5));
            $$5 = $$5.i();
         }

         return $$4.b();
      };
   }

   default dyq c() {
      return f;
   }

   default double b() {
      return 1.0;
   }

   default boolean a(dxq $$0, dax $$1, dyq $$2) {
      return !$$1.h() && $$1.n().a($$0.b().i()) && $$0.c($$2) < 4;
   }

   default dxq a(dax $$0, dke $$1, dyq $$2, dyo<jn> $$3) {
      dxq $$4 = $$0.q().a_($$0.a());
      return $$4.a($$1) ? $$4.b($$2, Integer.valueOf(Math.min(4, $$4.c($$2) + 1))) : $$1.m().b($$3, $$0.g().g());
   }
}
