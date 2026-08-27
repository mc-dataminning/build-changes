import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dmm implements dms {
   public static final Codec<dmm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bdc.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bdc.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dmm::new)
   );
   private final bdc b;
   private final bdc c;

   public dmm(bdc $$0, bdc $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bdc a() {
      return this.b;
   }

   public bdc b() {
      return this.c;
   }
}
