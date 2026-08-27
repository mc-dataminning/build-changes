import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dea {
   eui q_ = dde.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dqy r_ = dqx.D;

   static bpm a(@Nullable brh $$0, dqh $$1, dad $$2, in $$3) {
      if ($$1.c(r_)) {
         dde.a($$2, $$3, new csz(ctc.ws, 1));
         float $$4 = axz.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, avc.ee, avd.e, 1.0F, $$4);
         dqh $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dva.c, $$3, dva.a.a($$0, $$5));
         return bpm.a($$2.B);
      } else {
         return bpm.d;
      }
   }

   static boolean h_(dqh $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<dqh> h_(int $$0) {
      return $$1 -> $$1.c(dqx.D) ? $$0 : 0;
   }
}
