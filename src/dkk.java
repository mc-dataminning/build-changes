import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dkk {
   fbv s_ = djn.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dxp t_ = dxo.c;

   static bsl a(@Nullable bum $$0, dwy $$1, dgj $$2, ji $$3) {
      if ($$1.c(t_)) {
         djn.a($$2, $$3, new cwq(cwu.xw, 1));
         float $$4 = ayz.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awa.eg, awb.e, 1.0F, $$4);
         dwy $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(ebu.c, $$3, ebu.a.a($$0, $$5));
         return bsl.a;
      } else {
         return bsl.e;
      }
   }

   static boolean j_(dwy $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dwy> i_(int $$0) {
      return $$1 -> $$1.c(dxo.c) ? $$0 : 0;
   }
}
