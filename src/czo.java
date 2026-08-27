import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface czo {
   eos t_ = cys.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dma u_ = dlz.D;

   static blw a(@Nullable bnq $$0, dlj $$1, cvr $$2, hz $$3) {
      if ($$1.c(u_)) {
         cys.a($$2, $$3, new cpd(cpg.wm, 1));
         float $$4 = awi.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, atl.dW, atm.e, 1.0F, $$4);
         dlj $$5 = $$1.a(u_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dpw.c, $$3, dpw.a.a($$0, $$5));
         return blw.a($$2.B);
      } else {
         return blw.d;
      }
   }

   static boolean i_(dlj $$0) {
      return $$0.b(u_) && $$0.c(u_);
   }

   static ToIntFunction<dlj> h_(int $$0) {
      return $$1 -> $$1.c(dlz.D) ? $$0 : 0;
   }
}
