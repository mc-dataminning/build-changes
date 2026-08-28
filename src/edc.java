import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edc implements edi {
   public static final Codec<edc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bpi.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bpi.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, edc::new)
   );
   private final bpi b;
   private final bpi c;

   public edc(bpi $$0, bpi $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpi a() {
      return this.b;
   }

   public bpi b() {
      return this.c;
   }
}
