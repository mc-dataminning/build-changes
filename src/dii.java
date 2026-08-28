import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dii {
   ezq u_ = dhm.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dvj v_ = dvi.D;

   static brs a(@Nullable btr $$0, dus $$1, dej $$2, jf $$3) {
      if ($$1.c(v_)) {
         dhm.a($$2, $$3, new cvs(cvw.wy, 1));
         float $$4 = azf.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, awg.ef, awh.e, 1.0F, $$4);
         dus $$5 = $$1.b(v_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dzp.c, $$3, dzp.a.a($$0, $$5));
         return brs.a;
      } else {
         return brs.e;
      }
   }

   static boolean j_(dus $$0) {
      return $$0.b(v_) && $$0.c(v_);
   }

   static ToIntFunction<dus> i_(int $$0) {
      return $$1 -> $$1.c(dvi.D) ? $$0 : 0;
   }
}
