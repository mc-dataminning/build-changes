import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ebx implements ecd {
   public static final Codec<ebx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bpb.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bpb.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ebx::new)
   );
   private final bpb b;
   private final bpb c;

   public ebx(bpb $$0, bpb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpb a() {
      return this.b;
   }

   public bpb b() {
      return this.c;
   }
}
