import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dws implements dwy {
   public static final Codec<dws> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(blq.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), blq.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dws::new)
   );
   private final blq b;
   private final blq c;

   public dws(blq $$0, blq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public blq a() {
      return this.b;
   }

   public blq b() {
      return this.c;
   }
}
