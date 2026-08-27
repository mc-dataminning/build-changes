import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpl implements dpr {
   public static final Codec<dpl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bfv.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bfv.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dpl::new)
   );
   private final bfv b;
   private final bfv c;

   public dpl(bfv $$0, bfv $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bfv a() {
      return this.b;
   }

   public bfv b() {
      return this.c;
   }
}
