import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpj implements dpp {
   public static final Codec<dpj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bft.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bft.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dpj::new)
   );
   private final bft b;
   private final bft c;

   public dpj(bft $$0, bft $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bft a() {
      return this.b;
   }

   public bft b() {
      return this.c;
   }
}
