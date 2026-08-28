import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface diu {
   fab u_ = dhy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dvu v_ = dvt.D;

   static bry a(@Nullable btz $$0, dvd $$1, dev $$2, jg $$3) {
      if ($$1.c(v_)) {
         dhy.a($$2, $$3, new cvx(cwb.wy, 1));
         float $$4 = azj.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awk.ef, awl.e, 1.0F, $$4);
         dvd $$5 = $$1.b(v_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(eaa.c, $$3, eaa.a.a($$0, $$5));
         return bry.a;
      } else {
         return bry.e;
      }
   }

   static boolean j_(dvd $$0) {
      return $$0.b(v_) && $$0.c(v_);
   }

   static ToIntFunction<dvd> i_(int $$0) {
      return $$1 -> $$1.c(dvt.D) ? $$0 : 0;
   }
}
