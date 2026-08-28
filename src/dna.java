import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dna extends dmf {
   public static final MapCodec<dna> a = b(dna::new);
   private static final wy b = wy.c("container.cartography_table");

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   protected dna(eag.d $$0) {
      super($$0);
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C) {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awx.aw);
      }

      return bud.a;
   }

   @Nullable
   @Override
   protected buf b(eah $$0, dja $$1, iu $$2) {
      return new bul(($$2x, $$3, $$4) -> new cvd($$2x, $$3, cvi.a($$1, $$2)), b);
   }
}
