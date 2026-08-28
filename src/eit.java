import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eit implements eiz {
   public static final Codec<eit> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bsn.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bsn.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eit::new)
   );
   private final bsn b;
   private final bsn c;

   public eit(bsn $$0, bsn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bsn a() {
      return this.b;
   }

   public bsn b() {
      return this.c;
   }
}
