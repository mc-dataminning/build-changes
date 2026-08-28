import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dkh {
   fbs s_ = djk.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dxm t_ = dxl.c;

   static bsi a(@Nullable buj $$0, dwv $$1, dgg $$2, ji $$3) {
      if ($$1.c(t_)) {
         djk.a($$2, $$3, new cwn(cwr.xw, 1));
         float $$4 = ayy.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, avz.eg, awa.e, 1.0F, $$4);
         dwv $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(ebr.c, $$3, ebr.a.a($$0, $$5));
         return bsi.a;
      } else {
         return bsi.e;
      }
   }

   static boolean j_(dwv $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dwv> i_(int $$0) {
      return $$1 -> $$1.c(dxl.c) ? $$0 : 0;
   }
}
