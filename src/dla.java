import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface dla {
   fcl s_ = dkd.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dyf t_ = dye.c;

   static bta a(@Nullable bvb $$0, dxo $$1, dgz $$2, jh $$3) {
      if ($$1.c(t_)) {
         dkd.a($$2, $$3, new cxg(cxk.xw, 1));
         float $$4 = azu.b($$2.A, 0.8F, 1.2F);
         $$2.a(null, $$3, awv.eg, aww.e, 1.0F, $$4);
         dxo $$5 = $$1.b(t_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(eck.c, $$3, eck.a.a($$0, $$5));
         return bta.a;
      } else {
         return bta.e;
      }
   }

   static boolean j_(dxo $$0) {
      return $$0.b(t_) && $$0.c(t_);
   }

   static ToIntFunction<dxo> i_(int $$0) {
      return $$1 -> $$1.c(dye.c) ? $$0 : 0;
   }
}
