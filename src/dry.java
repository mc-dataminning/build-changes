import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dry implements dse {
   public static final Codec<dry> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(big.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), big.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dry::new)
   );
   private final big b;
   private final big c;

   public dry(big $$0, big $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public big a() {
      return this.b;
   }

   public big b() {
      return this.c;
   }
}
