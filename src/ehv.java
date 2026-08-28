import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehv implements eib {
   public static final Codec<ehv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bro.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bro.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehv::new)
   );
   private final bro b;
   private final bro c;

   public ehv(bro $$0, bro $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bro a() {
      return this.b;
   }

   public bro b() {
      return this.c;
   }
}
