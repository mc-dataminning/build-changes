import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecx implements edd {
   public static final Codec<ecx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bqa.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bqa.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ecx::new)
   );
   private final bqa b;
   private final bqa c;

   public ecx(bqa $$0, bqa $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bqa a() {
      return this.b;
   }

   public bqa b() {
      return this.c;
   }
}
