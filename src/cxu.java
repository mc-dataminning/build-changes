import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface cxu {
   emv t_ = cwy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dkg u_ = dkf.D;

   static bkc a(@Nullable blw $$0, djp $$1, ctx $$2, hx $$3) {
      if ($$1.c(u_)) {
         cwy.a($$2, $$3, new cng(cnj.wm, 1));
         float $$4 = aup.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, art.dV, aru.e, 1.0F, $$4);
         djp $$5 = $$1.a(u_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(dnz.c, $$3, dnz.a.a($$0, $$5));
         return bkc.a($$2.B);
      } else {
         return bkc.d;
      }
   }

   static boolean h_(djp $$0) {
      return $$0.b(u_) && $$0.c(u_);
   }

   static ToIntFunction<djp> h_(int $$0) {
      return $$1 -> $$1.c(dkf.D) ? $$0 : 0;
   }
}
