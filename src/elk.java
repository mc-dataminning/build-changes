import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elk implements elq {
   public static final Codec<elk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bti.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bti.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, elk::new)
   );
   private final bti b;
   private final bti c;

   public elk(bti $$0, bti $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bti a() {
      return this.b;
   }

   public bti b() {
      return this.c;
   }
}
