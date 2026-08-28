import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emk implements emr {
   public static final Codec<emk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bty.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bty.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, emk::new)
   );
   private final bty b;
   private final bty c;

   public emk(bty $$0, bty $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bty a() {
      return this.b;
   }

   public bty b() {
      return this.c;
   }
}
