import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebb implements ebh {
   public static final Codec<ebb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bor.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bor.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ebb::new)
   );
   private final bor b;
   private final bor c;

   public ebb(bor $$0, bor $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bor a() {
      return this.b;
   }

   public bor b() {
      return this.c;
   }
}
