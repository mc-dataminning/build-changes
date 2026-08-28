import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgr extends dfy {
   public static final MapCodec<dgr> a = b(dgr::new);
   private static final wz b = wz.c("container.cartography_table");

   @Override
   public MapCodec<dgr> a() {
      return a;
   }

   protected dgr(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avz.aw);
         return bqr.c;
      }
   }

   @Nullable
   @Override
   protected bqv b(dtc $$0, dcw $$1, jd $$2) {
      return new brb(($$2x, $$3, $$4) -> new cqb($$2x, $$3, cqg.a($$1, $$2)), b);
   }
}
