import java.util.Map;
import java.util.function.Function;

public interface duv {
   int d = 1;
   int e = 4;
   ecq f = ecg.V;

   default Function<ebq, fgw> a(eco<jc> $$0, ecq $$1) {
      Map<jc, fgw> $$2 = fgt.c(dno.a(0.0, 0.0, 0.0, 8.0, this.b(), 8.0));
      return $$3 -> {
         fgw $$4 = fgt.a();
         jc $$5 = $$3.c($$0);
         int $$6 = $$3.c($$1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$4 = fgt.a($$4, $$2.get($$5));
            $$5 = $$5.i();
         }

         return $$4.b();
      };
   }

   default ecq c() {
      return f;
   }

   default double b() {
      return 1.0;
   }

   default boolean a(ebq $$0, ded $$1, ecq $$2) {
      return !$$1.h() && $$1.n().a($$0.b().h()) && $$0.c($$2) < 4;
   }

   default ebq a(ded $$0, dno $$1, ecq $$2, eco<jc> $$3) {
      ebq $$4 = $$0.q().a_($$0.a());
      return $$4.a($$1) ? $$4.b($$2, Integer.valueOf(Math.min(4, $$4.c($$2) + 1))) : $$1.m().b($$3, $$0.g().g());
   }
}
