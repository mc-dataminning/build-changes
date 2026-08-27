import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface ddr {
   ety q_ = dcv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dqp r_ = dqo.D;

   static boq a(@Nullable bql $$0, dpy $$1, czu $$2, im $$3) {
      if ($$1.c(r_)) {
         dcv.a($$2, $$3, new csd(csg.ws, 1));
         float $$4 = axw.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, auz.ee, ava.e, 1.0F, $$4);
         dpy $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dur.c, $$3, dur.a.a($$0, $$5));
         return boq.a($$2.B);
      } else {
         return boq.d;
      }
   }

   static boolean i_(dpy $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<dpy> h_(int $$0) {
      return $$1 -> $$1.c(dqo.D) ? $$0 : 0;
   }
}
