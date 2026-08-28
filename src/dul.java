import java.util.Map;
import java.util.function.Function;

public interface dul {
   int d = 1;
   int e = 4;
   ecg f = ebw.V;

   default Function<ebg, fgm> a(ece<jc> $$0, ecg $$1) {
      Map<jc, fgm> $$2 = fgj.c(dne.a(0.0, 0.0, 0.0, 8.0, this.b(), 8.0));
      return $$3 -> {
         fgm $$4 = fgj.a();
         jc $$5 = $$3.c($$0);
         int $$6 = $$3.c($$1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$4 = fgj.a($$4, $$2.get($$5));
            $$5 = $$5.i();
         }

         return $$4.b();
      };
   }

   default ecg c() {
      return f;
   }

   default double b() {
      return 1.0;
   }

   default boolean a(ebg $$0, ddt $$1, ecg $$2) {
      return !$$1.h() && $$1.n().a($$0.b().h()) && $$0.c($$2) < 4;
   }

   default ebg a(ddt $$0, dne $$1, ecg $$2, ece<jc> $$3) {
      ebg $$4 = $$0.q().a_($$0.a());
      return $$4.a($$1) ? $$4.b($$2, Integer.valueOf(Math.min(4, $$4.c($$2) + 1))) : $$1.m().b($$3, $$0.g().g());
   }
}
