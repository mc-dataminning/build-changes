import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtr implements dtx {
   public static final Codec<dtr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bjf.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bjf.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dtr::new)
   );
   private final bjf b;
   private final bjf c;

   public dtr(bjf $$0, bjf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bjf a() {
      return this.b;
   }

   public bjf b() {
      return this.c;
   }
}
