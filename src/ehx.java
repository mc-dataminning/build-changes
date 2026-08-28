import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehx implements eid {
   public static final Codec<ehx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(brq.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), brq.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehx::new)
   );
   private final brq b;
   private final brq c;

   public ehx(brq $$0, brq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public brq a() {
      return this.b;
   }

   public brq b() {
      return this.c;
   }
}
