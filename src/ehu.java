import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehu implements eia {
   public static final Codec<ehu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(brn.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), brn.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, ehu::new)
   );
   private final brn b;
   private final brn c;

   public ehu(brn $$0, brn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public brn a() {
      return this.b;
   }

   public brn b() {
      return this.c;
   }
}
