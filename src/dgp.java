import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgp extends dfw {
   public static final MapCodec<dgp> a = b(dgp::new);
   private static final wy b = wy.c("container.cartography_table");

   @Override
   public MapCodec<dgp> a() {
      return a;
   }

   protected dgp(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avy.aw);
         return bqq.c;
      }
   }

   @Nullable
   @Override
   protected bqu b(dta $$0, dcu $$1, jd $$2) {
      return new bra(($$2x, $$3, $$4) -> new cpz($$2x, $$3, cqe.a($$1, $$2)), b);
   }
}
