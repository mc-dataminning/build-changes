import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egj implements egp {
   public static final Codec<egj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bri.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bri.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, egj::new)
   );
   private final bri b;
   private final bri c;

   public egj(bri $$0, bri $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bri a() {
      return this.b;
   }

   public bri b() {
      return this.c;
   }
}
