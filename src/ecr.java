import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecr {
   public static final Codec<ecr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehn.b.fieldOf("feature").forGetter($$0x -> $$0x.b), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter($$0x -> $$0x.c))
            .apply($$0, ecr::new)
   );
   public final ji<ehn> b;
   public final float c;

   public ecr(ji<ehn> $$0, float $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public boolean a(dcs $$0, dty $$1, azg $$2, iz $$3) {
      return this.b.a().a($$0, $$1, $$2, $$3);
   }
}
