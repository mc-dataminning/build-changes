import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eas implements eay {
   public static final Codec<eas> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bnv.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bnv.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eas::new)
   );
   private final bnv b;
   private final bnv c;

   public eas(bnv $$0, bnv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bnv a() {
      return this.b;
   }

   public bnv b() {
      return this.c;
   }
}
