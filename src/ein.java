import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ein implements eit {
   public static final Codec<ein> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bsf.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bsf.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ein::new)
   );
   private final bsf b;
   private final bsf c;

   public ein(bsf $$0, bsf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bsf a() {
      return this.b;
   }

   public bsf b() {
      return this.c;
   }
}
