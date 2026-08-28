import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecy implements ede {
   public static final Codec<ecy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bqb.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bqb.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ecy::new)
   );
   private final bqb b;
   private final bqb c;

   public ecy(bqb $$0, bqb $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bqb a() {
      return this.b;
   }

   public bqb b() {
      return this.c;
   }
}
