import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efa implements efg {
   public static final Codec<efa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bqp.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bqp.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, efa::new)
   );
   private final bqp b;
   private final bqp c;

   public efa(bqp $$0, bqp $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bqp a() {
      return this.b;
   }

   public bqp b() {
      return this.c;
   }
}
