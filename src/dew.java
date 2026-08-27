import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dew {
   evf q_ = dea.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dru r_ = drt.D;

   static bpw a(@Nullable brw $$0, drd $$1, daz $$2, io $$3) {
      if ($$1.c(r_)) {
         dea.a($$2, $$3, new ctq(ctt.ws, 1));
         float $$4 = ayf.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, avi.ee, avj.e, 1.0F, $$4);
         drd $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dvw.c, $$3, dvw.a.a($$0, $$5));
         return bpw.a($$2.B);
      } else {
         return bpw.d;
      }
   }

   static boolean h_(drd $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<drd> h_(int $$0) {
      return $$1 -> $$1.c(drt.D) ? $$0 : 0;
   }
}
