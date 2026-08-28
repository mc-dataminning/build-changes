import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dfv {
   ewk q_ = dez.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dst r_ = dss.D;

   static bqu a(@Nullable bsu $$0, dsc $$1, dby $$2, iz $$3) {
      if ($$1.c(r_)) {
         dez.a($$2, $$3, new cup(cus.ws, 1));
         float $$4 = ayz.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, awa.ee, awb.e, 1.0F, $$4);
         dsc $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dwv.c, $$3, dwv.a.a($$0, $$5));
         return bqu.a($$2.B);
      } else {
         return bqu.e;
      }
   }

   static boolean h_(dsc $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<dsc> h_(int $$0) {
      return $$1 -> $$1.c(dss.D) ? $$0 : 0;
   }
}
