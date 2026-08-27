import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dab {
   epo q_ = czf.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dmv r_ = dmu.D;

   static bml a(@Nullable bof $$0, dme $$1, cwe $$2, ib $$3) {
      if ($$1.c(r_)) {
         czf.a($$2, $$3, new cpq(cpt.wm, 1));
         float $$4 = awm.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, atp.dW, atq.e, 1.0F, $$4);
         dme $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dqr.c, $$3, dqr.a.a($$0, $$5));
         return bml.a($$2.B);
      } else {
         return bml.d;
      }
   }

   static boolean i_(dme $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<dme> h_(int $$0) {
      return $$1 -> $$1.c(dmu.D) ? $$0 : 0;
   }
}
