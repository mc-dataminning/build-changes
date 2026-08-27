import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpo implements dpu {
   public static final Codec<dpo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bgj.b(0, 3).fieldOf("reach").forGetter($$0x -> $$0x.b), bgj.b(1, 10).fieldOf("height").forGetter($$0x -> $$0x.c)).apply($$0, dpo::new)
   );
   private final bgj b;
   private final bgj c;

   public dpo(bgj $$0, bgj $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public bgj a() {
      return this.b;
   }

   public bgj b() {
      return this.c;
   }
}
