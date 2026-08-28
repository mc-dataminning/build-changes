import java.util.Map;
import java.util.function.Function;

public interface dty {
   int d = 1;
   int e = 4;
   ebt f = ebj.V;

   default Function<eat, ffw> a(ebr<jb> $$0, ebt $$1) {
      Map<jb, ffw> $$2 = fft.c(dmr.a(0.0, 0.0, 0.0, 8.0, this.b(), 8.0));
      return $$3 -> {
         ffw $$4 = fft.a();
         jb $$5 = $$3.c($$0);
         int $$6 = $$3.c($$1);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            $$4 = fft.a($$4, $$2.get($$5));
            $$5 = $$5.i();
         }

         return $$4.b();
      };
   }

   default ebt c() {
      return f;
   }

   default double b() {
      return 1.0;
   }

   default boolean a(eat $$0, ddg $$1, ebt $$2) {
      return !$$1.h() && $$1.n().a($$0.b().h()) && $$0.c($$2) < 4;
   }

   default eat a(ddg $$0, dmr $$1, ebt $$2, ebr<jb> $$3) {
      eat $$4 = $$0.q().a_($$0.a());
      return $$4.a($$1) ? $$4.b($$2, Integer.valueOf(Math.min(4, $$4.c($$2) + 1))) : $$1.m().b($$3, $$0.g().g());
   }
}
