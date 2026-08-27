import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtl implements dtr {
   public static final Codec<dtl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bja.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bja.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dtl::new)
   );
   private final bja b;
   private final bja c;

   public dtl(bja $$0, bja $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bja a() {
      return this.b;
   }

   public bja b() {
      return this.c;
   }
}
