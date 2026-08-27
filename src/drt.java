import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drt implements drz {
   public static final Codec<drt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bic.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bic.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, drt::new)
   );
   private final bic b;
   private final bic c;

   public drt(bic $$0, bic $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bic a() {
      return this.b;
   }

   public bic b() {
      return this.c;
   }
}
