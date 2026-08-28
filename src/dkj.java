import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dkj {
   fbu s_ = djm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dxo t_ = dxn.c;

   static bsj a(@Nullable buk $$0, dwx $$1, dgi $$2, ji $$3) {
      if ($$1.c(t_)) {
         djm.a($$2, $$3, new cwp(cwt.xw, 1));
         float $$4 = ayz.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awa.eg, awb.e, 1.0F, $$4);
         dwx $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(ebt.c, $$3, ebt.a.a($$0, $$5));
         return bsj.a;
      } else {
         return bsj.e;
      }
   }

   static boolean j_(dwx $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dwx> i_(int $$0) {
      return $$1 -> $$1.c(dxn.c) ? $$0 : 0;
   }
}
