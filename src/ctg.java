import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface ctg {
   ehw r_ = csl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dfq s_ = dfp.D;

   static bgq a(@Nullable bii $$0, dez $$1, cpl $$2, gu $$3) {
      if ($$1.c(s_)) {
         csl.a($$2, $$3, new cix(cja.vw, 1));
         float $$4 = arp.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, aow.dx, aox.e, 1.0F, $$4);
         dez $$5 = $$1.a(s_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(djj.c, $$3, djj.a.a($$0, $$5));
         return bgq.a($$2.B);
      } else {
         return bgq.d;
      }
   }

   static boolean h_(dez $$0) {
      return $$0.b(s_) && $$0.c(s_);
   }

   static ToIntFunction<dez> h_(int $$0) {
      return $$1 -> $$1.c(dfp.D) ? $$0 : 0;
   }
}
