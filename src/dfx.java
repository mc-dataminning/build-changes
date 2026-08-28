import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dfx {
   ewm q_ = dfb.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dsv r_ = dsu.D;

   static bqw a(@Nullable bsw $$0, dse $$1, dca $$2, iz $$3) {
      if ($$1.c(r_)) {
         dfb.a($$2, $$3, new cur(cuu.ws, 1));
         float $$4 = ayz.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, awa.ee, awb.e, 1.0F, $$4);
         dse $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dwx.c, $$3, dwx.a.a($$0, $$5));
         return bqw.a($$2.B);
      } else {
         return bqw.e;
      }
   }

   static boolean h_(dse $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<dse> h_(int $$0) {
      return $$1 -> $$1.c(dsu.D) ? $$0 : 0;
   }
}
