import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface djf {
   fal u_ = dij.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dwf v_ = dwe.D;

   static bsh a(@Nullable bui $$0, dvo $$1, dff $$2, jh $$3) {
      if ($$1.c(v_)) {
         dij.a($$2, $$3, new cwf(cwj.wO, 1));
         float $$4 = azn.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awo.ef, awp.e, 1.0F, $$4);
         dvo $$5 = $$1.b(v_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(eak.c, $$3, eak.a.a($$0, $$5));
         return bsh.a;
      } else {
         return bsh.e;
      }
   }

   static boolean j_(dvo $$0) {
      return $$0.b(v_) && $$0.c(v_);
   }

   static ToIntFunction<dvo> i_(int $$0) {
      return $$1 -> $$1.c(dwe.D) ? $$0 : 0;
   }
}
