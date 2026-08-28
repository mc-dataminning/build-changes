import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edy implements eee {
   public static final Codec<edy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bpv.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bpv.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, edy::new)
   );
   private final bpv b;
   private final bpv c;

   public edy(bpv $$0, bpv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpv a() {
      return this.b;
   }

   public bpv b() {
      return this.c;
   }
}
