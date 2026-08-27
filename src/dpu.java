import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpu implements dqa {
   public static final Codec<dpu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bgd.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bgd.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dpu::new)
   );
   private final bgd b;
   private final bgd c;

   public dpu(bgd $$0, bgd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bgd a() {
      return this.b;
   }

   public bgd b() {
      return this.c;
   }
}
