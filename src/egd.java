import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egd implements egj {
   public static final Codec<egd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(brd.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), brd.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, egd::new)
   );
   private final brd b;
   private final brd c;

   public egd(brd $$0, brd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public brd a() {
      return this.b;
   }

   public brd b() {
      return this.c;
   }
}
