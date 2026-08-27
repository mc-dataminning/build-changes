import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface cxf {
   emf s_ = cwj.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   djr t_ = djq.D;

   static bjv a(@Nullable blp $$0, dja $$1, cti $$2, hx $$3) {
      if ($$1.c(t_)) {
         cwj.a($$2, $$3, new cmr(cmu.wj, 1));
         float $$4 = aui.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, arm.dG, arn.e, 1.0F, $$4);
         dja $$5 = $$1.a(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dnk.c, $$3, dnk.a.a($$0, $$5));
         return bjv.a($$2.B);
      } else {
         return bjv.d;
      }
   }

   static boolean h_(dja $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dja> h_(int $$0) {
      return $$1 -> $$1.c(djq.D) ? $$0 : 0;
   }
}
