import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dvq implements dvw {
   public static final Codec<dvq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bkz.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bkz.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dvq::new)
   );
   private final bkz b;
   private final bkz c;

   public dvq(bkz $$0, bkz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bkz a() {
      return this.b;
   }

   public bkz b() {
      return this.c;
   }
}
