import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehw implements eic {
   public static final Codec<ehw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(brp.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), brp.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehw::new)
   );
   private final brp b;
   private final brp c;

   public ehw(brp $$0, brp $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public brp a() {
      return this.b;
   }

   public brp b() {
      return this.c;
   }
}
