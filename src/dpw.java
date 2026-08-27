import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpw implements dqc {
   public static final Codec<dpw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bgf.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bgf.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dpw::new)
   );
   private final bgf b;
   private final bgf c;

   public dpw(bgf $$0, bgf $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bgf a() {
      return this.b;
   }

   public bgf b() {
      return this.c;
   }
}
