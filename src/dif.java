import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dif {
   ezm u_ = dhj.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dvf v_ = dve.D;

   static brp a(@Nullable bto $$0, duo $$1, deg $$2, je $$3) {
      if ($$1.c(v_)) {
         dhj.a($$2, $$3, new cvp(cvt.wy, 1));
         float $$4 = azd.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, awe.ef, awf.e, 1.0F, $$4);
         duo $$5 = $$1.b(v_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dzl.c, $$3, dzl.a.a($$0, $$5));
         return brp.a;
      } else {
         return brp.e;
      }
   }

   static boolean j_(duo $$0) {
      return $$0.b(v_) && $$0.c(v_);
   }

   static ToIntFunction<duo> i_(int $$0) {
      return $$1 -> $$1.c(dve.D) ? $$0 : 0;
   }
}
