import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dcu {
   est q_ = dby.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dpq r_ = dpp.D;

   static boa a(@Nullable bpv $$0, doz $$1, cyx $$2, ib $$3) {
      if ($$1.c(r_)) {
         dby.a($$2, $$3, new crj(crm.wo, 1));
         float $$4 = axk.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, aum.ee, aun.e, 1.0F, $$4);
         doz $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dts.c, $$3, dts.a.a($$0, $$5));
         return boa.a($$2.B);
      } else {
         return boa.d;
      }
   }

   static boolean i_(doz $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<doz> h_(int $$0) {
      return $$1 -> $$1.c(dpp.D) ? $$0 : 0;
   }
}
