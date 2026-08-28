import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eis implements eiy {
   public static final Codec<eis> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bsd.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bsd.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eis::new)
   );
   private final bsd b;
   private final bsd c;

   public eis(bsd $$0, bsd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bsd a() {
      return this.b;
   }

   public bsd b() {
      return this.c;
   }
}
