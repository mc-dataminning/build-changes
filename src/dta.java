import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dta implements dtg {
   public static final Codec<dta> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(biq.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), biq.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dta::new)
   );
   private final biq b;
   private final biq c;

   public dta(biq $$0, biq $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public biq a() {
      return this.b;
   }

   public biq b() {
      return this.c;
   }
}
