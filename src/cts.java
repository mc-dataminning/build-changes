import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface cts {
   eii r_ = csx.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dgc s_ = dgb.D;

   static bha a(@Nullable bis $$0, dfl $$1, cpx $$2, gw $$3) {
      if ($$1.c(s_)) {
         csx.a($$2, $$3, new cjh(cjk.vw, 1));
         float $$4 = ary.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, apf.dx, apg.e, 1.0F, $$4);
         dfl $$5 = $$1.a(s_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(djv.c, $$3, djv.a.a($$0, $$5));
         return bha.a($$2.B);
      } else {
         return bha.d;
      }
   }

   static boolean h_(dfl $$0) {
      return $$0.b(s_) && $$0.c(s_);
   }

   static ToIntFunction<dfl> h_(int $$0) {
      return $$1 -> $$1.c(dgb.D) ? $$0 : 0;
   }
}
