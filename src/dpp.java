import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpp implements dpv {
   public static final Codec<dpp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfy.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bfy.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dpp::new)
   );
   private final bfy b;
   private final bfy c;

   public dpp(bfy $$0, bfy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bfy a() {
      return this.b;
   }

   public bfy b() {
      return this.c;
   }
}
