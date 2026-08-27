import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxq implements dxw {
   public static final Codec<dxq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bmi.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bmi.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dxq::new)
   );
   private final bmi b;
   private final bmi c;

   public dxq(bmi $$0, bmi $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bmi a() {
      return this.b;
   }

   public bmi b() {
      return this.c;
   }
}
