import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dlj {
   fcs s_ = dkm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dym t_ = dyl.E;

   static btj a(@Nullable bvk $$0, dxv $$1, dhi $$2, jh $$3) {
      if ($$1.c(t_)) {
         dkm.a($$2, $$3, new cxp(cxt.xm, 1));
         float $$4 = bae.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, axf.eg, axg.e, 1.0F, $$4);
         dxv $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(ecr.c, $$3, ecr.a.a($$0, $$5));
         return btj.a;
      } else {
         return btj.e;
      }
   }

   static boolean j_(dxv $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dxv> i_(int $$0) {
      return $$1 -> $$1.c(dyl.E) ? $$0 : 0;
   }
}
