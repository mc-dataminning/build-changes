import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecr implements ecx {
   public static final Codec<ecr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bpu.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bpu.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ecr::new)
   );
   private final bpu b;
   private final bpu c;

   public ecr(bpu $$0, bpu $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bpu a() {
      return this.b;
   }

   public bpu b() {
      return this.c;
   }
}
