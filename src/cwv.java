import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface cwv {
   elu r_ = cvz.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   djg s_ = djf.D;

   static bjl a(@Nullable blf $$0, dip $$1, csy $$2, hv $$3) {
      if ($$1.c(s_)) {
         cvz.a($$2, $$3, new cmh(cmk.wj, 1));
         float $$4 = aty.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, arc.dG, ard.e, 1.0F, $$4);
         dip $$5 = $$1.a(s_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dmz.c, $$3, dmz.a.a($$0, $$5));
         return bjl.a($$2.B);
      } else {
         return bjl.d;
      }
   }

   static boolean h_(dip $$0) {
      return $$0.b(s_) && $$0.c(s_);
   }

   static ToIntFunction<dip> h_(int $$0) {
      return $$1 -> $$1.c(djf.D) ? $$0 : 0;
   }
}
