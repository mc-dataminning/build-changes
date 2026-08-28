import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnh extends dmm {
   public static final MapCodec<dnh> a = b(dnh::new);
   private static final wy b = wy.c("container.cartography_table");

   @Override
   public MapCodec<dnh> a() {
      return a;
   }

   protected dnh(ean.d $$0) {
      super($$0);
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aw);
      }

      return bug.a;
   }

   @Nullable
   @Override
   protected bui b(eao $$0, djh $$1, iv $$2) {
      return new buo(($$2x, $$3, $$4) -> new cvk($$2x, $$3, cvp.a($$1, $$2)), b);
   }
}
