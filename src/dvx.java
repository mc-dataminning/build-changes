import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvx implements dwd {
   public static final Codec<dvx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(blb.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), blb.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dvx::new)
   );
   private final blb b;
   private final blb c;

   public dvx(blb $$0, blb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public blb a() {
      return this.b;
   }

   public blb b() {
      return this.c;
   }
}
