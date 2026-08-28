import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dgu {
   exv r_ = dfy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dtt s_ = dts.D;

   static bqr a(@Nullable bsr $$0, dtc $$1, dcw $$2, jd $$3) {
      if ($$1.c(s_)) {
         dfy.a($$2, $$3, new cuq(cut.wv, 1));
         float $$4 = ayo.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, avp.ee, avq.e, 1.0F, $$4);
         dtc $$5 = $$1.a(s_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dxz.c, $$3, dxz.a.a($$0, $$5));
         return bqr.a($$2.B);
      } else {
         return bqr.e;
      }
   }

   static boolean h_(dtc $$0) {
      return $$0.b(s_) && $$0.c(s_);
   }

   static ToIntFunction<dtc> i_(int $$0) {
      return $$1 -> $$1.c(dts.D) ? $$0 : 0;
   }
}
