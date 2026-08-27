import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dts implements dty {
   public static final Codec<dts> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bjg.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bjg.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dts::new)
   );
   private final bjg b;
   private final bjg c;

   public dts(bjg $$0, bjg $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bjg a() {
      return this.b;
   }

   public bjg b() {
      return this.c;
   }
}
