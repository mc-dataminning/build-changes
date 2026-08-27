import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxo implements dxu {
   public static final Codec<dxo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bmh.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bmh.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dxo::new)
   );
   private final bmh b;
   private final bmh c;

   public dxo(bmh $$0, bmh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bmh a() {
      return this.b;
   }

   public bmh b() {
      return this.c;
   }
}
