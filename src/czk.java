import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface czk {
   eol t_ = cyo.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dlw u_ = dlv.D;

   static blu a(@Nullable bno $$0, dlf $$1, cvn $$2, hz $$3) {
      if ($$1.c(u_)) {
         cyo.a($$2, $$3, new coz(cpc.wm, 1));
         float $$4 = awh.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, atk.dV, atl.e, 1.0F, $$4);
         dlf $$5 = $$1.a(u_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dpp.c, $$3, dpp.a.a($$0, $$5));
         return blu.a($$2.B);
      } else {
         return blu.d;
      }
   }

   static boolean i_(dlf $$0) {
      return $$0.b(u_) && $$0.c(u_);
   }

   static ToIntFunction<dlf> h_(int $$0) {
      return $$1 -> $$1.c(dlv.D) ? $$0 : 0;
   }
}
