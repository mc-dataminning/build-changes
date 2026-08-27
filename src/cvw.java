import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface cvw {
   ekn r_ = cva.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dhz s_ = dhy.D;

   static bix a(@Nullable bkq $$0, dhi $$1, csa $$2, ht $$3) {
      if ($$1.c(s_)) {
         cva.a($$2, $$3, new clj(clm.wi, 1));
         float $$4 = atm.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, aqr.dx, aqs.e, 1.0F, $$4);
         dhi $$5 = $$1.a(s_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dls.c, $$3, dls.a.a($$0, $$5));
         return bix.a($$2.B);
      } else {
         return bix.d;
      }
   }

   static boolean h_(dhi $$0) {
      return $$0.b(s_) && $$0.c(s_);
   }

   static ToIntFunction<dhi> h_(int $$0) {
      return $$1 -> $$1.c(dhy.D) ? $$0 : 0;
   }
}
