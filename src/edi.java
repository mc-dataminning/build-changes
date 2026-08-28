import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class edi implements edo {
   public static final Codec<edi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bpl.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bpl.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, edi::new)
   );
   private final bpl b;
   private final bpl c;

   public edi(bpl $$0, bpl $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpl a() {
      return this.b;
   }

   public bpl b() {
      return this.c;
   }
}
