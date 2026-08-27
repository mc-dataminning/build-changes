import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface cxm {
   emm s_ = cwq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   djy t_ = djx.D;

   static bkb a(@Nullable blv $$0, djh $$1, ctp $$2, hx $$3) {
      if ($$1.c(t_)) {
         cwq.a($$2, $$3, new cmy(cnb.wj, 1));
         float $$4 = auo.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, ars.dG, art.e, 1.0F, $$4);
         djh $$5 = $$1.a(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dnr.c, $$3, dnr.a.a($$0, $$5));
         return bkb.a($$2.B);
      } else {
         return bkb.d;
      }
   }

   static boolean h_(djh $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<djh> h_(int $$0) {
      return $$1 -> $$1.c(djx.D) ? $$0 : 0;
   }
}
