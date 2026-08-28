import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efo implements efu {
   public static final Codec<efo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bqu.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bqu.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, efo::new)
   );
   private final bqu b;
   private final bqu c;

   public efo(bqu $$0, bqu $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bqu a() {
      return this.b;
   }

   public bqu b() {
      return this.c;
   }
}
