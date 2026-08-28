import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dlr {
   fdo s_ = dku.b(14.0, 0.0, 16.0);
   dzd t_ = dzc.b;

   static btq a(@Nullable bvs $$0, dym $$1, dhp $$2, jj $$3) {
      if ($$1.c(t_)) {
         dku.a($$2, $$3, new cxy(cyc.xA, 1));
         float $$4 = azk.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awk.eg, awl.e, 1.0F, $$4);
         dym $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(edm.c, $$3, edm.a.a($$0, $$5));
         return btq.a;
      } else {
         return btq.e;
      }
   }

   static boolean j_(dym $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dym> i_(int $$0) {
      return $$1 -> $$1.c(dzc.b) ? $$0 : 0;
   }
}
