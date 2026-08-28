import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dli {
   fcr s_ = dkl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dyl t_ = dyk.E;

   static bti a(@Nullable bvj $$0, dxu $$1, dhh $$2, jh $$3) {
      if ($$1.c(t_)) {
         dkl.a($$2, $$3, new cxo(cxs.xm, 1));
         float $$4 = bae.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, axf.eg, axg.e, 1.0F, $$4);
         dxu $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(ecq.c, $$3, ecq.a.a($$0, $$5));
         return bti.a;
      } else {
         return bti.e;
      }
   }

   static boolean j_(dxu $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dxu> i_(int $$0) {
      return $$1 -> $$1.c(dyk.E) ? $$0 : 0;
   }
}
