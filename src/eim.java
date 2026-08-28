import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eim implements eis {
   public static final Codec<eim> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bsj.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bsj.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, eim::new)
   );
   private final bsj b;
   private final bsj c;

   public eim(bsj $$0, bsj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bsj a() {
      return this.b;
   }

   public bsj b() {
      return this.c;
   }
}
