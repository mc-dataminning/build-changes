import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efs implements efy {
   public static final Codec<efs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bqx.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bqx.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, efs::new)
   );
   private final bqx b;
   private final bqx c;

   public efs(bqx $$0, bqx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bqx a() {
      return this.b;
   }

   public bqx b() {
      return this.c;
   }
}
