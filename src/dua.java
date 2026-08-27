import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dua implements dug {
   public static final Codec<dua> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bjh.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bjh.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dua::new)
   );
   private final bjh b;
   private final bjh c;

   public dua(bjh $$0, bjh $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bjh a() {
      return this.b;
   }

   public bjh b() {
      return this.c;
   }
}
