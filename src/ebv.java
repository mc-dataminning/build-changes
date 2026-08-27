import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebv implements ecb {
   public static final Codec<ebv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(boz.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), boz.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ebv::new)
   );
   private final boz b;
   private final boz c;

   public ebv(boz $$0, boz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boz a() {
      return this.b;
   }

   public boz b() {
      return this.c;
   }
}
