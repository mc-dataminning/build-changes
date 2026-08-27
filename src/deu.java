import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface deu {
   evd q_ = ddy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   drs r_ = drr.D;

   static bpu a(@Nullable bru $$0, drb $$1, dax $$2, io $$3) {
      if ($$1.c(r_)) {
         ddy.a($$2, $$3, new cto(ctr.ws, 1));
         float $$4 = ayd.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, avh.ee, avi.e, 1.0F, $$4);
         drb $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dvu.c, $$3, dvu.a.a($$0, $$5));
         return bpu.a($$2.B);
      } else {
         return bpu.d;
      }
   }

   static boolean h_(drb $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<drb> h_(int $$0) {
      return $$1 -> $$1.c(drr.D) ? $$0 : 0;
   }
}
