import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dft {
   ewi q_ = dex.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dsr r_ = dsq.D;

   static bqs a(@Nullable bss $$0, dsa $$1, dbw $$2, iz $$3) {
      if ($$1.c(r_)) {
         dex.a($$2, $$3, new cun(cuq.ws, 1));
         float $$4 = ayx.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, avz.ee, awa.e, 1.0F, $$4);
         dsa $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dwt.c, $$3, dwt.a.a($$0, $$5));
         return bqs.a($$2.B);
      } else {
         return bqs.e;
      }
   }

   static boolean h_(dsa $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<dsa> h_(int $$0) {
      return $$1 -> $$1.c(dsq.D) ? $$0 : 0;
   }
}
