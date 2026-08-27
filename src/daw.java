import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public interface daw {
   eqk q_ = daa.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   dnq r_ = dnp.D;

   static bnc a(@Nullable bow $$0, dmz $$1, cwz $$2, ib $$3) {
      if ($$1.c(r_)) {
         daa.a($$2, $$3, new cqk(cqn.wn, 1));
         float $$4 = aww.b($$2.z, 0.8F, 1.2F);
         $$2.a(null, $$3, aty.dZ, atz.e, 1.0F, $$4);
         dmz $$5 = $$1.a(r_, Boolean.valueOf(false));
         $$2.a($$3, $$5, 2);
         $$2.a(drn.c, $$3, drn.a.a($$0, $$5));
         return bnc.a($$2.B);
      } else {
         return bnc.d;
      }
   }

   static boolean i_(dmz $$0) {
      return $$0.b(r_) && $$0.c(r_);
   }

   static ToIntFunction<dmz> h_(int $$0) {
      return $$1 -> $$1.c(dnp.D) ? $$0 : 0;
   }
}
