import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmu extends dma {
   public static final MapCodec<dmu> a = b(dmu::new);
   private static final wy b = wy.c("container.cartography_table");

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   protected dmu(dzy.d $$0) {
      super($$0);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aw);
      }

      return bub.a;
   }

   @Nullable
   @Override
   protected bud b(dzz $$0, div $$1, iu $$2) {
      return new buj(($$2x, $$3, $$4) -> new cuy($$2x, $$3, cvd.a($$1, $$2)), b);
   }
}
