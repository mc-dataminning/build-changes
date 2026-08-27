import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface cty {
   eia r_ = ctc.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dfu s_ = dft.D;

   static bhe a(@Nullable biw $$0, dfd $$1, cqb $$2, gw $$3) {
      if ($$1.c(s_)) {
         ctc.a($$2, $$3, new cjl(cjo.vw, 1));
         float $$4 = asb.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, apg.dx, aph.e, 1.0F, $$4);
         dfd $$5 = $$1.a(s_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(djn.c, $$3, djn.a.a($$0, $$5));
         return bhe.a($$2.B);
      } else {
         return bhe.d;
      }
   }

   static boolean h_(dfd $$0) {
      return $$0.b(s_) && $$0.c(s_);
   }

   static ToIntFunction<dfd> h_(int $$0) {
      return $$1 -> $$1.c(dft.D) ? $$0 : 0;
   }
}
