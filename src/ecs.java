import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecs {
   public static final Codec<ecs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eho.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ecs::new)
   );
   public final ji<eho> b;
   public final float c;

   public ecs(ji<eho> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dct $$0, dtz $$1, azh $$2, iz $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
