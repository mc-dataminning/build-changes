import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doj extends dno {
   public static final MapCodec<doj> a = b(doj::new);
   private static final xg b = xg.c("container.cartography_table");

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   protected doj(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected bvc a(ebq $$0, dkj $$1, iw $$2, csi $$3, ffy $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(axi.aw);
      }

      return bvc.a;
   }

   @Nullable
   @Override
   protected bve b(ebq $$0, dkj $$1, iw $$2) {
      return new bvk(($$2x, $$3, $$4) -> new cwj($$2x, $$3, cwo.a($$1, $$2)), b);
   }
}
