import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dja {
   fah u_ = die.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dwa v_ = dvz.D;

   static bsd a(@Nullable bue $$0, dvj $$1, dfb $$2, jh $$3) {
      if ($$1.c(v_)) {
         die.a($$2, $$3, new cwb(cwf.wy, 1));
         float $$4 = azk.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awl.ef, awm.e, 1.0F, $$4);
         dvj $$5 = $$1.b(v_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(eag.c, $$3, eag.a.a($$0, $$5));
         return bsd.a;
      } else {
         return bsd.e;
      }
   }

   static boolean j_(dvj $$0) {
      return $$0.b(v_) && $$0.c(v_);
   }

   static ToIntFunction<dvj> i_(int $$0) {
      return $$1 -> $$1.c(dvz.D) ? $$0 : 0;
   }
}
