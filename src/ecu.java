import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecu implements eda {
   public static final Codec<ecu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bpx.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bpx.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ecu::new)
   );
   private final bpx b;
   private final bpx c;

   public ecu(bpx $$0, bpx $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpx a() {
      return this.b;
   }

   public bpx b() {
      return this.c;
   }
}
