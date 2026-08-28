import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dlb {
   fcr s_ = dke.b(14.0, 0.0, 16.0);
   dyh t_ = dyg.b;

   static bsy a(@Nullable bva $$0, dxq $$1, dgz $$2, ji $$3) {
      if ($$1.c(t_)) {
         dke.a($$2, $$3, new cxh(cxl.xy, 1));
         float $$4 = ayz.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awa.eg, awb.e, 1.0F, $$4);
         dxq $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(ecp.c, $$3, ecp.a.a($$0, $$5));
         return bsy.a;
      } else {
         return bsy.e;
      }
   }

   static boolean j_(dxq $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dxq> i_(int $$0) {
      return $$1 -> $$1.c(dyg.b) ? $$0 : 0;
   }
}
